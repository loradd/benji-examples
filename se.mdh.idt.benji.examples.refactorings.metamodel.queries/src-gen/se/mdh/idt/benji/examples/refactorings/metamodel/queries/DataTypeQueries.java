/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/DataTypeQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_datatype_package;

/**
 * A pattern group formed of all public patterns defined in DataTypeQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file DataTypeQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_datatype</li>
 * <li>create_datatype</li>
 * <li>delete_datatype</li>
 * <li>initial_datatype</li>
 * <li>current_datatype</li>
 * <li>get_datatype_name</li>
 * <li>set_datatype_name</li>
 * <li>unset_datatype_name</li>
 * <li>initial_datatype_name</li>
 * <li>current_datatype_name</li>
 * <li>get_datatype_package</li>
 * <li>set_datatype_package</li>
 * <li>unset_datatype_package</li>
 * <li>initial_datatype_package</li>
 * <li>current_datatype_package</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:23+0200")
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
    querySpecifications.add(Get_datatype.instance());
    querySpecifications.add(Create_datatype.instance());
    querySpecifications.add(Delete_datatype.instance());
    querySpecifications.add(Initial_datatype.instance());
    querySpecifications.add(Current_datatype.instance());
    querySpecifications.add(Get_datatype_name.instance());
    querySpecifications.add(Set_datatype_name.instance());
    querySpecifications.add(Unset_datatype_name.instance());
    querySpecifications.add(Initial_datatype_name.instance());
    querySpecifications.add(Current_datatype_name.instance());
    querySpecifications.add(Get_datatype_package.instance());
    querySpecifications.add(Set_datatype_package.instance());
    querySpecifications.add(Unset_datatype_package.instance());
    querySpecifications.add(Initial_datatype_package.instance());
    querySpecifications.add(Current_datatype_package.instance());
  }
  
  public Get_datatype getGet_datatype() {
    return Get_datatype.instance();
  }
  
  public Get_datatype.Matcher getGet_datatype(final ViatraQueryEngine engine) {
    return Get_datatype.Matcher.on(engine);
  }
  
  public Create_datatype getCreate_datatype() {
    return Create_datatype.instance();
  }
  
  public Create_datatype.Matcher getCreate_datatype(final ViatraQueryEngine engine) {
    return Create_datatype.Matcher.on(engine);
  }
  
  public Delete_datatype getDelete_datatype() {
    return Delete_datatype.instance();
  }
  
  public Delete_datatype.Matcher getDelete_datatype(final ViatraQueryEngine engine) {
    return Delete_datatype.Matcher.on(engine);
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
  
  public Get_datatype_name getGet_datatype_name() {
    return Get_datatype_name.instance();
  }
  
  public Get_datatype_name.Matcher getGet_datatype_name(final ViatraQueryEngine engine) {
    return Get_datatype_name.Matcher.on(engine);
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
  
  public Get_datatype_package getGet_datatype_package() {
    return Get_datatype_package.instance();
  }
  
  public Get_datatype_package.Matcher getGet_datatype_package(final ViatraQueryEngine engine) {
    return Get_datatype_package.Matcher.on(engine);
  }
  
  public Set_datatype_package getSet_datatype_package() {
    return Set_datatype_package.instance();
  }
  
  public Set_datatype_package.Matcher getSet_datatype_package(final ViatraQueryEngine engine) {
    return Set_datatype_package.Matcher.on(engine);
  }
  
  public Unset_datatype_package getUnset_datatype_package() {
    return Unset_datatype_package.instance();
  }
  
  public Unset_datatype_package.Matcher getUnset_datatype_package(final ViatraQueryEngine engine) {
    return Unset_datatype_package.Matcher.on(engine);
  }
  
  public Initial_datatype_package getInitial_datatype_package() {
    return Initial_datatype_package.instance();
  }
  
  public Initial_datatype_package.Matcher getInitial_datatype_package(final ViatraQueryEngine engine) {
    return Initial_datatype_package.Matcher.on(engine);
  }
  
  public Current_datatype_package getCurrent_datatype_package() {
    return Current_datatype_package.instance();
  }
  
  public Current_datatype_package.Matcher getCurrent_datatype_package(final ViatraQueryEngine engine) {
    return Current_datatype_package.Matcher.on(engine);
  }
}
