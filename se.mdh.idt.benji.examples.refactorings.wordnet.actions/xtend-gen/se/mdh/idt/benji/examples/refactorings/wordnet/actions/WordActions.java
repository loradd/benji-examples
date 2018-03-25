package se.mdh.idt.benji.examples.refactorings.wordnet.actions;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import se.mdh.idt.benji.examples.refactorings.wordnet.Synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.Word;
import se.mdh.idt.benji.examples.refactorings.wordnet.WordnetFactory;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class WordActions {
  public static Word create_word() {
    return WordnetFactory.eINSTANCE.createWord();
  }
  
  public static void delete_word(final Word word) {
    EcoreUtil.delete(word, true);
  }
  
  public static void delete_word(final TraceLink word) {
    WordActions.delete_word(word.<Word>target());
  }
  
  public static String get_word_name(final Word word) {
    return word.getName();
  }
  
  public static String get_word_name(final TraceLink word) {
    return WordActions.get_word_name(word.<Word>target());
  }
  
  public static Iterable<Synset> get_word_synsets(final Word word) {
    return word.getSynsets();
  }
  
  public static Iterable<Synset> get_word_synsets(final TraceLink word) {
    return WordActions.get_word_synsets(word.<Word>target());
  }
  
  public static void insert_word_synset(final Word word, final Synset synset) {
    EList<Synset> _synsets = word.getSynsets();
    _synsets.add(synset);
  }
  
  public static void insert_word_synset(final Word word, final TraceLink synset) {
    WordActions.insert_word_synset(word, synset.<Synset>target());
  }
  
  public static void insert_word_synset(final TraceLink word, final Synset synset) {
    WordActions.insert_word_synset(word.<Word>target(), synset);
  }
  
  public static void insert_word_synset(final TraceLink word, final TraceLink synset) {
    WordActions.insert_word_synset(word.<Word>target(), synset.<Synset>target());
  }
  
  public static void remove_word_synset(final Word word, final Synset synset) {
    EList<Synset> _synsets = word.getSynsets();
    _synsets.remove(synset);
  }
  
  public static void remove_word_synset(final Word word, final TraceLink synset) {
    WordActions.remove_word_synset(word, synset.<Synset>target());
  }
  
  public static void remove_word_synset(final TraceLink word, final Synset synset) {
    WordActions.remove_word_synset(word.<Word>target(), synset);
  }
  
  public static void remove_word_synset(final TraceLink word, final TraceLink synset) {
    WordActions.remove_word_synset(word.<Word>target(), synset.<Synset>target());
  }
}
