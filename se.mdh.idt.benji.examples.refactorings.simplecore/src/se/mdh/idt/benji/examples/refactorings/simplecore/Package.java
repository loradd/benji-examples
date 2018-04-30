/**
 */
package se.mdh.idt.benji.examples.refactorings.simplecore;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.Package#getUri <em>Uri</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.Package#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.Package#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getPackage_Uri()
	 * @model unique="false"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.simplecore.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.simplecore.Package}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getPackage_SubPackages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Package> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.simplecore.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.simplecore.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getPackage_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataType> getDataTypes();

} // Package
