/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Metamodel.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$created_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$deleted_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$inserted_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_enumeration_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$removed_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_attribute_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_modelElement_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_reference_opposite;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_reference_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_reference_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_structuralFeature_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_structuralFeature_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_structuralFeature_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_structuralFeature_upper;

/**
 * A pattern group formed of all public patterns defined in Metamodel.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Metamodel.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>$modelElement</li>
 * <li>$created_modelElement</li>
 * <li>$deleted_modelElement</li>
 * <li>$initial_modelElement</li>
 * <li>$current_modelElement</li>
 * <li>$modelElement_name</li>
 * <li>$set_modelElement_name</li>
 * <li>$unset_modelElement_name</li>
 * <li>$initial_modelElement_name</li>
 * <li>$current_modelElement_name</li>
 * <li>$classifier</li>
 * <li>$created_classifier</li>
 * <li>$deleted_classifier</li>
 * <li>$initial_classifier</li>
 * <li>$current_classifier</li>
 * <li>$classifier_name</li>
 * <li>$set_classifier_name</li>
 * <li>$unset_classifier_name</li>
 * <li>$initial_classifier_name</li>
 * <li>$current_classifier_name</li>
 * <li>$classifier_package</li>
 * <li>$set_classifier_package</li>
 * <li>$unset_classifier_package</li>
 * <li>$initial_classifier_package</li>
 * <li>$current_classifier_package</li>
 * <li>$package</li>
 * <li>$created_package</li>
 * <li>$deleted_package</li>
 * <li>$initial_package</li>
 * <li>$current_package</li>
 * <li>$package_name</li>
 * <li>$set_package_name</li>
 * <li>$unset_package_name</li>
 * <li>$initial_package_name</li>
 * <li>$current_package_name</li>
 * <li>$package_superPackage</li>
 * <li>$set_package_superPackage</li>
 * <li>$unset_package_superPackage</li>
 * <li>$initial_package_superPackage</li>
 * <li>$current_package_superPackage</li>
 * <li>$package_uri</li>
 * <li>$set_package_uri</li>
 * <li>$unset_package_uri</li>
 * <li>$initial_package_uri</li>
 * <li>$current_package_uri</li>
 * <li>$package_classifier</li>
 * <li>$inserted_package_classifier</li>
 * <li>$removed_package_classifier</li>
 * <li>$initial_package_classifier</li>
 * <li>$current_package_classifier</li>
 * <li>$package_subPackage</li>
 * <li>$inserted_package_subPackage</li>
 * <li>$removed_package_subPackage</li>
 * <li>$initial_package_subPackage</li>
 * <li>$current_package_subPackage</li>
 * <li>$package_class</li>
 * <li>$inserted_package_class</li>
 * <li>$removed_package_class</li>
 * <li>$initial_package_class</li>
 * <li>$current_package_class</li>
 * <li>$package_datatype</li>
 * <li>$inserted_package_datatype</li>
 * <li>$removed_package_datatype</li>
 * <li>$initial_package_datatype</li>
 * <li>$current_package_datatype</li>
 * <li>$package_enumeration</li>
 * <li>$inserted_package_enumeration</li>
 * <li>$removed_package_enumeration</li>
 * <li>$initial_package_enumeration</li>
 * <li>$current_package_enumeration</li>
 * <li>$class</li>
 * <li>$created_class</li>
 * <li>$deleted_class</li>
 * <li>$initial_class</li>
 * <li>$current_class</li>
 * <li>$class_name</li>
 * <li>$set_class_name</li>
 * <li>$unset_class_name</li>
 * <li>$initial_class_name</li>
 * <li>$current_class_name</li>
 * <li>$class_package</li>
 * <li>$set_class_package</li>
 * <li>$unset_class_package</li>
 * <li>$initial_class_package</li>
 * <li>$current_class_package</li>
 * <li>$class_abstract</li>
 * <li>$set_class_abstract</li>
 * <li>$unset_class_abstract</li>
 * <li>$initial_class_abstract</li>
 * <li>$current_class_abstract</li>
 * <li>$class_superClass</li>
 * <li>$set_class_superClass</li>
 * <li>$unset_class_superClass</li>
 * <li>$initial_class_superClass</li>
 * <li>$current_class_superClass</li>
 * <li>$class_subClass</li>
 * <li>$inserted_class_subClass</li>
 * <li>$removed_class_subClass</li>
 * <li>$initial_class_subClass</li>
 * <li>$current_class_subClass</li>
 * <li>$class_structuralFeature</li>
 * <li>$inserted_class_structuralFeature</li>
 * <li>$removed_class_structuralFeature</li>
 * <li>$initial_class_structuralFeature</li>
 * <li>$current_class_structuralFeature</li>
 * <li>$class_attribute</li>
 * <li>$inserted_class_attribute</li>
 * <li>$removed_class_attribute</li>
 * <li>$initial_class_attribute</li>
 * <li>$current_class_attribute</li>
 * <li>$class_reference</li>
 * <li>$inserted_class_reference</li>
 * <li>$removed_class_reference</li>
 * <li>$initial_class_reference</li>
 * <li>$current_class_reference</li>
 * <li>$datatype</li>
 * <li>$created_datatype</li>
 * <li>$deleted_datatype</li>
 * <li>$initial_datatype</li>
 * <li>$current_datatype</li>
 * <li>$datatype_name</li>
 * <li>$set_datatype_name</li>
 * <li>$unset_datatype_name</li>
 * <li>$initial_datatype_name</li>
 * <li>$current_datatype_name</li>
 * <li>$datatype_package</li>
 * <li>$set_datatype_package</li>
 * <li>$unset_datatype_package</li>
 * <li>$initial_datatype_package</li>
 * <li>$current_datatype_package</li>
 * <li>$enumeration</li>
 * <li>$created_enumeration</li>
 * <li>$deleted_enumeration</li>
 * <li>$initial_enumeration</li>
 * <li>$current_enumeration</li>
 * <li>$enumeration_name</li>
 * <li>$set_enumeration_name</li>
 * <li>$unset_enumeration_name</li>
 * <li>$initial_enumeration_name</li>
 * <li>$current_enumeration_name</li>
 * <li>$enumeration_package</li>
 * <li>$set_enumeration_package</li>
 * <li>$unset_enumeration_package</li>
 * <li>$initial_enumeration_package</li>
 * <li>$current_enumeration_package</li>
 * <li>$enumeration_enumerationLiteral</li>
 * <li>$inserted_enumeration_enumerationLiteral</li>
 * <li>$removed_enumeration_enumerationLiteral</li>
 * <li>$initial_enumeration_enumerationLiteral</li>
 * <li>$current_enumeration_enumerationLiteral</li>
 * <li>$enumerationLiteral</li>
 * <li>$created_enumerationLiteral</li>
 * <li>$deleted_enumerationLiteral</li>
 * <li>$initial_enumerationLiteral</li>
 * <li>$current_enumerationLiteral</li>
 * <li>$enumerationLiteral_name</li>
 * <li>$set_enumerationLiteral_name</li>
 * <li>$unset_enumerationLiteral_name</li>
 * <li>$initial_enumerationLiteral_name</li>
 * <li>$current_enumerationLiteral_name</li>
 * <li>$enumerationLiteral_enumeration</li>
 * <li>$set_enumerationLiteral_enumeration</li>
 * <li>$unset_enumerationLiteral_enumeration</li>
 * <li>$initial_enumerationLiteral_enumeration</li>
 * <li>$current_enumerationLiteral_enumeration</li>
 * <li>$structuralFeature</li>
 * <li>$created_structuralFeature</li>
 * <li>$deleted_structuralFeature</li>
 * <li>$initial_structuralFeature</li>
 * <li>$current_structuralFeature</li>
 * <li>$structuralFeature_name</li>
 * <li>$set_structuralFeature_name</li>
 * <li>$unset_structuralFeature_name</li>
 * <li>$initial_structuralFeature_name</li>
 * <li>$current_structuralFeature_name</li>
 * <li>$structuralFeature_owner</li>
 * <li>$set_structuralFeature_owner</li>
 * <li>$unset_structuralFeature_owner</li>
 * <li>$initial_structuralFeature_owner</li>
 * <li>$current_structuralFeature_owner</li>
 * <li>$structuralFeature_lower</li>
 * <li>$set_structuralFeature_lower</li>
 * <li>$unset_structuralFeature_lower</li>
 * <li>$initial_structuralFeature_lower</li>
 * <li>$current_structuralFeature_lower</li>
 * <li>$structuralFeature_upper</li>
 * <li>$set_structuralFeature_upper</li>
 * <li>$unset_structuralFeature_upper</li>
 * <li>$initial_structuralFeature_upper</li>
 * <li>$current_structuralFeature_upper</li>
 * <li>$attribute</li>
 * <li>$created_attribute</li>
 * <li>$deleted_attribute</li>
 * <li>$initial_attribute</li>
 * <li>$current_attribute</li>
 * <li>$attribute_name</li>
 * <li>$set_attribute_name</li>
 * <li>$unset_attribute_name</li>
 * <li>$initial_attribute_name</li>
 * <li>$current_attribute_name</li>
 * <li>$attribute_owner</li>
 * <li>$set_attribute_owner</li>
 * <li>$unset_attribute_owner</li>
 * <li>$initial_attribute_owner</li>
 * <li>$current_attribute_owner</li>
 * <li>$attribute_lower</li>
 * <li>$set_attribute_lower</li>
 * <li>$unset_attribute_lower</li>
 * <li>$initial_attribute_lower</li>
 * <li>$current_attribute_lower</li>
 * <li>$attribute_upper</li>
 * <li>$set_attribute_upper</li>
 * <li>$unset_attribute_upper</li>
 * <li>$initial_attribute_upper</li>
 * <li>$current_attribute_upper</li>
 * <li>$attribute_type</li>
 * <li>$set_attribute_type</li>
 * <li>$unset_attribute_type</li>
 * <li>$initial_attribute_type</li>
 * <li>$current_attribute_type</li>
 * <li>$reference</li>
 * <li>$created_reference</li>
 * <li>$deleted_reference</li>
 * <li>$initial_reference</li>
 * <li>$current_reference</li>
 * <li>$reference_name</li>
 * <li>$set_reference_name</li>
 * <li>$unset_reference_name</li>
 * <li>$initial_reference_name</li>
 * <li>$current_reference_name</li>
 * <li>$reference_owner</li>
 * <li>$set_reference_owner</li>
 * <li>$unset_reference_owner</li>
 * <li>$initial_reference_owner</li>
 * <li>$current_reference_owner</li>
 * <li>$reference_lower</li>
 * <li>$set_reference_lower</li>
 * <li>$unset_reference_lower</li>
 * <li>$initial_reference_lower</li>
 * <li>$current_reference_lower</li>
 * <li>$reference_upper</li>
 * <li>$set_reference_upper</li>
 * <li>$unset_reference_upper</li>
 * <li>$initial_reference_upper</li>
 * <li>$current_reference_upper</li>
 * <li>$reference_containment</li>
 * <li>$set_reference_containment</li>
 * <li>$unset_reference_containment</li>
 * <li>$initial_reference_containment</li>
 * <li>$current_reference_containment</li>
 * <li>$reference_opposite</li>
 * <li>$set_reference_opposite</li>
 * <li>$unset_reference_opposite</li>
 * <li>$initial_reference_opposite</li>
 * <li>$current_reference_opposite</li>
 * <li>$reference_type</li>
 * <li>$set_reference_type</li>
 * <li>$unset_reference_type</li>
 * <li>$initial_reference_type</li>
 * <li>$current_reference_type</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class Metamodel extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Metamodel instance() {
    if (INSTANCE == null) {
        INSTANCE = new Metamodel();
    }
    return INSTANCE;
  }
  
  private static Metamodel INSTANCE;
  
  private Metamodel() {
    querySpecifications.add($modelElement.instance());
    querySpecifications.add($created_modelElement.instance());
    querySpecifications.add($deleted_modelElement.instance());
    querySpecifications.add($initial_modelElement.instance());
    querySpecifications.add($current_modelElement.instance());
    querySpecifications.add($modelElement_name.instance());
    querySpecifications.add($set_modelElement_name.instance());
    querySpecifications.add($unset_modelElement_name.instance());
    querySpecifications.add($initial_modelElement_name.instance());
    querySpecifications.add($current_modelElement_name.instance());
    querySpecifications.add($classifier.instance());
    querySpecifications.add($created_classifier.instance());
    querySpecifications.add($deleted_classifier.instance());
    querySpecifications.add($initial_classifier.instance());
    querySpecifications.add($current_classifier.instance());
    querySpecifications.add($classifier_name.instance());
    querySpecifications.add($set_classifier_name.instance());
    querySpecifications.add($unset_classifier_name.instance());
    querySpecifications.add($initial_classifier_name.instance());
    querySpecifications.add($current_classifier_name.instance());
    querySpecifications.add($classifier_package.instance());
    querySpecifications.add($set_classifier_package.instance());
    querySpecifications.add($unset_classifier_package.instance());
    querySpecifications.add($initial_classifier_package.instance());
    querySpecifications.add($current_classifier_package.instance());
    querySpecifications.add($package.instance());
    querySpecifications.add($created_package.instance());
    querySpecifications.add($deleted_package.instance());
    querySpecifications.add($initial_package.instance());
    querySpecifications.add($current_package.instance());
    querySpecifications.add($package_name.instance());
    querySpecifications.add($set_package_name.instance());
    querySpecifications.add($unset_package_name.instance());
    querySpecifications.add($initial_package_name.instance());
    querySpecifications.add($current_package_name.instance());
    querySpecifications.add($package_superPackage.instance());
    querySpecifications.add($set_package_superPackage.instance());
    querySpecifications.add($unset_package_superPackage.instance());
    querySpecifications.add($initial_package_superPackage.instance());
    querySpecifications.add($current_package_superPackage.instance());
    querySpecifications.add($package_uri.instance());
    querySpecifications.add($set_package_uri.instance());
    querySpecifications.add($unset_package_uri.instance());
    querySpecifications.add($initial_package_uri.instance());
    querySpecifications.add($current_package_uri.instance());
    querySpecifications.add($package_classifier.instance());
    querySpecifications.add($inserted_package_classifier.instance());
    querySpecifications.add($removed_package_classifier.instance());
    querySpecifications.add($initial_package_classifier.instance());
    querySpecifications.add($current_package_classifier.instance());
    querySpecifications.add($package_subPackage.instance());
    querySpecifications.add($inserted_package_subPackage.instance());
    querySpecifications.add($removed_package_subPackage.instance());
    querySpecifications.add($initial_package_subPackage.instance());
    querySpecifications.add($current_package_subPackage.instance());
    querySpecifications.add($package_class.instance());
    querySpecifications.add($inserted_package_class.instance());
    querySpecifications.add($removed_package_class.instance());
    querySpecifications.add($initial_package_class.instance());
    querySpecifications.add($current_package_class.instance());
    querySpecifications.add($package_datatype.instance());
    querySpecifications.add($inserted_package_datatype.instance());
    querySpecifications.add($removed_package_datatype.instance());
    querySpecifications.add($initial_package_datatype.instance());
    querySpecifications.add($current_package_datatype.instance());
    querySpecifications.add($package_enumeration.instance());
    querySpecifications.add($inserted_package_enumeration.instance());
    querySpecifications.add($removed_package_enumeration.instance());
    querySpecifications.add($initial_package_enumeration.instance());
    querySpecifications.add($current_package_enumeration.instance());
    querySpecifications.add($class.instance());
    querySpecifications.add($created_class.instance());
    querySpecifications.add($deleted_class.instance());
    querySpecifications.add($initial_class.instance());
    querySpecifications.add($current_class.instance());
    querySpecifications.add($class_name.instance());
    querySpecifications.add($set_class_name.instance());
    querySpecifications.add($unset_class_name.instance());
    querySpecifications.add($initial_class_name.instance());
    querySpecifications.add($current_class_name.instance());
    querySpecifications.add($class_package.instance());
    querySpecifications.add($set_class_package.instance());
    querySpecifications.add($unset_class_package.instance());
    querySpecifications.add($initial_class_package.instance());
    querySpecifications.add($current_class_package.instance());
    querySpecifications.add($class_abstract.instance());
    querySpecifications.add($set_class_abstract.instance());
    querySpecifications.add($unset_class_abstract.instance());
    querySpecifications.add($initial_class_abstract.instance());
    querySpecifications.add($current_class_abstract.instance());
    querySpecifications.add($class_superClass.instance());
    querySpecifications.add($set_class_superClass.instance());
    querySpecifications.add($unset_class_superClass.instance());
    querySpecifications.add($initial_class_superClass.instance());
    querySpecifications.add($current_class_superClass.instance());
    querySpecifications.add($class_subClass.instance());
    querySpecifications.add($inserted_class_subClass.instance());
    querySpecifications.add($removed_class_subClass.instance());
    querySpecifications.add($initial_class_subClass.instance());
    querySpecifications.add($current_class_subClass.instance());
    querySpecifications.add($class_structuralFeature.instance());
    querySpecifications.add($inserted_class_structuralFeature.instance());
    querySpecifications.add($removed_class_structuralFeature.instance());
    querySpecifications.add($initial_class_structuralFeature.instance());
    querySpecifications.add($current_class_structuralFeature.instance());
    querySpecifications.add($class_attribute.instance());
    querySpecifications.add($inserted_class_attribute.instance());
    querySpecifications.add($removed_class_attribute.instance());
    querySpecifications.add($initial_class_attribute.instance());
    querySpecifications.add($current_class_attribute.instance());
    querySpecifications.add($class_reference.instance());
    querySpecifications.add($inserted_class_reference.instance());
    querySpecifications.add($removed_class_reference.instance());
    querySpecifications.add($initial_class_reference.instance());
    querySpecifications.add($current_class_reference.instance());
    querySpecifications.add($datatype.instance());
    querySpecifications.add($created_datatype.instance());
    querySpecifications.add($deleted_datatype.instance());
    querySpecifications.add($initial_datatype.instance());
    querySpecifications.add($current_datatype.instance());
    querySpecifications.add($datatype_name.instance());
    querySpecifications.add($set_datatype_name.instance());
    querySpecifications.add($unset_datatype_name.instance());
    querySpecifications.add($initial_datatype_name.instance());
    querySpecifications.add($current_datatype_name.instance());
    querySpecifications.add($datatype_package.instance());
    querySpecifications.add($set_datatype_package.instance());
    querySpecifications.add($unset_datatype_package.instance());
    querySpecifications.add($initial_datatype_package.instance());
    querySpecifications.add($current_datatype_package.instance());
    querySpecifications.add($enumeration.instance());
    querySpecifications.add($created_enumeration.instance());
    querySpecifications.add($deleted_enumeration.instance());
    querySpecifications.add($initial_enumeration.instance());
    querySpecifications.add($current_enumeration.instance());
    querySpecifications.add($enumeration_name.instance());
    querySpecifications.add($set_enumeration_name.instance());
    querySpecifications.add($unset_enumeration_name.instance());
    querySpecifications.add($initial_enumeration_name.instance());
    querySpecifications.add($current_enumeration_name.instance());
    querySpecifications.add($enumeration_package.instance());
    querySpecifications.add($set_enumeration_package.instance());
    querySpecifications.add($unset_enumeration_package.instance());
    querySpecifications.add($initial_enumeration_package.instance());
    querySpecifications.add($current_enumeration_package.instance());
    querySpecifications.add($enumeration_enumerationLiteral.instance());
    querySpecifications.add($inserted_enumeration_enumerationLiteral.instance());
    querySpecifications.add($removed_enumeration_enumerationLiteral.instance());
    querySpecifications.add($initial_enumeration_enumerationLiteral.instance());
    querySpecifications.add($current_enumeration_enumerationLiteral.instance());
    querySpecifications.add($enumerationLiteral.instance());
    querySpecifications.add($created_enumerationLiteral.instance());
    querySpecifications.add($deleted_enumerationLiteral.instance());
    querySpecifications.add($initial_enumerationLiteral.instance());
    querySpecifications.add($current_enumerationLiteral.instance());
    querySpecifications.add($enumerationLiteral_name.instance());
    querySpecifications.add($set_enumerationLiteral_name.instance());
    querySpecifications.add($unset_enumerationLiteral_name.instance());
    querySpecifications.add($initial_enumerationLiteral_name.instance());
    querySpecifications.add($current_enumerationLiteral_name.instance());
    querySpecifications.add($enumerationLiteral_enumeration.instance());
    querySpecifications.add($set_enumerationLiteral_enumeration.instance());
    querySpecifications.add($unset_enumerationLiteral_enumeration.instance());
    querySpecifications.add($initial_enumerationLiteral_enumeration.instance());
    querySpecifications.add($current_enumerationLiteral_enumeration.instance());
    querySpecifications.add($structuralFeature.instance());
    querySpecifications.add($created_structuralFeature.instance());
    querySpecifications.add($deleted_structuralFeature.instance());
    querySpecifications.add($initial_structuralFeature.instance());
    querySpecifications.add($current_structuralFeature.instance());
    querySpecifications.add($structuralFeature_name.instance());
    querySpecifications.add($set_structuralFeature_name.instance());
    querySpecifications.add($unset_structuralFeature_name.instance());
    querySpecifications.add($initial_structuralFeature_name.instance());
    querySpecifications.add($current_structuralFeature_name.instance());
    querySpecifications.add($structuralFeature_owner.instance());
    querySpecifications.add($set_structuralFeature_owner.instance());
    querySpecifications.add($unset_structuralFeature_owner.instance());
    querySpecifications.add($initial_structuralFeature_owner.instance());
    querySpecifications.add($current_structuralFeature_owner.instance());
    querySpecifications.add($structuralFeature_lower.instance());
    querySpecifications.add($set_structuralFeature_lower.instance());
    querySpecifications.add($unset_structuralFeature_lower.instance());
    querySpecifications.add($initial_structuralFeature_lower.instance());
    querySpecifications.add($current_structuralFeature_lower.instance());
    querySpecifications.add($structuralFeature_upper.instance());
    querySpecifications.add($set_structuralFeature_upper.instance());
    querySpecifications.add($unset_structuralFeature_upper.instance());
    querySpecifications.add($initial_structuralFeature_upper.instance());
    querySpecifications.add($current_structuralFeature_upper.instance());
    querySpecifications.add($attribute.instance());
    querySpecifications.add($created_attribute.instance());
    querySpecifications.add($deleted_attribute.instance());
    querySpecifications.add($initial_attribute.instance());
    querySpecifications.add($current_attribute.instance());
    querySpecifications.add($attribute_name.instance());
    querySpecifications.add($set_attribute_name.instance());
    querySpecifications.add($unset_attribute_name.instance());
    querySpecifications.add($initial_attribute_name.instance());
    querySpecifications.add($current_attribute_name.instance());
    querySpecifications.add($attribute_owner.instance());
    querySpecifications.add($set_attribute_owner.instance());
    querySpecifications.add($unset_attribute_owner.instance());
    querySpecifications.add($initial_attribute_owner.instance());
    querySpecifications.add($current_attribute_owner.instance());
    querySpecifications.add($attribute_lower.instance());
    querySpecifications.add($set_attribute_lower.instance());
    querySpecifications.add($unset_attribute_lower.instance());
    querySpecifications.add($initial_attribute_lower.instance());
    querySpecifications.add($current_attribute_lower.instance());
    querySpecifications.add($attribute_upper.instance());
    querySpecifications.add($set_attribute_upper.instance());
    querySpecifications.add($unset_attribute_upper.instance());
    querySpecifications.add($initial_attribute_upper.instance());
    querySpecifications.add($current_attribute_upper.instance());
    querySpecifications.add($attribute_type.instance());
    querySpecifications.add($set_attribute_type.instance());
    querySpecifications.add($unset_attribute_type.instance());
    querySpecifications.add($initial_attribute_type.instance());
    querySpecifications.add($current_attribute_type.instance());
    querySpecifications.add($reference.instance());
    querySpecifications.add($created_reference.instance());
    querySpecifications.add($deleted_reference.instance());
    querySpecifications.add($initial_reference.instance());
    querySpecifications.add($current_reference.instance());
    querySpecifications.add($reference_name.instance());
    querySpecifications.add($set_reference_name.instance());
    querySpecifications.add($unset_reference_name.instance());
    querySpecifications.add($initial_reference_name.instance());
    querySpecifications.add($current_reference_name.instance());
    querySpecifications.add($reference_owner.instance());
    querySpecifications.add($set_reference_owner.instance());
    querySpecifications.add($unset_reference_owner.instance());
    querySpecifications.add($initial_reference_owner.instance());
    querySpecifications.add($current_reference_owner.instance());
    querySpecifications.add($reference_lower.instance());
    querySpecifications.add($set_reference_lower.instance());
    querySpecifications.add($unset_reference_lower.instance());
    querySpecifications.add($initial_reference_lower.instance());
    querySpecifications.add($current_reference_lower.instance());
    querySpecifications.add($reference_upper.instance());
    querySpecifications.add($set_reference_upper.instance());
    querySpecifications.add($unset_reference_upper.instance());
    querySpecifications.add($initial_reference_upper.instance());
    querySpecifications.add($current_reference_upper.instance());
    querySpecifications.add($reference_containment.instance());
    querySpecifications.add($set_reference_containment.instance());
    querySpecifications.add($unset_reference_containment.instance());
    querySpecifications.add($initial_reference_containment.instance());
    querySpecifications.add($current_reference_containment.instance());
    querySpecifications.add($reference_opposite.instance());
    querySpecifications.add($set_reference_opposite.instance());
    querySpecifications.add($unset_reference_opposite.instance());
    querySpecifications.add($initial_reference_opposite.instance());
    querySpecifications.add($current_reference_opposite.instance());
    querySpecifications.add($reference_type.instance());
    querySpecifications.add($set_reference_type.instance());
    querySpecifications.add($unset_reference_type.instance());
    querySpecifications.add($initial_reference_type.instance());
    querySpecifications.add($current_reference_type.instance());
  }
  
  public $modelElement get$modelElement() {
    return $modelElement.instance();
  }
  
  public $modelElement.Matcher get$modelElement(final ViatraQueryEngine engine) {
    return $modelElement.Matcher.on(engine);
  }
  
  public $created_modelElement get$created_modelElement() {
    return $created_modelElement.instance();
  }
  
  public $created_modelElement.Matcher get$created_modelElement(final ViatraQueryEngine engine) {
    return $created_modelElement.Matcher.on(engine);
  }
  
  public $deleted_modelElement get$deleted_modelElement() {
    return $deleted_modelElement.instance();
  }
  
  public $deleted_modelElement.Matcher get$deleted_modelElement(final ViatraQueryEngine engine) {
    return $deleted_modelElement.Matcher.on(engine);
  }
  
  public $initial_modelElement get$initial_modelElement() {
    return $initial_modelElement.instance();
  }
  
  public $initial_modelElement.Matcher get$initial_modelElement(final ViatraQueryEngine engine) {
    return $initial_modelElement.Matcher.on(engine);
  }
  
  public $current_modelElement get$current_modelElement() {
    return $current_modelElement.instance();
  }
  
  public $current_modelElement.Matcher get$current_modelElement(final ViatraQueryEngine engine) {
    return $current_modelElement.Matcher.on(engine);
  }
  
  public $modelElement_name get$modelElement_name() {
    return $modelElement_name.instance();
  }
  
  public $modelElement_name.Matcher get$modelElement_name(final ViatraQueryEngine engine) {
    return $modelElement_name.Matcher.on(engine);
  }
  
  public $set_modelElement_name get$set_modelElement_name() {
    return $set_modelElement_name.instance();
  }
  
  public $set_modelElement_name.Matcher get$set_modelElement_name(final ViatraQueryEngine engine) {
    return $set_modelElement_name.Matcher.on(engine);
  }
  
  public $unset_modelElement_name get$unset_modelElement_name() {
    return $unset_modelElement_name.instance();
  }
  
  public $unset_modelElement_name.Matcher get$unset_modelElement_name(final ViatraQueryEngine engine) {
    return $unset_modelElement_name.Matcher.on(engine);
  }
  
  public $initial_modelElement_name get$initial_modelElement_name() {
    return $initial_modelElement_name.instance();
  }
  
  public $initial_modelElement_name.Matcher get$initial_modelElement_name(final ViatraQueryEngine engine) {
    return $initial_modelElement_name.Matcher.on(engine);
  }
  
  public $current_modelElement_name get$current_modelElement_name() {
    return $current_modelElement_name.instance();
  }
  
  public $current_modelElement_name.Matcher get$current_modelElement_name(final ViatraQueryEngine engine) {
    return $current_modelElement_name.Matcher.on(engine);
  }
  
  public $classifier get$classifier() {
    return $classifier.instance();
  }
  
  public $classifier.Matcher get$classifier(final ViatraQueryEngine engine) {
    return $classifier.Matcher.on(engine);
  }
  
  public $created_classifier get$created_classifier() {
    return $created_classifier.instance();
  }
  
  public $created_classifier.Matcher get$created_classifier(final ViatraQueryEngine engine) {
    return $created_classifier.Matcher.on(engine);
  }
  
  public $deleted_classifier get$deleted_classifier() {
    return $deleted_classifier.instance();
  }
  
  public $deleted_classifier.Matcher get$deleted_classifier(final ViatraQueryEngine engine) {
    return $deleted_classifier.Matcher.on(engine);
  }
  
  public $initial_classifier get$initial_classifier() {
    return $initial_classifier.instance();
  }
  
  public $initial_classifier.Matcher get$initial_classifier(final ViatraQueryEngine engine) {
    return $initial_classifier.Matcher.on(engine);
  }
  
  public $current_classifier get$current_classifier() {
    return $current_classifier.instance();
  }
  
  public $current_classifier.Matcher get$current_classifier(final ViatraQueryEngine engine) {
    return $current_classifier.Matcher.on(engine);
  }
  
  public $classifier_name get$classifier_name() {
    return $classifier_name.instance();
  }
  
  public $classifier_name.Matcher get$classifier_name(final ViatraQueryEngine engine) {
    return $classifier_name.Matcher.on(engine);
  }
  
  public $set_classifier_name get$set_classifier_name() {
    return $set_classifier_name.instance();
  }
  
  public $set_classifier_name.Matcher get$set_classifier_name(final ViatraQueryEngine engine) {
    return $set_classifier_name.Matcher.on(engine);
  }
  
  public $unset_classifier_name get$unset_classifier_name() {
    return $unset_classifier_name.instance();
  }
  
  public $unset_classifier_name.Matcher get$unset_classifier_name(final ViatraQueryEngine engine) {
    return $unset_classifier_name.Matcher.on(engine);
  }
  
  public $initial_classifier_name get$initial_classifier_name() {
    return $initial_classifier_name.instance();
  }
  
  public $initial_classifier_name.Matcher get$initial_classifier_name(final ViatraQueryEngine engine) {
    return $initial_classifier_name.Matcher.on(engine);
  }
  
  public $current_classifier_name get$current_classifier_name() {
    return $current_classifier_name.instance();
  }
  
  public $current_classifier_name.Matcher get$current_classifier_name(final ViatraQueryEngine engine) {
    return $current_classifier_name.Matcher.on(engine);
  }
  
  public $classifier_package get$classifier_package() {
    return $classifier_package.instance();
  }
  
  public $classifier_package.Matcher get$classifier_package(final ViatraQueryEngine engine) {
    return $classifier_package.Matcher.on(engine);
  }
  
  public $set_classifier_package get$set_classifier_package() {
    return $set_classifier_package.instance();
  }
  
  public $set_classifier_package.Matcher get$set_classifier_package(final ViatraQueryEngine engine) {
    return $set_classifier_package.Matcher.on(engine);
  }
  
  public $unset_classifier_package get$unset_classifier_package() {
    return $unset_classifier_package.instance();
  }
  
  public $unset_classifier_package.Matcher get$unset_classifier_package(final ViatraQueryEngine engine) {
    return $unset_classifier_package.Matcher.on(engine);
  }
  
  public $initial_classifier_package get$initial_classifier_package() {
    return $initial_classifier_package.instance();
  }
  
  public $initial_classifier_package.Matcher get$initial_classifier_package(final ViatraQueryEngine engine) {
    return $initial_classifier_package.Matcher.on(engine);
  }
  
  public $current_classifier_package get$current_classifier_package() {
    return $current_classifier_package.instance();
  }
  
  public $current_classifier_package.Matcher get$current_classifier_package(final ViatraQueryEngine engine) {
    return $current_classifier_package.Matcher.on(engine);
  }
  
  public $package get$package() {
    return $package.instance();
  }
  
  public $package.Matcher get$package(final ViatraQueryEngine engine) {
    return $package.Matcher.on(engine);
  }
  
  public $created_package get$created_package() {
    return $created_package.instance();
  }
  
  public $created_package.Matcher get$created_package(final ViatraQueryEngine engine) {
    return $created_package.Matcher.on(engine);
  }
  
  public $deleted_package get$deleted_package() {
    return $deleted_package.instance();
  }
  
  public $deleted_package.Matcher get$deleted_package(final ViatraQueryEngine engine) {
    return $deleted_package.Matcher.on(engine);
  }
  
  public $initial_package get$initial_package() {
    return $initial_package.instance();
  }
  
  public $initial_package.Matcher get$initial_package(final ViatraQueryEngine engine) {
    return $initial_package.Matcher.on(engine);
  }
  
  public $current_package get$current_package() {
    return $current_package.instance();
  }
  
  public $current_package.Matcher get$current_package(final ViatraQueryEngine engine) {
    return $current_package.Matcher.on(engine);
  }
  
  public $package_name get$package_name() {
    return $package_name.instance();
  }
  
  public $package_name.Matcher get$package_name(final ViatraQueryEngine engine) {
    return $package_name.Matcher.on(engine);
  }
  
  public $set_package_name get$set_package_name() {
    return $set_package_name.instance();
  }
  
  public $set_package_name.Matcher get$set_package_name(final ViatraQueryEngine engine) {
    return $set_package_name.Matcher.on(engine);
  }
  
  public $unset_package_name get$unset_package_name() {
    return $unset_package_name.instance();
  }
  
  public $unset_package_name.Matcher get$unset_package_name(final ViatraQueryEngine engine) {
    return $unset_package_name.Matcher.on(engine);
  }
  
  public $initial_package_name get$initial_package_name() {
    return $initial_package_name.instance();
  }
  
  public $initial_package_name.Matcher get$initial_package_name(final ViatraQueryEngine engine) {
    return $initial_package_name.Matcher.on(engine);
  }
  
  public $current_package_name get$current_package_name() {
    return $current_package_name.instance();
  }
  
  public $current_package_name.Matcher get$current_package_name(final ViatraQueryEngine engine) {
    return $current_package_name.Matcher.on(engine);
  }
  
  public $package_superPackage get$package_superPackage() {
    return $package_superPackage.instance();
  }
  
  public $package_superPackage.Matcher get$package_superPackage(final ViatraQueryEngine engine) {
    return $package_superPackage.Matcher.on(engine);
  }
  
  public $set_package_superPackage get$set_package_superPackage() {
    return $set_package_superPackage.instance();
  }
  
  public $set_package_superPackage.Matcher get$set_package_superPackage(final ViatraQueryEngine engine) {
    return $set_package_superPackage.Matcher.on(engine);
  }
  
  public $unset_package_superPackage get$unset_package_superPackage() {
    return $unset_package_superPackage.instance();
  }
  
  public $unset_package_superPackage.Matcher get$unset_package_superPackage(final ViatraQueryEngine engine) {
    return $unset_package_superPackage.Matcher.on(engine);
  }
  
  public $initial_package_superPackage get$initial_package_superPackage() {
    return $initial_package_superPackage.instance();
  }
  
  public $initial_package_superPackage.Matcher get$initial_package_superPackage(final ViatraQueryEngine engine) {
    return $initial_package_superPackage.Matcher.on(engine);
  }
  
  public $current_package_superPackage get$current_package_superPackage() {
    return $current_package_superPackage.instance();
  }
  
  public $current_package_superPackage.Matcher get$current_package_superPackage(final ViatraQueryEngine engine) {
    return $current_package_superPackage.Matcher.on(engine);
  }
  
  public $package_uri get$package_uri() {
    return $package_uri.instance();
  }
  
  public $package_uri.Matcher get$package_uri(final ViatraQueryEngine engine) {
    return $package_uri.Matcher.on(engine);
  }
  
  public $set_package_uri get$set_package_uri() {
    return $set_package_uri.instance();
  }
  
  public $set_package_uri.Matcher get$set_package_uri(final ViatraQueryEngine engine) {
    return $set_package_uri.Matcher.on(engine);
  }
  
  public $unset_package_uri get$unset_package_uri() {
    return $unset_package_uri.instance();
  }
  
  public $unset_package_uri.Matcher get$unset_package_uri(final ViatraQueryEngine engine) {
    return $unset_package_uri.Matcher.on(engine);
  }
  
  public $initial_package_uri get$initial_package_uri() {
    return $initial_package_uri.instance();
  }
  
  public $initial_package_uri.Matcher get$initial_package_uri(final ViatraQueryEngine engine) {
    return $initial_package_uri.Matcher.on(engine);
  }
  
  public $current_package_uri get$current_package_uri() {
    return $current_package_uri.instance();
  }
  
  public $current_package_uri.Matcher get$current_package_uri(final ViatraQueryEngine engine) {
    return $current_package_uri.Matcher.on(engine);
  }
  
  public $package_classifier get$package_classifier() {
    return $package_classifier.instance();
  }
  
  public $package_classifier.Matcher get$package_classifier(final ViatraQueryEngine engine) {
    return $package_classifier.Matcher.on(engine);
  }
  
  public $inserted_package_classifier get$inserted_package_classifier() {
    return $inserted_package_classifier.instance();
  }
  
  public $inserted_package_classifier.Matcher get$inserted_package_classifier(final ViatraQueryEngine engine) {
    return $inserted_package_classifier.Matcher.on(engine);
  }
  
  public $removed_package_classifier get$removed_package_classifier() {
    return $removed_package_classifier.instance();
  }
  
  public $removed_package_classifier.Matcher get$removed_package_classifier(final ViatraQueryEngine engine) {
    return $removed_package_classifier.Matcher.on(engine);
  }
  
  public $initial_package_classifier get$initial_package_classifier() {
    return $initial_package_classifier.instance();
  }
  
  public $initial_package_classifier.Matcher get$initial_package_classifier(final ViatraQueryEngine engine) {
    return $initial_package_classifier.Matcher.on(engine);
  }
  
  public $current_package_classifier get$current_package_classifier() {
    return $current_package_classifier.instance();
  }
  
  public $current_package_classifier.Matcher get$current_package_classifier(final ViatraQueryEngine engine) {
    return $current_package_classifier.Matcher.on(engine);
  }
  
  public $package_subPackage get$package_subPackage() {
    return $package_subPackage.instance();
  }
  
  public $package_subPackage.Matcher get$package_subPackage(final ViatraQueryEngine engine) {
    return $package_subPackage.Matcher.on(engine);
  }
  
  public $inserted_package_subPackage get$inserted_package_subPackage() {
    return $inserted_package_subPackage.instance();
  }
  
  public $inserted_package_subPackage.Matcher get$inserted_package_subPackage(final ViatraQueryEngine engine) {
    return $inserted_package_subPackage.Matcher.on(engine);
  }
  
  public $removed_package_subPackage get$removed_package_subPackage() {
    return $removed_package_subPackage.instance();
  }
  
  public $removed_package_subPackage.Matcher get$removed_package_subPackage(final ViatraQueryEngine engine) {
    return $removed_package_subPackage.Matcher.on(engine);
  }
  
  public $initial_package_subPackage get$initial_package_subPackage() {
    return $initial_package_subPackage.instance();
  }
  
  public $initial_package_subPackage.Matcher get$initial_package_subPackage(final ViatraQueryEngine engine) {
    return $initial_package_subPackage.Matcher.on(engine);
  }
  
  public $current_package_subPackage get$current_package_subPackage() {
    return $current_package_subPackage.instance();
  }
  
  public $current_package_subPackage.Matcher get$current_package_subPackage(final ViatraQueryEngine engine) {
    return $current_package_subPackage.Matcher.on(engine);
  }
  
  public $package_class get$package_class() {
    return $package_class.instance();
  }
  
  public $package_class.Matcher get$package_class(final ViatraQueryEngine engine) {
    return $package_class.Matcher.on(engine);
  }
  
  public $inserted_package_class get$inserted_package_class() {
    return $inserted_package_class.instance();
  }
  
  public $inserted_package_class.Matcher get$inserted_package_class(final ViatraQueryEngine engine) {
    return $inserted_package_class.Matcher.on(engine);
  }
  
  public $removed_package_class get$removed_package_class() {
    return $removed_package_class.instance();
  }
  
  public $removed_package_class.Matcher get$removed_package_class(final ViatraQueryEngine engine) {
    return $removed_package_class.Matcher.on(engine);
  }
  
  public $initial_package_class get$initial_package_class() {
    return $initial_package_class.instance();
  }
  
  public $initial_package_class.Matcher get$initial_package_class(final ViatraQueryEngine engine) {
    return $initial_package_class.Matcher.on(engine);
  }
  
  public $current_package_class get$current_package_class() {
    return $current_package_class.instance();
  }
  
  public $current_package_class.Matcher get$current_package_class(final ViatraQueryEngine engine) {
    return $current_package_class.Matcher.on(engine);
  }
  
  public $package_datatype get$package_datatype() {
    return $package_datatype.instance();
  }
  
  public $package_datatype.Matcher get$package_datatype(final ViatraQueryEngine engine) {
    return $package_datatype.Matcher.on(engine);
  }
  
  public $inserted_package_datatype get$inserted_package_datatype() {
    return $inserted_package_datatype.instance();
  }
  
  public $inserted_package_datatype.Matcher get$inserted_package_datatype(final ViatraQueryEngine engine) {
    return $inserted_package_datatype.Matcher.on(engine);
  }
  
  public $removed_package_datatype get$removed_package_datatype() {
    return $removed_package_datatype.instance();
  }
  
  public $removed_package_datatype.Matcher get$removed_package_datatype(final ViatraQueryEngine engine) {
    return $removed_package_datatype.Matcher.on(engine);
  }
  
  public $initial_package_datatype get$initial_package_datatype() {
    return $initial_package_datatype.instance();
  }
  
  public $initial_package_datatype.Matcher get$initial_package_datatype(final ViatraQueryEngine engine) {
    return $initial_package_datatype.Matcher.on(engine);
  }
  
  public $current_package_datatype get$current_package_datatype() {
    return $current_package_datatype.instance();
  }
  
  public $current_package_datatype.Matcher get$current_package_datatype(final ViatraQueryEngine engine) {
    return $current_package_datatype.Matcher.on(engine);
  }
  
  public $package_enumeration get$package_enumeration() {
    return $package_enumeration.instance();
  }
  
  public $package_enumeration.Matcher get$package_enumeration(final ViatraQueryEngine engine) {
    return $package_enumeration.Matcher.on(engine);
  }
  
  public $inserted_package_enumeration get$inserted_package_enumeration() {
    return $inserted_package_enumeration.instance();
  }
  
  public $inserted_package_enumeration.Matcher get$inserted_package_enumeration(final ViatraQueryEngine engine) {
    return $inserted_package_enumeration.Matcher.on(engine);
  }
  
  public $removed_package_enumeration get$removed_package_enumeration() {
    return $removed_package_enumeration.instance();
  }
  
  public $removed_package_enumeration.Matcher get$removed_package_enumeration(final ViatraQueryEngine engine) {
    return $removed_package_enumeration.Matcher.on(engine);
  }
  
  public $initial_package_enumeration get$initial_package_enumeration() {
    return $initial_package_enumeration.instance();
  }
  
  public $initial_package_enumeration.Matcher get$initial_package_enumeration(final ViatraQueryEngine engine) {
    return $initial_package_enumeration.Matcher.on(engine);
  }
  
  public $current_package_enumeration get$current_package_enumeration() {
    return $current_package_enumeration.instance();
  }
  
  public $current_package_enumeration.Matcher get$current_package_enumeration(final ViatraQueryEngine engine) {
    return $current_package_enumeration.Matcher.on(engine);
  }
  
  public $class get$class() {
    return $class.instance();
  }
  
  public $class.Matcher get$class(final ViatraQueryEngine engine) {
    return $class.Matcher.on(engine);
  }
  
  public $created_class get$created_class() {
    return $created_class.instance();
  }
  
  public $created_class.Matcher get$created_class(final ViatraQueryEngine engine) {
    return $created_class.Matcher.on(engine);
  }
  
  public $deleted_class get$deleted_class() {
    return $deleted_class.instance();
  }
  
  public $deleted_class.Matcher get$deleted_class(final ViatraQueryEngine engine) {
    return $deleted_class.Matcher.on(engine);
  }
  
  public $initial_class get$initial_class() {
    return $initial_class.instance();
  }
  
  public $initial_class.Matcher get$initial_class(final ViatraQueryEngine engine) {
    return $initial_class.Matcher.on(engine);
  }
  
  public $current_class get$current_class() {
    return $current_class.instance();
  }
  
  public $current_class.Matcher get$current_class(final ViatraQueryEngine engine) {
    return $current_class.Matcher.on(engine);
  }
  
  public $class_name get$class_name() {
    return $class_name.instance();
  }
  
  public $class_name.Matcher get$class_name(final ViatraQueryEngine engine) {
    return $class_name.Matcher.on(engine);
  }
  
  public $set_class_name get$set_class_name() {
    return $set_class_name.instance();
  }
  
  public $set_class_name.Matcher get$set_class_name(final ViatraQueryEngine engine) {
    return $set_class_name.Matcher.on(engine);
  }
  
  public $unset_class_name get$unset_class_name() {
    return $unset_class_name.instance();
  }
  
  public $unset_class_name.Matcher get$unset_class_name(final ViatraQueryEngine engine) {
    return $unset_class_name.Matcher.on(engine);
  }
  
  public $initial_class_name get$initial_class_name() {
    return $initial_class_name.instance();
  }
  
  public $initial_class_name.Matcher get$initial_class_name(final ViatraQueryEngine engine) {
    return $initial_class_name.Matcher.on(engine);
  }
  
  public $current_class_name get$current_class_name() {
    return $current_class_name.instance();
  }
  
  public $current_class_name.Matcher get$current_class_name(final ViatraQueryEngine engine) {
    return $current_class_name.Matcher.on(engine);
  }
  
  public $class_package get$class_package() {
    return $class_package.instance();
  }
  
  public $class_package.Matcher get$class_package(final ViatraQueryEngine engine) {
    return $class_package.Matcher.on(engine);
  }
  
  public $set_class_package get$set_class_package() {
    return $set_class_package.instance();
  }
  
  public $set_class_package.Matcher get$set_class_package(final ViatraQueryEngine engine) {
    return $set_class_package.Matcher.on(engine);
  }
  
  public $unset_class_package get$unset_class_package() {
    return $unset_class_package.instance();
  }
  
  public $unset_class_package.Matcher get$unset_class_package(final ViatraQueryEngine engine) {
    return $unset_class_package.Matcher.on(engine);
  }
  
  public $initial_class_package get$initial_class_package() {
    return $initial_class_package.instance();
  }
  
  public $initial_class_package.Matcher get$initial_class_package(final ViatraQueryEngine engine) {
    return $initial_class_package.Matcher.on(engine);
  }
  
  public $current_class_package get$current_class_package() {
    return $current_class_package.instance();
  }
  
  public $current_class_package.Matcher get$current_class_package(final ViatraQueryEngine engine) {
    return $current_class_package.Matcher.on(engine);
  }
  
  public $class_abstract get$class_abstract() {
    return $class_abstract.instance();
  }
  
  public $class_abstract.Matcher get$class_abstract(final ViatraQueryEngine engine) {
    return $class_abstract.Matcher.on(engine);
  }
  
  public $set_class_abstract get$set_class_abstract() {
    return $set_class_abstract.instance();
  }
  
  public $set_class_abstract.Matcher get$set_class_abstract(final ViatraQueryEngine engine) {
    return $set_class_abstract.Matcher.on(engine);
  }
  
  public $unset_class_abstract get$unset_class_abstract() {
    return $unset_class_abstract.instance();
  }
  
  public $unset_class_abstract.Matcher get$unset_class_abstract(final ViatraQueryEngine engine) {
    return $unset_class_abstract.Matcher.on(engine);
  }
  
  public $initial_class_abstract get$initial_class_abstract() {
    return $initial_class_abstract.instance();
  }
  
  public $initial_class_abstract.Matcher get$initial_class_abstract(final ViatraQueryEngine engine) {
    return $initial_class_abstract.Matcher.on(engine);
  }
  
  public $current_class_abstract get$current_class_abstract() {
    return $current_class_abstract.instance();
  }
  
  public $current_class_abstract.Matcher get$current_class_abstract(final ViatraQueryEngine engine) {
    return $current_class_abstract.Matcher.on(engine);
  }
  
  public $class_superClass get$class_superClass() {
    return $class_superClass.instance();
  }
  
  public $class_superClass.Matcher get$class_superClass(final ViatraQueryEngine engine) {
    return $class_superClass.Matcher.on(engine);
  }
  
  public $set_class_superClass get$set_class_superClass() {
    return $set_class_superClass.instance();
  }
  
  public $set_class_superClass.Matcher get$set_class_superClass(final ViatraQueryEngine engine) {
    return $set_class_superClass.Matcher.on(engine);
  }
  
  public $unset_class_superClass get$unset_class_superClass() {
    return $unset_class_superClass.instance();
  }
  
  public $unset_class_superClass.Matcher get$unset_class_superClass(final ViatraQueryEngine engine) {
    return $unset_class_superClass.Matcher.on(engine);
  }
  
  public $initial_class_superClass get$initial_class_superClass() {
    return $initial_class_superClass.instance();
  }
  
  public $initial_class_superClass.Matcher get$initial_class_superClass(final ViatraQueryEngine engine) {
    return $initial_class_superClass.Matcher.on(engine);
  }
  
  public $current_class_superClass get$current_class_superClass() {
    return $current_class_superClass.instance();
  }
  
  public $current_class_superClass.Matcher get$current_class_superClass(final ViatraQueryEngine engine) {
    return $current_class_superClass.Matcher.on(engine);
  }
  
  public $class_subClass get$class_subClass() {
    return $class_subClass.instance();
  }
  
  public $class_subClass.Matcher get$class_subClass(final ViatraQueryEngine engine) {
    return $class_subClass.Matcher.on(engine);
  }
  
  public $inserted_class_subClass get$inserted_class_subClass() {
    return $inserted_class_subClass.instance();
  }
  
  public $inserted_class_subClass.Matcher get$inserted_class_subClass(final ViatraQueryEngine engine) {
    return $inserted_class_subClass.Matcher.on(engine);
  }
  
  public $removed_class_subClass get$removed_class_subClass() {
    return $removed_class_subClass.instance();
  }
  
  public $removed_class_subClass.Matcher get$removed_class_subClass(final ViatraQueryEngine engine) {
    return $removed_class_subClass.Matcher.on(engine);
  }
  
  public $initial_class_subClass get$initial_class_subClass() {
    return $initial_class_subClass.instance();
  }
  
  public $initial_class_subClass.Matcher get$initial_class_subClass(final ViatraQueryEngine engine) {
    return $initial_class_subClass.Matcher.on(engine);
  }
  
  public $current_class_subClass get$current_class_subClass() {
    return $current_class_subClass.instance();
  }
  
  public $current_class_subClass.Matcher get$current_class_subClass(final ViatraQueryEngine engine) {
    return $current_class_subClass.Matcher.on(engine);
  }
  
  public $class_structuralFeature get$class_structuralFeature() {
    return $class_structuralFeature.instance();
  }
  
  public $class_structuralFeature.Matcher get$class_structuralFeature(final ViatraQueryEngine engine) {
    return $class_structuralFeature.Matcher.on(engine);
  }
  
  public $inserted_class_structuralFeature get$inserted_class_structuralFeature() {
    return $inserted_class_structuralFeature.instance();
  }
  
  public $inserted_class_structuralFeature.Matcher get$inserted_class_structuralFeature(final ViatraQueryEngine engine) {
    return $inserted_class_structuralFeature.Matcher.on(engine);
  }
  
  public $removed_class_structuralFeature get$removed_class_structuralFeature() {
    return $removed_class_structuralFeature.instance();
  }
  
  public $removed_class_structuralFeature.Matcher get$removed_class_structuralFeature(final ViatraQueryEngine engine) {
    return $removed_class_structuralFeature.Matcher.on(engine);
  }
  
  public $initial_class_structuralFeature get$initial_class_structuralFeature() {
    return $initial_class_structuralFeature.instance();
  }
  
  public $initial_class_structuralFeature.Matcher get$initial_class_structuralFeature(final ViatraQueryEngine engine) {
    return $initial_class_structuralFeature.Matcher.on(engine);
  }
  
  public $current_class_structuralFeature get$current_class_structuralFeature() {
    return $current_class_structuralFeature.instance();
  }
  
  public $current_class_structuralFeature.Matcher get$current_class_structuralFeature(final ViatraQueryEngine engine) {
    return $current_class_structuralFeature.Matcher.on(engine);
  }
  
  public $class_attribute get$class_attribute() {
    return $class_attribute.instance();
  }
  
  public $class_attribute.Matcher get$class_attribute(final ViatraQueryEngine engine) {
    return $class_attribute.Matcher.on(engine);
  }
  
  public $inserted_class_attribute get$inserted_class_attribute() {
    return $inserted_class_attribute.instance();
  }
  
  public $inserted_class_attribute.Matcher get$inserted_class_attribute(final ViatraQueryEngine engine) {
    return $inserted_class_attribute.Matcher.on(engine);
  }
  
  public $removed_class_attribute get$removed_class_attribute() {
    return $removed_class_attribute.instance();
  }
  
  public $removed_class_attribute.Matcher get$removed_class_attribute(final ViatraQueryEngine engine) {
    return $removed_class_attribute.Matcher.on(engine);
  }
  
  public $initial_class_attribute get$initial_class_attribute() {
    return $initial_class_attribute.instance();
  }
  
  public $initial_class_attribute.Matcher get$initial_class_attribute(final ViatraQueryEngine engine) {
    return $initial_class_attribute.Matcher.on(engine);
  }
  
  public $current_class_attribute get$current_class_attribute() {
    return $current_class_attribute.instance();
  }
  
  public $current_class_attribute.Matcher get$current_class_attribute(final ViatraQueryEngine engine) {
    return $current_class_attribute.Matcher.on(engine);
  }
  
  public $class_reference get$class_reference() {
    return $class_reference.instance();
  }
  
  public $class_reference.Matcher get$class_reference(final ViatraQueryEngine engine) {
    return $class_reference.Matcher.on(engine);
  }
  
  public $inserted_class_reference get$inserted_class_reference() {
    return $inserted_class_reference.instance();
  }
  
  public $inserted_class_reference.Matcher get$inserted_class_reference(final ViatraQueryEngine engine) {
    return $inserted_class_reference.Matcher.on(engine);
  }
  
  public $removed_class_reference get$removed_class_reference() {
    return $removed_class_reference.instance();
  }
  
  public $removed_class_reference.Matcher get$removed_class_reference(final ViatraQueryEngine engine) {
    return $removed_class_reference.Matcher.on(engine);
  }
  
  public $initial_class_reference get$initial_class_reference() {
    return $initial_class_reference.instance();
  }
  
  public $initial_class_reference.Matcher get$initial_class_reference(final ViatraQueryEngine engine) {
    return $initial_class_reference.Matcher.on(engine);
  }
  
  public $current_class_reference get$current_class_reference() {
    return $current_class_reference.instance();
  }
  
  public $current_class_reference.Matcher get$current_class_reference(final ViatraQueryEngine engine) {
    return $current_class_reference.Matcher.on(engine);
  }
  
  public $datatype get$datatype() {
    return $datatype.instance();
  }
  
  public $datatype.Matcher get$datatype(final ViatraQueryEngine engine) {
    return $datatype.Matcher.on(engine);
  }
  
  public $created_datatype get$created_datatype() {
    return $created_datatype.instance();
  }
  
  public $created_datatype.Matcher get$created_datatype(final ViatraQueryEngine engine) {
    return $created_datatype.Matcher.on(engine);
  }
  
  public $deleted_datatype get$deleted_datatype() {
    return $deleted_datatype.instance();
  }
  
  public $deleted_datatype.Matcher get$deleted_datatype(final ViatraQueryEngine engine) {
    return $deleted_datatype.Matcher.on(engine);
  }
  
  public $initial_datatype get$initial_datatype() {
    return $initial_datatype.instance();
  }
  
  public $initial_datatype.Matcher get$initial_datatype(final ViatraQueryEngine engine) {
    return $initial_datatype.Matcher.on(engine);
  }
  
  public $current_datatype get$current_datatype() {
    return $current_datatype.instance();
  }
  
  public $current_datatype.Matcher get$current_datatype(final ViatraQueryEngine engine) {
    return $current_datatype.Matcher.on(engine);
  }
  
  public $datatype_name get$datatype_name() {
    return $datatype_name.instance();
  }
  
  public $datatype_name.Matcher get$datatype_name(final ViatraQueryEngine engine) {
    return $datatype_name.Matcher.on(engine);
  }
  
  public $set_datatype_name get$set_datatype_name() {
    return $set_datatype_name.instance();
  }
  
  public $set_datatype_name.Matcher get$set_datatype_name(final ViatraQueryEngine engine) {
    return $set_datatype_name.Matcher.on(engine);
  }
  
  public $unset_datatype_name get$unset_datatype_name() {
    return $unset_datatype_name.instance();
  }
  
  public $unset_datatype_name.Matcher get$unset_datatype_name(final ViatraQueryEngine engine) {
    return $unset_datatype_name.Matcher.on(engine);
  }
  
  public $initial_datatype_name get$initial_datatype_name() {
    return $initial_datatype_name.instance();
  }
  
  public $initial_datatype_name.Matcher get$initial_datatype_name(final ViatraQueryEngine engine) {
    return $initial_datatype_name.Matcher.on(engine);
  }
  
  public $current_datatype_name get$current_datatype_name() {
    return $current_datatype_name.instance();
  }
  
  public $current_datatype_name.Matcher get$current_datatype_name(final ViatraQueryEngine engine) {
    return $current_datatype_name.Matcher.on(engine);
  }
  
  public $datatype_package get$datatype_package() {
    return $datatype_package.instance();
  }
  
  public $datatype_package.Matcher get$datatype_package(final ViatraQueryEngine engine) {
    return $datatype_package.Matcher.on(engine);
  }
  
  public $set_datatype_package get$set_datatype_package() {
    return $set_datatype_package.instance();
  }
  
  public $set_datatype_package.Matcher get$set_datatype_package(final ViatraQueryEngine engine) {
    return $set_datatype_package.Matcher.on(engine);
  }
  
  public $unset_datatype_package get$unset_datatype_package() {
    return $unset_datatype_package.instance();
  }
  
  public $unset_datatype_package.Matcher get$unset_datatype_package(final ViatraQueryEngine engine) {
    return $unset_datatype_package.Matcher.on(engine);
  }
  
  public $initial_datatype_package get$initial_datatype_package() {
    return $initial_datatype_package.instance();
  }
  
  public $initial_datatype_package.Matcher get$initial_datatype_package(final ViatraQueryEngine engine) {
    return $initial_datatype_package.Matcher.on(engine);
  }
  
  public $current_datatype_package get$current_datatype_package() {
    return $current_datatype_package.instance();
  }
  
  public $current_datatype_package.Matcher get$current_datatype_package(final ViatraQueryEngine engine) {
    return $current_datatype_package.Matcher.on(engine);
  }
  
  public $enumeration get$enumeration() {
    return $enumeration.instance();
  }
  
  public $enumeration.Matcher get$enumeration(final ViatraQueryEngine engine) {
    return $enumeration.Matcher.on(engine);
  }
  
  public $created_enumeration get$created_enumeration() {
    return $created_enumeration.instance();
  }
  
  public $created_enumeration.Matcher get$created_enumeration(final ViatraQueryEngine engine) {
    return $created_enumeration.Matcher.on(engine);
  }
  
  public $deleted_enumeration get$deleted_enumeration() {
    return $deleted_enumeration.instance();
  }
  
  public $deleted_enumeration.Matcher get$deleted_enumeration(final ViatraQueryEngine engine) {
    return $deleted_enumeration.Matcher.on(engine);
  }
  
  public $initial_enumeration get$initial_enumeration() {
    return $initial_enumeration.instance();
  }
  
  public $initial_enumeration.Matcher get$initial_enumeration(final ViatraQueryEngine engine) {
    return $initial_enumeration.Matcher.on(engine);
  }
  
  public $current_enumeration get$current_enumeration() {
    return $current_enumeration.instance();
  }
  
  public $current_enumeration.Matcher get$current_enumeration(final ViatraQueryEngine engine) {
    return $current_enumeration.Matcher.on(engine);
  }
  
  public $enumeration_name get$enumeration_name() {
    return $enumeration_name.instance();
  }
  
  public $enumeration_name.Matcher get$enumeration_name(final ViatraQueryEngine engine) {
    return $enumeration_name.Matcher.on(engine);
  }
  
  public $set_enumeration_name get$set_enumeration_name() {
    return $set_enumeration_name.instance();
  }
  
  public $set_enumeration_name.Matcher get$set_enumeration_name(final ViatraQueryEngine engine) {
    return $set_enumeration_name.Matcher.on(engine);
  }
  
  public $unset_enumeration_name get$unset_enumeration_name() {
    return $unset_enumeration_name.instance();
  }
  
  public $unset_enumeration_name.Matcher get$unset_enumeration_name(final ViatraQueryEngine engine) {
    return $unset_enumeration_name.Matcher.on(engine);
  }
  
  public $initial_enumeration_name get$initial_enumeration_name() {
    return $initial_enumeration_name.instance();
  }
  
  public $initial_enumeration_name.Matcher get$initial_enumeration_name(final ViatraQueryEngine engine) {
    return $initial_enumeration_name.Matcher.on(engine);
  }
  
  public $current_enumeration_name get$current_enumeration_name() {
    return $current_enumeration_name.instance();
  }
  
  public $current_enumeration_name.Matcher get$current_enumeration_name(final ViatraQueryEngine engine) {
    return $current_enumeration_name.Matcher.on(engine);
  }
  
  public $enumeration_package get$enumeration_package() {
    return $enumeration_package.instance();
  }
  
  public $enumeration_package.Matcher get$enumeration_package(final ViatraQueryEngine engine) {
    return $enumeration_package.Matcher.on(engine);
  }
  
  public $set_enumeration_package get$set_enumeration_package() {
    return $set_enumeration_package.instance();
  }
  
  public $set_enumeration_package.Matcher get$set_enumeration_package(final ViatraQueryEngine engine) {
    return $set_enumeration_package.Matcher.on(engine);
  }
  
  public $unset_enumeration_package get$unset_enumeration_package() {
    return $unset_enumeration_package.instance();
  }
  
  public $unset_enumeration_package.Matcher get$unset_enumeration_package(final ViatraQueryEngine engine) {
    return $unset_enumeration_package.Matcher.on(engine);
  }
  
  public $initial_enumeration_package get$initial_enumeration_package() {
    return $initial_enumeration_package.instance();
  }
  
  public $initial_enumeration_package.Matcher get$initial_enumeration_package(final ViatraQueryEngine engine) {
    return $initial_enumeration_package.Matcher.on(engine);
  }
  
  public $current_enumeration_package get$current_enumeration_package() {
    return $current_enumeration_package.instance();
  }
  
  public $current_enumeration_package.Matcher get$current_enumeration_package(final ViatraQueryEngine engine) {
    return $current_enumeration_package.Matcher.on(engine);
  }
  
  public $enumeration_enumerationLiteral get$enumeration_enumerationLiteral() {
    return $enumeration_enumerationLiteral.instance();
  }
  
  public $enumeration_enumerationLiteral.Matcher get$enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return $enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public $inserted_enumeration_enumerationLiteral get$inserted_enumeration_enumerationLiteral() {
    return $inserted_enumeration_enumerationLiteral.instance();
  }
  
  public $inserted_enumeration_enumerationLiteral.Matcher get$inserted_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return $inserted_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public $removed_enumeration_enumerationLiteral get$removed_enumeration_enumerationLiteral() {
    return $removed_enumeration_enumerationLiteral.instance();
  }
  
  public $removed_enumeration_enumerationLiteral.Matcher get$removed_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return $removed_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public $initial_enumeration_enumerationLiteral get$initial_enumeration_enumerationLiteral() {
    return $initial_enumeration_enumerationLiteral.instance();
  }
  
  public $initial_enumeration_enumerationLiteral.Matcher get$initial_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return $initial_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public $current_enumeration_enumerationLiteral get$current_enumeration_enumerationLiteral() {
    return $current_enumeration_enumerationLiteral.instance();
  }
  
  public $current_enumeration_enumerationLiteral.Matcher get$current_enumeration_enumerationLiteral(final ViatraQueryEngine engine) {
    return $current_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  public $enumerationLiteral get$enumerationLiteral() {
    return $enumerationLiteral.instance();
  }
  
  public $enumerationLiteral.Matcher get$enumerationLiteral(final ViatraQueryEngine engine) {
    return $enumerationLiteral.Matcher.on(engine);
  }
  
  public $created_enumerationLiteral get$created_enumerationLiteral() {
    return $created_enumerationLiteral.instance();
  }
  
  public $created_enumerationLiteral.Matcher get$created_enumerationLiteral(final ViatraQueryEngine engine) {
    return $created_enumerationLiteral.Matcher.on(engine);
  }
  
  public $deleted_enumerationLiteral get$deleted_enumerationLiteral() {
    return $deleted_enumerationLiteral.instance();
  }
  
  public $deleted_enumerationLiteral.Matcher get$deleted_enumerationLiteral(final ViatraQueryEngine engine) {
    return $deleted_enumerationLiteral.Matcher.on(engine);
  }
  
  public $initial_enumerationLiteral get$initial_enumerationLiteral() {
    return $initial_enumerationLiteral.instance();
  }
  
  public $initial_enumerationLiteral.Matcher get$initial_enumerationLiteral(final ViatraQueryEngine engine) {
    return $initial_enumerationLiteral.Matcher.on(engine);
  }
  
  public $current_enumerationLiteral get$current_enumerationLiteral() {
    return $current_enumerationLiteral.instance();
  }
  
  public $current_enumerationLiteral.Matcher get$current_enumerationLiteral(final ViatraQueryEngine engine) {
    return $current_enumerationLiteral.Matcher.on(engine);
  }
  
  public $enumerationLiteral_name get$enumerationLiteral_name() {
    return $enumerationLiteral_name.instance();
  }
  
  public $enumerationLiteral_name.Matcher get$enumerationLiteral_name(final ViatraQueryEngine engine) {
    return $enumerationLiteral_name.Matcher.on(engine);
  }
  
  public $set_enumerationLiteral_name get$set_enumerationLiteral_name() {
    return $set_enumerationLiteral_name.instance();
  }
  
  public $set_enumerationLiteral_name.Matcher get$set_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return $set_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public $unset_enumerationLiteral_name get$unset_enumerationLiteral_name() {
    return $unset_enumerationLiteral_name.instance();
  }
  
  public $unset_enumerationLiteral_name.Matcher get$unset_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return $unset_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public $initial_enumerationLiteral_name get$initial_enumerationLiteral_name() {
    return $initial_enumerationLiteral_name.instance();
  }
  
  public $initial_enumerationLiteral_name.Matcher get$initial_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return $initial_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public $current_enumerationLiteral_name get$current_enumerationLiteral_name() {
    return $current_enumerationLiteral_name.instance();
  }
  
  public $current_enumerationLiteral_name.Matcher get$current_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return $current_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public $enumerationLiteral_enumeration get$enumerationLiteral_enumeration() {
    return $enumerationLiteral_enumeration.instance();
  }
  
  public $enumerationLiteral_enumeration.Matcher get$enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return $enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public $set_enumerationLiteral_enumeration get$set_enumerationLiteral_enumeration() {
    return $set_enumerationLiteral_enumeration.instance();
  }
  
  public $set_enumerationLiteral_enumeration.Matcher get$set_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return $set_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public $unset_enumerationLiteral_enumeration get$unset_enumerationLiteral_enumeration() {
    return $unset_enumerationLiteral_enumeration.instance();
  }
  
  public $unset_enumerationLiteral_enumeration.Matcher get$unset_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return $unset_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public $initial_enumerationLiteral_enumeration get$initial_enumerationLiteral_enumeration() {
    return $initial_enumerationLiteral_enumeration.instance();
  }
  
  public $initial_enumerationLiteral_enumeration.Matcher get$initial_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return $initial_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public $current_enumerationLiteral_enumeration get$current_enumerationLiteral_enumeration() {
    return $current_enumerationLiteral_enumeration.instance();
  }
  
  public $current_enumerationLiteral_enumeration.Matcher get$current_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return $current_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public $structuralFeature get$structuralFeature() {
    return $structuralFeature.instance();
  }
  
  public $structuralFeature.Matcher get$structuralFeature(final ViatraQueryEngine engine) {
    return $structuralFeature.Matcher.on(engine);
  }
  
  public $created_structuralFeature get$created_structuralFeature() {
    return $created_structuralFeature.instance();
  }
  
  public $created_structuralFeature.Matcher get$created_structuralFeature(final ViatraQueryEngine engine) {
    return $created_structuralFeature.Matcher.on(engine);
  }
  
  public $deleted_structuralFeature get$deleted_structuralFeature() {
    return $deleted_structuralFeature.instance();
  }
  
  public $deleted_structuralFeature.Matcher get$deleted_structuralFeature(final ViatraQueryEngine engine) {
    return $deleted_structuralFeature.Matcher.on(engine);
  }
  
  public $initial_structuralFeature get$initial_structuralFeature() {
    return $initial_structuralFeature.instance();
  }
  
  public $initial_structuralFeature.Matcher get$initial_structuralFeature(final ViatraQueryEngine engine) {
    return $initial_structuralFeature.Matcher.on(engine);
  }
  
  public $current_structuralFeature get$current_structuralFeature() {
    return $current_structuralFeature.instance();
  }
  
  public $current_structuralFeature.Matcher get$current_structuralFeature(final ViatraQueryEngine engine) {
    return $current_structuralFeature.Matcher.on(engine);
  }
  
  public $structuralFeature_name get$structuralFeature_name() {
    return $structuralFeature_name.instance();
  }
  
  public $structuralFeature_name.Matcher get$structuralFeature_name(final ViatraQueryEngine engine) {
    return $structuralFeature_name.Matcher.on(engine);
  }
  
  public $set_structuralFeature_name get$set_structuralFeature_name() {
    return $set_structuralFeature_name.instance();
  }
  
  public $set_structuralFeature_name.Matcher get$set_structuralFeature_name(final ViatraQueryEngine engine) {
    return $set_structuralFeature_name.Matcher.on(engine);
  }
  
  public $unset_structuralFeature_name get$unset_structuralFeature_name() {
    return $unset_structuralFeature_name.instance();
  }
  
  public $unset_structuralFeature_name.Matcher get$unset_structuralFeature_name(final ViatraQueryEngine engine) {
    return $unset_structuralFeature_name.Matcher.on(engine);
  }
  
  public $initial_structuralFeature_name get$initial_structuralFeature_name() {
    return $initial_structuralFeature_name.instance();
  }
  
  public $initial_structuralFeature_name.Matcher get$initial_structuralFeature_name(final ViatraQueryEngine engine) {
    return $initial_structuralFeature_name.Matcher.on(engine);
  }
  
  public $current_structuralFeature_name get$current_structuralFeature_name() {
    return $current_structuralFeature_name.instance();
  }
  
  public $current_structuralFeature_name.Matcher get$current_structuralFeature_name(final ViatraQueryEngine engine) {
    return $current_structuralFeature_name.Matcher.on(engine);
  }
  
  public $structuralFeature_owner get$structuralFeature_owner() {
    return $structuralFeature_owner.instance();
  }
  
  public $structuralFeature_owner.Matcher get$structuralFeature_owner(final ViatraQueryEngine engine) {
    return $structuralFeature_owner.Matcher.on(engine);
  }
  
  public $set_structuralFeature_owner get$set_structuralFeature_owner() {
    return $set_structuralFeature_owner.instance();
  }
  
  public $set_structuralFeature_owner.Matcher get$set_structuralFeature_owner(final ViatraQueryEngine engine) {
    return $set_structuralFeature_owner.Matcher.on(engine);
  }
  
  public $unset_structuralFeature_owner get$unset_structuralFeature_owner() {
    return $unset_structuralFeature_owner.instance();
  }
  
  public $unset_structuralFeature_owner.Matcher get$unset_structuralFeature_owner(final ViatraQueryEngine engine) {
    return $unset_structuralFeature_owner.Matcher.on(engine);
  }
  
  public $initial_structuralFeature_owner get$initial_structuralFeature_owner() {
    return $initial_structuralFeature_owner.instance();
  }
  
  public $initial_structuralFeature_owner.Matcher get$initial_structuralFeature_owner(final ViatraQueryEngine engine) {
    return $initial_structuralFeature_owner.Matcher.on(engine);
  }
  
  public $current_structuralFeature_owner get$current_structuralFeature_owner() {
    return $current_structuralFeature_owner.instance();
  }
  
  public $current_structuralFeature_owner.Matcher get$current_structuralFeature_owner(final ViatraQueryEngine engine) {
    return $current_structuralFeature_owner.Matcher.on(engine);
  }
  
  public $structuralFeature_lower get$structuralFeature_lower() {
    return $structuralFeature_lower.instance();
  }
  
  public $structuralFeature_lower.Matcher get$structuralFeature_lower(final ViatraQueryEngine engine) {
    return $structuralFeature_lower.Matcher.on(engine);
  }
  
  public $set_structuralFeature_lower get$set_structuralFeature_lower() {
    return $set_structuralFeature_lower.instance();
  }
  
  public $set_structuralFeature_lower.Matcher get$set_structuralFeature_lower(final ViatraQueryEngine engine) {
    return $set_structuralFeature_lower.Matcher.on(engine);
  }
  
  public $unset_structuralFeature_lower get$unset_structuralFeature_lower() {
    return $unset_structuralFeature_lower.instance();
  }
  
  public $unset_structuralFeature_lower.Matcher get$unset_structuralFeature_lower(final ViatraQueryEngine engine) {
    return $unset_structuralFeature_lower.Matcher.on(engine);
  }
  
  public $initial_structuralFeature_lower get$initial_structuralFeature_lower() {
    return $initial_structuralFeature_lower.instance();
  }
  
  public $initial_structuralFeature_lower.Matcher get$initial_structuralFeature_lower(final ViatraQueryEngine engine) {
    return $initial_structuralFeature_lower.Matcher.on(engine);
  }
  
  public $current_structuralFeature_lower get$current_structuralFeature_lower() {
    return $current_structuralFeature_lower.instance();
  }
  
  public $current_structuralFeature_lower.Matcher get$current_structuralFeature_lower(final ViatraQueryEngine engine) {
    return $current_structuralFeature_lower.Matcher.on(engine);
  }
  
  public $structuralFeature_upper get$structuralFeature_upper() {
    return $structuralFeature_upper.instance();
  }
  
  public $structuralFeature_upper.Matcher get$structuralFeature_upper(final ViatraQueryEngine engine) {
    return $structuralFeature_upper.Matcher.on(engine);
  }
  
  public $set_structuralFeature_upper get$set_structuralFeature_upper() {
    return $set_structuralFeature_upper.instance();
  }
  
  public $set_structuralFeature_upper.Matcher get$set_structuralFeature_upper(final ViatraQueryEngine engine) {
    return $set_structuralFeature_upper.Matcher.on(engine);
  }
  
  public $unset_structuralFeature_upper get$unset_structuralFeature_upper() {
    return $unset_structuralFeature_upper.instance();
  }
  
  public $unset_structuralFeature_upper.Matcher get$unset_structuralFeature_upper(final ViatraQueryEngine engine) {
    return $unset_structuralFeature_upper.Matcher.on(engine);
  }
  
  public $initial_structuralFeature_upper get$initial_structuralFeature_upper() {
    return $initial_structuralFeature_upper.instance();
  }
  
  public $initial_structuralFeature_upper.Matcher get$initial_structuralFeature_upper(final ViatraQueryEngine engine) {
    return $initial_structuralFeature_upper.Matcher.on(engine);
  }
  
  public $current_structuralFeature_upper get$current_structuralFeature_upper() {
    return $current_structuralFeature_upper.instance();
  }
  
  public $current_structuralFeature_upper.Matcher get$current_structuralFeature_upper(final ViatraQueryEngine engine) {
    return $current_structuralFeature_upper.Matcher.on(engine);
  }
  
  public $attribute get$attribute() {
    return $attribute.instance();
  }
  
  public $attribute.Matcher get$attribute(final ViatraQueryEngine engine) {
    return $attribute.Matcher.on(engine);
  }
  
  public $created_attribute get$created_attribute() {
    return $created_attribute.instance();
  }
  
  public $created_attribute.Matcher get$created_attribute(final ViatraQueryEngine engine) {
    return $created_attribute.Matcher.on(engine);
  }
  
  public $deleted_attribute get$deleted_attribute() {
    return $deleted_attribute.instance();
  }
  
  public $deleted_attribute.Matcher get$deleted_attribute(final ViatraQueryEngine engine) {
    return $deleted_attribute.Matcher.on(engine);
  }
  
  public $initial_attribute get$initial_attribute() {
    return $initial_attribute.instance();
  }
  
  public $initial_attribute.Matcher get$initial_attribute(final ViatraQueryEngine engine) {
    return $initial_attribute.Matcher.on(engine);
  }
  
  public $current_attribute get$current_attribute() {
    return $current_attribute.instance();
  }
  
  public $current_attribute.Matcher get$current_attribute(final ViatraQueryEngine engine) {
    return $current_attribute.Matcher.on(engine);
  }
  
  public $attribute_name get$attribute_name() {
    return $attribute_name.instance();
  }
  
  public $attribute_name.Matcher get$attribute_name(final ViatraQueryEngine engine) {
    return $attribute_name.Matcher.on(engine);
  }
  
  public $set_attribute_name get$set_attribute_name() {
    return $set_attribute_name.instance();
  }
  
  public $set_attribute_name.Matcher get$set_attribute_name(final ViatraQueryEngine engine) {
    return $set_attribute_name.Matcher.on(engine);
  }
  
  public $unset_attribute_name get$unset_attribute_name() {
    return $unset_attribute_name.instance();
  }
  
  public $unset_attribute_name.Matcher get$unset_attribute_name(final ViatraQueryEngine engine) {
    return $unset_attribute_name.Matcher.on(engine);
  }
  
  public $initial_attribute_name get$initial_attribute_name() {
    return $initial_attribute_name.instance();
  }
  
  public $initial_attribute_name.Matcher get$initial_attribute_name(final ViatraQueryEngine engine) {
    return $initial_attribute_name.Matcher.on(engine);
  }
  
  public $current_attribute_name get$current_attribute_name() {
    return $current_attribute_name.instance();
  }
  
  public $current_attribute_name.Matcher get$current_attribute_name(final ViatraQueryEngine engine) {
    return $current_attribute_name.Matcher.on(engine);
  }
  
  public $attribute_owner get$attribute_owner() {
    return $attribute_owner.instance();
  }
  
  public $attribute_owner.Matcher get$attribute_owner(final ViatraQueryEngine engine) {
    return $attribute_owner.Matcher.on(engine);
  }
  
  public $set_attribute_owner get$set_attribute_owner() {
    return $set_attribute_owner.instance();
  }
  
  public $set_attribute_owner.Matcher get$set_attribute_owner(final ViatraQueryEngine engine) {
    return $set_attribute_owner.Matcher.on(engine);
  }
  
  public $unset_attribute_owner get$unset_attribute_owner() {
    return $unset_attribute_owner.instance();
  }
  
  public $unset_attribute_owner.Matcher get$unset_attribute_owner(final ViatraQueryEngine engine) {
    return $unset_attribute_owner.Matcher.on(engine);
  }
  
  public $initial_attribute_owner get$initial_attribute_owner() {
    return $initial_attribute_owner.instance();
  }
  
  public $initial_attribute_owner.Matcher get$initial_attribute_owner(final ViatraQueryEngine engine) {
    return $initial_attribute_owner.Matcher.on(engine);
  }
  
  public $current_attribute_owner get$current_attribute_owner() {
    return $current_attribute_owner.instance();
  }
  
  public $current_attribute_owner.Matcher get$current_attribute_owner(final ViatraQueryEngine engine) {
    return $current_attribute_owner.Matcher.on(engine);
  }
  
  public $attribute_lower get$attribute_lower() {
    return $attribute_lower.instance();
  }
  
  public $attribute_lower.Matcher get$attribute_lower(final ViatraQueryEngine engine) {
    return $attribute_lower.Matcher.on(engine);
  }
  
  public $set_attribute_lower get$set_attribute_lower() {
    return $set_attribute_lower.instance();
  }
  
  public $set_attribute_lower.Matcher get$set_attribute_lower(final ViatraQueryEngine engine) {
    return $set_attribute_lower.Matcher.on(engine);
  }
  
  public $unset_attribute_lower get$unset_attribute_lower() {
    return $unset_attribute_lower.instance();
  }
  
  public $unset_attribute_lower.Matcher get$unset_attribute_lower(final ViatraQueryEngine engine) {
    return $unset_attribute_lower.Matcher.on(engine);
  }
  
  public $initial_attribute_lower get$initial_attribute_lower() {
    return $initial_attribute_lower.instance();
  }
  
  public $initial_attribute_lower.Matcher get$initial_attribute_lower(final ViatraQueryEngine engine) {
    return $initial_attribute_lower.Matcher.on(engine);
  }
  
  public $current_attribute_lower get$current_attribute_lower() {
    return $current_attribute_lower.instance();
  }
  
  public $current_attribute_lower.Matcher get$current_attribute_lower(final ViatraQueryEngine engine) {
    return $current_attribute_lower.Matcher.on(engine);
  }
  
  public $attribute_upper get$attribute_upper() {
    return $attribute_upper.instance();
  }
  
  public $attribute_upper.Matcher get$attribute_upper(final ViatraQueryEngine engine) {
    return $attribute_upper.Matcher.on(engine);
  }
  
  public $set_attribute_upper get$set_attribute_upper() {
    return $set_attribute_upper.instance();
  }
  
  public $set_attribute_upper.Matcher get$set_attribute_upper(final ViatraQueryEngine engine) {
    return $set_attribute_upper.Matcher.on(engine);
  }
  
  public $unset_attribute_upper get$unset_attribute_upper() {
    return $unset_attribute_upper.instance();
  }
  
  public $unset_attribute_upper.Matcher get$unset_attribute_upper(final ViatraQueryEngine engine) {
    return $unset_attribute_upper.Matcher.on(engine);
  }
  
  public $initial_attribute_upper get$initial_attribute_upper() {
    return $initial_attribute_upper.instance();
  }
  
  public $initial_attribute_upper.Matcher get$initial_attribute_upper(final ViatraQueryEngine engine) {
    return $initial_attribute_upper.Matcher.on(engine);
  }
  
  public $current_attribute_upper get$current_attribute_upper() {
    return $current_attribute_upper.instance();
  }
  
  public $current_attribute_upper.Matcher get$current_attribute_upper(final ViatraQueryEngine engine) {
    return $current_attribute_upper.Matcher.on(engine);
  }
  
  public $attribute_type get$attribute_type() {
    return $attribute_type.instance();
  }
  
  public $attribute_type.Matcher get$attribute_type(final ViatraQueryEngine engine) {
    return $attribute_type.Matcher.on(engine);
  }
  
  public $set_attribute_type get$set_attribute_type() {
    return $set_attribute_type.instance();
  }
  
  public $set_attribute_type.Matcher get$set_attribute_type(final ViatraQueryEngine engine) {
    return $set_attribute_type.Matcher.on(engine);
  }
  
  public $unset_attribute_type get$unset_attribute_type() {
    return $unset_attribute_type.instance();
  }
  
  public $unset_attribute_type.Matcher get$unset_attribute_type(final ViatraQueryEngine engine) {
    return $unset_attribute_type.Matcher.on(engine);
  }
  
  public $initial_attribute_type get$initial_attribute_type() {
    return $initial_attribute_type.instance();
  }
  
  public $initial_attribute_type.Matcher get$initial_attribute_type(final ViatraQueryEngine engine) {
    return $initial_attribute_type.Matcher.on(engine);
  }
  
  public $current_attribute_type get$current_attribute_type() {
    return $current_attribute_type.instance();
  }
  
  public $current_attribute_type.Matcher get$current_attribute_type(final ViatraQueryEngine engine) {
    return $current_attribute_type.Matcher.on(engine);
  }
  
  public $reference get$reference() {
    return $reference.instance();
  }
  
  public $reference.Matcher get$reference(final ViatraQueryEngine engine) {
    return $reference.Matcher.on(engine);
  }
  
  public $created_reference get$created_reference() {
    return $created_reference.instance();
  }
  
  public $created_reference.Matcher get$created_reference(final ViatraQueryEngine engine) {
    return $created_reference.Matcher.on(engine);
  }
  
  public $deleted_reference get$deleted_reference() {
    return $deleted_reference.instance();
  }
  
  public $deleted_reference.Matcher get$deleted_reference(final ViatraQueryEngine engine) {
    return $deleted_reference.Matcher.on(engine);
  }
  
  public $initial_reference get$initial_reference() {
    return $initial_reference.instance();
  }
  
  public $initial_reference.Matcher get$initial_reference(final ViatraQueryEngine engine) {
    return $initial_reference.Matcher.on(engine);
  }
  
  public $current_reference get$current_reference() {
    return $current_reference.instance();
  }
  
  public $current_reference.Matcher get$current_reference(final ViatraQueryEngine engine) {
    return $current_reference.Matcher.on(engine);
  }
  
  public $reference_name get$reference_name() {
    return $reference_name.instance();
  }
  
  public $reference_name.Matcher get$reference_name(final ViatraQueryEngine engine) {
    return $reference_name.Matcher.on(engine);
  }
  
  public $set_reference_name get$set_reference_name() {
    return $set_reference_name.instance();
  }
  
  public $set_reference_name.Matcher get$set_reference_name(final ViatraQueryEngine engine) {
    return $set_reference_name.Matcher.on(engine);
  }
  
  public $unset_reference_name get$unset_reference_name() {
    return $unset_reference_name.instance();
  }
  
  public $unset_reference_name.Matcher get$unset_reference_name(final ViatraQueryEngine engine) {
    return $unset_reference_name.Matcher.on(engine);
  }
  
  public $initial_reference_name get$initial_reference_name() {
    return $initial_reference_name.instance();
  }
  
  public $initial_reference_name.Matcher get$initial_reference_name(final ViatraQueryEngine engine) {
    return $initial_reference_name.Matcher.on(engine);
  }
  
  public $current_reference_name get$current_reference_name() {
    return $current_reference_name.instance();
  }
  
  public $current_reference_name.Matcher get$current_reference_name(final ViatraQueryEngine engine) {
    return $current_reference_name.Matcher.on(engine);
  }
  
  public $reference_owner get$reference_owner() {
    return $reference_owner.instance();
  }
  
  public $reference_owner.Matcher get$reference_owner(final ViatraQueryEngine engine) {
    return $reference_owner.Matcher.on(engine);
  }
  
  public $set_reference_owner get$set_reference_owner() {
    return $set_reference_owner.instance();
  }
  
  public $set_reference_owner.Matcher get$set_reference_owner(final ViatraQueryEngine engine) {
    return $set_reference_owner.Matcher.on(engine);
  }
  
  public $unset_reference_owner get$unset_reference_owner() {
    return $unset_reference_owner.instance();
  }
  
  public $unset_reference_owner.Matcher get$unset_reference_owner(final ViatraQueryEngine engine) {
    return $unset_reference_owner.Matcher.on(engine);
  }
  
  public $initial_reference_owner get$initial_reference_owner() {
    return $initial_reference_owner.instance();
  }
  
  public $initial_reference_owner.Matcher get$initial_reference_owner(final ViatraQueryEngine engine) {
    return $initial_reference_owner.Matcher.on(engine);
  }
  
  public $current_reference_owner get$current_reference_owner() {
    return $current_reference_owner.instance();
  }
  
  public $current_reference_owner.Matcher get$current_reference_owner(final ViatraQueryEngine engine) {
    return $current_reference_owner.Matcher.on(engine);
  }
  
  public $reference_lower get$reference_lower() {
    return $reference_lower.instance();
  }
  
  public $reference_lower.Matcher get$reference_lower(final ViatraQueryEngine engine) {
    return $reference_lower.Matcher.on(engine);
  }
  
  public $set_reference_lower get$set_reference_lower() {
    return $set_reference_lower.instance();
  }
  
  public $set_reference_lower.Matcher get$set_reference_lower(final ViatraQueryEngine engine) {
    return $set_reference_lower.Matcher.on(engine);
  }
  
  public $unset_reference_lower get$unset_reference_lower() {
    return $unset_reference_lower.instance();
  }
  
  public $unset_reference_lower.Matcher get$unset_reference_lower(final ViatraQueryEngine engine) {
    return $unset_reference_lower.Matcher.on(engine);
  }
  
  public $initial_reference_lower get$initial_reference_lower() {
    return $initial_reference_lower.instance();
  }
  
  public $initial_reference_lower.Matcher get$initial_reference_lower(final ViatraQueryEngine engine) {
    return $initial_reference_lower.Matcher.on(engine);
  }
  
  public $current_reference_lower get$current_reference_lower() {
    return $current_reference_lower.instance();
  }
  
  public $current_reference_lower.Matcher get$current_reference_lower(final ViatraQueryEngine engine) {
    return $current_reference_lower.Matcher.on(engine);
  }
  
  public $reference_upper get$reference_upper() {
    return $reference_upper.instance();
  }
  
  public $reference_upper.Matcher get$reference_upper(final ViatraQueryEngine engine) {
    return $reference_upper.Matcher.on(engine);
  }
  
  public $set_reference_upper get$set_reference_upper() {
    return $set_reference_upper.instance();
  }
  
  public $set_reference_upper.Matcher get$set_reference_upper(final ViatraQueryEngine engine) {
    return $set_reference_upper.Matcher.on(engine);
  }
  
  public $unset_reference_upper get$unset_reference_upper() {
    return $unset_reference_upper.instance();
  }
  
  public $unset_reference_upper.Matcher get$unset_reference_upper(final ViatraQueryEngine engine) {
    return $unset_reference_upper.Matcher.on(engine);
  }
  
  public $initial_reference_upper get$initial_reference_upper() {
    return $initial_reference_upper.instance();
  }
  
  public $initial_reference_upper.Matcher get$initial_reference_upper(final ViatraQueryEngine engine) {
    return $initial_reference_upper.Matcher.on(engine);
  }
  
  public $current_reference_upper get$current_reference_upper() {
    return $current_reference_upper.instance();
  }
  
  public $current_reference_upper.Matcher get$current_reference_upper(final ViatraQueryEngine engine) {
    return $current_reference_upper.Matcher.on(engine);
  }
  
  public $reference_containment get$reference_containment() {
    return $reference_containment.instance();
  }
  
  public $reference_containment.Matcher get$reference_containment(final ViatraQueryEngine engine) {
    return $reference_containment.Matcher.on(engine);
  }
  
  public $set_reference_containment get$set_reference_containment() {
    return $set_reference_containment.instance();
  }
  
  public $set_reference_containment.Matcher get$set_reference_containment(final ViatraQueryEngine engine) {
    return $set_reference_containment.Matcher.on(engine);
  }
  
  public $unset_reference_containment get$unset_reference_containment() {
    return $unset_reference_containment.instance();
  }
  
  public $unset_reference_containment.Matcher get$unset_reference_containment(final ViatraQueryEngine engine) {
    return $unset_reference_containment.Matcher.on(engine);
  }
  
  public $initial_reference_containment get$initial_reference_containment() {
    return $initial_reference_containment.instance();
  }
  
  public $initial_reference_containment.Matcher get$initial_reference_containment(final ViatraQueryEngine engine) {
    return $initial_reference_containment.Matcher.on(engine);
  }
  
  public $current_reference_containment get$current_reference_containment() {
    return $current_reference_containment.instance();
  }
  
  public $current_reference_containment.Matcher get$current_reference_containment(final ViatraQueryEngine engine) {
    return $current_reference_containment.Matcher.on(engine);
  }
  
  public $reference_opposite get$reference_opposite() {
    return $reference_opposite.instance();
  }
  
  public $reference_opposite.Matcher get$reference_opposite(final ViatraQueryEngine engine) {
    return $reference_opposite.Matcher.on(engine);
  }
  
  public $set_reference_opposite get$set_reference_opposite() {
    return $set_reference_opposite.instance();
  }
  
  public $set_reference_opposite.Matcher get$set_reference_opposite(final ViatraQueryEngine engine) {
    return $set_reference_opposite.Matcher.on(engine);
  }
  
  public $unset_reference_opposite get$unset_reference_opposite() {
    return $unset_reference_opposite.instance();
  }
  
  public $unset_reference_opposite.Matcher get$unset_reference_opposite(final ViatraQueryEngine engine) {
    return $unset_reference_opposite.Matcher.on(engine);
  }
  
  public $initial_reference_opposite get$initial_reference_opposite() {
    return $initial_reference_opposite.instance();
  }
  
  public $initial_reference_opposite.Matcher get$initial_reference_opposite(final ViatraQueryEngine engine) {
    return $initial_reference_opposite.Matcher.on(engine);
  }
  
  public $current_reference_opposite get$current_reference_opposite() {
    return $current_reference_opposite.instance();
  }
  
  public $current_reference_opposite.Matcher get$current_reference_opposite(final ViatraQueryEngine engine) {
    return $current_reference_opposite.Matcher.on(engine);
  }
  
  public $reference_type get$reference_type() {
    return $reference_type.instance();
  }
  
  public $reference_type.Matcher get$reference_type(final ViatraQueryEngine engine) {
    return $reference_type.Matcher.on(engine);
  }
  
  public $set_reference_type get$set_reference_type() {
    return $set_reference_type.instance();
  }
  
  public $set_reference_type.Matcher get$set_reference_type(final ViatraQueryEngine engine) {
    return $set_reference_type.Matcher.on(engine);
  }
  
  public $unset_reference_type get$unset_reference_type() {
    return $unset_reference_type.instance();
  }
  
  public $unset_reference_type.Matcher get$unset_reference_type(final ViatraQueryEngine engine) {
    return $unset_reference_type.Matcher.on(engine);
  }
  
  public $initial_reference_type get$initial_reference_type() {
    return $initial_reference_type.instance();
  }
  
  public $initial_reference_type.Matcher get$initial_reference_type(final ViatraQueryEngine engine) {
    return $initial_reference_type.Matcher.on(engine);
  }
  
  public $current_reference_type get$current_reference_type() {
    return $current_reference_type.instance();
  }
  
  public $current_reference_type.Matcher get$current_reference_type(final ViatraQueryEngine engine) {
    return $current_reference_type.Matcher.on(engine);
  }
}
