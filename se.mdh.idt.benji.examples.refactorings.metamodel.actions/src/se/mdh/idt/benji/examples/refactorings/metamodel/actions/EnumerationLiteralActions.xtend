package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ModelElementActions.*

class EnumerationLiteralActions {
	
	// enumeration literal - create
	def static EnumerationLiteral create_enumerationLiteral () {
		MetamodelFactory.eINSTANCE.createEnumerationLiteral	
	}
	
	// enumeration literal - delete (simple)
	def static void delete_enumerationLiteral (EnumerationLiteral enumerationLiteral) {
		delete_modelElement (enumerationLiteral)	
	}
	
	// enumeration literal - delete (wrapped)
	def static void delete_enumerationLiteral (TraceLink enumerationLiteral) {
		delete_enumerationLiteral (enumerationLiteral.<EnumerationLiteral>target)
	}
	
	// enumeration literal - name - get (simple)
	def static String get_enumerationLiteral_name (EnumerationLiteral enumerationLiteral) {
		get_modelElement_name (enumerationLiteral)	
	}
	
	// enumeration literal - name - get (wrapped)
	def static String get_enumerationLiteral_name (TraceLink enumerationLiteral) {
		get_enumerationLiteral_name (enumerationLiteral.<EnumerationLiteral>target)	
	}
	
	// enumeration literal - name - set (simple)
	def static void set_enumerationLiteral_name (EnumerationLiteral enumerationLiteral, String name) {
		set_modelElement_name (enumerationLiteral, name)	
	}
	
	// enumeration literal - name - set (wrapped)
	def static void set_enumerationLiteral_name (TraceLink enumerationLiteral, String name) {
		set_enumerationLiteral_name (enumerationLiteral.<EnumerationLiteral>target, name)	
	}
	
	// enumeration literal - enumeration - get (simple)
	def static Enumeration get_enumerationLiteral_enumeration (EnumerationLiteral enumerationLiteral) {
		enumerationLiteral.enumeration
	}
	
	// enumeration literal - enumeration - get (wrapped)
	def static Enumeration get_enumerationLiteral_enumeration (TraceLink enumerationLiteral) {
		get_enumerationLiteral_enumeration (enumerationLiteral.<EnumerationLiteral>target)	
	}
	
	// enumeration literal - enumeration - set (simple)
	def static void set_enumerationLiteral_enumeration (EnumerationLiteral enumerationLiteral, Enumeration enumeration) {
		enumerationLiteral.enumeration = enumeration	
	}
	
	// enumeration literal - enumeration - set (mixed)
	def static void set_enumerationLiteral_enumeration (EnumerationLiteral enumerationLiteral, TraceLink enumeration) {
		set_enumerationLiteral_enumeration (enumerationLiteral, enumeration.<Enumeration>target)	
	}
	
	// enumeration literal - enumeration - set (mixed)	
	def static void set_enumerationLiteral_enumeration (TraceLink enumerationLiteral, Enumeration enumeration) {
		set_enumerationLiteral_enumeration (enumerationLiteral.<EnumerationLiteral>target, enumeration)
	}
	
	// enumeration literal - enumeration - set (wrapped)
	def static void set_enumerationLiteral_enumeration (TraceLink enumerationLiteral, TraceLink enumeration) {
		set_enumerationLiteral_enumeration (enumerationLiteral.<EnumerationLiteral>target, enumeration.<Enumeration>target)
	}
		
}