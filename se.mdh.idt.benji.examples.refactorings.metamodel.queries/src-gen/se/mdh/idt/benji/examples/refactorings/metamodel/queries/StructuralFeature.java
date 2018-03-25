/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/StructuralFeature.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_structuralFeature_upper;

/**
 * A pattern group formed of all public patterns defined in StructuralFeature.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file StructuralFeature.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_structuralFeature</li>
 * <li>create_structuralFeature</li>
 * <li>delete_structuralFeature</li>
 * <li>initial_structuralFeature</li>
 * <li>current_structuralFeature</li>
 * <li>get_structuralFeature_name</li>
 * <li>set_structuralFeature_name</li>
 * <li>unset_structuralFeature_name</li>
 * <li>initial_structuralFeature_name</li>
 * <li>current_structuralFeature_name</li>
 * <li>get_structuralFeature_owner</li>
 * <li>set_structuralFeature_owner</li>
 * <li>unset_structuralFeature_owner</li>
 * <li>initial_structuralFeature_owner</li>
 * <li>current_structuralFeature_owner</li>
 * <li>get_structuralFeature_lower</li>
 * <li>set_structuralFeature_lower</li>
 * <li>unset_structuralFeature_lower</li>
 * <li>initial_structuralFeature_lower</li>
 * <li>current_structuralFeature_lower</li>
 * <li>get_structuralFeature_upper</li>
 * <li>set_structuralFeature_upper</li>
 * <li>unset_structuralFeature_upper</li>
 * <li>initial_structuralFeature_upper</li>
 * <li>current_structuralFeature_upper</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class StructuralFeature extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static StructuralFeature instance() {
    if (INSTANCE == null) {
        INSTANCE = new StructuralFeature();
    }
    return INSTANCE;
  }
  
  private static StructuralFeature INSTANCE;
  
  private StructuralFeature() {
    querySpecifications.add(Get_structuralFeature.instance());
    querySpecifications.add(Create_structuralFeature.instance());
    querySpecifications.add(Delete_structuralFeature.instance());
    querySpecifications.add(Initial_structuralFeature.instance());
    querySpecifications.add(Current_structuralFeature.instance());
    querySpecifications.add(Get_structuralFeature_name.instance());
    querySpecifications.add(Set_structuralFeature_name.instance());
    querySpecifications.add(Unset_structuralFeature_name.instance());
    querySpecifications.add(Initial_structuralFeature_name.instance());
    querySpecifications.add(Current_structuralFeature_name.instance());
    querySpecifications.add(Get_structuralFeature_owner.instance());
    querySpecifications.add(Set_structuralFeature_owner.instance());
    querySpecifications.add(Unset_structuralFeature_owner.instance());
    querySpecifications.add(Initial_structuralFeature_owner.instance());
    querySpecifications.add(Current_structuralFeature_owner.instance());
    querySpecifications.add(Get_structuralFeature_lower.instance());
    querySpecifications.add(Set_structuralFeature_lower.instance());
    querySpecifications.add(Unset_structuralFeature_lower.instance());
    querySpecifications.add(Initial_structuralFeature_lower.instance());
    querySpecifications.add(Current_structuralFeature_lower.instance());
    querySpecifications.add(Get_structuralFeature_upper.instance());
    querySpecifications.add(Set_structuralFeature_upper.instance());
    querySpecifications.add(Unset_structuralFeature_upper.instance());
    querySpecifications.add(Initial_structuralFeature_upper.instance());
    querySpecifications.add(Current_structuralFeature_upper.instance());
  }
  
  public Get_structuralFeature getGet_structuralFeature() {
    return Get_structuralFeature.instance();
  }
  
  public Get_structuralFeature.Matcher getGet_structuralFeature(final ViatraQueryEngine engine) {
    return Get_structuralFeature.Matcher.on(engine);
  }
  
  public Create_structuralFeature getCreate_structuralFeature() {
    return Create_structuralFeature.instance();
  }
  
  public Create_structuralFeature.Matcher getCreate_structuralFeature(final ViatraQueryEngine engine) {
    return Create_structuralFeature.Matcher.on(engine);
  }
  
  public Delete_structuralFeature getDelete_structuralFeature() {
    return Delete_structuralFeature.instance();
  }
  
  public Delete_structuralFeature.Matcher getDelete_structuralFeature(final ViatraQueryEngine engine) {
    return Delete_structuralFeature.Matcher.on(engine);
  }
  
  public Initial_structuralFeature getInitial_structuralFeature() {
    return Initial_structuralFeature.instance();
  }
  
  public Initial_structuralFeature.Matcher getInitial_structuralFeature(final ViatraQueryEngine engine) {
    return Initial_structuralFeature.Matcher.on(engine);
  }
  
  public Current_structuralFeature getCurrent_structuralFeature() {
    return Current_structuralFeature.instance();
  }
  
  public Current_structuralFeature.Matcher getCurrent_structuralFeature(final ViatraQueryEngine engine) {
    return Current_structuralFeature.Matcher.on(engine);
  }
  
  public Get_structuralFeature_name getGet_structuralFeature_name() {
    return Get_structuralFeature_name.instance();
  }
  
  public Get_structuralFeature_name.Matcher getGet_structuralFeature_name(final ViatraQueryEngine engine) {
    return Get_structuralFeature_name.Matcher.on(engine);
  }
  
  public Set_structuralFeature_name getSet_structuralFeature_name() {
    return Set_structuralFeature_name.instance();
  }
  
  public Set_structuralFeature_name.Matcher getSet_structuralFeature_name(final ViatraQueryEngine engine) {
    return Set_structuralFeature_name.Matcher.on(engine);
  }
  
  public Unset_structuralFeature_name getUnset_structuralFeature_name() {
    return Unset_structuralFeature_name.instance();
  }
  
  public Unset_structuralFeature_name.Matcher getUnset_structuralFeature_name(final ViatraQueryEngine engine) {
    return Unset_structuralFeature_name.Matcher.on(engine);
  }
  
  public Initial_structuralFeature_name getInitial_structuralFeature_name() {
    return Initial_structuralFeature_name.instance();
  }
  
  public Initial_structuralFeature_name.Matcher getInitial_structuralFeature_name(final ViatraQueryEngine engine) {
    return Initial_structuralFeature_name.Matcher.on(engine);
  }
  
  public Current_structuralFeature_name getCurrent_structuralFeature_name() {
    return Current_structuralFeature_name.instance();
  }
  
  public Current_structuralFeature_name.Matcher getCurrent_structuralFeature_name(final ViatraQueryEngine engine) {
    return Current_structuralFeature_name.Matcher.on(engine);
  }
  
  public Get_structuralFeature_owner getGet_structuralFeature_owner() {
    return Get_structuralFeature_owner.instance();
  }
  
  public Get_structuralFeature_owner.Matcher getGet_structuralFeature_owner(final ViatraQueryEngine engine) {
    return Get_structuralFeature_owner.Matcher.on(engine);
  }
  
  public Set_structuralFeature_owner getSet_structuralFeature_owner() {
    return Set_structuralFeature_owner.instance();
  }
  
  public Set_structuralFeature_owner.Matcher getSet_structuralFeature_owner(final ViatraQueryEngine engine) {
    return Set_structuralFeature_owner.Matcher.on(engine);
  }
  
  public Unset_structuralFeature_owner getUnset_structuralFeature_owner() {
    return Unset_structuralFeature_owner.instance();
  }
  
  public Unset_structuralFeature_owner.Matcher getUnset_structuralFeature_owner(final ViatraQueryEngine engine) {
    return Unset_structuralFeature_owner.Matcher.on(engine);
  }
  
  public Initial_structuralFeature_owner getInitial_structuralFeature_owner() {
    return Initial_structuralFeature_owner.instance();
  }
  
  public Initial_structuralFeature_owner.Matcher getInitial_structuralFeature_owner(final ViatraQueryEngine engine) {
    return Initial_structuralFeature_owner.Matcher.on(engine);
  }
  
  public Current_structuralFeature_owner getCurrent_structuralFeature_owner() {
    return Current_structuralFeature_owner.instance();
  }
  
  public Current_structuralFeature_owner.Matcher getCurrent_structuralFeature_owner(final ViatraQueryEngine engine) {
    return Current_structuralFeature_owner.Matcher.on(engine);
  }
  
  public Get_structuralFeature_lower getGet_structuralFeature_lower() {
    return Get_structuralFeature_lower.instance();
  }
  
  public Get_structuralFeature_lower.Matcher getGet_structuralFeature_lower(final ViatraQueryEngine engine) {
    return Get_structuralFeature_lower.Matcher.on(engine);
  }
  
  public Set_structuralFeature_lower getSet_structuralFeature_lower() {
    return Set_structuralFeature_lower.instance();
  }
  
  public Set_structuralFeature_lower.Matcher getSet_structuralFeature_lower(final ViatraQueryEngine engine) {
    return Set_structuralFeature_lower.Matcher.on(engine);
  }
  
  public Unset_structuralFeature_lower getUnset_structuralFeature_lower() {
    return Unset_structuralFeature_lower.instance();
  }
  
  public Unset_structuralFeature_lower.Matcher getUnset_structuralFeature_lower(final ViatraQueryEngine engine) {
    return Unset_structuralFeature_lower.Matcher.on(engine);
  }
  
  public Initial_structuralFeature_lower getInitial_structuralFeature_lower() {
    return Initial_structuralFeature_lower.instance();
  }
  
  public Initial_structuralFeature_lower.Matcher getInitial_structuralFeature_lower(final ViatraQueryEngine engine) {
    return Initial_structuralFeature_lower.Matcher.on(engine);
  }
  
  public Current_structuralFeature_lower getCurrent_structuralFeature_lower() {
    return Current_structuralFeature_lower.instance();
  }
  
  public Current_structuralFeature_lower.Matcher getCurrent_structuralFeature_lower(final ViatraQueryEngine engine) {
    return Current_structuralFeature_lower.Matcher.on(engine);
  }
  
  public Get_structuralFeature_upper getGet_structuralFeature_upper() {
    return Get_structuralFeature_upper.instance();
  }
  
  public Get_structuralFeature_upper.Matcher getGet_structuralFeature_upper(final ViatraQueryEngine engine) {
    return Get_structuralFeature_upper.Matcher.on(engine);
  }
  
  public Set_structuralFeature_upper getSet_structuralFeature_upper() {
    return Set_structuralFeature_upper.instance();
  }
  
  public Set_structuralFeature_upper.Matcher getSet_structuralFeature_upper(final ViatraQueryEngine engine) {
    return Set_structuralFeature_upper.Matcher.on(engine);
  }
  
  public Unset_structuralFeature_upper getUnset_structuralFeature_upper() {
    return Unset_structuralFeature_upper.instance();
  }
  
  public Unset_structuralFeature_upper.Matcher getUnset_structuralFeature_upper(final ViatraQueryEngine engine) {
    return Unset_structuralFeature_upper.Matcher.on(engine);
  }
  
  public Initial_structuralFeature_upper getInitial_structuralFeature_upper() {
    return Initial_structuralFeature_upper.instance();
  }
  
  public Initial_structuralFeature_upper.Matcher getInitial_structuralFeature_upper(final ViatraQueryEngine engine) {
    return Initial_structuralFeature_upper.Matcher.on(engine);
  }
  
  public Current_structuralFeature_upper getCurrent_structuralFeature_upper() {
    return Current_structuralFeature_upper.instance();
  }
  
  public Current_structuralFeature_upper.Matcher getCurrent_structuralFeature_upper(final ViatraQueryEngine engine) {
    return Current_structuralFeature_upper.Matcher.on(engine);
  }
}
