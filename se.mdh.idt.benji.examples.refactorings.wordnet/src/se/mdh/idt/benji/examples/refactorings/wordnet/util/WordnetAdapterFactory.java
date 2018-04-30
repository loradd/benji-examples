/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.mdh.idt.benji.examples.refactorings.wordnet.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage
 * @generated
 */
public class WordnetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WordnetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WordnetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WordnetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WordnetSwitch<Adapter> modelSwitch =
		new WordnetSwitch<Adapter>() {
			@Override
			public Adapter caseWordNet(WordNet object) {
				return createWordNetAdapter();
			}
			@Override
			public Adapter caseSynset(Synset object) {
				return createSynsetAdapter();
			}
			@Override
			public Adapter caseWord(Word object) {
				return createWordAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.idt.benji.examples.refactorings.wordnet.WordNet <em>Word Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.WordNet
	 * @generated
	 */
	public Adapter createWordNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Synset <em>Synset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Synset
	 * @generated
	 */
	public Adapter createSynsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.mdh.idt.benji.examples.refactorings.wordnet.Word <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.mdh.idt.benji.examples.refactorings.wordnet.Word
	 * @generated
	 */
	public Adapter createWordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WordnetAdapterFactory
