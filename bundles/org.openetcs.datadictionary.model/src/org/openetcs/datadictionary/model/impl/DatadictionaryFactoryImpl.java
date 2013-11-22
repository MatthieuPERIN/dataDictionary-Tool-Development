/**
 */
package org.openetcs.datadictionary.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DatadictionaryFactoryImpl extends EFactoryImpl implements DatadictionaryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DatadictionaryFactory init() {
		try
		{
			DatadictionaryFactory theDatadictionaryFactory = (DatadictionaryFactory) EPackage.Registry.INSTANCE
				.getEFactory("http://openetcs.org/datadictionary/model");
			if (theDatadictionaryFactory != null)
			{
				return theDatadictionaryFactory;
			}
		} catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DatadictionaryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatadictionaryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID())
		{
		case DatadictionaryPackage.VARIABLE:
			return createVariable();
		case DatadictionaryPackage.REQUIREMENT:
			return createRequirement();
		case DatadictionaryPackage.FUNCTION:
			return createFunction();
		case DatadictionaryPackage.VARIABLE_TYPE:
			return createVariableType();
		case DatadictionaryPackage.ISSUE:
			return createIssue();
		case DatadictionaryPackage.FEATURE:
			return createFeature();
		case DatadictionaryPackage.NAMED_ELEMENT:
			return createNamedElement();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID())
		{
		case DatadictionaryPackage.TREQUIREMENT_NATURE:
			return createT_RequirementNatureFromString(eDataType, initialValue);
		case DatadictionaryPackage.TSYSTEM:
			return createT_SystemFromString(eDataType, initialValue);
		case DatadictionaryPackage.TSOURCE_DOCUMENT:
			return createT_SourceDocumentFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID())
		{
		case DatadictionaryPackage.TREQUIREMENT_NATURE:
			return convertT_RequirementNatureToString(eDataType, instanceValue);
		case DatadictionaryPackage.TSYSTEM:
			return convertT_SystemToString(eDataType, instanceValue);
		case DatadictionaryPackage.TSOURCE_DOCUMENT:
			return convertT_SourceDocumentToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Issue createIssue() {
		IssueImpl issue = new IssueImpl();
		return issue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature createFeature() {
		FeatureImpl feature = new FeatureImpl();
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_RequirementNature createT_RequirementNatureFromString(EDataType eDataType, String initialValue) {
		T_RequirementNature result = T_RequirementNature.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertT_RequirementNatureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_System createT_SystemFromString(EDataType eDataType, String initialValue) {
		T_System result = T_System.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertT_SystemToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T_SourceDocument createT_SourceDocumentFromString(EDataType eDataType, String initialValue) {
		T_SourceDocument result = T_SourceDocument.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '"
				+ eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertT_SourceDocumentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DatadictionaryPackage getDatadictionaryPackage() {
		return (DatadictionaryPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DatadictionaryPackage getPackage() {
		return DatadictionaryPackage.eINSTANCE;
	}

} // DatadictionaryFactoryImpl
