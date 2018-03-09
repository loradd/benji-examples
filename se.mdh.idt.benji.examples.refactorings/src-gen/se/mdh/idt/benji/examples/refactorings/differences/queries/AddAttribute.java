/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/AddAttribute.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePrecondition;

/**
 * A pattern group formed of all public patterns defined in AddAttribute.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file AddAttribute.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>AddAttributePrecondition</li>
 * <li>AddAttributePostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class AddAttribute extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static AddAttribute instance() {
    if (INSTANCE == null) {
        INSTANCE = new AddAttribute();
    }
    return INSTANCE;
  }
  
  private static AddAttribute INSTANCE;
  
  private AddAttribute() {
    querySpecifications.add(AddAttributePrecondition.instance());
    querySpecifications.add(AddAttributePostcondition.instance());
  }
  
  public AddAttributePrecondition getAddAttributePrecondition() {
    return AddAttributePrecondition.instance();
  }
  
  public AddAttributePrecondition.Matcher getAddAttributePrecondition(final ViatraQueryEngine engine) {
    return AddAttributePrecondition.Matcher.on(engine);
  }
  
  public AddAttributePostcondition getAddAttributePostcondition() {
    return AddAttributePostcondition.instance();
  }
  
  public AddAttributePostcondition.Matcher getAddAttributePostcondition(final ViatraQueryEngine engine) {
    return AddAttributePostcondition.Matcher.on(engine);
  }
}
