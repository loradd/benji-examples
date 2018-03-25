/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Enumeration Literals</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Literals</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getEnumeration_EnumerationLiterals()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getEnumerationLiterals();

} // Enumeration
