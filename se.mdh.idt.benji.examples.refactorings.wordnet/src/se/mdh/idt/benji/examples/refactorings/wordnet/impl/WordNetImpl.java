/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.idt.benji.examples.refactorings.wordnet.Synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.Word;
import se.mdh.idt.benji.examples.refactorings.wordnet.WordNet;
import se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Word Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordNetImpl#getSynsets <em>Synsets</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.WordNetImpl#getWords <em>Words</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WordNetImpl extends MinimalEObjectImpl.Container implements WordNet {
	/**
	 * The cached value of the '{@link #getSynsets() <em>Synsets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynsets()
	 * @generated
	 * @ordered
	 */
	protected EList<Synset> synsets;

	/**
	 * The cached value of the '{@link #getWords() <em>Words</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWords()
	 * @generated
	 * @ordered
	 */
	protected EList<Word> words;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WordNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WordnetPackage.Literals.WORD_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synset> getSynsets() {
		if (synsets == null) {
			synsets = new EObjectContainmentEList<Synset>(Synset.class, this, WordnetPackage.WORD_NET__SYNSETS);
		}
		return synsets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Word> getWords() {
		if (words == null) {
			words = new EObjectContainmentEList<Word>(Word.class, this, WordnetPackage.WORD_NET__WORDS);
		}
		return words;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WordnetPackage.WORD_NET__SYNSETS:
				return ((InternalEList<?>)getSynsets()).basicRemove(otherEnd, msgs);
			case WordnetPackage.WORD_NET__WORDS:
				return ((InternalEList<?>)getWords()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WordnetPackage.WORD_NET__SYNSETS:
				return getSynsets();
			case WordnetPackage.WORD_NET__WORDS:
				return getWords();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WordnetPackage.WORD_NET__SYNSETS:
				getSynsets().clear();
				getSynsets().addAll((Collection<? extends Synset>)newValue);
				return;
			case WordnetPackage.WORD_NET__WORDS:
				getWords().clear();
				getWords().addAll((Collection<? extends Word>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WordnetPackage.WORD_NET__SYNSETS:
				getSynsets().clear();
				return;
			case WordnetPackage.WORD_NET__WORDS:
				getWords().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WordnetPackage.WORD_NET__SYNSETS:
				return synsets != null && !synsets.isEmpty();
			case WordnetPackage.WORD_NET__WORDS:
				return words != null && !words.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WordNetImpl
