/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Class.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Delete_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_class_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Remove_class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_superClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_class_abstract;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_class_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_class_superClass;

/**
 * A pattern group formed of all public patterns defined in Class.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Class.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>get_class</li>
 * <li>create_class</li>
 * <li>delete_class</li>
 * <li>initial_class</li>
 * <li>current_class</li>
 * <li>get_class_name</li>
 * <li>set_class_name</li>
 * <li>unset_class_name</li>
 * <li>initial_class_name</li>
 * <li>current_class_name</li>
 * <li>get_class_package</li>
 * <li>set_class_package</li>
 * <li>unset_class_package</li>
 * <li>initial_class_package</li>
 * <li>current_class_package</li>
 * <li>get_class_abstract</li>
 * <li>set_class_abstract</li>
 * <li>unset_class_abstract</li>
 * <li>initial_class_abstract</li>
 * <li>current_class_abstract</li>
 * <li>get_class_superClass</li>
 * <li>set_class_superClass</li>
 * <li>unset_class_superClass</li>
 * <li>initial_class_superClass</li>
 * <li>current_class_superClass</li>
 * <li>get_class_subClass</li>
 * <li>insert_class_subClass</li>
 * <li>remove_class_subClass</li>
 * <li>initial_class_subClass</li>
 * <li>current_class_subClass</li>
 * <li>get_class_structuralFeature</li>
 * <li>insert_class_structuralFeature</li>
 * <li>remove_class_structuralFeature</li>
 * <li>initial_class_structuralFeature</li>
 * <li>current_class_structuralFeature</li>
 * <li>get_class_attribute</li>
 * <li>insert_class_attribute</li>
 * <li>remove_class_attribute</li>
 * <li>initial_class_attribute</li>
 * <li>current_class_attribute</li>
 * <li>get_class_reference</li>
 * <li>insert_class_reference</li>
 * <li>remove_class_reference</li>
 * <li>initial_class_reference</li>
 * <li>current_class_reference</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class Class extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Class instance() {
    if (INSTANCE == null) {
        INSTANCE = new Class();
    }
    return INSTANCE;
  }
  
  private static Class INSTANCE;
  
  private Class() {
    querySpecifications.add(Get_class.instance());
    querySpecifications.add(Create_class.instance());
    querySpecifications.add(Delete_class.instance());
    querySpecifications.add(Initial_class.instance());
    querySpecifications.add(Current_class.instance());
    querySpecifications.add(Get_class_name.instance());
    querySpecifications.add(Set_class_name.instance());
    querySpecifications.add(Unset_class_name.instance());
    querySpecifications.add(Initial_class_name.instance());
    querySpecifications.add(Current_class_name.instance());
    querySpecifications.add(Get_class_package.instance());
    querySpecifications.add(Set_class_package.instance());
    querySpecifications.add(Unset_class_package.instance());
    querySpecifications.add(Initial_class_package.instance());
    querySpecifications.add(Current_class_package.instance());
    querySpecifications.add(Get_class_abstract.instance());
    querySpecifications.add(Set_class_abstract.instance());
    querySpecifications.add(Unset_class_abstract.instance());
    querySpecifications.add(Initial_class_abstract.instance());
    querySpecifications.add(Current_class_abstract.instance());
    querySpecifications.add(Get_class_superClass.instance());
    querySpecifications.add(Set_class_superClass.instance());
    querySpecifications.add(Unset_class_superClass.instance());
    querySpecifications.add(Initial_class_superClass.instance());
    querySpecifications.add(Current_class_superClass.instance());
    querySpecifications.add(Get_class_subClass.instance());
    querySpecifications.add(Insert_class_subClass.instance());
    querySpecifications.add(Remove_class_subClass.instance());
    querySpecifications.add(Initial_class_subClass.instance());
    querySpecifications.add(Current_class_subClass.instance());
    querySpecifications.add(Get_class_structuralFeature.instance());
    querySpecifications.add(Insert_class_structuralFeature.instance());
    querySpecifications.add(Remove_class_structuralFeature.instance());
    querySpecifications.add(Initial_class_structuralFeature.instance());
    querySpecifications.add(Current_class_structuralFeature.instance());
    querySpecifications.add(Get_class_attribute.instance());
    querySpecifications.add(Insert_class_attribute.instance());
    querySpecifications.add(Remove_class_attribute.instance());
    querySpecifications.add(Initial_class_attribute.instance());
    querySpecifications.add(Current_class_attribute.instance());
    querySpecifications.add(Get_class_reference.instance());
    querySpecifications.add(Insert_class_reference.instance());
    querySpecifications.add(Remove_class_reference.instance());
    querySpecifications.add(Initial_class_reference.instance());
    querySpecifications.add(Current_class_reference.instance());
  }
  
  public Get_class getGet_class() {
    return Get_class.instance();
  }
  
  public Get_class.Matcher getGet_class(final ViatraQueryEngine engine) {
    return Get_class.Matcher.on(engine);
  }
  
  public Create_class getCreate_class() {
    return Create_class.instance();
  }
  
  public Create_class.Matcher getCreate_class(final ViatraQueryEngine engine) {
    return Create_class.Matcher.on(engine);
  }
  
  public Delete_class getDelete_class() {
    return Delete_class.instance();
  }
  
  public Delete_class.Matcher getDelete_class(final ViatraQueryEngine engine) {
    return Delete_class.Matcher.on(engine);
  }
  
  public Initial_class getInitial_class() {
    return Initial_class.instance();
  }
  
  public Initial_class.Matcher getInitial_class(final ViatraQueryEngine engine) {
    return Initial_class.Matcher.on(engine);
  }
  
  public Current_class getCurrent_class() {
    return Current_class.instance();
  }
  
  public Current_class.Matcher getCurrent_class(final ViatraQueryEngine engine) {
    return Current_class.Matcher.on(engine);
  }
  
  public Get_class_name getGet_class_name() {
    return Get_class_name.instance();
  }
  
  public Get_class_name.Matcher getGet_class_name(final ViatraQueryEngine engine) {
    return Get_class_name.Matcher.on(engine);
  }
  
  public Set_class_name getSet_class_name() {
    return Set_class_name.instance();
  }
  
  public Set_class_name.Matcher getSet_class_name(final ViatraQueryEngine engine) {
    return Set_class_name.Matcher.on(engine);
  }
  
  public Unset_class_name getUnset_class_name() {
    return Unset_class_name.instance();
  }
  
  public Unset_class_name.Matcher getUnset_class_name(final ViatraQueryEngine engine) {
    return Unset_class_name.Matcher.on(engine);
  }
  
  public Initial_class_name getInitial_class_name() {
    return Initial_class_name.instance();
  }
  
  public Initial_class_name.Matcher getInitial_class_name(final ViatraQueryEngine engine) {
    return Initial_class_name.Matcher.on(engine);
  }
  
  public Current_class_name getCurrent_class_name() {
    return Current_class_name.instance();
  }
  
  public Current_class_name.Matcher getCurrent_class_name(final ViatraQueryEngine engine) {
    return Current_class_name.Matcher.on(engine);
  }
  
  public Get_class_package getGet_class_package() {
    return Get_class_package.instance();
  }
  
  public Get_class_package.Matcher getGet_class_package(final ViatraQueryEngine engine) {
    return Get_class_package.Matcher.on(engine);
  }
  
  public Set_class_package getSet_class_package() {
    return Set_class_package.instance();
  }
  
  public Set_class_package.Matcher getSet_class_package(final ViatraQueryEngine engine) {
    return Set_class_package.Matcher.on(engine);
  }
  
  public Unset_class_package getUnset_class_package() {
    return Unset_class_package.instance();
  }
  
  public Unset_class_package.Matcher getUnset_class_package(final ViatraQueryEngine engine) {
    return Unset_class_package.Matcher.on(engine);
  }
  
  public Initial_class_package getInitial_class_package() {
    return Initial_class_package.instance();
  }
  
  public Initial_class_package.Matcher getInitial_class_package(final ViatraQueryEngine engine) {
    return Initial_class_package.Matcher.on(engine);
  }
  
  public Current_class_package getCurrent_class_package() {
    return Current_class_package.instance();
  }
  
  public Current_class_package.Matcher getCurrent_class_package(final ViatraQueryEngine engine) {
    return Current_class_package.Matcher.on(engine);
  }
  
  public Get_class_abstract getGet_class_abstract() {
    return Get_class_abstract.instance();
  }
  
  public Get_class_abstract.Matcher getGet_class_abstract(final ViatraQueryEngine engine) {
    return Get_class_abstract.Matcher.on(engine);
  }
  
  public Set_class_abstract getSet_class_abstract() {
    return Set_class_abstract.instance();
  }
  
  public Set_class_abstract.Matcher getSet_class_abstract(final ViatraQueryEngine engine) {
    return Set_class_abstract.Matcher.on(engine);
  }
  
  public Unset_class_abstract getUnset_class_abstract() {
    return Unset_class_abstract.instance();
  }
  
  public Unset_class_abstract.Matcher getUnset_class_abstract(final ViatraQueryEngine engine) {
    return Unset_class_abstract.Matcher.on(engine);
  }
  
  public Initial_class_abstract getInitial_class_abstract() {
    return Initial_class_abstract.instance();
  }
  
  public Initial_class_abstract.Matcher getInitial_class_abstract(final ViatraQueryEngine engine) {
    return Initial_class_abstract.Matcher.on(engine);
  }
  
  public Current_class_abstract getCurrent_class_abstract() {
    return Current_class_abstract.instance();
  }
  
  public Current_class_abstract.Matcher getCurrent_class_abstract(final ViatraQueryEngine engine) {
    return Current_class_abstract.Matcher.on(engine);
  }
  
  public Get_class_superClass getGet_class_superClass() {
    return Get_class_superClass.instance();
  }
  
  public Get_class_superClass.Matcher getGet_class_superClass(final ViatraQueryEngine engine) {
    return Get_class_superClass.Matcher.on(engine);
  }
  
  public Set_class_superClass getSet_class_superClass() {
    return Set_class_superClass.instance();
  }
  
  public Set_class_superClass.Matcher getSet_class_superClass(final ViatraQueryEngine engine) {
    return Set_class_superClass.Matcher.on(engine);
  }
  
  public Unset_class_superClass getUnset_class_superClass() {
    return Unset_class_superClass.instance();
  }
  
  public Unset_class_superClass.Matcher getUnset_class_superClass(final ViatraQueryEngine engine) {
    return Unset_class_superClass.Matcher.on(engine);
  }
  
  public Initial_class_superClass getInitial_class_superClass() {
    return Initial_class_superClass.instance();
  }
  
  public Initial_class_superClass.Matcher getInitial_class_superClass(final ViatraQueryEngine engine) {
    return Initial_class_superClass.Matcher.on(engine);
  }
  
  public Current_class_superClass getCurrent_class_superClass() {
    return Current_class_superClass.instance();
  }
  
  public Current_class_superClass.Matcher getCurrent_class_superClass(final ViatraQueryEngine engine) {
    return Current_class_superClass.Matcher.on(engine);
  }
  
  public Get_class_subClass getGet_class_subClass() {
    return Get_class_subClass.instance();
  }
  
  public Get_class_subClass.Matcher getGet_class_subClass(final ViatraQueryEngine engine) {
    return Get_class_subClass.Matcher.on(engine);
  }
  
  public Insert_class_subClass getInsert_class_subClass() {
    return Insert_class_subClass.instance();
  }
  
  public Insert_class_subClass.Matcher getInsert_class_subClass(final ViatraQueryEngine engine) {
    return Insert_class_subClass.Matcher.on(engine);
  }
  
  public Remove_class_subClass getRemove_class_subClass() {
    return Remove_class_subClass.instance();
  }
  
  public Remove_class_subClass.Matcher getRemove_class_subClass(final ViatraQueryEngine engine) {
    return Remove_class_subClass.Matcher.on(engine);
  }
  
  public Initial_class_subClass getInitial_class_subClass() {
    return Initial_class_subClass.instance();
  }
  
  public Initial_class_subClass.Matcher getInitial_class_subClass(final ViatraQueryEngine engine) {
    return Initial_class_subClass.Matcher.on(engine);
  }
  
  public Current_class_subClass getCurrent_class_subClass() {
    return Current_class_subClass.instance();
  }
  
  public Current_class_subClass.Matcher getCurrent_class_subClass(final ViatraQueryEngine engine) {
    return Current_class_subClass.Matcher.on(engine);
  }
  
  public Get_class_structuralFeature getGet_class_structuralFeature() {
    return Get_class_structuralFeature.instance();
  }
  
  public Get_class_structuralFeature.Matcher getGet_class_structuralFeature(final ViatraQueryEngine engine) {
    return Get_class_structuralFeature.Matcher.on(engine);
  }
  
  public Insert_class_structuralFeature getInsert_class_structuralFeature() {
    return Insert_class_structuralFeature.instance();
  }
  
  public Insert_class_structuralFeature.Matcher getInsert_class_structuralFeature(final ViatraQueryEngine engine) {
    return Insert_class_structuralFeature.Matcher.on(engine);
  }
  
  public Remove_class_structuralFeature getRemove_class_structuralFeature() {
    return Remove_class_structuralFeature.instance();
  }
  
  public Remove_class_structuralFeature.Matcher getRemove_class_structuralFeature(final ViatraQueryEngine engine) {
    return Remove_class_structuralFeature.Matcher.on(engine);
  }
  
  public Initial_class_structuralFeature getInitial_class_structuralFeature() {
    return Initial_class_structuralFeature.instance();
  }
  
  public Initial_class_structuralFeature.Matcher getInitial_class_structuralFeature(final ViatraQueryEngine engine) {
    return Initial_class_structuralFeature.Matcher.on(engine);
  }
  
  public Current_class_structuralFeature getCurrent_class_structuralFeature() {
    return Current_class_structuralFeature.instance();
  }
  
  public Current_class_structuralFeature.Matcher getCurrent_class_structuralFeature(final ViatraQueryEngine engine) {
    return Current_class_structuralFeature.Matcher.on(engine);
  }
  
  public Get_class_attribute getGet_class_attribute() {
    return Get_class_attribute.instance();
  }
  
  public Get_class_attribute.Matcher getGet_class_attribute(final ViatraQueryEngine engine) {
    return Get_class_attribute.Matcher.on(engine);
  }
  
  public Insert_class_attribute getInsert_class_attribute() {
    return Insert_class_attribute.instance();
  }
  
  public Insert_class_attribute.Matcher getInsert_class_attribute(final ViatraQueryEngine engine) {
    return Insert_class_attribute.Matcher.on(engine);
  }
  
  public Remove_class_attribute getRemove_class_attribute() {
    return Remove_class_attribute.instance();
  }
  
  public Remove_class_attribute.Matcher getRemove_class_attribute(final ViatraQueryEngine engine) {
    return Remove_class_attribute.Matcher.on(engine);
  }
  
  public Initial_class_attribute getInitial_class_attribute() {
    return Initial_class_attribute.instance();
  }
  
  public Initial_class_attribute.Matcher getInitial_class_attribute(final ViatraQueryEngine engine) {
    return Initial_class_attribute.Matcher.on(engine);
  }
  
  public Current_class_attribute getCurrent_class_attribute() {
    return Current_class_attribute.instance();
  }
  
  public Current_class_attribute.Matcher getCurrent_class_attribute(final ViatraQueryEngine engine) {
    return Current_class_attribute.Matcher.on(engine);
  }
  
  public Get_class_reference getGet_class_reference() {
    return Get_class_reference.instance();
  }
  
  public Get_class_reference.Matcher getGet_class_reference(final ViatraQueryEngine engine) {
    return Get_class_reference.Matcher.on(engine);
  }
  
  public Insert_class_reference getInsert_class_reference() {
    return Insert_class_reference.instance();
  }
  
  public Insert_class_reference.Matcher getInsert_class_reference(final ViatraQueryEngine engine) {
    return Insert_class_reference.Matcher.on(engine);
  }
  
  public Remove_class_reference getRemove_class_reference() {
    return Remove_class_reference.instance();
  }
  
  public Remove_class_reference.Matcher getRemove_class_reference(final ViatraQueryEngine engine) {
    return Remove_class_reference.Matcher.on(engine);
  }
  
  public Initial_class_reference getInitial_class_reference() {
    return Initial_class_reference.instance();
  }
  
  public Initial_class_reference.Matcher getInitial_class_reference(final ViatraQueryEngine engine) {
    return Initial_class_reference.Matcher.on(engine);
  }
  
  public Current_class_reference getCurrent_class_reference() {
    return Current_class_reference.instance();
  }
  
  public Current_class_reference.Matcher getCurrent_class_reference(final ViatraQueryEngine engine) {
    return Current_class_reference.Matcher.on(engine);
  }
}
