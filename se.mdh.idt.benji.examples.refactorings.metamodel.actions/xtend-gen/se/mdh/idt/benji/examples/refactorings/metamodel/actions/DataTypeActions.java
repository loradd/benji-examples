package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.ClassifierActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class DataTypeActions {
  public static DataType create_datatype() {
    return MetamodelFactory.eINSTANCE.createDataType();
  }
  
  public static void delete_datatype(final DataType datatype) {
    ClassifierActions.delete_classifier(datatype);
  }
  
  public static void delete_class(final TraceLink datatype) {
    DataTypeActions.delete_datatype(datatype.<DataType>target());
  }
  
  public static String get_datatype_name(final DataType datatype) {
    return ClassifierActions.get_classifier_name(datatype);
  }
  
  public static String get_datatype_name(final TraceLink datatype) {
    return DataTypeActions.get_datatype_name(datatype.<DataType>target());
  }
  
  public static void set_datatype_name(final DataType datatype, final String name) {
    ClassifierActions.set_classifier_name(datatype, name);
  }
  
  public static void set_datatype_name(final TraceLink datatype, final String name) {
    DataTypeActions.set_datatype_name(datatype, name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_datatype_package(final DataType datatype) {
    return ClassifierActions.get_classifier_package(datatype);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_datatype_package(final TraceLink datatype) {
    return DataTypeActions.get_datatype_package(datatype.<DataType>target());
  }
  
  public static void set_datatype_package(final DataType datatype, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    ClassifierActions.set_classifier_package(datatype, package_);
  }
  
  public static void set_datatype_package(final DataType datatype, final TraceLink package_) {
    DataTypeActions.set_datatype_package(datatype, package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_datatype_package(final TraceLink datatype, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    DataTypeActions.set_datatype_package(datatype.<DataType>target(), package_);
  }
  
  public static void set_datatype_package(final TraceLink datatype, final TraceLink package_) {
    DataTypeActions.set_datatype_package(datatype.<DataType>target(), package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
}
