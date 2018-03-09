/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/SplitReference.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePrecondition;

/**
 * A pattern group formed of all public patterns defined in SplitReference.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file SplitReference.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>SplitReferencePrecondition</li>
 * <li>SplitReferencePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class SplitReference extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SplitReference instance() {
    if (INSTANCE == null) {
        INSTANCE = new SplitReference();
    }
    return INSTANCE;
  }
  
  private static SplitReference INSTANCE;
  
  private SplitReference() {
    querySpecifications.add(SplitReferencePrecondition.instance());
    querySpecifications.add(SplitReferencePostcondition.instance());
  }
  
  public SplitReferencePrecondition getSplitReferencePrecondition() {
    return SplitReferencePrecondition.instance();
  }
  
  public SplitReferencePrecondition.Matcher getSplitReferencePrecondition(final ViatraQueryEngine engine) {
    return SplitReferencePrecondition.Matcher.on(engine);
  }
  
  public SplitReferencePostcondition getSplitReferencePostcondition() {
    return SplitReferencePostcondition.instance();
  }
  
  public SplitReferencePostcondition.Matcher getSplitReferencePostcondition(final ViatraQueryEngine engine) {
    return SplitReferencePostcondition.Matcher.on(engine);
  }
}
