package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.examples.refactorings.metamodel.Package
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.DataTypeActions.*

class EnumerationActions {
	
	// enumeration - create
	def static Enumeration create_enumeration () {
		MetamodelFactory.eINSTANCE.createEnumeration	
	}
	
	// enumeration - delete (simple)
	def static void delete_enumeration (Enumeration enumeration) {
		delete_datatype (enumeration)	
	}
	
	// enumeration - delete (wrapped)
	def static void delete_enumeration (TraceLink enumeration) {
		delete_enumeration(enumeration.<Enumeration>target)	
	}
	
	// enumeration - name - get (simple)
	def static String get_enumeration_name (Enumeration enumeration) {
		get_datatype_name (enumeration)	
	}
	
	// enumeration - name - get (wrapped)
	def static String get_enumeration_name (TraceLink enumeration) {
		get_enumeration_name (enumeration.<Enumeration>target)	
	}
	
	// enumeration - name - set (simple)
	def static void set_enumeration_name (Enumeration enumeration, String name) {
		set_datatype_name (enumeration, name)	
	}
	
	// enumeration - name - set (wrapped)
	def static void set_enumeration_name (TraceLink enumeration, String name) {
		set_enumeration_name (enumeration.<Enumeration>target, name)	
	}
	
	// enumeration - package - get (simple)
	def static Package get_enumeration_package (Enumeration enumeration) {
		get_datatype_package (enumeration)	
	}
	
	// enumeration - package - get (wrapped)
	def static Package get_enumeration_package (TraceLink enumeration) {
		get_enumeration_package (enumeration.<Enumeration>target)
	}
	
	// enumeration - package - set (simple)
	def static void set_enumeration_package (Enumeration enumeration, Package ^package) {
		set_datatype_package (enumeration, ^package)
	}
	
	// enumeration - package - set (mixed)
	def static void set_enumeration_package (Enumeration enumeration, TraceLink ^package) {
		set_enumeration_package (enumeration, ^package.<Package>target)
	}
	
	// enumeration - package - set (mixed)
	def static void set_enumeration_package (TraceLink enumeration, Package ^package) {
		set_enumeration_package (enumeration.<Enumeration>target, ^package)	
	}
	
	// enumeration - package - set (wrapped)
	def static void set_enumeration_package (TraceLink enumeration, TraceLink ^package) {
		set_enumeration_package (enumeration.<Enumeration>target, ^package.<Package>target)
	}
	
	// enumeration - enumeration literals - get (simple)
	def static Iterable<EnumerationLiteral> get_enumeration_enumerationLiterals (Enumeration enumeration) {
		enumeration.enumerationLiterals	
	}
	
	// enumeration - enumeration literals - get (wrapped)
	def static Iterable<EnumerationLiteral> get_enumeration_enumerationLiterals (TraceLink enumeration) {
		get_enumeration_enumerationLiterals (enumeration.<Enumeration>target)	
	}
	
	// enumeration - enumeration literals - insert (simple)
	def static void insert_enumeration_enumerationLiteral (Enumeration enumeration, EnumerationLiteral enumerationLiteral) {
		enumeration.enumerationLiterals += enumerationLiteral
	}
	
	// enumeration - enumeration literals - insert (mixed)
	def static void insert_enumeration_enumerationLiteral (Enumeration enumeration, TraceLink enumerationLiteral) {
		insert_enumeration_enumerationLiteral (enumeration, enumerationLiteral.<EnumerationLiteral>target)
	}
	
	// enumeration - enumeration literals - insert (mixed)
	def static void insert_enumeration_enumerationLiteral (TraceLink enumeration, EnumerationLiteral enumerationLiteral) {
		insert_enumeration_enumerationLiteral (enumeration.<Enumeration>target, enumerationLiteral)
	}
	
	// enumeration - enumeration literals - insert (wrapped)
	def static void insert_enumeration_enumerationLiteral (TraceLink enumeration, TraceLink enumerationLiteral) {
		insert_enumeration_enumerationLiteral (enumeration.<Enumeration>target, enumerationLiteral.<EnumerationLiteral>target)
	}
	
	// enumeration - enumeration literals - remove (simple)
	def static void remove_enumeration_enumerationLiteral (Enumeration enumeration, EnumerationLiteral enumerationLiteral) {
		enumeration.enumerationLiterals -= enumerationLiteral
	}
	
	// enumeration - enumeration literals - remove (mixed)
	def static void remove_enumeration_enumerationLiteral (Enumeration enumeration, TraceLink enumerationLiteral) {
		remove_enumeration_enumerationLiteral (enumeration, enumerationLiteral.<EnumerationLiteral>target)
	}
	
	// enumeration - enumeration literals - remove (mixed)
	def static void remove_enumeration_enumerationLiteral (TraceLink enumeration, EnumerationLiteral enumerationLiteral) {
		remove_enumeration_enumerationLiteral (enumeration.<Enumeration>target, enumerationLiteral)
	}
	
	// enumeration - enumeration literals - remove (wrapped)
	def static void remove_enumeration_enumerationLiteral (TraceLink enumeration, TraceLink enumerationLiteral) {
		remove_enumeration_enumerationLiteral (enumeration.<Enumeration>target, enumerationLiteral.<EnumerationLiteral>target)
	}
	
}