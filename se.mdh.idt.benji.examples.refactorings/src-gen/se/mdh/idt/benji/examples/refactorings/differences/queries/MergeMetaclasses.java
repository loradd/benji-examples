/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/MergeMetaclasses.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition;

/**
 * A pattern group formed of all public patterns defined in MergeMetaclasses.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file MergeMetaclasses.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>MergeMetaclassesPrecondition</li>
 * <li>MergeMetaclassesPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class MergeMetaclasses extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static MergeMetaclasses instance() {
    if (INSTANCE == null) {
        INSTANCE = new MergeMetaclasses();
    }
    return INSTANCE;
  }
  
  private static MergeMetaclasses INSTANCE;
  
  private MergeMetaclasses() {
    querySpecifications.add(MergeMetaclassesPrecondition.instance());
    querySpecifications.add(MergeMetaclassesPostcondition.instance());
  }
  
  public MergeMetaclassesPrecondition getMergeMetaclassesPrecondition() {
    return MergeMetaclassesPrecondition.instance();
  }
  
  public MergeMetaclassesPrecondition.Matcher getMergeMetaclassesPrecondition(final ViatraQueryEngine engine) {
    return MergeMetaclassesPrecondition.Matcher.on(engine);
  }
  
  public MergeMetaclassesPostcondition getMergeMetaclassesPostcondition() {
    return MergeMetaclassesPostcondition.instance();
  }
  
  public MergeMetaclassesPostcondition.Matcher getMergeMetaclassesPostcondition(final ViatraQueryEngine engine) {
    return MergeMetaclassesPostcondition.Matcher.on(engine);
  }
}
