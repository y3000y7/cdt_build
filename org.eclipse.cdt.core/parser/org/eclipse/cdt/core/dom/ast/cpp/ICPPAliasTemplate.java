/*******************************************************************************
 * Copyright (c) 2012 Institute for Software, HSR Hochschule fuer Technik  
 * Rapperswil, University of applied sciences.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Thomas Corbat (IFS) - Initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.core.dom.ast.cpp;

import org.eclipse.cdt.core.dom.ast.IType;

/**
 * Represents an alias template (14.5.7).
 * @since 5.5
 */
public interface ICPPAliasTemplate extends IType, ICPPTemplateDefinition {
	/**
	 * Returns the aliased type.
	 */
	public IType getType();	
}
