/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel;

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
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Package#getUri <em>Uri</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Package#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends Classifier {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getPackage_Uri()
	 * @model default="" unique="false" required="true"
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Package#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.metamodel.Classifier}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Classifier#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classifiers</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getPackage_Classifiers()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.Classifier#getPackage
	 * @model opposite="package" containment="true"
	 * @generated
	 */
	EList<Classifier> getClassifiers();

} // Package
