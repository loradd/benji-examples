package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ModelElementActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class ClassifierActions {
  public static void delete_classifier(final Classifier classifier) {
    ModelElementActions.delete_modelElement(classifier);
  }
  
  public static void delete_classifier(final TraceLink classifier) {
    ClassifierActions.delete_classifier(classifier.<Classifier>target());
  }
  
  public static String get_classifier_name(final Classifier classifier) {
    return ModelElementActions.get_modelElement_name(classifier);
  }
  
  public static String get_classifier_name(final TraceLink classifier) {
    return ClassifierActions.get_classifier_name(classifier.<Classifier>target());
  }
  
  public static void set_classifier_name(final Classifier classifier, final String name) {
    ModelElementActions.set_modelElement_name(classifier, name);
  }
  
  public static void set_classifier_name(final TraceLink classifier, final String name) {
    ClassifierActions.set_classifier_name(classifier.<Classifier>target(), name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_classifier_package(final Classifier classifier) {
    return classifier.getPackage();
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_classifier_package(final TraceLink classifier) {
    return ClassifierActions.get_classifier_package(classifier.<Classifier>target());
  }
  
  public static void set_classifier_package(final Classifier classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    classifier.setPackage(package_);
  }
  
  public static void set_classifier_package(final Classifier classifier, final TraceLink package_) {
    ClassifierActions.set_classifier_package(classifier, package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_classifier_package(final TraceLink classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    ClassifierActions.set_classifier_package(classifier.<Classifier>target(), package_);
  }
  
  public static void set_classifier_package(final TraceLink classifier, final TraceLink package_) {
    ClassifierActions.set_classifier_package(classifier.<Classifier>target(), package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
}
