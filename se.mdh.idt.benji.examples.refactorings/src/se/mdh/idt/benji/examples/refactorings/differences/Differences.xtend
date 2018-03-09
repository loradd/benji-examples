package se.mdh.idt.benji.examples.refactorings.differences

import java.util.HashMap
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddPackagePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddPackagePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddReferencePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddReferencePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteAttributePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteAttributePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteMetaclassPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteMetaclassPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeletePackagePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeletePackagePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteReferencePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteReferencePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractSuperclassPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractSuperclassPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.FlattenHierarchyPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.FlattenHierarchyPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameMetaclassPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameMetaclassPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenamePackagePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenamePackagePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameURIPackagePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameURIPackagePrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPrecondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePostcondition
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePrecondition
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute
import se.mdh.idt.benji.examples.refactorings.metamodel.Class
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference

import static se.mdh.idt.benji.difference.api.DifferenceFactory.difference

import static extension org.eclipse.emf.ecore.util.EcoreUtil.delete

class Differences {
	
	// Factories - SimpleClass
	private static extension MetamodelFactory = MetamodelFactory.eINSTANCE
	
	// ACP1 - Rename Package
	public static val renamePackage = difference.name("RenamePackage").precondition(RenamePackagePrecondition.instance).action[
		current_package.name = '''CHANGED_«initial_package.name»''' 		
	].postcondition(RenamePackagePostcondition.instance).build
	
	// ACP2 - Rename URI Package
	public static val renameURIPackage = difference.name("RenameURIPackage").precondition(RenameURIPackagePrecondition.instance).action[
		current_package.uri = '''CHANGED_«initial_package.uri»'''
	].postcondition(RenameURIPackagePostcondition.instance).build
	
	// CDPR3 - Delete Package
	public static val deletePackage = difference.name("DeletePackage").precondition(DeletePackagePrecondition.instance).action[
		current_package.delete(true)
	].postcondition(DeletePackagePostcondition.instance).build
	
	// AAP4 - Add Package
	public static val addPackage = difference.name("AddPackage").precondition(AddPackagePrecondition.instance).action[
		val current_subPackage = createPackage
		current_subPackage.name = '''CREATED_package_«current_package.classifiers.size»''' 
		current_package.classifiers += current_subPackage
	].postcondition(AddPackagePostcondition.instance).build
	
	// AAC5 - Add Metaclass
	public static val addMetaclass = difference.name("AddMetaclass").precondition(AddMetaclassPrecondition.instance).action[
		val current_metaclass = createClass
		current_metaclass.name = '''CREATED_class_«current_package.classifiers.size»'''
		current_package.classifiers += current_metaclass
	].postcondition(AddMetaclassPostcondition.instance).build
	
	// ACC6 - Rename Metaclass
	public static val renameMetaclass = difference.name("RenameMetaclass").precondition(RenameMetaclassPrecondition.instance).action[
		current_metaclass.name = '''CHANGED_«initial_metaclass.name»'''
	].postcondition(RenameMetaclassPostcondition.instance).build
	
	// CDCR7 - Delete Metaclass
	public static val deleteMetaclass = difference.name("DeleteMetaclass").precondition(DeleteMetaclassPrecondition.instance).action[
		current_metaclass.delete(true)
	].postcondition(DeleteMetaclassPostcondition.instance).build
	
	// CCAC8 - Extract Metaclass
	public static val extractMetaclass = difference.name("ExtractMetaclass").precondition(ExtractMetaclassPrecondition.instance).action[
		// @TODO
	].postcondition(ExtractMetaclassPostcondition.instance).build
	
	// CADCCAR9 - Merge Metaclasses
	public static val mergeMetaclasses = difference.name("MergeMetaclasses").precondition(MergeMetaclassesPrecondition.instance).action[
		val current_merged_metaclass = createClass
		current_merged_metaclass.name = '''«current_left_metaclass.name»_«current_right_metaclass.name»'''
		current_merged_metaclass.^abstract = current_left_metaclass.^abstract || current_right_metaclass.^abstract
		val left_attributes = current_left_metaclass.structuralFeatures.filter(Attribute).map[left_attribute |
			createAttribute => [merged_attribute |
				merged_attribute.name = left_attribute.name 
				merged_attribute.type = left_attribute.type
			]
		]
		val right_attributes = current_right_metaclass.structuralFeatures.filter(Attribute).map[right_attribute | 
			createAttribute => [merged_attribute |
				merged_attribute.name = right_attribute.name 
				merged_attribute.type = right_attribute.type
			]
		]
		val common_attributes = left_attributes.filter[left_attribute | 
			right_attributes.exists[right_attribute |
				right_attribute.name == left_attribute.name
			]
		].map[left_attribute | 
			createAttribute => [merged_attribute |
				merged_attribute.name = left_attribute.name 
				merged_attribute.type = left_attribute.type
			]
		]
		current_merged_metaclass.structuralFeatures += common_attributes
		current_merged_metaclass.structuralFeatures += left_attributes.filter[left_attribute | 
			!common_attributes.exists[common_attribute |
				common_attribute.name == left_attribute.name
			]
		]
		current_merged_metaclass.structuralFeatures += right_attributes.filter[right_attribute | 
			!common_attributes.exists[common_attribute |
				common_attribute.name == right_attribute.name
			]
		]
		val left_references = current_left_metaclass.structuralFeatures.filter(Reference).map[left_reference | 
			createReference => [merged_reference |
				merged_reference.name = left_reference.name 
				merged_reference.type = left_reference.type
			]
		]
		val right_references = current_right_metaclass.structuralFeatures.filter(Reference).map[right_reference | 
			createReference => [merged_reference | 
				merged_reference.name = right_reference.name 
				merged_reference.type = right_reference.type
			]
		]
		val common_references = left_references.filter[left_reference | 
			right_references.exists[right_reference |
				right_reference.name == left_reference.name
			]
		].map[left_reference | 
			createReference => [merged_reference |
				merged_reference.name = left_reference.name 
				merged_reference.type = nearestCommonSuperclass(left_reference.type, right_references.findFirst[name == left_reference.name].type)
			]
		]
		current_merged_metaclass.structuralFeatures += common_references
		current_merged_metaclass.structuralFeatures += left_references.filter[left_reference |
			!common_references.exists[common_reference |
				common_reference.name == left_reference.name
			]
		]
		current_merged_metaclass.structuralFeatures += right_references.filter[right_reference | 
			!common_references.exists[common_reference |
				common_reference.name == right_reference.name
			]
		]
		current_left_metaclass.eResource.allContents.filter(Reference)
			.filter[left_reference | left_reference.type.name == current_left_metaclass.name]
			.forEach[left_reference | left_reference.type = current_merged_metaclass]
		current_left_metaclass.eResource.allContents.filter(Reference)
			.filter[right_reference | right_reference.type.name == current_right_metaclass.name]
			.forEach[right_reference | right_reference.type = current_merged_metaclass]
		current_package.classifiers += current_merged_metaclass
		current_left_metaclass.delete(true)
		current_right_metaclass.delete(true)
	].postcondition(MergeMetaclassesPostcondition.instance).build
		
	// AAA10 - Add Attribute
	public static val addAttribute = difference.name("AddAttribute").precondition(AddAttributePrecondition.instance).action[
		val current_attribute = createAttribute
		current_attribute.name = '''CREATED_attribute_«current_class.structuralFeatures.size»'''
		current_attribute.type = current_dataType
		current_class.structuralFeatures += current_attribute
	].postcondition(AddAttributePostcondition.instance).build
	
	// ADA11 - Delete Attribute
	public static val deleteAttribute = difference.name("DeleteAttribute").precondition(DeleteAttributePrecondition.instance).action[
		current_attribute.delete(true)
	].postcondition(DeleteAttributePostcondition.instance).build
	
	// ACA12 - Change Attribute Type
	public static val changeAttributeType = difference.name("ChangeAttributeType").precondition(ChangeAttributeTypePrecondition.instance).action[
		current_attribute.type = current_type
	].postcondition(ChangeAttributeTypePostcondition.instance).build
	
	// AACR13 - Add Reference
	public static val addReference = difference.name("AddReference").precondition(AddReferencePrecondition.instance).action[
		val current_reference = createReference
		current_reference.name = '''CREATED_reference_«current_class.structuralFeatures.size»'''	
		current_reference.type = current_type
		current_class.structuralFeatures += current_reference
	].postcondition(AddReferencePostcondition.instance).build
	
	// ADCR14 - Delete Reference
	public static val deleteReference = difference.name("DeleteReference").precondition(DeleteReferencePrecondition.instance).action[
		current_reference.delete(true)
	].postcondition(DeleteReferencePostcondition.instance).build
	
	// CADCR15 - Split Reference
	public static val splitReference = difference.name("SplitReference").precondition(SplitReferencePrecondition.instance).action [
		val current_type_subClasses = current_reference.type.subClasses
		current_type_subClasses.forEach[current_type_subClass | 
			val current_type_subClass_reference = createReference
			current_type_subClass_reference.name = '''SPLIT_«current_reference.name»_«current_type_subClass.name»'''
			current_type_subClass_reference.type = current_type_subClass
			current_class.structuralFeatures += current_type_subClass_reference
		]
		current_reference.delete(true)
	].postcondition(SplitReferencePostcondition.instance).build
	
	// CADCCR16 - Merge References
	public static val mergeReferences = difference.name("MergeReferences").precondition(MergeReferencesPrecondition.instance).action[
		val current_merged_reference = createReference
		current_merged_reference.name = '''MERGED_«current_left_reference.name»_«current_right_reference.name»'''
		current_merged_reference.type = nearestCommonSuperclass (current_left_reference.type, current_right_reference.type)
		current_class.structuralFeatures += current_merged_reference
		current_left_reference.delete(true)
		current_right_reference.delete(true)
	].postcondition(MergeReferencesPostcondition.instance).build
	
	// ACCR17 - Change Reference Type
	public static val changeReferenceType = difference.name("ChangeReferenceType").precondition(ChangeReferenceTypePrecondition.instance).action[
		current_reference.type = current_class
	].postcondition(ChangeReferenceTypePostcondition.instance).build
	
	// CADCAR18 - Extract Superclass
	public static val extractSuperclass = difference.name("ExtractSuperclass").precondition(ExtractSuperclassPrecondition.instance).action[
		val current_superClass = createClass 
		current_superClass.name = '''SUPER_«initial_class.name»'''
		current_superClass.superClasses += initial_class.superClasses 
		current_class.superClasses.clear	
		current_class.superClasses += current_superClass
		current_attribute.owner = current_superClass
		current_reference.owner = current_superClass
	].postcondition(ExtractSuperclassPostcondition.instance).build
	
	// ACC19 - Change Metaclass Abstract
	public static val changeMetaclassAbstract = difference.name("ChangeMetaclassAbstract").precondition(ChangeMetaclassAbstractPrecondition.instance).action[
		current_metaclass.^abstract = true
	].postcondition(ChangeMetaclassAbstractPostcondition.instance).build
	
	// ACCR20 - Restrict Metaproperty
	public static val restrictMetaproperty = difference.name("RestrictMetaproperty").precondition(RestrictMetapropertyPrecondition.instance).action[
		current_property.upper = Math.max(1, initial_property.upper - 1)
	].postcondition(RestrictMetapropertyPostcondition.instance).build
	
	// CADCCAR21 - Flatten Hierarchy
	public static val flattenHierarchy = difference.name("FlattenHierarchy").precondition(FlattenHierarchyPrecondition.instance).action[
		current_class.subClasses.forEach [current_subClass | 
			current_class.structuralFeatures.filter(Attribute).forEach [current_class_attribute | 
				val current_subClass_attribute = createAttribute
				current_subClass_attribute.name = current_class_attribute.name
				current_subClass_attribute.type = current_class_attribute.type
				current_subClass.structuralFeatures += current_subClass_attribute
			]
			current_class.structuralFeatures.filter(Reference).forEach [current_class_reference | 
				val current_subClass_reference = createReference
				current_subClass_reference.name = current_class_reference.name
				current_subClass_reference.type = current_class_reference.type
				current_subClass.structuralFeatures += current_subClass_reference
			]
			current_subClass.superClasses += current_class.superClasses
		] 
		current_class.delete(true) 
	].postcondition(FlattenHierarchyPostcondition.instance).build 
	
	// CDACA22 - Push Down Property
	public static val pushDownProperty = difference.name("PushDownProperty").precondition(PushDownPropertyPrecondition.instance).action[
		current_property.owner = current_subClass
	].postcondition(PushDownPropertyPostcondition.instance).build
	
	// Util - retrieve nearest common superclass
	private static def Class nearestCommonSuperclass (Class leftClass, Class rightClass) {
		val leftSuperclassDistances = leftClass.computeSuperclassDistances
		val rightSuperclassDistances = rightClass.computeSuperclassDistances
		val commonSuperclasses = leftSuperclassDistances.keySet.map[leftSuperclass | 
			val rightSuperclass = rightSuperclassDistances.keySet.findFirst[rightSuperclass | 
				rightSuperclass.name == leftSuperclass.name
			]
			if (rightSuperclass !== null) Pair.of(leftSuperclass, rightSuperclass) else null
		].filterNull
		return commonSuperclasses.minBy[commonSuperclass | 
			leftSuperclassDistances.get(commonSuperclass.key) + rightSuperclassDistances.get(commonSuperclass.value)
		].key
	}
	
	// Util - compute superclass distances
	private static def HashMap<Class, Integer> computeSuperclassDistances (Class ^class) {
		newHashMap => [superclassDistances | ^class.computeSuperclassDistances (superclassDistances, 0)]
	}
	
	// Util - compute superclass distances
	private static def void computeSuperclassDistances (Class ^class, HashMap<Class, Integer> superclassDistances, int currentDistance) {
		val currentKey = superclassDistances.keySet.findFirst[superclass | superclass.name == ^class.name] ?: ^class
		val currentValue = superclassDistances.getOrDefault(currentKey, currentDistance)
		if (currentDistance < currentValue) superclassDistances.put(currentKey, currentDistance) else superclassDistances.put(currentKey, currentValue)
		^class.superClasses.forEach [computeSuperclassDistances(superclassDistances, currentDistance + 1)]
	}
	
}