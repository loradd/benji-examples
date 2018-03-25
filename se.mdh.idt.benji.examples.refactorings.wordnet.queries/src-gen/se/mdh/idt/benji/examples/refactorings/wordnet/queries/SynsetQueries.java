/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/SynsetQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_holonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_hyperonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_hyponym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_meronym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_synset_holonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_synset_hyperonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_synset_hyponym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_synset_meronym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_synset_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_holonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_hyperonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_hyponym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_meronym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_holonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_hyperonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_hyponym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_meronym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Remove_synset_holonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Remove_synset_hyperonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Remove_synset_hyponym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Remove_synset_meronym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Remove_synset_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Set_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_synset_gloss;

/**
 * A pattern group formed of all public patterns defined in SynsetQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SynsetQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.wordnet.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_synset</li>
 * <li>current_synset</li>
 * <li>get_synset_gloss</li>
 * <li>set_synset_gloss</li>
 * <li>unset_synset_gloss</li>
 * <li>initial_synset_gloss</li>
 * <li>current_synset_gloss</li>
 * <li>get_synset_word</li>
 * <li>insert_synset_word</li>
 * <li>remove_synset_word</li>
 * <li>initial_synset_word</li>
 * <li>current_synset_word</li>
 * <li>get_synset_hyponym</li>
 * <li>insert_synset_hyponym</li>
 * <li>remove_synset_hyponym</li>
 * <li>initial_synset_hyponym</li>
 * <li>current_synset_hyponym</li>
 * <li>get_synset_hyperonym</li>
 * <li>insert_synset_hyperonym</li>
 * <li>remove_synset_hyperonym</li>
 * <li>initial_synset_hyperonym</li>
 * <li>current_synset_hyperonym</li>
 * <li>get_synset_meronym</li>
 * <li>insert_synset_meronym</li>
 * <li>remove_synset_meronym</li>
 * <li>initial_synset_meronym</li>
 * <li>current_synset_meronym</li>
 * <li>get_synset_holonym</li>
 * <li>insert_synset_holonym</li>
 * <li>remove_synset_holonym</li>
 * <li>initial_synset_holonym</li>
 * <li>current_synset_holonym</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T22:01+0200")
public final class SynsetQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SynsetQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new SynsetQueries();
    }
    return INSTANCE;
  }
  
  private static SynsetQueries INSTANCE;
  
  private SynsetQueries() {
    querySpecifications.add(Initial_synset.instance());
    querySpecifications.add(Current_synset.instance());
    querySpecifications.add(Get_synset_gloss.instance());
    querySpecifications.add(Set_synset_gloss.instance());
    querySpecifications.add(Unset_synset_gloss.instance());
    querySpecifications.add(Initial_synset_gloss.instance());
    querySpecifications.add(Current_synset_gloss.instance());
    querySpecifications.add(Get_synset_word.instance());
    querySpecifications.add(Insert_synset_word.instance());
    querySpecifications.add(Remove_synset_word.instance());
    querySpecifications.add(Initial_synset_word.instance());
    querySpecifications.add(Current_synset_word.instance());
    querySpecifications.add(Get_synset_hyponym.instance());
    querySpecifications.add(Insert_synset_hyponym.instance());
    querySpecifications.add(Remove_synset_hyponym.instance());
    querySpecifications.add(Initial_synset_hyponym.instance());
    querySpecifications.add(Current_synset_hyponym.instance());
    querySpecifications.add(Get_synset_hyperonym.instance());
    querySpecifications.add(Insert_synset_hyperonym.instance());
    querySpecifications.add(Remove_synset_hyperonym.instance());
    querySpecifications.add(Initial_synset_hyperonym.instance());
    querySpecifications.add(Current_synset_hyperonym.instance());
    querySpecifications.add(Get_synset_meronym.instance());
    querySpecifications.add(Insert_synset_meronym.instance());
    querySpecifications.add(Remove_synset_meronym.instance());
    querySpecifications.add(Initial_synset_meronym.instance());
    querySpecifications.add(Current_synset_meronym.instance());
    querySpecifications.add(Get_synset_holonym.instance());
    querySpecifications.add(Insert_synset_holonym.instance());
    querySpecifications.add(Remove_synset_holonym.instance());
    querySpecifications.add(Initial_synset_holonym.instance());
    querySpecifications.add(Current_synset_holonym.instance());
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
  
  public Get_synset_gloss getGet_synset_gloss() {
    return Get_synset_gloss.instance();
  }
  
  public Get_synset_gloss.Matcher getGet_synset_gloss(final ViatraQueryEngine engine) {
    return Get_synset_gloss.Matcher.on(engine);
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
  
  public Get_synset_word getGet_synset_word() {
    return Get_synset_word.instance();
  }
  
  public Get_synset_word.Matcher getGet_synset_word(final ViatraQueryEngine engine) {
    return Get_synset_word.Matcher.on(engine);
  }
  
  public Insert_synset_word getInsert_synset_word() {
    return Insert_synset_word.instance();
  }
  
  public Insert_synset_word.Matcher getInsert_synset_word(final ViatraQueryEngine engine) {
    return Insert_synset_word.Matcher.on(engine);
  }
  
  public Remove_synset_word getRemove_synset_word() {
    return Remove_synset_word.instance();
  }
  
  public Remove_synset_word.Matcher getRemove_synset_word(final ViatraQueryEngine engine) {
    return Remove_synset_word.Matcher.on(engine);
  }
  
  public Initial_synset_word getInitial_synset_word() {
    return Initial_synset_word.instance();
  }
  
  public Initial_synset_word.Matcher getInitial_synset_word(final ViatraQueryEngine engine) {
    return Initial_synset_word.Matcher.on(engine);
  }
  
  public Current_synset_word getCurrent_synset_word() {
    return Current_synset_word.instance();
  }
  
  public Current_synset_word.Matcher getCurrent_synset_word(final ViatraQueryEngine engine) {
    return Current_synset_word.Matcher.on(engine);
  }
  
  public Get_synset_hyponym getGet_synset_hyponym() {
    return Get_synset_hyponym.instance();
  }
  
  public Get_synset_hyponym.Matcher getGet_synset_hyponym(final ViatraQueryEngine engine) {
    return Get_synset_hyponym.Matcher.on(engine);
  }
  
  public Insert_synset_hyponym getInsert_synset_hyponym() {
    return Insert_synset_hyponym.instance();
  }
  
  public Insert_synset_hyponym.Matcher getInsert_synset_hyponym(final ViatraQueryEngine engine) {
    return Insert_synset_hyponym.Matcher.on(engine);
  }
  
  public Remove_synset_hyponym getRemove_synset_hyponym() {
    return Remove_synset_hyponym.instance();
  }
  
  public Remove_synset_hyponym.Matcher getRemove_synset_hyponym(final ViatraQueryEngine engine) {
    return Remove_synset_hyponym.Matcher.on(engine);
  }
  
  public Initial_synset_hyponym getInitial_synset_hyponym() {
    return Initial_synset_hyponym.instance();
  }
  
  public Initial_synset_hyponym.Matcher getInitial_synset_hyponym(final ViatraQueryEngine engine) {
    return Initial_synset_hyponym.Matcher.on(engine);
  }
  
  public Current_synset_hyponym getCurrent_synset_hyponym() {
    return Current_synset_hyponym.instance();
  }
  
  public Current_synset_hyponym.Matcher getCurrent_synset_hyponym(final ViatraQueryEngine engine) {
    return Current_synset_hyponym.Matcher.on(engine);
  }
  
  public Get_synset_hyperonym getGet_synset_hyperonym() {
    return Get_synset_hyperonym.instance();
  }
  
  public Get_synset_hyperonym.Matcher getGet_synset_hyperonym(final ViatraQueryEngine engine) {
    return Get_synset_hyperonym.Matcher.on(engine);
  }
  
  public Insert_synset_hyperonym getInsert_synset_hyperonym() {
    return Insert_synset_hyperonym.instance();
  }
  
  public Insert_synset_hyperonym.Matcher getInsert_synset_hyperonym(final ViatraQueryEngine engine) {
    return Insert_synset_hyperonym.Matcher.on(engine);
  }
  
  public Remove_synset_hyperonym getRemove_synset_hyperonym() {
    return Remove_synset_hyperonym.instance();
  }
  
  public Remove_synset_hyperonym.Matcher getRemove_synset_hyperonym(final ViatraQueryEngine engine) {
    return Remove_synset_hyperonym.Matcher.on(engine);
  }
  
  public Initial_synset_hyperonym getInitial_synset_hyperonym() {
    return Initial_synset_hyperonym.instance();
  }
  
  public Initial_synset_hyperonym.Matcher getInitial_synset_hyperonym(final ViatraQueryEngine engine) {
    return Initial_synset_hyperonym.Matcher.on(engine);
  }
  
  public Current_synset_hyperonym getCurrent_synset_hyperonym() {
    return Current_synset_hyperonym.instance();
  }
  
  public Current_synset_hyperonym.Matcher getCurrent_synset_hyperonym(final ViatraQueryEngine engine) {
    return Current_synset_hyperonym.Matcher.on(engine);
  }
  
  public Get_synset_meronym getGet_synset_meronym() {
    return Get_synset_meronym.instance();
  }
  
  public Get_synset_meronym.Matcher getGet_synset_meronym(final ViatraQueryEngine engine) {
    return Get_synset_meronym.Matcher.on(engine);
  }
  
  public Insert_synset_meronym getInsert_synset_meronym() {
    return Insert_synset_meronym.instance();
  }
  
  public Insert_synset_meronym.Matcher getInsert_synset_meronym(final ViatraQueryEngine engine) {
    return Insert_synset_meronym.Matcher.on(engine);
  }
  
  public Remove_synset_meronym getRemove_synset_meronym() {
    return Remove_synset_meronym.instance();
  }
  
  public Remove_synset_meronym.Matcher getRemove_synset_meronym(final ViatraQueryEngine engine) {
    return Remove_synset_meronym.Matcher.on(engine);
  }
  
  public Initial_synset_meronym getInitial_synset_meronym() {
    return Initial_synset_meronym.instance();
  }
  
  public Initial_synset_meronym.Matcher getInitial_synset_meronym(final ViatraQueryEngine engine) {
    return Initial_synset_meronym.Matcher.on(engine);
  }
  
  public Current_synset_meronym getCurrent_synset_meronym() {
    return Current_synset_meronym.instance();
  }
  
  public Current_synset_meronym.Matcher getCurrent_synset_meronym(final ViatraQueryEngine engine) {
    return Current_synset_meronym.Matcher.on(engine);
  }
  
  public Get_synset_holonym getGet_synset_holonym() {
    return Get_synset_holonym.instance();
  }
  
  public Get_synset_holonym.Matcher getGet_synset_holonym(final ViatraQueryEngine engine) {
    return Get_synset_holonym.Matcher.on(engine);
  }
  
  public Insert_synset_holonym getInsert_synset_holonym() {
    return Insert_synset_holonym.instance();
  }
  
  public Insert_synset_holonym.Matcher getInsert_synset_holonym(final ViatraQueryEngine engine) {
    return Insert_synset_holonym.Matcher.on(engine);
  }
  
  public Remove_synset_holonym getRemove_synset_holonym() {
    return Remove_synset_holonym.instance();
  }
  
  public Remove_synset_holonym.Matcher getRemove_synset_holonym(final ViatraQueryEngine engine) {
    return Remove_synset_holonym.Matcher.on(engine);
  }
  
  public Initial_synset_holonym getInitial_synset_holonym() {
    return Initial_synset_holonym.instance();
  }
  
  public Initial_synset_holonym.Matcher getInitial_synset_holonym(final ViatraQueryEngine engine) {
    return Initial_synset_holonym.Matcher.on(engine);
  }
  
  public Current_synset_holonym getCurrent_synset_holonym() {
    return Current_synset_holonym.instance();
  }
  
  public Current_synset_holonym.Matcher getCurrent_synset_holonym(final ViatraQueryEngine engine) {
    return Current_synset_holonym.Matcher.on(engine);
  }
}
