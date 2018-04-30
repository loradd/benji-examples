/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Word Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.WordNet#getSynsets <em>Synsets</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.WordNet#getWords <em>Words</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getWordNet()
 * @model
 * @generated
 */
public interface WordNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Synsets</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synsets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synsets</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getWordNet_Synsets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Synset> getSynsets();

	/**
	 * Returns the value of the '<em><b>Words</b></em>' containment reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.wordnet.Word}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' containment reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getWordNet_Words()
	 * @model containment="true"
	 * @generated
	 */
	EList<Word> getWords();

} // WordNet
