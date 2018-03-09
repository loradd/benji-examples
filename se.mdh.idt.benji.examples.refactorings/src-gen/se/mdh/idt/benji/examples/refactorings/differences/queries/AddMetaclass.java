/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/AddMetaclass.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPrecondition;

/**
 * A pattern group formed of all public patterns defined in AddMetaclass.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file AddMetaclass.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>AddMetaclassPrecondition</li>
 * <li>AddMetaclassPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class AddMetaclass extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static AddMetaclass instance() {
    if (INSTANCE == null) {
        INSTANCE = new AddMetaclass();
    }
    return INSTANCE;
  }
  
  private static AddMetaclass INSTANCE;
  
  private AddMetaclass() {
    querySpecifications.add(AddMetaclassPrecondition.instance());
    querySpecifications.add(AddMetaclassPostcondition.instance());
  }
  
  public AddMetaclassPrecondition getAddMetaclassPrecondition() {
    return AddMetaclassPrecondition.instance();
  }
  
  public AddMetaclassPrecondition.Matcher getAddMetaclassPrecondition(final ViatraQueryEngine engine) {
    return AddMetaclassPrecondition.Matcher.on(engine);
  }
  
  public AddMetaclassPostcondition getAddMetaclassPostcondition() {
    return AddMetaclassPostcondition.instance();
  }
  
  public AddMetaclassPostcondition.Matcher getAddMetaclassPostcondition(final ViatraQueryEngine engine) {
    return AddMetaclassPostcondition.Matcher.on(engine);
  }
}
