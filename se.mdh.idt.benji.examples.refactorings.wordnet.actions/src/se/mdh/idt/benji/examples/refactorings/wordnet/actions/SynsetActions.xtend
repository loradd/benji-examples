package se.mdh.idt.benji.examples.refactorings.wordnet.actions

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import se.mdh.idt.benji.examples.refactorings.wordnet.Synset
import se.mdh.idt.benji.examples.refactorings.wordnet.Word
import se.mdh.idt.benji.trace.Trace

class SynsetActions {
	
	// synset - gloss - get
	def static String getGloss (EObject synset) {
		switch synset {
			Trace : synset.<Synset>current.gloss
			Synset : synset.gloss
		}
	}
	
	// synset - gloss - set
	def static void setGloss (EObject synset, String gloss) {
		switch synset {
			Trace : synset.<Synset>current.gloss = gloss
			Synset : synset.gloss = gloss
		}
	}
	
	// synset - words - get
	def static EList<Word> getWords (EObject synset) {
		switch synset {
			Trace : synset.<Synset>current.words
			Synset : synset.words
		}	
	}
	
	// synset - hyponyms - get
	def static EList<Synset> getHyponyms (EObject synset) {
		switch synset {
			Trace : synset.<Synset>current.hyponyms
			Synset : synset.hyponyms
		}
	}
	
	// synset - hyperonyms - get
	def static EList<Synset> getHyperonyms (EObject synset) {
		switch synset {
			Trace : synset.<Synset>current.hyperonyms
			Synset : synset.hyperonyms
		}		
	}
	
	// synset - meronyms - get
	def static EList<Synset> getMeronyms (EObject synset) {
		switch synset {
			Trace : synset.<Synset>current.meronyms
			Synset : synset.meronyms
		}
	}
	
	// synset - holonyms - get
	def static EList<Synset> getHolonyms (EObject synset) {
		switch synset {
			Trace : synset.<Synset>current.holonyms
			Synset : synset.holonyms
		}
	}
	
}