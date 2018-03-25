/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Reference.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_upper;

/**
 * A pattern group formed of all public patterns defined in Reference.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Reference.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_reference</li>
 * <li>create_reference</li>
 * <li>delete_reference</li>
 * <li>initial_reference</li>
 * <li>current_reference</li>
 * <li>get_reference_name</li>
 * <li>set_reference_name</li>
 * <li>unset_reference_name</li>
 * <li>initial_reference_name</li>
 * <li>current_reference_name</li>
 * <li>get_reference_owner</li>
 * <li>set_reference_owner</li>
 * <li>unset_reference_owner</li>
 * <li>initial_reference_owner</li>
 * <li>current_reference_owner</li>
 * <li>get_reference_lower</li>
 * <li>set_reference_lower</li>
 * <li>unset_reference_lower</li>
 * <li>initial_reference_lower</li>
 * <li>current_reference_lower</li>
 * <li>get_reference_upper</li>
 * <li>set_reference_upper</li>
 * <li>unset_reference_upper</li>
 * <li>initial_reference_upper</li>
 * <li>current_reference_upper</li>
 * <li>get_reference_type</li>
 * <li>set_reference_type</li>
 * <li>unset_reference_type</li>
 * <li>initial_reference_type</li>
 * <li>current_reference_type</li>
 * <li>get_reference_containment</li>
 * <li>set_reference_containment</li>
 * <li>unset_reference_containment</li>
 * <li>initial_reference_containment</li>
 * <li>current_reference_containment</li>
 * <li>get_reference_opposite</li>
 * <li>set_reference_opposite</li>
 * <li>unset_reference_opposite</li>
 * <li>initial_reference_opposite</li>
 * <li>current_reference_opposite</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class Reference extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Reference instance() {
    if (INSTANCE == null) {
        INSTANCE = new Reference();
    }
    return INSTANCE;
  }
  
  private static Reference INSTANCE;
  
  private Reference() {
    querySpecifications.add(Get_reference.instance());
    querySpecifications.add(Create_reference.instance());
    querySpecifications.add(Delete_reference.instance());
    querySpecifications.add(Initial_reference.instance());
    querySpecifications.add(Current_reference.instance());
    querySpecifications.add(Get_reference_name.instance());
    querySpecifications.add(Set_reference_name.instance());
    querySpecifications.add(Unset_reference_name.instance());
    querySpecifications.add(Initial_reference_name.instance());
    querySpecifications.add(Current_reference_name.instance());
    querySpecifications.add(Get_reference_owner.instance());
    querySpecifications.add(Set_reference_owner.instance());
    querySpecifications.add(Unset_reference_owner.instance());
    querySpecifications.add(Initial_reference_owner.instance());
    querySpecifications.add(Current_reference_owner.instance());
    querySpecifications.add(Get_reference_lower.instance());
    querySpecifications.add(Set_reference_lower.instance());
    querySpecifications.add(Unset_reference_lower.instance());
    querySpecifications.add(Initial_reference_lower.instance());
    querySpecifications.add(Current_reference_lower.instance());
    querySpecifications.add(Get_reference_upper.instance());
    querySpecifications.add(Set_reference_upper.instance());
    querySpecifications.add(Unset_reference_upper.instance());
    querySpecifications.add(Initial_reference_upper.instance());
    querySpecifications.add(Current_reference_upper.instance());
    querySpecifications.add(Get_reference_type.instance());
    querySpecifications.add(Set_reference_type.instance());
    querySpecifications.add(Unset_reference_type.instance());
    querySpecifications.add(Initial_reference_type.instance());
    querySpecifications.add(Current_reference_type.instance());
    querySpecifications.add(Get_reference_containment.instance());
    querySpecifications.add(Set_reference_containment.instance());
    querySpecifications.add(Unset_reference_containment.instance());
    querySpecifications.add(Initial_reference_containment.instance());
    querySpecifications.add(Current_reference_containment.instance());
    querySpecifications.add(Get_reference_opposite.instance());
    querySpecifications.add(Set_reference_opposite.instance());
    querySpecifications.add(Unset_reference_opposite.instance());
    querySpecifications.add(Initial_reference_opposite.instance());
    querySpecifications.add(Current_reference_opposite.instance());
  }
  
  public Get_reference getGet_reference() {
    return Get_reference.instance();
  }
  
  public Get_reference.Matcher getGet_reference(final ViatraQueryEngine engine) {
    return Get_reference.Matcher.on(engine);
  }
  
  public Create_reference getCreate_reference() {
    return Create_reference.instance();
  }
  
  public Create_reference.Matcher getCreate_reference(final ViatraQueryEngine engine) {
    return Create_reference.Matcher.on(engine);
  }
  
  public Delete_reference getDelete_reference() {
    return Delete_reference.instance();
  }
  
  public Delete_reference.Matcher getDelete_reference(final ViatraQueryEngine engine) {
    return Delete_reference.Matcher.on(engine);
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
  
  public Get_reference_name getGet_reference_name() {
    return Get_reference_name.instance();
  }
  
  public Get_reference_name.Matcher getGet_reference_name(final ViatraQueryEngine engine) {
    return Get_reference_name.Matcher.on(engine);
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
  
  public Get_reference_owner getGet_reference_owner() {
    return Get_reference_owner.instance();
  }
  
  public Get_reference_owner.Matcher getGet_reference_owner(final ViatraQueryEngine engine) {
    return Get_reference_owner.Matcher.on(engine);
  }
  
  public Set_reference_owner getSet_reference_owner() {
    return Set_reference_owner.instance();
  }
  
  public Set_reference_owner.Matcher getSet_reference_owner(final ViatraQueryEngine engine) {
    return Set_reference_owner.Matcher.on(engine);
  }
  
  public Unset_reference_owner getUnset_reference_owner() {
    return Unset_reference_owner.instance();
  }
  
  public Unset_reference_owner.Matcher getUnset_reference_owner(final ViatraQueryEngine engine) {
    return Unset_reference_owner.Matcher.on(engine);
  }
  
  public Initial_reference_owner getInitial_reference_owner() {
    return Initial_reference_owner.instance();
  }
  
  public Initial_reference_owner.Matcher getInitial_reference_owner(final ViatraQueryEngine engine) {
    return Initial_reference_owner.Matcher.on(engine);
  }
  
  public Current_reference_owner getCurrent_reference_owner() {
    return Current_reference_owner.instance();
  }
  
  public Current_reference_owner.Matcher getCurrent_reference_owner(final ViatraQueryEngine engine) {
    return Current_reference_owner.Matcher.on(engine);
  }
  
  public Get_reference_lower getGet_reference_lower() {
    return Get_reference_lower.instance();
  }
  
  public Get_reference_lower.Matcher getGet_reference_lower(final ViatraQueryEngine engine) {
    return Get_reference_lower.Matcher.on(engine);
  }
  
  public Set_reference_lower getSet_reference_lower() {
    return Set_reference_lower.instance();
  }
  
  public Set_reference_lower.Matcher getSet_reference_lower(final ViatraQueryEngine engine) {
    return Set_reference_lower.Matcher.on(engine);
  }
  
  public Unset_reference_lower getUnset_reference_lower() {
    return Unset_reference_lower.instance();
  }
  
  public Unset_reference_lower.Matcher getUnset_reference_lower(final ViatraQueryEngine engine) {
    return Unset_reference_lower.Matcher.on(engine);
  }
  
  public Initial_reference_lower getInitial_reference_lower() {
    return Initial_reference_lower.instance();
  }
  
  public Initial_reference_lower.Matcher getInitial_reference_lower(final ViatraQueryEngine engine) {
    return Initial_reference_lower.Matcher.on(engine);
  }
  
  public Current_reference_lower getCurrent_reference_lower() {
    return Current_reference_lower.instance();
  }
  
  public Current_reference_lower.Matcher getCurrent_reference_lower(final ViatraQueryEngine engine) {
    return Current_reference_lower.Matcher.on(engine);
  }
  
  public Get_reference_upper getGet_reference_upper() {
    return Get_reference_upper.instance();
  }
  
  public Get_reference_upper.Matcher getGet_reference_upper(final ViatraQueryEngine engine) {
    return Get_reference_upper.Matcher.on(engine);
  }
  
  public Set_reference_upper getSet_reference_upper() {
    return Set_reference_upper.instance();
  }
  
  public Set_reference_upper.Matcher getSet_reference_upper(final ViatraQueryEngine engine) {
    return Set_reference_upper.Matcher.on(engine);
  }
  
  public Unset_reference_upper getUnset_reference_upper() {
    return Unset_reference_upper.instance();
  }
  
  public Unset_reference_upper.Matcher getUnset_reference_upper(final ViatraQueryEngine engine) {
    return Unset_reference_upper.Matcher.on(engine);
  }
  
  public Initial_reference_upper getInitial_reference_upper() {
    return Initial_reference_upper.instance();
  }
  
  public Initial_reference_upper.Matcher getInitial_reference_upper(final ViatraQueryEngine engine) {
    return Initial_reference_upper.Matcher.on(engine);
  }
  
  public Current_reference_upper getCurrent_reference_upper() {
    return Current_reference_upper.instance();
  }
  
  public Current_reference_upper.Matcher getCurrent_reference_upper(final ViatraQueryEngine engine) {
    return Current_reference_upper.Matcher.on(engine);
  }
  
  public Get_reference_type getGet_reference_type() {
    return Get_reference_type.instance();
  }
  
  public Get_reference_type.Matcher getGet_reference_type(final ViatraQueryEngine engine) {
    return Get_reference_type.Matcher.on(engine);
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
  
  public Get_reference_containment getGet_reference_containment() {
    return Get_reference_containment.instance();
  }
  
  public Get_reference_containment.Matcher getGet_reference_containment(final ViatraQueryEngine engine) {
    return Get_reference_containment.Matcher.on(engine);
  }
  
  public Set_reference_containment getSet_reference_containment() {
    return Set_reference_containment.instance();
  }
  
  public Set_reference_containment.Matcher getSet_reference_containment(final ViatraQueryEngine engine) {
    return Set_reference_containment.Matcher.on(engine);
  }
  
  public Unset_reference_containment getUnset_reference_containment() {
    return Unset_reference_containment.instance();
  }
  
  public Unset_reference_containment.Matcher getUnset_reference_containment(final ViatraQueryEngine engine) {
    return Unset_reference_containment.Matcher.on(engine);
  }
  
  public Initial_reference_containment getInitial_reference_containment() {
    return Initial_reference_containment.instance();
  }
  
  public Initial_reference_containment.Matcher getInitial_reference_containment(final ViatraQueryEngine engine) {
    return Initial_reference_containment.Matcher.on(engine);
  }
  
  public Current_reference_containment getCurrent_reference_containment() {
    return Current_reference_containment.instance();
  }
  
  public Current_reference_containment.Matcher getCurrent_reference_containment(final ViatraQueryEngine engine) {
    return Current_reference_containment.Matcher.on(engine);
  }
  
  public Get_reference_opposite getGet_reference_opposite() {
    return Get_reference_opposite.instance();
  }
  
  public Get_reference_opposite.Matcher getGet_reference_opposite(final ViatraQueryEngine engine) {
    return Get_reference_opposite.Matcher.on(engine);
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
}
