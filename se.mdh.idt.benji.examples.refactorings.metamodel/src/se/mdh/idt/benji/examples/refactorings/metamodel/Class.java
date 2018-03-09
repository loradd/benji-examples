/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getSuperClasses <em>Super Classes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getSubClasses <em>Sub Classes</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getStructuralFeatures <em>Structural Features</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(Boolean)
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getClass_Abstract()
	 * @model default="false" unique="false" required="true"
	 * @generated
	 */
	Boolean getAbstract();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(Boolean value);

	/**
	 * Returns the value of the '<em><b>Super Classes</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.metamodel.Class}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getSubClasses <em>Sub Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Classes</em>' reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getClass_SuperClasses()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.Class#getSubClasses
	 * @model opposite="subClasses"
	 * @generated
	 */
	EList<Class> getSuperClasses();

	/**
	 * Returns the value of the '<em><b>Sub Classes</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.metamodel.Class}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getSuperClasses <em>Super Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Classes</em>' reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getClass_SubClasses()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.Class#getSuperClasses
	 * @model opposite="superClasses"
	 * @generated
	 */
	EList<Class> getSubClasses();

	/**
	 * Returns the value of the '<em><b>Structural Features</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Structural Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Structural Features</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getClass_StructuralFeatures()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<StructuralFeature> getStructuralFeatures();

} // Class
