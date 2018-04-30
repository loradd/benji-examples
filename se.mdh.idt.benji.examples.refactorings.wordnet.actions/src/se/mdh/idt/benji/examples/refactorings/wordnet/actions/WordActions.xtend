package se.mdh.idt.benji.examples.refactorings.wordnet.actions

import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import se.mdh.idt.benji.examples.refactorings.wordnet.Synset
import se.mdh.idt.benji.examples.refactorings.wordnet.Word
import se.mdh.idt.benji.trace.Trace

class WordActions {
	
	// word - name - get
	def static String getName (EObject word) {
		switch word {
			Trace : word.<Word>current.name
			Word : word.name
		}	
	} 
	
	// word - name - set
	def static void setName (EObject word, String name) {
		switch word {
			Trace : word.<Word>current.name = name
			Word : word.name = name
		}	
	}
	
	// word - synsets - get
	def static EList<Synset> getSynsets (EObject word) {
		switch word {
			Trace : word.<Word>current.synsets
			Word : word.synsets
		}
	}
	
}