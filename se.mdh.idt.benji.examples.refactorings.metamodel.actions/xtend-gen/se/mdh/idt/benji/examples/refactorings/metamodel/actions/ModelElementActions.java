package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import org.eclipse.emf.ecore.util.EcoreUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.ModelElement;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class ModelElementActions {
  public static void delete_modelElement(final ModelElement modelElement) {
    EcoreUtil.delete(modelElement, true);
  }
  
  public static void delete_modelElement(final TraceLink modelElement) {
    ModelElementActions.delete_modelElement(modelElement.<ModelElement>target());
  }
  
  public static String get_modelElement_name(final ModelElement modelElement) {
    return modelElement.getName();
  }
  
  public static String get_modelElement_name(final TraceLink modelElement) {
    return ModelElementActions.get_modelElement_name(modelElement.<ModelElement>target());
  }
  
  public static void set_modelElement_name(final ModelElement modelElement, final String name) {
    modelElement.setName(name);
  }
  
  public static void set_modelElement_name(final TraceLink modelElement, final String name) {
    ModelElementActions.set_modelElement_name(modelElement.<ModelElement>target(), name);
  }
}
