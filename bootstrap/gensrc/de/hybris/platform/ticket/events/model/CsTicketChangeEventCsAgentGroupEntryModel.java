/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-Jul-2022, 11:52:11 AM                    ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.ticket.events.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;
import de.hybris.platform.ticket.events.model.CsTicketChangeEventEntryModel;
import de.hybris.platform.ticket.model.CsAgentGroupModel;

/**
 * Generated model class for type CsTicketChangeEventCsAgentGroupEntry first defined at extension ticketsystem.
 */
@SuppressWarnings("all")
public class CsTicketChangeEventCsAgentGroupEntryModel extends CsTicketChangeEventEntryModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "CsTicketChangeEventCsAgentGroupEntry";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventCsAgentGroupEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String OLDVALUE = "oldValue";
	
	/** <i>Generated constant</i> - Attribute key of <code>CsTicketChangeEventCsAgentGroupEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. */
	public static final String NEWVALUE = "newValue";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public CsTicketChangeEventCsAgentGroupEntryModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public CsTicketChangeEventCsAgentGroupEntryModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public CsTicketChangeEventCsAgentGroupEntryModel(final ItemModel _owner)
	{
		super();
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventCsAgentGroupEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the newValue
	 */
	@Accessor(qualifier = "newValue", type = Accessor.Type.GETTER)
	public CsAgentGroupModel getNewValue()
	{
		return getPersistenceContext().getPropertyValue(NEWVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CsTicketChangeEventCsAgentGroupEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 * @return the oldValue
	 */
	@Accessor(qualifier = "oldValue", type = Accessor.Type.GETTER)
	public CsAgentGroupModel getOldValue()
	{
		return getPersistenceContext().getPropertyValue(OLDVALUE);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventCsAgentGroupEntry.newValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the newValue
	 */
	@Accessor(qualifier = "newValue", type = Accessor.Type.SETTER)
	public void setNewValue(final CsAgentGroupModel value)
	{
		getPersistenceContext().setPropertyValue(NEWVALUE, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>CsTicketChangeEventCsAgentGroupEntry.oldValue</code> attribute defined at extension <code>ticketsystem</code>. 
	 *  
	 * @param value the oldValue
	 */
	@Accessor(qualifier = "oldValue", type = Accessor.Type.SETTER)
	public void setOldValue(final CsAgentGroupModel value)
	{
		getPersistenceContext().setPropertyValue(OLDVALUE, value);
	}
	
}
