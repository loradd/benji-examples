/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ExtractMetaclass.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPrecondition;

/**
 * A pattern group formed of all public patterns defined in ExtractMetaclass.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ExtractMetaclass.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>ExtractMetaclassPrecondition</li>
 * <li>ExtractMetaclassPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class ExtractMetaclass extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ExtractMetaclass instance() {
    if (INSTANCE == null) {
        INSTANCE = new ExtractMetaclass();
    }
    return INSTANCE;
  }
  
  private static ExtractMetaclass INSTANCE;
  
  private ExtractMetaclass() {
    querySpecifications.add(ExtractMetaclassPrecondition.instance());
    querySpecifications.add(ExtractMetaclassPostcondition.instance());
  }
  
  public ExtractMetaclassPrecondition getExtractMetaclassPrecondition() {
    return ExtractMetaclassPrecondition.instance();
  }
  
  public ExtractMetaclassPrecondition.Matcher getExtractMetaclassPrecondition(final ViatraQueryEngine engine) {
    return ExtractMetaclassPrecondition.Matcher.on(engine);
  }
  
  public ExtractMetaclassPostcondition getExtractMetaclassPostcondition() {
    return ExtractMetaclassPostcondition.instance();
  }
  
  public ExtractMetaclassPostcondition.Matcher getExtractMetaclassPostcondition(final ViatraQueryEngine engine) {
    return ExtractMetaclassPostcondition.Matcher.on(engine);
  }
}
