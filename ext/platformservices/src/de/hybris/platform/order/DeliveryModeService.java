/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.order;

import de.hybris.platform.core.model.order.delivery.DeliveryModeModel;
import de.hybris.platform.core.model.order.payment.PaymentModeModel;

import java.util.Collection;


/**
 * Service around the {@link DeliveryModeModel}. Delivery mode is a summary data about a logistic company. You may find
 * more info about delivery modes <a
 * href="https://wiki.hybris.com/display/release4/Payment+Transaction+and+Delivery+Mode+Handling">here</a>. The service
 * allows finding {@link DeliveryModeModel}s by code. It also helps to find out delivery modes supported by payment
 * modes.
 *
 * @spring.bean deliveryModeService
 */
public interface DeliveryModeService
{

	/**
	 * Gets the {@link DeliveryModeModel} with the specified code.
	 *
	 * @param code the delivery mode code
	 * @return the found {@link DeliveryModeModel} with the specified code
	 * @throws de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException   if no delivery mode was found for the given code.
	 * @throws de.hybris.platform.servicelayer.exceptions.AmbiguousIdentifierException if more than one delivery model was found for the given code.
	 */
	DeliveryModeModel getDeliveryModeForCode(String code);

	/**
	 * Gets all {@link DeliveryModeModel}s.
	 *
	 * @return a <code>Collection</code> of all {@link DeliveryModeModel}s
	 */
	Collection<DeliveryModeModel> getAllDeliveryModes();

	/**
	 * Gets all {@link DeliveryModeModel}s which are supported for the given {@link PaymentModeModel}.
	 *
	 * @param paymentMode target paymentMode
	 * @return a <code>Collection</code> of supported {@link DeliveryModeModel}s
	 * @throws IllegalArgumentException if paymentMode is null
	 */
	Collection<DeliveryModeModel> getSupportedDeliveryModes(PaymentModeModel paymentMode);


}
