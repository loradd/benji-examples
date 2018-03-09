/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/RenameMetaclass.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameMetaclassPrecondition;

/**
 * A pattern group formed of all public patterns defined in RenameMetaclass.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file RenameMetaclass.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>RenameMetaclassPrecondition</li>
 * <li>RenameMetaclassPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class RenameMetaclass extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static RenameMetaclass instance() {
    if (INSTANCE == null) {
        INSTANCE = new RenameMetaclass();
    }
    return INSTANCE;
  }
  
  private static RenameMetaclass INSTANCE;
  
  private RenameMetaclass() {
    querySpecifications.add(RenameMetaclassPrecondition.instance());
    querySpecifications.add(RenameMetaclassPostcondition.instance());
  }
  
  public RenameMetaclassPrecondition getRenameMetaclassPrecondition() {
    return RenameMetaclassPrecondition.instance();
  }
  
  public RenameMetaclassPrecondition.Matcher getRenameMetaclassPrecondition(final ViatraQueryEngine engine) {
    return RenameMetaclassPrecondition.Matcher.on(engine);
  }
  
  public RenameMetaclassPostcondition getRenameMetaclassPostcondition() {
    return RenameMetaclassPostcondition.instance();
  }
  
  public RenameMetaclassPostcondition.Matcher getRenameMetaclassPostcondition(final ViatraQueryEngine engine) {
    return RenameMetaclassPostcondition.Matcher.on(engine);
  }
}
