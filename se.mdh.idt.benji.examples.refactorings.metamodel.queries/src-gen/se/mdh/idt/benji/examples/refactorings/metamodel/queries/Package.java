/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Package.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_dataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_dataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_dataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_enuemration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_package_dataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_package_subPackage;

/**
 * A pattern group formed of all public patterns defined in Package.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Package.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_package</li>
 * <li>created_package</li>
 * <li>deleted_package</li>
 * <li>package_name</li>
 * <li>preserved_package_name</li>
 * <li>changed_package_name</li>
 * <li>package_superPackage</li>
 * <li>preserved_package_superPackage</li>
 * <li>changed_package_superPackage</li>
 * <li>package_uri</li>
 * <li>preserved_package_uri</li>
 * <li>changed_package_uri</li>
 * <li>package_classifier</li>
 * <li>package_subPackage</li>
 * <li>package_class</li>
 * <li>package_dataType</li>
 * <li>package_enumeration</li>
 * <li>preserved_package_classifier</li>
 * <li>preserved_package_subPackage</li>
 * <li>preserved_package_class</li>
 * <li>preserved_package_dataType</li>
 * <li>preserved_package_enuemration</li>
 * <li>added_package_classifier</li>
 * <li>added_package_subPackage</li>
 * <li>added_package_class</li>
 * <li>added_package_dataType</li>
 * <li>added_package_enumeration</li>
 * <li>removed_package_classifier</li>
 * <li>removed_package_subPackage</li>
 * <li>removed_package_class</li>
 * <li>removed_package_dataType</li>
 * <li>removed_package_enumeration</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Package extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Package instance() {
    if (INSTANCE == null) {
        INSTANCE = new Package();
    }
    return INSTANCE;
  }
  
  private static Package INSTANCE;
  
  private Package() {
    querySpecifications.add(Preserved_package.instance());
    querySpecifications.add(Created_package.instance());
    querySpecifications.add(Deleted_package.instance());
    querySpecifications.add(Package_name.instance());
    querySpecifications.add(Preserved_package_name.instance());
    querySpecifications.add(Changed_package_name.instance());
    querySpecifications.add(Package_superPackage.instance());
    querySpecifications.add(Preserved_package_superPackage.instance());
    querySpecifications.add(Changed_package_superPackage.instance());
    querySpecifications.add(Package_uri.instance());
    querySpecifications.add(Preserved_package_uri.instance());
    querySpecifications.add(Changed_package_uri.instance());
    querySpecifications.add(Package_classifier.instance());
    querySpecifications.add(Package_subPackage.instance());
    querySpecifications.add(Package_class.instance());
    querySpecifications.add(Package_dataType.instance());
    querySpecifications.add(Package_enumeration.instance());
    querySpecifications.add(Preserved_package_classifier.instance());
    querySpecifications.add(Preserved_package_subPackage.instance());
    querySpecifications.add(Preserved_package_class.instance());
    querySpecifications.add(Preserved_package_dataType.instance());
    querySpecifications.add(Preserved_package_enuemration.instance());
    querySpecifications.add(Added_package_classifier.instance());
    querySpecifications.add(Added_package_subPackage.instance());
    querySpecifications.add(Added_package_class.instance());
    querySpecifications.add(Added_package_dataType.instance());
    querySpecifications.add(Added_package_enumeration.instance());
    querySpecifications.add(Removed_package_classifier.instance());
    querySpecifications.add(Removed_package_subPackage.instance());
    querySpecifications.add(Removed_package_class.instance());
    querySpecifications.add(Removed_package_dataType.instance());
    querySpecifications.add(Removed_package_enumeration.instance());
  }
  
  public Preserved_package getPreserved_package() {
    return Preserved_package.instance();
  }
  
  public Preserved_package.Matcher getPreserved_package(final ViatraQueryEngine engine) {
    return Preserved_package.Matcher.on(engine);
  }
  
  public Created_package getCreated_package() {
    return Created_package.instance();
  }
  
  public Created_package.Matcher getCreated_package(final ViatraQueryEngine engine) {
    return Created_package.Matcher.on(engine);
  }
  
  public Deleted_package getDeleted_package() {
    return Deleted_package.instance();
  }
  
  public Deleted_package.Matcher getDeleted_package(final ViatraQueryEngine engine) {
    return Deleted_package.Matcher.on(engine);
  }
  
  public Package_name getPackage_name() {
    return Package_name.instance();
  }
  
  public Package_name.Matcher getPackage_name(final ViatraQueryEngine engine) {
    return Package_name.Matcher.on(engine);
  }
  
  public Preserved_package_name getPreserved_package_name() {
    return Preserved_package_name.instance();
  }
  
  public Preserved_package_name.Matcher getPreserved_package_name(final ViatraQueryEngine engine) {
    return Preserved_package_name.Matcher.on(engine);
  }
  
  public Changed_package_name getChanged_package_name() {
    return Changed_package_name.instance();
  }
  
  public Changed_package_name.Matcher getChanged_package_name(final ViatraQueryEngine engine) {
    return Changed_package_name.Matcher.on(engine);
  }
  
  public Package_superPackage getPackage_superPackage() {
    return Package_superPackage.instance();
  }
  
  public Package_superPackage.Matcher getPackage_superPackage(final ViatraQueryEngine engine) {
    return Package_superPackage.Matcher.on(engine);
  }
  
  public Preserved_package_superPackage getPreserved_package_superPackage() {
    return Preserved_package_superPackage.instance();
  }
  
  public Preserved_package_superPackage.Matcher getPreserved_package_superPackage(final ViatraQueryEngine engine) {
    return Preserved_package_superPackage.Matcher.on(engine);
  }
  
  public Changed_package_superPackage getChanged_package_superPackage() {
    return Changed_package_superPackage.instance();
  }
  
  public Changed_package_superPackage.Matcher getChanged_package_superPackage(final ViatraQueryEngine engine) {
    return Changed_package_superPackage.Matcher.on(engine);
  }
  
  public Package_uri getPackage_uri() {
    return Package_uri.instance();
  }
  
  public Package_uri.Matcher getPackage_uri(final ViatraQueryEngine engine) {
    return Package_uri.Matcher.on(engine);
  }
  
  public Preserved_package_uri getPreserved_package_uri() {
    return Preserved_package_uri.instance();
  }
  
  public Preserved_package_uri.Matcher getPreserved_package_uri(final ViatraQueryEngine engine) {
    return Preserved_package_uri.Matcher.on(engine);
  }
  
  public Changed_package_uri getChanged_package_uri() {
    return Changed_package_uri.instance();
  }
  
  public Changed_package_uri.Matcher getChanged_package_uri(final ViatraQueryEngine engine) {
    return Changed_package_uri.Matcher.on(engine);
  }
  
  public Package_classifier getPackage_classifier() {
    return Package_classifier.instance();
  }
  
  public Package_classifier.Matcher getPackage_classifier(final ViatraQueryEngine engine) {
    return Package_classifier.Matcher.on(engine);
  }
  
  public Package_subPackage getPackage_subPackage() {
    return Package_subPackage.instance();
  }
  
  public Package_subPackage.Matcher getPackage_subPackage(final ViatraQueryEngine engine) {
    return Package_subPackage.Matcher.on(engine);
  }
  
  public Package_class getPackage_class() {
    return Package_class.instance();
  }
  
  public Package_class.Matcher getPackage_class(final ViatraQueryEngine engine) {
    return Package_class.Matcher.on(engine);
  }
  
  public Package_dataType getPackage_dataType() {
    return Package_dataType.instance();
  }
  
  public Package_dataType.Matcher getPackage_dataType(final ViatraQueryEngine engine) {
    return Package_dataType.Matcher.on(engine);
  }
  
  public Package_enumeration getPackage_enumeration() {
    return Package_enumeration.instance();
  }
  
  public Package_enumeration.Matcher getPackage_enumeration(final ViatraQueryEngine engine) {
    return Package_enumeration.Matcher.on(engine);
  }
  
  public Preserved_package_classifier getPreserved_package_classifier() {
    return Preserved_package_classifier.instance();
  }
  
  public Preserved_package_classifier.Matcher getPreserved_package_classifier(final ViatraQueryEngine engine) {
    return Preserved_package_classifier.Matcher.on(engine);
  }
  
  public Preserved_package_subPackage getPreserved_package_subPackage() {
    return Preserved_package_subPackage.instance();
  }
  
  public Preserved_package_subPackage.Matcher getPreserved_package_subPackage(final ViatraQueryEngine engine) {
    return Preserved_package_subPackage.Matcher.on(engine);
  }
  
  public Preserved_package_class getPreserved_package_class() {
    return Preserved_package_class.instance();
  }
  
  public Preserved_package_class.Matcher getPreserved_package_class(final ViatraQueryEngine engine) {
    return Preserved_package_class.Matcher.on(engine);
  }
  
  public Preserved_package_dataType getPreserved_package_dataType() {
    return Preserved_package_dataType.instance();
  }
  
  public Preserved_package_dataType.Matcher getPreserved_package_dataType(final ViatraQueryEngine engine) {
    return Preserved_package_dataType.Matcher.on(engine);
  }
  
  public Preserved_package_enuemration getPreserved_package_enuemration() {
    return Preserved_package_enuemration.instance();
  }
  
  public Preserved_package_enuemration.Matcher getPreserved_package_enuemration(final ViatraQueryEngine engine) {
    return Preserved_package_enuemration.Matcher.on(engine);
  }
  
  public Added_package_classifier getAdded_package_classifier() {
    return Added_package_classifier.instance();
  }
  
  public Added_package_classifier.Matcher getAdded_package_classifier(final ViatraQueryEngine engine) {
    return Added_package_classifier.Matcher.on(engine);
  }
  
  public Added_package_subPackage getAdded_package_subPackage() {
    return Added_package_subPackage.instance();
  }
  
  public Added_package_subPackage.Matcher getAdded_package_subPackage(final ViatraQueryEngine engine) {
    return Added_package_subPackage.Matcher.on(engine);
  }
  
  public Added_package_class getAdded_package_class() {
    return Added_package_class.instance();
  }
  
  public Added_package_class.Matcher getAdded_package_class(final ViatraQueryEngine engine) {
    return Added_package_class.Matcher.on(engine);
  }
  
  public Added_package_dataType getAdded_package_dataType() {
    return Added_package_dataType.instance();
  }
  
  public Added_package_dataType.Matcher getAdded_package_dataType(final ViatraQueryEngine engine) {
    return Added_package_dataType.Matcher.on(engine);
  }
  
  public Added_package_enumeration getAdded_package_enumeration() {
    return Added_package_enumeration.instance();
  }
  
  public Added_package_enumeration.Matcher getAdded_package_enumeration(final ViatraQueryEngine engine) {
    return Added_package_enumeration.Matcher.on(engine);
  }
  
  public Removed_package_classifier getRemoved_package_classifier() {
    return Removed_package_classifier.instance();
  }
  
  public Removed_package_classifier.Matcher getRemoved_package_classifier(final ViatraQueryEngine engine) {
    return Removed_package_classifier.Matcher.on(engine);
  }
  
  public Removed_package_subPackage getRemoved_package_subPackage() {
    return Removed_package_subPackage.instance();
  }
  
  public Removed_package_subPackage.Matcher getRemoved_package_subPackage(final ViatraQueryEngine engine) {
    return Removed_package_subPackage.Matcher.on(engine);
  }
  
  public Removed_package_class getRemoved_package_class() {
    return Removed_package_class.instance();
  }
  
  public Removed_package_class.Matcher getRemoved_package_class(final ViatraQueryEngine engine) {
    return Removed_package_class.Matcher.on(engine);
  }
  
  public Removed_package_dataType getRemoved_package_dataType() {
    return Removed_package_dataType.instance();
  }
  
  public Removed_package_dataType.Matcher getRemoved_package_dataType(final ViatraQueryEngine engine) {
    return Removed_package_dataType.Matcher.on(engine);
  }
  
  public Removed_package_enumeration getRemoved_package_enumeration() {
    return Removed_package_enumeration.instance();
  }
  
  public Removed_package_enumeration.Matcher getRemoved_package_enumeration(final ViatraQueryEngine engine) {
    return Removed_package_enumeration.Matcher.on(engine);
  }
}
