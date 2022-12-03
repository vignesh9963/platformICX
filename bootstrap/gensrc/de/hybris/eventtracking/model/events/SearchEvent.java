/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN!
 * --- Generated at 25-Jul-2022, 11:52:28 AM
 * ----------------------------------------------------------------
 *
 * Copyright (c) 2022 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.eventtracking.model.events;

import java.io.Serializable;

import de.hybris.eventtracking.model.events.AbstractTrackingEvent;

public  class SearchEvent extends AbstractTrackingEvent 
{


	/** <i>Generated property</i> for <code>SearchEvent.searchTerm</code> property defined at extension <code>eventtrackingmodel</code>. */
	
	private String searchTerm;
	
	public SearchEvent()
	{
		super();
	}

	public SearchEvent(final Serializable source)
	{
		super(source);
	}
	
	public void setSearchTerm(final String searchTerm)
	{
		this.searchTerm = searchTerm;
	}

	public String getSearchTerm() 
	{
		return searchTerm;
	}
	


}
