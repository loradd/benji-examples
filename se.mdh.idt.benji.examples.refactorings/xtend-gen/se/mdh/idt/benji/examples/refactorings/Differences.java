package se.mdh.idt.benji.examples.refactorings;

import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;
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
import se.mdh.idt.benji.examples.refactorings.RenamePackageUriPostcondition;
import se.mdh.idt.benji.examples.refactorings.RenamePackageUriPrecondition;
import se.mdh.idt.benji.examples.refactorings.simplecore.Attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.DataType;
import se.mdh.idt.benji.examples.refactorings.simplecore.Reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecoreFactory;
import se.mdh.idt.benji.trace.api.TraceExtensions;

@SuppressWarnings("all")
public class Differences {
  @Extension
  private static SimplecoreFactory _simplecoreFactory = SimplecoreFactory.eINSTANCE;
  
  public static final Difference<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, Consumer<RenamePackagePrecondition.Match>> renamePackage = DifferenceFactory.<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, Consumer<RenamePackagePrecondition.Match>>difference().name("RenamePackage").precondition(RenamePackagePrecondition.instance()).action(
    ((Consumer<RenamePackagePrecondition.Match>) (RenamePackagePrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.simplecore.Package _current = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>current(it.get$package());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Renamed");
      String _name = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>initial(it.get$package()).getName();
      _builder.append(_name);
      _current.setName(_builder.toString());
    })).postcondition(RenamePackagePostcondition.instance()).build();
  
  public static final Difference<RenamePackageUriPrecondition.Match, RenamePackageUriPrecondition.Matcher, RenamePackageUriPrecondition, RenamePackageUriPostcondition.Match, RenamePackageUriPostcondition.Matcher, RenamePackageUriPostcondition, Consumer<RenamePackageUriPrecondition.Match>> renamePackageUri = DifferenceFactory.<RenamePackageUriPrecondition.Match, RenamePackageUriPrecondition.Matcher, RenamePackageUriPrecondition, RenamePackageUriPostcondition.Match, RenamePackageUriPostcondition.Matcher, RenamePackageUriPostcondition, Consumer<RenamePackageUriPrecondition.Match>>difference().name("RenamePackageUri").precondition(RenamePackageUriPrecondition.instance()).action(
    ((Consumer<RenamePackageUriPrecondition.Match>) (RenamePackageUriPrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.simplecore.Package _current = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>current(it.get$package());
      StringConcatenation _builder = new StringConcatenation();
      String _uri = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>initial(it.get$package()).getUri();
      _builder.append(_uri);
      _builder.append("/changed");
      _current.setUri(_builder.toString());
    })).postcondition(RenamePackageUriPostcondition.instance()).build();
  
  public static final Difference<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, Consumer<DeletePackagePrecondition.Match>> deletePackage = DifferenceFactory.<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, Consumer<DeletePackagePrecondition.Match>>difference().name("DeletePackage").precondition(DeletePackagePrecondition.instance()).action(
    ((Consumer<DeletePackagePrecondition.Match>) (DeletePackagePrecondition.Match it) -> {
      EcoreUtil.delete(TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>current(it.get$package()), true);
    })).postcondition(DeletePackagePostcondition.instance()).build();
  
  public static final Difference<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, Consumer<AddPackagePrecondition.Match>> addPackage = DifferenceFactory.<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, Consumer<AddPackagePrecondition.Match>>difference().name("AddPackage").precondition(AddPackagePrecondition.instance()).action(
    ((Consumer<AddPackagePrecondition.Match>) (AddPackagePrecondition.Match it) -> {
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Package> _subpackages = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>current(it.get$container()).getSubpackages();
      se.mdh.idt.benji.examples.refactorings.simplecore.Package _createPackage = Differences._simplecoreFactory.createPackage();
      _subpackages.add(_createPackage);
    })).postcondition(AddPackagePostcondition.instance()).build();
  
  public static final Difference<AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, AddClassPostcondition.Match, AddClassPostcondition.Matcher, AddClassPostcondition, Consumer<AddClassPrecondition.Match>> addClass = DifferenceFactory.<AddClassPrecondition.Match, AddClassPrecondition.Matcher, AddClassPrecondition, AddClassPostcondition.Match, AddClassPostcondition.Matcher, AddClassPostcondition, Consumer<AddClassPrecondition.Match>>difference().name("AddClass").precondition(AddClassPrecondition.instance()).action(
    ((Consumer<AddClassPrecondition.Match>) (AddClassPrecondition.Match it) -> {
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _classes = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>current(it.get$container()).getClasses();
      se.mdh.idt.benji.examples.refactorings.simplecore.Class _createClass = Differences._simplecoreFactory.createClass();
      _classes.add(_createClass);
    })).postcondition(AddClassPostcondition.instance()).build();
  
  public static final Difference<RenameClassPrecondition.Match, RenameClassPrecondition.Matcher, RenameClassPrecondition, RenameClassPostcondition.Match, RenameClassPostcondition.Matcher, RenameClassPostcondition, Consumer<RenameClassPrecondition.Match>> renameClass = DifferenceFactory.<RenameClassPrecondition.Match, RenameClassPrecondition.Matcher, RenameClassPrecondition, RenameClassPostcondition.Match, RenameClassPostcondition.Matcher, RenameClassPostcondition, Consumer<RenameClassPrecondition.Match>>difference().name("RenameClass").precondition(RenameClassPrecondition.instance()).action(
    ((Consumer<RenameClassPrecondition.Match>) (RenameClassPrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.simplecore.Class _current = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class());
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Renamed");
      String _name = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>initial(it.get$class()).getName();
      _builder.append(_name);
      _current.setName(_builder.toString());
    })).postcondition(RenameClassPostcondition.instance()).build();
  
  public static final Difference<DeleteClassPrecondition.Match, DeleteClassPrecondition.Matcher, DeleteClassPrecondition, DeleteClassPostcondition.Match, DeleteClassPostcondition.Matcher, DeleteClassPostcondition, Consumer<DeleteClassPrecondition.Match>> deleteClass = DifferenceFactory.<DeleteClassPrecondition.Match, DeleteClassPrecondition.Matcher, DeleteClassPrecondition, DeleteClassPostcondition.Match, DeleteClassPostcondition.Matcher, DeleteClassPostcondition, Consumer<DeleteClassPrecondition.Match>>difference().name("DeleteClass").precondition(DeleteClassPrecondition.instance()).action(
    ((Consumer<DeleteClassPrecondition.Match>) (DeleteClassPrecondition.Match it) -> {
      EcoreUtil.delete(TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()), true);
    })).postcondition(DeleteClassPostcondition.instance()).build();
  
  public static final Difference<ExtractClassPrecondition.Match, ExtractClassPrecondition.Matcher, ExtractClassPrecondition, ExtractClassPostcondition.Match, ExtractClassPostcondition.Matcher, ExtractClassPostcondition, Consumer<ExtractClassPrecondition.Match>> extractClass = DifferenceFactory.<ExtractClassPrecondition.Match, ExtractClassPrecondition.Matcher, ExtractClassPrecondition, ExtractClassPostcondition.Match, ExtractClassPostcondition.Matcher, ExtractClassPostcondition, Consumer<ExtractClassPrecondition.Match>>difference().name("ExtractClass").precondition(ExtractClassPrecondition.instance()).action(
    ((Consumer<ExtractClassPrecondition.Match>) (ExtractClassPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class attribute_class = Differences._simplecoreFactory.createClass();
      attribute_class.setName(StringExtensions.toFirstUpper(TraceExtensions.<Attribute>initial(it.get$attribute()).getName()));
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _classes = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>current(it.get$package()).getClasses();
      _classes.add(attribute_class);
      final Reference attribute_reference = Differences._simplecoreFactory.createReference();
      attribute_reference.setType(attribute_class);
      EList<Reference> _references = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getReferences();
      _references.add(attribute_reference);
      EcoreUtil.delete(TraceExtensions.<Attribute>current(it.get$attribute()), true);
    })).postcondition(ExtractClassPostcondition.instance()).build();
  
  public static final Difference<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, Consumer<AddAttributePrecondition.Match>> addAttribute = DifferenceFactory.<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, Consumer<AddAttributePrecondition.Match>>difference().name("AddAttribute").precondition(AddAttributePrecondition.instance()).action(
    ((Consumer<AddAttributePrecondition.Match>) (AddAttributePrecondition.Match it) -> {
      EList<Attribute> _attributes = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getAttributes();
      Attribute _createAttribute = Differences._simplecoreFactory.createAttribute();
      _attributes.add(_createAttribute);
    })).postcondition(AddAttributePostcondition.instance()).build();
  
  public static final Difference<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, Consumer<DeleteAttributePrecondition.Match>> deleteAttribute = DifferenceFactory.<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, Consumer<DeleteAttributePrecondition.Match>>difference().name("DeleteAttribute").precondition(DeleteAttributePrecondition.instance()).action(
    ((Consumer<DeleteAttributePrecondition.Match>) (DeleteAttributePrecondition.Match it) -> {
      EcoreUtil.delete(TraceExtensions.<Attribute>current(it.get$attribute()), true);
    })).postcondition(DeleteAttributePostcondition.instance()).build();
  
  public static final Difference<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, Consumer<ChangeAttributeTypePrecondition.Match>> changeAttributeType = DifferenceFactory.<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, Consumer<ChangeAttributeTypePrecondition.Match>>difference().name("ChangeAttributeType").precondition(ChangeAttributeTypePrecondition.instance()).action(
    ((Consumer<ChangeAttributeTypePrecondition.Match>) (ChangeAttributeTypePrecondition.Match it) -> {
      Attribute _current = TraceExtensions.<Attribute>current(it.get$attribute());
      _current.setType(TraceExtensions.<DataType>current(it.get$datatype()));
    })).postcondition(ChangeAttributeTypePostcondition.instance()).build();
  
  public static final Difference<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, Consumer<AddReferencePrecondition.Match>> addReference = DifferenceFactory.<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, Consumer<AddReferencePrecondition.Match>>difference().name("AddDifference").precondition(AddReferencePrecondition.instance()).action(
    ((Consumer<AddReferencePrecondition.Match>) (AddReferencePrecondition.Match it) -> {
      EList<Reference> _references = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getReferences();
      Reference _createReference = Differences._simplecoreFactory.createReference();
      _references.add(_createReference);
    })).postcondition(AddReferencePostcondition.instance()).build();
  
  public static final Difference<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, Consumer<DeleteReferencePrecondition.Match>> deleteReference = DifferenceFactory.<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, Consumer<DeleteReferencePrecondition.Match>>difference().name("DeleteReference").precondition(DeleteReferencePrecondition.instance()).action(
    ((Consumer<DeleteReferencePrecondition.Match>) (DeleteReferencePrecondition.Match it) -> {
      EcoreUtil.delete(TraceExtensions.<Reference>current(it.get$reference()), true);
    })).postcondition(DeleteReferencePostcondition.instance()).build();
  
  public static final Difference<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, Consumer<ChangeReferenceTypePrecondition.Match>> changeReferenceType = DifferenceFactory.<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, Consumer<ChangeReferenceTypePrecondition.Match>>difference().name("ChangeReferenceType").precondition(ChangeReferenceTypePrecondition.instance()).action(
    ((Consumer<ChangeReferenceTypePrecondition.Match>) (ChangeReferenceTypePrecondition.Match it) -> {
      Reference _current = TraceExtensions.<Reference>current(it.get$reference());
      _current.setType(TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()));
    })).postcondition(ChangeReferenceTypePostcondition.instance()).build();
  
  public static final Difference<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, Consumer<ExtractSuperclassPrecondition.Match>> extractSuperclass = DifferenceFactory.<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, Consumer<ExtractSuperclassPrecondition.Match>>difference().name("ExtractSuperclass").precondition(ExtractSuperclassPrecondition.instance()).action(
    ((Consumer<ExtractSuperclassPrecondition.Match>) (ExtractSuperclassPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.simplecore.Class extracted = Differences._simplecoreFactory.createClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Super");
      String _name = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>initial(it.get$class()).getName();
      _builder.append(_name);
      extracted.setName(_builder.toString());
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _super = extracted.getSuper();
      se.mdh.idt.benji.examples.refactorings.simplecore.Class _current = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$super());
      _super.add(_current);
      EList<Attribute> _attributes = extracted.getAttributes();
      Attribute _current_1 = TraceExtensions.<Attribute>current(it.get$attribute());
      _attributes.add(_current_1);
      EList<Reference> _references = extracted.getReferences();
      Reference _current_2 = TraceExtensions.<Reference>current(it.get$reference());
      _references.add(_current_2);
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _classes = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Package>current(it.get$package()).getClasses();
      _classes.add(extracted);
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _super_1 = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getSuper();
      _super_1.add(extracted);
      EList<se.mdh.idt.benji.examples.refactorings.simplecore.Class> _super_2 = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getSuper();
      se.mdh.idt.benji.examples.refactorings.simplecore.Class _current_3 = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$super());
      _super_2.remove(_current_3);
      EList<Attribute> _attributes_1 = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getAttributes();
      Attribute _current_4 = TraceExtensions.<Attribute>current(it.get$attribute());
      _attributes_1.remove(_current_4);
      EList<Reference> _references_1 = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getReferences();
      Reference _current_5 = TraceExtensions.<Reference>current(it.get$reference());
      _references_1.remove(_current_5);
    })).postcondition(ExtractSuperclassPostcondition.instance()).build();
  
  public static final Difference<ChangeClassAbstractPrecondition.Match, ChangeClassAbstractPrecondition.Matcher, ChangeClassAbstractPrecondition, ChangeClassAbstractPostcondition.Match, ChangeClassAbstractPostcondition.Matcher, ChangeClassAbstractPostcondition, Consumer<ChangeClassAbstractPrecondition.Match>> changeClassAbstract = DifferenceFactory.<ChangeClassAbstractPrecondition.Match, ChangeClassAbstractPrecondition.Matcher, ChangeClassAbstractPrecondition, ChangeClassAbstractPostcondition.Match, ChangeClassAbstractPostcondition.Matcher, ChangeClassAbstractPostcondition, Consumer<ChangeClassAbstractPrecondition.Match>>difference().name("ChangeClassAbstract").precondition(ChangeClassAbstractPrecondition.instance()).action(
    ((Consumer<ChangeClassAbstractPrecondition.Match>) (ChangeClassAbstractPrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.simplecore.Class _current = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class());
      Boolean _abstract = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>initial(it.get$class()).getAbstract();
      boolean _not = (!(_abstract).booleanValue());
      _current.setAbstract(Boolean.valueOf(_not));
    })).postcondition(ChangeClassAbstractPostcondition.instance()).build();
  
  public static final Difference<PushDownAttributePrecondition.Match, PushDownAttributePrecondition.Matcher, PushDownAttributePrecondition, PushDownAttributePostcondition.Match, PushDownAttributePostcondition.Matcher, PushDownAttributePostcondition, Consumer<PushDownAttributePrecondition.Match>> pushDownAttribute = DifferenceFactory.<PushDownAttributePrecondition.Match, PushDownAttributePrecondition.Matcher, PushDownAttributePrecondition, PushDownAttributePostcondition.Match, PushDownAttributePostcondition.Matcher, PushDownAttributePostcondition, Consumer<PushDownAttributePrecondition.Match>>difference().name("Push Down Attribute").precondition(PushDownAttributePrecondition.instance()).action(
    ((Consumer<PushDownAttributePrecondition.Match>) (PushDownAttributePrecondition.Match it) -> {
      EList<Attribute> _attributes = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$super()).getAttributes();
      Attribute _current = TraceExtensions.<Attribute>current(it.get$attribute());
      _attributes.remove(_current);
      EList<Attribute> _attributes_1 = TraceExtensions.<se.mdh.idt.benji.examples.refactorings.simplecore.Class>current(it.get$class()).getAttributes();
      Attribute _current_1 = TraceExtensions.<Attribute>current(it.get$attribute());
      _attributes_1.add(_current_1);
    })).postcondition(PushDownAttributePostcondition.instance()).build();
}
