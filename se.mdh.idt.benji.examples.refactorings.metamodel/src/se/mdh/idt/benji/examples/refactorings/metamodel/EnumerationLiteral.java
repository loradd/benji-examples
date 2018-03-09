/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral#getEnumeration <em>Enumeration</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getEnumerationLiteral()
 * @model
 * @generated
 */
public interface EnumerationLiteral extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Enumeration</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration</em>' container reference.
	 * @see #setEnumeration(Enumeration)
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getEnumerationLiteral_Enumeration()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration#getLiterals
	 * @model opposite="literals" required="true" transient="false"
	 * @generated
	 */
	Enumeration getEnumeration();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral#getEnumeration <em>Enumeration</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration</em>' container reference.
	 * @see #getEnumeration()
	 * @generated
	 */
	void setEnumeration(Enumeration value);

} // EnumerationLiteral
