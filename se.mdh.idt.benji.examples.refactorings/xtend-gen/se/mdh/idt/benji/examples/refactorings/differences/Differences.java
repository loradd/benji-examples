package se.mdh.idt.benji.examples.refactorings.differences;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import java.util.HashMap;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.xtend2.lib.StringConcatenation;
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
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddMetaclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.AddReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteAttributePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteAttributePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteMetaclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeletePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeletePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.DeleteReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractSuperclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractSuperclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.FlattenHierarchyPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.FlattenHierarchyPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.MergeReferencesPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameMetaclassPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameMetaclassPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenamePackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenamePackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameURIPackagePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RenameURIPackagePrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPrecondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePostcondition;
import se.mdh.idt.benji.examples.refactorings.differences.queries.SplitReferencePrecondition;
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;

@SuppressWarnings("all")
public class Differences {
  @Extension
  private static MetamodelFactory _metamodelFactory = MetamodelFactory.eINSTANCE;
  
  public final static Difference<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, IMatchProcessor<RenamePackagePrecondition.Match>> renamePackage = DifferenceFactory.<RenamePackagePrecondition.Match, RenamePackagePrecondition.Matcher, RenamePackagePrecondition, RenamePackagePostcondition.Match, RenamePackagePostcondition.Matcher, RenamePackagePostcondition, IMatchProcessor<RenamePackagePrecondition.Match>>difference().name("RenamePackage").precondition(RenamePackagePrecondition.instance()).action(
    ((IMatchProcessor<RenamePackagePrecondition.Match>) (RenamePackagePrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.metamodel.Package _current_package = it.getCurrent_package();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CHANGED_");
      String _name = it.getInitial_package().getName();
      _builder.append(_name);
      _current_package.setName(_builder.toString());
    })).postcondition(RenamePackagePostcondition.instance()).build();
  
  public final static Difference<RenameURIPackagePrecondition.Match, RenameURIPackagePrecondition.Matcher, RenameURIPackagePrecondition, RenameURIPackagePostcondition.Match, RenameURIPackagePostcondition.Matcher, RenameURIPackagePostcondition, IMatchProcessor<RenameURIPackagePrecondition.Match>> renameURIPackage = DifferenceFactory.<RenameURIPackagePrecondition.Match, RenameURIPackagePrecondition.Matcher, RenameURIPackagePrecondition, RenameURIPackagePostcondition.Match, RenameURIPackagePostcondition.Matcher, RenameURIPackagePostcondition, IMatchProcessor<RenameURIPackagePrecondition.Match>>difference().name("RenameURIPackage").precondition(RenameURIPackagePrecondition.instance()).action(
    ((IMatchProcessor<RenameURIPackagePrecondition.Match>) (RenameURIPackagePrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.metamodel.Package _current_package = it.getCurrent_package();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CHANGED_");
      String _uri = it.getInitial_package().getUri();
      _builder.append(_uri);
      _current_package.setUri(_builder.toString());
    })).postcondition(RenameURIPackagePostcondition.instance()).build();
  
  public final static Difference<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, IMatchProcessor<DeletePackagePrecondition.Match>> deletePackage = DifferenceFactory.<DeletePackagePrecondition.Match, DeletePackagePrecondition.Matcher, DeletePackagePrecondition, DeletePackagePostcondition.Match, DeletePackagePostcondition.Matcher, DeletePackagePostcondition, IMatchProcessor<DeletePackagePrecondition.Match>>difference().name("DeletePackage").precondition(DeletePackagePrecondition.instance()).action(
    ((IMatchProcessor<DeletePackagePrecondition.Match>) (DeletePackagePrecondition.Match it) -> {
      EcoreUtil.delete(it.getCurrent_package(), true);
    })).postcondition(DeletePackagePostcondition.instance()).build();
  
  public final static Difference<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, IMatchProcessor<AddPackagePrecondition.Match>> addPackage = DifferenceFactory.<AddPackagePrecondition.Match, AddPackagePrecondition.Matcher, AddPackagePrecondition, AddPackagePostcondition.Match, AddPackagePostcondition.Matcher, AddPackagePostcondition, IMatchProcessor<AddPackagePrecondition.Match>>difference().name("AddPackage").precondition(AddPackagePrecondition.instance()).action(
    ((IMatchProcessor<AddPackagePrecondition.Match>) (AddPackagePrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Package current_subPackage = Differences._metamodelFactory.createPackage();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CREATED_package_");
      int _size = it.getCurrent_package().getClassifiers().size();
      _builder.append(_size);
      current_subPackage.setName(_builder.toString());
      EList<Classifier> _classifiers = it.getCurrent_package().getClassifiers();
      _classifiers.add(current_subPackage);
    })).postcondition(AddPackagePostcondition.instance()).build();
  
  public final static Difference<AddMetaclassPrecondition.Match, AddMetaclassPrecondition.Matcher, AddMetaclassPrecondition, AddMetaclassPostcondition.Match, AddMetaclassPostcondition.Matcher, AddMetaclassPostcondition, IMatchProcessor<AddMetaclassPrecondition.Match>> addMetaclass = DifferenceFactory.<AddMetaclassPrecondition.Match, AddMetaclassPrecondition.Matcher, AddMetaclassPrecondition, AddMetaclassPostcondition.Match, AddMetaclassPostcondition.Matcher, AddMetaclassPostcondition, IMatchProcessor<AddMetaclassPrecondition.Match>>difference().name("AddMetaclass").precondition(AddMetaclassPrecondition.instance()).action(
    ((IMatchProcessor<AddMetaclassPrecondition.Match>) (AddMetaclassPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Class current_metaclass = Differences._metamodelFactory.createClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CREATED_class_");
      int _size = it.getCurrent_package().getClassifiers().size();
      _builder.append(_size);
      current_metaclass.setName(_builder.toString());
      EList<Classifier> _classifiers = it.getCurrent_package().getClassifiers();
      _classifiers.add(current_metaclass);
    })).postcondition(AddMetaclassPostcondition.instance()).build();
  
  public final static Difference<RenameMetaclassPrecondition.Match, RenameMetaclassPrecondition.Matcher, RenameMetaclassPrecondition, RenameMetaclassPostcondition.Match, RenameMetaclassPostcondition.Matcher, RenameMetaclassPostcondition, IMatchProcessor<RenameMetaclassPrecondition.Match>> renameMetaclass = DifferenceFactory.<RenameMetaclassPrecondition.Match, RenameMetaclassPrecondition.Matcher, RenameMetaclassPrecondition, RenameMetaclassPostcondition.Match, RenameMetaclassPostcondition.Matcher, RenameMetaclassPostcondition, IMatchProcessor<RenameMetaclassPrecondition.Match>>difference().name("RenameMetaclass").precondition(RenameMetaclassPrecondition.instance()).action(
    ((IMatchProcessor<RenameMetaclassPrecondition.Match>) (RenameMetaclassPrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.metamodel.Class _current_metaclass = it.getCurrent_metaclass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CHANGED_");
      String _name = it.getInitial_metaclass().getName();
      _builder.append(_name);
      _current_metaclass.setName(_builder.toString());
    })).postcondition(RenameMetaclassPostcondition.instance()).build();
  
  public final static Difference<DeleteMetaclassPrecondition.Match, DeleteMetaclassPrecondition.Matcher, DeleteMetaclassPrecondition, DeleteMetaclassPostcondition.Match, DeleteMetaclassPostcondition.Matcher, DeleteMetaclassPostcondition, IMatchProcessor<DeleteMetaclassPrecondition.Match>> deleteMetaclass = DifferenceFactory.<DeleteMetaclassPrecondition.Match, DeleteMetaclassPrecondition.Matcher, DeleteMetaclassPrecondition, DeleteMetaclassPostcondition.Match, DeleteMetaclassPostcondition.Matcher, DeleteMetaclassPostcondition, IMatchProcessor<DeleteMetaclassPrecondition.Match>>difference().name("DeleteMetaclass").precondition(DeleteMetaclassPrecondition.instance()).action(
    ((IMatchProcessor<DeleteMetaclassPrecondition.Match>) (DeleteMetaclassPrecondition.Match it) -> {
      EcoreUtil.delete(it.getCurrent_metaclass(), true);
    })).postcondition(DeleteMetaclassPostcondition.instance()).build();
  
  public final static Difference<ExtractMetaclassPrecondition.Match, ExtractMetaclassPrecondition.Matcher, ExtractMetaclassPrecondition, ExtractMetaclassPostcondition.Match, ExtractMetaclassPostcondition.Matcher, ExtractMetaclassPostcondition, IMatchProcessor<ExtractMetaclassPrecondition.Match>> extractMetaclass = DifferenceFactory.<ExtractMetaclassPrecondition.Match, ExtractMetaclassPrecondition.Matcher, ExtractMetaclassPrecondition, ExtractMetaclassPostcondition.Match, ExtractMetaclassPostcondition.Matcher, ExtractMetaclassPostcondition, IMatchProcessor<ExtractMetaclassPrecondition.Match>>difference().name("ExtractMetaclass").precondition(ExtractMetaclassPrecondition.instance()).action(
    ((IMatchProcessor<ExtractMetaclassPrecondition.Match>) (ExtractMetaclassPrecondition.Match it) -> {
    })).postcondition(ExtractMetaclassPostcondition.instance()).build();
  
  public final static Difference<MergeMetaclassesPrecondition.Match, MergeMetaclassesPrecondition.Matcher, MergeMetaclassesPrecondition, MergeMetaclassesPostcondition.Match, MergeMetaclassesPostcondition.Matcher, MergeMetaclassesPostcondition, IMatchProcessor<MergeMetaclassesPrecondition.Match>> mergeMetaclasses = DifferenceFactory.<MergeMetaclassesPrecondition.Match, MergeMetaclassesPrecondition.Matcher, MergeMetaclassesPrecondition, MergeMetaclassesPostcondition.Match, MergeMetaclassesPostcondition.Matcher, MergeMetaclassesPostcondition, IMatchProcessor<MergeMetaclassesPrecondition.Match>>difference().name("MergeMetaclasses").precondition(MergeMetaclassesPrecondition.instance()).action(
    ((IMatchProcessor<MergeMetaclassesPrecondition.Match>) (MergeMetaclassesPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Class current_merged_metaclass = Differences._metamodelFactory.createClass();
      StringConcatenation _builder = new StringConcatenation();
      String _name = it.getCurrent_left_metaclass().getName();
      _builder.append(_name);
      _builder.append("_");
      String _name_1 = it.getCurrent_right_metaclass().getName();
      _builder.append(_name_1);
      current_merged_metaclass.setName(_builder.toString());
      current_merged_metaclass.setAbstract(Boolean.valueOf(((it.getCurrent_left_metaclass().getAbstract()).booleanValue() || (it.getCurrent_right_metaclass().getAbstract()).booleanValue())));
      final Function1<Attribute, Attribute> _function = (Attribute left_attribute) -> {
        Attribute _createAttribute = Differences._metamodelFactory.createAttribute();
        final Procedure1<Attribute> _function_1 = (Attribute merged_attribute) -> {
          merged_attribute.setName(left_attribute.getName());
          merged_attribute.setType(left_attribute.getType());
        };
        return ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function_1);
      };
      final Iterable<Attribute> left_attributes = IterableExtensions.<Attribute, Attribute>map(Iterables.<Attribute>filter(it.getCurrent_left_metaclass().getStructuralFeatures(), Attribute.class), _function);
      final Function1<Attribute, Attribute> _function_1 = (Attribute right_attribute) -> {
        Attribute _createAttribute = Differences._metamodelFactory.createAttribute();
        final Procedure1<Attribute> _function_2 = (Attribute merged_attribute) -> {
          merged_attribute.setName(right_attribute.getName());
          merged_attribute.setType(right_attribute.getType());
        };
        return ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function_2);
      };
      final Iterable<Attribute> right_attributes = IterableExtensions.<Attribute, Attribute>map(Iterables.<Attribute>filter(it.getCurrent_right_metaclass().getStructuralFeatures(), Attribute.class), _function_1);
      final Function1<Attribute, Boolean> _function_2 = (Attribute left_attribute) -> {
        final Function1<Attribute, Boolean> _function_3 = (Attribute right_attribute) -> {
          String _name_2 = right_attribute.getName();
          String _name_3 = left_attribute.getName();
          return Boolean.valueOf(Objects.equal(_name_2, _name_3));
        };
        return Boolean.valueOf(IterableExtensions.<Attribute>exists(right_attributes, _function_3));
      };
      final Function1<Attribute, Attribute> _function_3 = (Attribute left_attribute) -> {
        Attribute _createAttribute = Differences._metamodelFactory.createAttribute();
        final Procedure1<Attribute> _function_4 = (Attribute merged_attribute) -> {
          merged_attribute.setName(left_attribute.getName());
          merged_attribute.setType(left_attribute.getType());
        };
        return ObjectExtensions.<Attribute>operator_doubleArrow(_createAttribute, _function_4);
      };
      final Iterable<Attribute> common_attributes = IterableExtensions.<Attribute, Attribute>map(IterableExtensions.<Attribute>filter(left_attributes, _function_2), _function_3);
      EList<StructuralFeature> _structuralFeatures = current_merged_metaclass.getStructuralFeatures();
      Iterables.<StructuralFeature>addAll(_structuralFeatures, common_attributes);
      EList<StructuralFeature> _structuralFeatures_1 = current_merged_metaclass.getStructuralFeatures();
      final Function1<Attribute, Boolean> _function_4 = (Attribute left_attribute) -> {
        final Function1<Attribute, Boolean> _function_5 = (Attribute common_attribute) -> {
          String _name_2 = common_attribute.getName();
          String _name_3 = left_attribute.getName();
          return Boolean.valueOf(Objects.equal(_name_2, _name_3));
        };
        boolean _exists = IterableExtensions.<Attribute>exists(common_attributes, _function_5);
        return Boolean.valueOf((!_exists));
      };
      Iterable<Attribute> _filter = IterableExtensions.<Attribute>filter(left_attributes, _function_4);
      Iterables.<StructuralFeature>addAll(_structuralFeatures_1, _filter);
      EList<StructuralFeature> _structuralFeatures_2 = current_merged_metaclass.getStructuralFeatures();
      final Function1<Attribute, Boolean> _function_5 = (Attribute right_attribute) -> {
        final Function1<Attribute, Boolean> _function_6 = (Attribute common_attribute) -> {
          String _name_2 = common_attribute.getName();
          String _name_3 = right_attribute.getName();
          return Boolean.valueOf(Objects.equal(_name_2, _name_3));
        };
        boolean _exists = IterableExtensions.<Attribute>exists(common_attributes, _function_6);
        return Boolean.valueOf((!_exists));
      };
      Iterable<Attribute> _filter_1 = IterableExtensions.<Attribute>filter(right_attributes, _function_5);
      Iterables.<StructuralFeature>addAll(_structuralFeatures_2, _filter_1);
      final Function1<Reference, Reference> _function_6 = (Reference left_reference) -> {
        Reference _createReference = Differences._metamodelFactory.createReference();
        final Procedure1<Reference> _function_7 = (Reference merged_reference) -> {
          merged_reference.setName(left_reference.getName());
          merged_reference.setType(left_reference.getType());
        };
        return ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_7);
      };
      final Iterable<Reference> left_references = IterableExtensions.<Reference, Reference>map(Iterables.<Reference>filter(it.getCurrent_left_metaclass().getStructuralFeatures(), Reference.class), _function_6);
      final Function1<Reference, Reference> _function_7 = (Reference right_reference) -> {
        Reference _createReference = Differences._metamodelFactory.createReference();
        final Procedure1<Reference> _function_8 = (Reference merged_reference) -> {
          merged_reference.setName(right_reference.getName());
          merged_reference.setType(right_reference.getType());
        };
        return ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_8);
      };
      final Iterable<Reference> right_references = IterableExtensions.<Reference, Reference>map(Iterables.<Reference>filter(it.getCurrent_right_metaclass().getStructuralFeatures(), Reference.class), _function_7);
      final Function1<Reference, Boolean> _function_8 = (Reference left_reference) -> {
        final Function1<Reference, Boolean> _function_9 = (Reference right_reference) -> {
          String _name_2 = right_reference.getName();
          String _name_3 = left_reference.getName();
          return Boolean.valueOf(Objects.equal(_name_2, _name_3));
        };
        return Boolean.valueOf(IterableExtensions.<Reference>exists(right_references, _function_9));
      };
      final Function1<Reference, Reference> _function_9 = (Reference left_reference) -> {
        Reference _createReference = Differences._metamodelFactory.createReference();
        final Procedure1<Reference> _function_10 = (Reference merged_reference) -> {
          merged_reference.setName(left_reference.getName());
          final Function1<Reference, Boolean> _function_11 = (Reference it_1) -> {
            String _name_2 = it_1.getName();
            String _name_3 = left_reference.getName();
            return Boolean.valueOf(Objects.equal(_name_2, _name_3));
          };
          merged_reference.setType(Differences.nearestCommonSuperclass(left_reference.getType(), IterableExtensions.<Reference>findFirst(right_references, _function_11).getType()));
        };
        return ObjectExtensions.<Reference>operator_doubleArrow(_createReference, _function_10);
      };
      final Iterable<Reference> common_references = IterableExtensions.<Reference, Reference>map(IterableExtensions.<Reference>filter(left_references, _function_8), _function_9);
      EList<StructuralFeature> _structuralFeatures_3 = current_merged_metaclass.getStructuralFeatures();
      Iterables.<StructuralFeature>addAll(_structuralFeatures_3, common_references);
      EList<StructuralFeature> _structuralFeatures_4 = current_merged_metaclass.getStructuralFeatures();
      final Function1<Reference, Boolean> _function_10 = (Reference left_reference) -> {
        final Function1<Reference, Boolean> _function_11 = (Reference common_reference) -> {
          String _name_2 = common_reference.getName();
          String _name_3 = left_reference.getName();
          return Boolean.valueOf(Objects.equal(_name_2, _name_3));
        };
        boolean _exists = IterableExtensions.<Reference>exists(common_references, _function_11);
        return Boolean.valueOf((!_exists));
      };
      Iterable<Reference> _filter_2 = IterableExtensions.<Reference>filter(left_references, _function_10);
      Iterables.<StructuralFeature>addAll(_structuralFeatures_4, _filter_2);
      EList<StructuralFeature> _structuralFeatures_5 = current_merged_metaclass.getStructuralFeatures();
      final Function1<Reference, Boolean> _function_11 = (Reference right_reference) -> {
        final Function1<Reference, Boolean> _function_12 = (Reference common_reference) -> {
          String _name_2 = common_reference.getName();
          String _name_3 = right_reference.getName();
          return Boolean.valueOf(Objects.equal(_name_2, _name_3));
        };
        boolean _exists = IterableExtensions.<Reference>exists(common_references, _function_12);
        return Boolean.valueOf((!_exists));
      };
      Iterable<Reference> _filter_3 = IterableExtensions.<Reference>filter(right_references, _function_11);
      Iterables.<StructuralFeature>addAll(_structuralFeatures_5, _filter_3);
      final Function1<Reference, Boolean> _function_12 = (Reference left_reference) -> {
        String _name_2 = left_reference.getType().getName();
        String _name_3 = it.getCurrent_left_metaclass().getName();
        return Boolean.valueOf(Objects.equal(_name_2, _name_3));
      };
      final Procedure1<Reference> _function_13 = (Reference left_reference) -> {
        left_reference.setType(current_merged_metaclass);
      };
      IteratorExtensions.<Reference>forEach(IteratorExtensions.<Reference>filter(Iterators.<Reference>filter(it.getCurrent_left_metaclass().eResource().getAllContents(), Reference.class), _function_12), _function_13);
      final Function1<Reference, Boolean> _function_14 = (Reference right_reference) -> {
        String _name_2 = right_reference.getType().getName();
        String _name_3 = it.getCurrent_right_metaclass().getName();
        return Boolean.valueOf(Objects.equal(_name_2, _name_3));
      };
      final Procedure1<Reference> _function_15 = (Reference right_reference) -> {
        right_reference.setType(current_merged_metaclass);
      };
      IteratorExtensions.<Reference>forEach(IteratorExtensions.<Reference>filter(Iterators.<Reference>filter(it.getCurrent_left_metaclass().eResource().getAllContents(), Reference.class), _function_14), _function_15);
      EList<Classifier> _classifiers = it.getCurrent_package().getClassifiers();
      _classifiers.add(current_merged_metaclass);
      EcoreUtil.delete(it.getCurrent_left_metaclass(), true);
      EcoreUtil.delete(it.getCurrent_right_metaclass(), true);
    })).postcondition(MergeMetaclassesPostcondition.instance()).build();
  
  public final static Difference<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, IMatchProcessor<AddAttributePrecondition.Match>> addAttribute = DifferenceFactory.<AddAttributePrecondition.Match, AddAttributePrecondition.Matcher, AddAttributePrecondition, AddAttributePostcondition.Match, AddAttributePostcondition.Matcher, AddAttributePostcondition, IMatchProcessor<AddAttributePrecondition.Match>>difference().name("AddAttribute").precondition(AddAttributePrecondition.instance()).action(
    ((IMatchProcessor<AddAttributePrecondition.Match>) (AddAttributePrecondition.Match it) -> {
      final Attribute current_attribute = Differences._metamodelFactory.createAttribute();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CREATED_attribute_");
      int _size = it.getCurrent_class().getStructuralFeatures().size();
      _builder.append(_size);
      current_attribute.setName(_builder.toString());
      current_attribute.setType(it.getCurrent_dataType());
      EList<StructuralFeature> _structuralFeatures = it.getCurrent_class().getStructuralFeatures();
      _structuralFeatures.add(current_attribute);
    })).postcondition(AddAttributePostcondition.instance()).build();
  
  public final static Difference<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, IMatchProcessor<DeleteAttributePrecondition.Match>> deleteAttribute = DifferenceFactory.<DeleteAttributePrecondition.Match, DeleteAttributePrecondition.Matcher, DeleteAttributePrecondition, DeleteAttributePostcondition.Match, DeleteAttributePostcondition.Matcher, DeleteAttributePostcondition, IMatchProcessor<DeleteAttributePrecondition.Match>>difference().name("DeleteAttribute").precondition(DeleteAttributePrecondition.instance()).action(
    ((IMatchProcessor<DeleteAttributePrecondition.Match>) (DeleteAttributePrecondition.Match it) -> {
      EcoreUtil.delete(it.getCurrent_attribute(), true);
    })).postcondition(DeleteAttributePostcondition.instance()).build();
  
  public final static Difference<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, IMatchProcessor<ChangeAttributeTypePrecondition.Match>> changeAttributeType = DifferenceFactory.<ChangeAttributeTypePrecondition.Match, ChangeAttributeTypePrecondition.Matcher, ChangeAttributeTypePrecondition, ChangeAttributeTypePostcondition.Match, ChangeAttributeTypePostcondition.Matcher, ChangeAttributeTypePostcondition, IMatchProcessor<ChangeAttributeTypePrecondition.Match>>difference().name("ChangeAttributeType").precondition(ChangeAttributeTypePrecondition.instance()).action(
    ((IMatchProcessor<ChangeAttributeTypePrecondition.Match>) (ChangeAttributeTypePrecondition.Match it) -> {
      Attribute _current_attribute = it.getCurrent_attribute();
      _current_attribute.setType(it.getCurrent_type());
    })).postcondition(ChangeAttributeTypePostcondition.instance()).build();
  
  public final static Difference<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, IMatchProcessor<AddReferencePrecondition.Match>> addReference = DifferenceFactory.<AddReferencePrecondition.Match, AddReferencePrecondition.Matcher, AddReferencePrecondition, AddReferencePostcondition.Match, AddReferencePostcondition.Matcher, AddReferencePostcondition, IMatchProcessor<AddReferencePrecondition.Match>>difference().name("AddReference").precondition(AddReferencePrecondition.instance()).action(
    ((IMatchProcessor<AddReferencePrecondition.Match>) (AddReferencePrecondition.Match it) -> {
      final Reference current_reference = Differences._metamodelFactory.createReference();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("CREATED_reference_");
      int _size = it.getCurrent_class().getStructuralFeatures().size();
      _builder.append(_size);
      current_reference.setName(_builder.toString());
      current_reference.setType(it.getCurrent_type());
      EList<StructuralFeature> _structuralFeatures = it.getCurrent_class().getStructuralFeatures();
      _structuralFeatures.add(current_reference);
    })).postcondition(AddReferencePostcondition.instance()).build();
  
  public final static Difference<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, IMatchProcessor<DeleteReferencePrecondition.Match>> deleteReference = DifferenceFactory.<DeleteReferencePrecondition.Match, DeleteReferencePrecondition.Matcher, DeleteReferencePrecondition, DeleteReferencePostcondition.Match, DeleteReferencePostcondition.Matcher, DeleteReferencePostcondition, IMatchProcessor<DeleteReferencePrecondition.Match>>difference().name("DeleteReference").precondition(DeleteReferencePrecondition.instance()).action(
    ((IMatchProcessor<DeleteReferencePrecondition.Match>) (DeleteReferencePrecondition.Match it) -> {
      EcoreUtil.delete(it.getCurrent_reference(), true);
    })).postcondition(DeleteReferencePostcondition.instance()).build();
  
  public final static Difference<SplitReferencePrecondition.Match, SplitReferencePrecondition.Matcher, SplitReferencePrecondition, SplitReferencePostcondition.Match, SplitReferencePostcondition.Matcher, SplitReferencePostcondition, IMatchProcessor<SplitReferencePrecondition.Match>> splitReference = DifferenceFactory.<SplitReferencePrecondition.Match, SplitReferencePrecondition.Matcher, SplitReferencePrecondition, SplitReferencePostcondition.Match, SplitReferencePostcondition.Matcher, SplitReferencePostcondition, IMatchProcessor<SplitReferencePrecondition.Match>>difference().name("SplitReference").precondition(SplitReferencePrecondition.instance()).action(((IMatchProcessor<SplitReferencePrecondition.Match>) (SplitReferencePrecondition.Match it) -> {
    final EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> current_type_subClasses = it.getCurrent_reference().getType().getSubClasses();
    final Consumer<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _function = (se.mdh.idt.benji.examples.refactorings.metamodel.Class current_type_subClass) -> {
      final Reference current_type_subClass_reference = Differences._metamodelFactory.createReference();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SPLIT_");
      String _name = it.getCurrent_reference().getName();
      _builder.append(_name);
      _builder.append("_");
      String _name_1 = current_type_subClass.getName();
      _builder.append(_name_1);
      current_type_subClass_reference.setName(_builder.toString());
      current_type_subClass_reference.setType(current_type_subClass);
      EList<StructuralFeature> _structuralFeatures = it.getCurrent_class().getStructuralFeatures();
      _structuralFeatures.add(current_type_subClass_reference);
    };
    current_type_subClasses.forEach(_function);
    EcoreUtil.delete(it.getCurrent_reference(), true);
  })).postcondition(SplitReferencePostcondition.instance()).build();
  
  public final static Difference<MergeReferencesPrecondition.Match, MergeReferencesPrecondition.Matcher, MergeReferencesPrecondition, MergeReferencesPostcondition.Match, MergeReferencesPostcondition.Matcher, MergeReferencesPostcondition, IMatchProcessor<MergeReferencesPrecondition.Match>> mergeReferences = DifferenceFactory.<MergeReferencesPrecondition.Match, MergeReferencesPrecondition.Matcher, MergeReferencesPrecondition, MergeReferencesPostcondition.Match, MergeReferencesPostcondition.Matcher, MergeReferencesPostcondition, IMatchProcessor<MergeReferencesPrecondition.Match>>difference().name("MergeReferences").precondition(MergeReferencesPrecondition.instance()).action(
    ((IMatchProcessor<MergeReferencesPrecondition.Match>) (MergeReferencesPrecondition.Match it) -> {
      final Reference current_merged_reference = Differences._metamodelFactory.createReference();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("MERGED_");
      String _name = it.getCurrent_left_reference().getName();
      _builder.append(_name);
      _builder.append("_");
      String _name_1 = it.getCurrent_right_reference().getName();
      _builder.append(_name_1);
      current_merged_reference.setName(_builder.toString());
      current_merged_reference.setType(Differences.nearestCommonSuperclass(it.getCurrent_left_reference().getType(), it.getCurrent_right_reference().getType()));
      EList<StructuralFeature> _structuralFeatures = it.getCurrent_class().getStructuralFeatures();
      _structuralFeatures.add(current_merged_reference);
      EcoreUtil.delete(it.getCurrent_left_reference(), true);
      EcoreUtil.delete(it.getCurrent_right_reference(), true);
    })).postcondition(MergeReferencesPostcondition.instance()).build();
  
  public final static Difference<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, IMatchProcessor<ChangeReferenceTypePrecondition.Match>> changeReferenceType = DifferenceFactory.<ChangeReferenceTypePrecondition.Match, ChangeReferenceTypePrecondition.Matcher, ChangeReferenceTypePrecondition, ChangeReferenceTypePostcondition.Match, ChangeReferenceTypePostcondition.Matcher, ChangeReferenceTypePostcondition, IMatchProcessor<ChangeReferenceTypePrecondition.Match>>difference().name("ChangeReferenceType").precondition(ChangeReferenceTypePrecondition.instance()).action(
    ((IMatchProcessor<ChangeReferenceTypePrecondition.Match>) (ChangeReferenceTypePrecondition.Match it) -> {
      Reference _current_reference = it.getCurrent_reference();
      _current_reference.setType(it.getCurrent_class());
    })).postcondition(ChangeReferenceTypePostcondition.instance()).build();
  
  public final static Difference<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, IMatchProcessor<ExtractSuperclassPrecondition.Match>> extractSuperclass = DifferenceFactory.<ExtractSuperclassPrecondition.Match, ExtractSuperclassPrecondition.Matcher, ExtractSuperclassPrecondition, ExtractSuperclassPostcondition.Match, ExtractSuperclassPostcondition.Matcher, ExtractSuperclassPostcondition, IMatchProcessor<ExtractSuperclassPrecondition.Match>>difference().name("ExtractSuperclass").precondition(ExtractSuperclassPrecondition.instance()).action(
    ((IMatchProcessor<ExtractSuperclassPrecondition.Match>) (ExtractSuperclassPrecondition.Match it) -> {
      final se.mdh.idt.benji.examples.refactorings.metamodel.Class current_superClass = Differences._metamodelFactory.createClass();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SUPER_");
      String _name = it.getInitial_class().getName();
      _builder.append(_name);
      current_superClass.setName(_builder.toString());
      EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _superClasses = current_superClass.getSuperClasses();
      EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _superClasses_1 = it.getInitial_class().getSuperClasses();
      Iterables.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>addAll(_superClasses, _superClasses_1);
      it.getCurrent_class().getSuperClasses().clear();
      EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _superClasses_2 = it.getCurrent_class().getSuperClasses();
      _superClasses_2.add(current_superClass);
      Attribute _current_attribute = it.getCurrent_attribute();
      _current_attribute.setOwner(current_superClass);
      Reference _current_reference = it.getCurrent_reference();
      _current_reference.setOwner(current_superClass);
    })).postcondition(ExtractSuperclassPostcondition.instance()).build();
  
  public final static Difference<ChangeMetaclassAbstractPrecondition.Match, ChangeMetaclassAbstractPrecondition.Matcher, ChangeMetaclassAbstractPrecondition, ChangeMetaclassAbstractPostcondition.Match, ChangeMetaclassAbstractPostcondition.Matcher, ChangeMetaclassAbstractPostcondition, IMatchProcessor<ChangeMetaclassAbstractPrecondition.Match>> changeMetaclassAbstract = DifferenceFactory.<ChangeMetaclassAbstractPrecondition.Match, ChangeMetaclassAbstractPrecondition.Matcher, ChangeMetaclassAbstractPrecondition, ChangeMetaclassAbstractPostcondition.Match, ChangeMetaclassAbstractPostcondition.Matcher, ChangeMetaclassAbstractPostcondition, IMatchProcessor<ChangeMetaclassAbstractPrecondition.Match>>difference().name("ChangeMetaclassAbstract").precondition(ChangeMetaclassAbstractPrecondition.instance()).action(
    ((IMatchProcessor<ChangeMetaclassAbstractPrecondition.Match>) (ChangeMetaclassAbstractPrecondition.Match it) -> {
      se.mdh.idt.benji.examples.refactorings.metamodel.Class _current_metaclass = it.getCurrent_metaclass();
      _current_metaclass.setAbstract(Boolean.valueOf(true));
    })).postcondition(ChangeMetaclassAbstractPostcondition.instance()).build();
  
  public final static Difference<RestrictMetapropertyPrecondition.Match, RestrictMetapropertyPrecondition.Matcher, RestrictMetapropertyPrecondition, RestrictMetapropertyPostcondition.Match, RestrictMetapropertyPostcondition.Matcher, RestrictMetapropertyPostcondition, IMatchProcessor<RestrictMetapropertyPrecondition.Match>> restrictMetaproperty = DifferenceFactory.<RestrictMetapropertyPrecondition.Match, RestrictMetapropertyPrecondition.Matcher, RestrictMetapropertyPrecondition, RestrictMetapropertyPostcondition.Match, RestrictMetapropertyPostcondition.Matcher, RestrictMetapropertyPostcondition, IMatchProcessor<RestrictMetapropertyPrecondition.Match>>difference().name("RestrictMetaproperty").precondition(RestrictMetapropertyPrecondition.instance()).action(
    ((IMatchProcessor<RestrictMetapropertyPrecondition.Match>) (RestrictMetapropertyPrecondition.Match it) -> {
      StructuralFeature _current_property = it.getCurrent_property();
      Integer _upper = it.getInitial_property().getUpper();
      int _minus = ((_upper).intValue() - 1);
      _current_property.setUpper(Integer.valueOf(Math.max(1, _minus)));
    })).postcondition(RestrictMetapropertyPostcondition.instance()).build();
  
  public final static Difference<FlattenHierarchyPrecondition.Match, FlattenHierarchyPrecondition.Matcher, FlattenHierarchyPrecondition, FlattenHierarchyPostcondition.Match, FlattenHierarchyPostcondition.Matcher, FlattenHierarchyPostcondition, IMatchProcessor<FlattenHierarchyPrecondition.Match>> flattenHierarchy = DifferenceFactory.<FlattenHierarchyPrecondition.Match, FlattenHierarchyPrecondition.Matcher, FlattenHierarchyPrecondition, FlattenHierarchyPostcondition.Match, FlattenHierarchyPostcondition.Matcher, FlattenHierarchyPostcondition, IMatchProcessor<FlattenHierarchyPrecondition.Match>>difference().name("FlattenHierarchy").precondition(FlattenHierarchyPrecondition.instance()).action(
    ((IMatchProcessor<FlattenHierarchyPrecondition.Match>) (FlattenHierarchyPrecondition.Match it) -> {
      final Consumer<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _function = (se.mdh.idt.benji.examples.refactorings.metamodel.Class current_subClass) -> {
        final Consumer<Attribute> _function_1 = (Attribute current_class_attribute) -> {
          final Attribute current_subClass_attribute = Differences._metamodelFactory.createAttribute();
          current_subClass_attribute.setName(current_class_attribute.getName());
          current_subClass_attribute.setType(current_class_attribute.getType());
          EList<StructuralFeature> _structuralFeatures = current_subClass.getStructuralFeatures();
          _structuralFeatures.add(current_subClass_attribute);
        };
        Iterables.<Attribute>filter(it.getCurrent_class().getStructuralFeatures(), Attribute.class).forEach(_function_1);
        final Consumer<Reference> _function_2 = (Reference current_class_reference) -> {
          final Reference current_subClass_reference = Differences._metamodelFactory.createReference();
          current_subClass_reference.setName(current_class_reference.getName());
          current_subClass_reference.setType(current_class_reference.getType());
          EList<StructuralFeature> _structuralFeatures = current_subClass.getStructuralFeatures();
          _structuralFeatures.add(current_subClass_reference);
        };
        Iterables.<Reference>filter(it.getCurrent_class().getStructuralFeatures(), Reference.class).forEach(_function_2);
        EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _superClasses = current_subClass.getSuperClasses();
        EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _superClasses_1 = it.getCurrent_class().getSuperClasses();
        Iterables.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>addAll(_superClasses, _superClasses_1);
      };
      it.getCurrent_class().getSubClasses().forEach(_function);
      EcoreUtil.delete(it.getCurrent_class(), true);
    })).postcondition(FlattenHierarchyPostcondition.instance()).build();
  
  public final static Difference<PushDownPropertyPrecondition.Match, PushDownPropertyPrecondition.Matcher, PushDownPropertyPrecondition, PushDownPropertyPostcondition.Match, PushDownPropertyPostcondition.Matcher, PushDownPropertyPostcondition, IMatchProcessor<PushDownPropertyPrecondition.Match>> pushDownProperty = DifferenceFactory.<PushDownPropertyPrecondition.Match, PushDownPropertyPrecondition.Matcher, PushDownPropertyPrecondition, PushDownPropertyPostcondition.Match, PushDownPropertyPostcondition.Matcher, PushDownPropertyPostcondition, IMatchProcessor<PushDownPropertyPrecondition.Match>>difference().name("PushDownProperty").precondition(PushDownPropertyPrecondition.instance()).action(
    ((IMatchProcessor<PushDownPropertyPrecondition.Match>) (PushDownPropertyPrecondition.Match it) -> {
      Attribute _current_property = it.getCurrent_property();
      _current_property.setOwner(it.getCurrent_subClass());
    })).postcondition(PushDownPropertyPostcondition.instance()).build();
  
  private static se.mdh.idt.benji.examples.refactorings.metamodel.Class nearestCommonSuperclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class leftClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class rightClass) {
    final HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> leftSuperclassDistances = Differences.computeSuperclassDistances(leftClass);
    final HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> rightSuperclassDistances = Differences.computeSuperclassDistances(rightClass);
    final Function1<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>> _function = (se.mdh.idt.benji.examples.refactorings.metamodel.Class leftSuperclass) -> {
      Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class> _xblockexpression = null;
      {
        final Function1<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Boolean> _function_1 = (se.mdh.idt.benji.examples.refactorings.metamodel.Class rightSuperclass) -> {
          String _name = rightSuperclass.getName();
          String _name_1 = leftSuperclass.getName();
          return Boolean.valueOf(Objects.equal(_name, _name_1));
        };
        final se.mdh.idt.benji.examples.refactorings.metamodel.Class rightSuperclass = IterableExtensions.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>findFirst(rightSuperclassDistances.keySet(), _function_1);
        Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class> _xifexpression = null;
        if ((rightSuperclass != null)) {
          _xifexpression = Pair.<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>of(leftSuperclass, rightSuperclass);
        } else {
          _xifexpression = null;
        }
        _xblockexpression = _xifexpression;
      }
      return _xblockexpression;
    };
    final Iterable<Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>> commonSuperclasses = IterableExtensions.<Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>>filterNull(IterableExtensions.<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>>map(leftSuperclassDistances.keySet(), _function));
    final Function1<Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>, Integer> _function_1 = (Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class> commonSuperclass) -> {
      Integer _get = leftSuperclassDistances.get(commonSuperclass.getKey());
      Integer _get_1 = rightSuperclassDistances.get(commonSuperclass.getValue());
      return Integer.valueOf(((_get).intValue() + (_get_1).intValue()));
    };
    return IterableExtensions.<Pair<se.mdh.idt.benji.examples.refactorings.metamodel.Class, se.mdh.idt.benji.examples.refactorings.metamodel.Class>, Integer>minBy(commonSuperclasses, _function_1).getKey();
  }
  
  private static HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> computeSuperclassDistances(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> _newHashMap = CollectionLiterals.<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer>newHashMap();
    final Procedure1<HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer>> _function = (HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> superclassDistances) -> {
      Differences.computeSuperclassDistances(class_, superclassDistances, 0);
    };
    return ObjectExtensions.<HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer>>operator_doubleArrow(_newHashMap, _function);
  }
  
  private static void computeSuperclassDistances(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final HashMap<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Integer> superclassDistances, final int currentDistance) {
    se.mdh.idt.benji.examples.refactorings.metamodel.Class _elvis = null;
    final Function1<se.mdh.idt.benji.examples.refactorings.metamodel.Class, Boolean> _function = (se.mdh.idt.benji.examples.refactorings.metamodel.Class superclass) -> {
      String _name = superclass.getName();
      String _name_1 = class_.getName();
      return Boolean.valueOf(Objects.equal(_name, _name_1));
    };
    se.mdh.idt.benji.examples.refactorings.metamodel.Class _findFirst = IterableExtensions.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>findFirst(superclassDistances.keySet(), _function);
    if (_findFirst != null) {
      _elvis = _findFirst;
    } else {
      _elvis = class_;
    }
    final se.mdh.idt.benji.examples.refactorings.metamodel.Class currentKey = _elvis;
    final Integer currentValue = superclassDistances.getOrDefault(currentKey, Integer.valueOf(currentDistance));
    if ((currentDistance < (currentValue).intValue())) {
      superclassDistances.put(currentKey, Integer.valueOf(currentDistance));
    } else {
      superclassDistances.put(currentKey, currentValue);
    }
    final Consumer<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _function_1 = (se.mdh.idt.benji.examples.refactorings.metamodel.Class it) -> {
      Differences.computeSuperclassDistances(it, superclassDistances, (currentDistance + 1));
    };
    class_.getSuperClasses().forEach(_function_1);
  }
}
