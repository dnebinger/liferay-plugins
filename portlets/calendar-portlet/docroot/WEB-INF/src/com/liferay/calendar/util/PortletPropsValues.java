/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.calendar.util;

import com.liferay.util.portlet.PortletProps;

/**
 * @author Eduardo Lundgren
 * @author Fabio Pezzutto
 * @author Andrea Di Giorgi
 */
public class PortletPropsValues {

	public static final int CALENDAR_COLOR_DEFAULT =
		Integer.decode(
			PortletProps.get(PortletPropsKeys.CALENDAR_COLOR_DEFAULT));

	public static final String[] CALENDAR_RESOURCE_TYPES =
		PortletProps.getArray(PortletPropsKeys.CALENDAR_RESOURCE_TYPES);

}