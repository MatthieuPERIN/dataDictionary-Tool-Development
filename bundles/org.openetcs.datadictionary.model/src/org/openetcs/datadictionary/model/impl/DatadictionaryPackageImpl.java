/**
 */
package org.openetcs.datadictionary.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.openetcs.datadictionary.model.DatadictionaryFactory;
import org.openetcs.datadictionary.model.DatadictionaryPackage;
import org.openetcs.datadictionary.model.Feature;
import org.openetcs.datadictionary.model.Function;
import org.openetcs.datadictionary.model.Issue;
import org.openetcs.datadictionary.model.NamedElement;
import org.openetcs.datadictionary.model.Requirement;
import org.openetcs.datadictionary.model.T_RequirementNature;
import org.openetcs.datadictionary.model.T_SourceDocument;
import org.openetcs.datadictionary.model.T_System;
import org.openetcs.datadictionary.model.Variable;
import org.openetcs.datadictionary.model.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatadictionaryPackageImpl extends EPackageImpl implements DatadictionaryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass issueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum t_RequirementNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum t_SystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum t_SourceDocumentEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package
	 * package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openetcs.datadictionary.model.DatadictionaryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DatadictionaryPackageImpl() {
		super(eNS_URI, DatadictionaryFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link DatadictionaryPackage#eINSTANCE} when that field is accessed. Clients
	 * should not invoke it directly. Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DatadictionaryPackage init() {
		if (isInited)
			return (DatadictionaryPackage) EPackage.Registry.INSTANCE.getEPackage(DatadictionaryPackage.eNS_URI);

		// Obtain or create and register package
		DatadictionaryPackageImpl theDatadictionaryPackage = (DatadictionaryPackageImpl) (EPackage.Registry.INSTANCE
			.get(eNS_URI) instanceof DatadictionaryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
			: new DatadictionaryPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theDatadictionaryPackage.createPackageContents();

		// Initialize created meta-data
		theDatadictionaryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDatadictionaryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DatadictionaryPackage.eNS_URI, theDatadictionaryPackage);
		return theDatadictionaryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Store() {
		return (EReference) variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Constant() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_MinimalValue() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_MaximalValue() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_SpecialValue() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Resolution() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_DefinitionRequirements() {
		return (EReference) variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Safety() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Definition() {
		return (EAttribute) variableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_Type() {
		return (EReference) variableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Nature() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Source() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_SubRequirement() {
		return (EReference) requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Allocation() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Safety() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Definition() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Exported() {
		return (EAttribute) requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Issues() {
		return (EReference) requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_SubFunction() {
		return (EReference) functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Allocation() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Input() {
		return (EReference) functionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Output() {
		return (EReference) functionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Internal() {
		return (EReference) functionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunction_Requirement() {
		return (EReference) functionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Safety() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Definition() {
		return (EAttribute) functionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableType() {
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIssue() {
		return issueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Description() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIssue_Closed() {
		return (EAttribute) issueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFeature_SubFunctions() {
		return (EReference) featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFeature_Description() {
		return (EAttribute) featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getT_RequirementNature() {
		return t_RequirementNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getT_System() {
		return t_SystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getT_SourceDocument() {
		return t_SourceDocumentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatadictionaryFactory getDatadictionaryFactory() {
		return (DatadictionaryFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__STORE);
		createEAttribute(variableEClass, VARIABLE__CONSTANT);
		createEAttribute(variableEClass, VARIABLE__MINIMAL_VALUE);
		createEAttribute(variableEClass, VARIABLE__MAXIMAL_VALUE);
		createEAttribute(variableEClass, VARIABLE__SPECIAL_VALUE);
		createEAttribute(variableEClass, VARIABLE__RESOLUTION);
		createEReference(variableEClass, VARIABLE__DEFINITION_REQUIREMENTS);
		createEAttribute(variableEClass, VARIABLE__SAFETY);
		createEAttribute(variableEClass, VARIABLE__DEFINITION);
		createEReference(variableEClass, VARIABLE__TYPE);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__NATURE);
		createEAttribute(requirementEClass, REQUIREMENT__SOURCE);
		createEReference(requirementEClass, REQUIREMENT__SUB_REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__ALLOCATION);
		createEAttribute(requirementEClass, REQUIREMENT__SAFETY);
		createEAttribute(requirementEClass, REQUIREMENT__DEFINITION);
		createEAttribute(requirementEClass, REQUIREMENT__EXPORTED);
		createEReference(requirementEClass, REQUIREMENT__ISSUES);

		functionEClass = createEClass(FUNCTION);
		createEReference(functionEClass, FUNCTION__SUB_FUNCTION);
		createEAttribute(functionEClass, FUNCTION__ALLOCATION);
		createEReference(functionEClass, FUNCTION__INPUT);
		createEReference(functionEClass, FUNCTION__OUTPUT);
		createEReference(functionEClass, FUNCTION__INTERNAL);
		createEReference(functionEClass, FUNCTION__REQUIREMENT);
		createEAttribute(functionEClass, FUNCTION__SAFETY);
		createEAttribute(functionEClass, FUNCTION__DEFINITION);

		variableTypeEClass = createEClass(VARIABLE_TYPE);

		issueEClass = createEClass(ISSUE);
		createEAttribute(issueEClass, ISSUE__DESCRIPTION);
		createEAttribute(issueEClass, ISSUE__CLOSED);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__SUB_FUNCTIONS);
		createEAttribute(featureEClass, FEATURE__DESCRIPTION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		t_RequirementNatureEEnum = createEEnum(TREQUIREMENT_NATURE);
		t_SystemEEnum = createEEnum(TSYSTEM);
		t_SourceDocumentEEnum = createEEnum(TSOURCE_DOCUMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableEClass.getESuperTypes().add(this.getNamedElement());
		requirementEClass.getESuperTypes().add(this.getNamedElement());
		functionEClass.getESuperTypes().add(this.getNamedElement());
		variableTypeEClass.getESuperTypes().add(this.getNamedElement());
		issueEClass.getESuperTypes().add(this.getNamedElement());
		featureEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Store(), this.getVariable(), null, "store", null, 0, 1, Variable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, IS_UNSETTABLE, !IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Constant(), ecorePackage.getEBoolean(), "constant", null, 1, 1, Variable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_MinimalValue(), ecorePackage.getEString(), "minimalValue", null, 0, 1,
			Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(getVariable_MaximalValue(), ecorePackage.getEString(), "maximalValue", null, 0, 1,
			Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(getVariable_SpecialValue(), ecorePackage.getEString(), "specialValue", null, 0, 1,
			Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
			IS_ORDERED);
		initEAttribute(getVariable_Resolution(), ecorePackage.getEString(), "resolution", null, 0, 1, Variable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_DefinitionRequirements(), this.getRequirement(), null, "definitionRequirements",
			null, 1, -1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Safety(), ecorePackage.getEBoolean(), "safety", null, 1, 1, Variable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Definition(), ecorePackage.getEString(), "definition", null, 1, 1, Variable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_Type(), this.getVariableType(), null, "type", null, 0, 1, Variable.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Nature(), this.getT_RequirementNature(), "nature", null, 1, 1, Requirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Source(), this.getT_SourceDocument(), "source", null, 1, 1, Requirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_SubRequirement(), this.getRequirement(), null, "subRequirement", null, 0, -1,
			Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Allocation(), this.getT_System(), "allocation", null, 1, 1, Requirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Safety(), ecorePackage.getEBoolean(), "safety", null, 1, 1, Requirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Definition(), ecorePackage.getEString(), "definition", null, 1, 1,
			Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Exported(), ecorePackage.getEBoolean(), "exported", "false", 1, 1,
			Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Issues(), this.getIssue(), null, "issues", null, 0, -1, Requirement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunction_SubFunction(), this.getFunction(), null, "subFunction", null, 0, -1, Function.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Allocation(), this.getT_System(), "allocation", null, 1, 1, Function.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Input(), this.getVariable(), null, "input", null, 0, -1, Function.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Output(), this.getVariable(), null, "output", null, 0, -1, Function.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Internal(), this.getVariable(), null, "internal", null, 0, -1, Function.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEReference(getFunction_Requirement(), this.getRequirement(), null, "requirement", null, 1, -1,
			Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
			!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Safety(), ecorePackage.getEBoolean(), "safety", null, 1, 1, Function.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunction_Definition(), ecorePackage.getEString(), "definition", null, 1, 1, Function.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableTypeEClass, VariableType.class, "VariableType", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);

		initEClass(issueEClass, Issue.class, "Issue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIssue_Description(), ecorePackage.getEString(), "description", null, 0, 1, Issue.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIssue_Closed(), ecorePackage.getEBoolean(), "closed", null, 0, 1, Issue.class, !IS_TRANSIENT,
			!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_SubFunctions(), this.getFunction(), null, "subFunctions", null, 0, 1, Feature.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
			!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFeature_Description(), ecorePackage.getEString(), "description", null, 0, 1, Feature.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE,
			IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
			!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(t_RequirementNatureEEnum, T_RequirementNature.class, "T_RequirementNature");
		addEEnumLiteral(t_RequirementNatureEEnum, T_RequirementNature.STRUCTURAL);
		addEEnumLiteral(t_RequirementNatureEEnum, T_RequirementNature.FUNCTIONAL);
		addEEnumLiteral(t_RequirementNatureEEnum, T_RequirementNature.DEFINITION);

		initEEnum(t_SystemEEnum, T_System.class, "T_System");
		addEEnumLiteral(t_SystemEEnum, T_System.KERNEL);
		addEEnumLiteral(t_SystemEEnum, T_System.DMI);
		addEEnumLiteral(t_SystemEEnum, T_System.RBC);

		initEEnum(t_SourceDocumentEEnum, T_SourceDocument.class, "T_SourceDocument");
		addEEnumLiteral(t_SourceDocumentEEnum, T_SourceDocument.SRS);
		addEEnumLiteral(t_SourceDocumentEEnum, T_SourceDocument.SYSTEM_ANALYSIS);

		// Create resource
		createResource(eNS_URI);
	}

} // DatadictionaryPackageImpl
