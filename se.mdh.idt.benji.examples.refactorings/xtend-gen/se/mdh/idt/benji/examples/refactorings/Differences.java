package se.mdh.idt.benji.examples.refactorings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.xtext.xbase.lib.Extension;
import se.mdh.idt.benji.difference.api.Difference;
import se.mdh.idt.benji.difference.api.DifferenceFactory;
import se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.AddAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.AddClassPostcondition;
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
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.simplecore.Attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.DataType;
import se.mdh.idt.benji.examples.refactorings.simplecore.Reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecoreFactory;

@SuppressWarnings("all")
public class Differences {
  @Extension
  private static SimplecoreFactory _simplecoreFactory = SimplecoreFactory.eINSTANCE;
  
  public final static Difference<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, IMatchProcessor<RenamePackagePrecondition.Match>> renamePackage = DifferenceFactory.<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, IMatchProcessor<RenamePackagePrecondition.Match>>difference().name("RenamePackage").precondition(RenamePackagePrecondition.instance()).action(
    ((IMatchProcessor<RenamePackagePrecondition.Match>) (RenamePackagePrecondition.Match it) -> {
      EObject _current = it.getPackage().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _package = ((se.mdh.idt.benji.examples.refactorings.simplecore.Package) _current);
      _package.setName(it.getName());
    })).postcondition(RenamePackagePostcondition.instance()).build();
  
  public final static Difference<RenameURIPackagePrecondition.Match, RenameURIPackagePrecondition.Matcher, RenameURIPackagePrecondition, RenameURIPackagePostcondition.Match, RenameURIPackagePostcondition.Matcher, RenameURIPackagePostcondition, IMatchProcessor<RenameURIPackagePrecondition.Match>> renameURIPackage = DifferenceFactory.<RenameURIPackagePrecondition.Match, RenameURIPackagePrecondition.Matcher, RenameURIPackagePrecondition, RenameURIPackagePostcondition.Match, RenameURIPackagePostcondition.Matcher, RenameURIPackagePostcondition, IMatchProcessor<RenameURIPackagePrecondition.Match>>difference().name("RenameURIPackage").precondition(RenameURIPackagePrecondition.instance()).action(
    ((IMatchProcessor<RenameURIPackagePrecondition.Match>) (RenameURIPackagePrecondition.Match it) -> {
      EObject _current = it.getPackage().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _package = ((se.mdh.idt.benji.examples.refactorings.simplecore.Package) _current);
      _package.setUri(it.getUri());
    })).postcondition(RenameURIPackagePostcondition.instance()).build();
  
  public final static Difference<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, IMatchProcessor<DeletePackagePrecondition.Match>> deletePackage = DifferenceFactory.<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, IMatchProcessor<DeletePackagePrecondition.Match>>difference().name("DeletePackage").precondition(DeletePackagePrecondition.instance()).action(
    ((IMatchProcessor<DeletePackagePrecondition.Match>) (DeletePackagePrecondition.Match it) -> {
      EObject _current = it.getPackage().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _package = ((se.mdh.idt.benji.examples.refactorings.simplecore.Package) _current);
      EcoreUtil.delete(_package, true);
    })).postcondition(DeletePackagePostcondition.instance()).build();
  
  public final static Difference<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, IMatchProcessor<AddPackagePrecondition.Match>> addPackage = DifferenceFactory.<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, IMatchProcessor<AddPackagePrecondition.Match>>difference().name("AddPackage").precondition(AddPackagePrecondition.instance()).action(
    ((IMatchProcessor<AddPackagePrecondition.Match>) (AddPackagePrecondition.Match it) -> {
      EObject _current = it.getPackage().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _package = ((se.mdh.idt.benji.examples.refactorings.simplecore.Package) _current);
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _subPackage = Differences._simplecoreFactory.createPackage();
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Package> _subPackages = _package.getSubPackages();
      _subPackages.add(_subPackage);
    })).postcondition(AddPackagePostcondition.instance()).build();
  
  public final static Difference<AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, AddClassPostcondition.Match, AddClassPostcondition.Matcher, AddClassPostcondition, IMatchProcessor<AddClassPrecondition.Match>> addClass = DifferenceFactory.<AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, AddClassPostcondition.Match, AddClassPostcondition.Matcher, AddClassPostcondition, IMatchProcessor<AddClassPrecondition.Match>>difference().name("AddClass").precondition(AddClassPrecondition.instance()).action(
    ((IMatchProcessor<AddClassPrecondition.Match>) (AddClassPrecondition.Match it) -> {
      EObject _current = it.getPackage().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _package = ((se.mdh.idt.benji.examples.refactorings.simplecore.Package) _current);
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = Differences._simplecoreFactory.createClass();
      _class.setName(it.getName());
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _classes = _package.getClasses();
      _classes.add(_class);
    })).postcondition(AddClassPostcondition.instance()).build();
  
  public final static Difference<RenameClassPrecondition.Match, RenameClassPrecondition.Matcher, RenameClassPrecondition, RenameClassPostcondition.Match, RenameClassPostcondition.Matcher, RenameClassPostcondition, IMatchProcessor<RenameClassPrecondition.Match>> renameClass = DifferenceFactory.<RenameClassPrecondition.Match, RenameClassPrecondition.Matcher, RenameClassPrecondition, RenameClassPostcondition.Match, RenameClassPostcondition.Matcher, RenameClassPostcondition, IMatchProcessor<RenameClassPrecondition.Match>>difference().name("RenameClass").precondition(RenameClassPrecondition.instance()).action(
    ((IMatchProcessor<RenameClassPrecondition.Match>) (RenameClassPrecondition.Match it) -> {
      EObject _current = it.getValueOfClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current);
      _class.setName(it.getName());
    })).postcondition(RenameClassPostcondition.instance()).build();
  
  public final static Difference<DeleteClassPrecondition.Match, DeleteClassPrecondition.Matcher, DeleteClassPrecondition, DeleteClassPostcondition.Match, DeleteClassPostcondition.Matcher, DeleteClassPostcondition, IMatchProcessor<DeleteClassPrecondition.Match>> deleteClass = DifferenceFactory.<DeleteClassPrecondition.Match, DeleteClassPrecondition.Matcher, DeleteClassPrecondition, DeleteClassPostcondition.Match, DeleteClassPostcondition.Matcher, DeleteClassPostcondition, IMatchProcessor<DeleteClassPrecondition.Match>>difference().name("DeleteClass").precondition(DeleteClassPrecondition.instance()).action(
    ((IMatchProcessor<DeleteClassPrecondition.Match>) (DeleteClassPrecondition.Match it) -> {
      EObject _current = it.getValueOfClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current);
      EcoreUtil.delete(_class, true);
    })).postcondition(DeleteClassPostcondition.instance()).build();
  
  public final static Difference<ExtractClassPrecondition.Match, ExtractClassPrecondition.Matcher, ExtractClassPrecondition, ExtractClassPostcondition.Match, ExtractClassPostcondition.Matcher, ExtractClassPostcondition, IMatchProcessor<ExtractClassPrecondition.Match>> extractClass = DifferenceFactory.<ExtractClassPrecondition.Match, ExtractClassPrecondition.Matcher, ExtractClassPrecondition, ExtractClassPostcondition.Match, ExtractClassPostcondition.Matcher, ExtractClassPostcondition, IMatchProcessor<ExtractClassPrecondition.Match>>difference().name("ExtractClass").precondition(ExtractClassPrecondition.instance()).action(
    ((IMatchProcessor<ExtractClassPrecondition.Match>) (ExtractClassPrecondition.Match it) -> {
      EObject _current = it.getPackage().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _package = ((se.mdh.idt.benji.examples.refactorings.simplecore.Package) _current);
      EObject _current_1 = it.getValueOfClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current_1);
      EObject _current_2 = it.getAttribute().getCurrent();
      final Attribute _attribute = ((Attribute) _current_2);
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _attribute_class = Differences._simplecoreFactory.createClass();
      _attribute_class.setName(it.getAttribute_class_name());
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _classes = _package.getClasses();
      _classes.add(_attribute_class);
      final Reference _attribute_reference = Differences._simplecoreFactory.createReference();
      _attribute_reference.setName(it.getAttribute_reference_name());
      _attribute_reference.setType(_attribute_class);
      EList<Reference> _references = _class.getReferences();
      _references.add(_attribute_reference);
      EcoreUtil.delete(_attribute, true);
    })).postcondition(ExtractClassPostcondition.instance()).build();
  
  public final static Difference<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, IMatchProcessor<AddAttributePrecondition.Match>> addAttribute = DifferenceFactory.<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, IMatchProcessor<AddAttributePrecondition.Match>>difference().name("AddAttribute").precondition(AddAttributePrecondition.instance()).action(
    ((IMatchProcessor<AddAttributePrecondition.Match>) (AddAttributePrecondition.Match it) -> {
      EObject _current = it.getValueOfClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current);
      EObject _current_1 = it.getType().getCurrent();
      final DataType _type = ((DataType) _current_1);
      final Attribute _attribute = Differences._simplecoreFactory.createAttribute();
      _attribute.setName(it.getName());
      _attribute.setType(_type);
      EList<Attribute> _attributes = _class.getAttributes();
      _attributes.add(_attribute);
    })).postcondition(AddAttributePostcondition.instance()).build();
  
  public final static Difference<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, IMatchProcessor<DeleteAttributePrecondition.Match>> deleteAttribute = DifferenceFactory.<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, IMatchProcessor<DeleteAttributePrecondition.Match>>difference().name("DeleteAttribute").precondition(DeleteAttributePrecondition.instance()).action(
    ((IMatchProcessor<DeleteAttributePrecondition.Match>) (DeleteAttributePrecondition.Match it) -> {
      EObject _current = it.getAttribute().getCurrent();
      final Attribute _attribute = ((Attribute) _current);
      EcoreUtil.delete(_attribute, true);
    })).postcondition(DeleteAttributePostcondition.instance()).build();
  
  public final static Difference<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, IMatchProcessor<ChangeAttributeTypePrecondition.Match>> changeAttributeType = DifferenceFactory.<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, IMatchProcessor<ChangeAttributeTypePrecondition.Match>>difference().name("ChangeAttributeType").precondition(ChangeAttributeTypePrecondition.instance()).action(
    ((IMatchProcessor<ChangeAttributeTypePrecondition.Match>) (ChangeAttributeTypePrecondition.Match it) -> {
      EObject _current = it.getAttribute().getCurrent();
      final Attribute _attribute = ((Attribute) _current);
      EObject _current_1 = it.getType().getCurrent();
      final DataType _type = ((DataType) _current_1);
      _attribute.setType(_type);
    })).postcondition(ChangeAttributeTypePostcondition.instance()).build();
  
  public final static Difference<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, IMatchProcessor<AddReferencePrecondition.Match>> addReference = DifferenceFactory.<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, IMatchProcessor<AddReferencePrecondition.Match>>difference().name("AddReference").precondition(AddReferencePrecondition.instance()).action(
    ((IMatchProcessor<AddReferencePrecondition.Match>) (AddReferencePrecondition.Match it) -> {
      EObject _current = it.getValueOfClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current);
      EObject _current_1 = it.getType().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _type = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current_1);
      final Reference _reference = Differences._simplecoreFactory.createReference();
      _reference.setName(it.getName());
      _reference.setType(_type);
      EList<Reference> _references = _class.getReferences();
      _references.add(_reference);
    })).postcondition(AddReferencePostcondition.instance()).build();
  
  public final static Difference<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, IMatchProcessor<DeleteReferencePrecondition.Match>> deleteReference = DifferenceFactory.<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, IMatchProcessor<DeleteReferencePrecondition.Match>>difference().name("DeleteReference").precondition(DeleteReferencePrecondition.instance()).action(
    ((IMatchProcessor<DeleteReferencePrecondition.Match>) (DeleteReferencePrecondition.Match it) -> {
      EObject _current = it.getReference().getCurrent();
      final Reference _reference = ((Reference) _current);
      EcoreUtil.delete(_reference, true);
    })).postcondition(DeleteReferencePostcondition.instance()).build();
  
  public final static Difference<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, IMatchProcessor<ChangeReferenceTypePrecondition.Match>> changeReferenceType = DifferenceFactory.<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, IMatchProcessor<ChangeReferenceTypePrecondition.Match>>difference().name("ChangeReferenceType").precondition(ChangeReferenceTypePrecondition.instance()).action(
    ((IMatchProcessor<ChangeReferenceTypePrecondition.Match>) (ChangeReferenceTypePrecondition.Match it) -> {
      EObject _current = it.getReference().getCurrent();
      final Reference _reference = ((Reference) _current);
      EObject _current_1 = it.getType().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _type = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current_1);
      _reference.setType(_type);
    })).postcondition(ChangeReferenceTypePostcondition.instance()).build();
  
  public final static Difference<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, IMatchProcessor<ExtractSuperclassPrecondition.Match>> extractSuperclass = DifferenceFactory.<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, IMatchProcessor<ExtractSuperclassPrecondition.Match>>difference().name("ExtractSuperclass").precondition(ExtractSuperclassPrecondition.instance()).action(
    ((IMatchProcessor<ExtractSuperclassPrecondition.Match>) (ExtractSuperclassPrecondition.Match it) -> {
      EObject _current = it.getPackage().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Package _package = ((se.mdh.idt.benji.examples.refactorings.simplecore.Package) _current);
      EObject _current_1 = it.getSubClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _subClass = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current_1);
      EObject _current_2 = it.getSuperClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _superClass = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current_2);
      EObject _current_3 = it.getAttribute().getCurrent();
      final Attribute _attribute = ((Attribute) _current_3);
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = Differences._simplecoreFactory.createClass();
      _class.setName(it.getName());
      EList<Attribute> _attributes = _class.getAttributes();
      _attributes.add(_attribute);
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _superClasses = _class.getSuperClasses();
      _superClasses.add(_superClass);
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _classes = _package.getClasses();
      _classes.add(_class);
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _superClasses_1 = _subClass.getSuperClasses();
      _superClasses_1.remove(_superClass);
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _superClasses_2 = _subClass.getSuperClasses();
      _superClasses_2.add(_class);
    })).postcondition(ExtractSuperclassPostcondition.instance()).build();
  
  public final static Difference<ChangeClassAbstractPrecondition.Match, ChangeClassAbstractPrecondition.Matcher, ChangeClassAbstractPrecondition, ChangeClassAbstractPostcondition.Match, ChangeClassAbstractPostcondition.Matcher, ChangeClassAbstractPostcondition, IMatchProcessor<ChangeClassAbstractPrecondition.Match>> changeClassAbstract = DifferenceFactory.<ChangeClassAbstractPrecondition.Match, ChangeClassAbstractPrecondition.Matcher, ChangeClassAbstractPrecondition, ChangeClassAbstractPostcondition.Match, ChangeClassAbstractPostcondition.Matcher, ChangeClassAbstractPostcondition, IMatchProcessor<ChangeClassAbstractPrecondition.Match>>difference().name("ChangeClassAbstract").precondition(ChangeClassAbstractPrecondition.instance()).action(
    ((IMatchProcessor<ChangeClassAbstractPrecondition.Match>) (ChangeClassAbstractPrecondition.Match it) -> {
      EObject _current = it.getValueOfClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current);
      _class.setAbstract(Boolean.valueOf(true));
    })).postcondition(ChangeClassAbstractPostcondition.instance()).build();
  
  public final static Difference<PushDownAttributePrecondition.Match, PushDownAttributePrecondition.Matcher, PushDownAttributePrecondition, PushDownAttributePostcondition.Match, PushDownAttributePostcondition.Matcher, PushDownAttributePostcondition, IMatchProcessor<PushDownAttributePrecondition.Match>> pushDownAttribute = DifferenceFactory.<PushDownAttributePrecondition.Match, PushDownAttributePrecondition.Matcher, PushDownAttributePrecondition, PushDownAttributePostcondition.Match, PushDownAttributePostcondition.Matcher, PushDownAttributePostcondition, IMatchProcessor<PushDownAttributePrecondition.Match>>difference().name("PushDownAttribute").precondition(PushDownAttributePrecondition.instance()).action(
    ((IMatchProcessor<PushDownAttributePrecondition.Match>) (PushDownAttributePrecondition.Match it) -> {
      EObject _current = it.getValueOfClass().getCurrent();
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class _class = ((se.mdh.idt.benji.examples.refactorings.simplecore.Class) _current);
      EObject _current_1 = it.getAttribute().getCurrent();
      final Attribute _attribute = ((Attribute) _current_1);
      EList<Attribute> _attributes = _class.getAttributes();
      _attributes.add(_attribute);
    })).postcondition(PushDownAttributePostcondition.instance()).build();
}
