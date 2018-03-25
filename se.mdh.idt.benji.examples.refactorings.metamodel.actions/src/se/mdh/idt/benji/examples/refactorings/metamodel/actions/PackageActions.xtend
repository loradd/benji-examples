package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.Class
import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType
import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.examples.refactorings.metamodel.Package
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassifierActions.*

class PackageActions {
	
	// package - create 
	def static Package create_package () {
		MetamodelFactory.eINSTANCE.createPackage	
	}
	
	// package - delete (simple)
	def static void delete_package (Package ^package) {
		delete_classifier (^package)	
	}
	
	// package - delete (wrapped)
	def static void delete_package (TraceLink ^package) {
		delete_package (^package.<Package>target)	
	}
	
	// package - name - get (simple)
	def static String get_package_name (Package ^package) {
		get_classifier_name (^package)
	}
	
	// package - name - get (wrapped)
	def static String get_package_name (TraceLink ^package) {
		get_package_name (^package.<Package>target)	
	}
	
	// package - name - set (simple)
	def static void set_package_name (Package ^package, String name) {
		set_classifier_name (^package, name)	
	}
	
	// package - name - set (wrapped)
	def static void set_package_name (TraceLink ^package, String name) {
		set_package_name (^package.<Package>target, name)	
	}
	
	// package - superPackage - get (simple)
	def static Package get_package_superPackage (Package ^package) {
		get_classifier_package (^package)
	}
	
	// package - superPackage - get (wrapped)
	def static Package get_package_superPackage (TraceLink ^package) {
		get_package_superPackage (^package.<Package>target)	
	}
	
	// package - superPackage - set (simple)
	def static void set_package_superPackage (Package ^package, Package superPackage) {
		set_classifier_package (^package, superPackage)
	}
	
	// package - superPackage - set (mixed)
	def static void set_package_superPackage (Package ^package, TraceLink superPackage) {
		set_package_superPackage (^package, superPackage.<Package>target)
	}
	
	// package - superPackage - set (mixed)
	def static void set_package_superPackage (TraceLink ^package, Package superPackage) {
		set_package_superPackage (^package.<Package>target, superPackage)	
	}
	
	// package - superPackage - set (wrapped)
	def static void set_package_superPackage (TraceLink ^package, TraceLink superPackage) {
		set_package_superPackage (^package.<Package>target, superPackage.<Package>target)	
	}

	// package - uri - get (simple)
	def static String get_package_uri (Package ^package) {
		^package.uri	
	}
	
	// package - uri - get (wrapped)
	def static String get_package_uri (TraceLink ^package) {
		get_package_uri (^package.<Package>target)	
	}
	
	// package - uri - set (simple)
	def static void set_package_uri (Package ^package, String uri) {
		^package.uri = uri
	}
	
	// package - uri - set (wrapped)
	def static void set_package_uri (TraceLink ^package, String uri) {
		set_package_uri (^package.<Package>target, uri)	
	}
	
	// package - classifiers - get (simple)
	def static Iterable<Classifier> get_package_classifiers (Package ^package) {
		^package.classifiers
	}
	
	// package - classifiers - get (wrapped)
	def static Iterable<Classifier> get_package_classifiers (TraceLink ^package) {
		get_package_classifiers (^package.<Package>target)	
	}
	
	// package - classifiers - insert (simple)
	def static void insert_package_classifier (Package ^package, Classifier classifier) {
		^package.classifiers += classifier
	}
	
	// package - classifiers - insert (mixed)
	def static void insert_package_classifier (Package ^package, TraceLink classifier) {
		insert_package_classifier (^package, classifier.<Classifier>target)	
	}
	
	// package - classifiers - insert (mixed)
	def static void insert_package_classifier (TraceLink ^package, Classifier classifier) {
		insert_package_classifier (^package.<Package>target, classifier)	
	}
	
	// package - classifiers - insert (wrapped)
	def static void insert_package_classifier (TraceLink ^package, TraceLink classifier) {
		insert_package_classifier (^package.<Package>target, classifier.<Classifier>target)	
	}
	
	// package - classifiers - remove (simple)
	def static void remove_package_classifier (Package ^package, Classifier classifier) {
		^package.classifiers -= classifier
	}
	
	// package - classifiers - remove (mixed)
	def static void remove_package_classifier (Package ^package, TraceLink classifier) {
		remove_package_classifier (^package, classifier.<Classifier>target)	
	}
	
	// package - classifiers - remove (mixed)
	def static void remove_package_classifier (TraceLink ^package, Classifier classifier) {
		remove_package_classifier (^package.<Package>target, classifier)	
	}
	
	// package - classifiers - remove (wrapped)
	def static void remove_package_classifier (TraceLink ^package, TraceLink classifier) {
		remove_package_classifier (^package.<Package>target, classifier.<Classifier>target)
	}
	
	// package - classes - get (simple)
	def static Iterable<Class> get_package_classes (Package ^package) {
		get_package_classifiers(^package).filter(Class)
	}
	
	// package - classes - get (wrapped)
	def static Iterable<Class> get_package_classes (TraceLink ^package) {
		get_package_classes (^package.<Package>target)	
	}
	
	// package - classes - insert (simple)
	def static void insert_package_class (Package ^package, Class ^class) {
		insert_package_classifier (^package, ^class)
	}
	
	// package - classes - insert (mixed)
	def static void insert_package_class (Package ^package, TraceLink ^class) {
		insert_package_class (^package, ^class.<Class>target)	
	}
	
	// package - classes - insert (mixed)
	def static void insert_package_class (TraceLink ^package, Class ^class) {
		insert_package_class (^package.<Package>target, ^class)	
	}
	
	// package - classes - insert (wrapped)
	def static void insert_package_class (TraceLink ^package, TraceLink ^class) {
		insert_package_class (^package.<Package>target, ^class.<Class>target)	
	}
	
	// package - classes - remove (simple)
	def static void remove_package_class (Package ^package, Class ^class) {
		remove_package_classifier (^package, ^class)	
	}
	
	// package - classes - remove (mixed)
	def static void remove_package_class (Package ^package, TraceLink ^class) {
		remove_package_class (^package, ^class.<Class>target)	
	}
	
	// package - classes - remove (mixed)
	def static void remove_package_class (TraceLink ^package, Class ^class) {
		remove_package_class (^package.<Package>target, ^class)	
	}
	
	// package - classes - remove (wrapped)
	def static void remove_package_class (TraceLink ^package, TraceLink ^class) {
		remove_package_class (^package.<Package>target, ^class.<Class>target)	
	}
	
	// package - subPackages - get (simple)
	def static Iterable<Package> get_package_subPackages (Package ^package) {
		get_package_classifiers (^package).filter(Package)	
	}
	
	// package - subPackages - get (wrapped)
	def static Iterable<Package> get_package_subPackages (TraceLink ^package) {
		get_package_subPackages (^package.<Package>target)	
	}
	
	// package - subPackages - insert (simple)
	def static void insert_package_subPackage (Package ^package, Package subPackage) {
		insert_package_classifier (^package, subPackage)	
	}
	
	// package - subPackages - insert (mixed)
	def static void insert_package_subPackage (Package ^package, TraceLink subPackage) {
		insert_package_subPackage (^package, subPackage.<Package>target)	
	}
	
	// package - subPackages - insert (mixed)
	def static void insert_package_subPackage (TraceLink ^package, Package subPackage) {
		insert_package_subPackage (^package.<Package>target, subPackage)	
	}
	
	// package - subPackages - insert (wrapped)
	def static void insert_package_subPackage (TraceLink ^package, TraceLink subPackage) {
		insert_package_subPackage (^package.<Package>target, subPackage.<Package>target)	
	}
	
	// package - subPackages - remove (simple)
	def static void remove_package_subPackage (Package ^package, Package subPackage) {
		remove_package_classifier (^package, subPackage)	
	}
	
	// package - subPackages - remove (mixed)
	def static void remove_package_subPackage (Package ^package, TraceLink subPackage) {
		remove_package_subPackage (^package, subPackage.<Package>target)
	}
	
	// package - subPackages - remove (mixed)
	def static void remove_package_subPackage (TraceLink ^package, Package subPackage) {
		remove_package_subPackage (^package.<Package>target, subPackage)	
	}
	
	// package - subPackages - remove (wrapped)
	def static void remove_package_subPackage (TraceLink ^package, TraceLink subPackage) {
		remove_package_subPackage (^package.<Package>target, subPackage.<Package>target)	
	}	
	
	// package - datatypes - get (simple)
	def static Iterable<DataType> get_package_datatypes (Package ^package) {
		get_package_classifiers(^package).filter(DataType)	
	}
	
	// package - datatypes - get (wrapped)
	def static Iterable<DataType> get_package_datatypes (TraceLink ^package) {
		get_package_datatypes (^package.<Package>target)	
	}
	
	// package - datatypes - insert (simple)
	def static void insert_package_datatype (Package ^package, DataType datatype) {
		insert_package_classifier (^package, datatype)	
	}
	
	// package - datatypes - insert (mixed)
	def static void insert_package_datatype (Package ^package, TraceLink datatype) {
		insert_package_datatype (^package, datatype.<DataType>target)	
	}
	
	// package - datatypes - insert (mixed)
	def static void insert_package_datatype (TraceLink ^package, DataType datatype) {
		insert_package_datatype (^package.<Package>target, datatype)	
	}
	
	// package - datatypes - insert (wrapped)
	def static void insert_package_datatype (TraceLink ^package, TraceLink datatype) {
		insert_package_datatype (^package.<Package>target, datatype.<DataType>target)
	}
	
	// package - datatypes - remove (simple)
	def static void remove_package_datatype (Package ^package, DataType datatype) {
		remove_package_classifier (^package, datatype)	
	}
	
	// package - datatypes - remove (mixed)
	def static void remove_package_datatype (Package ^package, TraceLink datatype) {
		remove_package_datatype (^package, datatype.<DataType>target)	
	}
	
	// package - datatypes - remove (mixed)
	def static void remove_package_datatype (TraceLink ^package, DataType datatype) {
		remove_package_datatype (^package.<Package>target, datatype)	
	}
	
	// package - datatypes - remove (wrapped)
	def static void remove_package_datatype (TraceLink ^package, TraceLink datatype) {
		remove_package_datatype (^package.<Package>target, datatype.<DataType>target)	
	}
	
	// package - enumerations - get (simple)
	def static Iterable<Enumeration> get_package_enumerations (Package ^package) {
		get_package_datatypes(^package).filter(Enumeration)
	}
	
	// package - enumerations - get (wrapped)
	def static Iterable<Enumeration> get_package_enumerations (TraceLink ^package) {
		get_package_enumerations (^package.<Package>target)	
	}
	
	// package - enumerations - insert (simple)
	def static void insert_package_enumeration (Package ^package, Enumeration enumeration) {
		insert_package_datatype (^package, enumeration)
	}
	
	// package - enumerations - insert (mixed)
	def static void insert_package_enumeration (Package ^package, TraceLink enumeration) {
		insert_package_enumeration (^package, enumeration.<Enumeration>target)	
	}
	
	// package - enumerations - insert (mixed)
	def static void insert_package_enumeration (TraceLink ^package, Enumeration enumeration) {
		insert_package_enumeration (^package.<Package>target, enumeration)
	}
	
	// package - enumerations - insert (wrapped)
	def static void insert_package_enumeration (TraceLink ^package, TraceLink enumeration) {
		insert_package_enumeration (^package.<Package>target, enumeration.<Enumeration>target)	
	}
	
	// package - enumerations - remove (simple)
	def static void remove_package_enumeration (Package ^package, Enumeration enumeration) {
		remove_package_datatype (^package, enumeration)	
	}
	
	// package - enumerations - remove (mixed)
	def static void remove_package_enumeration (Package ^package, TraceLink enumeration) {
		remove_package_enumeration (^package, enumeration.<Enumeration>target)
	}
	
	// package - enumerations - remove (mixed)
	def static void remove_package_enumeration (TraceLink ^package, Enumeration enumeration) {
		remove_package_enumeration (^package.<Package>target, enumeration)	
	}
	
	// package - enumerations - remove (wrapped)
	def static void remove_package_enumeration (TraceLink ^package, TraceLink enumeration) {
		remove_package_enumeration (^package.<Package>target, enumeration.<Enumeration>target)
	}
			
}