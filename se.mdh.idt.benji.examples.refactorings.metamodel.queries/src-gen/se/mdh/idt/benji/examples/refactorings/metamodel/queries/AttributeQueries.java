/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/AttributeQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_upper;

/**
 * A pattern group formed of all public patterns defined in AttributeQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file AttributeQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_attribute</li>
 * <li>create_attribute</li>
 * <li>delete_attribute</li>
 * <li>initial_attribute</li>
 * <li>current_attribute</li>
 * <li>get_attribute_name</li>
 * <li>set_attribute_name</li>
 * <li>unset_attribute_name</li>
 * <li>initial_attribute_name</li>
 * <li>current_attribute_name</li>
 * <li>get_attribute_owner</li>
 * <li>set_attribute_owner</li>
 * <li>unset_attribute_owner</li>
 * <li>initial_attribute_owner</li>
 * <li>current_attribute_owner</li>
 * <li>get_attribute_lower</li>
 * <li>set_attribute_lower</li>
 * <li>unset_attribute_lower</li>
 * <li>initial_attribute_lower</li>
 * <li>current_attribute_lower</li>
 * <li>get_attribute_upper</li>
 * <li>set_attribute_upper</li>
 * <li>unset_attribute_upper</li>
 * <li>initial_attribute_upper</li>
 * <li>current_attribute_upper</li>
 * <li>get_attribute_type</li>
 * <li>set_attribute_type</li>
 * <li>unset_attribute_type</li>
 * <li>initial_attribute_type</li>
 * <li>current_attribute_type</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:23+0200")
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
    querySpecifications.add(Get_attribute.instance());
    querySpecifications.add(Create_attribute.instance());
    querySpecifications.add(Delete_attribute.instance());
    querySpecifications.add(Initial_attribute.instance());
    querySpecifications.add(Current_attribute.instance());
    querySpecifications.add(Get_attribute_name.instance());
    querySpecifications.add(Set_attribute_name.instance());
    querySpecifications.add(Unset_attribute_name.instance());
    querySpecifications.add(Initial_attribute_name.instance());
    querySpecifications.add(Current_attribute_name.instance());
    querySpecifications.add(Get_attribute_owner.instance());
    querySpecifications.add(Set_attribute_owner.instance());
    querySpecifications.add(Unset_attribute_owner.instance());
    querySpecifications.add(Initial_attribute_owner.instance());
    querySpecifications.add(Current_attribute_owner.instance());
    querySpecifications.add(Get_attribute_lower.instance());
    querySpecifications.add(Set_attribute_lower.instance());
    querySpecifications.add(Unset_attribute_lower.instance());
    querySpecifications.add(Initial_attribute_lower.instance());
    querySpecifications.add(Current_attribute_lower.instance());
    querySpecifications.add(Get_attribute_upper.instance());
    querySpecifications.add(Set_attribute_upper.instance());
    querySpecifications.add(Unset_attribute_upper.instance());
    querySpecifications.add(Initial_attribute_upper.instance());
    querySpecifications.add(Current_attribute_upper.instance());
    querySpecifications.add(Get_attribute_type.instance());
    querySpecifications.add(Set_attribute_type.instance());
    querySpecifications.add(Unset_attribute_type.instance());
    querySpecifications.add(Initial_attribute_type.instance());
    querySpecifications.add(Current_attribute_type.instance());
  }
  
  public Get_attribute getGet_attribute() {
    return Get_attribute.instance();
  }
  
  public Get_attribute.Matcher getGet_attribute(final ViatraQueryEngine engine) {
    return Get_attribute.Matcher.on(engine);
  }
  
  public Create_attribute getCreate_attribute() {
    return Create_attribute.instance();
  }
  
  public Create_attribute.Matcher getCreate_attribute(final ViatraQueryEngine engine) {
    return Create_attribute.Matcher.on(engine);
  }
  
  public Delete_attribute getDelete_attribute() {
    return Delete_attribute.instance();
  }
  
  public Delete_attribute.Matcher getDelete_attribute(final ViatraQueryEngine engine) {
    return Delete_attribute.Matcher.on(engine);
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
  
  public Get_attribute_name getGet_attribute_name() {
    return Get_attribute_name.instance();
  }
  
  public Get_attribute_name.Matcher getGet_attribute_name(final ViatraQueryEngine engine) {
    return Get_attribute_name.Matcher.on(engine);
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
  
  public Get_attribute_owner getGet_attribute_owner() {
    return Get_attribute_owner.instance();
  }
  
  public Get_attribute_owner.Matcher getGet_attribute_owner(final ViatraQueryEngine engine) {
    return Get_attribute_owner.Matcher.on(engine);
  }
  
  public Set_attribute_owner getSet_attribute_owner() {
    return Set_attribute_owner.instance();
  }
  
  public Set_attribute_owner.Matcher getSet_attribute_owner(final ViatraQueryEngine engine) {
    return Set_attribute_owner.Matcher.on(engine);
  }
  
  public Unset_attribute_owner getUnset_attribute_owner() {
    return Unset_attribute_owner.instance();
  }
  
  public Unset_attribute_owner.Matcher getUnset_attribute_owner(final ViatraQueryEngine engine) {
    return Unset_attribute_owner.Matcher.on(engine);
  }
  
  public Initial_attribute_owner getInitial_attribute_owner() {
    return Initial_attribute_owner.instance();
  }
  
  public Initial_attribute_owner.Matcher getInitial_attribute_owner(final ViatraQueryEngine engine) {
    return Initial_attribute_owner.Matcher.on(engine);
  }
  
  public Current_attribute_owner getCurrent_attribute_owner() {
    return Current_attribute_owner.instance();
  }
  
  public Current_attribute_owner.Matcher getCurrent_attribute_owner(final ViatraQueryEngine engine) {
    return Current_attribute_owner.Matcher.on(engine);
  }
  
  public Get_attribute_lower getGet_attribute_lower() {
    return Get_attribute_lower.instance();
  }
  
  public Get_attribute_lower.Matcher getGet_attribute_lower(final ViatraQueryEngine engine) {
    return Get_attribute_lower.Matcher.on(engine);
  }
  
  public Set_attribute_lower getSet_attribute_lower() {
    return Set_attribute_lower.instance();
  }
  
  public Set_attribute_lower.Matcher getSet_attribute_lower(final ViatraQueryEngine engine) {
    return Set_attribute_lower.Matcher.on(engine);
  }
  
  public Unset_attribute_lower getUnset_attribute_lower() {
    return Unset_attribute_lower.instance();
  }
  
  public Unset_attribute_lower.Matcher getUnset_attribute_lower(final ViatraQueryEngine engine) {
    return Unset_attribute_lower.Matcher.on(engine);
  }
  
  public Initial_attribute_lower getInitial_attribute_lower() {
    return Initial_attribute_lower.instance();
  }
  
  public Initial_attribute_lower.Matcher getInitial_attribute_lower(final ViatraQueryEngine engine) {
    return Initial_attribute_lower.Matcher.on(engine);
  }
  
  public Current_attribute_lower getCurrent_attribute_lower() {
    return Current_attribute_lower.instance();
  }
  
  public Current_attribute_lower.Matcher getCurrent_attribute_lower(final ViatraQueryEngine engine) {
    return Current_attribute_lower.Matcher.on(engine);
  }
  
  public Get_attribute_upper getGet_attribute_upper() {
    return Get_attribute_upper.instance();
  }
  
  public Get_attribute_upper.Matcher getGet_attribute_upper(final ViatraQueryEngine engine) {
    return Get_attribute_upper.Matcher.on(engine);
  }
  
  public Set_attribute_upper getSet_attribute_upper() {
    return Set_attribute_upper.instance();
  }
  
  public Set_attribute_upper.Matcher getSet_attribute_upper(final ViatraQueryEngine engine) {
    return Set_attribute_upper.Matcher.on(engine);
  }
  
  public Unset_attribute_upper getUnset_attribute_upper() {
    return Unset_attribute_upper.instance();
  }
  
  public Unset_attribute_upper.Matcher getUnset_attribute_upper(final ViatraQueryEngine engine) {
    return Unset_attribute_upper.Matcher.on(engine);
  }
  
  public Initial_attribute_upper getInitial_attribute_upper() {
    return Initial_attribute_upper.instance();
  }
  
  public Initial_attribute_upper.Matcher getInitial_attribute_upper(final ViatraQueryEngine engine) {
    return Initial_attribute_upper.Matcher.on(engine);
  }
  
  public Current_attribute_upper getCurrent_attribute_upper() {
    return Current_attribute_upper.instance();
  }
  
  public Current_attribute_upper.Matcher getCurrent_attribute_upper(final ViatraQueryEngine engine) {
    return Current_attribute_upper.Matcher.on(engine);
  }
  
  public Get_attribute_type getGet_attribute_type() {
    return Get_attribute_type.instance();
  }
  
  public Get_attribute_type.Matcher getGet_attribute_type(final ViatraQueryEngine engine) {
    return Get_attribute_type.Matcher.on(engine);
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
}
