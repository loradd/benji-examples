/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ChangeMetaclassAbstract.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition;

/**
 * A pattern group formed of all public patterns defined in ChangeMetaclassAbstract.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ChangeMetaclassAbstract.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>ChangeMetaclassAbstractPrecondition</li>
 * <li>ChangeMetaclassAbstractPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class ChangeMetaclassAbstract extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ChangeMetaclassAbstract instance() {
    if (INSTANCE == null) {
        INSTANCE = new ChangeMetaclassAbstract();
    }
    return INSTANCE;
  }
  
  private static ChangeMetaclassAbstract INSTANCE;
  
  private ChangeMetaclassAbstract() {
    querySpecifications.add(ChangeMetaclassAbstractPrecondition.instance());
    querySpecifications.add(ChangeMetaclassAbstractPostcondition.instance());
  }
  
  public ChangeMetaclassAbstractPrecondition getChangeMetaclassAbstractPrecondition() {
    return ChangeMetaclassAbstractPrecondition.instance();
  }
  
  public ChangeMetaclassAbstractPrecondition.Matcher getChangeMetaclassAbstractPrecondition(final ViatraQueryEngine engine) {
    return ChangeMetaclassAbstractPrecondition.Matcher.on(engine);
  }
  
  public ChangeMetaclassAbstractPostcondition getChangeMetaclassAbstractPostcondition() {
    return ChangeMetaclassAbstractPostcondition.instance();
  }
  
  public ChangeMetaclassAbstractPostcondition.Matcher getChangeMetaclassAbstractPostcondition(final ViatraQueryEngine engine) {
    return ChangeMetaclassAbstractPostcondition.Matcher.on(engine);
  }
}
