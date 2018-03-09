/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/DeleteAttribute.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteAttributePrecondition;

/**
 * A pattern group formed of all public patterns defined in DeleteAttribute.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file DeleteAttribute.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>DeleteAttributePrecondition</li>
 * <li>DeleteAttributePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class DeleteAttribute extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DeleteAttribute instance() {
    if (INSTANCE == null) {
        INSTANCE = new DeleteAttribute();
    }
    return INSTANCE;
  }
  
  private static DeleteAttribute INSTANCE;
  
  private DeleteAttribute() {
    querySpecifications.add(DeleteAttributePrecondition.instance());
    querySpecifications.add(DeleteAttributePostcondition.instance());
  }
  
  public DeleteAttributePrecondition getDeleteAttributePrecondition() {
    return DeleteAttributePrecondition.instance();
  }
  
  public DeleteAttributePrecondition.Matcher getDeleteAttributePrecondition(final ViatraQueryEngine engine) {
    return DeleteAttributePrecondition.Matcher.on(engine);
  }
  
  public DeleteAttributePostcondition getDeleteAttributePostcondition() {
    return DeleteAttributePostcondition.instance();
  }
  
  public DeleteAttributePostcondition.Matcher getDeleteAttributePostcondition(final ViatraQueryEngine engine) {
    return DeleteAttributePostcondition.Matcher.on(engine);
  }
}
