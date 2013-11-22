/**
 */
package org.openetcs.datadictionary.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.datadictionary.model.Feature#getSubFunctions <em>Sub Functions</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Feature#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getFeature()
 * @model
 * @generated
 */
public interface Feature extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Sub Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Functions</em>' containment reference isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Functions</em>' containment reference.
	 * @see #setSubFunctions(Function)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getFeature_SubFunctions()
	 * @model containment="true"
	 * @generated
	 */
	Function getSubFunctions();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Feature#getSubFunctions <em>Sub Functions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Functions</em>' containment reference.
	 * @see #getSubFunctions()
	 * @generated
	 */
	void setSubFunctions(Function value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getFeature_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Feature#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Feature
