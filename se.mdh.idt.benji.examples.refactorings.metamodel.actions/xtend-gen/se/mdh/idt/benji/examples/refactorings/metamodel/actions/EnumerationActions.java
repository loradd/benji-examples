package se.mdh.idt.benji.examples.refactorings.metamodel.actions;

import org.eclipse.emf.common.util.EList;
import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelFactory;
import se.mdh.idt.benji.examples.refactorings.metamodel.actions.DataTypeActions;
import se.mdh.idt.benji.trace.TraceLink;

@SuppressWarnings("all")
public class EnumerationActions {
  public static Enumeration create_enumeration() {
    return MetamodelFactory.eINSTANCE.createEnumeration();
  }
  
  public static void delete_enumeration(final Enumeration enumeration) {
    DataTypeActions.delete_datatype(enumeration);
  }
  
  public static void delete_enumeration(final TraceLink enumeration) {
    EnumerationActions.delete_enumeration(enumeration.<Enumeration>target());
  }
  
  public static String get_enumeration_name(final Enumeration enumeration) {
    return DataTypeActions.get_datatype_name(enumeration);
  }
  
  public static String get_enumeration_name(final TraceLink enumeration) {
    return EnumerationActions.get_enumeration_name(enumeration.<Enumeration>target());
  }
  
  public static void set_enumeration_name(final Enumeration enumeration, final String name) {
    DataTypeActions.set_datatype_name(enumeration, name);
  }
  
  public static void set_enumeration_name(final TraceLink enumeration, final String name) {
    EnumerationActions.set_enumeration_name(enumeration.<Enumeration>target(), name);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_enumeration_package(final Enumeration enumeration) {
    return DataTypeActions.get_datatype_package(enumeration);
  }
  
  public static se.mdh.idt.benji.examples.refactorings.metamodel.Package get_enumeration_package(final TraceLink enumeration) {
    return EnumerationActions.get_enumeration_package(enumeration.<Enumeration>target());
  }
  
  public static void set_enumeration_package(final Enumeration enumeration, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    DataTypeActions.set_datatype_package(enumeration, package_);
  }
  
  public static void set_enumeration_package(final Enumeration enumeration, final TraceLink package_) {
    EnumerationActions.set_enumeration_package(enumeration, package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static void set_enumeration_package(final TraceLink enumeration, final se.mdh.idt.benji.examples.refactorings.metamodel.Package package_) {
    EnumerationActions.set_enumeration_package(enumeration.<Enumeration>target(), package_);
  }
  
  public static void set_enumeration_package(final TraceLink enumeration, final TraceLink package_) {
    EnumerationActions.set_enumeration_package(enumeration.<Enumeration>target(), package_.<se.mdh.idt.benji.examples.refactorings.metamodel.Package>target());
  }
  
  public static Iterable<EnumerationLiteral> get_enumeration_enumerationLiterals(final Enumeration enumeration) {
    return enumeration.getEnumerationLiterals();
  }
  
  public static Iterable<EnumerationLiteral> get_enumeration_enumerationLiterals(final TraceLink enumeration) {
    return EnumerationActions.get_enumeration_enumerationLiterals(enumeration.<Enumeration>target());
  }
  
  public static void insert_enumeration_enumerationLiteral(final Enumeration enumeration, final EnumerationLiteral enumerationLiteral) {
    EList<EnumerationLiteral> _enumerationLiterals = enumeration.getEnumerationLiterals();
    _enumerationLiterals.add(enumerationLiteral);
  }
  
  public static void insert_enumeration_enumerationLiteral(final Enumeration enumeration, final TraceLink enumerationLiteral) {
    EnumerationActions.insert_enumeration_enumerationLiteral(enumeration, enumerationLiteral.<EnumerationLiteral>target());
  }
  
  public static void insert_enumeration_enumerationLiteral(final TraceLink enumeration, final EnumerationLiteral enumerationLiteral) {
    EnumerationActions.insert_enumeration_enumerationLiteral(enumeration.<Enumeration>target(), enumerationLiteral);
  }
  
  public static void insert_enumeration_enumerationLiteral(final TraceLink enumeration, final TraceLink enumerationLiteral) {
    EnumerationActions.insert_enumeration_enumerationLiteral(enumeration.<Enumeration>target(), enumerationLiteral.<EnumerationLiteral>target());
  }
  
  public static void remove_enumeration_enumerationLiteral(final Enumeration enumeration, final EnumerationLiteral enumerationLiteral) {
    EList<EnumerationLiteral> _enumerationLiterals = enumeration.getEnumerationLiterals();
    _enumerationLiterals.remove(enumerationLiteral);
  }
  
  public static void remove_enumeration_enumerationLiteral(final Enumeration enumeration, final TraceLink enumerationLiteral) {
    EnumerationActions.remove_enumeration_enumerationLiteral(enumeration, enumerationLiteral.<EnumerationLiteral>target());
  }
  
  public static void remove_enumeration_enumerationLiteral(final TraceLink enumeration, final EnumerationLiteral enumerationLiteral) {
    EnumerationActions.remove_enumeration_enumerationLiteral(enumeration.<Enumeration>target(), enumerationLiteral);
  }
  
  public static void remove_enumeration_enumerationLiteral(final TraceLink enumeration, final TraceLink enumerationLiteral) {
    EnumerationActions.remove_enumeration_enumerationLiteral(enumeration.<Enumeration>target(), enumerationLiteral.<EnumerationLiteral>target());
  }
}
