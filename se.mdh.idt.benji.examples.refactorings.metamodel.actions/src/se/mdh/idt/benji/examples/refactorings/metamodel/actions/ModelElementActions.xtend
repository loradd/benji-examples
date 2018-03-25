package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.ModelElement
import se.mdh.idt.benji.trace.TraceLink

import static extension org.eclipse.emf.ecore.util.EcoreUtil.delete

class ModelElementActions {
	
	// model element - delete (simple)
	def static void delete_modelElement (ModelElement modelElement) {
		modelElement.delete(true)
	}
	
	// model element - delete (wrapped)
	def static void delete_modelElement (TraceLink modelElement) {
		delete_modelElement (modelElement.<ModelElement>target)	
	}
	
	// model element - name - get (simple)
	def static String get_modelElement_name (ModelElement modelElement) {
		modelElement.name
	}
	
	// model element - name - get (wrapped)
	def static String get_modelElement_name (TraceLink modelElement) {
		get_modelElement_name (modelElement.<ModelElement>target)
	}
	
	// model element - name - set (simple)
	def static void set_modelElement_name (ModelElement modelElement, String name) {
		modelElement.name = name
	}
	
	// model element - name - set (wrapped)
	def static void set_modelElement_name (TraceLink modelElement, String name) {
		set_modelElement_name (modelElement.<ModelElement>target, name)
	}
	
}