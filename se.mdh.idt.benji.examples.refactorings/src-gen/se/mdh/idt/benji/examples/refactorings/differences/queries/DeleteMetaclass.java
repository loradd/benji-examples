/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/DeleteMetaclass.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteMetaclassPrecondition;

/**
 * A pattern group formed of all public patterns defined in DeleteMetaclass.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file DeleteMetaclass.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>DeleteMetaclassPrecondition</li>
 * <li>DeleteMetaclassPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class DeleteMetaclass extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DeleteMetaclass instance() {
    if (INSTANCE == null) {
        INSTANCE = new DeleteMetaclass();
    }
    return INSTANCE;
  }
  
  private static DeleteMetaclass INSTANCE;
  
  private DeleteMetaclass() {
    querySpecifications.add(DeleteMetaclassPrecondition.instance());
    querySpecifications.add(DeleteMetaclassPostcondition.instance());
  }
  
  public DeleteMetaclassPrecondition getDeleteMetaclassPrecondition() {
    return DeleteMetaclassPrecondition.instance();
  }
  
  public DeleteMetaclassPrecondition.Matcher getDeleteMetaclassPrecondition(final ViatraQueryEngine engine) {
    return DeleteMetaclassPrecondition.Matcher.on(engine);
  }
  
  public DeleteMetaclassPostcondition getDeleteMetaclassPostcondition() {
    return DeleteMetaclassPostcondition.instance();
  }
  
  public DeleteMetaclassPostcondition.Matcher getDeleteMetaclassPostcondition(final ViatraQueryEngine engine) {
    return DeleteMetaclassPostcondition.Matcher.on(engine);
  }
}
