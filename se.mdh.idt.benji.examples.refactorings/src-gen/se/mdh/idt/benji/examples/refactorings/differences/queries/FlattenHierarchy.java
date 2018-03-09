/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/FlattenHierarchy.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.FlattenHierarchyPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.FlattenHierarchyPrecondition;

/**
 * A pattern group formed of all public patterns defined in FlattenHierarchy.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file FlattenHierarchy.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>FlattenHierarchyPrecondition</li>
 * <li>FlattenHierarchyPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class FlattenHierarchy extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static FlattenHierarchy instance() {
    if (INSTANCE == null) {
        INSTANCE = new FlattenHierarchy();
    }
    return INSTANCE;
  }
  
  private static FlattenHierarchy INSTANCE;
  
  private FlattenHierarchy() {
    querySpecifications.add(FlattenHierarchyPrecondition.instance());
    querySpecifications.add(FlattenHierarchyPostcondition.instance());
  }
  
  public FlattenHierarchyPrecondition getFlattenHierarchyPrecondition() {
    return FlattenHierarchyPrecondition.instance();
  }
  
  public FlattenHierarchyPrecondition.Matcher getFlattenHierarchyPrecondition(final ViatraQueryEngine engine) {
    return FlattenHierarchyPrecondition.Matcher.on(engine);
  }
  
  public FlattenHierarchyPostcondition getFlattenHierarchyPostcondition() {
    return FlattenHierarchyPostcondition.instance();
  }
  
  public FlattenHierarchyPostcondition.Matcher getFlattenHierarchyPostcondition(final ViatraQueryEngine engine) {
    return FlattenHierarchyPostcondition.Matcher.on(engine);
  }
}
