/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.core;

import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.classextension.EasyMock.createMock;
import static org.easymock.classextension.EasyMock.replay;
import static org.easymock.classextension.EasyMock.verify;

import de.hybris.bootstrap.annotations.UnitTest;

import org.junit.Test;


/**
 * Test for checking execution of the created {@link Runnable} depending on the prepare/after method result.
 */
@UnitTest
public class TenantAwareThreadFactoryTest
{
	class TestTenantAwareThreadFactory extends TenantAwareThreadFactory
	{
		private final RuntimeException preparation;

		private final RuntimeException unpreparation;

		/**
		 * Creates new {@link TestTenantAwareThreadFactory}.
		 */
		public TestTenantAwareThreadFactory(final Tenant tenant, final RuntimeException preparation,
		                                    final RuntimeException unpreparation)
		{
			super(tenant);
			this.preparation = preparation;
			this.unpreparation = unpreparation;
		}

		@Override
		protected void beforePrepareThread()
		{
			if (preparation != null)
			{
				throw preparation;
			}
		}


		@Override
		protected void afterUnprepareThread()
		{
			if (unpreparation != null)
			{
				throw unpreparation;
			}
		}

	}

	//prepare method throws some exception no thread.run will be performed
	@Test(expected = IllegalStateException.class)
	public void testTenanWitSesionCall()
	{
		final Tenant tenant = createMock(Tenant.class);

		final TenantAwareThreadFactory factory = new TestTenantAwareThreadFactory(tenant, new IllegalStateException(), null);

		final Runnable thread = createMock(Runnable.class);

		expectLastCall().andThrow(new IllegalStateException());

		factory.newThread(thread).run();

	}

	//unprepare method throws some exception  thread.run will be performed
	@Test(expected = IllegalStateException.class)
	public void testTenanWitSesionCall2()
	{
		final Tenant tenant = createMock(Tenant.class);

		final TenantAwareThreadFactory factory = new TestTenantAwareThreadFactory(tenant, null, new IllegalStateException());

		final Runnable thread = createMock(Runnable.class);

		thread.run();

		expectLastCall().once();

		replay(thread);

		factory.newThread(thread).run();

		verify(thread);
	}
}
