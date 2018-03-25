/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ModelElementQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_modelElement_name;

/**
 * A pattern group formed of all public patterns defined in ModelElementQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ModelElementQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_modelElement</li>
 * <li>create_modelElement</li>
 * <li>deleted_modelElement</li>
 * <li>initial_modelElement</li>
 * <li>current_modelElement</li>
 * <li>get_modelElement_name</li>
 * <li>set_modelElement_name</li>
 * <li>unset_modelElement_name</li>
 * <li>initial_modelElement_name</li>
 * <li>current_modelElement_name</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class ModelElementQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ModelElementQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new ModelElementQueries();
    }
    return INSTANCE;
  }
  
  private static ModelElementQueries INSTANCE;
  
  private ModelElementQueries() {
    querySpecifications.add(Get_modelElement.instance());
    querySpecifications.add(Create_modelElement.instance());
    querySpecifications.add(Deleted_modelElement.instance());
    querySpecifications.add(Initial_modelElement.instance());
    querySpecifications.add(Current_modelElement.instance());
    querySpecifications.add(Get_modelElement_name.instance());
    querySpecifications.add(Set_modelElement_name.instance());
    querySpecifications.add(Unset_modelElement_name.instance());
    querySpecifications.add(Initial_modelElement_name.instance());
    querySpecifications.add(Current_modelElement_name.instance());
  }
  
  public Get_modelElement getGet_modelElement() {
    return Get_modelElement.instance();
  }
  
  public Get_modelElement.Matcher getGet_modelElement(final ViatraQueryEngine engine) {
    return Get_modelElement.Matcher.on(engine);
  }
  
  public Create_modelElement getCreate_modelElement() {
    return Create_modelElement.instance();
  }
  
  public Create_modelElement.Matcher getCreate_modelElement(final ViatraQueryEngine engine) {
    return Create_modelElement.Matcher.on(engine);
  }
  
  public Deleted_modelElement getDeleted_modelElement() {
    return Deleted_modelElement.instance();
  }
  
  public Deleted_modelElement.Matcher getDeleted_modelElement(final ViatraQueryEngine engine) {
    return Deleted_modelElement.Matcher.on(engine);
  }
  
  public Initial_modelElement getInitial_modelElement() {
    return Initial_modelElement.instance();
  }
  
  public Initial_modelElement.Matcher getInitial_modelElement(final ViatraQueryEngine engine) {
    return Initial_modelElement.Matcher.on(engine);
  }
  
  public Current_modelElement getCurrent_modelElement() {
    return Current_modelElement.instance();
  }
  
  public Current_modelElement.Matcher getCurrent_modelElement(final ViatraQueryEngine engine) {
    return Current_modelElement.Matcher.on(engine);
  }
  
  public Get_modelElement_name getGet_modelElement_name() {
    return Get_modelElement_name.instance();
  }
  
  public Get_modelElement_name.Matcher getGet_modelElement_name(final ViatraQueryEngine engine) {
    return Get_modelElement_name.Matcher.on(engine);
  }
  
  public Set_modelElement_name getSet_modelElement_name() {
    return Set_modelElement_name.instance();
  }
  
  public Set_modelElement_name.Matcher getSet_modelElement_name(final ViatraQueryEngine engine) {
    return Set_modelElement_name.Matcher.on(engine);
  }
  
  public Unset_modelElement_name getUnset_modelElement_name() {
    return Unset_modelElement_name.instance();
  }
  
  public Unset_modelElement_name.Matcher getUnset_modelElement_name(final ViatraQueryEngine engine) {
    return Unset_modelElement_name.Matcher.on(engine);
  }
  
  public Initial_modelElement_name getInitial_modelElement_name() {
    return Initial_modelElement_name.instance();
  }
  
  public Initial_modelElement_name.Matcher getInitial_modelElement_name(final ViatraQueryEngine engine) {
    return Initial_modelElement_name.Matcher.on(engine);
  }
  
  public Current_modelElement_name getCurrent_modelElement_name() {
    return Current_modelElement_name.instance();
  }
  
  public Current_modelElement_name.Matcher getCurrent_modelElement_name(final ViatraQueryEngine engine) {
    return Current_modelElement_name.Matcher.on(engine);
  }
}
