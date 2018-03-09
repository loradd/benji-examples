/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/RenamePackage.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenamePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenamePackagePrecondition;

/**
 * A pattern group formed of all public patterns defined in RenamePackage.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file RenamePackage.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>RenamePackagePrecondition</li>
 * <li>RenamePackagePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class RenamePackage extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static RenamePackage instance() {
    if (INSTANCE == null) {
        INSTANCE = new RenamePackage();
    }
    return INSTANCE;
  }
  
  private static RenamePackage INSTANCE;
  
  private RenamePackage() {
    querySpecifications.add(RenamePackagePrecondition.instance());
    querySpecifications.add(RenamePackagePostcondition.instance());
  }
  
  public RenamePackagePrecondition getRenamePackagePrecondition() {
    return RenamePackagePrecondition.instance();
  }
  
  public RenamePackagePrecondition.Matcher getRenamePackagePrecondition(final ViatraQueryEngine engine) {
    return RenamePackagePrecondition.Matcher.on(engine);
  }
  
  public RenamePackagePostcondition getRenamePackagePostcondition() {
    return RenamePackagePostcondition.instance();
  }
  
  public RenamePackagePostcondition.Matcher getRenamePackagePostcondition(final ViatraQueryEngine engine) {
    return RenamePackagePostcondition.Matcher.on(engine);
  }
}
