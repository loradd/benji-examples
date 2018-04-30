/**
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.mdh.idt.benji.examples.refactorings.wordnet.Synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.Word;
import se.mdh.idt.benji.examples.refactorings.wordnet.WordnetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl#getGloss <em>Gloss</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl#getWords <em>Words</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl#getHyponyms <em>Hyponyms</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl#getHyperonyms <em>Hyperonyms</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl#getMeronyms <em>Meronyms</em>}</li>
 *   <li>{@link se.mdh.idt.benji.examples.refactorings.wordnet.impl.SynsetImpl#getHolonyms <em>Holonyms</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynsetImpl extends MinimalEObjectImpl.Container implements Synset {
	/**
	 * The default value of the '{@link #getGloss() <em>Gloss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGloss()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOSS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGloss() <em>Gloss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGloss()
	 * @generated
	 * @ordered
	 */
	protected String gloss = GLOSS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWords() <em>Words</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWords()
	 * @generated
	 * @ordered
	 */
	protected EList<Word> words;

	/**
	 * The cached value of the '{@link #getHyponyms() <em>Hyponyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyponyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Synset> hyponyms;

	/**
	 * The cached value of the '{@link #getHyperonyms() <em>Hyperonyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHyperonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Synset> hyperonyms;

	/**
	 * The cached value of the '{@link #getMeronyms() <em>Meronyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeronyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Synset> meronyms;

	/**
	 * The cached value of the '{@link #getHolonyms() <em>Holonyms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolonyms()
	 * @generated
	 * @ordered
	 */
	protected EList<Synset> holonyms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WordnetPackage.Literals.SYNSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGloss() {
		return gloss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGloss(String newGloss) {
		String oldGloss = gloss;
		gloss = newGloss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WordnetPackage.SYNSET__GLOSS, oldGloss, gloss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Word> getWords() {
		if (words == null) {
			words = new EObjectWithInverseResolvingEList.ManyInverse<Word>(Word.class, this, WordnetPackage.SYNSET__WORDS, WordnetPackage.WORD__SYNSETS);
		}
		return words;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synset> getHyponyms() {
		if (hyponyms == null) {
			hyponyms = new EObjectWithInverseResolvingEList.ManyInverse<Synset>(Synset.class, this, WordnetPackage.SYNSET__HYPONYMS, WordnetPackage.SYNSET__HYPERONYMS);
		}
		return hyponyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synset> getHyperonyms() {
		if (hyperonyms == null) {
			hyperonyms = new EObjectWithInverseResolvingEList.ManyInverse<Synset>(Synset.class, this, WordnetPackage.SYNSET__HYPERONYMS, WordnetPackage.SYNSET__HYPONYMS);
		}
		return hyperonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synset> getMeronyms() {
		if (meronyms == null) {
			meronyms = new EObjectWithInverseResolvingEList.ManyInverse<Synset>(Synset.class, this, WordnetPackage.SYNSET__MERONYMS, WordnetPackage.SYNSET__HOLONYMS);
		}
		return meronyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synset> getHolonyms() {
		if (holonyms == null) {
			holonyms = new EObjectWithInverseResolvingEList.ManyInverse<Synset>(Synset.class, this, WordnetPackage.SYNSET__HOLONYMS, WordnetPackage.SYNSET__MERONYMS);
		}
		return holonyms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WordnetPackage.SYNSET__WORDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getWords()).basicAdd(otherEnd, msgs);
			case WordnetPackage.SYNSET__HYPONYMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHyponyms()).basicAdd(otherEnd, msgs);
			case WordnetPackage.SYNSET__HYPERONYMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHyperonyms()).basicAdd(otherEnd, msgs);
			case WordnetPackage.SYNSET__MERONYMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMeronyms()).basicAdd(otherEnd, msgs);
			case WordnetPackage.SYNSET__HOLONYMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHolonyms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WordnetPackage.SYNSET__WORDS:
				return ((InternalEList<?>)getWords()).basicRemove(otherEnd, msgs);
			case WordnetPackage.SYNSET__HYPONYMS:
				return ((InternalEList<?>)getHyponyms()).basicRemove(otherEnd, msgs);
			case WordnetPackage.SYNSET__HYPERONYMS:
				return ((InternalEList<?>)getHyperonyms()).basicRemove(otherEnd, msgs);
			case WordnetPackage.SYNSET__MERONYMS:
				return ((InternalEList<?>)getMeronyms()).basicRemove(otherEnd, msgs);
			case WordnetPackage.SYNSET__HOLONYMS:
				return ((InternalEList<?>)getHolonyms()).basicRemove(otherEnd, msgs);
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
			case WordnetPackage.SYNSET__GLOSS:
				return getGloss();
			case WordnetPackage.SYNSET__WORDS:
				return getWords();
			case WordnetPackage.SYNSET__HYPONYMS:
				return getHyponyms();
			case WordnetPackage.SYNSET__HYPERONYMS:
				return getHyperonyms();
			case WordnetPackage.SYNSET__MERONYMS:
				return getMeronyms();
			case WordnetPackage.SYNSET__HOLONYMS:
				return getHolonyms();
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
			case WordnetPackage.SYNSET__GLOSS:
				setGloss((String)newValue);
				return;
			case WordnetPackage.SYNSET__WORDS:
				getWords().clear();
				getWords().addAll((Collection<? extends Word>)newValue);
				return;
			case WordnetPackage.SYNSET__HYPONYMS:
				getHyponyms().clear();
				getHyponyms().addAll((Collection<? extends Synset>)newValue);
				return;
			case WordnetPackage.SYNSET__HYPERONYMS:
				getHyperonyms().clear();
				getHyperonyms().addAll((Collection<? extends Synset>)newValue);
				return;
			case WordnetPackage.SYNSET__MERONYMS:
				getMeronyms().clear();
				getMeronyms().addAll((Collection<? extends Synset>)newValue);
				return;
			case WordnetPackage.SYNSET__HOLONYMS:
				getHolonyms().clear();
				getHolonyms().addAll((Collection<? extends Synset>)newValue);
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
			case WordnetPackage.SYNSET__GLOSS:
				setGloss(GLOSS_EDEFAULT);
				return;
			case WordnetPackage.SYNSET__WORDS:
				getWords().clear();
				return;
			case WordnetPackage.SYNSET__HYPONYMS:
				getHyponyms().clear();
				return;
			case WordnetPackage.SYNSET__HYPERONYMS:
				getHyperonyms().clear();
				return;
			case WordnetPackage.SYNSET__MERONYMS:
				getMeronyms().clear();
				return;
			case WordnetPackage.SYNSET__HOLONYMS:
				getHolonyms().clear();
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
			case WordnetPackage.SYNSET__GLOSS:
				return GLOSS_EDEFAULT == null ? gloss != null : !GLOSS_EDEFAULT.equals(gloss);
			case WordnetPackage.SYNSET__WORDS:
				return words != null && !words.isEmpty();
			case WordnetPackage.SYNSET__HYPONYMS:
				return hyponyms != null && !hyponyms.isEmpty();
			case WordnetPackage.SYNSET__HYPERONYMS:
				return hyperonyms != null && !hyperonyms.isEmpty();
			case WordnetPackage.SYNSET__MERONYMS:
				return meronyms != null && !meronyms.isEmpty();
			case WordnetPackage.SYNSET__HOLONYMS:
				return holonyms != null && !holonyms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (gloss: ");
		result.append(gloss);
		result.append(')');
		return result.toString();
	}

} //SynsetImpl
