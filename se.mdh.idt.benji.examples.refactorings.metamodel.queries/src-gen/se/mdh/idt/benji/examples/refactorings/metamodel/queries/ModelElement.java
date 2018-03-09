/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ModelElement.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.ModelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_modelElement_name;

/**
 * A pattern group formed of all public patterns defined in ModelElement.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ModelElement.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_modelElement</li>
 * <li>created_modelElement</li>
 * <li>deleted_modelElement</li>
 * <li>modelElement_name</li>
 * <li>preserved_modelElement_name</li>
 * <li>changed_modelElement_name</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class ModelElement extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ModelElement instance() {
    if (INSTANCE == null) {
        INSTANCE = new ModelElement();
    }
    return INSTANCE;
  }
  
  private static ModelElement INSTANCE;
  
  private ModelElement() {
    querySpecifications.add(Preserved_modelElement.instance());
    querySpecifications.add(Created_modelElement.instance());
    querySpecifications.add(Deleted_modelElement.instance());
    querySpecifications.add(ModelElement_name.instance());
    querySpecifications.add(Preserved_modelElement_name.instance());
    querySpecifications.add(Changed_modelElement_name.instance());
  }
  
  public Preserved_modelElement getPreserved_modelElement() {
    return Preserved_modelElement.instance();
  }
  
  public Preserved_modelElement.Matcher getPreserved_modelElement(final ViatraQueryEngine engine) {
    return Preserved_modelElement.Matcher.on(engine);
  }
  
  public Created_modelElement getCreated_modelElement() {
    return Created_modelElement.instance();
  }
  
  public Created_modelElement.Matcher getCreated_modelElement(final ViatraQueryEngine engine) {
    return Created_modelElement.Matcher.on(engine);
  }
  
  public Deleted_modelElement getDeleted_modelElement() {
    return Deleted_modelElement.instance();
  }
  
  public Deleted_modelElement.Matcher getDeleted_modelElement(final ViatraQueryEngine engine) {
    return Deleted_modelElement.Matcher.on(engine);
  }
  
  public ModelElement_name getModelElement_name() {
    return ModelElement_name.instance();
  }
  
  public ModelElement_name.Matcher getModelElement_name(final ViatraQueryEngine engine) {
    return ModelElement_name.Matcher.on(engine);
  }
  
  public Preserved_modelElement_name getPreserved_modelElement_name() {
    return Preserved_modelElement_name.instance();
  }
  
  public Preserved_modelElement_name.Matcher getPreserved_modelElement_name(final ViatraQueryEngine engine) {
    return Preserved_modelElement_name.Matcher.on(engine);
  }
  
  public Changed_modelElement_name getChanged_modelElement_name() {
    return Changed_modelElement_name.instance();
  }
  
  public Changed_modelElement_name.Matcher getChanged_modelElement_name(final ViatraQueryEngine engine) {
    return Changed_modelElement_name.Matcher.on(engine);
  }
}
