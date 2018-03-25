package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.StructuralFeatureActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class AttributeActions {
  public static Attribute create_attribute() {
    return MetamodelFactory.eINSTANCE.createAttribute();
  }
  
  public static void delete_attribute(final Attribute attribute) {
    StructuralFeatureActions.delete_structuralFeature(attribute);
  }
  
  public static void delete_attribute(final TraceLink attribute) {
    AttributeActions.delete_attribute(attribute.<Attribute>target());
  }
  
  public static String get_attribute_name(final Attribute attribute) {
    return StructuralFeatureActions.get_structuralFeature_name(attribute);
  }
  
  public static String get_attribute_name(final TraceLink attribute) {
    return AttributeActions.get_attribute_name(attribute.<Attribute>target());
  }
  
  public static void set_attribute_name(final Attribute attribute, final String name) {
    StructuralFeatureActions.set_structuralFeature_name(attribute, name);
  }
  
  public static void set_attribute_name(final TraceLink attribute, final String name) {
    AttributeActions.set_attribute_name(attribute.<Attribute>target(), name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_attribute_owner(final Attribute attribute) {
    return StructuralFeatureActions.get_structuralFeature_owner(attribute);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_attribute_owner(final TraceLink attribute) {
    return AttributeActions.get_attribute_owner(attribute.<Attribute>target());
  }
  
  public static void set_attribute_owner(final Attribute attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class owner) {
    StructuralFeatureActions.set_structuralFeature_owner(attribute, owner);
  }
  
  public static void set_attribute_owner(final Attribute attribute, final TraceLink owner) {
    AttributeActions.set_attribute_owner(attribute, owner.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_attribute_owner(final TraceLink attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class owner) {
    AttributeActions.set_attribute_owner(attribute.<Attribute>target(), owner);
  }
  
  public static void set_attribute_owner(final TraceLink attribute, final TraceLink owner) {
    AttributeActions.set_attribute_owner(attribute.<Attribute>target(), owner.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static Integer get_attribute_lower(final Attribute attribute) {
    return StructuralFeatureActions.get_structuralFeature_lower(attribute);
  }
  
  public static Integer get_attribute_lower(final TraceLink attribute) {
    return AttributeActions.get_attribute_lower(attribute.<Attribute>target());
  }
  
  public static void set_attribute_lower(final Attribute attribute, final Integer lower) {
    StructuralFeatureActions.set_structuralFeature_lower(attribute, lower);
  }
  
  public static void set_attribute_lower(final TraceLink attribute, final Integer lower) {
    AttributeActions.set_attribute_lower(attribute.<Attribute>target(), lower);
  }
  
  public static Integer get_attribute_upper(final Attribute attribute) {
    return StructuralFeatureActions.get_structuralFeature_upper(attribute);
  }
  
  public static Integer get_attribute_upper(final TraceLink attribute) {
    return AttributeActions.get_attribute_upper(attribute.<Attribute>target());
  }
  
  public static void set_attribute_upper(final Attribute attribute, final Integer upper) {
    StructuralFeatureActions.set_structuralFeature_upper(attribute, upper);
  }
  
  public static void set_attribute_upper(final TraceLink attribute, final Integer upper) {
    AttributeActions.set_attribute_upper(attribute.<Attribute>target(), upper);
  }
  
  public static DataType get_attribute_type(final Attribute attribute) {
    return attribute.getType();
  }
  
  public static DataType get_attribute_type(final TraceLink attribute) {
    return AttributeActions.get_attribute_type(attribute.<Attribute>target());
  }
  
  public static void set_attribute_type(final Attribute attribute, final DataType type) {
    attribute.setType(type);
  }
  
  public static void set_attribute_type(final Attribute attribute, final TraceLink type) {
    AttributeActions.set_attribute_type(attribute, type.<DataType>target());
  }
  
  public static void set_attribute_type(final TraceLink attribute, final DataType type) {
    AttributeActions.set_attribute_type(attribute.<Attribute>target(), type);
  }
  
  public static void set_attribute_type(final TraceLink attribute, final TraceLink type) {
    AttributeActions.set_attribute_type(attribute.<Attribute>target(), type.<DataType>target());
  }
}
