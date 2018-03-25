package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute
import se.mdh.idt.benji.examples.refactorings.metamodel.Class
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.StructuralFeatureActions.*

class AttributeActions {
	
	// attribute - create 
	def static Attribute create_attribute () {
		MetamodelFactory.eINSTANCE.createAttribute	
	}
	
	// attribute - delete (simple)
	def static void delete_attribute (Attribute attribute) {
		delete_structuralFeature (attribute)	
	}
	
	// attribute - delete (wrapped)
	def static void delete_attribute (TraceLink attribute) {
		delete_attribute (attribute.<Attribute>target)
	}
	
	// attribute - name - get (simple)
	def static String get_attribute_name (Attribute attribute) {
		get_structuralFeature_name (attribute)	
	}
	
	// attribute - name - get (wrapped)
	def static String get_attribute_name (TraceLink attribute) {
		get_attribute_name (attribute.<Attribute>target)	
	}
	
	// attribute - name - set (simple)
	def static void set_attribute_name (Attribute attribute, String name) {
		set_structuralFeature_name (attribute, name)	
	}
	
	// attribute - name - set (wrapped)
	def static void set_attribute_name (TraceLink attribute, String name) {
		set_attribute_name (attribute.<Attribute>target, name)	
	}
	
	// attribute - owner - get (simple)
	def static Class get_attribute_owner (Attribute attribute) {
		get_structuralFeature_owner (attribute)	
	}
	
	// attribute - owner - get (wrapped)
	def static Class get_attribute_owner (TraceLink attribute) {
		get_attribute_owner (attribute.<Attribute>target)	
	}
	
	// attribute - owner - set (simple)
	def static void set_attribute_owner (Attribute attribute, Class owner) {
		set_structuralFeature_owner (attribute, owner)	
	}
	
	// attribute - owner - set (mixed)
	def static void set_attribute_owner (Attribute attribute, TraceLink owner) {
		set_attribute_owner (attribute, owner.<Class>target)	
	}
	
	// attribute - owner - set (mixed)
	def static void set_attribute_owner (TraceLink attribute, Class owner) {
		set_attribute_owner (attribute.<Attribute>target, owner)	
	}
	
	// attribute - owner - set (wrapped)
	def static void set_attribute_owner (TraceLink attribute, TraceLink owner) {
		set_attribute_owner (attribute.<Attribute>target, owner.<Class>target)	
	}
	
	// attribute - lower - get (simple)
	def static Integer get_attribute_lower (Attribute attribute) {
		get_structuralFeature_lower (attribute)	
	}
	
	// attribute - lower - get (wrapped)
	def static Integer get_attribute_lower (TraceLink attribute) {
		get_attribute_lower (attribute.<Attribute>target)	
	}
	
	// attribute - lower - set (simple)
	def static void set_attribute_lower (Attribute attribute, Integer lower) {
		set_structuralFeature_lower (attribute, lower)	
	}
	
	// attribute - lower - set (wrapped)
	def static void set_attribute_lower (TraceLink attribute, Integer lower) {
		set_attribute_lower (attribute.<Attribute>target, lower)	
	}
	
	// attribute - upper - get (simple)
	def static Integer get_attribute_upper (Attribute attribute) {
		get_structuralFeature_upper (attribute)
	}
	
	// attribute - upper - get (wrapped)
	def static Integer get_attribute_upper (TraceLink attribute) {
		get_attribute_upper (attribute.<Attribute>target)	
	}
	
	// attribute - upper - set (simple)
	def static void set_attribute_upper (Attribute attribute, Integer upper) {
		set_structuralFeature_upper (attribute, upper)	
	}
	
	// attribute - upper - set (wrapped)
	def static void set_attribute_upper (TraceLink attribute, Integer upper) {
		set_attribute_upper (attribute.<Attribute>target, upper)	
	}
	
	// attribute - type - get (simple)
	def static DataType get_attribute_type (Attribute attribute) {
		attribute.type	
	}
	
	// attribute - type - get (wrapped)
	def static DataType get_attribute_type (TraceLink attribute) {
		get_attribute_type (attribute.<Attribute>target)	
	}
	
	// attribute - type - set (simple)
	def static void set_attribute_type (Attribute attribute, DataType type) {
		attribute.type = type
	}
	
	// attribute - type - set (mixed)
	def static void set_attribute_type (Attribute attribute, TraceLink type) {
		set_attribute_type (attribute, type.<DataType>target)	
	}
	
	// attribute - type - set (mixed)
	def static void set_attribute_type (TraceLink attribute, DataType type) {
		set_attribute_type (attribute.<Attribute>target, type)	
	}
	
	// attribute - type - set (wrapped)
	def static void set_attribute_type (TraceLink attribute, TraceLink type) {
		set_attribute_type (attribute.<Attribute>target, type.<DataType>target)
	}
	
}