/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/DeleteReference.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteReferencePrecondition;

/**
 * A pattern group formed of all public patterns defined in DeleteReference.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file DeleteReference.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>DeleteReferencePrecondition</li>
 * <li>DeleteReferencePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class DeleteReference extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DeleteReference instance() {
    if (INSTANCE == null) {
        INSTANCE = new DeleteReference();
    }
    return INSTANCE;
  }
  
  private static DeleteReference INSTANCE;
  
  private DeleteReference() {
    querySpecifications.add(DeleteReferencePrecondition.instance());
    querySpecifications.add(DeleteReferencePostcondition.instance());
  }
  
  public DeleteReferencePrecondition getDeleteReferencePrecondition() {
    return DeleteReferencePrecondition.instance();
  }
  
  public DeleteReferencePrecondition.Matcher getDeleteReferencePrecondition(final ViatraQueryEngine engine) {
    return DeleteReferencePrecondition.Matcher.on(engine);
  }
  
  public DeleteReferencePostcondition getDeleteReferencePostcondition() {
    return DeleteReferencePostcondition.instance();
  }
  
  public DeleteReferencePostcondition.Matcher getDeleteReferencePostcondition(final ViatraQueryEngine engine) {
    return DeleteReferencePostcondition.Matcher.on(engine);
  }
}
