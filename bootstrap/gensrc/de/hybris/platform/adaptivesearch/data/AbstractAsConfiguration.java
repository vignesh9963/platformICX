/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:33 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.adaptivesearch.data;

import java.io.Serializable;
import de.hybris.platform.adaptivesearch.data.AsCatalogVersion;


import java.util.Objects;
public  class AbstractAsConfiguration  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractAsConfiguration.catalogVersion</code> property defined at extension <code>adaptivesearch</code>. */
	
	private AsCatalogVersion catalogVersion;

	/** <i>Generated property</i> for <code>AbstractAsConfiguration.uid</code> property defined at extension <code>adaptivesearch</code>. */
	
	private String uid;
	
	public AbstractAsConfiguration()
	{
		// default constructor
	}
	
	public void setCatalogVersion(final AsCatalogVersion catalogVersion)
	{
		this.catalogVersion = catalogVersion;
	}

	public AsCatalogVersion getCatalogVersion() 
	{
		return catalogVersion;
	}
	
	public void setUid(final String uid)
	{
		this.uid = uid;
	}

	public String getUid() 
	{
		return uid;
	}
	

}