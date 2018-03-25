/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/EnumerationQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_enumeration_package;

/**
 * A pattern group formed of all public patterns defined in EnumerationQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file EnumerationQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_enumeration</li>
 * <li>create_enumeration</li>
 * <li>delete_enumeration</li>
 * <li>initial_enumeration</li>
 * <li>current_enumeration</li>
 * <li>get_enumeration_name</li>
 * <li>set_enumeration_name</li>
 * <li>unset_enumeration_name</li>
 * <li>initial_enumeration_name</li>
 * <li>current_enumeration_name</li>
 * <li>get_enumeration_package</li>
 * <li>set_enumeration_package</li>
 * <li>unset_enumeration_package</li>
 * <li>initial_enumeration_package</li>
 * <li>current_enumeration_package</li>
 * <li>get_enumeration_enumerationLiteral</li>
 * <li>insert_enumeration_enumerationLiteral</li>
 * <li>remove_enumeration_enumerationLiteral</li>
 * <li>initial_enumeration_enumerationLiteral</li>
 * <li>current_enumeration_enumerationLiteral</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class EnumerationQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static EnumerationQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new EnumerationQueries();
    }
    return INSTANCE;
  }
  
  private static EnumerationQueries INSTANCE;
  
  private EnumerationQueries() {
    querySpecifications.add(Get_enumeration.instance());
    querySpecifications.add(Create_enumeration.instance());
    querySpecifications.add(Delete_enumeration.instance());
    querySpecifications.add(Initial_enumeration.instance());
    querySpecifications.add(Current_enumeration.instance());
    querySpecifications.add(Get_enumeration_name.instance());
    querySpecifications.add(Set_enumeration_name.instance());
    querySpecifications.add(Unset_enumeration_name.instance());
    querySpecifications.add(Initial_enumeration_name.instance());
    querySpecifications.add(Current_enumeration_name.instance());
    querySpecifications.add(Get_enumeration_package.instance());
    querySpecifications.add(Set_enumeration_package.instance());
    querySpecifications.add(Unset_enumeration_package.instance());
    querySpecifications.add(Initial_enumeration_package.instance());
    querySpecifications.add(Current_enumeration_package.instance());
    querySpecifications.add(Get_enumeration_enumerationLiteral.instance());
    querySpecifications.add(Insert_enumeration_enumerationLiteral.instance());
    querySpecifications.add(Remove_enumeration_enumerationLiteral.instance());
    querySpecifications.add(Initial_enumeration_enumerationLiteral.instance());
    querySpecifications.add(Current_enumeration_enumerationLiteral.instance());
  }
  
  public Get_enumeration getGet_enumeration() {
    return Get_enumeration.instance();
  }
  
  public Get_enumeration.Matcher getGet_enumeration(final ViatraQueryEngine engine) {
    return Get_enumeration.Matcher.on(engine);
  }
  
  public Create_enumeration getCreate_enumeration() {
    return Create_enumeration.instance();
  }
  
  public Create_enumeration.Matcher getCreate_enumeration(final ViatraQueryEngine engine) {
    return Create_enumeration.Matcher.on(engine);
  }
  
  public Delete_enumeration getDelete_enumeration() {
    return Delete_enumeration.instance();
  }
  
  public Delete_enumeration.Matcher getDelete_enumeration(final ViatraQueryEngine engine) {
    return Delete_enumeration.Matcher.on(engine);
  }
  
  public Initial_enumeration getInitial_enumeration() {
    return Initial_enumeration.instance();
  }
  
  public Initial_enumeration.Matcher getInitial_enumeration(final ViatraQueryEngine engine) {
    return Initial_enumeration.Matcher.on(engine);
  }
  
  public Current_enumeration getCurrent_enumeration() {
    return Current_enumeration.instance();
  }
  
  public Current_enumeration.Matcher getCurrent_enumeration(final ViatraQueryEngine engine) {
    return Current_enumeration.Matcher.on(engine);
  }
  
  public Get_enumeration_name getGet_enumeration_name() {
    return Get_enumeration_name.instance();
  }
  
  public Get_enumeration_name.Matcher getGet_enumeration_name(final ViatraQueryEngine engine) {
    return Get_enumeration_name.Matcher.on(engine);
  }
  
  public Set_enumeration_name getSet_enumeration_name() {
    return Set_enumeration_name.instance();
  }
  
  public Set_enumeration_name.Matcher getSet_enumeration_name(final ViatraQueryEngine engine) {
    return Set_enumeration_name.Matcher.on(engine);
  }
  
  public Unset_enumeration_name getUnset_enumeration_name() {
    return Unset_enumeration_name.instance();
  }
  
  public Unset_enumeration_name.Matcher getUnset_enumeration_name(final ViatraQueryEngine engine) {
    return Unset_enumeration_name.Matcher.on(engine);
  }
  
  public Initial_enumeration_name getInitial_enumeration_name() {
    return Initial_enumeration_name.instance();
  }
  
  public Initial_enumeration_name.Matcher getInitial_enumeration_name(final ViatraQueryEngine engine) {
    return Initial_enumeration_name.Matcher.on(engine);
  }
  
  public Current_enumeration_name getCurrent_enumeration_name() {
    return Current_enumeration_name.instance();
  }
  
  public Current_enumeration_name.Matcher getCurrent_enumeration_name(final ViatraQueryEngine engine) {
    return Current_enumeration_name.Matcher.on(engine);
  }
  
  public Get_enumeration_package getGet_enumeration_package() {
    return Get_enumeration_package.instance();
  }
  
  public Get_enumeration_package.Matcher getGet_enumeration_package(final ViatraQueryEngine engine) {
    return Get_enumeration_package.Matcher.on(engine);
  }
  
  public Set_enumeration_package getSet_enumeration_package() {
    return Set_enumeration_package.instance();
  }
  
  public Set_enumeration_package.Matcher getSet_enumeration_package(final ViatraQueryEngine engine) {
    return Set_enumeration_package.Matcher.on(engine);
  }
  
  public Unset_enumeration_package getUnset_enumeration_package() {
    return Unset_enumeration_package.instance();
  }
  
  public Unset_enumeration_package.Matcher getUnset_enumeration_package(final ViatraQueryEngine engine) {
    return Unset_enumeration_package.Matcher.on(engine);
  }
  
  public Initial_enumeration_package getInitial_enumeration_package() {
    return Initial_enumeration_package.instance();
  }
  
  public Initial_enumeration_package.Matcher getInitial_enumeration_package(final ViatraQueryEngine engine) {
    return Initial_enumeration_package.Matcher.on(engine);
  }
  
  public Current_enumeration_package getCurrent_enumeration_package() {
    return Current_enumeration_package.instance();
  }
  
  public Current_enumeration_package.Matcher getCurrent_enumeration_package(final ViatraQueryEngine engine) {
    return Current_enumeration_package.Matcher.on(engine);
  }
  
  public Get_enumeration_enumerationLiteral getGet_enumeration_enumerationLiteral() {
    return Get_enumeration_enumerationLiteral.instance();
  }
  
  public Get_enumeration_enumerationLiteral.Matcher getGet_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return Get_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public Insert_enumeration_enumerationLiteral getInsert_enumeration_enumerationLiteral() {
    return Insert_enumeration_enumerationLiteral.instance();
  }
  
  public Insert_enumeration_enumerationLiteral.Matcher getInsert_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return Insert_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public Remove_enumeration_enumerationLiteral getRemove_enumeration_enumerationLiteral() {
    return Remove_enumeration_enumerationLiteral.instance();
  }
  
  public Remove_enumeration_enumerationLiteral.Matcher getRemove_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return Remove_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public Initial_enumeration_enumerationLiteral getInitial_enumeration_enumerationLiteral() {
    return Initial_enumeration_enumerationLiteral.instance();
  }
  
  public Initial_enumeration_enumerationLiteral.Matcher getInitial_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return Initial_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public Current_enumeration_enumerationLiteral getCurrent_enumeration_enumerationLiteral() {
    return Current_enumeration_enumerationLiteral.instance();
  }
  
  public Current_enumeration_enumerationLiteral.Matcher getCurrent_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return Current_enumeration_enumerationLiteral.Matcher.on(engine);
  }
}
