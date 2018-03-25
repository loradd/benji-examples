package se.mdh.idt.benji.examples.refactorings

import java.util.HashMap
import java.util.List
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute
import se.mdh.idt.benji.examples.refactorings.metamodel.Class
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference
import se.mdh.idt.benji.trace.TraceLink

import static se.mdh.idt.benji.difference.api.DifferenceFactory.difference
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.AttributeActions.create_attribute
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.AttributeActions.delete_attribute
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.AttributeActions.get_attribute_name
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.AttributeActions.get_attribute_type
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.AttributeActions.set_attribute_name
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.AttributeActions.set_attribute_type
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.create_class
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.delete_class
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.get_class_abstract
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.get_class_attributes
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.get_class_name
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.get_class_references
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.get_class_superClass
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.insert_class_attribute
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.insert_class_reference
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.set_class_abstract
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.set_class_name
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions.set_class_superClass
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.PackageActions.create_package
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.PackageActions.delete_package
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.PackageActions.insert_package_class
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.PackageActions.insert_package_subPackage
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.PackageActions.set_package_name
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.PackageActions.set_package_uri
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions.create_reference
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions.delete_reference
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions.get_reference_name
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions.get_reference_type
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions.set_reference_name
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions.set_reference_type
import static se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions.set_reference_upper

class Differences {
	
	// Factories - Metamodel
	private static extension MetamodelFactory = MetamodelFactory.eINSTANCE
	
	// ACP1 - Rename Package
	public static val renamePackage = difference.name("RenamePackage")
	.precondition(RenamePackagePrecondition.instance).action[
		set_package_name ($package, $name)
	].postcondition(RenamePackagePostcondition.instance).build
	
	// ACP2 - Change Package URI
	public static val renameURIPackage = difference.name("RenameURIPackage")
	.precondition(RenameURIPackagePrecondition.instance).action[
		set_package_uri ($package, $uri)
	].postcondition(RenameURIPackagePostcondition.instance).build
	
	// CDPR3 - Delete Package
	public static val deletePackage = difference.name("DeletePackage")
	.precondition(DeletePackagePrecondition.instance).action[
		delete_package ($package)
	].postcondition(DeletePackagePostcondition.instance).build
	
	// AAP4 - Add Package
	public static val addPackage = difference.name("AddPackage")
	.precondition(AddPackagePrecondition.instance).action[
		val $subPackage = create_package
		set_package_name ($subPackage, $subPackage_name)
		insert_package_subPackage ($package, $subPackage)
	].postcondition(AddPackagePostcondition.instance).build
	
	// AAC5 - Add Class
	public static val addClass = difference.name("AddClass")
	.precondition(AddClassPrecondition.instance).action[
		val $class = create_class
		set_class_name ($class, $class_name)
		insert_package_class ($package, $class) 
	].postcondition(AddClassPrecondition.instance).build
	
	// ACC6 - Rename Class
	public static val renameClass = difference.name("RenameClass")
	.precondition(RenameClassPrecondition.instance).action[
		set_class_name ($class, $name)
	].postcondition(RenameClassPostcondition.instance).build
	
	// CDCR7 - Delete Class
	public static val deleteClass = difference.name("DeleteClass")
	.precondition(DeleteClassPrecondition.instance).action[
		delete_class ($class)
	].postcondition(DeleteClassPostcondition.instance).build
	
	// CCAC8 - Extract Class
	public static val extractClass = difference.name("ExtractClass")
	.precondition(ExtractClassPrecondition.instance).action[
		val $attribute_class = create_class
		set_class_name ($attribute_class, $attribute_class_name)
		insert_package_class ($package, $attribute_class)
		val $attribute_reference = create_reference  
		set_reference_name ($attribute_reference, $attribute_reference_name)
		set_reference_type ($attribute_reference, $attribute_class)	
		insert_class_reference ($class, $attribute_reference)
		delete_attribute ($attribute)
	].postcondition(ExtractClassPostcondition.instance).build
	
	// CADCCAR9 - Merge Classes
	public static val mergeClasses = difference.name("MergeClasses")
	.precondition(MergeClassesPrecondition.instance).action[
		val $merged_class = create_class
		insert_package_class ($package, $merged_class)
		set_class_name ($merged_class, $merged_class_name)
		merge_class_attribute_intersection ($left_class, $right_class, $merged_class)
		move_class_attribute_difference ($left_class, $right_class, $merged_class)
		move_class_attribute_difference ($right_class, $left_class, $merged_class)
		merge_class_reference_intersection ($left_class, $right_class, $merged_class)
		move_class_reference_difference ($left_class, $right_class, $merged_class)
		move_class_reference_difference ($right_class, $left_class, $merged_class)
		change_incoming_reference_type ($left_class, $merged_class)
		change_incoming_reference_type ($right_class, $merged_class)
		delete_class ($left_class)
		delete_class ($right_class)
	].postcondition(MergeClassesPostcondition.instance).build
	
	// AAA10 - Add Attribute
	public static val addAttribute = difference.name("AddAttribute")
	.precondition(AddAttributePrecondition.instance).action[
		val $attribute = create_attribute
		set_attribute_name ($attribute, $name)
		set_attribute_type ($attribute, $type)
		insert_class_attribute ($class, $attribute)
	].postcondition(AddAttributePostcondition.instance).build
	
	// ADA11 - Delete Attribute
	public static val deleteAttribute = difference.name("DeleteAttribute")
	.precondition(DeleteAttributePrecondition.instance).action[
		delete_attribute ($attribute)
	].postcondition(DeleteAttributePostcondition.instance).build
	
	// ACA12 - Change Attribute Type
	public static val changeAttributeType = difference.name("ChangeAttributeType")
	.precondition(ChangeAttributeTypePrecondition.instance).action[
		set_attribute_type ($attribute, $target_type)
	].postcondition(ChangeAttributeTypePostcondition.instance).build
	
	// AACR13 - Add Reference
	public static val addReference = difference.name("AddReference")
	.precondition(AddReferencePrecondition.instance).action[
		val $reference = create_reference
		set_reference_name ($reference, $name)
		set_reference_type ($reference, $type)
		insert_class_reference ($class, $reference);
	].postcondition(AddReferencePostcondition.instance).build
	
	// ADCR14 - Delete Reference
	public static val deleteReference = difference.name("DeleteReference")
	.precondition(DeleteReferencePrecondition.instance).action[
		delete_reference ($reference)
	].postcondition(DeleteReferencePostcondition.instance).build
	
	// CADCR15 - Split Reference [TODO]
	
	// CADCCR16 - Merge References
	public static val mergeReferences = difference.name("MergeReferences")
	.precondition(MergeReferencesPrecondition.instance).action[
		merge_reference ($left_reference, $right_reference, $class)
	].postcondition(MergeReferencesPostcondition.instance).build
	
	// ACCR17 - Change Reference Type
	public static val changeReferenceType = difference.name("ChangeReferenceType")
	.precondition(ChangeReferenceTypePrecondition.instance).action[
		set_reference_type ($reference, $target_type)
	].postcondition(ChangeReferenceTypePostcondition.instance).build
	
	// CADCAR18 - Extract Superclass
	public static val extractSuperclass = difference.name("ExtractSuperclass")
	.precondition(ExtractSuperclassPrecondition.instance).action[
		val $target_superClass = create_class
		val $superClass_name = "super_" + get_class_name ($class)
		set_class_name ($target_superClass, $superClass_name)
		move_reference ($reference, $target_superClass)
		move_attribute ($attribute, $target_superClass)
		set_class_superClass ($target_superClass, $source_superClass)
		set_class_superClass ($class, $target_superClass)
	].postcondition(ExtractSuperclassPostcondition.instance).build
	
	// ACC19 - Change Class Abstract
	public static val changeClassAbstract = difference.name("ChangeClassAbstract")
	.precondition(ChangeClassAbstractPrecondition.instance).action[
		set_class_abstract ($class, !get_class_abstract($class))
	].postcondition(ChangeClassAbstractPostcondition.instance).build
	
	// ACCR20 - Restrict Reference
	public static val restrictReference = difference.name("RestrictReference")
	.precondition(RestrictReferencePrecondition.instance).action[
		set_reference_upper ($reference, Math.max(1, $source_lower))
	].postcondition(RestrictReferencePostcondition.instance).build
	
	// CADCCAR21 - Flatten Hierarchy [TODO]

	// CDACA22 - Push Down Attribute
	public static val pushDownAttribute = difference.name("PushDownAttribute")
	.precondition(PushDownAttributePrecondition.instance).action[
		move_attribute ($attribute, $subClass)
	].postcondition(PushDownAttributePostcondition.instance).build

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	// Util - change_incoming_reference_type (mixed)
	private static def void change_incoming_reference_type (TraceLink $source_type, Class $target_type) {
		change_incoming_reference_type ($source_type.<Class>target, $target_type)
	}
	
	// Util - change_incoming_reference_type (simple)
	private static def void change_incoming_reference_type (Class $source_type, Class $target_type) {
		$source_type.eResource.allContents.filter(Reference)
			.filter[ $reference | get_reference_type ($reference) == $source_type ]
			.forEach[ $reference | set_reference_type ($reference, $target_type) ]
	}
	
	// Util - create_class_reference (simple)
	private static def Reference create_class_reference (Class $class) {
		createReference => [$reference | insert_class_reference($class, $reference)]
	}
	
	// Util - create_class_attribute (simple)
	private static def Attribute create_class_attribute (Class $class) {
		createAttribute => [$attribute | insert_class_attribute ($class, $attribute)]
	}
	
	// Util - merge_class_attribute_intersection (simple)
	def private static void merge_class_attribute_intersection (Class $left_class, Class $right_class, Class $merged_class) {
		get_class_attribute_intersection ($left_class, $right_class)
			.forEach [ $attributes | merge_attribute ($attributes.key, $attributes.value, $merged_class) ]
	}

	// Util - merge_class_attribute_intersection (mixed)
	private static def void merge_class_attribute_intersection (TraceLink $left_class, TraceLink $right_class, Class $merged_class) {
		merge_class_attribute_intersection ($left_class.<Class>target, $right_class.<Class>target, $merged_class)
	}
	
	// Util - merge_class_reference_intersection (simple)
	private static def void merge_class_reference_intersection (Class $left_class, Class $right_class, Class $merged_class) {
		get_class_reference_intersection ($left_class, $right_class)
			.forEach [ $references | merge_reference ($references.key, $references.value, $merged_class) ]
	}
	
	// Util - merge_class_reference_intersection (mixed)
	private static def void merge_class_reference_intersection (TraceLink $left_class, TraceLink $right_class, Class $merged_class) {
		merge_class_reference_intersection ($left_class.<Class>target, $right_class.<Class>target, $merged_class)
	}
	
	// Util - move_class_attribute_difference (simple)
	private static def void move_class_attribute_difference (Class $left_class, Class $right_class, Class $target_class) {
		get_class_attribute_difference ($left_class, $right_class)
			.forEach[ $left_attribute | move_attribute ($left_attribute, $target_class) ]
	}
	
	// Util - move_class_attribute_difference (mixed)
	private static def void move_class_attribute_difference (TraceLink $left_class, TraceLink $right_class, Class $target_class) {
		move_class_attribute_difference ($left_class.<Class>target, $right_class.<Class>target, $target_class)
	}
	
	// Util - move_class_reference_difference (simple)
	private static def void move_class_reference_difference (Class $left_class, Class $right_class, Class $target_class) {
		get_class_reference_difference ($left_class, $right_class)
			.forEach[ $left_reference | move_reference ($left_reference, $target_class) ]
	}
	
	// Util - move_class_reference_difference (mixed)
	private static def void move_class_reference_difference (TraceLink $left_class, TraceLink $right_class, Class $target_class) {
		move_class_reference_difference ($left_class.<Class>target, $right_class.<Class>target, $target_class)
	}
	
	// Util - get_class_attribute_intersection (simple)
	private static def List<Pair<Attribute, Attribute>> get_class_attribute_intersection (Class $left_class, Class $right_class) {
		get_class_attributes ($left_class).map[$left_attribute | 
			val $right_attribute = get_class_attributes ($right_class)
				.findFirst[$right_attribute | get_attribute_name ($right_attribute) == get_attribute_name ($left_attribute) ]
			if ($right_attribute !== null) Pair.of ($left_attribute, $right_attribute)
		].filterNull.toList
	}
	
	// Util - get_class_reference_intersection (simple)
	private static def List<Pair<Reference, Reference>> get_class_reference_intersection (Class $left_class, Class $right_class) {
		get_class_references ($left_class).map[$left_reference | 
			val $right_reference = get_class_references ($right_class)
				.findFirst[$right_reference | get_reference_name ($right_reference) == get_reference_name ($left_reference) ]
			if ($right_reference !== null) Pair.of ($left_reference, $right_reference)
		].filterNull.toList
	}

	// Util - get_class_attribute_difference (simple)
	private static def List<Attribute> get_class_attribute_difference (Class $left_class, Class $right_class) {
		get_class_attributes($left_class).reject[$left_attribute | 
			get_class_attributes($right_class).exists[$right_attribute | 
				get_attribute_name ($right_attribute) == get_attribute_name ($left_attribute)
			]
		].toList
	}
	
	// Util - get_class_reference_difference (simple)
	private static def List<Reference> get_class_reference_difference (Class $left_class, Class $right_class) {
		get_class_references($left_class).reject[$left_reference | 
			get_class_references($right_class).exists[$right_reference | 
				get_reference_name ($right_reference) == get_reference_name ($left_reference)
			]
		].toList
	}
	
	// Util - move_attribute (simple)
	private static def void move_attribute (Attribute $source_attribute, Class $target_class) {
		val $target_attribute = create_class_attribute ($target_class)
		move_attribute_name ($source_attribute, $target_attribute)
		move_attribute_type ($source_attribute, $target_attribute)
		delete_attribute ($source_attribute)
	}
	
	// Util - move_attribute (mixed)
	private static def void move_attribute (TraceLink $source_attribute, Class $target_class) {
		move_attribute ($source_attribute.<Attribute>target, $target_class)	
	}
	
	// Util - move attribute (wrapped)
	private static def void move_attribute (TraceLink $source_attribute, TraceLink $target_class) {
		move_attribute ($source_attribute.<Attribute>target, $target_class.<Class>target)
	}
	
	// Util - move_reference (simple)
	private static def void move_reference (Reference $source_reference, Class $target_class) {
		val $target_reference = create_class_reference ($target_class)
		move_reference_name ($source_reference, $target_reference)
		move_reference_type ($source_reference, $target_reference)
		delete_reference ($source_reference)
	}
	
	// Util - move_reference (wrapped)
	private static def void move_reference (TraceLink $source_reference, Class $target_class) {
		move_reference ($source_reference.<Reference>target, $target_class)
	}
	
	// Util - move_attribute_name
	private static def void move_attribute_name (Attribute $source_attribute, Attribute $target_attribute) {
		val $target_attribute_name = get_attribute_name ($source_attribute)
		set_attribute_name ($target_attribute, $target_attribute_name)	
	} 
	
	// Util - move_reference_name
	private static def void move_reference_name (Reference $source_reference, Reference $target_reference) {
		val $target_reference_name = get_reference_name ($source_reference)
		set_reference_name ($target_reference, $target_reference_name)
	}
	
	// Util - move_attribute_type
	private static def void move_attribute_type (Attribute $source_attribute, Attribute $target_attribute) {
		val $target_attribute_type = get_attribute_type ($source_attribute)
		set_attribute_type ($target_attribute, $target_attribute_type)	
	}
	
	// Util - move_reference_type
	private static def void move_reference_type (Reference $source_reference, Reference $target_reference) {
		val $target_reference_type = get_reference_type ($source_reference)
		set_reference_type ($target_reference, $target_reference_type)
	}
	
	// Util - merge_attribute (simple)
	private static def void merge_attribute (Attribute $left_attribute, Attribute $right_attribute, Class $merged_class) {
		val $merged_attribute = create_class_attribute ($merged_class)
		merge_attribute_name ($left_attribute, $right_attribute, $merged_attribute)
		merge_attribute_type ($left_attribute, $right_attribute, $merged_attribute)
		delete_attribute ($left_attribute)
		delete_attribute ($right_attribute)
	}
	
	// Util - merge_reference (simple)
	private static def void merge_reference (Reference $left_reference, Reference $right_reference, Class $merged_class) {
		val $merged_reference = create_class_reference ($merged_class)
		merge_reference_name ($left_reference, $right_reference, $merged_reference)
		merge_reference_type ($left_reference, $right_reference, $merged_reference)
		delete_reference ($left_reference)
		delete_reference ($right_reference)
	}
	
	// Util - merge reference (wrapped)
	private static def void merge_reference (TraceLink $left_reference, TraceLink $right_reference, TraceLink $class) {
		merge_reference ($left_reference.<Reference>target, $right_reference.<Reference>target, $class.<Class>target)
	}
	
	// Util - merge_attribute_name (simple)
	private static def void merge_attribute_name (Attribute $left_attribute, Attribute $right_attribute, Attribute $merged_attribute) {
		val $left_attribute_name = get_attribute_name ($left_attribute)
		val $right_attribute_name = get_attribute_name ($right_attribute)
		val $merged_attribute_name = if ($left_attribute_name == $right_attribute_name) $left_attribute_name else null
		set_attribute_name ($merged_attribute, $merged_attribute_name)
	}
	
	// Util - merge_reference_name (simple)
	private static def void merge_reference_name (Reference $left_reference, Reference $right_reference, Reference $merged_reference) {
		val $left_reference_name = get_reference_name ($left_reference)
		val $right_reference_name = get_reference_name ($right_reference)
		val $merged_reference_name = if ($left_reference_name == $right_reference_name) $left_reference_name else null
		set_reference_name ($merged_reference, $merged_reference_name)
	}
	
	// Util - merge_attribute_type (simple)
	private static def void merge_attribute_type (Attribute $left_attribute, Attribute $right_attribute, Attribute $merged_attribute) {
		val $left_attribute_type = get_attribute_type ($left_attribute)
		val $right_attribute_type = get_attribute_type ($right_attribute)
		val $merged_attribute_type = if ($left_attribute_type == $right_attribute_type) $left_attribute_type else null
		set_attribute_type ($merged_attribute, $merged_attribute_type)
	}
	
	// Util - merge_reference_type (simple)
	private static def void merge_reference_type (Reference $left_reference, Reference $right_reference, Reference $merged_reference) {
		val $left_reference_type = get_reference_type ($left_reference)
		val $right_reference_type = get_reference_type ($right_reference)
		val $merged_reference_type = get_class_superClass_intersection ($left_reference_type, $right_reference_type)
		set_reference_type ($merged_reference, $merged_reference_type)
	}
	
	// Util - get_class_superClass_intersection (simple)
	private static def Class get_class_superClass_intersection (Class $left_class, Class $right_class) {
		if ($left_class === null || $right_class === null) { return null }
		val $left_class_superClass_distances = get_class_superClass_distances ($left_class)
		val $right_class_superClass_distances = get_class_superClass_distances ($right_class)
		$left_class_superClass_distances.keySet.map[$left_class_superClass | 
			val $right_class_superClass = $right_class_superClass_distances.keySet
				.findFirst[$right_class_superClass | get_class_name ($left_class_superClass) == get_class_name ($right_class_superClass) ]
			if ($right_class_superClass !== null) Pair.of ($left_class_superClass, $right_class_superClass) else null
		].filterNull.minBy[$common_class_superClass | 
			$left_class_superClass_distances.get($common_class_superClass.key) 
			+ $right_class_superClass_distances.get($common_class_superClass.value)
		].key
	}
	
	// Util - get_class_superClass_distances (simple)
	private static def HashMap<Class, Integer> get_class_superClass_distances (Class $class) {
		newHashMap => [$class_superClass_distances | compute_class_superClass_distances ($class, $class_superClass_distances, 0)]
	}
	
	// Util - compute_class_superClass_distances (simple)
	private static def void compute_class_superClass_distances (Class $class, HashMap<Class, Integer> $class_superClass_distances, int $current_distance) {
		val $current_key = $class_superClass_distances.keySet.findFirst [$class_superClass | get_class_name ($class_superClass) == get_class_name ($class)] ?: $class
		val $current_value = $class_superClass_distances.getOrDefault($current_key, $current_distance)
		if ($current_distance < $current_value) $class_superClass_distances.put ($current_key, $current_distance) else $class_superClass_distances.put($current_key, $current_value)
		if (get_class_superClass($class) !== null) compute_class_superClass_distances (get_class_superClass($class), $class_superClass_distances, $current_distance + 1)	
	}
	
}