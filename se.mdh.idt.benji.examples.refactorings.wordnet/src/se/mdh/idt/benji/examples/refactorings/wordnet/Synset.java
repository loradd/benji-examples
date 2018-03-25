/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getGloss <em>Gloss</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getWords <em>Words</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyponyms <em>Hyponyms</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyperonyms <em>Hyperonyms</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getMeronyms <em>Meronyms</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHolonyms <em>Holonyms</em>}</li>
 * </ul>
 *
 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getSynset()
 * @model
 * @generated
 */
public interface Synset extends EObject {
	/**
	 * Returns the value of the '<em><b>Gloss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gloss</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gloss</em>' attribute.
	 * @see #setGloss(String)
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getSynset_Gloss()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getGloss();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getGloss <em>Gloss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gloss</em>' attribute.
	 * @see #getGloss()
	 * @generated
	 */
	void setGloss(String value);

	/**
	 * Returns the value of the '<em><b>Words</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word#getSynsets <em>Synsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Words</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Words</em>' reference.
	 * @see #setWords(Word)
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getSynset_Words()
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Word#getSynsets
	 * @model opposite="synsets" required="true"
	 * @generated
	 */
	Word getWords();

	/**
	 * Sets the value of the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getWords <em>Words</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Words</em>' reference.
	 * @see #getWords()
	 * @generated
	 */
	void setWords(Word value);

	/**
	 * Returns the value of the '<em><b>Hyponyms</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyperonyms <em>Hyperonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyponyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyponyms</em>' reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getSynset_Hyponyms()
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyperonyms
	 * @model opposite="hyperonyms"
	 * @generated
	 */
	EList<Synset> getHyponyms();

	/**
	 * Returns the value of the '<em><b>Hyperonyms</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyponyms <em>Hyponyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hyperonyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hyperonyms</em>' reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getSynset_Hyperonyms()
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyponyms
	 * @model opposite="hyponyms"
	 * @generated
	 */
	EList<Synset> getHyperonyms();

	/**
	 * Returns the value of the '<em><b>Meronyms</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHolonyms <em>Holonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meronyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meronyms</em>' reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getSynset_Meronyms()
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHolonyms
	 * @model opposite="holonyms"
	 * @generated
	 */
	EList<Synset> getMeronyms();

	/**
	 * Returns the value of the '<em><b>Holonyms</b></em>' reference list.
	 * The list contents are of type {@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset}.
	 * It is bidirectional and its opposite is '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getMeronyms <em>Meronyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holonyms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holonyms</em>' reference list.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage#getSynset_Holonyms()
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getMeronyms
	 * @model opposite="meronyms"
	 * @generated
	 */
	EList<Synset> getHolonyms();

} // Synset
