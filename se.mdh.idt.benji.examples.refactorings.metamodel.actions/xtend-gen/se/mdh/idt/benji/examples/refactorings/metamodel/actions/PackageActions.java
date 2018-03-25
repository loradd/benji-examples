package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassifierActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class PackageActions {
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package create_package() {
    return MetamodelFactory.eINSTANCE.createPackage();
  }
  
  public static void delete_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    ClassifierActions.delete_classifier(package_);
  }
  
  public static void delete_package(final TraceLink package_) {
    PackageActions.delete_package(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static String get_package_name(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return ClassifierActions.get_classifier_name(package_);
  }
  
  public static String get_package_name(final TraceLink package_) {
    return PackageActions.get_package_name(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_package_name(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final String name) {
    ClassifierActions.set_classifier_name(package_, name);
  }
  
  public static void set_package_name(final TraceLink package_, final String name) {
    PackageActions.set_package_name(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_package_superPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return ClassifierActions.get_classifier_package(package_);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_package_superPackage(final TraceLink package_) {
    return PackageActions.get_package_superPackage(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_package_superPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package superPackage) {
    ClassifierActions.set_classifier_package(package_, superPackage);
  }
  
  public static void set_package_superPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink superPackage) {
    PackageActions.set_package_superPackage(package_, superPackage.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_package_superPackage(final TraceLink package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package superPackage) {
    PackageActions.set_package_superPackage(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), superPackage);
  }
  
  public static void set_package_superPackage(final TraceLink package_, final TraceLink superPackage) {
    PackageActions.set_package_superPackage(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), superPackage.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static String get_package_uri(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return package_.getUri();
  }
  
  public static String get_package_uri(final TraceLink package_) {
    return PackageActions.get_package_uri(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_package_uri(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final String uri) {
    package_.setUri(uri);
  }
  
  public static void set_package_uri(final TraceLink package_, final String uri) {
    PackageActions.set_package_uri(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), uri);
  }
  
  public static Iterable<Classifier> get_package_classifiers(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return package_.getClassifiers();
  }
  
  public static Iterable<Classifier> get_package_classifiers(final TraceLink package_) {
    return PackageActions.get_package_classifiers(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void insert_package_classifier(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final Classifier classifier) {
    EList<Classifier> _classifiers = package_.getClassifiers();
    _classifiers.add(classifier);
  }
  
  public static void insert_package_classifier(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink classifier) {
    PackageActions.insert_package_classifier(package_, classifier.<Classifier>target());
  }
  
  public static void insert_package_classifier(final TraceLink package_, final Classifier classifier) {
    PackageActions.insert_package_classifier(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), classifier);
  }
  
  public static void insert_package_classifier(final TraceLink package_, final TraceLink classifier) {
    PackageActions.insert_package_classifier(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), classifier.<Classifier>target());
  }
  
  public static void remove_package_classifier(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final Classifier classifier) {
    EList<Classifier> _classifiers = package_.getClassifiers();
    _classifiers.remove(classifier);
  }
  
  public static void remove_package_classifier(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink classifier) {
    PackageActions.remove_package_classifier(package_, classifier.<Classifier>target());
  }
  
  public static void remove_package_classifier(final TraceLink package_, final Classifier classifier) {
    PackageActions.remove_package_classifier(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), classifier);
  }
  
  public static void remove_package_classifier(final TraceLink package_, final TraceLink classifier) {
    PackageActions.remove_package_classifier(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), classifier.<Classifier>target());
  }
  
  public static Iterable<se.mdh.idt.benji.examples.refactorings.metamodel.Class> get_package_classes(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return Iterables.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>filter(PackageActions.get_package_classifiers(package_), se.mdh.idt.benji.examples.refactorings.metamodel.Class.class);
  }
  
  public static Iterable<se.mdh.idt.benji.examples.refactorings.metamodel.Class> get_package_classes(final TraceLink package_) {
    return PackageActions.get_package_classes(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void insert_package_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    PackageActions.insert_package_classifier(package_, class_);
  }
  
  public static void insert_package_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink class_) {
    PackageActions.insert_package_class(package_, class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void insert_package_class(final TraceLink package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    PackageActions.insert_package_class(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), class_);
  }
  
  public static void insert_package_class(final TraceLink package_, final TraceLink class_) {
    PackageActions.insert_package_class(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void remove_package_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    PackageActions.remove_package_classifier(package_, class_);
  }
  
  public static void remove_package_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink class_) {
    PackageActions.remove_package_class(package_, class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static void remove_package_class(final TraceLink package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Class class_) {
    PackageActions.remove_package_class(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), class_);
  }
  
  public static void remove_package_class(final TraceLink package_, final TraceLink class_) {
    PackageActions.remove_package_class(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), class_.<se.mdh.idt.benji.examples.refactorings.metamodel.Class>target());
  }
  
  public static Iterable<se.mdh.idt.benji.examples.refactorings.metamodel.Package> get_package_subPackages(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return Iterables.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>filter(PackageActions.get_package_classifiers(package_), se.mdh.idt.benji.examples.refactorings.metamodel.Package.class);
  }
  
  public static Iterable<se.mdh.idt.benji.examples.refactorings.metamodel.Package> get_package_subPackages(final TraceLink package_) {
    return PackageActions.get_package_subPackages(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void insert_package_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package subPackage) {
    PackageActions.insert_package_classifier(package_, subPackage);
  }
  
  public static void insert_package_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink subPackage) {
    PackageActions.insert_package_subPackage(package_, subPackage.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void insert_package_subPackage(final TraceLink package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package subPackage) {
    PackageActions.insert_package_subPackage(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), subPackage);
  }
  
  public static void insert_package_subPackage(final TraceLink package_, final TraceLink subPackage) {
    PackageActions.insert_package_subPackage(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), subPackage.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void remove_package_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package subPackage) {
    PackageActions.remove_package_classifier(package_, subPackage);
  }
  
  public static void remove_package_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink subPackage) {
    PackageActions.remove_package_subPackage(package_, subPackage.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void remove_package_subPackage(final TraceLink package_, final se.mdh.idt.benji.examples.refactorings.metamodel.Package subPackage) {
    PackageActions.remove_package_subPackage(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), subPackage);
  }
  
  public static void remove_package_subPackage(final TraceLink package_, final TraceLink subPackage) {
    PackageActions.remove_package_subPackage(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), subPackage.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static Iterable<DataType> get_package_datatypes(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return Iterables.<DataType>filter(PackageActions.get_package_classifiers(package_), DataType.class);
  }
  
  public static Iterable<DataType> get_package_datatypes(final TraceLink package_) {
    return PackageActions.get_package_datatypes(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void insert_package_datatype(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final DataType datatype) {
    PackageActions.insert_package_classifier(package_, datatype);
  }
  
  public static void insert_package_datatype(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink datatype) {
    PackageActions.insert_package_datatype(package_, datatype.<DataType>target());
  }
  
  public static void insert_package_datatype(final TraceLink package_, final DataType datatype) {
    PackageActions.insert_package_datatype(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), datatype);
  }
  
  public static void insert_package_datatype(final TraceLink package_, final TraceLink datatype) {
    PackageActions.insert_package_datatype(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), datatype.<DataType>target());
  }
  
  public static void remove_package_datatype(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final DataType datatype) {
    PackageActions.remove_package_classifier(package_, datatype);
  }
  
  public static void remove_package_datatype(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink datatype) {
    PackageActions.remove_package_datatype(package_, datatype.<DataType>target());
  }
  
  public static void remove_package_datatype(final TraceLink package_, final DataType datatype) {
    PackageActions.remove_package_datatype(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), datatype);
  }
  
  public static void remove_package_datatype(final TraceLink package_, final TraceLink datatype) {
    PackageActions.remove_package_datatype(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), datatype.<DataType>target());
  }
  
  public static Iterable<Enumeration> get_package_enumerations(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    return Iterables.<Enumeration>filter(PackageActions.get_package_datatypes(package_), Enumeration.class);
  }
  
  public static Iterable<Enumeration> get_package_enumerations(final TraceLink package_) {
    return PackageActions.get_package_enumerations(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void insert_package_enumeration(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final Enumeration enumeration) {
    PackageActions.insert_package_datatype(package_, enumeration);
  }
  
  public static void insert_package_enumeration(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink enumeration) {
    PackageActions.insert_package_enumeration(package_, enumeration.<Enumeration>target());
  }
  
  public static void insert_package_enumeration(final TraceLink package_, final Enumeration enumeration) {
    PackageActions.insert_package_enumeration(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), enumeration);
  }
  
  public static void insert_package_enumeration(final TraceLink package_, final TraceLink enumeration) {
    PackageActions.insert_package_enumeration(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), enumeration.<Enumeration>target());
  }
  
  public static void remove_package_enumeration(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final Enumeration enumeration) {
    PackageActions.remove_package_datatype(package_, enumeration);
  }
  
  public static void remove_package_enumeration(final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_, final TraceLink enumeration) {
    PackageActions.remove_package_enumeration(package_, enumeration.<Enumeration>target());
  }
  
  public static void remove_package_enumeration(final TraceLink package_, final Enumeration enumeration) {
    PackageActions.remove_package_enumeration(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), enumeration);
  }
  
  public static void remove_package_enumeration(final TraceLink package_, final TraceLink enumeration) {
    PackageActions.remove_package_enumeration(package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target(), enumeration.<Enumeration>target());
  }
}
