package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.Class
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.StructuralFeatureActions.*

class ReferenceActions {
	
	// reference - create
	def static Reference create_reference () {
		MetamodelFactory.eINSTANCE.createReference	
	}
	
	// reference - delete (simple)
	def static void delete_reference (Reference reference) {
		delete_structuralFeature (reference)	
	}
	
	// reference - delete (wrapped)
	def static void delete_reference (TraceLink reference) {
		delete_reference (reference.<Reference>target)
	}
	
	// reference - name - get (simple)
	def static String get_reference_name (Reference reference) {
		get_structuralFeature_name (reference)	
	}
	
	// reference - name - get (wrapped)
	def static String get_reference_name (TraceLink reference) {
		get_reference_name(reference.<Reference>target)	
	}
	
	// reference - name - set (simple)
	def static void set_reference_name (Reference reference, String name) {
		set_structuralFeature_name (reference, name)	
	}
	
	// reference - name - set (wrapped)
	def static void set_reference_name (TraceLink reference, String name) {
		set_reference_name (reference.<Reference>target, name)	
	}
	
	// reference - owner - get (simple)
	def static Class get_reference_owner (Reference reference) {
		get_structuralFeature_owner (reference)	
	}
	
	// reference - owner - get (wrapped)
	def static Class get_reference_owner (TraceLink reference) {
		get_reference_owner (reference.<Reference>target)	
	}
	
	// reference - owner - set (simple)
	def static void set_reference_owner (Reference reference, Class owner) {
		set_structuralFeature_owner (reference, owner)	
	}
	
	// reference - owner - set (mixed)
	def static void set_reference_owner (Reference reference, TraceLink owner) {
		set_reference_owner (reference, owner.<Class>target)	
	}
	
	// reference - owner - set (mixed)
	def static void set_reference_owner (TraceLink reference, Class owner) {
		set_reference_owner (reference.<Reference>target, owner)	
	}
	
	// reference - owner - set (wrapped)
	def static void set_reference_owner (TraceLink reference, TraceLink owner) {
		set_reference_owner (reference.<Reference>target, owner.<Class>target)	
	}
	
	// reference - lower - get (simple)
	def static Integer get_reference_lower (Reference reference) {
		get_structuralFeature_lower (reference)
	}

	// reference - lower - get (wrapped)
	def static Integer get_reference_lower (TraceLink reference) {
		get_reference_lower (reference.<Reference>target)
	}

	// reference - lower - set (simple)
	def static void set_reference_lower (Reference reference, Integer lower) {
		set_structuralFeature_lower (reference, lower)
	}

	// reference - lower - set (wrapped)
	def static void set_reference_lower (TraceLink reference, Integer lower) {
		set_reference_lower (reference.<Reference>target, lower)
	}
	
	// reference - upper - get (simple)
	def static Integer get_reference_upper (Reference reference) {
		get_structuralFeature_upper (reference)
	}

	// reference - upper - get (wrapped) 
	def static Integer get_reference_upper (TraceLink reference) {
		get_reference_upper (reference.<Reference>target)
	}

	// reference - upper - set (simple)
	def static void set_reference_upper (Reference reference, Integer upper) {
		set_structuralFeature_upper (reference, upper)
	}

	// reference - upper - set (wrapped)
	def static void set_reference_upper (TraceLink reference, Integer upper) {
		set_reference_upper (reference.<Reference>target, upper)
	}
	
	// reference - type - get (simple)
	def static Class get_reference_type (Reference reference) {
		reference.type
	}

	// reference - type - get (wrapped)
	def static Class get_reference_type (TraceLink reference) {
		get_reference_type (reference.<Reference>target)
	}

	// reference - type - set (simple)
	def static void set_reference_type (Reference reference, Class type) {
		reference.type = type
	}

	// reference - type - set (mixed)
	def static void set_reference_type (Reference reference, TraceLink type) {
		set_reference_type (reference, type.<Class>target)
	}

	// reference - type - set (mixed)
	def static void set_reference_type (TraceLink reference, Class type) {
		set_reference_type (reference.<Reference>target, type)
	}

	// reference - type - set (wrapped)
	def static void set_reference_type (TraceLink reference, TraceLink type) {
		set_reference_type (reference.<Reference>target, type.<Class>target)
	}
	
	// reference - containment - get (simple)
	def static Boolean get_reference_containment (Reference reference) {
		reference.containment
	}

	// reference - containment - get (wrapped)
	def static Boolean get_reference_containment (TraceLink reference) {
		get_reference_containment (reference.<Reference>target)
	}

	// reference - containment - set (simple)
	def static void set_reference_containment (Reference reference, Boolean containment) {
		reference.containment = containment
	}

	// reference - containment - set (wrapped)
	def static void set_reference_containment (TraceLink reference, Boolean containment) {
		set_reference_containment (reference.<Reference>target, containment)
	}
	
	// reference - opposite - get (simple)
	def static Reference get_reference_opposite (Reference reference) {
		reference.opposite
	}

 	// reference - opposite - get (wrapped) 
 	def static Reference get_reference_opposite (TraceLink reference) {
 		get_reference_opposite (reference.<Reference>target)
 	}

	// reference - opposite - set (simple)
	def static void set_reference_opposite (Reference reference, Reference opposite) {
		reference.opposite = opposite
	}

	// reference - opposite - set (mixed)
	def static void set_reference_opposite (Reference reference, TraceLink opposite) {
		set_reference_opposite (reference, opposite.<Reference>target)
	}

	// reference - opposite - set (mixed)
	def static void set_reference_opposite (TraceLink reference, Reference opposite) {
		set_reference_opposite (reference.<Reference>target, opposite)
	}

	// reference - opposite - set (wrapped)
	def static void set_reference_opposite (TraceLink reference, TraceLink opposite) {
		set_reference_opposite (reference.<Reference>target, opposite.<Reference>target)
	}
	
}