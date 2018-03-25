/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/PackageQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_package_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_package_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_package_uri;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_package_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_package_superPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_package_uri;

/**
 * A pattern group formed of all public patterns defined in PackageQueries.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file PackageQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_package</li>
 * <li>create_package</li>
 * <li>delete_package</li>
 * <li>initial_package</li>
 * <li>current_package</li>
 * <li>get_package_name</li>
 * <li>set_package_name</li>
 * <li>unset_package_name</li>
 * <li>initial_package_name</li>
 * <li>current_package_name</li>
 * <li>get_package_superPackage</li>
 * <li>set_package_superPackage</li>
 * <li>unset_package_superPackage</li>
 * <li>initial_package_superPackage</li>
 * <li>current_package_superPackage</li>
 * <li>get_package_uri</li>
 * <li>set_package_uri</li>
 * <li>unset_package_uri</li>
 * <li>initial_package_uri</li>
 * <li>current_package_uri</li>
 * <li>get_package_classifier</li>
 * <li>insert_package_classifier</li>
 * <li>remove_package_classifier</li>
 * <li>initial_package_classifier</li>
 * <li>current_package_classifier</li>
 * <li>get_package_subPackage</li>
 * <li>insert_package_subPackage</li>
 * <li>remove_package_subPackage</li>
 * <li>initial_package_subPackage</li>
 * <li>current_package_subPackage</li>
 * <li>get_package_class</li>
 * <li>insert_package_class</li>
 * <li>remove_package_class</li>
 * <li>initial_package_class</li>
 * <li>current_package_class</li>
 * <li>get_package_datatype</li>
 * <li>insert_package_datatype</li>
 * <li>remove_package_datatype</li>
 * <li>initial_package_datatype</li>
 * <li>current_package_datatype</li>
 * <li>get_package_enumeration</li>
 * <li>insert_package_enumeration</li>
 * <li>remove_package_enumeration</li>
 * <li>initial_package_enumeration</li>
 * <li>current_package_enumeration</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class PackageQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static PackageQueries instance() {
    if (INSTANCE == null) {
        INSTANCE = new PackageQueries();
    }
    return INSTANCE;
  }
  
  private static PackageQueries INSTANCE;
  
  private PackageQueries() {
    querySpecifications.add(Get_package.instance());
    querySpecifications.add(Create_package.instance());
    querySpecifications.add(Delete_package.instance());
    querySpecifications.add(Initial_package.instance());
    querySpecifications.add(Current_package.instance());
    querySpecifications.add(Get_package_name.instance());
    querySpecifications.add(Set_package_name.instance());
    querySpecifications.add(Unset_package_name.instance());
    querySpecifications.add(Initial_package_name.instance());
    querySpecifications.add(Current_package_name.instance());
    querySpecifications.add(Get_package_superPackage.instance());
    querySpecifications.add(Set_package_superPackage.instance());
    querySpecifications.add(Unset_package_superPackage.instance());
    querySpecifications.add(Initial_package_superPackage.instance());
    querySpecifications.add(Current_package_superPackage.instance());
    querySpecifications.add(Get_package_uri.instance());
    querySpecifications.add(Set_package_uri.instance());
    querySpecifications.add(Unset_package_uri.instance());
    querySpecifications.add(Initial_package_uri.instance());
    querySpecifications.add(Current_package_uri.instance());
    querySpecifications.add(Get_package_classifier.instance());
    querySpecifications.add(Insert_package_classifier.instance());
    querySpecifications.add(Remove_package_classifier.instance());
    querySpecifications.add(Initial_package_classifier.instance());
    querySpecifications.add(Current_package_classifier.instance());
    querySpecifications.add(Get_package_subPackage.instance());
    querySpecifications.add(Insert_package_subPackage.instance());
    querySpecifications.add(Remove_package_subPackage.instance());
    querySpecifications.add(Initial_package_subPackage.instance());
    querySpecifications.add(Current_package_subPackage.instance());
    querySpecifications.add(Get_package_class.instance());
    querySpecifications.add(Insert_package_class.instance());
    querySpecifications.add(Remove_package_class.instance());
    querySpecifications.add(Initial_package_class.instance());
    querySpecifications.add(Current_package_class.instance());
    querySpecifications.add(Get_package_datatype.instance());
    querySpecifications.add(Insert_package_datatype.instance());
    querySpecifications.add(Remove_package_datatype.instance());
    querySpecifications.add(Initial_package_datatype.instance());
    querySpecifications.add(Current_package_datatype.instance());
    querySpecifications.add(Get_package_enumeration.instance());
    querySpecifications.add(Insert_package_enumeration.instance());
    querySpecifications.add(Remove_package_enumeration.instance());
    querySpecifications.add(Initial_package_enumeration.instance());
    querySpecifications.add(Current_package_enumeration.instance());
  }
  
  public Get_package getGet_package() {
    return Get_package.instance();
  }
  
  public Get_package.Matcher getGet_package(final ViatraQueryEngine engine) {
    return Get_package.Matcher.on(engine);
  }
  
  public Create_package getCreate_package() {
    return Create_package.instance();
  }
  
  public Create_package.Matcher getCreate_package(final ViatraQueryEngine engine) {
    return Create_package.Matcher.on(engine);
  }
  
  public Delete_package getDelete_package() {
    return Delete_package.instance();
  }
  
  public Delete_package.Matcher getDelete_package(final ViatraQueryEngine engine) {
    return Delete_package.Matcher.on(engine);
  }
  
  public Initial_package getInitial_package() {
    return Initial_package.instance();
  }
  
  public Initial_package.Matcher getInitial_package(final ViatraQueryEngine engine) {
    return Initial_package.Matcher.on(engine);
  }
  
  public Current_package getCurrent_package() {
    return Current_package.instance();
  }
  
  public Current_package.Matcher getCurrent_package(final ViatraQueryEngine engine) {
    return Current_package.Matcher.on(engine);
  }
  
  public Get_package_name getGet_package_name() {
    return Get_package_name.instance();
  }
  
  public Get_package_name.Matcher getGet_package_name(final ViatraQueryEngine engine) {
    return Get_package_name.Matcher.on(engine);
  }
  
  public Set_package_name getSet_package_name() {
    return Set_package_name.instance();
  }
  
  public Set_package_name.Matcher getSet_package_name(final ViatraQueryEngine engine) {
    return Set_package_name.Matcher.on(engine);
  }
  
  public Unset_package_name getUnset_package_name() {
    return Unset_package_name.instance();
  }
  
  public Unset_package_name.Matcher getUnset_package_name(final ViatraQueryEngine engine) {
    return Unset_package_name.Matcher.on(engine);
  }
  
  public Initial_package_name getInitial_package_name() {
    return Initial_package_name.instance();
  }
  
  public Initial_package_name.Matcher getInitial_package_name(final ViatraQueryEngine engine) {
    return Initial_package_name.Matcher.on(engine);
  }
  
  public Current_package_name getCurrent_package_name() {
    return Current_package_name.instance();
  }
  
  public Current_package_name.Matcher getCurrent_package_name(final ViatraQueryEngine engine) {
    return Current_package_name.Matcher.on(engine);
  }
  
  public Get_package_superPackage getGet_package_superPackage() {
    return Get_package_superPackage.instance();
  }
  
  public Get_package_superPackage.Matcher getGet_package_superPackage(final ViatraQueryEngine engine) {
    return Get_package_superPackage.Matcher.on(engine);
  }
  
  public Set_package_superPackage getSet_package_superPackage() {
    return Set_package_superPackage.instance();
  }
  
  public Set_package_superPackage.Matcher getSet_package_superPackage(final ViatraQueryEngine engine) {
    return Set_package_superPackage.Matcher.on(engine);
  }
  
  public Unset_package_superPackage getUnset_package_superPackage() {
    return Unset_package_superPackage.instance();
  }
  
  public Unset_package_superPackage.Matcher getUnset_package_superPackage(final ViatraQueryEngine engine) {
    return Unset_package_superPackage.Matcher.on(engine);
  }
  
  public Initial_package_superPackage getInitial_package_superPackage() {
    return Initial_package_superPackage.instance();
  }
  
  public Initial_package_superPackage.Matcher getInitial_package_superPackage(final ViatraQueryEngine engine) {
    return Initial_package_superPackage.Matcher.on(engine);
  }
  
  public Current_package_superPackage getCurrent_package_superPackage() {
    return Current_package_superPackage.instance();
  }
  
  public Current_package_superPackage.Matcher getCurrent_package_superPackage(final ViatraQueryEngine engine) {
    return Current_package_superPackage.Matcher.on(engine);
  }
  
  public Get_package_uri getGet_package_uri() {
    return Get_package_uri.instance();
  }
  
  public Get_package_uri.Matcher getGet_package_uri(final ViatraQueryEngine engine) {
    return Get_package_uri.Matcher.on(engine);
  }
  
  public Set_package_uri getSet_package_uri() {
    return Set_package_uri.instance();
  }
  
  public Set_package_uri.Matcher getSet_package_uri(final ViatraQueryEngine engine) {
    return Set_package_uri.Matcher.on(engine);
  }
  
  public Unset_package_uri getUnset_package_uri() {
    return Unset_package_uri.instance();
  }
  
  public Unset_package_uri.Matcher getUnset_package_uri(final ViatraQueryEngine engine) {
    return Unset_package_uri.Matcher.on(engine);
  }
  
  public Initial_package_uri getInitial_package_uri() {
    return Initial_package_uri.instance();
  }
  
  public Initial_package_uri.Matcher getInitial_package_uri(final ViatraQueryEngine engine) {
    return Initial_package_uri.Matcher.on(engine);
  }
  
  public Current_package_uri getCurrent_package_uri() {
    return Current_package_uri.instance();
  }
  
  public Current_package_uri.Matcher getCurrent_package_uri(final ViatraQueryEngine engine) {
    return Current_package_uri.Matcher.on(engine);
  }
  
  public Get_package_classifier getGet_package_classifier() {
    return Get_package_classifier.instance();
  }
  
  public Get_package_classifier.Matcher getGet_package_classifier(final ViatraQueryEngine engine) {
    return Get_package_classifier.Matcher.on(engine);
  }
  
  public Insert_package_classifier getInsert_package_classifier() {
    return Insert_package_classifier.instance();
  }
  
  public Insert_package_classifier.Matcher getInsert_package_classifier(final ViatraQueryEngine engine) {
    return Insert_package_classifier.Matcher.on(engine);
  }
  
  public Remove_package_classifier getRemove_package_classifier() {
    return Remove_package_classifier.instance();
  }
  
  public Remove_package_classifier.Matcher getRemove_package_classifier(final ViatraQueryEngine engine) {
    return Remove_package_classifier.Matcher.on(engine);
  }
  
  public Initial_package_classifier getInitial_package_classifier() {
    return Initial_package_classifier.instance();
  }
  
  public Initial_package_classifier.Matcher getInitial_package_classifier(final ViatraQueryEngine engine) {
    return Initial_package_classifier.Matcher.on(engine);
  }
  
  public Current_package_classifier getCurrent_package_classifier() {
    return Current_package_classifier.instance();
  }
  
  public Current_package_classifier.Matcher getCurrent_package_classifier(final ViatraQueryEngine engine) {
    return Current_package_classifier.Matcher.on(engine);
  }
  
  public Get_package_subPackage getGet_package_subPackage() {
    return Get_package_subPackage.instance();
  }
  
  public Get_package_subPackage.Matcher getGet_package_subPackage(final ViatraQueryEngine engine) {
    return Get_package_subPackage.Matcher.on(engine);
  }
  
  public Insert_package_subPackage getInsert_package_subPackage() {
    return Insert_package_subPackage.instance();
  }
  
  public Insert_package_subPackage.Matcher getInsert_package_subPackage(final ViatraQueryEngine engine) {
    return Insert_package_subPackage.Matcher.on(engine);
  }
  
  public Remove_package_subPackage getRemove_package_subPackage() {
    return Remove_package_subPackage.instance();
  }
  
  public Remove_package_subPackage.Matcher getRemove_package_subPackage(final ViatraQueryEngine engine) {
    return Remove_package_subPackage.Matcher.on(engine);
  }
  
  public Initial_package_subPackage getInitial_package_subPackage() {
    return Initial_package_subPackage.instance();
  }
  
  public Initial_package_subPackage.Matcher getInitial_package_subPackage(final ViatraQueryEngine engine) {
    return Initial_package_subPackage.Matcher.on(engine);
  }
  
  public Current_package_subPackage getCurrent_package_subPackage() {
    return Current_package_subPackage.instance();
  }
  
  public Current_package_subPackage.Matcher getCurrent_package_subPackage(final ViatraQueryEngine engine) {
    return Current_package_subPackage.Matcher.on(engine);
  }
  
  public Get_package_class getGet_package_class() {
    return Get_package_class.instance();
  }
  
  public Get_package_class.Matcher getGet_package_class(final ViatraQueryEngine engine) {
    return Get_package_class.Matcher.on(engine);
  }
  
  public Insert_package_class getInsert_package_class() {
    return Insert_package_class.instance();
  }
  
  public Insert_package_class.Matcher getInsert_package_class(final ViatraQueryEngine engine) {
    return Insert_package_class.Matcher.on(engine);
  }
  
  public Remove_package_class getRemove_package_class() {
    return Remove_package_class.instance();
  }
  
  public Remove_package_class.Matcher getRemove_package_class(final ViatraQueryEngine engine) {
    return Remove_package_class.Matcher.on(engine);
  }
  
  public Initial_package_class getInitial_package_class() {
    return Initial_package_class.instance();
  }
  
  public Initial_package_class.Matcher getInitial_package_class(final ViatraQueryEngine engine) {
    return Initial_package_class.Matcher.on(engine);
  }
  
  public Current_package_class getCurrent_package_class() {
    return Current_package_class.instance();
  }
  
  public Current_package_class.Matcher getCurrent_package_class(final ViatraQueryEngine engine) {
    return Current_package_class.Matcher.on(engine);
  }
  
  public Get_package_datatype getGet_package_datatype() {
    return Get_package_datatype.instance();
  }
  
  public Get_package_datatype.Matcher getGet_package_datatype(final ViatraQueryEngine engine) {
    return Get_package_datatype.Matcher.on(engine);
  }
  
  public Insert_package_datatype getInsert_package_datatype() {
    return Insert_package_datatype.instance();
  }
  
  public Insert_package_datatype.Matcher getInsert_package_datatype(final ViatraQueryEngine engine) {
    return Insert_package_datatype.Matcher.on(engine);
  }
  
  public Remove_package_datatype getRemove_package_datatype() {
    return Remove_package_datatype.instance();
  }
  
  public Remove_package_datatype.Matcher getRemove_package_datatype(final ViatraQueryEngine engine) {
    return Remove_package_datatype.Matcher.on(engine);
  }
  
  public Initial_package_datatype getInitial_package_datatype() {
    return Initial_package_datatype.instance();
  }
  
  public Initial_package_datatype.Matcher getInitial_package_datatype(final ViatraQueryEngine engine) {
    return Initial_package_datatype.Matcher.on(engine);
  }
  
  public Current_package_datatype getCurrent_package_datatype() {
    return Current_package_datatype.instance();
  }
  
  public Current_package_datatype.Matcher getCurrent_package_datatype(final ViatraQueryEngine engine) {
    return Current_package_datatype.Matcher.on(engine);
  }
  
  public Get_package_enumeration getGet_package_enumeration() {
    return Get_package_enumeration.instance();
  }
  
  public Get_package_enumeration.Matcher getGet_package_enumeration(final ViatraQueryEngine engine) {
    return Get_package_enumeration.Matcher.on(engine);
  }
  
  public Insert_package_enumeration getInsert_package_enumeration() {
    return Insert_package_enumeration.instance();
  }
  
  public Insert_package_enumeration.Matcher getInsert_package_enumeration(final ViatraQueryEngine engine) {
    return Insert_package_enumeration.Matcher.on(engine);
  }
  
  public Remove_package_enumeration getRemove_package_enumeration() {
    return Remove_package_enumeration.instance();
  }
  
  public Remove_package_enumeration.Matcher getRemove_package_enumeration(final ViatraQueryEngine engine) {
    return Remove_package_enumeration.Matcher.on(engine);
  }
  
  public Initial_package_enumeration getInitial_package_enumeration() {
    return Initial_package_enumeration.instance();
  }
  
  public Initial_package_enumeration.Matcher getInitial_package_enumeration(final ViatraQueryEngine engine) {
    return Initial_package_enumeration.Matcher.on(engine);
  }
  
  public Current_package_enumeration getCurrent_package_enumeration() {
    return Current_package_enumeration.instance();
  }
  
  public Current_package_enumeration.Matcher getCurrent_package_enumeration(final ViatraQueryEngine engine) {
    return Current_package_enumeration.Matcher.on(engine);
  }
}
