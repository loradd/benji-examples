/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/NamedElementQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Created_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_namedElement_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_namedElement_name;

/**
 * A pattern group formed of all public patterns defined in NamedElementQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file NamedElementQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.simplecore.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_namedElement</li>
 * <li>created_namedElement</li>
 * <li>deleted_namedElement</li>
 * <li>set_namedElement_name</li>
 * <li>unset_namedElement_name</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class NamedElementQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static NamedElementQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new NamedElementQueries();
    }
    return INSTANCE;
  }
  
  private static NamedElementQueries INSTANCE;
  
  private NamedElementQueries() {
    querySpecifications.add(Preserved_namedElement.instance());
    querySpecifications.add(Created_namedElement.instance());
    querySpecifications.add(Deleted_namedElement.instance());
    querySpecifications.add(Set_namedElement_name.instance());
    querySpecifications.add(Unset_namedElement_name.instance());
  }
  
  public Preserved_namedElement getPreserved_namedElement() {
    return Preserved_namedElement.instance();
  }
  
  public Preserved_namedElement.Matcher getPreserved_namedElement(final ViatraQueryEngine engine) {
    return Preserved_namedElement.Matcher.on(engine);
  }
  
  public Created_namedElement getCreated_namedElement() {
    return Created_namedElement.instance();
  }
  
  public Created_namedElement.Matcher getCreated_namedElement(final ViatraQueryEngine engine) {
    return Created_namedElement.Matcher.on(engine);
  }
  
  public Deleted_namedElement getDeleted_namedElement() {
    return Deleted_namedElement.instance();
  }
  
  public Deleted_namedElement.Matcher getDeleted_namedElement(final ViatraQueryEngine engine) {
    return Deleted_namedElement.Matcher.on(engine);
  }
  
  public Set_namedElement_name getSet_namedElement_name() {
    return Set_namedElement_name.instance();
  }
  
  public Set_namedElement_name.Matcher getSet_namedElement_name(final ViatraQueryEngine engine) {
    return Set_namedElement_name.Matcher.on(engine);
  }
  
  public Unset_namedElement_name getUnset_namedElement_name() {
    return Unset_namedElement_name.instance();
  }
  
  public Unset_namedElement_name.Matcher getUnset_namedElement_name(final ViatraQueryEngine engine) {
    return Unset_namedElement_name.Matcher.on(engine);
  }
}
