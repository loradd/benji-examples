/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/AttributeQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Created_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_attribute_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_attribute_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_attribute_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_attribute_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_attribute_type;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_attribute_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_attribute_type;

/**
 * A pattern group formed of all public patterns defined in AttributeQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file AttributeQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.simplecore.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_attribute</li>
 * <li>current_attribute</li>
 * <li>preserved_attribute</li>
 * <li>created_attribute</li>
 * <li>deleted_attribute</li>
 * <li>initial_attribute_name</li>
 * <li>current_attribute_name</li>
 * <li>set_attribute_name</li>
 * <li>unset_attribute_name</li>
 * <li>initial_attribute_type</li>
 * <li>current_attribute_type</li>
 * <li>preserved_attribute_type</li>
 * <li>set_attribute_type</li>
 * <li>unset_attribute_type</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class AttributeQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static AttributeQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new AttributeQueries();
    }
    return INSTANCE;
  }
  
  private static AttributeQueries INSTANCE;
  
  private AttributeQueries() {
    querySpecifications.add(Initial_attribute.instance());
    querySpecifications.add(Current_attribute.instance());
    querySpecifications.add(Preserved_attribute.instance());
    querySpecifications.add(Created_attribute.instance());
    querySpecifications.add(Deleted_attribute.instance());
    querySpecifications.add(Initial_attribute_name.instance());
    querySpecifications.add(Current_attribute_name.instance());
    querySpecifications.add(Set_attribute_name.instance());
    querySpecifications.add(Unset_attribute_name.instance());
    querySpecifications.add(Initial_attribute_type.instance());
    querySpecifications.add(Current_attribute_type.instance());
    querySpecifications.add(Preserved_attribute_type.instance());
    querySpecifications.add(Set_attribute_type.instance());
    querySpecifications.add(Unset_attribute_type.instance());
  }
  
  public Initial_attribute getInitial_attribute() {
    return Initial_attribute.instance();
  }
  
  public Initial_attribute.Matcher getInitial_attribute(final ViatraQueryEngine engine) {
    return Initial_attribute.Matcher.on(engine);
  }
  
  public Current_attribute getCurrent_attribute() {
    return Current_attribute.instance();
  }
  
  public Current_attribute.Matcher getCurrent_attribute(final ViatraQueryEngine engine) {
    return Current_attribute.Matcher.on(engine);
  }
  
  public Preserved_attribute getPreserved_attribute() {
    return Preserved_attribute.instance();
  }
  
  public Preserved_attribute.Matcher getPreserved_attribute(final ViatraQueryEngine engine) {
    return Preserved_attribute.Matcher.on(engine);
  }
  
  public Created_attribute getCreated_attribute() {
    return Created_attribute.instance();
  }
  
  public Created_attribute.Matcher getCreated_attribute(final ViatraQueryEngine engine) {
    return Created_attribute.Matcher.on(engine);
  }
  
  public Deleted_attribute getDeleted_attribute() {
    return Deleted_attribute.instance();
  }
  
  public Deleted_attribute.Matcher getDeleted_attribute(final ViatraQueryEngine engine) {
    return Deleted_attribute.Matcher.on(engine);
  }
  
  public Initial_attribute_name getInitial_attribute_name() {
    return Initial_attribute_name.instance();
  }
  
  public Initial_attribute_name.Matcher getInitial_attribute_name(final ViatraQueryEngine engine) {
    return Initial_attribute_name.Matcher.on(engine);
  }
  
  public Current_attribute_name getCurrent_attribute_name() {
    return Current_attribute_name.instance();
  }
  
  public Current_attribute_name.Matcher getCurrent_attribute_name(final ViatraQueryEngine engine) {
    return Current_attribute_name.Matcher.on(engine);
  }
  
  public Set_attribute_name getSet_attribute_name() {
    return Set_attribute_name.instance();
  }
  
  public Set_attribute_name.Matcher getSet_attribute_name(final ViatraQueryEngine engine) {
    return Set_attribute_name.Matcher.on(engine);
  }
  
  public Unset_attribute_name getUnset_attribute_name() {
    return Unset_attribute_name.instance();
  }
  
  public Unset_attribute_name.Matcher getUnset_attribute_name(final ViatraQueryEngine engine) {
    return Unset_attribute_name.Matcher.on(engine);
  }
  
  public Initial_attribute_type getInitial_attribute_type() {
    return Initial_attribute_type.instance();
  }
  
  public Initial_attribute_type.Matcher getInitial_attribute_type(final ViatraQueryEngine engine) {
    return Initial_attribute_type.Matcher.on(engine);
  }
  
  public Current_attribute_type getCurrent_attribute_type() {
    return Current_attribute_type.instance();
  }
  
  public Current_attribute_type.Matcher getCurrent_attribute_type(final ViatraQueryEngine engine) {
    return Current_attribute_type.Matcher.on(engine);
  }
  
  public Preserved_attribute_type getPreserved_attribute_type() {
    return Preserved_attribute_type.instance();
  }
  
  public Preserved_attribute_type.Matcher getPreserved_attribute_type(final ViatraQueryEngine engine) {
    return Preserved_attribute_type.Matcher.on(engine);
  }
  
  public Set_attribute_type getSet_attribute_type() {
    return Set_attribute_type.instance();
  }
  
  public Set_attribute_type.Matcher getSet_attribute_type(final ViatraQueryEngine engine) {
    return Set_attribute_type.Matcher.on(engine);
  }
  
  public Unset_attribute_type getUnset_attribute_type() {
    return Unset_attribute_type.instance();
  }
  
  public Unset_attribute_type.Matcher getUnset_attribute_type(final ViatraQueryEngine engine) {
    return Unset_attribute_type.Matcher.on(engine);
  }
}
