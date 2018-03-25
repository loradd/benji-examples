package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier
import se.mdh.idt.benji.examples.refactorings.metamodel.Package

import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ModelElementActions.*

class ClassifierActions {
	
	// classifier - delete (simple)
	def static void delete_classifier (Classifier classifier) {
		delete_modelElement (classifier)	
	}
	
	// classifier - delete (wrapped)
	def static void delete_classifier (TraceLink classifier) {
		delete_classifier (classifier.<Classifier>target)
	}
	
	// classifier - name - get (simple)
	def static String get_classifier_name (Classifier classifier) {
		get_modelElement_name (classifier)	
	}
	
	// classifier - name - get (wrapped)
	def static String get_classifier_name (TraceLink classifier) {
		get_classifier_name (classifier.<Classifier>target)
	}
	
	// classifier - name - set (simple)
	def static void set_classifier_name (Classifier classifier, String name) {
		set_modelElement_name (classifier, name)	
	}
	
	// classifier - name - set (wrapped)
	def static void set_classifier_name (TraceLink classifier, String name) {
		set_classifier_name (classifier.<Classifier>target, name)	
	}
	
	// classifier - package - get (simple)
	def static Package get_classifier_package (Classifier classifier) {
		classifier.^package	
	}
	
	// classifier - package - get (wrapped)
	def static Package get_classifier_package (TraceLink classifier) {
		get_classifier_package (classifier.<Classifier>target)	
	}
	
	// classifier - package - set (simple)
	def static void set_classifier_package (Classifier classifier, Package ^package) {
		classifier.package = ^package
	}
	
	// classifier - package - set (mixed)
	def static void set_classifier_package (Classifier classifier, TraceLink ^package) {
		set_classifier_package (classifier, ^package.<Package>target)	
	}
	
	// classifier - package - set (mixed)
	def static void set_classifier_package (TraceLink classifier, Package ^package) {
		set_classifier_package (classifier.<Classifier>target, ^package)
	}
	
	// classifier - package - set (wrapped)
	def static void set_classifier_package (TraceLink classifier, TraceLink ^package) {
		set_classifier_package (classifier.<Classifier>target, ^package.<Package>target)
	}
	
}