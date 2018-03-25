package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature
import se.mdh.idt.benji.examples.refactorings.metamodel.Class
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ModelElementActions.*

class StructuralFeatureActions {
	
	// structural feature - delete (simple)
	def static void delete_structuralFeature (StructuralFeature structuralFeature) {
		delete_modelElement (structuralFeature)	
	}
	
	// structural feature - delete (wrapped)
	def static void delete_structuralFeature (TraceLink structuralFeature) {
		delete_structuralFeature (structuralFeature.<StructuralFeature>target)	
	}
	
	// structural feature - name - get (simple)
	def static String get_structuralFeature_name (StructuralFeature structuralFeature) {
		get_modelElement_name (structuralFeature)	
	}
	
	// structural feature - name - get (wrapped)
	def static String get_structuralFeature_name (TraceLink structuralFeature) {
		get_structuralFeature_name (structuralFeature.<StructuralFeature>target)	
	}
	
	// structural feature - name - set (simple)
	def static void set_structuralFeature_name (StructuralFeature structuralFeature, String name) {
		set_modelElement_name (structuralFeature, name)	
	}
	
	// structural feature - name - set (wrapped)
	def static void set_structuralFeature_name (TraceLink structuralFeature, String name) {
		set_structuralFeature_name (structuralFeature.<StructuralFeature>target, name)	
	}
	
	// structural feature - owner - get (simple)
	def static Class get_structuralFeature_owner (StructuralFeature structuralFeature) {
		structuralFeature.owner	
	}
	
	// structural feature - owner - get (wrapped)
	def static Class get_structuralFeature_owner (TraceLink structuralFeature) {
		get_structuralFeature_owner (structuralFeature.<StructuralFeature>target)	
	}	
	
	// structural feature - owner - set (simple)	
	def static void set_structuralFeature_owner (StructuralFeature structuralFeature, Class owner) {
		structuralFeature.owner = owner	
	}
	
	// structural feature - owner - set (mixed)
	def static void set_structuralFeature_owner (StructuralFeature structuralFeature, TraceLink owner) {
		set_structuralFeature_owner (structuralFeature, owner.<Class>target)	
	}
	
	// structural feature - owner - set (mixed)
	def static void set_structuralFeature_owner (TraceLink structuralFeature, Class owner) {
		set_structuralFeature_owner (structuralFeature.<StructuralFeature>target, owner)	
	}
	
	// structural feature - owner - set (wrapped)
	def static void set_structuralFeature_owner (TraceLink structuralFeature, TraceLink owner) {
		set_structuralFeature_owner (structuralFeature.<StructuralFeature>target, owner.<Class>target)	
	}
	
	// structural feature - lower - get (simple)
	def static Integer get_structuralFeature_lower (StructuralFeature structuralFeature) {
		structuralFeature.lower	
	}
	
	// structural feature - lower - get (wrapped)
	def static Integer get_structuralFeature_lower (TraceLink structuralFeature) {
		get_structuralFeature_lower (structuralFeature.<StructuralFeature>target)	
	}
	
	// structural feature - lower - set (simple)
	def static void set_structuralFeature_lower (StructuralFeature structuralFeature, Integer lower) {
		structuralFeature.lower = lower	
	}
	
	// structural feature - lower - set (wrapped)
	def static void set_structuralFeature_lower (TraceLink structuralFeature, Integer lower) {
		set_structuralFeature_lower (structuralFeature, lower)	
	}
	
	// structural feature - upper - get (simple)
	def static Integer get_structuralFeature_upper (StructuralFeature structuralFeature) {
		structuralFeature.upper	
	}
	
	// structural feature - upper - get (wrapped)
	def static Integer get_structuralFeature_upper (TraceLink structuralFeature) {
		get_structuralFeature_upper (structuralFeature.<StructuralFeature>target)	
	}
	
	// structural feature - upper - set (simple)
	def static void set_structuralFeature_upper (StructuralFeature structuralFeature, Integer upper) {
		structuralFeature.upper = upper	
	}
	
	// structural feature - upper - set (wrapped)
	def static void set_structuralFeature_upper (TraceLink structuralFeature, Integer upper) {
		set_structuralFeature_upper (structuralFeature.<StructuralFeature>target, upper)
	}
	
}