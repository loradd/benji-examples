/**
 */
package se.mdh.idt.benji.examples.refactorings.simplecore;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.Reference#getType <em>Type</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.simplecore.Reference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(se.mdh.idt.benji.examples.refactorings.simplecore.Class)
	 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getReference_Type()
	 * @model
	 * @generated
	 */
	se.mdh.idt.benji.examples.refactorings.simplecore.Class getType();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.simplecore.Reference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(se.mdh.idt.benji.examples.refactorings.simplecore.Class value);

	/**
	 * Returns the value of the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opposite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opposite</em>' reference.
	 * @see #setOpposite(Reference)
	 * @see se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage#getReference_Opposite()
	 * @model
	 * @generated
	 */
	Reference getOpposite();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.simplecore.Reference#getOpposite <em>Opposite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opposite</em>' reference.
	 * @see #getOpposite()
	 * @generated
	 */
	void setOpposite(Reference value);

} // Reference
