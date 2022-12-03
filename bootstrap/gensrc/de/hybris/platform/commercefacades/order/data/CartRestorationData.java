/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:28 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.CartModificationData;
import java.util.List;


import java.util.Objects;
public  class CartRestorationData  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>CartRestorationData.modifications</code> property defined at extension <code>commercefacades</code>. */
	
	private List<CartModificationData> modifications;
	
	public CartRestorationData()
	{
		// default constructor
	}
	
	public void setModifications(final List<CartModificationData> modifications)
	{
		this.modifications = modifications;
	}

	public List<CartModificationData> getModifications() 
	{
		return modifications;
	}
	

}