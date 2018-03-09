/**
 */
package se.mdh.idt.benji.examples.refactorings.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structural Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getOwner <em>Owner</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getLower <em>Lower</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getStructuralFeature()
 * @model abstract="true"
 * @generated
 */
public interface StructuralFeature extends ModelElement {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.metamodel.Class#getStructuralFeatures <em>Structural Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(se.mdh.idt.benji.examples.refactorings.metamodel.Class)
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getStructuralFeature_Owner()
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.Class#getStructuralFeatures
	 * @model opposite="structuralFeatures" required="true" transient="false"
	 * @generated
	 */
	se.mdh.idt.benji.examples.refactorings.metamodel.Class getOwner();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(se.mdh.idt.benji.examples.refactorings.metamodel.Class value);

	/**
	 * Returns the value of the '<em><b>Lower</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower</em>' attribute.
	 * @see #setLower(Integer)
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getStructuralFeature_Lower()
	 * @model default="0" unique="false" required="true"
	 * @generated
	 */
	Integer getLower();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getLower <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower</em>' attribute.
	 * @see #getLower()
	 * @generated
	 */
	void setLower(Integer value);

	/**
	 * Returns the value of the '<em><b>Upper</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper</em>' attribute.
	 * @see #setUpper(Integer)
	 * @see se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage#getStructuralFeature_Upper()
	 * @model default="-1" unique="false" required="true"
	 * @generated
	 */
	Integer getUpper();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature#getUpper <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper</em>' attribute.
	 * @see #getUpper()
	 * @generated
	 */
	void setUpper(Integer value);

} // StructuralFeature
