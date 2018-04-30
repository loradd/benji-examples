/**
 */
package se.mdh.idt.benji.examples.refactorings.simplecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * Source: "Metamodeling Languages and Metaprogrammable Tools" *
 * Authors : M.Emerson, S.Neema and J.Sztinpanovits            *
 * Description : Simplified Ecore Metamodel                    *
 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getNamedElement_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.simplecore.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedElement
