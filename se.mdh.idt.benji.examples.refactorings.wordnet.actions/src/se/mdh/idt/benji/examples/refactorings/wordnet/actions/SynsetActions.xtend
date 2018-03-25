package se.mdh.idt.benji.examples.refactorings.wordnet.actions

import se.mdh.idt.benji.examples.refactorings.wordnet.Synset
import se.mdh.idt.benji.examples.refactorings.wordnet.Word
import se.mdh.idt.benji.trace.TraceLink

class SynsetActions {
	
	// synset - create
	def static Synset create_synset () {}
	// synset - delete (simple)
	def static void delete_synset (Synset synset) {}
	// synset - delete (wrapped)
	def static void delete_synset (TraceLink synset) {}
	
	// synset - gloss - get (simple)
	def static String get_synset_gloss (Synset synset) {}
	// synset - gloss - get (wrapped)
	def static String get_synset_gloss (TraceLink synset) {}
	// synset - gloss - set (simple)
	def static void set_synset_gloss (Synset synset, String gloss) {}
	// synset - gloss - set (wrapped)
	def static void set_synset_gloss (TraceLink synset, String gloss) {}
	
	// synset - words - get (simple)
	def static Iterable<Word> get_synset_words (Synset synset) {}
	// synset - words - get (wrapped)
	def static Iterable<Word> get_synset_words (TraceLink synset) {}
	// synset - words - insert (simple)
	def static void insert_synset_word (Synset synset, Word word) {}
	// synset - words - insert (mixed)
	def static void insert_synset_word (Synset synset, TraceLink word) {}
	// synset - words - insert (mixed)
	def static void insert_synset_word (TraceLink synset, Word word) {}
	// synset - words - insert (wrapped)
	def static void insert_synset_word (TraceLink synset, TraceLink word) {}
	// synset - words - remove (simple)
	def static void remove_synset_word (Synset synset, Word word) {}
	// synset - words - remove (mixed)
	def static void remove_synset_word (Synset synset, TraceLink word) {}
	// synset - words - remove (mixed)
	def static void remove_synset_word (TraceLink synset, Word word) {}
	// synset - words - remove (wrapped)	
	def static void remove_synset_word (TraceLink synset, TraceLink word) {}

	// synset - hyponyms - get (simple)
	def static Iterable<Synset> get_synset_hyponyms (Synset synset) {}
	// synset - hyponyms - get (wrapped)
	def static Iterable<Synset> get_synset_hyponyms (TraceLink synset) {}
	// synset - hyponyms - insert (simple)
	def static void insert_synset_hyponym (Synset synset, Synset hyponym) {}
	// synset - hyponyms - insert (mixed)
	def static void insert_synset_hyponym (Synset synset, TraceLink hyponym) {}
	// synset - hyponyms - insert (mixed)
	def static void insert_synset_hyponym (TraceLink synset, Synset hyponym) {}
	// synset - hyponyms - insert (wrapped)
	def static void insert_synset_hyponym (TraceLink synset, TraceLink hyponym) {}
	// synset - hyponyms - remove (simple)
	def static void remove_synset_hyponym (Synset synset, Synset hyponym) {}
	// synset - hyponyms - remove (mixed)
	def static void remove_synset_hyponym (Synset synset, TraceLink hyponym) {}
	// synset - hyponyms - remove (mixed)
	def static void remove_synset_hyponym (TraceLink synset, Synset hyponym) {}
	// synset - hyponyms - remove (wrapped)	
	def static void remove_synset_hyponym (TraceLink synset, TraceLink hyponym) {}
	
	// synset - hyperonyms - get (simple)
	def static Iterable<Synset> get_synset_hyperonyms (Synset synset) {}
	// synset - hyperonyms - get (wrapped)
	def static Iterable<Synset> get_synset_hyperonyms (TraceLink synset) {}
	// synset - hyperonyms - insert (simple)
	def static void insert_synset_hyperonym (Synset synset, Synset hyperonym) {}
	// synset - hyperonyms - insert (mixed)
	def static void insert_synset_hyperonym (Synset synset, TraceLink hyperonym) {}
	// synset - hyperonyms - insert (mixed)
	def static void insert_synset_hyperonym (TraceLink synset, Synset hyperonym) {}
	// synset - hyperonyms - insert (wrapped)
	def static void insert_synset_hyperonym (TraceLink synset, TraceLink hyperonym) {}	
	// synset - hyperonyms - remove (simple)
	def static void remove_synset_hyperonym (Synset synset, Synset hyperonym) {}
	// synset - hyperonyms - remove (mixed)
	def static void remove_synset_hyperonym (Synset synset, TraceLink hyperonym) {}	
	// synset - hyperonyms - remove (mixed)
	def static void remove_synset_hyperonym (TraceLink synset, Synset hyperonym) {}	
	// synset - hyperonyms - remove (wrapped)	
	def static void remove_synset_hyperonym (TraceLink synset, TraceLink hyperonym) {}

	// synset - meronyms - get (simple)
	def static Iterable<Synset> get_synset_meronyms (Synset synset) {}
	// synset - meronyms - get (wrapped)
	def static Iterable<Synset> get_synset_meronyms (TraceLink synset) {}
	// synset - meronyms - insert (simple)
	def static void insert_synset_meronym (Synset synset, Synset meronym) {}
	// synset - meronyms - insert (mixed)
	def static void insert_synset_meronym (Synset synset, TraceLink meronym) {}
	// synset - meronyms - insert (mixed)
	def static void insert_synset_meronym (TraceLink synset, Synset meronym) {}
	// synset - meronyms - insert (wrapped)
	def static void insert_synset_meronym (TraceLink synset, TraceLink meronym) {}
	// synset - meronyms - remove (simple)
	def static void remove_synset_meronym (Synset synset, Synset meronym) {}
	// synset - meronyms - remove (mixed)
	def static void remove_synset_meronym (Synset synset, TraceLink meronym) {}
	// synset - meronyms - remove (mixed)
	def static void remove_synset_meronym (TraceLink synset, Synset meronym) {}
	// synset - meronyms - remove (wrapped)	
	def static void remove_synset_meronym (TraceLink synset, TraceLink meronym) {}

	// synset - holonyms - get (simple)
	def static Iterable<Synset> get_synset_holonyms (Synset synset) {}
	// synset - holonyms - get (wrapped)
	def static Iterable<Synset> get_synset_holonyms (TraceLink synset) {}
	// synset - holonyms - insert (simple)
	def static void insert_synset_holonym (Synset synset, Synset holonym) {}
	// synset - holonyms - insert (mixed)
	def static void insert_synset_holonym (Synset synset, TraceLink holonym) {}
	// synset - holonyms - insert (mixed)
	def static void insert_synset_holonym (TraceLink synset, Synset holonym) {}
	// synset - holonyms - insert (wrapped)
	def static void insert_synset_holonym (TraceLink synset, TraceLink holonym) {}
	// synset - holonyms - remove (simple)
	def static void remove_synset_holonym (Synset synset, Synset holonym) {}
	// synset - holonyms - remove (mixed)
	def static void remove_synset_holonym (Synset synset, TraceLink holonym) {}
	// synset - holonyms - remove (mixed)
	def static void remove_synset_holonym (TraceLink synset, Synset holonym) {}
	// synset - holonyms - remove (wrapped)	
	def static void remove_synset_holonym (TraceLink synset, TraceLink holonym) {}

}