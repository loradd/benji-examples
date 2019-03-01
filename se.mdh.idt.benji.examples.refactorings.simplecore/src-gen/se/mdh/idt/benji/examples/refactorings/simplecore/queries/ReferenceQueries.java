/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/ReferenceQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Created_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_reference_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_reference_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_reference_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_reference_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_reference_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_reference_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_reference_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_reference_type;

/**
 * A pattern group formed of all public patterns defined in ReferenceQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ReferenceQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.simplecore.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_reference</li>
 * <li>current_reference</li>
 * <li>preserved_reference</li>
 * <li>created_reference</li>
 * <li>deleted_reference</li>
 * <li>initial_reference_name</li>
 * <li>current_reference_name</li>
 * <li>preserved_reference_name</li>
 * <li>set_reference_name</li>
 * <li>unset_reference_name</li>
 * <li>initial_reference_type</li>
 * <li>current_reference_type</li>
 * <li>preserved_reference_type</li>
 * <li>set_reference_type</li>
 * <li>unset_reference_type</li>
 * <li>initial_reference_opposite</li>
 * <li>current_reference_opposite</li>
 * <li>preserved_reference_opposite</li>
 * <li>set_reference_opposite</li>
 * <li>unset_reference_opposite</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ReferenceQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ReferenceQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new ReferenceQueries();
    }
    return INSTANCE;
  }
  
  private static ReferenceQueries INSTANCE;
  
  private ReferenceQueries() {
    querySpecifications.add(Initial_reference.instance());
    querySpecifications.add(Current_reference.instance());
    querySpecifications.add(Preserved_reference.instance());
    querySpecifications.add(Created_reference.instance());
    querySpecifications.add(Deleted_reference.instance());
    querySpecifications.add(Initial_reference_name.instance());
    querySpecifications.add(Current_reference_name.instance());
    querySpecifications.add(Preserved_reference_name.instance());
    querySpecifications.add(Set_reference_name.instance());
    querySpecifications.add(Unset_reference_name.instance());
    querySpecifications.add(Initial_reference_type.instance());
    querySpecifications.add(Current_reference_type.instance());
    querySpecifications.add(Preserved_reference_type.instance());
    querySpecifications.add(Set_reference_type.instance());
    querySpecifications.add(Unset_reference_type.instance());
    querySpecifications.add(Initial_reference_opposite.instance());
    querySpecifications.add(Current_reference_opposite.instance());
    querySpecifications.add(Preserved_reference_opposite.instance());
    querySpecifications.add(Set_reference_opposite.instance());
    querySpecifications.add(Unset_reference_opposite.instance());
  }
  
  public Initial_reference getInitial_reference() {
    return Initial_reference.instance();
  }
  
  public Initial_reference.Matcher getInitial_reference(final ViatraQueryEngine engine) {
    return Initial_reference.Matcher.on(engine);
  }
  
  public Current_reference getCurrent_reference() {
    return Current_reference.instance();
  }
  
  public Current_reference.Matcher getCurrent_reference(final ViatraQueryEngine engine) {
    return Current_reference.Matcher.on(engine);
  }
  
  public Preserved_reference getPreserved_reference() {
    return Preserved_reference.instance();
  }
  
  public Preserved_reference.Matcher getPreserved_reference(final ViatraQueryEngine engine) {
    return Preserved_reference.Matcher.on(engine);
  }
  
  public Created_reference getCreated_reference() {
    return Created_reference.instance();
  }
  
  public Created_reference.Matcher getCreated_reference(final ViatraQueryEngine engine) {
    return Created_reference.Matcher.on(engine);
  }
  
  public Deleted_reference getDeleted_reference() {
    return Deleted_reference.instance();
  }
  
  public Deleted_reference.Matcher getDeleted_reference(final ViatraQueryEngine engine) {
    return Deleted_reference.Matcher.on(engine);
  }
  
  public Initial_reference_name getInitial_reference_name() {
    return Initial_reference_name.instance();
  }
  
  public Initial_reference_name.Matcher getInitial_reference_name(final ViatraQueryEngine engine) {
    return Initial_reference_name.Matcher.on(engine);
  }
  
  public Current_reference_name getCurrent_reference_name() {
    return Current_reference_name.instance();
  }
  
  public Current_reference_name.Matcher getCurrent_reference_name(final ViatraQueryEngine engine) {
    return Current_reference_name.Matcher.on(engine);
  }
  
  public Preserved_reference_name getPreserved_reference_name() {
    return Preserved_reference_name.instance();
  }
  
  public Preserved_reference_name.Matcher getPreserved_reference_name(final ViatraQueryEngine engine) {
    return Preserved_reference_name.Matcher.on(engine);
  }
  
  public Set_reference_name getSet_reference_name() {
    return Set_reference_name.instance();
  }
  
  public Set_reference_name.Matcher getSet_reference_name(final ViatraQueryEngine engine) {
    return Set_reference_name.Matcher.on(engine);
  }
  
  public Unset_reference_name getUnset_reference_name() {
    return Unset_reference_name.instance();
  }
  
  public Unset_reference_name.Matcher getUnset_reference_name(final ViatraQueryEngine engine) {
    return Unset_reference_name.Matcher.on(engine);
  }
  
  public Initial_reference_type getInitial_reference_type() {
    return Initial_reference_type.instance();
  }
  
  public Initial_reference_type.Matcher getInitial_reference_type(final ViatraQueryEngine engine) {
    return Initial_reference_type.Matcher.on(engine);
  }
  
  public Current_reference_type getCurrent_reference_type() {
    return Current_reference_type.instance();
  }
  
  public Current_reference_type.Matcher getCurrent_reference_type(final ViatraQueryEngine engine) {
    return Current_reference_type.Matcher.on(engine);
  }
  
  public Preserved_reference_type getPreserved_reference_type() {
    return Preserved_reference_type.instance();
  }
  
  public Preserved_reference_type.Matcher getPreserved_reference_type(final ViatraQueryEngine engine) {
    return Preserved_reference_type.Matcher.on(engine);
  }
  
  public Set_reference_type getSet_reference_type() {
    return Set_reference_type.instance();
  }
  
  public Set_reference_type.Matcher getSet_reference_type(final ViatraQueryEngine engine) {
    return Set_reference_type.Matcher.on(engine);
  }
  
  public Unset_reference_type getUnset_reference_type() {
    return Unset_reference_type.instance();
  }
  
  public Unset_reference_type.Matcher getUnset_reference_type(final ViatraQueryEngine engine) {
    return Unset_reference_type.Matcher.on(engine);
  }
  
  public Initial_reference_opposite getInitial_reference_opposite() {
    return Initial_reference_opposite.instance();
  }
  
  public Initial_reference_opposite.Matcher getInitial_reference_opposite(final ViatraQueryEngine engine) {
    return Initial_reference_opposite.Matcher.on(engine);
  }
  
  public Current_reference_opposite getCurrent_reference_opposite() {
    return Current_reference_opposite.instance();
  }
  
  public Current_reference_opposite.Matcher getCurrent_reference_opposite(final ViatraQueryEngine engine) {
    return Current_reference_opposite.Matcher.on(engine);
  }
  
  public Preserved_reference_opposite getPreserved_reference_opposite() {
    return Preserved_reference_opposite.instance();
  }
  
  public Preserved_reference_opposite.Matcher getPreserved_reference_opposite(final ViatraQueryEngine engine) {
    return Preserved_reference_opposite.Matcher.on(engine);
  }
  
  public Set_reference_opposite getSet_reference_opposite() {
    return Set_reference_opposite.instance();
  }
  
  public Set_reference_opposite.Matcher getSet_reference_opposite(final ViatraQueryEngine engine) {
    return Set_reference_opposite.Matcher.on(engine);
  }
  
  public Unset_reference_opposite getUnset_reference_opposite() {
    return Unset_reference_opposite.instance();
  }
  
  public Unset_reference_opposite.Matcher getUnset_reference_opposite(final ViatraQueryEngine engine) {
    return Unset_reference_opposite.Matcher.on(engine);
  }
}
