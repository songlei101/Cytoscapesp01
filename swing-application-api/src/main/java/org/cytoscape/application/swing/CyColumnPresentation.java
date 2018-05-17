package org.cytoscape.application.swing;

import javax.swing.Icon;

/**
 * Service that allows presentation to be given for a column namespace.
 * 
 * @see org.cytoscape.model.CyColumn
 * 
 * @CyAPI.Spi.Interface
 * @CyAPI.InModule swing-application-api
 */
public interface CyColumnPresentation {
	
	/**
	 * OSGi property, use to provide the namespace to associate this presentation with.
	 */
	public static final String NAMESPACE = "namespace";
	
	/**
	 * Returns an icon associated with the namespace.
	 * @return Must not return null;
	 */
	Icon getNamespaceIcon();
	
	/**
	 * Returns a String description of the namespace.
	 * @return Must not return null.
	 */
	String getNamespaceDescription();
	
}