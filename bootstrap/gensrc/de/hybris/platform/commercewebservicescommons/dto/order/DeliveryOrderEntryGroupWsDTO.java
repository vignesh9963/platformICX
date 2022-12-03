/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:27 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.commercewebservicescommons.dto.order;

import de.hybris.platform.commercewebservicescommons.dto.order.OrderEntryGroupWsDTO;
import de.hybris.platform.commercewebservicescommons.dto.user.AddressWsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import java.util.Objects;
/**
 * Representation of a Delivery Order Entry Group
 */
@ApiModel(value="DeliveryOrderEntryGroup", description="Representation of a Delivery Order Entry Group")
public  class DeliveryOrderEntryGroupWsDTO extends OrderEntryGroupWsDTO 

{



	/** Delivery address for order entry group<br/><br/><i>Generated property</i> for <code>DeliveryOrderEntryGroupWsDTO.deliveryAddress</code> property defined at extension <code>commercewebservicescommons</code>. */
@ApiModelProperty(name="deliveryAddress", value="Delivery address for order entry group") 	
	private AddressWsDTO deliveryAddress;
	
	public DeliveryOrderEntryGroupWsDTO()
	{
		// default constructor
	}
	
	public void setDeliveryAddress(final AddressWsDTO deliveryAddress)
	{
		this.deliveryAddress = deliveryAddress;
	}

	public AddressWsDTO getDeliveryAddress() 
	{
		return deliveryAddress;
	}
	

}