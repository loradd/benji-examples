/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.impl.ClassImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.impl.ClassImpl#getSubClasses <em>Sub Classes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.impl.ClassImpl#getStructuralFeatures <em>Structural Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements se.mdh.idt.benji.examples.refactorings.metamodel.Class {
	/**
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected se.mdh.idt.benji.examples.refactorings.metamodel.Class superClass;

	/**
	 * The cached value of the '{@link #getSubClasses() <em>Sub Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> subClasses;

	/**
	 * The cached value of the '{@link #getStructuralFeatures() <em>Structural Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuralFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuralFeature> structuralFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(Boolean newAbstract) {
		Boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLASS__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public se.mdh.idt.benji.examples.refactorings.metamodel.Class getSuperClass() {
		if (superClass != null && superClass.eIsProxy()) {
			InternalEObject oldSuperClass = (InternalEObject)superClass;
			superClass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class)eResolveProxy(oldSuperClass);
			if (superClass != oldSuperClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLASS__SUPER_CLASS, oldSuperClass, superClass));
			}
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public se.mdh.idt.benji.examples.refactorings.metamodel.Class basicGetSuperClass() {
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperClass(se.mdh.idt.benji.examples.refactorings.metamodel.Class newSuperClass, NotificationChain msgs) {
		se.mdh.idt.benji.examples.refactorings.metamodel.Class oldSuperClass = superClass;
		superClass = newSuperClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLASS__SUPER_CLASS, oldSuperClass, newSuperClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperClass(se.mdh.idt.benji.examples.refactorings.metamodel.Class newSuperClass) {
		if (newSuperClass != superClass) {
			NotificationChain msgs = null;
			if (superClass != null)
				msgs = ((InternalEObject)superClass).eInverseRemove(this, MetamodelPackage.CLASS__SUB_CLASSES, se.mdh.idt.benji.examples.refactorings.metamodel.Class.class, msgs);
			if (newSuperClass != null)
				msgs = ((InternalEObject)newSuperClass).eInverseAdd(this, MetamodelPackage.CLASS__SUB_CLASSES, se.mdh.idt.benji.examples.refactorings.metamodel.Class.class, msgs);
			msgs = basicSetSuperClass(newSuperClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLASS__SUPER_CLASS, newSuperClass, newSuperClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getSubClasses() {
		if (subClasses == null) {
			subClasses = new EObjectWithInverseResolvingEList<se.mdh.idt.benji.examples.refactorings.metamodel.Class>(se.mdh.idt.benji.examples.refactorings.metamodel.Class.class, this, MetamodelPackage.CLASS__SUB_CLASSES, MetamodelPackage.CLASS__SUPER_CLASS);
		}
		return subClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> getStructuralFeatures() {
		if (structuralFeatures == null) {
			structuralFeatures = new EObjectContainmentWithInverseEList<StructuralFeature>(StructuralFeature.class, this, MetamodelPackage.CLASS__STRUCTURAL_FEATURES, MetamodelPackage.STRUCTURAL_FEATURE__OWNER);
		}
		return structuralFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.CLASS__SUPER_CLASS:
				if (superClass != null)
					msgs = ((InternalEObject)superClass).eInverseRemove(this, MetamodelPackage.CLASS__SUB_CLASSES, se.mdh.idt.benji.examples.refactorings.metamodel.Class.class, msgs);
				return basicSetSuperClass((se.mdh.idt.benji.examples.refactorings.metamodel.Class)otherEnd, msgs);
			case MetamodelPackage.CLASS__SUB_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubClasses()).basicAdd(otherEnd, msgs);
			case MetamodelPackage.CLASS__STRUCTURAL_FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStructuralFeatures()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.CLASS__SUPER_CLASS:
				return basicSetSuperClass(null, msgs);
			case MetamodelPackage.CLASS__SUB_CLASSES:
				return ((InternalEList<?>)getSubClasses()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.CLASS__STRUCTURAL_FEATURES:
				return ((InternalEList<?>)getStructuralFeatures()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case MetamodelPackage.CLASS__ABSTRACT:
				return getAbstract();
			case MetamodelPackage.CLASS__SUPER_CLASS:
				if (resolve) return getSuperClass();
				return basicGetSuperClass();
			case MetamodelPackage.CLASS__SUB_CLASSES:
				return getSubClasses();
			case MetamodelPackage.CLASS__STRUCTURAL_FEATURES:
				return getStructuralFeatures();
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
		switch (featureID) {
			case MetamodelPackage.CLASS__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case MetamodelPackage.CLASS__SUPER_CLASS:
				setSuperClass((se.mdh.idt.benji.examples.refactorings.metamodel.Class)newValue);
				return;
			case MetamodelPackage.CLASS__SUB_CLASSES:
				getSubClasses().clear();
				getSubClasses().addAll((Collection<? extends se.mdh.idt.benji.examples.refactorings.metamodel.Class>)newValue);
				return;
			case MetamodelPackage.CLASS__STRUCTURAL_FEATURES:
				getStructuralFeatures().clear();
				getStructuralFeatures().addAll((Collection<? extends StructuralFeature>)newValue);
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
		switch (featureID) {
			case MetamodelPackage.CLASS__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case MetamodelPackage.CLASS__SUPER_CLASS:
				setSuperClass((se.mdh.idt.benji.examples.refactorings.metamodel.Class)null);
				return;
			case MetamodelPackage.CLASS__SUB_CLASSES:
				getSubClasses().clear();
				return;
			case MetamodelPackage.CLASS__STRUCTURAL_FEATURES:
				getStructuralFeatures().clear();
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
		switch (featureID) {
			case MetamodelPackage.CLASS__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case MetamodelPackage.CLASS__SUPER_CLASS:
				return superClass != null;
			case MetamodelPackage.CLASS__SUB_CLASSES:
				return subClasses != null && !subClasses.isEmpty();
			case MetamodelPackage.CLASS__STRUCTURAL_FEATURES:
				return structuralFeatures != null && !structuralFeatures.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
