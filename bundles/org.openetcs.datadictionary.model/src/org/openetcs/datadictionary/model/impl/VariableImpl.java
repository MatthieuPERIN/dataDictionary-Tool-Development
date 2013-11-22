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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.openetcs.datadictionary.model.DatadictionaryPackage;
import org.openetcs.datadictionary.model.Requirement;
import org.openetcs.datadictionary.model.Variable;
import org.openetcs.datadictionary.model.VariableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getStore <em>Store</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#isConstant <em>Constant</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getMinimalValue <em>Minimal Value</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getMaximalValue <em>Maximal Value</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getSpecialValue <em>Special Value</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getDefinitionRequirements <em>Definition Requirements</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#isSafety <em>Safety</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.openetcs.datadictionary.model.impl.VariableImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends NamedElementImpl implements Variable {
	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected Variable store;

	/**
	 * This is true if the Store containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storeESet;

	/**
	 * The default value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstant() <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean constant = CONSTANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimalValue() <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MINIMAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimalValue() <em>Minimal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimalValue()
	 * @generated
	 * @ordered
	 */
	protected String minimalValue = MINIMAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Minimal Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minimalValueESet;

	/**
	 * The default value of the '{@link #getMaximalValue() <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalValue()
	 * @generated
	 * @ordered
	 */
	protected static final String MAXIMAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximalValue() <em>Maximal Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximalValue()
	 * @generated
	 * @ordered
	 */
	protected String maximalValue = MAXIMAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Maximal Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maximalValueESet;

	/**
	 * The default value of the '{@link #getSpecialValue() <em>Special Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialValue()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIAL_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecialValue() <em>Special Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialValue()
	 * @generated
	 * @ordered
	 */
	protected String specialValue = SPECIAL_VALUE_EDEFAULT;

	/**
	 * This is true if the Special Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean specialValueESet;

	/**
	 * The default value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected String resolution = RESOLUTION_EDEFAULT;

	/**
	 * This is true if the Resolution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolutionESet;

	/**
	 * The cached value of the '{@link #getDefinitionRequirements() <em>Definition Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> definitionRequirements;

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
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected VariableType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DatadictionaryPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable getStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStore(Variable newStore, NotificationChain msgs) {
		Variable oldStore = store;
		store = newStore;
		boolean oldStoreESet = storeESet;
		storeESet = true;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
				DatadictionaryPackage.VARIABLE__STORE, oldStore, newStore, !oldStoreESet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStore(Variable newStore) {
		if (newStore != store)
		{
			NotificationChain msgs = null;
			if (store != null)
				msgs = ((InternalEObject) store).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
					- DatadictionaryPackage.VARIABLE__STORE, null, msgs);
			if (newStore != null)
				msgs = ((InternalEObject) newStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE
					- DatadictionaryPackage.VARIABLE__STORE, null, msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else
		{
			boolean oldStoreESet = storeESet;
			storeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__STORE, newStore,
					newStore, !oldStoreESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetStore(NotificationChain msgs) {
		Variable oldStore = store;
		store = null;
		boolean oldStoreESet = storeESet;
		storeESet = false;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET,
				DatadictionaryPackage.VARIABLE__STORE, oldStore, null, oldStoreESet);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStore() {
		if (store != null)
		{
			NotificationChain msgs = null;
			msgs = ((InternalEObject) store).eInverseRemove(this, EOPPOSITE_FEATURE_BASE
				- DatadictionaryPackage.VARIABLE__STORE, null, msgs);
			msgs = basicUnsetStore(msgs);
			if (msgs != null)
				msgs.dispatch();
		}
		else
		{
			boolean oldStoreESet = storeESet;
			storeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, DatadictionaryPackage.VARIABLE__STORE, null,
					null, oldStoreESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStore() {
		return storeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isConstant() {
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstant(boolean newConstant) {
		boolean oldConstant = constant;
		constant = newConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__CONSTANT,
				oldConstant, constant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMinimalValue() {
		return minimalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimalValue(String newMinimalValue) {
		String oldMinimalValue = minimalValue;
		minimalValue = newMinimalValue;
		boolean oldMinimalValueESet = minimalValueESet;
		minimalValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__MINIMAL_VALUE,
				oldMinimalValue, minimalValue, !oldMinimalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMinimalValue() {
		String oldMinimalValue = minimalValue;
		boolean oldMinimalValueESet = minimalValueESet;
		minimalValue = MINIMAL_VALUE_EDEFAULT;
		minimalValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatadictionaryPackage.VARIABLE__MINIMAL_VALUE,
				oldMinimalValue, MINIMAL_VALUE_EDEFAULT, oldMinimalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMinimalValue() {
		return minimalValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMaximalValue() {
		return maximalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximalValue(String newMaximalValue) {
		String oldMaximalValue = maximalValue;
		maximalValue = newMaximalValue;
		boolean oldMaximalValueESet = maximalValueESet;
		maximalValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__MAXIMAL_VALUE,
				oldMaximalValue, maximalValue, !oldMaximalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetMaximalValue() {
		String oldMaximalValue = maximalValue;
		boolean oldMaximalValueESet = maximalValueESet;
		maximalValue = MAXIMAL_VALUE_EDEFAULT;
		maximalValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatadictionaryPackage.VARIABLE__MAXIMAL_VALUE,
				oldMaximalValue, MAXIMAL_VALUE_EDEFAULT, oldMaximalValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetMaximalValue() {
		return maximalValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSpecialValue() {
		return specialValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialValue(String newSpecialValue) {
		String oldSpecialValue = specialValue;
		specialValue = newSpecialValue;
		boolean oldSpecialValueESet = specialValueESet;
		specialValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__SPECIAL_VALUE,
				oldSpecialValue, specialValue, !oldSpecialValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSpecialValue() {
		String oldSpecialValue = specialValue;
		boolean oldSpecialValueESet = specialValueESet;
		specialValue = SPECIAL_VALUE_EDEFAULT;
		specialValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatadictionaryPackage.VARIABLE__SPECIAL_VALUE,
				oldSpecialValue, SPECIAL_VALUE_EDEFAULT, oldSpecialValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSpecialValue() {
		return specialValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getResolution() {
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolution(String newResolution) {
		String oldResolution = resolution;
		resolution = newResolution;
		boolean oldResolutionESet = resolutionESet;
		resolutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__RESOLUTION,
				oldResolution, resolution, !oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResolution() {
		String oldResolution = resolution;
		boolean oldResolutionESet = resolutionESet;
		resolution = RESOLUTION_EDEFAULT;
		resolutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DatadictionaryPackage.VARIABLE__RESOLUTION,
				oldResolution, RESOLUTION_EDEFAULT, oldResolutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResolution() {
		return resolutionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Requirement> getDefinitionRequirements() {
		if (definitionRequirements == null)
		{
			definitionRequirements = new EObjectResolvingEList<Requirement>(Requirement.class, this,
				DatadictionaryPackage.VARIABLE__DEFINITION_REQUIREMENTS);
		}
		return definitionRequirements;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__SAFETY, oldSafety,
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
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__DEFINITION,
				oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableType getType() {
		if (type != null && type.eIsProxy())
		{
			InternalEObject oldType = (InternalEObject) type;
			type = (VariableType) eResolveProxy(oldType);
			if (type != oldType)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DatadictionaryPackage.VARIABLE__TYPE,
						oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(VariableType newType) {
		VariableType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DatadictionaryPackage.VARIABLE__TYPE, oldType, type));
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
		case DatadictionaryPackage.VARIABLE__STORE:
			return basicUnsetStore(msgs);
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
		case DatadictionaryPackage.VARIABLE__STORE:
			return getStore();
		case DatadictionaryPackage.VARIABLE__CONSTANT:
			return isConstant();
		case DatadictionaryPackage.VARIABLE__MINIMAL_VALUE:
			return getMinimalValue();
		case DatadictionaryPackage.VARIABLE__MAXIMAL_VALUE:
			return getMaximalValue();
		case DatadictionaryPackage.VARIABLE__SPECIAL_VALUE:
			return getSpecialValue();
		case DatadictionaryPackage.VARIABLE__RESOLUTION:
			return getResolution();
		case DatadictionaryPackage.VARIABLE__DEFINITION_REQUIREMENTS:
			return getDefinitionRequirements();
		case DatadictionaryPackage.VARIABLE__SAFETY:
			return isSafety();
		case DatadictionaryPackage.VARIABLE__DEFINITION:
			return getDefinition();
		case DatadictionaryPackage.VARIABLE__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
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
		case DatadictionaryPackage.VARIABLE__STORE:
			setStore((Variable) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__CONSTANT:
			setConstant((Boolean) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__MINIMAL_VALUE:
			setMinimalValue((String) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__MAXIMAL_VALUE:
			setMaximalValue((String) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__SPECIAL_VALUE:
			setSpecialValue((String) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__RESOLUTION:
			setResolution((String) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__DEFINITION_REQUIREMENTS:
			getDefinitionRequirements().clear();
			getDefinitionRequirements().addAll((Collection<? extends Requirement>) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__SAFETY:
			setSafety((Boolean) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__DEFINITION:
			setDefinition((String) newValue);
			return;
		case DatadictionaryPackage.VARIABLE__TYPE:
			setType((VariableType) newValue);
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
		case DatadictionaryPackage.VARIABLE__STORE:
			unsetStore();
			return;
		case DatadictionaryPackage.VARIABLE__CONSTANT:
			setConstant(CONSTANT_EDEFAULT);
			return;
		case DatadictionaryPackage.VARIABLE__MINIMAL_VALUE:
			unsetMinimalValue();
			return;
		case DatadictionaryPackage.VARIABLE__MAXIMAL_VALUE:
			unsetMaximalValue();
			return;
		case DatadictionaryPackage.VARIABLE__SPECIAL_VALUE:
			unsetSpecialValue();
			return;
		case DatadictionaryPackage.VARIABLE__RESOLUTION:
			unsetResolution();
			return;
		case DatadictionaryPackage.VARIABLE__DEFINITION_REQUIREMENTS:
			getDefinitionRequirements().clear();
			return;
		case DatadictionaryPackage.VARIABLE__SAFETY:
			setSafety(SAFETY_EDEFAULT);
			return;
		case DatadictionaryPackage.VARIABLE__DEFINITION:
			setDefinition(DEFINITION_EDEFAULT);
			return;
		case DatadictionaryPackage.VARIABLE__TYPE:
			setType((VariableType) null);
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
		case DatadictionaryPackage.VARIABLE__STORE:
			return isSetStore();
		case DatadictionaryPackage.VARIABLE__CONSTANT:
			return constant != CONSTANT_EDEFAULT;
		case DatadictionaryPackage.VARIABLE__MINIMAL_VALUE:
			return isSetMinimalValue();
		case DatadictionaryPackage.VARIABLE__MAXIMAL_VALUE:
			return isSetMaximalValue();
		case DatadictionaryPackage.VARIABLE__SPECIAL_VALUE:
			return isSetSpecialValue();
		case DatadictionaryPackage.VARIABLE__RESOLUTION:
			return isSetResolution();
		case DatadictionaryPackage.VARIABLE__DEFINITION_REQUIREMENTS:
			return definitionRequirements != null && !definitionRequirements.isEmpty();
		case DatadictionaryPackage.VARIABLE__SAFETY:
			return safety != SAFETY_EDEFAULT;
		case DatadictionaryPackage.VARIABLE__DEFINITION:
			return DEFINITION_EDEFAULT == null ? definition != null : !DEFINITION_EDEFAULT.equals(definition);
		case DatadictionaryPackage.VARIABLE__TYPE:
			return type != null;
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
		result.append(" (constant: ");
		result.append(constant);
		result.append(", minimalValue: ");
		if (minimalValueESet)
			result.append(minimalValue);
		else
			result.append("<unset>");
		result.append(", maximalValue: ");
		if (maximalValueESet)
			result.append(maximalValue);
		else
			result.append("<unset>");
		result.append(", specialValue: ");
		if (specialValueESet)
			result.append(specialValue);
		else
			result.append("<unset>");
		result.append(", resolution: ");
		if (resolutionESet)
			result.append(resolution);
		else
			result.append("<unset>");
		result.append(", safety: ");
		result.append(safety);
		result.append(", definition: ");
		result.append(definition);
		result.append(')');
		return result.toString();
	}

} // VariableImpl
