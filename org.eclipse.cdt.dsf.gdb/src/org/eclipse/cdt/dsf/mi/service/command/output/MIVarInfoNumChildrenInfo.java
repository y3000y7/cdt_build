/*******************************************************************************
 * Copyright (c) 2000, 2010 QNX Software Systems and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     QNX Software Systems - Initial API and implementation
 *     Jens Elmenthaler (Verigy) - Added Full GDB pretty-printing support (bug 302121)
 *******************************************************************************/

package org.eclipse.cdt.dsf.mi.service.command.output;


/**
 * GDB/MI var-info-num-children.
 * 
 * For dynamic variable objects, only the number children currently fetched
 * by gdb is returned.
 */
public class MIVarInfoNumChildrenInfo extends MIInfo {

	int children = 0;

	public MIVarInfoNumChildrenInfo(MIOutput record) {
		super(record);
        if (isDone()) {
            MIOutput out = getMIOutput();
            MIResultRecord rr = out.getMIResultRecord();
            if (rr != null) {
                MIResult[] results =  rr.getMIResults();
                for (int i = 0; i < results.length; i++) {
                    String var = results[i].getVariable();

                    if (var.equals("numchild")) { //$NON-NLS-1$
                        MIValue value = results[i].getMIValue();
                        if (value instanceof MIConst) {
                            String str = ((MIConst)value).getString();
                            try {
                                children = Integer.parseInt(str.trim());
                            } catch (NumberFormatException e) {
                            }
                        }
                    }
                }
            }
        }
	}

	public int getChildNumber() {
		return children;
	}
}
