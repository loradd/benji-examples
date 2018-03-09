/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/Common.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_attribute;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_reference;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_superClass;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Flattened_class_superClass;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Flattened_package_class;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Split_class_reference;

/**
 * A pattern group formed of all public patterns defined in Common.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Common.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>common_class_attribute</li>
 * <li>common_class_reference</li>
 * <li>common_class_superClass</li>
 * <li>split_class_reference</li>
 * <li>flattened_package_class</li>
 * <li>flattened_class_superClass</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Common extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Common instance() {
    if (INSTANCE == null) {
        INSTANCE = new Common();
    }
    return INSTANCE;
  }
  
  private static Common INSTANCE;
  
  private Common() {
    querySpecifications.add(Common_class_attribute.instance());
    querySpecifications.add(Common_class_reference.instance());
    querySpecifications.add(Common_class_superClass.instance());
    querySpecifications.add(Split_class_reference.instance());
    querySpecifications.add(Flattened_package_class.instance());
    querySpecifications.add(Flattened_class_superClass.instance());
  }
  
  public Common_class_attribute getCommon_class_attribute() {
    return Common_class_attribute.instance();
  }
  
  public Common_class_attribute.Matcher getCommon_class_attribute(final ViatraQueryEngine engine) {
    return Common_class_attribute.Matcher.on(engine);
  }
  
  public Common_class_reference getCommon_class_reference() {
    return Common_class_reference.instance();
  }
  
  public Common_class_reference.Matcher getCommon_class_reference(final ViatraQueryEngine engine) {
    return Common_class_reference.Matcher.on(engine);
  }
  
  public Common_class_superClass getCommon_class_superClass() {
    return Common_class_superClass.instance();
  }
  
  public Common_class_superClass.Matcher getCommon_class_superClass(final ViatraQueryEngine engine) {
    return Common_class_superClass.Matcher.on(engine);
  }
  
  public Split_class_reference getSplit_class_reference() {
    return Split_class_reference.instance();
  }
  
  public Split_class_reference.Matcher getSplit_class_reference(final ViatraQueryEngine engine) {
    return Split_class_reference.Matcher.on(engine);
  }
  
  public Flattened_package_class getFlattened_package_class() {
    return Flattened_package_class.instance();
  }
  
  public Flattened_package_class.Matcher getFlattened_package_class(final ViatraQueryEngine engine) {
    return Flattened_package_class.Matcher.on(engine);
  }
  
  public Flattened_class_superClass getFlattened_class_superClass() {
    return Flattened_class_superClass.instance();
  }
  
  public Flattened_class_superClass.Matcher getFlattened_class_superClass(final ViatraQueryEngine engine) {
    return Flattened_class_superClass.Matcher.on(engine);
  }
}
