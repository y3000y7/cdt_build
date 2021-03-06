/*******************************************************************************
 * Copyright (c) 2012, 2012 Andrew Gvozdev and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Andrew Gvozdev - Initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.ui.language.settings.providers;

import java.net.URL;

import org.eclipse.cdt.internal.ui.language.settings.providers.LanguageSettingsProviderAssociationManager;

/**
 * Utility class to provide API for language settings providers images.
 *
 * @since 5.4
 */
public class LanguageSettingsProvidersImages {
	/**
	 * Get image URL for language settings provider with the given ID.
	 *
	 * @param providerId - ID of language settings provider.
	 * @return image URL or {@code null}.
	 */
	public static URL getImageUrl(String providerId) {
		return LanguageSettingsProviderAssociationManager.getImageUrl(providerId);
	}

}
