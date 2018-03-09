/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/StructuralFeature.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_upper;

/**
 * A pattern group formed of all public patterns defined in StructuralFeature.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file StructuralFeature.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_structuralFeature</li>
 * <li>created_structuralFeature</li>
 * <li>deleted_structuralFeature</li>
 * <li>structuralFeature_name</li>
 * <li>preserved_structuralFeature_name</li>
 * <li>changed_structuralFeature_name</li>
 * <li>structuralFeature_owner</li>
 * <li>preserved_structuralFeature_owner</li>
 * <li>changed_structuralFeature_owner</li>
 * <li>structuralFeature_lower</li>
 * <li>preserved_structuralFeature_lower</li>
 * <li>changed_structuralFeature_lower</li>
 * <li>structuralFeature_upper</li>
 * <li>preserved_structuralFeature_upper</li>
 * <li>changed_structuralFeature_upper</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
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
    querySpecifications.add(Preserved_structuralFeature.instance());
    querySpecifications.add(Created_structuralFeature.instance());
    querySpecifications.add(Deleted_structuralFeature.instance());
    querySpecifications.add(StructuralFeature_name.instance());
    querySpecifications.add(Preserved_structuralFeature_name.instance());
    querySpecifications.add(Changed_structuralFeature_name.instance());
    querySpecifications.add(StructuralFeature_owner.instance());
    querySpecifications.add(Preserved_structuralFeature_owner.instance());
    querySpecifications.add(Changed_structuralFeature_owner.instance());
    querySpecifications.add(StructuralFeature_lower.instance());
    querySpecifications.add(Preserved_structuralFeature_lower.instance());
    querySpecifications.add(Changed_structuralFeature_lower.instance());
    querySpecifications.add(StructuralFeature_upper.instance());
    querySpecifications.add(Preserved_structuralFeature_upper.instance());
    querySpecifications.add(Changed_structuralFeature_upper.instance());
  }
  
  public Preserved_structuralFeature getPreserved_structuralFeature() {
    return Preserved_structuralFeature.instance();
  }
  
  public Preserved_structuralFeature.Matcher getPreserved_structuralFeature(final ViatraQueryEngine engine) {
    return Preserved_structuralFeature.Matcher.on(engine);
  }
  
  public Created_structuralFeature getCreated_structuralFeature() {
    return Created_structuralFeature.instance();
  }
  
  public Created_structuralFeature.Matcher getCreated_structuralFeature(final ViatraQueryEngine engine) {
    return Created_structuralFeature.Matcher.on(engine);
  }
  
  public Deleted_structuralFeature getDeleted_structuralFeature() {
    return Deleted_structuralFeature.instance();
  }
  
  public Deleted_structuralFeature.Matcher getDeleted_structuralFeature(final ViatraQueryEngine engine) {
    return Deleted_structuralFeature.Matcher.on(engine);
  }
  
  public StructuralFeature_name getStructuralFeature_name() {
    return StructuralFeature_name.instance();
  }
  
  public StructuralFeature_name.Matcher getStructuralFeature_name(final ViatraQueryEngine engine) {
    return StructuralFeature_name.Matcher.on(engine);
  }
  
  public Preserved_structuralFeature_name getPreserved_structuralFeature_name() {
    return Preserved_structuralFeature_name.instance();
  }
  
  public Preserved_structuralFeature_name.Matcher getPreserved_structuralFeature_name(final ViatraQueryEngine engine) {
    return Preserved_structuralFeature_name.Matcher.on(engine);
  }
  
  public Changed_structuralFeature_name getChanged_structuralFeature_name() {
    return Changed_structuralFeature_name.instance();
  }
  
  public Changed_structuralFeature_name.Matcher getChanged_structuralFeature_name(final ViatraQueryEngine engine) {
    return Changed_structuralFeature_name.Matcher.on(engine);
  }
  
  public StructuralFeature_owner getStructuralFeature_owner() {
    return StructuralFeature_owner.instance();
  }
  
  public StructuralFeature_owner.Matcher getStructuralFeature_owner(final ViatraQueryEngine engine) {
    return StructuralFeature_owner.Matcher.on(engine);
  }
  
  public Preserved_structuralFeature_owner getPreserved_structuralFeature_owner() {
    return Preserved_structuralFeature_owner.instance();
  }
  
  public Preserved_structuralFeature_owner.Matcher getPreserved_structuralFeature_owner(final ViatraQueryEngine engine) {
    return Preserved_structuralFeature_owner.Matcher.on(engine);
  }
  
  public Changed_structuralFeature_owner getChanged_structuralFeature_owner() {
    return Changed_structuralFeature_owner.instance();
  }
  
  public Changed_structuralFeature_owner.Matcher getChanged_structuralFeature_owner(final ViatraQueryEngine engine) {
    return Changed_structuralFeature_owner.Matcher.on(engine);
  }
  
  public StructuralFeature_lower getStructuralFeature_lower() {
    return StructuralFeature_lower.instance();
  }
  
  public StructuralFeature_lower.Matcher getStructuralFeature_lower(final ViatraQueryEngine engine) {
    return StructuralFeature_lower.Matcher.on(engine);
  }
  
  public Preserved_structuralFeature_lower getPreserved_structuralFeature_lower() {
    return Preserved_structuralFeature_lower.instance();
  }
  
  public Preserved_structuralFeature_lower.Matcher getPreserved_structuralFeature_lower(final ViatraQueryEngine engine) {
    return Preserved_structuralFeature_lower.Matcher.on(engine);
  }
  
  public Changed_structuralFeature_lower getChanged_structuralFeature_lower() {
    return Changed_structuralFeature_lower.instance();
  }
  
  public Changed_structuralFeature_lower.Matcher getChanged_structuralFeature_lower(final ViatraQueryEngine engine) {
    return Changed_structuralFeature_lower.Matcher.on(engine);
  }
  
  public StructuralFeature_upper getStructuralFeature_upper() {
    return StructuralFeature_upper.instance();
  }
  
  public StructuralFeature_upper.Matcher getStructuralFeature_upper(final ViatraQueryEngine engine) {
    return StructuralFeature_upper.Matcher.on(engine);
  }
  
  public Preserved_structuralFeature_upper getPreserved_structuralFeature_upper() {
    return Preserved_structuralFeature_upper.instance();
  }
  
  public Preserved_structuralFeature_upper.Matcher getPreserved_structuralFeature_upper(final ViatraQueryEngine engine) {
    return Preserved_structuralFeature_upper.Matcher.on(engine);
  }
  
  public Changed_structuralFeature_upper getChanged_structuralFeature_upper() {
    return Changed_structuralFeature_upper.instance();
  }
  
  public Changed_structuralFeature_upper.Matcher getChanged_structuralFeature_upper(final ViatraQueryEngine engine) {
    return Changed_structuralFeature_upper.Matcher.on(engine);
  }
}
