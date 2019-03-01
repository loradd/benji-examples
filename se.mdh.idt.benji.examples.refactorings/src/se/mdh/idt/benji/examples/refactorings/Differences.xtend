package se.mdh.idt.benji.examples.refactorings

import se.mdh.idt.benji.examples.refactorings.simplecore.Attribute
import se.mdh.idt.benji.examples.refactorings.simplecore.Class
import se.mdh.idt.benji.examples.refactorings.simplecore.DataType
import se.mdh.idt.benji.examples.refactorings.simplecore.Package
import se.mdh.idt.benji.examples.refactorings.simplecore.Reference
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecoreFactory

import static se.mdh.idt.benji.difference.api.DifferenceFactory.difference

import static extension org.eclipse.emf.ecore.util.EcoreUtil.delete
import static extension se.mdh.idt.benji.trace.api.TraceExtensions.initial
import static extension se.mdh.idt.benji.trace.api.TraceExtensions.current

class Differences {
	
	// Factories - SimpleCore
	static extension SimplecoreFactory = SimplecoreFactory.eINSTANCE

	// ACP1 - Rename Package
	public static val renamePackage 
	= difference
		.name("RenamePackage")
		.precondition(RenamePackagePrecondition.instance)
		.action[
			$package.<Package>current.name = '''Renamed«$package.<Package>initial.name»'''
		]
		.postcondition(RenamePackagePostcondition.instance)
	.build
	
	// ACP2 - Rename Package Uri
	public static val renamePackageUri
	= difference
		.name("RenamePackageUri")
		.precondition(RenamePackageUriPrecondition.instance)
		.action[
			$package.<Package>current.uri = '''«$package.<Package>initial.uri»/changed'''
		]
		.postcondition(RenamePackageUriPostcondition.instance)
	.build
	
	// CDPR3 - Delete Package 
	public static val deletePackage
	= difference
		.name("DeletePackage")
		.precondition(DeletePackagePrecondition.instance)
		.action[
			$package.<Package>current.delete(true)
		]
		.postcondition(DeletePackagePostcondition.instance)
	.build
	
	// AAP4 - Add Package
	public static val addPackage
	= difference
		.name("AddPackage")
		.precondition(AddPackagePrecondition.instance)
		.action[
			$container.<Package>current.subpackages += createPackage
		]
		.postcondition(AddPackagePostcondition.instance)
	.build
	
	// AAC5 - Add Class
	public static val addClass
	= difference
		.name("AddClass")
		.precondition(AddClassPrecondition.instance)
		.action[
			$container.<Package>current.classes += createClass
		]
		.postcondition(AddClassPostcondition.instance)
	.build
	
	// ACC6 - Rename Class
	public static val renameClass
	= difference
		.name("RenameClass")
		.precondition(RenameClassPrecondition.instance)
		.action[
			$class.<Class>current.name = '''Renamed«$class.<Class>initial.name»'''
		]
		.postcondition(RenameClassPostcondition.instance)
	.build
	
	// CDCR7 - Delete Class
	public static val deleteClass
	= difference
		.name("DeleteClass")
		.precondition(DeleteClassPrecondition.instance)
		.action[
			$class.<Class>current.delete(true)
		]
		.postcondition(DeleteClassPostcondition.instance)
	.build
	
	// CCAC8 - Extract Class
	public static val extractClass
	= difference
		.name("ExtractClass")
		.precondition(ExtractClassPrecondition.instance)
		.action[
			val attribute_class = createClass
			attribute_class.name = $attribute.<Attribute>initial.name.toFirstUpper
			$package.<Package>current.classes += attribute_class
			val attribute_reference = createReference
			attribute_reference.type = attribute_class
			$class.<Class>current.references += attribute_reference
			$attribute.<Attribute>current.delete(true)
		]
		.postcondition(ExtractClassPostcondition.instance)
	.build
	
	// AAA10 - Add Attribute
	public static val addAttribute
	= difference
		.name("AddAttribute")
		.precondition(AddAttributePrecondition.instance)
		.action[
			$class.<Class>current.attributes += createAttribute
		]
		.postcondition(AddAttributePostcondition.instance)
	.build
	
	// ADA11 - Delete Attribute
	public static val deleteAttribute
	= difference
		.name("DeleteAttribute")
		.precondition(DeleteAttributePrecondition.instance)
		.action[
			$attribute.<Attribute>current.delete(true)
		]
		.postcondition(DeleteAttributePostcondition.instance)
	.build
	
	// ACA12 - Change Attribute Type
	public static val changeAttributeType
	= difference
		.name("ChangeAttributeType")
		.precondition(ChangeAttributeTypePrecondition.instance)
		.action[
			$attribute.<Attribute>current.type = $datatype.<DataType>current
		]
		.postcondition(ChangeAttributeTypePostcondition.instance)
	.build
	
	// AACR13 - Add Reference
	public static val addReference
	= difference
		.name("AddDifference")
		.precondition(AddReferencePrecondition.instance)
		.action[
			$class.<Class>current.references += createReference	
		]
		.postcondition(AddReferencePostcondition.instance)
	.build
	
	// ADCR14 - Delete Reference
	public static val deleteReference
	= difference
		.name("DeleteReference")
		.precondition(DeleteReferencePrecondition.instance)
		.action[
			$reference.<Reference>current.delete(true)
		]
		.postcondition(DeleteReferencePostcondition.instance)
	.build
	
	// ACCR17 - Change Reference Type 
	public static val changeReferenceType
	= difference
		.name("ChangeReferenceType")
		.precondition(ChangeReferenceTypePrecondition.instance)
		.action[
			$reference.<Reference>current.type = $class.<Class>current
		]
		.postcondition(ChangeReferenceTypePostcondition.instance)
	.build
	
	// CADCAR18 - Extract Superclass
	public static val extractSuperclass
	= difference
		.name("ExtractSuperclass")
		.precondition(ExtractSuperclassPrecondition.instance)
		.action[
			val extracted = createClass
			extracted.name = '''Super«$class.<Class>initial.name»'''
			extracted.super += $super.<Class>current
			extracted.attributes += $attribute.<Attribute>current
			extracted.references += $reference.<Reference>current
			$package.<Package>current.classes += extracted
			$class.<Class>current.super += extracted
			$class.<Class>current.super -= $super.<Class>current
			$class.<Class>current.attributes -= $attribute.<Attribute>current
			$class.<Class>current.references -= $reference.<Reference>current
		]
		.postcondition(ExtractSuperclassPostcondition.instance)
	.build
	
	// ACC19 - Change Class Abstract
	public static val changeClassAbstract
	= difference
		.name("ChangeClassAbstract")
		.precondition(ChangeClassAbstractPrecondition.instance)
		.action[
			$class.<Class>current.abstract = !$class.<Class>initial.abstract
		]
		.postcondition(ChangeClassAbstractPostcondition.instance)
	.build
	
	// CDACA22 - Push Down Feature
	public static val pushDownAttribute
	= difference
		.name("Push Down Attribute")
		.precondition(PushDownAttributePrecondition.instance)
		.action[
			$super.<Class>current.attributes -= $attribute.<Attribute>current
			$class.<Class>current.attributes += $attribute.<Attribute>current
		]
		.postcondition(PushDownAttributePostcondition.instance)
	.build
	
}