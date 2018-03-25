/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Classifier.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_classifier_package;

/**
 * A pattern group formed of all public patterns defined in Classifier.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Classifier.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_classifier</li>
 * <li>create_classifier</li>
 * <li>delete_classifier</li>
 * <li>initial_classifier</li>
 * <li>current_classifier</li>
 * <li>get_classifier_name</li>
 * <li>set_classifier_name</li>
 * <li>unset_classifier_name</li>
 * <li>initial_classifier_name</li>
 * <li>current_classifier_name</li>
 * <li>get_classifier_package</li>
 * <li>set_classifier_package</li>
 * <li>unset_classifier_package</li>
 * <li>initial_classifier_package</li>
 * <li>current_classifier_package</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
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
    querySpecifications.add(Get_classifier.instance());
    querySpecifications.add(Create_classifier.instance());
    querySpecifications.add(Delete_classifier.instance());
    querySpecifications.add(Initial_classifier.instance());
    querySpecifications.add(Current_classifier.instance());
    querySpecifications.add(Get_classifier_name.instance());
    querySpecifications.add(Set_classifier_name.instance());
    querySpecifications.add(Unset_classifier_name.instance());
    querySpecifications.add(Initial_classifier_name.instance());
    querySpecifications.add(Current_classifier_name.instance());
    querySpecifications.add(Get_classifier_package.instance());
    querySpecifications.add(Set_classifier_package.instance());
    querySpecifications.add(Unset_classifier_package.instance());
    querySpecifications.add(Initial_classifier_package.instance());
    querySpecifications.add(Current_classifier_package.instance());
  }
  
  public Get_classifier getGet_classifier() {
    return Get_classifier.instance();
  }
  
  public Get_classifier.Matcher getGet_classifier(final ViatraQueryEngine engine) {
    return Get_classifier.Matcher.on(engine);
  }
  
  public Create_classifier getCreate_classifier() {
    return Create_classifier.instance();
  }
  
  public Create_classifier.Matcher getCreate_classifier(final ViatraQueryEngine engine) {
    return Create_classifier.Matcher.on(engine);
  }
  
  public Delete_classifier getDelete_classifier() {
    return Delete_classifier.instance();
  }
  
  public Delete_classifier.Matcher getDelete_classifier(final ViatraQueryEngine engine) {
    return Delete_classifier.Matcher.on(engine);
  }
  
  public Initial_classifier getInitial_classifier() {
    return Initial_classifier.instance();
  }
  
  public Initial_classifier.Matcher getInitial_classifier(final ViatraQueryEngine engine) {
    return Initial_classifier.Matcher.on(engine);
  }
  
  public Current_classifier getCurrent_classifier() {
    return Current_classifier.instance();
  }
  
  public Current_classifier.Matcher getCurrent_classifier(final ViatraQueryEngine engine) {
    return Current_classifier.Matcher.on(engine);
  }
  
  public Get_classifier_name getGet_classifier_name() {
    return Get_classifier_name.instance();
  }
  
  public Get_classifier_name.Matcher getGet_classifier_name(final ViatraQueryEngine engine) {
    return Get_classifier_name.Matcher.on(engine);
  }
  
  public Set_classifier_name getSet_classifier_name() {
    return Set_classifier_name.instance();
  }
  
  public Set_classifier_name.Matcher getSet_classifier_name(final ViatraQueryEngine engine) {
    return Set_classifier_name.Matcher.on(engine);
  }
  
  public Unset_classifier_name getUnset_classifier_name() {
    return Unset_classifier_name.instance();
  }
  
  public Unset_classifier_name.Matcher getUnset_classifier_name(final ViatraQueryEngine engine) {
    return Unset_classifier_name.Matcher.on(engine);
  }
  
  public Initial_classifier_name getInitial_classifier_name() {
    return Initial_classifier_name.instance();
  }
  
  public Initial_classifier_name.Matcher getInitial_classifier_name(final ViatraQueryEngine engine) {
    return Initial_classifier_name.Matcher.on(engine);
  }
  
  public Current_classifier_name getCurrent_classifier_name() {
    return Current_classifier_name.instance();
  }
  
  public Current_classifier_name.Matcher getCurrent_classifier_name(final ViatraQueryEngine engine) {
    return Current_classifier_name.Matcher.on(engine);
  }
  
  public Get_classifier_package getGet_classifier_package() {
    return Get_classifier_package.instance();
  }
  
  public Get_classifier_package.Matcher getGet_classifier_package(final ViatraQueryEngine engine) {
    return Get_classifier_package.Matcher.on(engine);
  }
  
  public Set_classifier_package getSet_classifier_package() {
    return Set_classifier_package.instance();
  }
  
  public Set_classifier_package.Matcher getSet_classifier_package(final ViatraQueryEngine engine) {
    return Set_classifier_package.Matcher.on(engine);
  }
  
  public Unset_classifier_package getUnset_classifier_package() {
    return Unset_classifier_package.instance();
  }
  
  public Unset_classifier_package.Matcher getUnset_classifier_package(final ViatraQueryEngine engine) {
    return Unset_classifier_package.Matcher.on(engine);
  }
  
  public Initial_classifier_package getInitial_classifier_package() {
    return Initial_classifier_package.instance();
  }
  
  public Initial_classifier_package.Matcher getInitial_classifier_package(final ViatraQueryEngine engine) {
    return Initial_classifier_package.Matcher.on(engine);
  }
  
  public Current_classifier_package getCurrent_classifier_package() {
    return Current_classifier_package.instance();
  }
  
  public Current_classifier_package.Matcher getCurrent_classifier_package(final ViatraQueryEngine engine) {
    return Current_classifier_package.Matcher.on(engine);
  }
}
