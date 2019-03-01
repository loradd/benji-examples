/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/NamedElementQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries.internal;

import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Created_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_namedElement_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_namedElement_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.internal.Current_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.internal.Current_namedElement_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.internal.Initial_namedElement;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.internal.Initial_namedElement_name;

/**
 * A pattern group formed of all patterns defined in NamedElementQueries.vql.
 * 
 * <p>A private group that includes private patterns as well. Only intended use case is for pattern testing.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.simplecore.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_namedElement</li>
 * <li>current_namedElement</li>
 * <li>preserved_namedElement</li>
 * <li>created_namedElement</li>
 * <li>deleted_namedElement</li>
 * <li>initial_namedElement_name</li>
 * <li>current_namedElement_name</li>
 * <li>set_namedElement_name</li>
 * <li>unset_namedElement_name</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class NamedElementQueriesAll extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static NamedElementQueriesAll instance() {
    if (INSTANCE == null) {
        INSTANCE = new NamedElementQueriesAll();
    }
    return INSTANCE;
  }
  
  private static NamedElementQueriesAll INSTANCE;
  
  private NamedElementQueriesAll() {
    querySpecifications.add(Initial_namedElement.instance());
    querySpecifications.add(Current_namedElement.instance());
    querySpecifications.add(Preserved_namedElement.instance());
    querySpecifications.add(Created_namedElement.instance());
    querySpecifications.add(Deleted_namedElement.instance());
    querySpecifications.add(Initial_namedElement_name.instance());
    querySpecifications.add(Current_namedElement_name.instance());
    querySpecifications.add(Set_namedElement_name.instance());
    querySpecifications.add(Unset_namedElement_name.instance());
  }
}
