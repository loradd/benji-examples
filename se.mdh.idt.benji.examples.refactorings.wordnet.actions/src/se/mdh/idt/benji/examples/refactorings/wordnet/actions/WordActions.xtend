package se.mdh.idt.benji.examples.refactorings.wordnet.actions

import se.mdh.idt.benji.examples.refactorings.wordnet.Synset
import se.mdh.idt.benji.examples.refactorings.wordnet.Word
import se.mdh.idt.benji.examples.refactorings.wordnet.WordnetFactory
import se.mdh.idt.benji.trace.TraceLink

import static extension org.eclipse.emf.ecore.util.EcoreUtil.delete

class WordActions {
	
	// word - create
	def static Word create_word () {
		WordnetFactory.eINSTANCE.createWord	
	}
	
	// word - delete (simple)
	def static void delete_word (Word word) {
		word.delete(true)
	}
	
	// word - delete (wrapped)
	def static void delete_word (TraceLink word) {
		delete_word (word.<Word>target)	
	}
	
	// word - name - get (simple)
	def static String get_word_name (Word word) {
		word.name
	}
	
	// word - name - get (wrapped)
	def static String get_word_name (TraceLink word) {
		get_word_name (word.<Word>target)	
	}
	
	// word - synsets - get (simple)
	def static Iterable<Synset> get_word_synsets (Word word) {
		word.synsets	
	}
	
	// word - synsets - get (wrapped)
	def static Iterable<Synset> get_word_synsets (TraceLink word) {
		get_word_synsets(word.<Word>target)	
	}
	
	// word - synsets - insert (simple)
	def static void insert_word_synset (Word word, Synset synset) {
		word.synsets += synset
	}
	
	// word - synsets - insert (mixed)
	def static void insert_word_synset (Word word, TraceLink synset) {
		insert_word_synset (word, synset.<Synset>target)	
	}
	
	// word - synsets - insert (mixed)
	def static void insert_word_synset (TraceLink word, Synset synset) {
		insert_word_synset (word.<Word>target, synset)	
	}
	
	// word - synsets - insert (wrapped)
	def static void insert_word_synset (TraceLink word, TraceLink synset) {
		insert_word_synset (word.<Word>target, synset.<Synset>target)	
	}
	
	// word - synsets - remove (simple)
	def static void remove_word_synset (Word word, Synset synset) {
		word.synsets -= synset	
	}
	
	// word - synsets - remove (mixed)
	def static void remove_word_synset (Word word, TraceLink synset) {
		remove_word_synset (word, synset.<Synset>target)	
	}
	
	// word - synsets - remove (mixed)
	def static void remove_word_synset (TraceLink word, Synset synset) {
		remove_word_synset (word.<Word>target, synset)	
	}
	
	// word - synsets - remove (wrapped)
	def static void remove_word_synset (TraceLink word, TraceLink synset) {
		remove_word_synset (word.<Word>target, synset.<Synset>target)
	}	
	
}