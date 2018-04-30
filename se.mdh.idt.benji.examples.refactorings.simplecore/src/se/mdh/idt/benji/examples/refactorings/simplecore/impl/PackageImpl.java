/**
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.idt.benji.examples.refactorings.simplecore.DataType;
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.impl.PackageImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.impl.PackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.impl.PackageImpl#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamedElementImpl implements se.mdh.idt.benji.examples.refactorings.simplecore.Package {
	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<se.mdh.idt.benji.examples.refactorings.simplecore.Package> subPackages;

	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> classes;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> dataTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplecorePackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimplecorePackage.PACKAGE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<se.mdh.idt.benji.examples.refactorings.simplecore.Package> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectContainmentEList<se.mdh.idt.benji.examples.refactorings.simplecore.Package>(se.mdh.idt.benji.examples.refactorings.simplecore.Package.class, this, SimplecorePackage.PACKAGE__SUB_PACKAGES);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<se.mdh.idt.benji.examples.refactorings.simplecore.Class>(se.mdh.idt.benji.examples.refactorings.simplecore.Class.class, this, SimplecorePackage.PACKAGE__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getDataTypes() {
		if (dataTypes == null) {
			dataTypes = new EObjectContainmentEList<DataType>(DataType.class, this, SimplecorePackage.PACKAGE__DATA_TYPES);
		}
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplecorePackage.PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
			case SimplecorePackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case SimplecorePackage.PACKAGE__DATA_TYPES:
				return ((InternalEList<?>)getDataTypes()).basicRemove(otherEnd, msgs);
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
			case SimplecorePackage.PACKAGE__URI:
				return getUri();
			case SimplecorePackage.PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case SimplecorePackage.PACKAGE__CLASSES:
				return getClasses();
			case SimplecorePackage.PACKAGE__DATA_TYPES:
				return getDataTypes();
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
			case SimplecorePackage.PACKAGE__URI:
				setUri((String)newValue);
				return;
			case SimplecorePackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends se.mdh.idt.benji.examples.refactorings.simplecore.Package>)newValue);
				return;
			case SimplecorePackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends se.mdh.idt.benji.examples.refactorings.simplecore.Class>)newValue);
				return;
			case SimplecorePackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
				getDataTypes().addAll((Collection<? extends DataType>)newValue);
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
			case SimplecorePackage.PACKAGE__URI:
				setUri(URI_EDEFAULT);
				return;
			case SimplecorePackage.PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case SimplecorePackage.PACKAGE__CLASSES:
				getClasses().clear();
				return;
			case SimplecorePackage.PACKAGE__DATA_TYPES:
				getDataTypes().clear();
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
			case SimplecorePackage.PACKAGE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case SimplecorePackage.PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
			case SimplecorePackage.PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case SimplecorePackage.PACKAGE__DATA_TYPES:
				return dataTypes != null && !dataTypes.isEmpty();
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
