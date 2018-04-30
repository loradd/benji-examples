/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/SynsetPatterns.vql
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Created_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_holonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_hyperonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_hyponyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_meronyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_words;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Deleted_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_holonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_hyperonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_hyponyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_meronyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_words;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Inserted_synset_holonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Inserted_synset_hyperonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Inserted_synset_hyponyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Inserted_synset_meronyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Inserted_synset_words;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_synset_holonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_synset_hyperonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_synset_hyponyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_synset_meronyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_synset_words;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_holonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_hyperonyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_hyponyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_meronyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_words;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Set_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_synset_gloss;

/**
 * A pattern group formed of all public patterns defined in SynsetPatterns.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SynsetPatterns.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.wordnet.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_synset</li>
 * <li>current_synset</li>
 * <li>preserved_synset</li>
 * <li>created_synset</li>
 * <li>deleted_synset</li>
 * <li>initial_synset_gloss</li>
 * <li>current_synset_gloss</li>
 * <li>preserved_synset_gloss</li>
 * <li>set_synset_gloss</li>
 * <li>unset_synset_gloss</li>
 * <li>initial_synset_words</li>
 * <li>current_synset_words</li>
 * <li>preserved_synset_words</li>
 * <li>inserted_synset_words</li>
 * <li>removed_synset_words</li>
 * <li>initial_synset_hyponyms</li>
 * <li>current_synset_hyponyms</li>
 * <li>preserved_synset_hyponyms</li>
 * <li>inserted_synset_hyponyms</li>
 * <li>removed_synset_hyponyms</li>
 * <li>initial_synset_hyperonyms</li>
 * <li>current_synset_hyperonyms</li>
 * <li>preserved_synset_hyperonyms</li>
 * <li>inserted_synset_hyperonyms</li>
 * <li>removed_synset_hyperonyms</li>
 * <li>initial_synset_meronyms</li>
 * <li>current_synset_meronyms</li>
 * <li>preserved_synset_meronyms</li>
 * <li>inserted_synset_meronyms</li>
 * <li>removed_synset_meronyms</li>
 * <li>initial_synset_holonyms</li>
 * <li>current_synset_holonyms</li>
 * <li>preserved_synset_holonyms</li>
 * <li>inserted_synset_holonyms</li>
 * <li>removed_synset_holonyms</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-04-24T16:52+0200")
public final class SynsetPatterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SynsetPatterns instance() {
    if (INSTANCE == null) {
        INSTANCE = new SynsetPatterns();
    }
    return INSTANCE;
  }
  
  private static SynsetPatterns INSTANCE;
  
  private SynsetPatterns() {
    querySpecifications.add(Initial_synset.instance());
    querySpecifications.add(Current_synset.instance());
    querySpecifications.add(Preserved_synset.instance());
    querySpecifications.add(Created_synset.instance());
    querySpecifications.add(Deleted_synset.instance());
    querySpecifications.add(Initial_synset_gloss.instance());
    querySpecifications.add(Current_synset_gloss.instance());
    querySpecifications.add(Preserved_synset_gloss.instance());
    querySpecifications.add(Set_synset_gloss.instance());
    querySpecifications.add(Unset_synset_gloss.instance());
    querySpecifications.add(Initial_synset_words.instance());
    querySpecifications.add(Current_synset_words.instance());
    querySpecifications.add(Preserved_synset_words.instance());
    querySpecifications.add(Inserted_synset_words.instance());
    querySpecifications.add(Removed_synset_words.instance());
    querySpecifications.add(Initial_synset_hyponyms.instance());
    querySpecifications.add(Current_synset_hyponyms.instance());
    querySpecifications.add(Preserved_synset_hyponyms.instance());
    querySpecifications.add(Inserted_synset_hyponyms.instance());
    querySpecifications.add(Removed_synset_hyponyms.instance());
    querySpecifications.add(Initial_synset_hyperonyms.instance());
    querySpecifications.add(Current_synset_hyperonyms.instance());
    querySpecifications.add(Preserved_synset_hyperonyms.instance());
    querySpecifications.add(Inserted_synset_hyperonyms.instance());
    querySpecifications.add(Removed_synset_hyperonyms.instance());
    querySpecifications.add(Initial_synset_meronyms.instance());
    querySpecifications.add(Current_synset_meronyms.instance());
    querySpecifications.add(Preserved_synset_meronyms.instance());
    querySpecifications.add(Inserted_synset_meronyms.instance());
    querySpecifications.add(Removed_synset_meronyms.instance());
    querySpecifications.add(Initial_synset_holonyms.instance());
    querySpecifications.add(Current_synset_holonyms.instance());
    querySpecifications.add(Preserved_synset_holonyms.instance());
    querySpecifications.add(Inserted_synset_holonyms.instance());
    querySpecifications.add(Removed_synset_holonyms.instance());
  }
  
  public Initial_synset getInitial_synset() {
    return Initial_synset.instance();
  }
  
  public Initial_synset.Matcher getInitial_synset(final ViatraQueryEngine engine) {
    return Initial_synset.Matcher.on(engine);
  }
  
  public Current_synset getCurrent_synset() {
    return Current_synset.instance();
  }
  
  public Current_synset.Matcher getCurrent_synset(final ViatraQueryEngine engine) {
    return Current_synset.Matcher.on(engine);
  }
  
  public Preserved_synset getPreserved_synset() {
    return Preserved_synset.instance();
  }
  
  public Preserved_synset.Matcher getPreserved_synset(final ViatraQueryEngine engine) {
    return Preserved_synset.Matcher.on(engine);
  }
  
  public Created_synset getCreated_synset() {
    return Created_synset.instance();
  }
  
  public Created_synset.Matcher getCreated_synset(final ViatraQueryEngine engine) {
    return Created_synset.Matcher.on(engine);
  }
  
  public Deleted_synset getDeleted_synset() {
    return Deleted_synset.instance();
  }
  
  public Deleted_synset.Matcher getDeleted_synset(final ViatraQueryEngine engine) {
    return Deleted_synset.Matcher.on(engine);
  }
  
  public Initial_synset_gloss getInitial_synset_gloss() {
    return Initial_synset_gloss.instance();
  }
  
  public Initial_synset_gloss.Matcher getInitial_synset_gloss(final ViatraQueryEngine engine) {
    return Initial_synset_gloss.Matcher.on(engine);
  }
  
  public Current_synset_gloss getCurrent_synset_gloss() {
    return Current_synset_gloss.instance();
  }
  
  public Current_synset_gloss.Matcher getCurrent_synset_gloss(final ViatraQueryEngine engine) {
    return Current_synset_gloss.Matcher.on(engine);
  }
  
  public Preserved_synset_gloss getPreserved_synset_gloss() {
    return Preserved_synset_gloss.instance();
  }
  
  public Preserved_synset_gloss.Matcher getPreserved_synset_gloss(final ViatraQueryEngine engine) {
    return Preserved_synset_gloss.Matcher.on(engine);
  }
  
  public Set_synset_gloss getSet_synset_gloss() {
    return Set_synset_gloss.instance();
  }
  
  public Set_synset_gloss.Matcher getSet_synset_gloss(final ViatraQueryEngine engine) {
    return Set_synset_gloss.Matcher.on(engine);
  }
  
  public Unset_synset_gloss getUnset_synset_gloss() {
    return Unset_synset_gloss.instance();
  }
  
  public Unset_synset_gloss.Matcher getUnset_synset_gloss(final ViatraQueryEngine engine) {
    return Unset_synset_gloss.Matcher.on(engine);
  }
  
  public Initial_synset_words getInitial_synset_words() {
    return Initial_synset_words.instance();
  }
  
  public Initial_synset_words.Matcher getInitial_synset_words(final ViatraQueryEngine engine) {
    return Initial_synset_words.Matcher.on(engine);
  }
  
  public Current_synset_words getCurrent_synset_words() {
    return Current_synset_words.instance();
  }
  
  public Current_synset_words.Matcher getCurrent_synset_words(final ViatraQueryEngine engine) {
    return Current_synset_words.Matcher.on(engine);
  }
  
  public Preserved_synset_words getPreserved_synset_words() {
    return Preserved_synset_words.instance();
  }
  
  public Preserved_synset_words.Matcher getPreserved_synset_words(final ViatraQueryEngine engine) {
    return Preserved_synset_words.Matcher.on(engine);
  }
  
  public Inserted_synset_words getInserted_synset_words() {
    return Inserted_synset_words.instance();
  }
  
  public Inserted_synset_words.Matcher getInserted_synset_words(final ViatraQueryEngine engine) {
    return Inserted_synset_words.Matcher.on(engine);
  }
  
  public Removed_synset_words getRemoved_synset_words() {
    return Removed_synset_words.instance();
  }
  
  public Removed_synset_words.Matcher getRemoved_synset_words(final ViatraQueryEngine engine) {
    return Removed_synset_words.Matcher.on(engine);
  }
  
  public Initial_synset_hyponyms getInitial_synset_hyponyms() {
    return Initial_synset_hyponyms.instance();
  }
  
  public Initial_synset_hyponyms.Matcher getInitial_synset_hyponyms(final ViatraQueryEngine engine) {
    return Initial_synset_hyponyms.Matcher.on(engine);
  }
  
  public Current_synset_hyponyms getCurrent_synset_hyponyms() {
    return Current_synset_hyponyms.instance();
  }
  
  public Current_synset_hyponyms.Matcher getCurrent_synset_hyponyms(final ViatraQueryEngine engine) {
    return Current_synset_hyponyms.Matcher.on(engine);
  }
  
  public Preserved_synset_hyponyms getPreserved_synset_hyponyms() {
    return Preserved_synset_hyponyms.instance();
  }
  
  public Preserved_synset_hyponyms.Matcher getPreserved_synset_hyponyms(final ViatraQueryEngine engine) {
    return Preserved_synset_hyponyms.Matcher.on(engine);
  }
  
  public Inserted_synset_hyponyms getInserted_synset_hyponyms() {
    return Inserted_synset_hyponyms.instance();
  }
  
  public Inserted_synset_hyponyms.Matcher getInserted_synset_hyponyms(final ViatraQueryEngine engine) {
    return Inserted_synset_hyponyms.Matcher.on(engine);
  }
  
  public Removed_synset_hyponyms getRemoved_synset_hyponyms() {
    return Removed_synset_hyponyms.instance();
  }
  
  public Removed_synset_hyponyms.Matcher getRemoved_synset_hyponyms(final ViatraQueryEngine engine) {
    return Removed_synset_hyponyms.Matcher.on(engine);
  }
  
  public Initial_synset_hyperonyms getInitial_synset_hyperonyms() {
    return Initial_synset_hyperonyms.instance();
  }
  
  public Initial_synset_hyperonyms.Matcher getInitial_synset_hyperonyms(final ViatraQueryEngine engine) {
    return Initial_synset_hyperonyms.Matcher.on(engine);
  }
  
  public Current_synset_hyperonyms getCurrent_synset_hyperonyms() {
    return Current_synset_hyperonyms.instance();
  }
  
  public Current_synset_hyperonyms.Matcher getCurrent_synset_hyperonyms(final ViatraQueryEngine engine) {
    return Current_synset_hyperonyms.Matcher.on(engine);
  }
  
  public Preserved_synset_hyperonyms getPreserved_synset_hyperonyms() {
    return Preserved_synset_hyperonyms.instance();
  }
  
  public Preserved_synset_hyperonyms.Matcher getPreserved_synset_hyperonyms(final ViatraQueryEngine engine) {
    return Preserved_synset_hyperonyms.Matcher.on(engine);
  }
  
  public Inserted_synset_hyperonyms getInserted_synset_hyperonyms() {
    return Inserted_synset_hyperonyms.instance();
  }
  
  public Inserted_synset_hyperonyms.Matcher getInserted_synset_hyperonyms(final ViatraQueryEngine engine) {
    return Inserted_synset_hyperonyms.Matcher.on(engine);
  }
  
  public Removed_synset_hyperonyms getRemoved_synset_hyperonyms() {
    return Removed_synset_hyperonyms.instance();
  }
  
  public Removed_synset_hyperonyms.Matcher getRemoved_synset_hyperonyms(final ViatraQueryEngine engine) {
    return Removed_synset_hyperonyms.Matcher.on(engine);
  }
  
  public Initial_synset_meronyms getInitial_synset_meronyms() {
    return Initial_synset_meronyms.instance();
  }
  
  public Initial_synset_meronyms.Matcher getInitial_synset_meronyms(final ViatraQueryEngine engine) {
    return Initial_synset_meronyms.Matcher.on(engine);
  }
  
  public Current_synset_meronyms getCurrent_synset_meronyms() {
    return Current_synset_meronyms.instance();
  }
  
  public Current_synset_meronyms.Matcher getCurrent_synset_meronyms(final ViatraQueryEngine engine) {
    return Current_synset_meronyms.Matcher.on(engine);
  }
  
  public Preserved_synset_meronyms getPreserved_synset_meronyms() {
    return Preserved_synset_meronyms.instance();
  }
  
  public Preserved_synset_meronyms.Matcher getPreserved_synset_meronyms(final ViatraQueryEngine engine) {
    return Preserved_synset_meronyms.Matcher.on(engine);
  }
  
  public Inserted_synset_meronyms getInserted_synset_meronyms() {
    return Inserted_synset_meronyms.instance();
  }
  
  public Inserted_synset_meronyms.Matcher getInserted_synset_meronyms(final ViatraQueryEngine engine) {
    return Inserted_synset_meronyms.Matcher.on(engine);
  }
  
  public Removed_synset_meronyms getRemoved_synset_meronyms() {
    return Removed_synset_meronyms.instance();
  }
  
  public Removed_synset_meronyms.Matcher getRemoved_synset_meronyms(final ViatraQueryEngine engine) {
    return Removed_synset_meronyms.Matcher.on(engine);
  }
  
  public Initial_synset_holonyms getInitial_synset_holonyms() {
    return Initial_synset_holonyms.instance();
  }
  
  public Initial_synset_holonyms.Matcher getInitial_synset_holonyms(final ViatraQueryEngine engine) {
    return Initial_synset_holonyms.Matcher.on(engine);
  }
  
  public Current_synset_holonyms getCurrent_synset_holonyms() {
    return Current_synset_holonyms.instance();
  }
  
  public Current_synset_holonyms.Matcher getCurrent_synset_holonyms(final ViatraQueryEngine engine) {
    return Current_synset_holonyms.Matcher.on(engine);
  }
  
  public Preserved_synset_holonyms getPreserved_synset_holonyms() {
    return Preserved_synset_holonyms.instance();
  }
  
  public Preserved_synset_holonyms.Matcher getPreserved_synset_holonyms(final ViatraQueryEngine engine) {
    return Preserved_synset_holonyms.Matcher.on(engine);
  }
  
  public Inserted_synset_holonyms getInserted_synset_holonyms() {
    return Inserted_synset_holonyms.instance();
  }
  
  public Inserted_synset_holonyms.Matcher getInserted_synset_holonyms(final ViatraQueryEngine engine) {
    return Inserted_synset_holonyms.Matcher.on(engine);
  }
  
  public Removed_synset_holonyms getRemoved_synset_holonyms() {
    return Removed_synset_holonyms.instance();
  }
  
  public Removed_synset_holonyms.Matcher getRemoved_synset_holonyms(final ViatraQueryEngine engine) {
    return Removed_synset_holonyms.Matcher.on(engine);
  }
}
