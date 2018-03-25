/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/WordQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Create_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Delete_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Get_word_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_word_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Remove_word_synset;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Set_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_word_name;

/**
 * A pattern group formed of all public patterns defined in WordQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file WordQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.wordnet.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_word</li>
 * <li>create_word</li>
 * <li>delete_word</li>
 * <li>initial_word</li>
 * <li>current_word</li>
 * <li>get_word_name</li>
 * <li>set_word_name</li>
 * <li>unset_word_name</li>
 * <li>initial_word_name</li>
 * <li>current_word_name</li>
 * <li>get_word_synset</li>
 * <li>insert_word_synset</li>
 * <li>remove_word_synset</li>
 * <li>initial_word_synset</li>
 * <li>current_word_synset</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T22:01+0200")
public final class WordQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static WordQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new WordQueries();
    }
    return INSTANCE;
  }
  
  private static WordQueries INSTANCE;
  
  private WordQueries() {
    querySpecifications.add(Get_word.instance());
    querySpecifications.add(Create_word.instance());
    querySpecifications.add(Delete_word.instance());
    querySpecifications.add(Initial_word.instance());
    querySpecifications.add(Current_word.instance());
    querySpecifications.add(Get_word_name.instance());
    querySpecifications.add(Set_word_name.instance());
    querySpecifications.add(Unset_word_name.instance());
    querySpecifications.add(Initial_word_name.instance());
    querySpecifications.add(Current_word_name.instance());
    querySpecifications.add(Get_word_synset.instance());
    querySpecifications.add(Insert_word_synset.instance());
    querySpecifications.add(Remove_word_synset.instance());
    querySpecifications.add(Initial_word_synset.instance());
    querySpecifications.add(Current_word_synset.instance());
  }
  
  public Get_word getGet_word() {
    return Get_word.instance();
  }
  
  public Get_word.Matcher getGet_word(final ViatraQueryEngine engine) {
    return Get_word.Matcher.on(engine);
  }
  
  public Create_word getCreate_word() {
    return Create_word.instance();
  }
  
  public Create_word.Matcher getCreate_word(final ViatraQueryEngine engine) {
    return Create_word.Matcher.on(engine);
  }
  
  public Delete_word getDelete_word() {
    return Delete_word.instance();
  }
  
  public Delete_word.Matcher getDelete_word(final ViatraQueryEngine engine) {
    return Delete_word.Matcher.on(engine);
  }
  
  public Initial_word getInitial_word() {
    return Initial_word.instance();
  }
  
  public Initial_word.Matcher getInitial_word(final ViatraQueryEngine engine) {
    return Initial_word.Matcher.on(engine);
  }
  
  public Current_word getCurrent_word() {
    return Current_word.instance();
  }
  
  public Current_word.Matcher getCurrent_word(final ViatraQueryEngine engine) {
    return Current_word.Matcher.on(engine);
  }
  
  public Get_word_name getGet_word_name() {
    return Get_word_name.instance();
  }
  
  public Get_word_name.Matcher getGet_word_name(final ViatraQueryEngine engine) {
    return Get_word_name.Matcher.on(engine);
  }
  
  public Set_word_name getSet_word_name() {
    return Set_word_name.instance();
  }
  
  public Set_word_name.Matcher getSet_word_name(final ViatraQueryEngine engine) {
    return Set_word_name.Matcher.on(engine);
  }
  
  public Unset_word_name getUnset_word_name() {
    return Unset_word_name.instance();
  }
  
  public Unset_word_name.Matcher getUnset_word_name(final ViatraQueryEngine engine) {
    return Unset_word_name.Matcher.on(engine);
  }
  
  public Initial_word_name getInitial_word_name() {
    return Initial_word_name.instance();
  }
  
  public Initial_word_name.Matcher getInitial_word_name(final ViatraQueryEngine engine) {
    return Initial_word_name.Matcher.on(engine);
  }
  
  public Current_word_name getCurrent_word_name() {
    return Current_word_name.instance();
  }
  
  public Current_word_name.Matcher getCurrent_word_name(final ViatraQueryEngine engine) {
    return Current_word_name.Matcher.on(engine);
  }
  
  public Get_word_synset getGet_word_synset() {
    return Get_word_synset.instance();
  }
  
  public Get_word_synset.Matcher getGet_word_synset(final ViatraQueryEngine engine) {
    return Get_word_synset.Matcher.on(engine);
  }
  
  public Insert_word_synset getInsert_word_synset() {
    return Insert_word_synset.instance();
  }
  
  public Insert_word_synset.Matcher getInsert_word_synset(final ViatraQueryEngine engine) {
    return Insert_word_synset.Matcher.on(engine);
  }
  
  public Remove_word_synset getRemove_word_synset() {
    return Remove_word_synset.instance();
  }
  
  public Remove_word_synset.Matcher getRemove_word_synset(final ViatraQueryEngine engine) {
    return Remove_word_synset.Matcher.on(engine);
  }
  
  public Initial_word_synset getInitial_word_synset() {
    return Initial_word_synset.instance();
  }
  
  public Initial_word_synset.Matcher getInitial_word_synset(final ViatraQueryEngine engine) {
    return Initial_word_synset.Matcher.on(engine);
  }
  
  public Current_word_synset getCurrent_word_synset() {
    return Current_word_synset.instance();
  }
  
  public Current_word_synset.Matcher getCurrent_word_synset(final ViatraQueryEngine engine) {
    return Current_word_synset.Matcher.on(engine);
  }
}
