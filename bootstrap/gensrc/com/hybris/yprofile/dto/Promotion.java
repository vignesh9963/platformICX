/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:28 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.hybris.yprofile.dto;

import java.io.Serializable;


import java.util.Objects;
public  class Promotion  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>Promotion.ref</code> property defined at extension <code>profileservices</code>. */
	
	private String ref;

	/** <i>Generated property</i> for <code>Promotion.type</code> property defined at extension <code>profileservices</code>. */
	
	private String type;
	
	public Promotion()
	{
		// default constructor
	}
	
	public void setRef(final String ref)
	{
		this.ref = ref;
	}

	public String getRef() 
	{
		return ref;
	}
	
	public void setType(final String type)
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	

}