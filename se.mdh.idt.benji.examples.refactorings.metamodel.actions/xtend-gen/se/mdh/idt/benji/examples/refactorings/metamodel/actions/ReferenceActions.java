package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.StructuralFeatureActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class ReferenceActions {
  public static Reference create_reference() {
    return MetamodelFactory.eINSTANCE.createReference();
  }
  
  public static void delete_reference(final Reference reference) {
    StructuralFeatureActions.delete_structuralFeature(reference);
  }
  
  public static void delete_reference(final TraceLink reference) {
    ReferenceActions.delete_reference(reference.<Reference>target());
  }
  
  public static String get_reference_name(final Reference reference) {
    return StructuralFeatureActions.get_structuralFeature_name(reference);
  }
  
  public static String get_reference_name(final TraceLink reference) {
    return ReferenceActions.get_reference_name(reference.<Reference>target());
  }
  
  public static void set_reference_name(final Reference reference, final String name) {
    StructuralFeatureActions.set_structuralFeature_name(reference, name);
  }
  
  public static void set_reference_name(final TraceLink reference, final String name) {
    ReferenceActions.set_reference_name(reference.<Reference>target(), name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_reference_owner(final Reference reference) {
    return StructuralFeatureActions.get_structuralFeature_owner(reference);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_reference_owner(final TraceLink reference) {
    return ReferenceActions.get_reference_owner(reference.<Reference>target());
  }
  
  public static void set_reference_owner(final Reference reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class owner) {
    StructuralFeatureActions.set_structuralFeature_owner(reference, owner);
  }
  
  public static void set_reference_owner(final Reference reference, final TraceLink owner) {
    ReferenceActions.set_reference_owner(reference, owner.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_reference_owner(final TraceLink reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class owner) {
    ReferenceActions.set_reference_owner(reference.<Reference>target(), owner);
  }
  
  public static void set_reference_owner(final TraceLink reference, final TraceLink owner) {
    ReferenceActions.set_reference_owner(reference.<Reference>target(), owner.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static Integer get_reference_lower(final Reference reference) {
    return StructuralFeatureActions.get_structuralFeature_lower(reference);
  }
  
  public static Integer get_reference_lower(final TraceLink reference) {
    return ReferenceActions.get_reference_lower(reference.<Reference>target());
  }
  
  public static void set_reference_lower(final Reference reference, final Integer lower) {
    StructuralFeatureActions.set_structuralFeature_lower(reference, lower);
  }
  
  public static void set_reference_lower(final TraceLink reference, final Integer lower) {
    ReferenceActions.set_reference_lower(reference.<Reference>target(), lower);
  }
  
  public static Integer get_reference_upper(final Reference reference) {
    return StructuralFeatureActions.get_structuralFeature_upper(reference);
  }
  
  public static Integer get_reference_upper(final TraceLink reference) {
    return ReferenceActions.get_reference_upper(reference.<Reference>target());
  }
  
  public static void set_reference_upper(final Reference reference, final Integer upper) {
    StructuralFeatureActions.set_structuralFeature_upper(reference, upper);
  }
  
  public static void set_reference_upper(final TraceLink reference, final Integer upper) {
    ReferenceActions.set_reference_upper(reference.<Reference>target(), upper);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_reference_type(final Reference reference) {
    return reference.getType();
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_reference_type(final TraceLink reference) {
    return ReferenceActions.get_reference_type(reference.<Reference>target());
  }
  
  public static void set_reference_type(final Reference reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class type) {
    reference.setType(type);
  }
  
  public static void set_reference_type(final Reference reference, final TraceLink type) {
    ReferenceActions.set_reference_type(reference, type.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_reference_type(final TraceLink reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class type) {
    ReferenceActions.set_reference_type(reference.<Reference>target(), type);
  }
  
  public static void set_reference_type(final TraceLink reference, final TraceLink type) {
    ReferenceActions.set_reference_type(reference.<Reference>target(), type.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static Boolean get_reference_containment(final Reference reference) {
    return reference.getContainment();
  }
  
  public static Boolean get_reference_containment(final TraceLink reference) {
    return ReferenceActions.get_reference_containment(reference.<Reference>target());
  }
  
  public static void set_reference_containment(final Reference reference, final Boolean containment) {
    reference.setContainment(containment);
  }
  
  public static void set_reference_containment(final TraceLink reference, final Boolean containment) {
    ReferenceActions.set_reference_containment(reference.<Reference>target(), containment);
  }
  
  public static Reference get_reference_opposite(final Reference reference) {
    return reference.getOpposite();
  }
  
  public static Reference get_reference_opposite(final TraceLink reference) {
    return ReferenceActions.get_reference_opposite(reference.<Reference>target());
  }
  
  public static void set_reference_opposite(final Reference reference, final Reference opposite) {
    reference.setOpposite(opposite);
  }
  
  public static void set_reference_opposite(final Reference reference, final TraceLink opposite) {
    ReferenceActions.set_reference_opposite(reference, opposite.<Reference>target());
  }
  
  public static void set_reference_opposite(final TraceLink reference, final Reference opposite) {
    ReferenceActions.set_reference_opposite(reference.<Reference>target(), opposite);
  }
  
  public static void set_reference_opposite(final TraceLink reference, final TraceLink opposite) {
    ReferenceActions.set_reference_opposite(reference.<Reference>target(), opposite.<Reference>target());
  }
}
