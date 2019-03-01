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
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.impl.PackageImpl#getSubpackages <em>Subpackages</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.impl.PackageImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.impl.PackageImpl#getDatatypes <em>Datatypes</em>}</li>
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
	 * The cached value of the '{@link #getSubpackages() <em>Subpackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpackages()
	 * @generated
	 * @ordered
	 */
	protected EList<se.mdh.idt.benji.examples.refactorings.simplecore.Package> subpackages;

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
	 * The cached value of the '{@link #getDatatypes() <em>Datatypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> datatypes;

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
	@Override
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<se.mdh.idt.benji.examples.refactorings.simplecore.Package> getSubpackages() {
		if (subpackages == null) {
			subpackages = new EObjectContainmentEList<se.mdh.idt.benji.examples.refactorings.simplecore.Package>(se.mdh.idt.benji.examples.refactorings.simplecore.Package.class, this, SimplecorePackage.PACKAGE__SUBPACKAGES);
		}
		return subpackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public EList<DataType> getDatatypes() {
		if (datatypes == null) {
			datatypes = new EObjectContainmentEList<DataType>(DataType.class, this, SimplecorePackage.PACKAGE__DATATYPES);
		}
		return datatypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimplecorePackage.PACKAGE__SUBPACKAGES:
				return ((InternalEList<?>)getSubpackages()).basicRemove(otherEnd, msgs);
			case SimplecorePackage.PACKAGE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case SimplecorePackage.PACKAGE__DATATYPES:
				return ((InternalEList<?>)getDatatypes()).basicRemove(otherEnd, msgs);
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
			case SimplecorePackage.PACKAGE__SUBPACKAGES:
				return getSubpackages();
			case SimplecorePackage.PACKAGE__CLASSES:
				return getClasses();
			case SimplecorePackage.PACKAGE__DATATYPES:
				return getDatatypes();
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
			case SimplecorePackage.PACKAGE__SUBPACKAGES:
				getSubpackages().clear();
				getSubpackages().addAll((Collection<? extends se.mdh.idt.benji.examples.refactorings.simplecore.Package>)newValue);
				return;
			case SimplecorePackage.PACKAGE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends se.mdh.idt.benji.examples.refactorings.simplecore.Class>)newValue);
				return;
			case SimplecorePackage.PACKAGE__DATATYPES:
				getDatatypes().clear();
				getDatatypes().addAll((Collection<? extends DataType>)newValue);
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
			case SimplecorePackage.PACKAGE__SUBPACKAGES:
				getSubpackages().clear();
				return;
			case SimplecorePackage.PACKAGE__CLASSES:
				getClasses().clear();
				return;
			case SimplecorePackage.PACKAGE__DATATYPES:
				getDatatypes().clear();
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
			case SimplecorePackage.PACKAGE__SUBPACKAGES:
				return subpackages != null && !subpackages.isEmpty();
			case SimplecorePackage.PACKAGE__CLASSES:
				return classes != null && !classes.isEmpty();
			case SimplecorePackage.PACKAGE__DATATYPES:
				return datatypes != null && !datatypes.isEmpty();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PackageImpl
