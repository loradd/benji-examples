/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Attribute.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_upper;

/**
 * A pattern group formed of all public patterns defined in Attribute.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Attribute.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_attribute</li>
 * <li>created_attribute</li>
 * <li>deleted_attribute</li>
 * <li>attribute_name</li>
 * <li>preserved_attribute_name</li>
 * <li>changed_attribute_name</li>
 * <li>attribute_owner</li>
 * <li>preserved_attribute_owner</li>
 * <li>changed_attribute_owner</li>
 * <li>attribute_lower</li>
 * <li>preserved_attribute_lower</li>
 * <li>changed_attribute_lower</li>
 * <li>attribute_upper</li>
 * <li>preserved_attribute_upper</li>
 * <li>changed_attribute_upper</li>
 * <li>attribute_type</li>
 * <li>preserved_attribute_type</li>
 * <li>changed_attribute_type</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Attribute extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Attribute instance() {
    if (INSTANCE == null) {
        INSTANCE = new Attribute();
    }
    return INSTANCE;
  }
  
  private static Attribute INSTANCE;
  
  private Attribute() {
    querySpecifications.add(Preserved_attribute.instance());
    querySpecifications.add(Created_attribute.instance());
    querySpecifications.add(Deleted_attribute.instance());
    querySpecifications.add(Attribute_name.instance());
    querySpecifications.add(Preserved_attribute_name.instance());
    querySpecifications.add(Changed_attribute_name.instance());
    querySpecifications.add(Attribute_owner.instance());
    querySpecifications.add(Preserved_attribute_owner.instance());
    querySpecifications.add(Changed_attribute_owner.instance());
    querySpecifications.add(Attribute_lower.instance());
    querySpecifications.add(Preserved_attribute_lower.instance());
    querySpecifications.add(Changed_attribute_lower.instance());
    querySpecifications.add(Attribute_upper.instance());
    querySpecifications.add(Preserved_attribute_upper.instance());
    querySpecifications.add(Changed_attribute_upper.instance());
    querySpecifications.add(Attribute_type.instance());
    querySpecifications.add(Preserved_attribute_type.instance());
    querySpecifications.add(Changed_attribute_type.instance());
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
  
  public Attribute_name getAttribute_name() {
    return Attribute_name.instance();
  }
  
  public Attribute_name.Matcher getAttribute_name(final ViatraQueryEngine engine) {
    return Attribute_name.Matcher.on(engine);
  }
  
  public Preserved_attribute_name getPreserved_attribute_name() {
    return Preserved_attribute_name.instance();
  }
  
  public Preserved_attribute_name.Matcher getPreserved_attribute_name(final ViatraQueryEngine engine) {
    return Preserved_attribute_name.Matcher.on(engine);
  }
  
  public Changed_attribute_name getChanged_attribute_name() {
    return Changed_attribute_name.instance();
  }
  
  public Changed_attribute_name.Matcher getChanged_attribute_name(final ViatraQueryEngine engine) {
    return Changed_attribute_name.Matcher.on(engine);
  }
  
  public Attribute_owner getAttribute_owner() {
    return Attribute_owner.instance();
  }
  
  public Attribute_owner.Matcher getAttribute_owner(final ViatraQueryEngine engine) {
    return Attribute_owner.Matcher.on(engine);
  }
  
  public Preserved_attribute_owner getPreserved_attribute_owner() {
    return Preserved_attribute_owner.instance();
  }
  
  public Preserved_attribute_owner.Matcher getPreserved_attribute_owner(final ViatraQueryEngine engine) {
    return Preserved_attribute_owner.Matcher.on(engine);
  }
  
  public Changed_attribute_owner getChanged_attribute_owner() {
    return Changed_attribute_owner.instance();
  }
  
  public Changed_attribute_owner.Matcher getChanged_attribute_owner(final ViatraQueryEngine engine) {
    return Changed_attribute_owner.Matcher.on(engine);
  }
  
  public Attribute_lower getAttribute_lower() {
    return Attribute_lower.instance();
  }
  
  public Attribute_lower.Matcher getAttribute_lower(final ViatraQueryEngine engine) {
    return Attribute_lower.Matcher.on(engine);
  }
  
  public Preserved_attribute_lower getPreserved_attribute_lower() {
    return Preserved_attribute_lower.instance();
  }
  
  public Preserved_attribute_lower.Matcher getPreserved_attribute_lower(final ViatraQueryEngine engine) {
    return Preserved_attribute_lower.Matcher.on(engine);
  }
  
  public Changed_attribute_lower getChanged_attribute_lower() {
    return Changed_attribute_lower.instance();
  }
  
  public Changed_attribute_lower.Matcher getChanged_attribute_lower(final ViatraQueryEngine engine) {
    return Changed_attribute_lower.Matcher.on(engine);
  }
  
  public Attribute_upper getAttribute_upper() {
    return Attribute_upper.instance();
  }
  
  public Attribute_upper.Matcher getAttribute_upper(final ViatraQueryEngine engine) {
    return Attribute_upper.Matcher.on(engine);
  }
  
  public Preserved_attribute_upper getPreserved_attribute_upper() {
    return Preserved_attribute_upper.instance();
  }
  
  public Preserved_attribute_upper.Matcher getPreserved_attribute_upper(final ViatraQueryEngine engine) {
    return Preserved_attribute_upper.Matcher.on(engine);
  }
  
  public Changed_attribute_upper getChanged_attribute_upper() {
    return Changed_attribute_upper.instance();
  }
  
  public Changed_attribute_upper.Matcher getChanged_attribute_upper(final ViatraQueryEngine engine) {
    return Changed_attribute_upper.Matcher.on(engine);
  }
  
  public Attribute_type getAttribute_type() {
    return Attribute_type.instance();
  }
  
  public Attribute_type.Matcher getAttribute_type(final ViatraQueryEngine engine) {
    return Attribute_type.Matcher.on(engine);
  }
  
  public Preserved_attribute_type getPreserved_attribute_type() {
    return Preserved_attribute_type.instance();
  }
  
  public Preserved_attribute_type.Matcher getPreserved_attribute_type(final ViatraQueryEngine engine) {
    return Preserved_attribute_type.Matcher.on(engine);
  }
  
  public Changed_attribute_type getChanged_attribute_type() {
    return Changed_attribute_type.instance();
  }
  
  public Changed_attribute_type.Matcher getChanged_attribute_type(final ViatraQueryEngine engine) {
    return Changed_attribute_type.Matcher.on(engine);
  }
}
