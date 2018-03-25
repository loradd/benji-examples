package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ModelElementActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class EnumerationLiteralActions {
  public static EnumerationLiteral create_enumerationLiteral() {
    return MetamodelFactory.eINSTANCE.createEnumerationLiteral();
  }
  
  public static void delete_enumerationLiteral(final EnumerationLiteral enumerationLiteral) {
    ModelElementActions.delete_modelElement(enumerationLiteral);
  }
  
  public static void delete_enumerationLiteral(final TraceLink enumerationLiteral) {
    EnumerationLiteralActions.delete_enumerationLiteral(enumerationLiteral.<EnumerationLiteral>target());
  }
  
  public static String get_enumerationLiteral_name(final EnumerationLiteral enumerationLiteral) {
    return ModelElementActions.get_modelElement_name(enumerationLiteral);
  }
  
  public static String get_enumerationLiteral_name(final TraceLink enumerationLiteral) {
    return EnumerationLiteralActions.get_enumerationLiteral_name(enumerationLiteral.<EnumerationLiteral>target());
  }
  
  public static void set_enumerationLiteral_name(final EnumerationLiteral enumerationLiteral, final String name) {
    ModelElementActions.set_modelElement_name(enumerationLiteral, name);
  }
  
  public static void set_enumerationLiteral_name(final TraceLink enumerationLiteral, final String name) {
    EnumerationLiteralActions.set_enumerationLiteral_name(enumerationLiteral.<EnumerationLiteral>target(), name);
  }
  
  public static Enumeration get_enumerationLiteral_enumeration(final EnumerationLiteral enumerationLiteral) {
    return enumerationLiteral.getEnumeration();
  }
  
  public static Enumeration get_enumerationLiteral_enumeration(final TraceLink enumerationLiteral) {
    return EnumerationLiteralActions.get_enumerationLiteral_enumeration(enumerationLiteral.<EnumerationLiteral>target());
  }
  
  public static void set_enumerationLiteral_enumeration(final EnumerationLiteral enumerationLiteral, final Enumeration enumeration) {
    enumerationLiteral.setEnumeration(enumeration);
  }
  
  public static void set_enumerationLiteral_enumeration(final EnumerationLiteral enumerationLiteral, final TraceLink enumeration) {
    EnumerationLiteralActions.set_enumerationLiteral_enumeration(enumerationLiteral, enumeration.<Enumeration>target());
  }
  
  public static void set_enumerationLiteral_enumeration(final TraceLink enumerationLiteral, final Enumeration enumeration) {
    EnumerationLiteralActions.set_enumerationLiteral_enumeration(enumerationLiteral.<EnumerationLiteral>target(), enumeration);
  }
  
  public static void set_enumerationLiteral_enumeration(final TraceLink enumerationLiteral, final TraceLink enumeration) {
    EnumerationLiteralActions.set_enumerationLiteral_enumeration(enumerationLiteral.<EnumerationLiteral>target(), enumeration.<Enumeration>target());
  }
}
