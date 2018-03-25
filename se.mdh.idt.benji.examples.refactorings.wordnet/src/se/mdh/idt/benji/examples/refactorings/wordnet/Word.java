/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Word</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word#getName <em>Name</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word#getSynsets <em>Synsets</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getWord()
 * @model
 * @generated
 */
public interface Word extends EObject {
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
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getWord_Name()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Synsets</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synsets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synsets</em>' reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getWord_Synsets()
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getWords
	 * @model opposite="words" required="true"
	 * @generated
	 */
	EList<Synset> getSynsets();

} // Word
