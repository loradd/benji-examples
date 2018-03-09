/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/RenameURIPackage.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameURIPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameURIPackagePrecondition;

/**
 * A pattern group formed of all public patterns defined in RenameURIPackage.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file RenameURIPackage.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>RenameURIPackagePrecondition</li>
 * <li>RenameURIPackagePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class RenameURIPackage extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static RenameURIPackage instance() {
    if (INSTANCE == null) {
        INSTANCE = new RenameURIPackage();
    }
    return INSTANCE;
  }
  
  private static RenameURIPackage INSTANCE;
  
  private RenameURIPackage() {
    querySpecifications.add(RenameURIPackagePrecondition.instance());
    querySpecifications.add(RenameURIPackagePostcondition.instance());
  }
  
  public RenameURIPackagePrecondition getRenameURIPackagePrecondition() {
    return RenameURIPackagePrecondition.instance();
  }
  
  public RenameURIPackagePrecondition.Matcher getRenameURIPackagePrecondition(final ViatraQueryEngine engine) {
    return RenameURIPackagePrecondition.Matcher.on(engine);
  }
  
  public RenameURIPackagePostcondition getRenameURIPackagePostcondition() {
    return RenameURIPackagePostcondition.instance();
  }
  
  public RenameURIPackagePostcondition.Matcher getRenameURIPackagePostcondition(final ViatraQueryEngine engine) {
    return RenameURIPackagePostcondition.Matcher.on(engine);
  }
}
