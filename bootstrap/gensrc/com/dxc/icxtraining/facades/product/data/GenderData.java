/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:25 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.dxc.icxtraining.facades.product.data;

import java.io.Serializable;


import java.util.Objects;
public  class GenderData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>GenderData.code</code> property defined at extension <code>icxtrainingfacades</code>. */
	
	private String code;

	/** <i>Generated property</i> for <code>GenderData.name</code> property defined at extension <code>icxtrainingfacades</code>. */
	
	private String name;
	
	public GenderData()
	{
		// default constructor
	}
	
	public void setCode(final String code)
	{
		this.code = code;
	}

	public String getCode() 
	{
		return code;
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