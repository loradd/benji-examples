package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute
import se.mdh.idt.benji.examples.refactorings.metamodel.Class
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.examples.refactorings.metamodel.Package
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassifierActions.*

class ClassActions {
	
	// class - create
	def static Class create_class () {
		MetamodelFactory.eINSTANCE.createClass	
	}
	
	// class - delete (simple)
	def static void delete_class (Class ^class) {
		delete_classifier (^class)	
	}
	
	// class - delete (wrapped)
	def static void delete_class (TraceLink ^class) {
		delete_class (^class.<Class>target)	
	}
	
	// class - name - get (simple)
	def static String get_class_name (Class ^class) {
		get_classifier_name (^class)
	}
	
	// class - name - get (wrapped) 
	def static String get_class_name (TraceLink ^class) {
		get_class_name (^class.<Class>target)	
	}
	
	// class - name - set (simple)
	def static void set_class_name (Class ^class, String name) {
		set_classifier_name (^class, name)
	}
	
	// class - name - set (wrapped)
	def static void set_class_name (TraceLink ^class, String name) {
		set_class_name (^class.<Class>target, name)	
	}
	
	// class - package - get (simple)
	def static Package get_class_package (Class ^class) {
		get_classifier_package (^class)
	}
		
	// class - package - get (wrapped)
	def static Package get_class_package (TraceLink ^class) {
		get_class_package (^class.<Class>target)
	}
	
	// class - package - set (simple)
	def static void set_class_package (Class ^class, Package ^package) {
		set_classifier_package (^class, ^package)	
	}
	
	// class - package - set (mixed)
	def static void set_class_package (Class ^class, TraceLink ^package) {
		set_class_package (^class, ^package.<Package>target)	
	}
	
	// class - package - set (mixed)
	def static void set_class_package (TraceLink ^class, Package ^package) {
		set_class_package (^class.<Class>target, ^package)
	}
	
	// class - package - set (wrapped)
	def static void set_class_package (TraceLink ^class, TraceLink ^package) {
		set_class_package (^class.<Class>target, ^package.<Package>target)
	}
	
	// class - abstract - get (simple)
	def static Boolean get_class_abstract (Class ^class) {
		^class.abstract	
	}
	
	// class - abstract - get (wrapped)
	def static Boolean get_class_abstract (TraceLink ^class) {
		get_class_abstract (^class.<Class>target)	
	}
	
	// class - abstract - set (simple)
	def static void set_class_abstract (Class ^class, Boolean ^abstract) {
		^class.abstract = ^abstract	
	}
	
	// class - abstract - set (wrapped)
	def static void set_class_abstract (TraceLink ^class, Boolean ^abstract) {
		set_class_abstract (^class.<Class>target, ^abstract)
	}
	
	// class - superClass - get (simple)
	def static Class get_class_superClass (Class ^class) {
		^class.superClass	
	}
	
	// class - superClass - get (wrapped)
	def static Class get_class_superClass (TraceLink ^class) {
		get_class_superClass (^class.<Class>target)	
	}
	
	// class - superClass - set (simple)
	def static void set_class_superClass (Class ^class, Class superClass) {
		^class.superClass = superClass	
	} 
	
	// class - superClass - set (mixed)
	def static void set_class_superClass (Class ^class, TraceLink superClass) {
		set_class_superClass (^class, superClass.<Class>target)	
	}
	
	// class - superClass - set (mixed)
	def static void set_class_superClass (TraceLink ^class, Class superClass) {
		set_class_superClass (^class.<Class>target, superClass)	
	}
	
	// class - superClass - set (wrapped)
	def static void set_class_superClass (TraceLink ^class, TraceLink superClass) {
		set_class_superClass (^class.<Class>target, superClass.<Class>target)
	}
	
	// class - subClasses - get (simple)
	def static Iterable<Class> get_class_subClasses (Class ^class) {
		^class.subClasses	
	}
	
	// class - subClasses - get (wrapped)
	def static Iterable<Class> get_class_subClasses (TraceLink ^class) {
		get_class_subClasses(^class.<Class>target)	
	}
	
	// class - subClasses - insert (simple)
	def static void insert_class_subClass (Class ^class, Class subClass) {
		^class.subClasses += subClass	
	}
	
	// class - subClasses - insert (mixed)
	def static void insert_class_subClass (Class ^class, TraceLink subClass) {
		insert_class_subClass (^class, subClass.<Class>target)	
	}
	
	// class - subClasses - insert (mixed)
	def static void insert_class_subClass (TraceLink ^class, Class subClass) {
		insert_class_subClass (^class.<Class>target, subClass)	
	}
	
	// class - subClasses - insert (wrapped)
	def static void insert_class_subClass (TraceLink ^class, TraceLink subClass) {
		insert_class_subClass (^class.<Class>target, subClass.<Class>target)
	}
	
	// class - subClasses - remove (simple)
	def static void remove_class_subClass (Class ^class, Class subClass) {
		^class.subClasses -= subClass	
	}
	
	// class - subClasses - remove (mixed)
	def static void remove_class_subClass (Class ^class, TraceLink subClass) {
		remove_class_subClass (^class, subClass.<Class>target)	
	}
	
	// class - subClasses - remove (mixed)
	def static void remove_class_subClass (TraceLink ^class, Class subClass) {
		remove_class_subClass (^class.<Class>target, subClass)	
	}
	
	// class - subClasses - remove (wrapped)
	def static void remove_class_subClass (TraceLink ^class, TraceLink subClass) {
		remove_class_subClass (^class.<Class>target, subClass.<Class>target)	
	}
	
	// class - structuralFeatures - get (simple)
	def static Iterable<StructuralFeature> get_class_structuralFeatures (Class ^class) {
		^class.structuralFeatures	
	}
	
	// class - structuralFeatures - get (wrapped)
	def static Iterable<StructuralFeature> get_class_structuralFeatures (TraceLink ^class) {
		get_class_structuralFeatures (^class.<Class>target)	
	}
	
	// class - structuralFeatures - insert (simple)
	def static void insert_class_structuralFeature (Class ^class, StructuralFeature structuralFeature) {
		^class.structuralFeatures += structuralFeature	
	}
	
	// class - structuralFeatures - insert (mixed)
	def static void insert_class_structuralFeature (Class ^class, TraceLink structuralFeature) {
		insert_class_structuralFeature (^class, structuralFeature.<StructuralFeature>target)	
	}
	
	// class - structuralFeatures - insert (mixed)
	def static void insert_class_structuralFeature (TraceLink ^class, StructuralFeature structuralFeature) {
		insert_class_structuralFeature (^class.<Class>target, structuralFeature)	
	}
	
	// class - structuralFeatures - insert (wrapped)
	def static void insert_class_structuralFeature (TraceLink ^class, TraceLink structuralFeature) {
		insert_class_structuralFeature (^class.<Class>target, structuralFeature.<StructuralFeature>target)	
	}
	
	// class - structuralFeatures - remove (simple)
	def static void remove_class_structuralFeature (Class ^class, StructuralFeature structuralFeature) {
		^class.structuralFeatures -= structuralFeature	
	}
	
	// class - structuralFeatures - remove (mixed)
	def static void remove_class_structuralFeature (Class ^class, TraceLink structuralFeature) {
		remove_class_structuralFeature (^class, structuralFeature.<StructuralFeature>target)	
	}
	
	// class - structuralFeatures - remove (mixed)
	def static void remove_class_structuralFeature (TraceLink ^class, StructuralFeature structuralFeature) {
		remove_class_structuralFeature (^class.<Class>target, structuralFeature)	
	}
	
	// class - structuralFeatures - remove (wrapped)
	def static void remove_class_structuralFeature (TraceLink ^class, TraceLink structuralFeature) {
		remove_class_structuralFeature (^class.<Class>target, structuralFeature.<StructuralFeature>target)	
	}
	
	// class - attributes - get (simple)
	def static Iterable<Attribute> get_class_attributes (Class ^class) {
		get_class_structuralFeatures(^class).filter(Attribute)
	}
	
	// class - attributes - get (wrapped)
	def static Iterable<Attribute> get_class_attributes (TraceLink ^class) {
		get_class_attributes (^class.<Class>target)	
	}
	
	// class - attributes - insert (simple)
	def static void insert_class_attribute (Class ^class, Attribute attribute) {
		insert_class_structuralFeature (^class, attribute)	
	}
	
	// class - attributes - insert (mixed)
	def static void insert_class_attribute (Class ^class, TraceLink attribute) {
		insert_class_attribute (^class, attribute.<Attribute>target)	
	}
	
	// class - attributes - insert (mixed)
	def static void insert_class_attribute (TraceLink ^class, Attribute attribute) {
		insert_class_attribute (^class.<Class>target, attribute)	
	}
	
	// class - attributes - insert (wrapped)
	def static void insert_class_attribute (TraceLink ^class, TraceLink attribute) {
		insert_class_attribute (^class.<Class>target, attribute.<Attribute>target)	
	}
	
	// class - attributes - remove (simple)
	def static void remove_class_attribute (Class ^class, Attribute attribute) {
		remove_class_structuralFeature (^class, attribute)	
	}
	
	// class - attributes - remove (mixed)
	def static void remove_class_attribute (Class ^class, TraceLink attribute) {
		remove_class_attribute (^class, attribute.<Attribute>target)	
	}
	
	// class - attributes - remove (mixed)
	def static void remove_class_attribute (TraceLink ^class, Attribute attribute) {
		remove_class_attribute (^class.<Class>target, attribute)	
	}
	
	// class - attributes - remove (wrapped)
	def static void remove_class_attribute (TraceLink ^class, TraceLink attribute) {
		remove_class_attribute (^class.<Class>target, attribute.<Attribute>target)
	}
	
	// class - references - get (simple)
	def static Iterable<Reference> get_class_references (Class ^class) {
		get_class_structuralFeatures (^class).filter(Reference)	
	}
	
	// class - references - get (wrapped)
	def static Iterable<Reference> get_class_references (TraceLink ^class) {
		get_class_references (^class.<Class>target)	
	}
	
	// class - references - insert (simple)
	def static void insert_class_reference (Class ^class, Reference reference) {
		insert_class_structuralFeature (^class, reference)
	}
	
	// class - references - insert (mixed)
	def static void insert_class_reference (Class ^class, TraceLink reference) {
		insert_class_reference (^class, reference.<Reference>target)
	}
	
	// class - references - insert (mixed)
	def static void insert_class_reference (TraceLink ^class, Reference reference) {
		insert_class_reference (^class.<Class>target, reference)
	}
	
	// class - references - insert (wrapped)
	def static void insert_class_reference (TraceLink ^class, TraceLink reference) {
		insert_class_reference (^class.<Class>target, reference.<Reference>target)
	}
	
	// class - references - remove (simple)
	def static void remove_class_reference (Class ^class, Reference reference) {
		remove_class_structuralFeature (^class, reference)	
	}
	
	// class - references - remove (mixed)
	def static void remove_class_reference (Class ^class, TraceLink reference) {
		remove_class_reference (^class, reference.<Reference>target)
	}
	
	// class - references - remove (mixed)
	def static void remove_class_reference (TraceLink ^class, Reference reference) {
		remove_class_reference (^class.<Class>target, reference)
	}
	
	// class - references - remove (wrapped)
	def static void remove_class_reference (TraceLink ^class, TraceLink reference) {
		remove_class_reference (^class.<Class>target, reference.<Reference>target)
	}
	
}