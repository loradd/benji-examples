/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Class.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_attribute_typed;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_reference_typed;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_reference_typed_weak;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference_typed;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference_typed_weak;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Common_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Equals_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Equals_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_reference_typed;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_reference_typed_weak;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_superClass;

/**
 * A pattern group formed of all public patterns defined in Class.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Class.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_class</li>
 * <li>created_class</li>
 * <li>deleted_class</li>
 * <li>class_name</li>
 * <li>preserved_class_name</li>
 * <li>changed_class_name</li>
 * <li>class_package</li>
 * <li>preserved_class_package</li>
 * <li>changed_class_package</li>
 * <li>class_abstract</li>
 * <li>preserved_class_abstract</li>
 * <li>changed_class_abstract</li>
 * <li>class_superClass</li>
 * <li>common_class_superClass</li>
 * <li>preserved_class_superClass</li>
 * <li>added_class_superClass</li>
 * <li>removed_class_superClass</li>
 * <li>class_subClass</li>
 * <li>preserved_class_subClass</li>
 * <li>added_class_subClass</li>
 * <li>removed_class_subClass</li>
 * <li>class_structuralFeature</li>
 * <li>class_attribute</li>
 * <li>class_reference</li>
 * <li>class_reference_typed</li>
 * <li>class_reference_typed_weak</li>
 * <li>preserved_class_structuralFeature</li>
 * <li>preserved_class_attribute</li>
 * <li>preserved_class_reference</li>
 * <li>added_class_structuralFeature</li>
 * <li>added_class_attribute</li>
 * <li>added_class_attribute_typed</li>
 * <li>added_class_reference</li>
 * <li>added_class_reference_typed</li>
 * <li>added_class_reference_typed_weak</li>
 * <li>removed_class_structuralFeature</li>
 * <li>removed_class_attribute</li>
 * <li>removed_class_reference</li>
 * <li>removed_class_reference_typed</li>
 * <li>removed_class_reference_typed_weak</li>
 * <li>equals_class_attribute</li>
 * <li>equals_class_reference</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Class extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Class instance() {
    if (INSTANCE == null) {
        INSTANCE = new Class();
    }
    return INSTANCE;
  }
  
  private static Class INSTANCE;
  
  private Class() {
    querySpecifications.add(Preserved_class.instance());
    querySpecifications.add(Created_class.instance());
    querySpecifications.add(Deleted_class.instance());
    querySpecifications.add(Class_name.instance());
    querySpecifications.add(Preserved_class_name.instance());
    querySpecifications.add(Changed_class_name.instance());
    querySpecifications.add(Class_package.instance());
    querySpecifications.add(Preserved_class_package.instance());
    querySpecifications.add(Changed_class_package.instance());
    querySpecifications.add(Class_abstract.instance());
    querySpecifications.add(Preserved_class_abstract.instance());
    querySpecifications.add(Changed_class_abstract.instance());
    querySpecifications.add(Class_superClass.instance());
    querySpecifications.add(Common_class_superClass.instance());
    querySpecifications.add(Preserved_class_superClass.instance());
    querySpecifications.add(Added_class_superClass.instance());
    querySpecifications.add(Removed_class_superClass.instance());
    querySpecifications.add(Class_subClass.instance());
    querySpecifications.add(Preserved_class_subClass.instance());
    querySpecifications.add(Added_class_subClass.instance());
    querySpecifications.add(Removed_class_subClass.instance());
    querySpecifications.add(Class_structuralFeature.instance());
    querySpecifications.add(Class_attribute.instance());
    querySpecifications.add(Class_reference.instance());
    querySpecifications.add(Class_reference_typed.instance());
    querySpecifications.add(Class_reference_typed_weak.instance());
    querySpecifications.add(Preserved_class_structuralFeature.instance());
    querySpecifications.add(Preserved_class_attribute.instance());
    querySpecifications.add(Preserved_class_reference.instance());
    querySpecifications.add(Added_class_structuralFeature.instance());
    querySpecifications.add(Added_class_attribute.instance());
    querySpecifications.add(Added_class_attribute_typed.instance());
    querySpecifications.add(Added_class_reference.instance());
    querySpecifications.add(Added_class_reference_typed.instance());
    querySpecifications.add(Added_class_reference_typed_weak.instance());
    querySpecifications.add(Removed_class_structuralFeature.instance());
    querySpecifications.add(Removed_class_attribute.instance());
    querySpecifications.add(Removed_class_reference.instance());
    querySpecifications.add(Removed_class_reference_typed.instance());
    querySpecifications.add(Removed_class_reference_typed_weak.instance());
    querySpecifications.add(Equals_class_attribute.instance());
    querySpecifications.add(Equals_class_reference.instance());
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
  
  public Class_name getClass_name() {
    return Class_name.instance();
  }
  
  public Class_name.Matcher getClass_name(final ViatraQueryEngine engine) {
    return Class_name.Matcher.on(engine);
  }
  
  public Preserved_class_name getPreserved_class_name() {
    return Preserved_class_name.instance();
  }
  
  public Preserved_class_name.Matcher getPreserved_class_name(final ViatraQueryEngine engine) {
    return Preserved_class_name.Matcher.on(engine);
  }
  
  public Changed_class_name getChanged_class_name() {
    return Changed_class_name.instance();
  }
  
  public Changed_class_name.Matcher getChanged_class_name(final ViatraQueryEngine engine) {
    return Changed_class_name.Matcher.on(engine);
  }
  
  public Class_package getClass_package() {
    return Class_package.instance();
  }
  
  public Class_package.Matcher getClass_package(final ViatraQueryEngine engine) {
    return Class_package.Matcher.on(engine);
  }
  
  public Preserved_class_package getPreserved_class_package() {
    return Preserved_class_package.instance();
  }
  
  public Preserved_class_package.Matcher getPreserved_class_package(final ViatraQueryEngine engine) {
    return Preserved_class_package.Matcher.on(engine);
  }
  
  public Changed_class_package getChanged_class_package() {
    return Changed_class_package.instance();
  }
  
  public Changed_class_package.Matcher getChanged_class_package(final ViatraQueryEngine engine) {
    return Changed_class_package.Matcher.on(engine);
  }
  
  public Class_abstract getClass_abstract() {
    return Class_abstract.instance();
  }
  
  public Class_abstract.Matcher getClass_abstract(final ViatraQueryEngine engine) {
    return Class_abstract.Matcher.on(engine);
  }
  
  public Preserved_class_abstract getPreserved_class_abstract() {
    return Preserved_class_abstract.instance();
  }
  
  public Preserved_class_abstract.Matcher getPreserved_class_abstract(final ViatraQueryEngine engine) {
    return Preserved_class_abstract.Matcher.on(engine);
  }
  
  public Changed_class_abstract getChanged_class_abstract() {
    return Changed_class_abstract.instance();
  }
  
  public Changed_class_abstract.Matcher getChanged_class_abstract(final ViatraQueryEngine engine) {
    return Changed_class_abstract.Matcher.on(engine);
  }
  
  public Class_superClass getClass_superClass() {
    return Class_superClass.instance();
  }
  
  public Class_superClass.Matcher getClass_superClass(final ViatraQueryEngine engine) {
    return Class_superClass.Matcher.on(engine);
  }
  
  public Common_class_superClass getCommon_class_superClass() {
    return Common_class_superClass.instance();
  }
  
  public Common_class_superClass.Matcher getCommon_class_superClass(final ViatraQueryEngine engine) {
    return Common_class_superClass.Matcher.on(engine);
  }
  
  public Preserved_class_superClass getPreserved_class_superClass() {
    return Preserved_class_superClass.instance();
  }
  
  public Preserved_class_superClass.Matcher getPreserved_class_superClass(final ViatraQueryEngine engine) {
    return Preserved_class_superClass.Matcher.on(engine);
  }
  
  public Added_class_superClass getAdded_class_superClass() {
    return Added_class_superClass.instance();
  }
  
  public Added_class_superClass.Matcher getAdded_class_superClass(final ViatraQueryEngine engine) {
    return Added_class_superClass.Matcher.on(engine);
  }
  
  public Removed_class_superClass getRemoved_class_superClass() {
    return Removed_class_superClass.instance();
  }
  
  public Removed_class_superClass.Matcher getRemoved_class_superClass(final ViatraQueryEngine engine) {
    return Removed_class_superClass.Matcher.on(engine);
  }
  
  public Class_subClass getClass_subClass() {
    return Class_subClass.instance();
  }
  
  public Class_subClass.Matcher getClass_subClass(final ViatraQueryEngine engine) {
    return Class_subClass.Matcher.on(engine);
  }
  
  public Preserved_class_subClass getPreserved_class_subClass() {
    return Preserved_class_subClass.instance();
  }
  
  public Preserved_class_subClass.Matcher getPreserved_class_subClass(final ViatraQueryEngine engine) {
    return Preserved_class_subClass.Matcher.on(engine);
  }
  
  public Added_class_subClass getAdded_class_subClass() {
    return Added_class_subClass.instance();
  }
  
  public Added_class_subClass.Matcher getAdded_class_subClass(final ViatraQueryEngine engine) {
    return Added_class_subClass.Matcher.on(engine);
  }
  
  public Removed_class_subClass getRemoved_class_subClass() {
    return Removed_class_subClass.instance();
  }
  
  public Removed_class_subClass.Matcher getRemoved_class_subClass(final ViatraQueryEngine engine) {
    return Removed_class_subClass.Matcher.on(engine);
  }
  
  public Class_structuralFeature getClass_structuralFeature() {
    return Class_structuralFeature.instance();
  }
  
  public Class_structuralFeature.Matcher getClass_structuralFeature(final ViatraQueryEngine engine) {
    return Class_structuralFeature.Matcher.on(engine);
  }
  
  public Class_attribute getClass_attribute() {
    return Class_attribute.instance();
  }
  
  public Class_attribute.Matcher getClass_attribute(final ViatraQueryEngine engine) {
    return Class_attribute.Matcher.on(engine);
  }
  
  public Class_reference getClass_reference() {
    return Class_reference.instance();
  }
  
  public Class_reference.Matcher getClass_reference(final ViatraQueryEngine engine) {
    return Class_reference.Matcher.on(engine);
  }
  
  public Class_reference_typed getClass_reference_typed() {
    return Class_reference_typed.instance();
  }
  
  public Class_reference_typed.Matcher getClass_reference_typed(final ViatraQueryEngine engine) {
    return Class_reference_typed.Matcher.on(engine);
  }
  
  public Class_reference_typed_weak getClass_reference_typed_weak() {
    return Class_reference_typed_weak.instance();
  }
  
  public Class_reference_typed_weak.Matcher getClass_reference_typed_weak(final ViatraQueryEngine engine) {
    return Class_reference_typed_weak.Matcher.on(engine);
  }
  
  public Preserved_class_structuralFeature getPreserved_class_structuralFeature() {
    return Preserved_class_structuralFeature.instance();
  }
  
  public Preserved_class_structuralFeature.Matcher getPreserved_class_structuralFeature(final ViatraQueryEngine engine) {
    return Preserved_class_structuralFeature.Matcher.on(engine);
  }
  
  public Preserved_class_attribute getPreserved_class_attribute() {
    return Preserved_class_attribute.instance();
  }
  
  public Preserved_class_attribute.Matcher getPreserved_class_attribute(final ViatraQueryEngine engine) {
    return Preserved_class_attribute.Matcher.on(engine);
  }
  
  public Preserved_class_reference getPreserved_class_reference() {
    return Preserved_class_reference.instance();
  }
  
  public Preserved_class_reference.Matcher getPreserved_class_reference(final ViatraQueryEngine engine) {
    return Preserved_class_reference.Matcher.on(engine);
  }
  
  public Added_class_structuralFeature getAdded_class_structuralFeature() {
    return Added_class_structuralFeature.instance();
  }
  
  public Added_class_structuralFeature.Matcher getAdded_class_structuralFeature(final ViatraQueryEngine engine) {
    return Added_class_structuralFeature.Matcher.on(engine);
  }
  
  public Added_class_attribute getAdded_class_attribute() {
    return Added_class_attribute.instance();
  }
  
  public Added_class_attribute.Matcher getAdded_class_attribute(final ViatraQueryEngine engine) {
    return Added_class_attribute.Matcher.on(engine);
  }
  
  public Added_class_attribute_typed getAdded_class_attribute_typed() {
    return Added_class_attribute_typed.instance();
  }
  
  public Added_class_attribute_typed.Matcher getAdded_class_attribute_typed(final ViatraQueryEngine engine) {
    return Added_class_attribute_typed.Matcher.on(engine);
  }
  
  public Added_class_reference getAdded_class_reference() {
    return Added_class_reference.instance();
  }
  
  public Added_class_reference.Matcher getAdded_class_reference(final ViatraQueryEngine engine) {
    return Added_class_reference.Matcher.on(engine);
  }
  
  public Added_class_reference_typed getAdded_class_reference_typed() {
    return Added_class_reference_typed.instance();
  }
  
  public Added_class_reference_typed.Matcher getAdded_class_reference_typed(final ViatraQueryEngine engine) {
    return Added_class_reference_typed.Matcher.on(engine);
  }
  
  public Added_class_reference_typed_weak getAdded_class_reference_typed_weak() {
    return Added_class_reference_typed_weak.instance();
  }
  
  public Added_class_reference_typed_weak.Matcher getAdded_class_reference_typed_weak(final ViatraQueryEngine engine) {
    return Added_class_reference_typed_weak.Matcher.on(engine);
  }
  
  public Removed_class_structuralFeature getRemoved_class_structuralFeature() {
    return Removed_class_structuralFeature.instance();
  }
  
  public Removed_class_structuralFeature.Matcher getRemoved_class_structuralFeature(final ViatraQueryEngine engine) {
    return Removed_class_structuralFeature.Matcher.on(engine);
  }
  
  public Removed_class_attribute getRemoved_class_attribute() {
    return Removed_class_attribute.instance();
  }
  
  public Removed_class_attribute.Matcher getRemoved_class_attribute(final ViatraQueryEngine engine) {
    return Removed_class_attribute.Matcher.on(engine);
  }
  
  public Removed_class_reference getRemoved_class_reference() {
    return Removed_class_reference.instance();
  }
  
  public Removed_class_reference.Matcher getRemoved_class_reference(final ViatraQueryEngine engine) {
    return Removed_class_reference.Matcher.on(engine);
  }
  
  public Removed_class_reference_typed getRemoved_class_reference_typed() {
    return Removed_class_reference_typed.instance();
  }
  
  public Removed_class_reference_typed.Matcher getRemoved_class_reference_typed(final ViatraQueryEngine engine) {
    return Removed_class_reference_typed.Matcher.on(engine);
  }
  
  public Removed_class_reference_typed_weak getRemoved_class_reference_typed_weak() {
    return Removed_class_reference_typed_weak.instance();
  }
  
  public Removed_class_reference_typed_weak.Matcher getRemoved_class_reference_typed_weak(final ViatraQueryEngine engine) {
    return Removed_class_reference_typed_weak.Matcher.on(engine);
  }
  
  public Equals_class_attribute getEquals_class_attribute() {
    return Equals_class_attribute.instance();
  }
  
  public Equals_class_attribute.Matcher getEquals_class_attribute(final ViatraQueryEngine engine) {
    return Equals_class_attribute.Matcher.on(engine);
  }
  
  public Equals_class_reference getEquals_class_reference() {
    return Equals_class_reference.instance();
  }
  
  public Equals_class_reference.Matcher getEquals_class_reference(final ViatraQueryEngine engine) {
    return Equals_class_reference.Matcher.on(engine);
  }
}
