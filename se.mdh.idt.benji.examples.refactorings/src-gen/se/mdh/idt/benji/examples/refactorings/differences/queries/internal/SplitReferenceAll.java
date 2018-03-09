/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/SplitReference.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries.internal;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.internal.Split_class_reference;

/**
 * A pattern group formed of all patterns defined in SplitReference.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.differences.queries, the group contains the definition of the following patterns: <ul>
 * <li>SplitReferencePrecondition</li>
 * <li>SplitReferencePostcondition</li>
 * <li>split_class_reference</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class SplitReferenceAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static SplitReferenceAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new SplitReferenceAll();
    }
    return INSTANCE;
  }
  
  private static SplitReferenceAll INSTANCE;
  
  private SplitReferenceAll() {
    querySpecifications.add(SplitReferencePrecondition.instance());
    querySpecifications.add(SplitReferencePostcondition.instance());
    querySpecifications.add(Split_class_reference.instance());
  }
}
