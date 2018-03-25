/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage
 * @generated
 */
public interface WordnetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WordnetFactory eINSTANCE = se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Synset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Synset</em>'.
	 * @generated
	 */
	Synset createSynset();

	/**
	 * Returns a new object of class '<em>Word</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Word</em>'.
	 * @generated
	 */
	Word createWord();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WordnetPackage getWordnetPackage();

} //WordnetFactory
