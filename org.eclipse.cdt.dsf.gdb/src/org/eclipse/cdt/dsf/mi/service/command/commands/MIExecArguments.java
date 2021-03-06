/*******************************************************************************
 * Copyright (c) 2011 Tensilica and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Abeer Bagul (Tensilica) - Initial API and implementation
 *******************************************************************************/

package org.eclipse.cdt.dsf.mi.service.command.commands;

import org.eclipse.cdt.dsf.mi.service.IMIContainerDMContext;
import org.eclipse.cdt.dsf.mi.service.command.output.MIInfo;

/**
 * 
 *      -exec-arguments ARGS
 *
 *   Set the inferior program arguments, to be used in the next `-exec-run'.
 *   Equivalent to using {@link MIGDBSetArgs}
 * 
 * @since 4.0
 */
public class MIExecArguments extends MICommand<MIInfo>
{
	public MIExecArguments(IMIContainerDMContext ctx, String[] args) {
		super(ctx, "-exec-arguments", args); //$NON-NLS-1$
	}
}
