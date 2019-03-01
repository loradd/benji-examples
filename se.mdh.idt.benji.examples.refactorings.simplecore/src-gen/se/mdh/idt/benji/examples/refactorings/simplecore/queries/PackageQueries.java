/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/PackageQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Added_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Added_package_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Added_package_subpackage;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Created_package;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_package;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_package_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_package_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_package_subpackage;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_package_uri;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_package;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_package;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_package_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_package_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_package_subpackage;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_package_uri;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package_subpackage;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package_uri;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Removed_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Removed_package_datatype;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Removed_package_subpackage;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_package_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_package_uri;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_package_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Unset_package_uri;

/**
 * A pattern group formed of all public patterns defined in PackageQueries.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file PackageQueries.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.simplecore.queries, the group contains the definition of the following patterns: <ul>
 * <li>initial_package</li>
 * <li>current_package</li>
 * <li>preserved_package</li>
 * <li>created_package</li>
 * <li>deleted_package</li>
 * <li>initial_package_name</li>
 * <li>current_package_name</li>
 * <li>preserved_package_name</li>
 * <li>set_package_name</li>
 * <li>unset_package_name</li>
 * <li>initial_package_uri</li>
 * <li>current_package_uri</li>
 * <li>preserved_package_uri</li>
 * <li>set_package_uri</li>
 * <li>unset_package_uri</li>
 * <li>initial_package_subpackage</li>
 * <li>current_package_subpackage</li>
 * <li>preserved_package_subpackage</li>
 * <li>added_package_subpackage</li>
 * <li>removed_package_subpackage</li>
 * <li>initial_package_class</li>
 * <li>current_package_class</li>
 * <li>preserved_package_class</li>
 * <li>added_package_class</li>
 * <li>removed_package_class</li>
 * <li>initial_package_datatype</li>
 * <li>current_package_datatype</li>
 * <li>preserved_package_datatype</li>
 * <li>added_package_datatype</li>
 * <li>removed_package_datatype</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
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
    querySpecifications.add(Initial_package.instance());
    querySpecifications.add(Current_package.instance());
    querySpecifications.add(Preserved_package.instance());
    querySpecifications.add(Created_package.instance());
    querySpecifications.add(Deleted_package.instance());
    querySpecifications.add(Initial_package_name.instance());
    querySpecifications.add(Current_package_name.instance());
    querySpecifications.add(Preserved_package_name.instance());
    querySpecifications.add(Set_package_name.instance());
    querySpecifications.add(Unset_package_name.instance());
    querySpecifications.add(Initial_package_uri.instance());
    querySpecifications.add(Current_package_uri.instance());
    querySpecifications.add(Preserved_package_uri.instance());
    querySpecifications.add(Set_package_uri.instance());
    querySpecifications.add(Unset_package_uri.instance());
    querySpecifications.add(Initial_package_subpackage.instance());
    querySpecifications.add(Current_package_subpackage.instance());
    querySpecifications.add(Preserved_package_subpackage.instance());
    querySpecifications.add(Added_package_subpackage.instance());
    querySpecifications.add(Removed_package_subpackage.instance());
    querySpecifications.add(Initial_package_class.instance());
    querySpecifications.add(Current_package_class.instance());
    querySpecifications.add(Preserved_package_class.instance());
    querySpecifications.add(Added_package_class.instance());
    querySpecifications.add(Removed_package_class.instance());
    querySpecifications.add(Initial_package_datatype.instance());
    querySpecifications.add(Current_package_datatype.instance());
    querySpecifications.add(Preserved_package_datatype.instance());
    querySpecifications.add(Added_package_datatype.instance());
    querySpecifications.add(Removed_package_datatype.instance());
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
  
  public Preserved_package getPreserved_package() {
    return Preserved_package.instance();
  }
  
  public Preserved_package.Matcher getPreserved_package(final ViatraQueryEngine engine) {
    return Preserved_package.Matcher.on(engine);
  }
  
  public Created_package getCreated_package() {
    return Created_package.instance();
  }
  
  public Created_package.Matcher getCreated_package(final ViatraQueryEngine engine) {
    return Created_package.Matcher.on(engine);
  }
  
  public Deleted_package getDeleted_package() {
    return Deleted_package.instance();
  }
  
  public Deleted_package.Matcher getDeleted_package(final ViatraQueryEngine engine) {
    return Deleted_package.Matcher.on(engine);
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
  
  public Preserved_package_name getPreserved_package_name() {
    return Preserved_package_name.instance();
  }
  
  public Preserved_package_name.Matcher getPreserved_package_name(final ViatraQueryEngine engine) {
    return Preserved_package_name.Matcher.on(engine);
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
  
  public Preserved_package_uri getPreserved_package_uri() {
    return Preserved_package_uri.instance();
  }
  
  public Preserved_package_uri.Matcher getPreserved_package_uri(final ViatraQueryEngine engine) {
    return Preserved_package_uri.Matcher.on(engine);
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
  
  public Initial_package_subpackage getInitial_package_subpackage() {
    return Initial_package_subpackage.instance();
  }
  
  public Initial_package_subpackage.Matcher getInitial_package_subpackage(final ViatraQueryEngine engine) {
    return Initial_package_subpackage.Matcher.on(engine);
  }
  
  public Current_package_subpackage getCurrent_package_subpackage() {
    return Current_package_subpackage.instance();
  }
  
  public Current_package_subpackage.Matcher getCurrent_package_subpackage(final ViatraQueryEngine engine) {
    return Current_package_subpackage.Matcher.on(engine);
  }
  
  public Preserved_package_subpackage getPreserved_package_subpackage() {
    return Preserved_package_subpackage.instance();
  }
  
  public Preserved_package_subpackage.Matcher getPreserved_package_subpackage(final ViatraQueryEngine engine) {
    return Preserved_package_subpackage.Matcher.on(engine);
  }
  
  public Added_package_subpackage getAdded_package_subpackage() {
    return Added_package_subpackage.instance();
  }
  
  public Added_package_subpackage.Matcher getAdded_package_subpackage(final ViatraQueryEngine engine) {
    return Added_package_subpackage.Matcher.on(engine);
  }
  
  public Removed_package_subpackage getRemoved_package_subpackage() {
    return Removed_package_subpackage.instance();
  }
  
  public Removed_package_subpackage.Matcher getRemoved_package_subpackage(final ViatraQueryEngine engine) {
    return Removed_package_subpackage.Matcher.on(engine);
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
  
  public Preserved_package_class getPreserved_package_class() {
    return Preserved_package_class.instance();
  }
  
  public Preserved_package_class.Matcher getPreserved_package_class(final ViatraQueryEngine engine) {
    return Preserved_package_class.Matcher.on(engine);
  }
  
  public Added_package_class getAdded_package_class() {
    return Added_package_class.instance();
  }
  
  public Added_package_class.Matcher getAdded_package_class(final ViatraQueryEngine engine) {
    return Added_package_class.Matcher.on(engine);
  }
  
  public Removed_package_class getRemoved_package_class() {
    return Removed_package_class.instance();
  }
  
  public Removed_package_class.Matcher getRemoved_package_class(final ViatraQueryEngine engine) {
    return Removed_package_class.Matcher.on(engine);
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
  
  public Preserved_package_datatype getPreserved_package_datatype() {
    return Preserved_package_datatype.instance();
  }
  
  public Preserved_package_datatype.Matcher getPreserved_package_datatype(final ViatraQueryEngine engine) {
    return Preserved_package_datatype.Matcher.on(engine);
  }
  
  public Added_package_datatype getAdded_package_datatype() {
    return Added_package_datatype.instance();
  }
  
  public Added_package_datatype.Matcher getAdded_package_datatype(final ViatraQueryEngine engine) {
    return Added_package_datatype.Matcher.on(engine);
  }
  
  public Removed_package_datatype getRemoved_package_datatype() {
    return Removed_package_datatype.instance();
  }
  
  public Removed_package_datatype.Matcher getRemoved_package_datatype(final ViatraQueryEngine engine) {
    return Removed_package_datatype.Matcher.on(engine);
  }
}
