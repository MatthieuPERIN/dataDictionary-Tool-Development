/**
 */
package org.openetcs.datadictionary.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.openetcs.datadictionary.model.DatadictionaryPackage;
import org.openetcs.datadictionary.model.Issue;
import org.openetcs.datadictionary.model.Requirement;
import org.openetcs.datadictionary.model.T_RequirementNature;
import org.openetcs.datadictionary.model.T_SourceDocument;
import org.openetcs.datadictionary.model.T_System;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#getSubRequirement <em>Sub Requirement</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#getAllocation <em>Allocation</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#isSafety <em>Safety</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#isExported <em>Exported</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.RequirementImpl#getIssues <em>Issues</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends NamedElementImpl implements Requirement {
	/**
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final T_RequirementNature NATURE_EDEFAULT = T_RequirementNature.STRUCTURAL;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected T_RequirementNature nature = NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final T_SourceDocument SOURCE_EDEFAULT = T_SourceDocument.SRS;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected T_SourceDocument source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubRequirement() <em>Sub Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> subRequirement;

	/**
	 * The default value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected static final T_System ALLOCATION_EDEFAULT = T_System.KERNEL;

	/**
	 * The cached value of the '{@link #getAllocation() <em>Allocation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocation()
	 * @generated
	 * @ordered
	 */
	protected T_System allocation = ALLOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isSafety() <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFETY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafety() <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety()
	 * @generated
	 * @ordered
	 */
	protected boolean safety = SAFETY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected String definition = DEFINITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isExported() <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExported()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXPORTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExported() <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExported()
	 * @generated
	 * @ordered
	 */
	protected boolean exported = EXPORTED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIssues() <em>Issues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssues()
	 * @generated
	 * @ordered
	 */
	protected EList<Issue> issues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatadictionaryPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T_RequirementNature getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNature(T_RequirementNature newNature) {
		T_RequirementNature oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.REQUIREMENT__NATURE, oldNature,
				nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T_SourceDocument getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(T_SourceDocument newSource) {
		T_SourceDocument oldSource = source;
		source = newSource == null ? SOURCE_EDEFAULT : newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.REQUIREMENT__SOURCE, oldSource,
				source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getSubRequirement() {
		if (subRequirement == null)
		{
			subRequirement = new EObjectContainmentEList<Requirement>(Requirement.class, this,
				DatadictionaryPackage.REQUIREMENT__SUB_REQUIREMENT);
		}
		return subRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public T_System getAllocation() {
		return allocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllocation(T_System newAllocation) {
		T_System oldAllocation = allocation;
		allocation = newAllocation == null ? ALLOCATION_EDEFAULT : newAllocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.REQUIREMENT__ALLOCATION,
				oldAllocation, allocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSafety() {
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSafety(boolean newSafety) {
		boolean oldSafety = safety;
		safety = newSafety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.REQUIREMENT__SAFETY, oldSafety,
				safety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinition(String newDefinition) {
		String oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.REQUIREMENT__DEFINITION,
				oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExported() {
		return exported;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExported(boolean newExported) {
		boolean oldExported = exported;
		exported = newExported;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.REQUIREMENT__EXPORTED,
				oldExported, exported));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Issue> getIssues() {
		if (issues == null)
		{
			issues = new EObjectContainmentEList<Issue>(Issue.class, this, DatadictionaryPackage.REQUIREMENT__ISSUES);
		}
		return issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
		case DatadictionaryPackage.REQUIREMENT__SUB_REQUIREMENT:
			return ((InternalEList<?>) getSubRequirement()).basicRemove(otherEnd, msgs);
		case DatadictionaryPackage.REQUIREMENT__ISSUES:
			return ((InternalEList<?>) getIssues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
		case DatadictionaryPackage.REQUIREMENT__NATURE:
			return getNature();
		case DatadictionaryPackage.REQUIREMENT__SOURCE:
			return getSource();
		case DatadictionaryPackage.REQUIREMENT__SUB_REQUIREMENT:
			return getSubRequirement();
		case DatadictionaryPackage.REQUIREMENT__ALLOCATION:
			return getAllocation();
		case DatadictionaryPackage.REQUIREMENT__SAFETY:
			return isSafety();
		case DatadictionaryPackage.REQUIREMENT__DEFINITION:
			return getDefinition();
		case DatadictionaryPackage.REQUIREMENT__EXPORTED:
			return isExported();
		case DatadictionaryPackage.REQUIREMENT__ISSUES:
			return getIssues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID)
		{
		case DatadictionaryPackage.REQUIREMENT__NATURE:
			setNature((T_RequirementNature) newValue);
			return;
		case DatadictionaryPackage.REQUIREMENT__SOURCE:
			setSource((T_SourceDocument) newValue);
			return;
		case DatadictionaryPackage.REQUIREMENT__SUB_REQUIREMENT:
			getSubRequirement().clear();
			getSubRequirement().addAll((Collection<? extends Requirement>) newValue);
			return;
		case DatadictionaryPackage.REQUIREMENT__ALLOCATION:
			setAllocation((T_System) newValue);
			return;
		case DatadictionaryPackage.REQUIREMENT__SAFETY:
			setSafety((Boolean) newValue);
			return;
		case DatadictionaryPackage.REQUIREMENT__DEFINITION:
			setDefinition((String) newValue);
			return;
		case DatadictionaryPackage.REQUIREMENT__EXPORTED:
			setExported((Boolean) newValue);
			return;
		case DatadictionaryPackage.REQUIREMENT__ISSUES:
			getIssues().clear();
			getIssues().addAll((Collection<? extends Issue>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID)
		{
		case DatadictionaryPackage.REQUIREMENT__NATURE:
			setNature(NATURE_EDEFAULT);
			return;
		case DatadictionaryPackage.REQUIREMENT__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case DatadictionaryPackage.REQUIREMENT__SUB_REQUIREMENT:
			getSubRequirement().clear();
			return;
		case DatadictionaryPackage.REQUIREMENT__ALLOCATION:
			setAllocation(ALLOCATION_EDEFAULT);
			return;
		case DatadictionaryPackage.REQUIREMENT__SAFETY:
			setSafety(SAFETY_EDEFAULT);
			return;
		case DatadictionaryPackage.REQUIREMENT__DEFINITION:
			setDefinition(DEFINITION_EDEFAULT);
			return;
		case DatadictionaryPackage.REQUIREMENT__EXPORTED:
			setExported(EXPORTED_EDEFAULT);
			return;
		case DatadictionaryPackage.REQUIREMENT__ISSUES:
			getIssues().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID)
		{
		case DatadictionaryPackage.REQUIREMENT__NATURE:
			return nature != NATURE_EDEFAULT;
		case DatadictionaryPackage.REQUIREMENT__SOURCE:
			return source != SOURCE_EDEFAULT;
		case DatadictionaryPackage.REQUIREMENT__SUB_REQUIREMENT:
			return subRequirement != null && !subRequirement.isEmpty();
		case DatadictionaryPackage.REQUIREMENT__ALLOCATION:
			return allocation != ALLOCATION_EDEFAULT;
		case DatadictionaryPackage.REQUIREMENT__SAFETY:
			return safety != SAFETY_EDEFAULT;
		case DatadictionaryPackage.REQUIREMENT__DEFINITION:
			return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
		case DatadictionaryPackage.REQUIREMENT__EXPORTED:
			return exported != EXPORTED_EDEFAULT;
		case DatadictionaryPackage.REQUIREMENT__ISSUES:
			return issues != null && !issues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (nature: ");
		result.append(nature);
		result.append(", source: ");
		result.append(source);
		result.append(", allocation: ");
		result.append(allocation);
		result.append(", safety: ");
		result.append(safety);
		result.append(", definition: ");
		result.append(definition);
		result.append(", exported: ");
		result.append(exported);
		result.append(')');
		return result.toString();
	}

} // RequirementImpl
