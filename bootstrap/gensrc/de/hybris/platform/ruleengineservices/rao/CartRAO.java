/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:33 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ruleengineservices.rao;

import de.hybris.platform.ruleengineservices.rao.AbstractOrderRAO;
import java.math.BigDecimal;


import java.util.Objects;
public  class CartRAO extends AbstractOrderRAO 

{



	/** <i>Generated property</i> for <code>CartRAO.originalTotal</code> property defined at extension <code>ruleengineservices</code>. */
	
	private BigDecimal originalTotal;
	
	public CartRAO()
	{
		// default constructor
	}
	
	public void setOriginalTotal(final BigDecimal originalTotal)
	{
		this.originalTotal = originalTotal;
	}

	public BigDecimal getOriginalTotal() 
	{
		return originalTotal;
	}
	

}