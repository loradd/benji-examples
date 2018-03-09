/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/RestrictMetaproperty.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPrecondition;

/**
 * A pattern group formed of all public patterns defined in RestrictMetaproperty.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file RestrictMetaproperty.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>RestrictMetapropertyPrecondition</li>
 * <li>RestrictMetapropertyPostcondition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class RestrictMetaproperty extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static RestrictMetaproperty instance() {
    if (INSTANCE == null) {
        INSTANCE = new RestrictMetaproperty();
    }
    return INSTANCE;
  }
  
  private static RestrictMetaproperty INSTANCE;
  
  private RestrictMetaproperty() {
    querySpecifications.add(RestrictMetapropertyPrecondition.instance());
    querySpecifications.add(RestrictMetapropertyPostcondition.instance());
  }
  
  public RestrictMetapropertyPrecondition getRestrictMetapropertyPrecondition() {
    return RestrictMetapropertyPrecondition.instance();
  }
  
  public RestrictMetapropertyPrecondition.Matcher getRestrictMetapropertyPrecondition(final ViatraQueryEngine engine) {
    return RestrictMetapropertyPrecondition.Matcher.on(engine);
  }
  
  public RestrictMetapropertyPostcondition getRestrictMetapropertyPostcondition() {
    return RestrictMetapropertyPostcondition.instance();
  }
  
  public RestrictMetapropertyPostcondition.Matcher getRestrictMetapropertyPostcondition(final ViatraQueryEngine engine) {
    return RestrictMetapropertyPostcondition.Matcher.on(engine);
  }
}
