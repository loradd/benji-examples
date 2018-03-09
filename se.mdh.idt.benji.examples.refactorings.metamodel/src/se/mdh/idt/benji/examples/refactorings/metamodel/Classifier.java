/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.Classifier#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getClassifier()
 * @model abstract="true"
 * @generated
 */
public interface Classifier extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Package#getClassifiers <em>Classifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(se.mdh.idt.benji.examples.refactorings.metamodel.Package)
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getClassifier_Package()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.Package#getClassifiers
	 * @model opposite="classifiers" transient="false"
	 * @generated
	 */
	se.mdh.idt.benji.examples.refactorings.metamodel.Package getPackage();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Classifier#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(se.mdh.idt.benji.examples.refactorings.metamodel.Package value);

} // Classifier
