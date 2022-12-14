/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.cluster.jgroups;

import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.BIND_ADDR_SYS_PROPERTY;
import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.BIND_PORT_SYS_PROPERTY;
import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.HYBRIS_MULTICAST_ADDR_PROPERTY;
import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.HYBRIS_MULTICAST_PORT_PROPERTY;
import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.HYBRIS_TCP_IP_PROPERTY;
import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.HYBRIS_TCP_PORT_PROPERTY;
import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.MCAST_ADDRESS_SYS_PROPERTY;
import static de.hybris.platform.cluster.jgroups.JGroupsPropertyConfigurer.MCAST_PORT_SYS_PROPERTY;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import de.hybris.bootstrap.annotations.IntegrationTest;
import de.hybris.platform.servicelayer.ServicelayerBaseTest;
import de.hybris.platform.testframework.BulkPropertyConfigSwitcher;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


@IntegrationTest
public class JGroupsPropertyConfigurerTest extends ServicelayerBaseTest
{
	private static final String JGROUPS_CONFIG = "test-config";
	private Map<String, String> systemProperties;
	private JGroupsPropertyConfigurer configurer;

	final BulkPropertyConfigSwitcher bulkPropertyConfigSwitcher = new BulkPropertyConfigSwitcher();

	@Before
	public void prepareTest()
	{
		systemProperties = new HashMap<>();
		configurer = new JGroupsPropertyConfigurer()
		{
			@Override
			protected void setProperty(final String key, final String value)
			{
				systemProperties.put(key, value);
			}
		};

		bulkPropertyConfigSwitcher.switchToValue("cluster.broadcast.method.jgroups.configuration", JGROUPS_CONFIG);

		bulkPropertyConfigSwitcher.switchToValue(HYBRIS_TCP_IP_PROPERTY, "127.0.0.1");
		bulkPropertyConfigSwitcher.switchToValue(HYBRIS_TCP_PORT_PROPERTY, "7800");
		bulkPropertyConfigSwitcher.switchToValue(HYBRIS_MULTICAST_ADDR_PROPERTY, "224.0.0.1");
		bulkPropertyConfigSwitcher.switchToValue(HYBRIS_MULTICAST_PORT_PROPERTY, "45588");
	}

	@After
	public void cleanup()
	{
		bulkPropertyConfigSwitcher.switchAllBack();
	}

	@Test
	public void shouldSetStandardProperties()
	{
		configurer.configure(JGROUPS_CONFIG);

		assertThat(systemProperties.get(BIND_ADDR_SYS_PROPERTY)).isEqualTo("127.0.0.1");
		assertThat(systemProperties.get(BIND_PORT_SYS_PROPERTY)).isEqualTo("7800");
		assertThat(systemProperties.get(MCAST_ADDRESS_SYS_PROPERTY)).isEqualTo("224.0.0.1");
		assertThat(systemProperties.get(MCAST_PORT_SYS_PROPERTY)).isEqualTo("45588");
	}

	@Test
	public void shouldOverrideStandardProperties()
	{
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.bind_addr", "192.1.1.2");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.bind_port", "2001");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.mcast_address", "120.1.1.2");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.mcast_port", "99999");

		configurer.configure(JGROUPS_CONFIG);

		assertThat(systemProperties.get(BIND_ADDR_SYS_PROPERTY)).isEqualTo("192.1.1.2");
		assertThat(systemProperties.get(BIND_PORT_SYS_PROPERTY)).isEqualTo("2001");
		assertThat(systemProperties.get(MCAST_ADDRESS_SYS_PROPERTY)).isEqualTo("120.1.1.2");
		assertThat(systemProperties.get(MCAST_PORT_SYS_PROPERTY)).isEqualTo("99999");
	}

	@Test
	public void shouldAllowToProvideAdditionalConfiguration()
	{
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.namespace", "default");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.labels", "hybris_cluster=default");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.portRange", "0");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.remove_all_data_on_view_change", "false");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.write_data_on_find", "false");

		configurer.configure(JGROUPS_CONFIG);

		assertThat(systemProperties.get("hybris.jgroups.namespace")).isEqualTo("default");
		assertThat(systemProperties.get("hybris.jgroups.labels")).isEqualTo("hybris_cluster=default");
		assertThat(systemProperties.get("hybris.jgroups.portRange")).isEqualTo("0");
		assertThat(systemProperties.get("hybris.jgroups.remove_all_data_on_view_change")).isEqualTo("false");
		assertThat(systemProperties.get("hybris.jgroups.write_data_on_find")).isEqualTo("false");
	}

	@Test
	public void shouldNotMixDifferentSpecificConfigs()
	{
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.namespace", "default");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.labels", "hybris_cluster=default");

		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.other-config.namespace", "other");
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.other-config.labels", "label=differentValue");

		configurer.configure(JGROUPS_CONFIG);

		assertThat(systemProperties.get("hybris.jgroups.namespace")).isEqualTo("default");
		assertThat(systemProperties.get("hybris.jgroups.labels")).isEqualTo("hybris_cluster=default");
	}

	@Test
	public void shouldNotOverrideWithNotMatchingStandardConfig()
	{
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.other-config.bind_addr", "77.77.77.77");

		configurer.configure(JGROUPS_CONFIG);

		assertThat(systemProperties.get(BIND_ADDR_SYS_PROPERTY)).isEqualTo("127.0.0.1");
	}

	@Test
	public void shouldAcceptConfigurationFile()
	{
		bulkPropertyConfigSwitcher.switchToValue("cluster.conf.test-config.namespace", "default");

		configurer.configure("jgroups/test-config.xml");

		assertThat(systemProperties.get("hybris.jgroups.namespace")).isEqualTo("default");

	}
}
