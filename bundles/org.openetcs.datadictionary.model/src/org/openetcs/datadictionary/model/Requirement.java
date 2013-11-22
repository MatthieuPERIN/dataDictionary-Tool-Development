/**
 */
package org.openetcs.datadictionary.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#getNature <em>Nature</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#getSource <em>Source</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#getSubRequirement <em>Sub Requirement</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#isSafety <em>Safety</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#isExported <em>Exported</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.Requirement#getIssues <em>Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nature</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.datadictionary.model.T_RequirementNature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' attribute.
	 * @see org.openetcs.datadictionary.model.T_RequirementNature
	 * @see #setNature(T_RequirementNature)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_Nature()
	 * @model unique="false" required="true"
	 * @generated
	 */
	T_RequirementNature getNature();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Requirement#getNature <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' attribute.
	 * @see org.openetcs.datadictionary.model.T_RequirementNature
	 * @see #getNature()
	 * @generated
	 */
	void setNature(T_RequirementNature value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.datadictionary.model.T_SourceDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see org.openetcs.datadictionary.model.T_SourceDocument
	 * @see #setSource(T_SourceDocument)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_Source()
	 * @model unique="false" required="true"
	 * @generated
	 */
	T_SourceDocument getSource();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Requirement#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see org.openetcs.datadictionary.model.T_SourceDocument
	 * @see #getSource()
	 * @generated
	 */
	void setSource(T_SourceDocument value);

	/**
	 * Returns the value of the '<em><b>Sub Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.datadictionary.model.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Requirement</em>' containment reference list.
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_SubRequirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getSubRequirement();

	/**
	 * Returns the value of the '<em><b>Allocation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.openetcs.datadictionary.model.T_System}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocation</em>' attribute.
	 * @see org.openetcs.datadictionary.model.T_System
	 * @see #setAllocation(T_System)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_Allocation()
	 * @model unique="false" required="true"
	 * @generated
	 */
	T_System getAllocation();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Requirement#getAllocation <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allocation</em>' attribute.
	 * @see org.openetcs.datadictionary.model.T_System
	 * @see #getAllocation()
	 * @generated
	 */
	void setAllocation(T_System value);

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
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_Safety()
	 * @model unique="false" required="true"
	 * @generated
	 */
	boolean isSafety();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Requirement#isSafety <em>Safety</em>}' attribute.
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
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_Definition()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getDefinition();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Requirement#getDefinition <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' attribute.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Exported</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' attribute.
	 * @see #setExported(boolean)
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_Exported()
	 * @model default="false" unique="false" required="true"
	 * @generated
	 */
	boolean isExported();

	/**
	 * Sets the value of the '{@link org.openetcs.datadictionary.model.Requirement#isExported <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' attribute.
	 * @see #isExported()
	 * @generated
	 */
	void setExported(boolean value);

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' containment reference list.
	 * The list contents are of type {@link org.openetcs.datadictionary.model.Issue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' containment reference list.
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#getRequirement_Issues()
	 * @model containment="true"
	 * @generated
	 */
	EList<Issue> getIssues();

} // Requirement
