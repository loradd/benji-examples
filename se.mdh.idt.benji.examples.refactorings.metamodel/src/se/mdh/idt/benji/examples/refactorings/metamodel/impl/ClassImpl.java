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
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.impl.ClassImpl#getSuperClasses <em>Super Classes</em>}</li>
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
	 * The cached value of the '{@link #getSuperClasses() <em>Super Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> superClasses;

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
	public EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getSuperClasses() {
		if (superClasses == null) {
			superClasses = new EObjectWithInverseResolvingEList.ManyInverse<se.mdh.idt.benji.examples.refactorings.metamodel.Class>(se.mdh.idt.benji.examples.refactorings.metamodel.Class.class, this, MetamodelPackage.CLASS__SUPER_CLASSES, MetamodelPackage.CLASS__SUB_CLASSES);
		}
		return superClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getSubClasses() {
		if (subClasses == null) {
			subClasses = new EObjectWithInverseResolvingEList.ManyInverse<se.mdh.idt.benji.examples.refactorings.metamodel.Class>(se.mdh.idt.benji.examples.refactorings.metamodel.Class.class, this, MetamodelPackage.CLASS__SUB_CLASSES, MetamodelPackage.CLASS__SUPER_CLASSES);
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
			case MetamodelPackage.CLASS__SUPER_CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuperClasses()).basicAdd(otherEnd, msgs);
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
			case MetamodelPackage.CLASS__SUPER_CLASSES:
				return ((InternalEList<?>)getSuperClasses()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.CLASS__SUPER_CLASSES:
				return getSuperClasses();
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
			case MetamodelPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends se.mdh.idt.benji.examples.refactorings.metamodel.Class>)newValue);
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
			case MetamodelPackage.CLASS__SUPER_CLASSES:
				getSuperClasses().clear();
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
			case MetamodelPackage.CLASS__SUPER_CLASSES:
				return superClasses != null && !superClasses.isEmpty();
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
