/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/AddPackage.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddPackagePrecondition;

/**
 * A pattern group formed of all public patterns defined in AddPackage.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file AddPackage.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>AddPackagePrecondition</li>
 * <li>AddPackagePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class AddPackage extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static AddPackage instance() {
    if (INSTANCE == null) {
        INSTANCE = new AddPackage();
    }
    return INSTANCE;
  }
  
  private static AddPackage INSTANCE;
  
  private AddPackage() {
    querySpecifications.add(AddPackagePrecondition.instance());
    querySpecifications.add(AddPackagePostcondition.instance());
  }
  
  public AddPackagePrecondition getAddPackagePrecondition() {
    return AddPackagePrecondition.instance();
  }
  
  public AddPackagePrecondition.Matcher getAddPackagePrecondition(final ViatraQueryEngine engine) {
    return AddPackagePrecondition.Matcher.on(engine);
  }
  
  public AddPackagePostcondition getAddPackagePostcondition() {
    return AddPackagePostcondition.instance();
  }
  
  public AddPackagePostcondition.Matcher getAddPackagePostcondition(final ViatraQueryEngine engine) {
    return AddPackagePostcondition.Matcher.on(engine);
  }
}
