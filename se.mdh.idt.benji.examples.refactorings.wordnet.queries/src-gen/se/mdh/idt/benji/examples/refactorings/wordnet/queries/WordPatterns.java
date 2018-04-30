/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/WordPatterns.vql
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Created_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_word_synsets;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Deleted_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word_synsets;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Inserted_word_synsets;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Preserved_word_synsets;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_word_synsets;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Set_word_name;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_word_name;

/**
 * A pattern group formed of all public patterns defined in WordPatterns.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file WordPatterns.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.wordnet.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_word</li>
 * <li>current_word</li>
 * <li>preserved_word</li>
 * <li>created_word</li>
 * <li>deleted_word</li>
 * <li>initial_word_name</li>
 * <li>current_word_name</li>
 * <li>preserved_word_name</li>
 * <li>set_word_name</li>
 * <li>unset_word_name</li>
 * <li>initial_word_synsets</li>
 * <li>current_word_synsets</li>
 * <li>preserved_word_synsets</li>
 * <li>inserted_word_synsets</li>
 * <li>removed_word_synsets</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-04-24T16:52+0200")
public final class WordPatterns extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static WordPatterns instance() {
    if (INSTANCE == null) {
        INSTANCE = new WordPatterns();
    }
    return INSTANCE;
  }
  
  private static WordPatterns INSTANCE;
  
  private WordPatterns() {
    querySpecifications.add(Initial_word.instance());
    querySpecifications.add(Current_word.instance());
    querySpecifications.add(Preserved_word.instance());
    querySpecifications.add(Created_word.instance());
    querySpecifications.add(Deleted_word.instance());
    querySpecifications.add(Initial_word_name.instance());
    querySpecifications.add(Current_word_name.instance());
    querySpecifications.add(Preserved_word_name.instance());
    querySpecifications.add(Set_word_name.instance());
    querySpecifications.add(Unset_word_name.instance());
    querySpecifications.add(Initial_word_synsets.instance());
    querySpecifications.add(Current_word_synsets.instance());
    querySpecifications.add(Preserved_word_synsets.instance());
    querySpecifications.add(Inserted_word_synsets.instance());
    querySpecifications.add(Removed_word_synsets.instance());
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
  
  public Preserved_word getPreserved_word() {
    return Preserved_word.instance();
  }
  
  public Preserved_word.Matcher getPreserved_word(final ViatraQueryEngine engine) {
    return Preserved_word.Matcher.on(engine);
  }
  
  public Created_word getCreated_word() {
    return Created_word.instance();
  }
  
  public Created_word.Matcher getCreated_word(final ViatraQueryEngine engine) {
    return Created_word.Matcher.on(engine);
  }
  
  public Deleted_word getDeleted_word() {
    return Deleted_word.instance();
  }
  
  public Deleted_word.Matcher getDeleted_word(final ViatraQueryEngine engine) {
    return Deleted_word.Matcher.on(engine);
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
  
  public Preserved_word_name getPreserved_word_name() {
    return Preserved_word_name.instance();
  }
  
  public Preserved_word_name.Matcher getPreserved_word_name(final ViatraQueryEngine engine) {
    return Preserved_word_name.Matcher.on(engine);
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
  
  public Initial_word_synsets getInitial_word_synsets() {
    return Initial_word_synsets.instance();
  }
  
  public Initial_word_synsets.Matcher getInitial_word_synsets(final ViatraQueryEngine engine) {
    return Initial_word_synsets.Matcher.on(engine);
  }
  
  public Current_word_synsets getCurrent_word_synsets() {
    return Current_word_synsets.instance();
  }
  
  public Current_word_synsets.Matcher getCurrent_word_synsets(final ViatraQueryEngine engine) {
    return Current_word_synsets.Matcher.on(engine);
  }
  
  public Preserved_word_synsets getPreserved_word_synsets() {
    return Preserved_word_synsets.instance();
  }
  
  public Preserved_word_synsets.Matcher getPreserved_word_synsets(final ViatraQueryEngine engine) {
    return Preserved_word_synsets.Matcher.on(engine);
  }
  
  public Inserted_word_synsets getInserted_word_synsets() {
    return Inserted_word_synsets.instance();
  }
  
  public Inserted_word_synsets.Matcher getInserted_word_synsets(final ViatraQueryEngine engine) {
    return Inserted_word_synsets.Matcher.on(engine);
  }
  
  public Removed_word_synsets getRemoved_word_synsets() {
    return Removed_word_synsets.instance();
  }
  
  public Removed_word_synsets.Matcher getRemoved_word_synsets(final ViatraQueryEngine engine) {
    return Removed_word_synsets.Matcher.on(engine);
  }
}
