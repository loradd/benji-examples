package se.mdh.idt.benji.examples.refactorings;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import se.mdh.idt.benji.difference.api.Difference;
import se.mdh.idt.benji.difference.api.DifferenceFactory;
import se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.AddClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeClassAbstractPostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeClassAbstractPrecondition;
import se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.DeletePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeletePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.DeleteReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition;
import se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition;
import se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition;
import se.mdh.idt.benji.examples.refactorings.MergeReferencesPrecondition;
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.RestrictReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.AttributeActions;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassActions;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.PackageActions;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ReferenceActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class Differences {
  @Extension
  private static MetamodelFactory _metamodelFactory = MetamodelFactory.eINSTANCE;
  
  public final static Difference<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, IMatchProcessor<RenamePackagePrecondition.Match>> renamePackage = DifferenceFactory.<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, IMatchProcessor<RenamePackagePrecondition.Match>>difference().name("RenamePackage").precondition(RenamePackagePrecondition.instance()).action(
    ((IMatchProcessor<RenamePackagePrecondition.Match>) (RenamePackagePrecondition.Match it) -> {
      PackageActions.set_package_name(it.get$package(), it.get$name());
    })).postcondition(RenamePackagePostcondition.instance()).build();
  
  public final static Difference<RenameURIPackagePrecondition.Match, RenameURIPackagePrecondition.Matcher, RenameURIPackagePrecondition, RenameURIPackagePostcondition.Match, RenameURIPackagePostcondition.Matcher, RenameURIPackagePostcondition, IMatchProcessor<RenameURIPackagePrecondition.Match>> renameURIPackage = DifferenceFactory.<RenameURIPackagePrecondition.Match, RenameURIPackagePrecondition.Matcher, RenameURIPackagePrecondition, RenameURIPackagePostcondition.Match, RenameURIPackagePostcondition.Matcher, RenameURIPackagePostcondition, IMatchProcessor<RenameURIPackagePrecondition.Match>>difference().name("RenameURIPackage").precondition(RenameURIPackagePrecondition.instance()).action(
    ((IMatchProcessor<RenameURIPackagePrecondition.Match>) (RenameURIPackagePrecondition.Match it) -> {
      PackageActions.set_package_uri(it.get$package(), it.get$uri());
    })).postcondition(RenameURIPackagePostcondition.instance()).build();
  
  public final static Difference<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, IMatchProcessor<DeletePackagePrecondition.Match>> deletePackage = DifferenceFactory.<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, IMatchProcessor<DeletePackagePrecondition.Match>>difference().name("DeletePackage").precondition(DeletePackagePrecondition.instance()).action(
    ((IMatchProcessor<DeletePackagePrecondition.Match>) (DeletePackagePrecondition.Match it) -> {
      PackageActions.delete_package(it.get$package());
    })).postcondition(DeletePackagePostcondition.instance()).build();
  
  public final static Difference<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, IMatchProcessor<AddPackagePrecondition.Match>> addPackage = DifferenceFactory.<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, IMatchProcessor<AddPackagePrecondition.Match>>difference().name("AddPackage").precondition(AddPackagePrecondition.instance()).action(
    ((IMatchProcessor<AddPackagePrecondition.Match>) (AddPackagePrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Package $subPackage = PackageActions.create_package();
      PackageActions.set_package_name($subPackage, it.get$subPackage_name());
      PackageActions.insert_package_subPackage(it.get$package(), $subPackage);
    })).postcondition(AddPackagePostcondition.instance()).build();
  
  public final static Difference<AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, IMatchProcessor<AddClassPrecondition.Match>> addClass = DifferenceFactory.<AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, IMatchProcessor<AddClassPrecondition.Match>>difference().name("AddClass").precondition(AddClassPrecondition.instance()).action(
    ((IMatchProcessor<AddClassPrecondition.Match>) (AddClassPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Class $class = ClassActions.create_class();
      ClassActions.set_class_name($class, it.get$class_name());
      PackageActions.insert_package_class(it.get$package(), $class);
    })).postcondition(AddClassPrecondition.instance()).build();
  
  public final static Difference<RenameClassPrecondition.Match, RenameClassPrecondition.Matcher, RenameClassPrecondition, RenameClassPostcondition.Match, RenameClassPostcondition.Matcher, RenameClassPostcondition, IMatchProcessor<RenameClassPrecondition.Match>> renameClass = DifferenceFactory.<RenameClassPrecondition.Match, RenameClassPrecondition.Matcher, RenameClassPrecondition, RenameClassPostcondition.Match, RenameClassPostcondition.Matcher, RenameClassPostcondition, IMatchProcessor<RenameClassPrecondition.Match>>difference().name("RenameClass").precondition(RenameClassPrecondition.instance()).action(
    ((IMatchProcessor<RenameClassPrecondition.Match>) (RenameClassPrecondition.Match it) -> {
      ClassActions.set_class_name(it.get$class(), it.get$name());
    })).postcondition(RenameClassPostcondition.instance()).build();
  
  public final static Difference<DeleteClassPrecondition.Match, DeleteClassPrecondition.Matcher, DeleteClassPrecondition, DeleteClassPostcondition.Match, DeleteClassPostcondition.Matcher, DeleteClassPostcondition, IMatchProcessor<DeleteClassPrecondition.Match>> deleteClass = DifferenceFactory.<DeleteClassPrecondition.Match, DeleteClassPrecondition.Matcher, DeleteClassPrecondition, DeleteClassPostcondition.Match, DeleteClassPostcondition.Matcher, DeleteClassPostcondition, IMatchProcessor<DeleteClassPrecondition.Match>>difference().name("DeleteClass").precondition(DeleteClassPrecondition.instance()).action(
    ((IMatchProcessor<DeleteClassPrecondition.Match>) (DeleteClassPrecondition.Match it) -> {
      ClassActions.delete_class(it.get$class());
    })).postcondition(DeleteClassPostcondition.instance()).build();
  
  public final static Difference<ExtractClassPrecondition.Match, ExtractClassPrecondition.Matcher, ExtractClassPrecondition, ExtractClassPostcondition.Match, ExtractClassPostcondition.Matcher, ExtractClassPostcondition, IMatchProcessor<ExtractClassPrecondition.Match>> extractClass = DifferenceFactory.<ExtractClassPrecondition.Match, ExtractClassPrecondition.Matcher, ExtractClassPrecondition, ExtractClassPostcondition.Match, ExtractClassPostcondition.Matcher, ExtractClassPostcondition, IMatchProcessor<ExtractClassPrecondition.Match>>difference().name("ExtractClass").precondition(ExtractClassPrecondition.instance()).action(
    ((IMatchProcessor<ExtractClassPrecondition.Match>) (ExtractClassPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Class $attribute_class = ClassActions.create_class();
      ClassActions.set_class_name($attribute_class, it.get$attribute_class_name());
      PackageActions.insert_package_class(it.get$package(), $attribute_class);
      final Reference $attribute_reference = ReferenceActions.create_reference();
      ReferenceActions.set_reference_name($attribute_reference, it.get$attribute_reference_name());
      ReferenceActions.set_reference_type($attribute_reference, $attribute_class);
      ClassActions.insert_class_reference(it.get$class(), $attribute_reference);
      AttributeActions.delete_attribute(it.get$attribute());
    })).postcondition(ExtractClassPostcondition.instance()).build();
  
  public final static Difference<MergeClassesPrecondition.Match, MergeClassesPrecondition.Matcher, MergeClassesPrecondition, MergeClassesPostcondition.Match, MergeClassesPostcondition.Matcher, MergeClassesPostcondition, IMatchProcessor<MergeClassesPrecondition.Match>> mergeClasses = DifferenceFactory.<MergeClassesPrecondition.Match, MergeClassesPrecondition.Matcher, MergeClassesPrecondition, MergeClassesPostcondition.Match, MergeClassesPostcondition.Matcher, MergeClassesPostcondition, IMatchProcessor<MergeClassesPrecondition.Match>>difference().name("MergeClasses").precondition(MergeClassesPrecondition.instance()).action(
    ((IMatchProcessor<MergeClassesPrecondition.Match>) (MergeClassesPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_class = ClassActions.create_class();
      PackageActions.insert_package_class(it.get$package(), $merged_class);
      ClassActions.set_class_name($merged_class, it.get$merged_class_name());
      Differences.merge_class_attribute_intersection(it.get$left_class(), it.get$right_class(), $merged_class);
      Differences.move_class_attribute_difference(it.get$left_class(), it.get$right_class(), $merged_class);
      Differences.move_class_attribute_difference(it.get$right_class(), it.get$left_class(), $merged_class);
      Differences.merge_class_reference_intersection(it.get$left_class(), it.get$right_class(), $merged_class);
      Differences.move_class_reference_difference(it.get$left_class(), it.get$right_class(), $merged_class);
      Differences.move_class_reference_difference(it.get$right_class(), it.get$left_class(), $merged_class);
      Differences.change_incoming_reference_type(it.get$left_class(), $merged_class);
      Differences.change_incoming_reference_type(it.get$right_class(), $merged_class);
      ClassActions.delete_class(it.get$left_class());
      ClassActions.delete_class(it.get$right_class());
    })).postcondition(MergeClassesPostcondition.instance()).build();
  
  public final static Difference<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, IMatchProcessor<AddAttributePrecondition.Match>> addAttribute = DifferenceFactory.<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, IMatchProcessor<AddAttributePrecondition.Match>>difference().name("AddAttribute").precondition(AddAttributePrecondition.instance()).action(
    ((IMatchProcessor<AddAttributePrecondition.Match>) (AddAttributePrecondition.Match it) -> {
      final Attribute $attribute = AttributeActions.create_attribute();
      AttributeActions.set_attribute_name($attribute, it.get$name());
      AttributeActions.set_attribute_type($attribute, it.get$type());
      ClassActions.insert_class_attribute(it.get$class(), $attribute);
    })).postcondition(AddAttributePostcondition.instance()).build();
  
  public final static Difference<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, IMatchProcessor<DeleteAttributePrecondition.Match>> deleteAttribute = DifferenceFactory.<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, IMatchProcessor<DeleteAttributePrecondition.Match>>difference().name("DeleteAttribute").precondition(DeleteAttributePrecondition.instance()).action(
    ((IMatchProcessor<DeleteAttributePrecondition.Match>) (DeleteAttributePrecondition.Match it) -> {
      AttributeActions.delete_attribute(it.get$attribute());
    })).postcondition(DeleteAttributePostcondition.instance()).build();
  
  public final static Difference<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, IMatchProcessor<ChangeAttributeTypePrecondition.Match>> changeAttributeType = DifferenceFactory.<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, IMatchProcessor<ChangeAttributeTypePrecondition.Match>>difference().name("ChangeAttributeType").precondition(ChangeAttributeTypePrecondition.instance()).action(
    ((IMatchProcessor<ChangeAttributeTypePrecondition.Match>) (ChangeAttributeTypePrecondition.Match it) -> {
      AttributeActions.set_attribute_type(it.get$attribute(), it.get$target_type());
    })).postcondition(ChangeAttributeTypePostcondition.instance()).build();
  
  public final static Difference<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, IMatchProcessor<AddReferencePrecondition.Match>> addReference = DifferenceFactory.<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, IMatchProcessor<AddReferencePrecondition.Match>>difference().name("AddReference").precondition(AddReferencePrecondition.instance()).action(
    ((IMatchProcessor<AddReferencePrecondition.Match>) (AddReferencePrecondition.Match it) -> {
      final Reference $reference = ReferenceActions.create_reference();
      ReferenceActions.set_reference_name($reference, it.get$name());
      ReferenceActions.set_reference_type($reference, it.get$type());
      ClassActions.insert_class_reference(it.get$class(), $reference);
    })).postcondition(AddReferencePostcondition.instance()).build();
  
  public final static Difference<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, IMatchProcessor<DeleteReferencePrecondition.Match>> deleteReference = DifferenceFactory.<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, IMatchProcessor<DeleteReferencePrecondition.Match>>difference().name("DeleteReference").precondition(DeleteReferencePrecondition.instance()).action(
    ((IMatchProcessor<DeleteReferencePrecondition.Match>) (DeleteReferencePrecondition.Match it) -> {
      ReferenceActions.delete_reference(it.get$reference());
    })).postcondition(DeleteReferencePostcondition.instance()).build();
  
  public final static Difference<MergeReferencesPrecondition.Match, MergeReferencesPrecondition.Matcher, MergeReferencesPrecondition, MergeReferencesPostcondition.Match, MergeReferencesPostcondition.Matcher, MergeReferencesPostcondition, IMatchProcessor<MergeReferencesPrecondition.Match>> mergeReferences = DifferenceFactory.<MergeReferencesPrecondition.Match, MergeReferencesPrecondition.Matcher, MergeReferencesPrecondition, MergeReferencesPostcondition.Match, MergeReferencesPostcondition.Matcher, MergeReferencesPostcondition, IMatchProcessor<MergeReferencesPrecondition.Match>>difference().name("MergeReferences").precondition(MergeReferencesPrecondition.instance()).action(
    ((IMatchProcessor<MergeReferencesPrecondition.Match>) (MergeReferencesPrecondition.Match it) -> {
      Differences.merge_reference(it.get$left_reference(), it.get$right_reference(), it.get$class());
    })).postcondition(MergeReferencesPostcondition.instance()).build();
  
  public final static Difference<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, IMatchProcessor<ChangeReferenceTypePrecondition.Match>> changeReferenceType = DifferenceFactory.<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, IMatchProcessor<ChangeReferenceTypePrecondition.Match>>difference().name("ChangeReferenceType").precondition(ChangeReferenceTypePrecondition.instance()).action(
    ((IMatchProcessor<ChangeReferenceTypePrecondition.Match>) (ChangeReferenceTypePrecondition.Match it) -> {
      ReferenceActions.set_reference_type(it.get$reference(), it.get$target_type());
    })).postcondition(ChangeReferenceTypePostcondition.instance()).build();
  
  public final static Difference<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, IMatchProcessor<ExtractSuperclassPrecondition.Match>> extractSuperclass = DifferenceFactory.<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, IMatchProcessor<ExtractSuperclassPrecondition.Match>>difference().name("ExtractSuperclass").precondition(ExtractSuperclassPrecondition.instance()).action(
    ((IMatchProcessor<ExtractSuperclassPrecondition.Match>) (ExtractSuperclassPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_superClass = ClassActions.create_class();
      String __class_name = ClassActions.get_class_name(it.get$class());
      final String $superClass_name = ("super_" + __class_name);
      ClassActions.set_class_name($target_superClass, $superClass_name);
      Differences.move_reference(it.get$reference(), $target_superClass);
      Differences.move_attribute(it.get$attribute(), $target_superClass);
      ClassActions.set_class_superClass($target_superClass, it.get$source_superClass());
      ClassActions.set_class_superClass(it.get$class(), $target_superClass);
    })).postcondition(ExtractSuperclassPostcondition.instance()).build();
  
  public final static Difference<ChangeClassAbstractPrecondition.Match, ChangeClassAbstractPrecondition.Matcher, ChangeClassAbstractPrecondition, ChangeClassAbstractPostcondition.Match, ChangeClassAbstractPostcondition.Matcher, ChangeClassAbstractPostcondition, IMatchProcessor<ChangeClassAbstractPrecondition.Match>> changeClassAbstract = DifferenceFactory.<ChangeClassAbstractPrecondition.Match, ChangeClassAbstractPrecondition.Matcher, ChangeClassAbstractPrecondition, ChangeClassAbstractPostcondition.Match, ChangeClassAbstractPostcondition.Matcher, ChangeClassAbstractPostcondition, IMatchProcessor<ChangeClassAbstractPrecondition.Match>>difference().name("ChangeClassAbstract").precondition(ChangeClassAbstractPrecondition.instance()).action(
    ((IMatchProcessor<ChangeClassAbstractPrecondition.Match>) (ChangeClassAbstractPrecondition.Match it) -> {
      TraceLink _$class = it.get$class();
      Boolean __class_abstract = ClassActions.get_class_abstract(it.get$class());
      boolean _not = (!(__class_abstract).booleanValue());
      ClassActions.set_class_abstract(_$class, Boolean.valueOf(_not));
    })).postcondition(ChangeClassAbstractPostcondition.instance()).build();
  
  public final static Difference<RestrictReferencePrecondition.Match, RestrictReferencePrecondition.Matcher, RestrictReferencePrecondition, RestrictReferencePostcondition.Match, RestrictReferencePostcondition.Matcher, RestrictReferencePostcondition, IMatchProcessor<RestrictReferencePrecondition.Match>> restrictReference = DifferenceFactory.<RestrictReferencePrecondition.Match, RestrictReferencePrecondition.Matcher, RestrictReferencePrecondition, RestrictReferencePostcondition.Match, RestrictReferencePostcondition.Matcher, RestrictReferencePostcondition, IMatchProcessor<RestrictReferencePrecondition.Match>>difference().name("RestrictReference").precondition(RestrictReferencePrecondition.instance()).action(
    ((IMatchProcessor<RestrictReferencePrecondition.Match>) (RestrictReferencePrecondition.Match it) -> {
      ReferenceActions.set_reference_upper(it.get$reference(), Integer.valueOf(Math.max(1, (it.get$source_lower()).intValue())));
    })).postcondition(RestrictReferencePostcondition.instance()).build();
  
  public final static Difference<PushDownAttributePrecondition.Match, PushDownAttributePrecondition.Matcher, PushDownAttributePrecondition, PushDownAttributePostcondition.Match, PushDownAttributePostcondition.Matcher, PushDownAttributePostcondition, IMatchProcessor<PushDownAttributePrecondition.Match>> pushDownAttribute = DifferenceFactory.<PushDownAttributePrecondition.Match, PushDownAttributePrecondition.Matcher, PushDownAttributePrecondition, PushDownAttributePostcondition.Match, PushDownAttributePostcondition.Matcher, PushDownAttributePostcondition, IMatchProcessor<PushDownAttributePrecondition.Match>>difference().name("PushDownAttribute").precondition(PushDownAttributePrecondition.instance()).action(
    ((IMatchProcessor<PushDownAttributePrecondition.Match>) (PushDownAttributePrecondition.Match it) -> {
      Differences.move_attribute(it.get$attribute(), it.get$subClass());
    })).postcondition(PushDownAttributePostcondition.instance()).build();
  
  private static void change_incoming_reference_type(final TraceLink $source_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_type) {
    Differences.change_incoming_reference_type($source_type.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $target_type);
  }
  
  private static void change_incoming_reference_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $source_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_type) {
    final Function1<Reference, Boolean> _function = (Reference $reference) -> {
      se.mdh.idt.benji.examples.refactorings.metamodel.Class __reference_type = ReferenceActions.get_reference_type($reference);
      return Boolean.valueOf(Objects.equal(__reference_type, $source_type));
    };
    final Procedure1<Reference> _function_1 = (Reference $reference) -> {
      ReferenceActions.set_reference_type($reference, $target_type);
    };
    IteratorExtensions.<Reference>forEach(IteratorExtensions.<Reference>filter(Iterators.<Reference>filter($source_type.eResource().getAllContents(), Reference.class), _function), _function_1);
  }
  
  private static Reference create_class_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $class) {
    Reference _createReference = Differences._metamodelFactory.createReference();
    final Procedure1<Reference> _function = (Reference $reference) -> {
      ClassActions.insert_class_reference($class, $reference);
    };
    return ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function);
  }
  
  private static Attribute create_class_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $class) {
    Attribute _createAttribute = Differences._metamodelFactory.createAttribute();
    final Procedure1<Attribute> _function = (Attribute $attribute) -> {
      ClassActions.insert_class_attribute($class, $attribute);
    };
    return ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function);
  }
  
  private static void merge_class_attribute_intersection(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_class) {
    final Consumer<Pair<Attribute, Attribute>> _function = (Pair<Attribute, Attribute> $attributes) -> {
      Differences.merge_attribute($attributes.getKey(), $attributes.getValue(), $merged_class);
    };
    Differences.get_class_attribute_intersection($left_class, $right_class).forEach(_function);
  }
  
  private static void merge_class_attribute_intersection(final TraceLink $left_class, final TraceLink $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_class) {
    Differences.merge_class_attribute_intersection($left_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $right_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $merged_class);
  }
  
  private static void merge_class_reference_intersection(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_class) {
    final Consumer<Pair<Reference, Reference>> _function = (Pair<Reference, Reference> $references) -> {
      Differences.merge_reference($references.getKey(), $references.getValue(), $merged_class);
    };
    Differences.get_class_reference_intersection($left_class, $right_class).forEach(_function);
  }
  
  private static void merge_class_reference_intersection(final TraceLink $left_class, final TraceLink $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_class) {
    Differences.merge_class_reference_intersection($left_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $right_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $merged_class);
  }
  
  private static void move_class_attribute_difference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    final Consumer<Attribute> _function = (Attribute $left_attribute) -> {
      Differences.move_attribute($left_attribute, $target_class);
    };
    Differences.get_class_attribute_difference($left_class, $right_class).forEach(_function);
  }
  
  private static void move_class_attribute_difference(final TraceLink $left_class, final TraceLink $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    Differences.move_class_attribute_difference($left_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $right_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $target_class);
  }
  
  private static void move_class_reference_difference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    final Consumer<Reference> _function = (Reference $left_reference) -> {
      Differences.move_reference($left_reference, $target_class);
    };
    Differences.get_class_reference_difference($left_class, $right_class).forEach(_function);
  }
  
  private static void move_class_reference_difference(final TraceLink $left_class, final TraceLink $right_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    Differences.move_class_reference_difference($left_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $right_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), $target_class);
  }
  
  private static List<Pair<Attribute, Attribute>> get_class_attribute_intersection(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class) {
    final Function1<Attribute, Pair<Attribute, Attribute>> _function = (Attribute $left_attribute) -> {
      Pair<Attribute, Attribute> _xblockexpression = null;
      {
        final Function1<Attribute, Boolean> _function_1 = (Attribute $right_attribute) -> {
          String __attribute_name = AttributeActions.get_attribute_name($right_attribute);
          String __attribute_name_1 = AttributeActions.get_attribute_name($left_attribute);
          return Boolean.valueOf(Objects.equal(__attribute_name, __attribute_name_1));
        };
        final Attribute $right_attribute = IterableExtensions.<Attribute>findFirst(ClassActions.get_class_attributes($right_class), _function_1);
        Pair<Attribute, Attribute> _xifexpression = null;
        if (($right_attribute != null)) {
          _xifexpression = Pair.<Attribute, Attribute>of($left_attribute, $right_attribute);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return IterableExtensions.<Pair<Attribute, Attribute>>toList(IterableExtensions.<Pair<Attribute, Attribute>>filterNull(IterableExtensions.<Attribute, Pair<Attribute, Attribute>>map(ClassActions.get_class_attributes($left_class), _function)));
  }
  
  private static List<Pair<Reference, Reference>> get_class_reference_intersection(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class) {
    final Function1<Reference, Pair<Reference, Reference>> _function = (Reference $left_reference) -> {
      Pair<Reference, Reference> _xblockexpression = null;
      {
        final Function1<Reference, Boolean> _function_1 = (Reference $right_reference) -> {
          String __reference_name = ReferenceActions.get_reference_name($right_reference);
          String __reference_name_1 = ReferenceActions.get_reference_name($left_reference);
          return Boolean.valueOf(Objects.equal(__reference_name, __reference_name_1));
        };
        final Reference $right_reference = IterableExtensions.<Reference>findFirst(ClassActions.get_class_references($right_class), _function_1);
        Pair<Reference, Reference> _xifexpression = null;
        if (($right_reference != null)) {
          _xifexpression = Pair.<Reference, Reference>of($left_reference, $right_reference);
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    return IterableExtensions.<Pair<Reference, Reference>>toList(IterableExtensions.<Pair<Reference, Reference>>filterNull(IterableExtensions.<Reference, Pair<Reference, Reference>>map(ClassActions.get_class_references($left_class), _function)));
  }
  
  private static List<Attribute> get_class_attribute_difference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class) {
    final Function1<Attribute, Boolean> _function = (Attribute $left_attribute) -> {
      final Function1<Attribute, Boolean> _function_1 = (Attribute $right_attribute) -> {
        String __attribute_name = AttributeActions.get_attribute_name($right_attribute);
        String __attribute_name_1 = AttributeActions.get_attribute_name($left_attribute);
        return Boolean.valueOf(Objects.equal(__attribute_name, __attribute_name_1));
      };
      return Boolean.valueOf(IterableExtensions.<Attribute>exists(ClassActions.get_class_attributes($right_class), _function_1));
    };
    return IterableExtensions.<Attribute>toList(IterableExtensions.<Attribute>reject(ClassActions.get_class_attributes($left_class), _function));
  }
  
  private static List<Reference> get_class_reference_difference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class) {
    final Function1<Reference, Boolean> _function = (Reference $left_reference) -> {
      final Function1<Reference, Boolean> _function_1 = (Reference $right_reference) -> {
        String __reference_name = ReferenceActions.get_reference_name($right_reference);
        String __reference_name_1 = ReferenceActions.get_reference_name($left_reference);
        return Boolean.valueOf(Objects.equal(__reference_name, __reference_name_1));
      };
      return Boolean.valueOf(IterableExtensions.<Reference>exists(ClassActions.get_class_references($right_class), _function_1));
    };
    return IterableExtensions.<Reference>toList(IterableExtensions.<Reference>reject(ClassActions.get_class_references($left_class), _function));
  }
  
  private static void move_attribute(final Attribute $source_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    final Attribute $target_attribute = Differences.create_class_attribute($target_class);
    Differences.move_attribute_name($source_attribute, $target_attribute);
    Differences.move_attribute_type($source_attribute, $target_attribute);
    AttributeActions.delete_attribute($source_attribute);
  }
  
  private static void move_attribute(final TraceLink $source_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    Differences.move_attribute($source_attribute.<Attribute>target(), $target_class);
  }
  
  private static void move_attribute(final TraceLink $source_attribute, final TraceLink $target_class) {
    Differences.move_attribute($source_attribute.<Attribute>target(), $target_class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  private static void move_reference(final Reference $source_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    final Reference $target_reference = Differences.create_class_reference($target_class);
    Differences.move_reference_name($source_reference, $target_reference);
    Differences.move_reference_type($source_reference, $target_reference);
    ReferenceActions.delete_reference($source_reference);
  }
  
  private static void move_reference(final TraceLink $source_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_class) {
    Differences.move_reference($source_reference.<Reference>target(), $target_class);
  }
  
  private static void move_attribute_name(final Attribute $source_attribute, final Attribute $target_attribute) {
    final String $target_attribute_name = AttributeActions.get_attribute_name($source_attribute);
    AttributeActions.set_attribute_name($target_attribute, $target_attribute_name);
  }
  
  private static void move_reference_name(final Reference $source_reference, final Reference $target_reference) {
    final String $target_reference_name = ReferenceActions.get_reference_name($source_reference);
    ReferenceActions.set_reference_name($target_reference, $target_reference_name);
  }
  
  private static void move_attribute_type(final Attribute $source_attribute, final Attribute $target_attribute) {
    final DataType $target_attribute_type = AttributeActions.get_attribute_type($source_attribute);
    AttributeActions.set_attribute_type($target_attribute, $target_attribute_type);
  }
  
  private static void move_reference_type(final Reference $source_reference, final Reference $target_reference) {
    final se.mdh.idt.benji.examples.refactorings.metamodel.Class $target_reference_type = ReferenceActions.get_reference_type($source_reference);
    ReferenceActions.set_reference_type($target_reference, $target_reference_type);
  }
  
  private static void merge_attribute(final Attribute $left_attribute, final Attribute $right_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_class) {
    final Attribute $merged_attribute = Differences.create_class_attribute($merged_class);
    Differences.merge_attribute_name($left_attribute, $right_attribute, $merged_attribute);
    Differences.merge_attribute_type($left_attribute, $right_attribute, $merged_attribute);
    AttributeActions.delete_attribute($left_attribute);
    AttributeActions.delete_attribute($right_attribute);
  }
  
  private static void merge_reference(final Reference $left_reference, final Reference $right_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_class) {
    final Reference $merged_reference = Differences.create_class_reference($merged_class);
    Differences.merge_reference_name($left_reference, $right_reference, $merged_reference);
    Differences.merge_reference_type($left_reference, $right_reference, $merged_reference);
    ReferenceActions.delete_reference($left_reference);
    ReferenceActions.delete_reference($right_reference);
  }
  
  private static void merge_reference(final TraceLink $left_reference, final TraceLink $right_reference, final TraceLink $class) {
    Differences.merge_reference($left_reference.<Reference>target(), $right_reference.<Reference>target(), $class.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  private static void merge_attribute_name(final Attribute $left_attribute, final Attribute $right_attribute, final Attribute $merged_attribute) {
    final String $left_attribute_name = AttributeActions.get_attribute_name($left_attribute);
    final String $right_attribute_name = AttributeActions.get_attribute_name($right_attribute);
    String _xifexpression = null;
    boolean _equals = Objects.equal($left_attribute_name, $right_attribute_name);
    if (_equals) {
      _xifexpression = $left_attribute_name;
    } else {
      _xifexpression = null;
    }
    final String $merged_attribute_name = _xifexpression;
    AttributeActions.set_attribute_name($merged_attribute, $merged_attribute_name);
  }
  
  private static void merge_reference_name(final Reference $left_reference, final Reference $right_reference, final Reference $merged_reference) {
    final String $left_reference_name = ReferenceActions.get_reference_name($left_reference);
    final String $right_reference_name = ReferenceActions.get_reference_name($right_reference);
    String _xifexpression = null;
    boolean _equals = Objects.equal($left_reference_name, $right_reference_name);
    if (_equals) {
      _xifexpression = $left_reference_name;
    } else {
      _xifexpression = null;
    }
    final String $merged_reference_name = _xifexpression;
    ReferenceActions.set_reference_name($merged_reference, $merged_reference_name);
  }
  
  private static void merge_attribute_type(final Attribute $left_attribute, final Attribute $right_attribute, final Attribute $merged_attribute) {
    final DataType $left_attribute_type = AttributeActions.get_attribute_type($left_attribute);
    final DataType $right_attribute_type = AttributeActions.get_attribute_type($right_attribute);
    DataType _xifexpression = null;
    boolean _equals = Objects.equal($left_attribute_type, $right_attribute_type);
    if (_equals) {
      _xifexpression = $left_attribute_type;
    } else {
      _xifexpression = null;
    }
    final DataType $merged_attribute_type = _xifexpression;
    AttributeActions.set_attribute_type($merged_attribute, $merged_attribute_type);
  }
  
  private static void merge_reference_type(final Reference $left_reference, final Reference $right_reference, final Reference $merged_reference) {
    final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_reference_type = ReferenceActions.get_reference_type($left_reference);
    final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_reference_type = ReferenceActions.get_reference_type($right_reference);
    final se.mdh.idt.benji.examples.refactorings.metamodel.Class $merged_reference_type = Differences.get_class_superClass_intersection($left_reference_type, $right_reference_type);
    ReferenceActions.set_reference_type($merged_reference, $merged_reference_type);
  }
  
  private static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_class_superClass_intersection(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class) {
    se.mdh.idt.benji.examples.refactorings.metamodel.Class _xblockexpression = null;
    {
      if ((($left_class == null) || ($right_class == null))) {
        return null;
      }
      final HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> $left_class_superClass_distances = Differences.get_class_superClass_distances($left_class);
      final HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> $right_class_superClass_distances = Differences.get_class_superClass_distances($right_class);
      final Function1<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>> _function = (se.mdh.idt.benji.examples.refactorings.metamodel.Class $left_class_superClass) -> {
        Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class> _xblockexpression_1 = null;
        {
          final Function1<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Boolean> _function_1 = (se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class_superClass) -> {
            String __class_name = ClassActions.get_class_name($left_class_superClass);
            String __class_name_1 = ClassActions.get_class_name($right_class_superClass);
            return Boolean.valueOf(Objects.equal(__class_name, __class_name_1));
          };
          final se.mdh.idt.benji.examples.refactorings.metamodel.Class $right_class_superClass = IterableExtensions.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>findFirst($right_class_superClass_distances.keySet(), _function_1);
          Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class> _xifexpression = null;
          if (($right_class_superClass != null)) {
            _xifexpression = Pair.<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>of($left_class_superClass, $right_class_superClass);
          } else {
            _xifexpression = null;
          }
          _xblockexpression_1 = _xifexpression;
        }
        return _xblockexpression_1;
      };
      final Function1<Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>, Integer> _function_1 = (Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class> $common_class_superClass) -> {
        Integer _get = $left_class_superClass_distances.get($common_class_superClass.getKey());
        Integer _get_1 = $right_class_superClass_distances.get($common_class_superClass.getValue());
        return Integer.valueOf(((_get).intValue() + (_get_1).intValue()));
      };
      _xblockexpression = IterableExtensions.<Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>, Integer>minBy(IterableExtensions.<Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>>filterNull(IterableExtensions.<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>>map($left_class_superClass_distances.keySet(), _function)), _function_1).getKey();
    }
    return _xblockexpression;
  }
  
  private static HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> get_class_superClass_distances(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $class) {
    HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> _newHashMap = CollectionLiterals.<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer>newHashMap();
    final Procedure1<HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer>> _function = (HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> $class_superClass_distances) -> {
      Differences.compute_class_superClass_distances($class, $class_superClass_distances, 0);
    };
    return ObjectExtensions.<HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer>>operator_doubleArrow(_newHashMap, _function);
  }
  
  private static void compute_class_superClass_distances(final se.mdh.idt.benji.examples.refactorings.metamodel.Class $class, final HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> $class_superClass_distances, final int $current_distance) {
    se.mdh.idt.benji.examples.refactorings.metamodel.Class _elvis = null;
    final Function1<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Boolean> _function = (se.mdh.idt.benji.examples.refactorings.metamodel.Class $class_superClass) -> {
      String __class_name = ClassActions.get_class_name($class_superClass);
      String __class_name_1 = ClassActions.get_class_name($class);
      return Boolean.valueOf(Objects.equal(__class_name, __class_name_1));
    };
    se.mdh.idt.benji.examples.refactorings.metamodel.Class _findFirst = IterableExtensions.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>findFirst($class_superClass_distances.keySet(), _function);
    if (_findFirst != null) {
      _elvis = _findFirst;
    } else {
      _elvis = $class;
    }
    final se.mdh.idt.benji.examples.refactorings.metamodel.Class $current_key = _elvis;
    final Integer $current_value = $class_superClass_distances.getOrDefault($current_key, Integer.valueOf($current_distance));
    if (($current_distance < ($current_value).intValue())) {
      $class_superClass_distances.put($current_key, Integer.valueOf($current_distance));
    } else {
      $class_superClass_distances.put($current_key, $current_value);
    }
    se.mdh.idt.benji.examples.refactorings.metamodel.Class __class_superClass = ClassActions.get_class_superClass($class);
    boolean _tripleNotEquals = (__class_superClass != null);
    if (_tripleNotEquals) {
      Differences.compute_class_superClass_distances(ClassActions.get_class_superClass($class), $class_superClass_distances, ($current_distance + 1));
    }
  }
}
