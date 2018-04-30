/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel name='WordNet' modelName='WordNet' modelDirectory='se.mdh.idt.benji.examples.refactorings.wordnet/src' basePackage='se.mdh.idt.benji.examples.refactorings'"
 * @generated
 */
public interface WordnetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wordnet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mdh.se/examples/refactorings/WordNet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wordnet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WordnetPackage eINSTANCE = se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordNetImpl <em>Word Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordNetImpl
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetPackageImpl#getWordNet()
	 * @generated
	 */
	int WORD_NET = 0;

	/**
	 * The feature id for the '<em><b>Synsets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_NET__SYNSETS = 0;

	/**
	 * The feature id for the '<em><b>Words</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_NET__WORDS = 1;

	/**
	 * The number of structural features of the '<em>Word Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_NET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Word Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl <em>Synset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetPackageImpl#getSynset()
	 * @generated
	 */
	int SYNSET = 1;

	/**
	 * The feature id for the '<em><b>Gloss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET__GLOSS = 0;

	/**
	 * The feature id for the '<em><b>Words</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET__WORDS = 1;

	/**
	 * The feature id for the '<em><b>Hyponyms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET__HYPONYMS = 2;

	/**
	 * The feature id for the '<em><b>Hyperonyms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET__HYPERONYMS = 3;

	/**
	 * The feature id for the '<em><b>Meronyms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET__MERONYMS = 4;

	/**
	 * The feature id for the '<em><b>Holonyms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET__HOLONYMS = 5;

	/**
	 * The number of structural features of the '<em>Synset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Synset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordImpl <em>Word</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordImpl
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetPackageImpl#getWord()
	 * @generated
	 */
	int WORD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Synsets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD__SYNSETS = 1;

	/**
	 * The number of structural features of the '<em>Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Word</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link se.mdh.idt.benji.examples.refactorings.wordnet.WordNet <em>Word Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word Net</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordNet
	 * @generated
	 */
	EClass getWordNet();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.WordNet#getSynsets <em>Synsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synsets</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordNet#getSynsets()
	 * @see #getWordNet()
	 * @generated
	 */
	EReference getWordNet_Synsets();

	/**
	 * Returns the meta object for the containment reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.WordNet#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Words</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordNet#getWords()
	 * @see #getWordNet()
	 * @generated
	 */
	EReference getWordNet_Words();

	/**
	 * Returns the meta object for class '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset <em>Synset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synset</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset
	 * @generated
	 */
	EClass getSynset();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getGloss <em>Gloss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gloss</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getGloss()
	 * @see #getSynset()
	 * @generated
	 */
	EAttribute getSynset_Gloss();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getWords <em>Words</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Words</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getWords()
	 * @see #getSynset()
	 * @generated
	 */
	EReference getSynset_Words();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyponyms <em>Hyponyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hyponyms</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyponyms()
	 * @see #getSynset()
	 * @generated
	 */
	EReference getSynset_Hyponyms();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyperonyms <em>Hyperonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Hyperonyms</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHyperonyms()
	 * @see #getSynset()
	 * @generated
	 */
	EReference getSynset_Hyperonyms();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getMeronyms <em>Meronyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Meronyms</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getMeronyms()
	 * @see #getSynset()
	 * @generated
	 */
	EReference getSynset_Meronyms();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHolonyms <em>Holonyms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Holonyms</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset#getHolonyms()
	 * @see #getSynset()
	 * @generated
	 */
	EReference getSynset_Holonyms();

	/**
	 * Returns the meta object for class '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Word</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Word
	 * @generated
	 */
	EClass getWord();

	/**
	 * Returns the meta object for the attribute '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Word#getName()
	 * @see #getWord()
	 * @generated
	 */
	EAttribute getWord_Name();

	/**
	 * Returns the meta object for the reference list '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word#getSynsets <em>Synsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synsets</em>'.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Word#getSynsets()
	 * @see #getWord()
	 * @generated
	 */
	EReference getWord_Synsets();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WordnetFactory getWordnetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordNetImpl <em>Word Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordNetImpl
		 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetPackageImpl#getWordNet()
		 * @generated
		 */
		EClass WORD_NET = eINSTANCE.getWordNet();

		/**
		 * The meta object literal for the '<em><b>Synsets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD_NET__SYNSETS = eINSTANCE.getWordNet_Synsets();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD_NET__WORDS = eINSTANCE.getWordNet_Words();

		/**
		 * The meta object literal for the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl <em>Synset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl
		 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetPackageImpl#getSynset()
		 * @generated
		 */
		EClass SYNSET = eINSTANCE.getSynset();

		/**
		 * The meta object literal for the '<em><b>Gloss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNSET__GLOSS = eINSTANCE.getSynset_Gloss();

		/**
		 * The meta object literal for the '<em><b>Words</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNSET__WORDS = eINSTANCE.getSynset_Words();

		/**
		 * The meta object literal for the '<em><b>Hyponyms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNSET__HYPONYMS = eINSTANCE.getSynset_Hyponyms();

		/**
		 * The meta object literal for the '<em><b>Hyperonyms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNSET__HYPERONYMS = eINSTANCE.getSynset_Hyperonyms();

		/**
		 * The meta object literal for the '<em><b>Meronyms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNSET__MERONYMS = eINSTANCE.getSynset_Meronyms();

		/**
		 * The meta object literal for the '<em><b>Holonyms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNSET__HOLONYMS = eINSTANCE.getSynset_Holonyms();

		/**
		 * The meta object literal for the '{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordImpl <em>Word</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordImpl
		 * @see se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordnetPackageImpl#getWord()
		 * @generated
		 */
		EClass WORD = eINSTANCE.getWord();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORD__NAME = eINSTANCE.getWord_Name();

		/**
		 * The meta object literal for the '<em><b>Synsets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORD__SYNSETS = eINSTANCE.getWord_Synsets();

	}

} //WordnetPackage
