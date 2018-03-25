package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassifierActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class ClassActions {
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class create_class() {
    return MetamodelFactory.eINSTANCE.createClass();
  }
  
  public static void delete_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    ClassifierActions.delete_classifier(class_);
  }
  
  public static void delete_class(final TraceLink class_) {
    ClassActions.delete_class(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static String get_class_name(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return ClassifierActions.get_classifier_name(class_);
  }
  
  public static String get_class_name(final TraceLink class_) {
    return ClassActions.get_class_name(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_class_name(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final String name) {
    ClassifierActions.set_classifier_name(class_, name);
  }
  
  public static void set_class_name(final TraceLink class_, final String name) {
    ClassActions.set_class_name(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_class_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return ClassifierActions.get_classifier_package(class_);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_class_package(final TraceLink class_) {
    return ClassActions.get_class_package(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_class_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    ClassifierActions.set_classifier_package(class_, package_);
  }
  
  public static void set_class_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink package_) {
    ClassActions.set_class_package(class_, package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_class_package(final TraceLink class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    ClassActions.set_class_package(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), package_);
  }
  
  public static void set_class_package(final TraceLink class_, final TraceLink package_) {
    ClassActions.set_class_package(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static Boolean get_class_abstract(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return class_.getAbstract();
  }
  
  public static Boolean get_class_abstract(final TraceLink class_) {
    return ClassActions.get_class_abstract(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_class_abstract(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final Boolean abstract_) {
    class_.setAbstract(abstract_);
  }
  
  public static void set_class_abstract(final TraceLink class_, final Boolean abstract_) {
    ClassActions.set_class_abstract(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), abstract_);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_class_superClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return class_.getSuperClass();
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Class get_class_superClass(final TraceLink class_) {
    return ClassActions.get_class_superClass(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_class_superClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class superClass) {
    class_.setSuperClass(superClass);
  }
  
  public static void set_class_superClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink superClass) {
    ClassActions.set_class_superClass(class_, superClass.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void set_class_superClass(final TraceLink class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class superClass) {
    ClassActions.set_class_superClass(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), superClass);
  }
  
  public static void set_class_superClass(final TraceLink class_, final TraceLink superClass) {
    ClassActions.set_class_superClass(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), superClass.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static Iterable<se.mdh.idt.benji.examples.refactorings.metamodel.Class> get_class_subClasses(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return class_.getSubClasses();
  }
  
  public static Iterable<se.mdh.idt.benji.examples.refactorings.metamodel.Class> get_class_subClasses(final TraceLink class_) {
    return ClassActions.get_class_subClasses(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void insert_class_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class subClass) {
    EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _subClasses = class_.getSubClasses();
    _subClasses.add(subClass);
  }
  
  public static void insert_class_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink subClass) {
    ClassActions.insert_class_subClass(class_, subClass.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void insert_class_subClass(final TraceLink class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class subClass) {
    ClassActions.insert_class_subClass(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), subClass);
  }
  
  public static void insert_class_subClass(final TraceLink class_, final TraceLink subClass) {
    ClassActions.insert_class_subClass(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), subClass.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void remove_class_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class subClass) {
    EList<se.mdh.idt.benji.examples.refactorings.metamodel.Class> _subClasses = class_.getSubClasses();
    _subClasses.remove(subClass);
  }
  
  public static void remove_class_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink subClass) {
    ClassActions.remove_class_subClass(class_, subClass.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void remove_class_subClass(final TraceLink class_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class subClass) {
    ClassActions.remove_class_subClass(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), subClass);
  }
  
  public static void remove_class_subClass(final TraceLink class_, final TraceLink subClass) {
    ClassActions.remove_class_subClass(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), subClass.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static Iterable<StructuralFeature> get_class_structuralFeatures(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return class_.getStructuralFeatures();
  }
  
  public static Iterable<StructuralFeature> get_class_structuralFeatures(final TraceLink class_) {
    return ClassActions.get_class_structuralFeatures(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void insert_class_structuralFeature(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final StructuralFeature structuralFeature) {
    EList<StructuralFeature> _structuralFeatures = class_.getStructuralFeatures();
    _structuralFeatures.add(structuralFeature);
  }
  
  public static void insert_class_structuralFeature(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink structuralFeature) {
    ClassActions.insert_class_structuralFeature(class_, structuralFeature.<StructuralFeature>target());
  }
  
  public static void insert_class_structuralFeature(final TraceLink class_, final StructuralFeature structuralFeature) {
    ClassActions.insert_class_structuralFeature(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), structuralFeature);
  }
  
  public static void insert_class_structuralFeature(final TraceLink class_, final TraceLink structuralFeature) {
    ClassActions.insert_class_structuralFeature(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), structuralFeature.<StructuralFeature>target());
  }
  
  public static void remove_class_structuralFeature(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final StructuralFeature structuralFeature) {
    EList<StructuralFeature> _structuralFeatures = class_.getStructuralFeatures();
    _structuralFeatures.remove(structuralFeature);
  }
  
  public static void remove_class_structuralFeature(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink structuralFeature) {
    ClassActions.remove_class_structuralFeature(class_, structuralFeature.<StructuralFeature>target());
  }
  
  public static void remove_class_structuralFeature(final TraceLink class_, final StructuralFeature structuralFeature) {
    ClassActions.remove_class_structuralFeature(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), structuralFeature);
  }
  
  public static void remove_class_structuralFeature(final TraceLink class_, final TraceLink structuralFeature) {
    ClassActions.remove_class_structuralFeature(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), structuralFeature.<StructuralFeature>target());
  }
  
  public static Iterable<Attribute> get_class_attributes(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return Iterables.<Attribute>filter(ClassActions.get_class_structuralFeatures(class_), Attribute.class);
  }
  
  public static Iterable<Attribute> get_class_attributes(final TraceLink class_) {
    return ClassActions.get_class_attributes(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void insert_class_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final Attribute attribute) {
    ClassActions.insert_class_structuralFeature(class_, attribute);
  }
  
  public static void insert_class_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink attribute) {
    ClassActions.insert_class_attribute(class_, attribute.<Attribute>target());
  }
  
  public static void insert_class_attribute(final TraceLink class_, final Attribute attribute) {
    ClassActions.insert_class_attribute(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), attribute);
  }
  
  public static void insert_class_attribute(final TraceLink class_, final TraceLink attribute) {
    ClassActions.insert_class_attribute(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), attribute.<Attribute>target());
  }
  
  public static void remove_class_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final Attribute attribute) {
    ClassActions.remove_class_structuralFeature(class_, attribute);
  }
  
  public static void remove_class_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink attribute) {
    ClassActions.remove_class_attribute(class_, attribute.<Attribute>target());
  }
  
  public static void remove_class_attribute(final TraceLink class_, final Attribute attribute) {
    ClassActions.remove_class_attribute(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), attribute);
  }
  
  public static void remove_class_attribute(final TraceLink class_, final TraceLink attribute) {
    ClassActions.remove_class_attribute(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), attribute.<Attribute>target());
  }
  
  public static Iterable<Reference> get_class_references(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    return Iterables.<Reference>filter(ClassActions.get_class_structuralFeatures(class_), Reference.class);
  }
  
  public static Iterable<Reference> get_class_references(final TraceLink class_) {
    return ClassActions.get_class_references(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void insert_class_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final Reference reference) {
    ClassActions.insert_class_structuralFeature(class_, reference);
  }
  
  public static void insert_class_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink reference) {
    ClassActions.insert_class_reference(class_, reference.<Reference>target());
  }
  
  public static void insert_class_reference(final TraceLink class_, final Reference reference) {
    ClassActions.insert_class_reference(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), reference);
  }
  
  public static void insert_class_reference(final TraceLink class_, final TraceLink reference) {
    ClassActions.insert_class_reference(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), reference.<Reference>target());
  }
  
  public static void remove_class_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final Reference reference) {
    ClassActions.remove_class_structuralFeature(class_, reference);
  }
  
  public static void remove_class_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_, final TraceLink reference) {
    ClassActions.remove_class_reference(class_, reference.<Reference>target());
  }
  
  public static void remove_class_reference(final TraceLink class_, final Reference reference) {
    ClassActions.remove_class_reference(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), reference);
  }
  
  public static void remove_class_reference(final TraceLink class_, final TraceLink reference) {
    ClassActions.remove_class_reference(class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target(), reference.<Reference>target());
  }
}
