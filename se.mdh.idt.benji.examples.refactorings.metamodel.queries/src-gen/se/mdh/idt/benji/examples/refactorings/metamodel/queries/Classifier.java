/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Classifier.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier_package;

/**
 * A pattern group formed of all public patterns defined in Classifier.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Classifier.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_classifier</li>
 * <li>created_classifier</li>
 * <li>deleted_classifier</li>
 * <li>classifier_name</li>
 * <li>preserved_classifier_name</li>
 * <li>changed_classifier_name</li>
 * <li>classifier_package</li>
 * <li>preserved_classifier_package</li>
 * <li>changed_classifier_package</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Classifier extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Classifier instance() {
    if (INSTANCE == null) {
        INSTANCE = new Classifier();
    }
    return INSTANCE;
  }
  
  private static Classifier INSTANCE;
  
  private Classifier() {
    querySpecifications.add(Preserved_classifier.instance());
    querySpecifications.add(Created_classifier.instance());
    querySpecifications.add(Deleted_classifier.instance());
    querySpecifications.add(Classifier_name.instance());
    querySpecifications.add(Preserved_classifier_name.instance());
    querySpecifications.add(Changed_classifier_name.instance());
    querySpecifications.add(Classifier_package.instance());
    querySpecifications.add(Preserved_classifier_package.instance());
    querySpecifications.add(Changed_classifier_package.instance());
  }
  
  public Preserved_classifier getPreserved_classifier() {
    return Preserved_classifier.instance();
  }
  
  public Preserved_classifier.Matcher getPreserved_classifier(final ViatraQueryEngine engine) {
    return Preserved_classifier.Matcher.on(engine);
  }
  
  public Created_classifier getCreated_classifier() {
    return Created_classifier.instance();
  }
  
  public Created_classifier.Matcher getCreated_classifier(final ViatraQueryEngine engine) {
    return Created_classifier.Matcher.on(engine);
  }
  
  public Deleted_classifier getDeleted_classifier() {
    return Deleted_classifier.instance();
  }
  
  public Deleted_classifier.Matcher getDeleted_classifier(final ViatraQueryEngine engine) {
    return Deleted_classifier.Matcher.on(engine);
  }
  
  public Classifier_name getClassifier_name() {
    return Classifier_name.instance();
  }
  
  public Classifier_name.Matcher getClassifier_name(final ViatraQueryEngine engine) {
    return Classifier_name.Matcher.on(engine);
  }
  
  public Preserved_classifier_name getPreserved_classifier_name() {
    return Preserved_classifier_name.instance();
  }
  
  public Preserved_classifier_name.Matcher getPreserved_classifier_name(final ViatraQueryEngine engine) {
    return Preserved_classifier_name.Matcher.on(engine);
  }
  
  public Changed_classifier_name getChanged_classifier_name() {
    return Changed_classifier_name.instance();
  }
  
  public Changed_classifier_name.Matcher getChanged_classifier_name(final ViatraQueryEngine engine) {
    return Changed_classifier_name.Matcher.on(engine);
  }
  
  public Classifier_package getClassifier_package() {
    return Classifier_package.instance();
  }
  
  public Classifier_package.Matcher getClassifier_package(final ViatraQueryEngine engine) {
    return Classifier_package.Matcher.on(engine);
  }
  
  public Preserved_classifier_package getPreserved_classifier_package() {
    return Preserved_classifier_package.instance();
  }
  
  public Preserved_classifier_package.Matcher getPreserved_classifier_package(final ViatraQueryEngine engine) {
    return Preserved_classifier_package.Matcher.on(engine);
  }
  
  public Changed_classifier_package getChanged_classifier_package() {
    return Changed_classifier_package.instance();
  }
  
  public Changed_classifier_package.Matcher getChanged_classifier_package(final ViatraQueryEngine engine) {
    return Changed_classifier_package.Matcher.on(engine);
  }
}
