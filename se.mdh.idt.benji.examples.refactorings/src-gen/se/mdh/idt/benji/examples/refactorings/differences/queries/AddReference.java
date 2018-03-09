/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/AddReference.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddReferencePrecondition;

/**
 * A pattern group formed of all public patterns defined in AddReference.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file AddReference.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>AddReferencePrecondition</li>
 * <li>AddReferencePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class AddReference extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static AddReference instance() {
    if (INSTANCE == null) {
        INSTANCE = new AddReference();
    }
    return INSTANCE;
  }
  
  private static AddReference INSTANCE;
  
  private AddReference() {
    querySpecifications.add(AddReferencePrecondition.instance());
    querySpecifications.add(AddReferencePostcondition.instance());
  }
  
  public AddReferencePrecondition getAddReferencePrecondition() {
    return AddReferencePrecondition.instance();
  }
  
  public AddReferencePrecondition.Matcher getAddReferencePrecondition(final ViatraQueryEngine engine) {
    return AddReferencePrecondition.Matcher.on(engine);
  }
  
  public AddReferencePostcondition getAddReferencePostcondition() {
    return AddReferencePostcondition.instance();
  }
  
  public AddReferencePostcondition.Matcher getAddReferencePostcondition(final ViatraQueryEngine engine) {
    return AddReferencePostcondition.Matcher.on(engine);
  }
}
