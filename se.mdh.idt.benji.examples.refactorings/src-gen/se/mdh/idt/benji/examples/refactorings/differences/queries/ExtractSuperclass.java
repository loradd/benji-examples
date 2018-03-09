/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ExtractSuperclass.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractSuperclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractSuperclassPrecondition;

/**
 * A pattern group formed of all public patterns defined in ExtractSuperclass.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ExtractSuperclass.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>ExtractSuperclassPrecondition</li>
 * <li>ExtractSuperclassPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class ExtractSuperclass extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ExtractSuperclass instance() {
    if (INSTANCE == null) {
        INSTANCE = new ExtractSuperclass();
    }
    return INSTANCE;
  }
  
  private static ExtractSuperclass INSTANCE;
  
  private ExtractSuperclass() {
    querySpecifications.add(ExtractSuperclassPrecondition.instance());
    querySpecifications.add(ExtractSuperclassPostcondition.instance());
  }
  
  public ExtractSuperclassPrecondition getExtractSuperclassPrecondition() {
    return ExtractSuperclassPrecondition.instance();
  }
  
  public ExtractSuperclassPrecondition.Matcher getExtractSuperclassPrecondition(final ViatraQueryEngine engine) {
    return ExtractSuperclassPrecondition.Matcher.on(engine);
  }
  
  public ExtractSuperclassPostcondition getExtractSuperclassPostcondition() {
    return ExtractSuperclassPostcondition.instance();
  }
  
  public ExtractSuperclassPostcondition.Matcher getExtractSuperclassPostcondition(final ViatraQueryEngine engine) {
    return ExtractSuperclassPostcondition.Matcher.on(engine);
  }
}
