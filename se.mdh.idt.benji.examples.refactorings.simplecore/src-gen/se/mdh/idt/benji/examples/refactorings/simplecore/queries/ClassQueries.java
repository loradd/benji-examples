/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/ClassQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Added_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Added_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Added_class_super;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Created_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_class_abstract;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_class_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_class_super;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_class_abstract;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_class_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_class_super;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_abstract;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_super;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Removed_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Removed_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Removed_class_super;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_class_abstract;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_class_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_class_abstract;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_class_name;

/**
 * A pattern group formed of all public patterns defined in ClassQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ClassQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.simplecore.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_class</li>
 * <li>current_class</li>
 * <li>preserved_class</li>
 * <li>created_class</li>
 * <li>deleted_class</li>
 * <li>initial_class_name</li>
 * <li>current_class_name</li>
 * <li>preserved_class_name</li>
 * <li>set_class_name</li>
 * <li>unset_class_name</li>
 * <li>initial_class_abstract</li>
 * <li>current_class_abstract</li>
 * <li>preserved_class_abstract</li>
 * <li>set_class_abstract</li>
 * <li>unset_class_abstract</li>
 * <li>initial_class_super</li>
 * <li>current_class_super</li>
 * <li>preserved_class_super</li>
 * <li>added_class_super</li>
 * <li>removed_class_super</li>
 * <li>initial_class_attribute</li>
 * <li>current_class_attribute</li>
 * <li>preserved_class_attribute</li>
 * <li>added_class_attribute</li>
 * <li>removed_class_attribute</li>
 * <li>initial_class_reference</li>
 * <li>current_class_reference</li>
 * <li>preserved_class_reference</li>
 * <li>added_class_reference</li>
 * <li>removed_class_reference</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class ClassQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ClassQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new ClassQueries();
    }
    return INSTANCE;
  }
  
  private static ClassQueries INSTANCE;
  
  private ClassQueries() {
    querySpecifications.add(Initial_class.instance());
    querySpecifications.add(Current_class.instance());
    querySpecifications.add(Preserved_class.instance());
    querySpecifications.add(Created_class.instance());
    querySpecifications.add(Deleted_class.instance());
    querySpecifications.add(Initial_class_name.instance());
    querySpecifications.add(Current_class_name.instance());
    querySpecifications.add(Preserved_class_name.instance());
    querySpecifications.add(Set_class_name.instance());
    querySpecifications.add(Unset_class_name.instance());
    querySpecifications.add(Initial_class_abstract.instance());
    querySpecifications.add(Current_class_abstract.instance());
    querySpecifications.add(Preserved_class_abstract.instance());
    querySpecifications.add(Set_class_abstract.instance());
    querySpecifications.add(Unset_class_abstract.instance());
    querySpecifications.add(Initial_class_super.instance());
    querySpecifications.add(Current_class_super.instance());
    querySpecifications.add(Preserved_class_super.instance());
    querySpecifications.add(Added_class_super.instance());
    querySpecifications.add(Removed_class_super.instance());
    querySpecifications.add(Initial_class_attribute.instance());
    querySpecifications.add(Current_class_attribute.instance());
    querySpecifications.add(Preserved_class_attribute.instance());
    querySpecifications.add(Added_class_attribute.instance());
    querySpecifications.add(Removed_class_attribute.instance());
    querySpecifications.add(Initial_class_reference.instance());
    querySpecifications.add(Current_class_reference.instance());
    querySpecifications.add(Preserved_class_reference.instance());
    querySpecifications.add(Added_class_reference.instance());
    querySpecifications.add(Removed_class_reference.instance());
  }
  
  public Initial_class getInitial_class() {
    return Initial_class.instance();
  }
  
  public Initial_class.Matcher getInitial_class(final ViatraQueryEngine engine) {
    return Initial_class.Matcher.on(engine);
  }
  
  public Current_class getCurrent_class() {
    return Current_class.instance();
  }
  
  public Current_class.Matcher getCurrent_class(final ViatraQueryEngine engine) {
    return Current_class.Matcher.on(engine);
  }
  
  public Preserved_class getPreserved_class() {
    return Preserved_class.instance();
  }
  
  public Preserved_class.Matcher getPreserved_class(final ViatraQueryEngine engine) {
    return Preserved_class.Matcher.on(engine);
  }
  
  public Created_class getCreated_class() {
    return Created_class.instance();
  }
  
  public Created_class.Matcher getCreated_class(final ViatraQueryEngine engine) {
    return Created_class.Matcher.on(engine);
  }
  
  public Deleted_class getDeleted_class() {
    return Deleted_class.instance();
  }
  
  public Deleted_class.Matcher getDeleted_class(final ViatraQueryEngine engine) {
    return Deleted_class.Matcher.on(engine);
  }
  
  public Initial_class_name getInitial_class_name() {
    return Initial_class_name.instance();
  }
  
  public Initial_class_name.Matcher getInitial_class_name(final ViatraQueryEngine engine) {
    return Initial_class_name.Matcher.on(engine);
  }
  
  public Current_class_name getCurrent_class_name() {
    return Current_class_name.instance();
  }
  
  public Current_class_name.Matcher getCurrent_class_name(final ViatraQueryEngine engine) {
    return Current_class_name.Matcher.on(engine);
  }
  
  public Preserved_class_name getPreserved_class_name() {
    return Preserved_class_name.instance();
  }
  
  public Preserved_class_name.Matcher getPreserved_class_name(final ViatraQueryEngine engine) {
    return Preserved_class_name.Matcher.on(engine);
  }
  
  public Set_class_name getSet_class_name() {
    return Set_class_name.instance();
  }
  
  public Set_class_name.Matcher getSet_class_name(final ViatraQueryEngine engine) {
    return Set_class_name.Matcher.on(engine);
  }
  
  public Unset_class_name getUnset_class_name() {
    return Unset_class_name.instance();
  }
  
  public Unset_class_name.Matcher getUnset_class_name(final ViatraQueryEngine engine) {
    return Unset_class_name.Matcher.on(engine);
  }
  
  public Initial_class_abstract getInitial_class_abstract() {
    return Initial_class_abstract.instance();
  }
  
  public Initial_class_abstract.Matcher getInitial_class_abstract(final ViatraQueryEngine engine) {
    return Initial_class_abstract.Matcher.on(engine);
  }
  
  public Current_class_abstract getCurrent_class_abstract() {
    return Current_class_abstract.instance();
  }
  
  public Current_class_abstract.Matcher getCurrent_class_abstract(final ViatraQueryEngine engine) {
    return Current_class_abstract.Matcher.on(engine);
  }
  
  public Preserved_class_abstract getPreserved_class_abstract() {
    return Preserved_class_abstract.instance();
  }
  
  public Preserved_class_abstract.Matcher getPreserved_class_abstract(final ViatraQueryEngine engine) {
    return Preserved_class_abstract.Matcher.on(engine);
  }
  
  public Set_class_abstract getSet_class_abstract() {
    return Set_class_abstract.instance();
  }
  
  public Set_class_abstract.Matcher getSet_class_abstract(final ViatraQueryEngine engine) {
    return Set_class_abstract.Matcher.on(engine);
  }
  
  public Unset_class_abstract getUnset_class_abstract() {
    return Unset_class_abstract.instance();
  }
  
  public Unset_class_abstract.Matcher getUnset_class_abstract(final ViatraQueryEngine engine) {
    return Unset_class_abstract.Matcher.on(engine);
  }
  
  public Initial_class_super getInitial_class_super() {
    return Initial_class_super.instance();
  }
  
  public Initial_class_super.Matcher getInitial_class_super(final ViatraQueryEngine engine) {
    return Initial_class_super.Matcher.on(engine);
  }
  
  public Current_class_super getCurrent_class_super() {
    return Current_class_super.instance();
  }
  
  public Current_class_super.Matcher getCurrent_class_super(final ViatraQueryEngine engine) {
    return Current_class_super.Matcher.on(engine);
  }
  
  public Preserved_class_super getPreserved_class_super() {
    return Preserved_class_super.instance();
  }
  
  public Preserved_class_super.Matcher getPreserved_class_super(final ViatraQueryEngine engine) {
    return Preserved_class_super.Matcher.on(engine);
  }
  
  public Added_class_super getAdded_class_super() {
    return Added_class_super.instance();
  }
  
  public Added_class_super.Matcher getAdded_class_super(final ViatraQueryEngine engine) {
    return Added_class_super.Matcher.on(engine);
  }
  
  public Removed_class_super getRemoved_class_super() {
    return Removed_class_super.instance();
  }
  
  public Removed_class_super.Matcher getRemoved_class_super(final ViatraQueryEngine engine) {
    return Removed_class_super.Matcher.on(engine);
  }
  
  public Initial_class_attribute getInitial_class_attribute() {
    return Initial_class_attribute.instance();
  }
  
  public Initial_class_attribute.Matcher getInitial_class_attribute(final ViatraQueryEngine engine) {
    return Initial_class_attribute.Matcher.on(engine);
  }
  
  public Current_class_attribute getCurrent_class_attribute() {
    return Current_class_attribute.instance();
  }
  
  public Current_class_attribute.Matcher getCurrent_class_attribute(final ViatraQueryEngine engine) {
    return Current_class_attribute.Matcher.on(engine);
  }
  
  public Preserved_class_attribute getPreserved_class_attribute() {
    return Preserved_class_attribute.instance();
  }
  
  public Preserved_class_attribute.Matcher getPreserved_class_attribute(final ViatraQueryEngine engine) {
    return Preserved_class_attribute.Matcher.on(engine);
  }
  
  public Added_class_attribute getAdded_class_attribute() {
    return Added_class_attribute.instance();
  }
  
  public Added_class_attribute.Matcher getAdded_class_attribute(final ViatraQueryEngine engine) {
    return Added_class_attribute.Matcher.on(engine);
  }
  
  public Removed_class_attribute getRemoved_class_attribute() {
    return Removed_class_attribute.instance();
  }
  
  public Removed_class_attribute.Matcher getRemoved_class_attribute(final ViatraQueryEngine engine) {
    return Removed_class_attribute.Matcher.on(engine);
  }
  
  public Initial_class_reference getInitial_class_reference() {
    return Initial_class_reference.instance();
  }
  
  public Initial_class_reference.Matcher getInitial_class_reference(final ViatraQueryEngine engine) {
    return Initial_class_reference.Matcher.on(engine);
  }
  
  public Current_class_reference getCurrent_class_reference() {
    return Current_class_reference.instance();
  }
  
  public Current_class_reference.Matcher getCurrent_class_reference(final ViatraQueryEngine engine) {
    return Current_class_reference.Matcher.on(engine);
  }
  
  public Preserved_class_reference getPreserved_class_reference() {
    return Preserved_class_reference.instance();
  }
  
  public Preserved_class_reference.Matcher getPreserved_class_reference(final ViatraQueryEngine engine) {
    return Preserved_class_reference.Matcher.on(engine);
  }
  
  public Added_class_reference getAdded_class_reference() {
    return Added_class_reference.instance();
  }
  
  public Added_class_reference.Matcher getAdded_class_reference(final ViatraQueryEngine engine) {
    return Added_class_reference.Matcher.on(engine);
  }
  
  public Removed_class_reference getRemoved_class_reference() {
    return Removed_class_reference.instance();
  }
  
  public Removed_class_reference.Matcher getRemoved_class_reference(final ViatraQueryEngine engine) {
    return Removed_class_reference.Matcher.on(engine);
  }
}
