package se.mdh.idt.benji.examples.refactorings.metamodel.actions

import se.mdh.idt.benji.examples.refactorings.metamodel.DataType
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.examples.refactorings.metamodel.Package
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassifierActions.*

class DataTypeActions {
	
	// datatype - create
	def static DataType create_datatype () {
		MetamodelFactory.eINSTANCE.createDataType	
	}
	
	// datatype - delete (simple)
	def static void delete_datatype (DataType datatype) {
		delete_classifier (datatype)	
	}
	
	// datatype - delete (wrapped)
	def static void delete_class (TraceLink datatype) {
		delete_datatype (datatype.<DataType>target)
	}
	
	// datatype - name - get (simple)
	def static String get_datatype_name (DataType datatype) {
		get_classifier_name (datatype)	
	}
	
	// datatype - name - get (wrapped)
	def static String get_datatype_name (TraceLink datatype) {
		get_datatype_name (datatype.<DataType>target)	
	}	
	
	// datatype - name - set (simple)
	def static void set_datatype_name (DataType datatype, String name) {
		set_classifier_name (datatype, name)
	}
	
	// datatype - name - set (wrapped)
	def static void set_datatype_name (TraceLink datatype, String name) {
		set_datatype_name (datatype, name)	
	}
	
	// datatype - package - get (simple)
	def static Package get_datatype_package (DataType datatype) {
		get_classifier_package (datatype)	
	}
	
	// datatype - package - get (wrapped)
	def static Package get_datatype_package (TraceLink datatype) {
		get_datatype_package (datatype.<DataType>target)	
	}
	
	// datatype - package - set (simple)
	def static void set_datatype_package (DataType datatype, Package ^package) {
		set_classifier_package (datatype, ^package)
	}
	
	// datatype - package - set (mixed)
	def static void set_datatype_package (DataType datatype, TraceLink ^package) {
		set_datatype_package (datatype, ^package.<Package>target)
	}
	
	// datatype - package - set (mixed)
	def static void set_datatype_package (TraceLink datatype, Package ^package) {
		set_datatype_package (datatype.<DataType>target, ^package)
	}
	
	// datatype - package - set (wrapped)
	def static void set_datatype_package (TraceLink datatype, TraceLink ^package) {
		set_datatype_package (datatype.<DataType>target, ^package.<Package>target)
	}
	
}