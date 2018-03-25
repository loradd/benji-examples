/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.impl.EnumerationImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationImpl extends DataTypeImpl implements Enumeration {
	/**
	 * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerationLiterals()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumerationLiteral> enumerationLiterals;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumerationLiteral> getEnumerationLiterals() {
		if (enumerationLiterals == null) {
			enumerationLiterals = new EObjectContainmentWithInverseEList<EnumerationLiteral>(EnumerationLiteral.class, this, MetamodelPackage.ENUMERATION__ENUMERATION_LITERALS, MetamodelPackage.ENUMERATION_LITERAL__ENUMERATION);
		}
		return enumerationLiterals;
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
			case MetamodelPackage.ENUMERATION__ENUMERATION_LITERALS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEnumerationLiterals()).basicAdd(otherEnd, msgs);
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
			case MetamodelPackage.ENUMERATION__ENUMERATION_LITERALS:
				return ((InternalEList<?>)getEnumerationLiterals()).basicRemove(otherEnd, msgs);
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
			case MetamodelPackage.ENUMERATION__ENUMERATION_LITERALS:
				return getEnumerationLiterals();
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
			case MetamodelPackage.ENUMERATION__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
				getEnumerationLiterals().addAll((Collection<? extends EnumerationLiteral>)newValue);
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
			case MetamodelPackage.ENUMERATION__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
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
			case MetamodelPackage.ENUMERATION__ENUMERATION_LITERALS:
				return enumerationLiterals != null && !enumerationLiterals.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EnumerationImpl
