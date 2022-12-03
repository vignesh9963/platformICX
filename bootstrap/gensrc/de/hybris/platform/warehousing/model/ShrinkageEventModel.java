/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-Jul-2022, 11:52:11 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.warehousing.model;

import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.ordersplitting.model.StockLevelModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.warehousing.model.InventoryEventModel;

/**
 * Generated model class for type ShrinkageEvent first defined at extension warehousing.
 * <p>
 * A Shrinkage event.
 */
@SuppressWarnings("all")
public class ShrinkageEventModel extends InventoryEventModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "ShrinkageEvent";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public ShrinkageEventModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public ShrinkageEventModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _stockLevel initial attribute declared by type <code>InventoryEvent</code> at extension <code>warehousing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ShrinkageEventModel(final StockLevelModel _stockLevel)
	{
		super();
		setStockLevel(_stockLevel);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 * @param _stockLevel initial attribute declared by type <code>InventoryEvent</code> at extension <code>warehousing</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public ShrinkageEventModel(final ItemModel _owner, final StockLevelModel _stockLevel)
	{
		super();
		setOwner(_owner);
		setStockLevel(_stockLevel);
	}
	
	
}
