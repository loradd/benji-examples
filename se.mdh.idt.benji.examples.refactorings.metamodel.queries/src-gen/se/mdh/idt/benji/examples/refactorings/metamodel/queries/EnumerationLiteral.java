/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/EnumerationLiteral.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_enumerationLiteral_name;

/**
 * A pattern group formed of all public patterns defined in EnumerationLiteral.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file EnumerationLiteral.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_enumerationLiteral</li>
 * <li>create_enumerationLiteral</li>
 * <li>delete_enumerationLiteral</li>
 * <li>initial_enumerationLiteral</li>
 * <li>current_enumerationLiteral</li>
 * <li>get_enumerationLiteral_name</li>
 * <li>set_enumerationLiteral_name</li>
 * <li>unset_enumerationLiteral_name</li>
 * <li>initial_enumerationLiteral_name</li>
 * <li>current_enumerationLiteral_name</li>
 * <li>get_enumerationLiteral_enumeration</li>
 * <li>set_enumerationLiteral_enumeration</li>
 * <li>unset_enumerationLiteral_enumeration</li>
 * <li>initial_enumerationLiteral_enumeration</li>
 * <li>current_enumerationLiteral_enumeration</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class EnumerationLiteral extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static EnumerationLiteral instance() {
    if (INSTANCE == null) {
        INSTANCE = new EnumerationLiteral();
    }
    return INSTANCE;
  }
  
  private static EnumerationLiteral INSTANCE;
  
  private EnumerationLiteral() {
    querySpecifications.add(Get_enumerationLiteral.instance());
    querySpecifications.add(Create_enumerationLiteral.instance());
    querySpecifications.add(Delete_enumerationLiteral.instance());
    querySpecifications.add(Initial_enumerationLiteral.instance());
    querySpecifications.add(Current_enumerationLiteral.instance());
    querySpecifications.add(Get_enumerationLiteral_name.instance());
    querySpecifications.add(Set_enumerationLiteral_name.instance());
    querySpecifications.add(Unset_enumerationLiteral_name.instance());
    querySpecifications.add(Initial_enumerationLiteral_name.instance());
    querySpecifications.add(Current_enumerationLiteral_name.instance());
    querySpecifications.add(Get_enumerationLiteral_enumeration.instance());
    querySpecifications.add(Set_enumerationLiteral_enumeration.instance());
    querySpecifications.add(Unset_enumerationLiteral_enumeration.instance());
    querySpecifications.add(Initial_enumerationLiteral_enumeration.instance());
    querySpecifications.add(Current_enumerationLiteral_enumeration.instance());
  }
  
  public Get_enumerationLiteral getGet_enumerationLiteral() {
    return Get_enumerationLiteral.instance();
  }
  
  public Get_enumerationLiteral.Matcher getGet_enumerationLiteral(final ViatraQueryEngine engine) {
    return Get_enumerationLiteral.Matcher.on(engine);
  }
  
  public Create_enumerationLiteral getCreate_enumerationLiteral() {
    return Create_enumerationLiteral.instance();
  }
  
  public Create_enumerationLiteral.Matcher getCreate_enumerationLiteral(final ViatraQueryEngine engine) {
    return Create_enumerationLiteral.Matcher.on(engine);
  }
  
  public Delete_enumerationLiteral getDelete_enumerationLiteral() {
    return Delete_enumerationLiteral.instance();
  }
  
  public Delete_enumerationLiteral.Matcher getDelete_enumerationLiteral(final ViatraQueryEngine engine) {
    return Delete_enumerationLiteral.Matcher.on(engine);
  }
  
  public Initial_enumerationLiteral getInitial_enumerationLiteral() {
    return Initial_enumerationLiteral.instance();
  }
  
  public Initial_enumerationLiteral.Matcher getInitial_enumerationLiteral(final ViatraQueryEngine engine) {
    return Initial_enumerationLiteral.Matcher.on(engine);
  }
  
  public Current_enumerationLiteral getCurrent_enumerationLiteral() {
    return Current_enumerationLiteral.instance();
  }
  
  public Current_enumerationLiteral.Matcher getCurrent_enumerationLiteral(final ViatraQueryEngine engine) {
    return Current_enumerationLiteral.Matcher.on(engine);
  }
  
  public Get_enumerationLiteral_name getGet_enumerationLiteral_name() {
    return Get_enumerationLiteral_name.instance();
  }
  
  public Get_enumerationLiteral_name.Matcher getGet_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return Get_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public Set_enumerationLiteral_name getSet_enumerationLiteral_name() {
    return Set_enumerationLiteral_name.instance();
  }
  
  public Set_enumerationLiteral_name.Matcher getSet_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return Set_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public Unset_enumerationLiteral_name getUnset_enumerationLiteral_name() {
    return Unset_enumerationLiteral_name.instance();
  }
  
  public Unset_enumerationLiteral_name.Matcher getUnset_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return Unset_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public Initial_enumerationLiteral_name getInitial_enumerationLiteral_name() {
    return Initial_enumerationLiteral_name.instance();
  }
  
  public Initial_enumerationLiteral_name.Matcher getInitial_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return Initial_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public Current_enumerationLiteral_name getCurrent_enumerationLiteral_name() {
    return Current_enumerationLiteral_name.instance();
  }
  
  public Current_enumerationLiteral_name.Matcher getCurrent_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return Current_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public Get_enumerationLiteral_enumeration getGet_enumerationLiteral_enumeration() {
    return Get_enumerationLiteral_enumeration.instance();
  }
  
  public Get_enumerationLiteral_enumeration.Matcher getGet_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return Get_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public Set_enumerationLiteral_enumeration getSet_enumerationLiteral_enumeration() {
    return Set_enumerationLiteral_enumeration.instance();
  }
  
  public Set_enumerationLiteral_enumeration.Matcher getSet_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return Set_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public Unset_enumerationLiteral_enumeration getUnset_enumerationLiteral_enumeration() {
    return Unset_enumerationLiteral_enumeration.instance();
  }
  
  public Unset_enumerationLiteral_enumeration.Matcher getUnset_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return Unset_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public Initial_enumerationLiteral_enumeration getInitial_enumerationLiteral_enumeration() {
    return Initial_enumerationLiteral_enumeration.instance();
  }
  
  public Initial_enumerationLiteral_enumeration.Matcher getInitial_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return Initial_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public Current_enumerationLiteral_enumeration getCurrent_enumerationLiteral_enumeration() {
    return Current_enumerationLiteral_enumeration.instance();
  }
  
  public Current_enumerationLiteral_enumeration.Matcher getCurrent_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return Current_enumerationLiteral_enumeration.Matcher.on(engine);
  }
}
