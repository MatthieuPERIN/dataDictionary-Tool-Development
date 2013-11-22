/**
 */
package org.openetcs.datadictionary.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.openetcs.datadictionary.model.DatadictionaryFactory
 * @model kind="package"
 * @generated
 */
public interface DatadictionaryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://openetcs.org/datadictionary/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.openetcs.datadictionary.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DatadictionaryPackage eINSTANCE = org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.impl.NamedElementImpl
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.impl.VariableImpl
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__STORE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CONSTANT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minimal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MINIMAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximal Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MAXIMAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Special Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SPECIAL_VALUE = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RESOLUTION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Definition Requirements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFINITION_REQUIREMENTS = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SAFETY = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.impl.RequirementImpl
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NATURE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sub Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SUB_REQUIREMENT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALLOCATION = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SAFETY = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXPORTED = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Issues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ISSUES = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.impl.FunctionImpl
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SUB_FUNCTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allocation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ALLOCATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPUT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__OUTPUT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Internal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INTERNAL = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__REQUIREMENT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SAFETY = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__DEFINITION = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.impl.VariableTypeImpl
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.impl.IssueImpl <em>Issue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.impl.IssueImpl
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getIssue()
	 * @generated
	 */
	int ISSUE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Closed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE__CLOSED = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Issue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISSUE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.impl.FeatureImpl
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Sub Functions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB_FUNCTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.T_RequirementNature <em>TRequirement Nature</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.T_RequirementNature
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getT_RequirementNature()
	 * @generated
	 */
	int TREQUIREMENT_NATURE = 7;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.T_System <em>TSystem</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.T_System
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getT_System()
	 * @generated
	 */
	int TSYSTEM = 8;

	/**
	 * The meta object id for the '{@link org.openetcs.datadictionary.model.T_SourceDocument <em>TSource Document</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openetcs.datadictionary.model.T_SourceDocument
	 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getT_SourceDocument()
	 * @generated
	 */
	int TSOURCE_DOCUMENT = 9;

	/**
	 * Returns the meta object for class '{@link org.openetcs.datadictionary.model.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see org.openetcs.datadictionary.model.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.datadictionary.model.Variable#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Store</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getStore()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Store();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Variable#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#isConstant()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Constant();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Variable#getMinimalValue <em>Minimal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimal Value</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getMinimalValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_MinimalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Variable#getMaximalValue <em>Maximal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximal Value</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getMaximalValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_MaximalValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Variable#getSpecialValue <em>Special Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Special Value</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getSpecialValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_SpecialValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Variable#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolution</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getResolution()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Resolution();

	/**
	 * Returns the meta object for the reference list '{@link org.openetcs.datadictionary.model.Variable#getDefinitionRequirements <em>Definition Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Definition Requirements</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getDefinitionRequirements()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_DefinitionRequirements();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Variable#isSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#isSafety()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Safety();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Variable#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getDefinition()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Definition();

	/**
	 * Returns the meta object for the reference '{@link org.openetcs.datadictionary.model.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.openetcs.datadictionary.model.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Type();

	/**
	 * Returns the meta object for class '{@link org.openetcs.datadictionary.model.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Requirement#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#getNature()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Nature();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Requirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#getSource()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.datadictionary.model.Requirement#getSubRequirement <em>Sub Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Requirement</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#getSubRequirement()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SubRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Requirement#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#getAllocation()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Allocation();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Requirement#isSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#isSafety()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Safety();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Requirement#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#getDefinition()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Definition();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Requirement#isExported <em>Exported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exported</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#isExported()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Exported();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.datadictionary.model.Requirement#getIssues <em>Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Issues</em>'.
	 * @see org.openetcs.datadictionary.model.Requirement#getIssues()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Issues();

	/**
	 * Returns the meta object for class '{@link org.openetcs.datadictionary.model.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.openetcs.datadictionary.model.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.datadictionary.model.Function#getSubFunction <em>Sub Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Function</em>'.
	 * @see org.openetcs.datadictionary.model.Function#getSubFunction()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_SubFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Function#getAllocation <em>Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allocation</em>'.
	 * @see org.openetcs.datadictionary.model.Function#getAllocation()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Allocation();

	/**
	 * Returns the meta object for the reference list '{@link org.openetcs.datadictionary.model.Function#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see org.openetcs.datadictionary.model.Function#getInput()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Input();

	/**
	 * Returns the meta object for the reference list '{@link org.openetcs.datadictionary.model.Function#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output</em>'.
	 * @see org.openetcs.datadictionary.model.Function#getOutput()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openetcs.datadictionary.model.Function#getInternal <em>Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal</em>'.
	 * @see org.openetcs.datadictionary.model.Function#getInternal()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Internal();

	/**
	 * Returns the meta object for the reference list '{@link org.openetcs.datadictionary.model.Function#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requirement</em>'.
	 * @see org.openetcs.datadictionary.model.Function#getRequirement()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Function#isSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety</em>'.
	 * @see org.openetcs.datadictionary.model.Function#isSafety()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Safety();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Function#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see org.openetcs.datadictionary.model.Function#getDefinition()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Definition();

	/**
	 * Returns the meta object for class '{@link org.openetcs.datadictionary.model.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see org.openetcs.datadictionary.model.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for class '{@link org.openetcs.datadictionary.model.Issue <em>Issue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Issue</em>'.
	 * @see org.openetcs.datadictionary.model.Issue
	 * @generated
	 */
	EClass getIssue();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Issue#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openetcs.datadictionary.model.Issue#getDescription()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Issue#isClosed <em>Closed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed</em>'.
	 * @see org.openetcs.datadictionary.model.Issue#isClosed()
	 * @see #getIssue()
	 * @generated
	 */
	EAttribute getIssue_Closed();

	/**
	 * Returns the meta object for class '{@link org.openetcs.datadictionary.model.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.openetcs.datadictionary.model.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference '{@link org.openetcs.datadictionary.model.Feature#getSubFunctions <em>Sub Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub Functions</em>'.
	 * @see org.openetcs.datadictionary.model.Feature#getSubFunctions()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SubFunctions();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.Feature#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openetcs.datadictionary.model.Feature#getDescription()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Description();

	/**
	 * Returns the meta object for class '{@link org.openetcs.datadictionary.model.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.openetcs.datadictionary.model.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.openetcs.datadictionary.model.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.openetcs.datadictionary.model.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.datadictionary.model.T_RequirementNature <em>TRequirement Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TRequirement Nature</em>'.
	 * @see org.openetcs.datadictionary.model.T_RequirementNature
	 * @generated
	 */
	EEnum getT_RequirementNature();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.datadictionary.model.T_System <em>TSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TSystem</em>'.
	 * @see org.openetcs.datadictionary.model.T_System
	 * @generated
	 */
	EEnum getT_System();

	/**
	 * Returns the meta object for enum '{@link org.openetcs.datadictionary.model.T_SourceDocument <em>TSource Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TSource Document</em>'.
	 * @see org.openetcs.datadictionary.model.T_SourceDocument
	 * @generated
	 */
	EEnum getT_SourceDocument();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DatadictionaryFactory getDatadictionaryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.impl.VariableImpl
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__STORE = eINSTANCE.getVariable_Store();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__CONSTANT = eINSTANCE.getVariable_Constant();

		/**
		 * The meta object literal for the '<em><b>Minimal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MINIMAL_VALUE = eINSTANCE.getVariable_MinimalValue();

		/**
		 * The meta object literal for the '<em><b>Maximal Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MAXIMAL_VALUE = eINSTANCE.getVariable_MaximalValue();

		/**
		 * The meta object literal for the '<em><b>Special Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SPECIAL_VALUE = eINSTANCE.getVariable_SpecialValue();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__RESOLUTION = eINSTANCE.getVariable_Resolution();

		/**
		 * The meta object literal for the '<em><b>Definition Requirements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__DEFINITION_REQUIREMENTS = eINSTANCE.getVariable_DefinitionRequirements();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SAFETY = eINSTANCE.getVariable_Safety();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__DEFINITION = eINSTANCE.getVariable_Definition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.impl.RequirementImpl
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__NATURE = eINSTANCE.getRequirement_Nature();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SOURCE = eINSTANCE.getRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Sub Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SUB_REQUIREMENT = eINSTANCE.getRequirement_SubRequirement();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALLOCATION = eINSTANCE.getRequirement_Allocation();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SAFETY = eINSTANCE.getRequirement_Safety();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DEFINITION = eINSTANCE.getRequirement_Definition();

		/**
		 * The meta object literal for the '<em><b>Exported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__EXPORTED = eINSTANCE.getRequirement_Exported();

		/**
		 * The meta object literal for the '<em><b>Issues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ISSUES = eINSTANCE.getRequirement_Issues();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.impl.FunctionImpl
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Sub Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__SUB_FUNCTION = eINSTANCE.getFunction_SubFunction();

		/**
		 * The meta object literal for the '<em><b>Allocation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__ALLOCATION = eINSTANCE.getFunction_Allocation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INPUT = eINSTANCE.getFunction_Input();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__OUTPUT = eINSTANCE.getFunction_Output();

		/**
		 * The meta object literal for the '<em><b>Internal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INTERNAL = eINSTANCE.getFunction_Internal();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__REQUIREMENT = eINSTANCE.getFunction_Requirement();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__SAFETY = eINSTANCE.getFunction_Safety();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__DEFINITION = eINSTANCE.getFunction_Definition();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.impl.VariableTypeImpl <em>Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.impl.VariableTypeImpl
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getVariableType()
		 * @generated
		 */
		EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.impl.IssueImpl <em>Issue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.impl.IssueImpl
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getIssue()
		 * @generated
		 */
		EClass ISSUE = eINSTANCE.getIssue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__DESCRIPTION = eINSTANCE.getIssue_Description();

		/**
		 * The meta object literal for the '<em><b>Closed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ISSUE__CLOSED = eINSTANCE.getIssue_Closed();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.impl.FeatureImpl
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Sub Functions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SUB_FUNCTIONS = eINSTANCE.getFeature_SubFunctions();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__DESCRIPTION = eINSTANCE.getFeature_Description();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.impl.NamedElementImpl
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.T_RequirementNature <em>TRequirement Nature</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.T_RequirementNature
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getT_RequirementNature()
		 * @generated
		 */
		EEnum TREQUIREMENT_NATURE = eINSTANCE.getT_RequirementNature();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.T_System <em>TSystem</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.T_System
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getT_System()
		 * @generated
		 */
		EEnum TSYSTEM = eINSTANCE.getT_System();

		/**
		 * The meta object literal for the '{@link org.openetcs.datadictionary.model.T_SourceDocument <em>TSource Document</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openetcs.datadictionary.model.T_SourceDocument
		 * @see org.openetcs.datadictionary.model.impl.DatadictionaryPackageImpl#getT_SourceDocument()
		 * @generated
		 */
		EEnum TSOURCE_DOCUMENT = eINSTANCE.getT_SourceDocument();

	}

} //DatadictionaryPackage
