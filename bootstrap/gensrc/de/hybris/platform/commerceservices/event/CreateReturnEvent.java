/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:29 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commerceservices.event;

import java.io.Serializable;
import de.hybris.platform.servicelayer.event.events.AbstractEvent;

import de.hybris.platform.returns.model.ReturnRequestModel;

public  class CreateReturnEvent  extends AbstractEvent 
{


	/** <i>Generated property</i> for <code>CreateReturnEvent.returnRequest</code> property defined at extension <code>commerceservices</code>. */
	
	private ReturnRequestModel returnRequest;
	
	public CreateReturnEvent()
	{
		super();
	}

	public CreateReturnEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setReturnRequest(final ReturnRequestModel returnRequest)
	{
		this.returnRequest = returnRequest;
	}

	public ReturnRequestModel getReturnRequest() 
	{
		return returnRequest;
	}
	


}
