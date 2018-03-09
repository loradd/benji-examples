/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ChangeReferenceType.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePrecondition;

/**
 * A pattern group formed of all public patterns defined in ChangeReferenceType.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ChangeReferenceType.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>ChangeReferenceTypePrecondition</li>
 * <li>ChangeReferenceTypePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class ChangeReferenceType extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ChangeReferenceType instance() {
    if (INSTANCE == null) {
        INSTANCE = new ChangeReferenceType();
    }
    return INSTANCE;
  }
  
  private static ChangeReferenceType INSTANCE;
  
  private ChangeReferenceType() {
    querySpecifications.add(ChangeReferenceTypePrecondition.instance());
    querySpecifications.add(ChangeReferenceTypePostcondition.instance());
  }
  
  public ChangeReferenceTypePrecondition getChangeReferenceTypePrecondition() {
    return ChangeReferenceTypePrecondition.instance();
  }
  
  public ChangeReferenceTypePrecondition.Matcher getChangeReferenceTypePrecondition(final ViatraQueryEngine engine) {
    return ChangeReferenceTypePrecondition.Matcher.on(engine);
  }
  
  public ChangeReferenceTypePostcondition getChangeReferenceTypePostcondition() {
    return ChangeReferenceTypePostcondition.instance();
  }
  
  public ChangeReferenceTypePostcondition.Matcher getChangeReferenceTypePostcondition(final ViatraQueryEngine engine) {
    return ChangeReferenceTypePostcondition.Matcher.on(engine);
  }
}
