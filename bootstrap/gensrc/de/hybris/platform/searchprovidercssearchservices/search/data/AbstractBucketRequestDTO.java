/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:31 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.searchprovidercssearchservices.search.data;

import java.io.Serializable;


import java.util.Objects;
public abstract  class AbstractBucketRequestDTO  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>AbstractBucketRequestDTO.id</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private String id;

	/** <i>Generated property</i> for <code>AbstractBucketRequestDTO.name</code> property defined at extension <code>searchprovidercssearchservices</code>. */
	
	private String name;
	
	public AbstractBucketRequestDTO()
	{
		// default constructor
	}
	
	public void setId(final String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	
	public void setName(final String name)
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	

}