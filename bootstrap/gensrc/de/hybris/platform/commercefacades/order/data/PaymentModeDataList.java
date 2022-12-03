/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:33 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercefacades.order.data;

import java.io.Serializable;
import de.hybris.platform.commercefacades.order.data.PaymentModeData;
import java.util.List;


import java.util.Objects;
public  class PaymentModeDataList  implements Serializable 

{

	/** Default serialVersionUID value. */
 
	private static final long serialVersionUID = 1L;

	/** <i>Generated property</i> for <code>PaymentModeDataList.paymentModes</code> property defined at extension <code>commercefacades</code>. */
	
	private List<PaymentModeData> paymentModes;
	
	public PaymentModeDataList()
	{
		// default constructor
	}
	
	public void setPaymentModes(final List<PaymentModeData> paymentModes)
	{
		this.paymentModes = paymentModes;
	}

	public List<PaymentModeData> getPaymentModes() 
	{
		return paymentModes;
	}
	

}