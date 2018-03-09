/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Reference.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_type_weak;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_upper;

/**
 * A pattern group formed of all public patterns defined in Reference.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Reference.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_reference</li>
 * <li>created_reference</li>
 * <li>deleted_reference</li>
 * <li>reference_name</li>
 * <li>preserved_reference_name</li>
 * <li>changed_reference_name</li>
 * <li>reference_owner</li>
 * <li>preserved_reference_owner</li>
 * <li>changed_reference_owner</li>
 * <li>reference_lower</li>
 * <li>preserved_reference_lower</li>
 * <li>changed_reference_lower</li>
 * <li>reference_upper</li>
 * <li>preserved_reference_upper</li>
 * <li>changed_reference_upper</li>
 * <li>reference_containment</li>
 * <li>preserved_reference_containment</li>
 * <li>changed_reference_containment</li>
 * <li>reference_opposite</li>
 * <li>preserved_reference_opposite</li>
 * <li>changed_reference_opposite</li>
 * <li>reference_type</li>
 * <li>reference_type_weak</li>
 * <li>preserved_reference_type</li>
 * <li>changed_reference_type</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
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
    querySpecifications.add(Preserved_reference.instance());
    querySpecifications.add(Created_reference.instance());
    querySpecifications.add(Deleted_reference.instance());
    querySpecifications.add(Reference_name.instance());
    querySpecifications.add(Preserved_reference_name.instance());
    querySpecifications.add(Changed_reference_name.instance());
    querySpecifications.add(Reference_owner.instance());
    querySpecifications.add(Preserved_reference_owner.instance());
    querySpecifications.add(Changed_reference_owner.instance());
    querySpecifications.add(Reference_lower.instance());
    querySpecifications.add(Preserved_reference_lower.instance());
    querySpecifications.add(Changed_reference_lower.instance());
    querySpecifications.add(Reference_upper.instance());
    querySpecifications.add(Preserved_reference_upper.instance());
    querySpecifications.add(Changed_reference_upper.instance());
    querySpecifications.add(Reference_containment.instance());
    querySpecifications.add(Preserved_reference_containment.instance());
    querySpecifications.add(Changed_reference_containment.instance());
    querySpecifications.add(Reference_opposite.instance());
    querySpecifications.add(Preserved_reference_opposite.instance());
    querySpecifications.add(Changed_reference_opposite.instance());
    querySpecifications.add(Reference_type.instance());
    querySpecifications.add(Reference_type_weak.instance());
    querySpecifications.add(Preserved_reference_type.instance());
    querySpecifications.add(Changed_reference_type.instance());
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
  
  public Reference_name getReference_name() {
    return Reference_name.instance();
  }
  
  public Reference_name.Matcher getReference_name(final ViatraQueryEngine engine) {
    return Reference_name.Matcher.on(engine);
  }
  
  public Preserved_reference_name getPreserved_reference_name() {
    return Preserved_reference_name.instance();
  }
  
  public Preserved_reference_name.Matcher getPreserved_reference_name(final ViatraQueryEngine engine) {
    return Preserved_reference_name.Matcher.on(engine);
  }
  
  public Changed_reference_name getChanged_reference_name() {
    return Changed_reference_name.instance();
  }
  
  public Changed_reference_name.Matcher getChanged_reference_name(final ViatraQueryEngine engine) {
    return Changed_reference_name.Matcher.on(engine);
  }
  
  public Reference_owner getReference_owner() {
    return Reference_owner.instance();
  }
  
  public Reference_owner.Matcher getReference_owner(final ViatraQueryEngine engine) {
    return Reference_owner.Matcher.on(engine);
  }
  
  public Preserved_reference_owner getPreserved_reference_owner() {
    return Preserved_reference_owner.instance();
  }
  
  public Preserved_reference_owner.Matcher getPreserved_reference_owner(final ViatraQueryEngine engine) {
    return Preserved_reference_owner.Matcher.on(engine);
  }
  
  public Changed_reference_owner getChanged_reference_owner() {
    return Changed_reference_owner.instance();
  }
  
  public Changed_reference_owner.Matcher getChanged_reference_owner(final ViatraQueryEngine engine) {
    return Changed_reference_owner.Matcher.on(engine);
  }
  
  public Reference_lower getReference_lower() {
    return Reference_lower.instance();
  }
  
  public Reference_lower.Matcher getReference_lower(final ViatraQueryEngine engine) {
    return Reference_lower.Matcher.on(engine);
  }
  
  public Preserved_reference_lower getPreserved_reference_lower() {
    return Preserved_reference_lower.instance();
  }
  
  public Preserved_reference_lower.Matcher getPreserved_reference_lower(final ViatraQueryEngine engine) {
    return Preserved_reference_lower.Matcher.on(engine);
  }
  
  public Changed_reference_lower getChanged_reference_lower() {
    return Changed_reference_lower.instance();
  }
  
  public Changed_reference_lower.Matcher getChanged_reference_lower(final ViatraQueryEngine engine) {
    return Changed_reference_lower.Matcher.on(engine);
  }
  
  public Reference_upper getReference_upper() {
    return Reference_upper.instance();
  }
  
  public Reference_upper.Matcher getReference_upper(final ViatraQueryEngine engine) {
    return Reference_upper.Matcher.on(engine);
  }
  
  public Preserved_reference_upper getPreserved_reference_upper() {
    return Preserved_reference_upper.instance();
  }
  
  public Preserved_reference_upper.Matcher getPreserved_reference_upper(final ViatraQueryEngine engine) {
    return Preserved_reference_upper.Matcher.on(engine);
  }
  
  public Changed_reference_upper getChanged_reference_upper() {
    return Changed_reference_upper.instance();
  }
  
  public Changed_reference_upper.Matcher getChanged_reference_upper(final ViatraQueryEngine engine) {
    return Changed_reference_upper.Matcher.on(engine);
  }
  
  public Reference_containment getReference_containment() {
    return Reference_containment.instance();
  }
  
  public Reference_containment.Matcher getReference_containment(final ViatraQueryEngine engine) {
    return Reference_containment.Matcher.on(engine);
  }
  
  public Preserved_reference_containment getPreserved_reference_containment() {
    return Preserved_reference_containment.instance();
  }
  
  public Preserved_reference_containment.Matcher getPreserved_reference_containment(final ViatraQueryEngine engine) {
    return Preserved_reference_containment.Matcher.on(engine);
  }
  
  public Changed_reference_containment getChanged_reference_containment() {
    return Changed_reference_containment.instance();
  }
  
  public Changed_reference_containment.Matcher getChanged_reference_containment(final ViatraQueryEngine engine) {
    return Changed_reference_containment.Matcher.on(engine);
  }
  
  public Reference_opposite getReference_opposite() {
    return Reference_opposite.instance();
  }
  
  public Reference_opposite.Matcher getReference_opposite(final ViatraQueryEngine engine) {
    return Reference_opposite.Matcher.on(engine);
  }
  
  public Preserved_reference_opposite getPreserved_reference_opposite() {
    return Preserved_reference_opposite.instance();
  }
  
  public Preserved_reference_opposite.Matcher getPreserved_reference_opposite(final ViatraQueryEngine engine) {
    return Preserved_reference_opposite.Matcher.on(engine);
  }
  
  public Changed_reference_opposite getChanged_reference_opposite() {
    return Changed_reference_opposite.instance();
  }
  
  public Changed_reference_opposite.Matcher getChanged_reference_opposite(final ViatraQueryEngine engine) {
    return Changed_reference_opposite.Matcher.on(engine);
  }
  
  public Reference_type getReference_type() {
    return Reference_type.instance();
  }
  
  public Reference_type.Matcher getReference_type(final ViatraQueryEngine engine) {
    return Reference_type.Matcher.on(engine);
  }
  
  public Reference_type_weak getReference_type_weak() {
    return Reference_type_weak.instance();
  }
  
  public Reference_type_weak.Matcher getReference_type_weak(final ViatraQueryEngine engine) {
    return Reference_type_weak.Matcher.on(engine);
  }
  
  public Preserved_reference_type getPreserved_reference_type() {
    return Preserved_reference_type.instance();
  }
  
  public Preserved_reference_type.Matcher getPreserved_reference_type(final ViatraQueryEngine engine) {
    return Preserved_reference_type.Matcher.on(engine);
  }
  
  public Changed_reference_type getChanged_reference_type() {
    return Changed_reference_type.instance();
  }
  
  public Changed_reference_type.Matcher getChanged_reference_type(final ViatraQueryEngine engine) {
    return Changed_reference_type.Matcher.on(engine);
  }
}
