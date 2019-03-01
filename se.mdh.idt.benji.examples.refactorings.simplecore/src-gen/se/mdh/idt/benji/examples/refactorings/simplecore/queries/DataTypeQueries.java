/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/DataTypeQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Created_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_datatype_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_datatype_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_datatype_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_datatype_name;

/**
 * A pattern group formed of all public patterns defined in DataTypeQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file DataTypeQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.simplecore.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_datatype</li>
 * <li>current_datatype</li>
 * <li>preserved_datatype</li>
 * <li>created_datatype</li>
 * <li>deleted_datatype</li>
 * <li>initial_datatype_name</li>
 * <li>current_datatype_name</li>
 * <li>set_datatype_name</li>
 * <li>unset_datatype_name</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class DataTypeQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DataTypeQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new DataTypeQueries();
    }
    return INSTANCE;
  }
  
  private static DataTypeQueries INSTANCE;
  
  private DataTypeQueries() {
    querySpecifications.add(Initial_datatype.instance());
    querySpecifications.add(Current_datatype.instance());
    querySpecifications.add(Preserved_datatype.instance());
    querySpecifications.add(Created_datatype.instance());
    querySpecifications.add(Deleted_datatype.instance());
    querySpecifications.add(Initial_datatype_name.instance());
    querySpecifications.add(Current_datatype_name.instance());
    querySpecifications.add(Set_datatype_name.instance());
    querySpecifications.add(Unset_datatype_name.instance());
  }
  
  public Initial_datatype getInitial_datatype() {
    return Initial_datatype.instance();
  }
  
  public Initial_datatype.Matcher getInitial_datatype(final ViatraQueryEngine engine) {
    return Initial_datatype.Matcher.on(engine);
  }
  
  public Current_datatype getCurrent_datatype() {
    return Current_datatype.instance();
  }
  
  public Current_datatype.Matcher getCurrent_datatype(final ViatraQueryEngine engine) {
    return Current_datatype.Matcher.on(engine);
  }
  
  public Preserved_datatype getPreserved_datatype() {
    return Preserved_datatype.instance();
  }
  
  public Preserved_datatype.Matcher getPreserved_datatype(final ViatraQueryEngine engine) {
    return Preserved_datatype.Matcher.on(engine);
  }
  
  public Created_datatype getCreated_datatype() {
    return Created_datatype.instance();
  }
  
  public Created_datatype.Matcher getCreated_datatype(final ViatraQueryEngine engine) {
    return Created_datatype.Matcher.on(engine);
  }
  
  public Deleted_datatype getDeleted_datatype() {
    return Deleted_datatype.instance();
  }
  
  public Deleted_datatype.Matcher getDeleted_datatype(final ViatraQueryEngine engine) {
    return Deleted_datatype.Matcher.on(engine);
  }
  
  public Initial_datatype_name getInitial_datatype_name() {
    return Initial_datatype_name.instance();
  }
  
  public Initial_datatype_name.Matcher getInitial_datatype_name(final ViatraQueryEngine engine) {
    return Initial_datatype_name.Matcher.on(engine);
  }
  
  public Current_datatype_name getCurrent_datatype_name() {
    return Current_datatype_name.instance();
  }
  
  public Current_datatype_name.Matcher getCurrent_datatype_name(final ViatraQueryEngine engine) {
    return Current_datatype_name.Matcher.on(engine);
  }
  
  public Set_datatype_name getSet_datatype_name() {
    return Set_datatype_name.instance();
  }
  
  public Set_datatype_name.Matcher getSet_datatype_name(final ViatraQueryEngine engine) {
    return Set_datatype_name.Matcher.on(engine);
  }
  
  public Unset_datatype_name getUnset_datatype_name() {
    return Unset_datatype_name.instance();
  }
  
  public Unset_datatype_name.Matcher getUnset_datatype_name(final ViatraQueryEngine engine) {
    return Unset_datatype_name.Matcher.on(engine);
  }
}
