/*******************************************************************************
 * Copyright (c) 2015, 2015 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package melnorme.lang.ide.ui.navigator;

import LANG_PROJECT_ID.ide.ui.navigator.ILANGUAGE_NavigatorElement;
import melnorme.lang.tooling.LANG_SPECIFIC;

/***
 * This class should never be referred to directly in a plugin.xml.
 * This is to avoid conflict with other LangEclipseIDE IDEs that have would a class with identical name 
 * 
 * Rather, this interface should solely be an alias to an specific IDE interface
 * contained in the specific package namespace of the IDE (ie, the plugin name). 
 */
@LANG_SPECIFIC
public interface INavigatorElement_Actual extends ILANGUAGE_NavigatorElement {
	
}