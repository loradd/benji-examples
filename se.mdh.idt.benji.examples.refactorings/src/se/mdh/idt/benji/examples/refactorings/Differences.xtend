package se.mdh.idt.benji.examples.refactorings

import se.mdh.idt.benji.examples.refactorings.simplecore.Attribute
import se.mdh.idt.benji.examples.refactorings.simplecore.Class
import se.mdh.idt.benji.examples.refactorings.simplecore.DataType
import se.mdh.idt.benji.examples.refactorings.simplecore.Package
import se.mdh.idt.benji.examples.refactorings.simplecore.Reference
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecoreFactory

import static se.mdh.idt.benji.difference.api.DifferenceFactory.difference

import static extension org.eclipse.emf.ecore.util.EcoreUtil.delete

class Differences {
	
	// Factories - SimpleCore
	private static extension SimplecoreFactory = SimplecoreFactory.eINSTANCE

	// ACP1 - Rename Package
	public static val renamePackage = difference.name("RenamePackage")
	.precondition(RenamePackagePrecondition.instance).action[
		val _package = package.current as Package
		_package.name = name
	].postcondition(RenamePackagePostcondition.instance).build

	// ACP2 - Rename URI Package
	public static val renameURIPackage = difference.name("RenameURIPackage")
	.precondition(RenameURIPackagePrecondition.instance).action[
		val _package = package.current as Package
		_package.uri = uri
	].postcondition(RenameURIPackagePostcondition.instance).build
	
	// CDPR3 - Delete Package
	public static val deletePackage = difference.name("DeletePackage")
	.precondition(DeletePackagePrecondition.instance).action[
		val _package = package.current as Package
		_package.delete(true)
	].postcondition(DeletePackagePostcondition.instance).build
	
	// AAP4 - Add Package
	public static val addPackage = difference.name("AddPackage")
	.precondition(AddPackagePrecondition.instance).action[
		val _package = package.current as Package
		val _subPackage = createPackage
		_package.subPackages += _subPackage
	].postcondition(AddPackagePostcondition.instance).build
	
	// AAC5 - Add Class
	public static val addClass = difference.name("AddClass")
	.precondition(AddClassPrecondition.instance).action[
		val _package = package.current as Package
		val _class = createClass
		_class.name = name
		_package.classes += _class
	].postcondition(AddClassPostcondition.instance).build

	// ACC6 - Rename Class
	public static val renameClass = difference.name("RenameClass")
	.precondition(RenameClassPrecondition.instance).action[
		val _class = valueOfClass.current as Class
		_class.name = name
	].postcondition(RenameClassPostcondition.instance).build
	
	// CDCR7 - Delete Class
	public static val deleteClass = difference.name("DeleteClass")
	.precondition(DeleteClassPrecondition.instance).action[
		val _class = valueOfClass.current as Class
		_class.delete(true)
	].postcondition(DeleteClassPostcondition.instance).build

	// CCAC8 - Extract Class
	public static val extractClass = difference.name("ExtractClass")
	.precondition(ExtractClassPrecondition.instance).action[
		val _package = package.current as Package
		val _class = valueOfClass.current as Class
		val _attribute = attribute.current as Attribute
		val _attribute_class = createClass
		_attribute_class.name = attribute_class_name
		_package.classes += _attribute_class
		val _attribute_reference = createReference	
		_attribute_reference.name = attribute_reference_name
		_attribute_reference.type = _attribute_class
		_class.references += _attribute_reference
		_attribute.delete(true)
	].postcondition(ExtractClassPostcondition.instance).build

	// AAA10 - Add Attribute
	public static val addAttribute = difference.name("AddAttribute")
	.precondition(AddAttributePrecondition.instance).action[
		val _class = valueOfClass.current as Class
		val _type = type.current as DataType
		val _attribute = createAttribute
		_attribute.name = name
		_attribute.type = _type
		_class.attributes += _attribute
	].postcondition(AddAttributePostcondition.instance).build
	
	// ADA11 - Delete Attribute
	public static val deleteAttribute = difference.name("DeleteAttribute")
	.precondition(DeleteAttributePrecondition.instance).action[
		val _attribute = attribute.current as Attribute
		_attribute.delete(true)
	].postcondition(DeleteAttributePostcondition.instance).build
	
	// ACA12 - Change Attribute Type
	public static val changeAttributeType = difference.name("ChangeAttributeType")
	.precondition(ChangeAttributeTypePrecondition.instance).action[
		val _attribute = attribute.current as Attribute
		val _type = type.current as DataType
		_attribute.type = _type	
	].postcondition(ChangeAttributeTypePostcondition.instance).build
	
	// AACR13 - Add Reference
	public static val addReference = difference.name("AddReference")
	.precondition(AddReferencePrecondition.instance).action[
		val _class = valueOfClass.current as Class
		val _type = type.current as Class
		val _reference = createReference
		_reference.name = name
		_reference.type = _type
		_class.references += _reference
	].postcondition(AddReferencePostcondition.instance).build
	
	// ADCR14 - Delete Reference
	public static val deleteReference = difference.name("DeleteReference")
	.precondition(DeleteReferencePrecondition.instance).action[
		val _reference = reference.current as Reference
		_reference.delete(true)
	].postcondition(DeleteReferencePostcondition.instance).build
	
	// ACCR17 - Change Reference Type
	public static val changeReferenceType = difference.name("ChangeReferenceType")
	.precondition(ChangeReferenceTypePrecondition.instance).action[
		val _reference = reference.current as Reference
		val _type = type.current as Class 
		_reference.type = _type
	].postcondition(ChangeReferenceTypePostcondition.instance).build

	// CADCAR18 - Extract Superclass
	public static val extractSuperclass = difference.name("ExtractSuperclass")
	.precondition(ExtractSuperclassPrecondition.instance).action[
		val _package = package.current as Package
		val _subClass = subClass.current as Class
		val _superClass = superClass.current as Class
		val _attribute = attribute.current as Attribute
		val _class = createClass
		_class.name = name
		_class.attributes += _attribute
		_class.superClasses += _superClass
		_package.classes += _class
		_subClass.superClasses -= _superClass
		_subClass.superClasses += _class
	].postcondition(ExtractSuperclassPostcondition.instance).build
	
	// ACC19 - Change Class Abstract
	public static val changeClassAbstract = difference.name("ChangeClassAbstract")
	.precondition(ChangeClassAbstractPrecondition.instance).action[
		val _class = valueOfClass.current as Class
		_class.abstract = true
	].postcondition(ChangeClassAbstractPostcondition.instance).build
	
	// CDACA22 - Push Down Feature
	public static val pushDownAttribute = difference.name("PushDownAttribute")
	.precondition(PushDownAttributePrecondition.instance).action[
		val _class = valueOfClass.current as Class
		val _attribute = attribute.current as Attribute
		_class.attributes += _attribute
	].postcondition(PushDownAttributePostcondition.instance).build

}