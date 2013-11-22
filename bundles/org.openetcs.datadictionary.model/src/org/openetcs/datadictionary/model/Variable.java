/**
 */
package org.openetcs.datadictionary.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getStore <em>Store</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getMinimalValue <em>Minimal Value</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getMaximalValue <em>Maximal Value</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getSpecialValue <em>Special Value</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getDefinitionRequirements <em>Definition Requirements</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#isSafety <em>Safety</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Variable#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' containment reference.
	 * @see #isSetStore()
	 * @see #unsetStore()
	 * @see #setStore(Variable)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_Store()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	Variable getStore();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#getStore <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' containment reference.
	 * @see #isSetStore()
	 * @see #unsetStore()
	 * @see #getStore()
	 * @generated
	 */
	void setStore(Variable value);

	/**
	 * Unsets the value of the '{@link org.openetcs.datadictionary.model.Variable#getStore <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStore()
	 * @see #getStore()
	 * @see #setStore(Variable)
	 * @generated
	 */
	void unsetStore();

	/**
	 * Returns whether the value of the '{@link org.openetcs.datadictionary.model.Variable#getStore <em>Store</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Store</em>' containment reference is set.
	 * @see #unsetStore()
	 * @see #getStore()
	 * @see #setStore(Variable)
	 * @generated
	 */
	boolean isSetStore();

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_Constant()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimal Value</em>' attribute.
	 * @see #isSetMinimalValue()
	 * @see #unsetMinimalValue()
	 * @see #setMinimalValue(String)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_MinimalValue()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getMinimalValue();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#getMinimalValue <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimal Value</em>' attribute.
	 * @see #isSetMinimalValue()
	 * @see #unsetMinimalValue()
	 * @see #getMinimalValue()
	 * @generated
	 */
	void setMinimalValue(String value);

	/**
	 * Unsets the value of the '{@link org.openetcs.datadictionary.model.Variable#getMinimalValue <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMinimalValue()
	 * @see #getMinimalValue()
	 * @see #setMinimalValue(String)
	 * @generated
	 */
	void unsetMinimalValue();

	/**
	 * Returns whether the value of the '{@link org.openetcs.datadictionary.model.Variable#getMinimalValue <em>Minimal Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Minimal Value</em>' attribute is set.
	 * @see #unsetMinimalValue()
	 * @see #getMinimalValue()
	 * @see #setMinimalValue(String)
	 * @generated
	 */
	boolean isSetMinimalValue();

	/**
	 * Returns the value of the '<em><b>Maximal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximal Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximal Value</em>' attribute.
	 * @see #isSetMaximalValue()
	 * @see #unsetMaximalValue()
	 * @see #setMaximalValue(String)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_MaximalValue()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getMaximalValue();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#getMaximalValue <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximal Value</em>' attribute.
	 * @see #isSetMaximalValue()
	 * @see #unsetMaximalValue()
	 * @see #getMaximalValue()
	 * @generated
	 */
	void setMaximalValue(String value);

	/**
	 * Unsets the value of the '{@link org.openetcs.datadictionary.model.Variable#getMaximalValue <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaximalValue()
	 * @see #getMaximalValue()
	 * @see #setMaximalValue(String)
	 * @generated
	 */
	void unsetMaximalValue();

	/**
	 * Returns whether the value of the '{@link org.openetcs.datadictionary.model.Variable#getMaximalValue <em>Maximal Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Maximal Value</em>' attribute is set.
	 * @see #unsetMaximalValue()
	 * @see #getMaximalValue()
	 * @see #setMaximalValue(String)
	 * @generated
	 */
	boolean isSetMaximalValue();

	/**
	 * Returns the value of the '<em><b>Special Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Value</em>' attribute.
	 * @see #isSetSpecialValue()
	 * @see #unsetSpecialValue()
	 * @see #setSpecialValue(String)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_SpecialValue()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getSpecialValue();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#getSpecialValue <em>Special Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Special Value</em>' attribute.
	 * @see #isSetSpecialValue()
	 * @see #unsetSpecialValue()
	 * @see #getSpecialValue()
	 * @generated
	 */
	void setSpecialValue(String value);

	/**
	 * Unsets the value of the '{@link org.openetcs.datadictionary.model.Variable#getSpecialValue <em>Special Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecialValue()
	 * @see #getSpecialValue()
	 * @see #setSpecialValue(String)
	 * @generated
	 */
	void unsetSpecialValue();

	/**
	 * Returns whether the value of the '{@link org.openetcs.datadictionary.model.Variable#getSpecialValue <em>Special Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Special Value</em>' attribute is set.
	 * @see #unsetSpecialValue()
	 * @see #getSpecialValue()
	 * @see #setSpecialValue(String)
	 * @generated
	 */
	boolean isSetSpecialValue();

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #setResolution(String)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_Resolution()
	 * @model unique="false" unsettable="true"
	 * @generated
	 */
	String getResolution();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' attribute.
	 * @see #isSetResolution()
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(String value);

	/**
	 * Unsets the value of the '{@link org.openetcs.datadictionary.model.Variable#getResolution <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetResolution()
	 * @see #getResolution()
	 * @see #setResolution(String)
	 * @generated
	 */
	void unsetResolution();

	/**
	 * Returns whether the value of the '{@link org.openetcs.datadictionary.model.Variable#getResolution <em>Resolution</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Resolution</em>' attribute is set.
	 * @see #unsetResolution()
	 * @see #getResolution()
	 * @see #setResolution(String)
	 * @generated
	 */
	boolean isSetResolution();

	/**
	 * Returns the value of the '<em><b>Definition Requirements</b></em>' reference list.
	 * The list contents are of type {@link org.openetcs.datadictionary.model.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition Requirements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition Requirements</em>' reference list.
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_DefinitionRequirements()
	 * @model required="true"
	 * @generated
	 */
	EList<Requirement> getDefinitionRequirements();

	/**
	 * Returns the value of the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safety</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety</em>' attribute.
	 * @see #setSafety(boolean)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_Safety()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isSafety();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#isSafety <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety</em>' attribute.
	 * @see #isSafety()
	 * @generated
	 */
	void setSafety(boolean value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' attribute.
	 * @see #setDefinition(String)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_Definition()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(VariableType)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getVariable_Type()
	 * @model
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Variable#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

} // Variable
