package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ModelElementActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class StructuralFeatureActions {
  public static void delete_structuralFeature(final StructuralFeature structuralFeature) {
    ModelElementActions.delete_modelElement(structuralFeature);
  }
  
  public static void delete_structuralFeature(final TraceLink structuralFeature) {
    StructuralFeatureActions.delete_structuralFeature(structuralFeature.<StructuralFeature>target());
  }
  
  public static String get_structuralFeature_name(final StructuralFeature structuralFeature) {
    return ModelElementActions.get_modelElement_name(structuralFeature);
  }
  
  public static String get_structuralFeature_name(final TraceLink structuralFeature) {
    return StructuralFeatureActions.get_structuralFeature_name(structuralFeature.<StructuralFeature>target());
  }
  
  public static void set_structuralFeature_name(final StructuralFeature structuralFeature, final String name) {
    ModelElementActions.set_modelElement_name(structuralFeature, name);
  }
  
  public static void set_structuralFeature_name(final TraceLink structuralFeature, final String name) {
    StructuralFeatureActions.set_structuralFeature_name(structuralFeature.<StructuralFeature>target(), name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_structuralFeature_owner(final StructuralFeature structuralFeature) {
    return structuralFeature.getOwner();
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_structuralFeature_owner(final TraceLink structuralFeature) {
    return StructuralFeatureActions.get_structuralFeature_owner(structuralFeature.<StructuralFeature>target());
  }
  
  public static void set_structuralFeature_owner(final StructuralFeature structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class owner) {
    structuralFeature.setOwner(owner);
  }
  
  public static void set_structuralFeature_owner(final StructuralFeature structuralFeature, final TraceLink owner) {
    StructuralFeatureActions.set_structuralFeature_owner(structuralFeature, owner.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_structuralFeature_owner(final TraceLink structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class owner) {
    StructuralFeatureActions.set_structuralFeature_owner(structuralFeature.<StructuralFeature>target(), owner);
  }
  
  public static void set_structuralFeature_owner(final TraceLink structuralFeature, final TraceLink owner) {
    StructuralFeatureActions.set_structuralFeature_owner(structuralFeature.<StructuralFeature>target(), owner.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static Integer get_structuralFeature_lower(final StructuralFeature structuralFeature) {
    return structuralFeature.getLower();
  }
  
  public static Integer get_structuralFeature_lower(final TraceLink structuralFeature) {
    return StructuralFeatureActions.get_structuralFeature_lower(structuralFeature.<StructuralFeature>target());
  }
  
  public static void set_structuralFeature_lower(final StructuralFeature structuralFeature, final Integer lower) {
    structuralFeature.setLower(lower);
  }
  
  public static void set_structuralFeature_lower(final TraceLink structuralFeature, final Integer lower) {
    StructuralFeatureActions.set_structuralFeature_lower(structuralFeature, lower);
  }
  
  public static Integer get_structuralFeature_upper(final StructuralFeature structuralFeature) {
    return structuralFeature.getUpper();
  }
  
  public static Integer get_structuralFeature_upper(final TraceLink structuralFeature) {
    return StructuralFeatureActions.get_structuralFeature_upper(structuralFeature.<StructuralFeature>target());
  }
  
  public static void set_structuralFeature_upper(final StructuralFeature structuralFeature, final Integer upper) {
    structuralFeature.setUpper(upper);
  }
  
  public static void set_structuralFeature_upper(final TraceLink structuralFeature, final Integer upper) {
    StructuralFeatureActions.set_structuralFeature_upper(structuralFeature.<StructuralFeature>target(), upper);
  }
}
