/**
 */
package org.openetcs.datadictionary.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Issue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.datadictionary.model.Issue#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Issue#isClosed <em>Closed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getIssue()
 * @model
 * @generated
 */
public interface Issue extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getIssue_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Issue#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed</em>' attribute.
	 * @see #setClosed(boolean)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getIssue_Closed()
	 * @model
	 * @generated
	 */
	boolean isClosed();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Issue#isClosed <em>Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed</em>' attribute.
	 * @see #isClosed()
	 * @generated
	 */
	void setClosed(boolean value);

} // Issue
