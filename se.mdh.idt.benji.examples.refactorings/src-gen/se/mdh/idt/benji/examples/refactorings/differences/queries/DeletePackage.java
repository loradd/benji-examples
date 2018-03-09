/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/DeletePackage.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeletePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeletePackagePrecondition;

/**
 * A pattern group formed of all public patterns defined in DeletePackage.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file DeletePackage.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>DeletePackagePrecondition</li>
 * <li>DeletePackagePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class DeletePackage extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DeletePackage instance() {
    if (INSTANCE == null) {
        INSTANCE = new DeletePackage();
    }
    return INSTANCE;
  }
  
  private static DeletePackage INSTANCE;
  
  private DeletePackage() {
    querySpecifications.add(DeletePackagePrecondition.instance());
    querySpecifications.add(DeletePackagePostcondition.instance());
  }
  
  public DeletePackagePrecondition getDeletePackagePrecondition() {
    return DeletePackagePrecondition.instance();
  }
  
  public DeletePackagePrecondition.Matcher getDeletePackagePrecondition(final ViatraQueryEngine engine) {
    return DeletePackagePrecondition.Matcher.on(engine);
  }
  
  public DeletePackagePostcondition getDeletePackagePostcondition() {
    return DeletePackagePostcondition.instance();
  }
  
  public DeletePackagePostcondition.Matcher getDeletePackagePostcondition(final ViatraQueryEngine engine) {
    return DeletePackagePostcondition.Matcher.on(engine);
  }
}
