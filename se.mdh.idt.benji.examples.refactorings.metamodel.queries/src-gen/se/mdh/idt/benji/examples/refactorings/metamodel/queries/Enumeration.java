/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Enumeration.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_enumeration_literal;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_literal;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration_literal;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_enumeration_literal;

/**
 * A pattern group formed of all public patterns defined in Enumeration.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file Enumeration.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_enumeration</li>
 * <li>created_enumeration</li>
 * <li>deleted_enumeration</li>
 * <li>enumeration_name</li>
 * <li>preserved_enumeration_name</li>
 * <li>changed_enumeration_name</li>
 * <li>enumeration_package</li>
 * <li>preserved_enumeration_package</li>
 * <li>changed_enumeration_package</li>
 * <li>enumeration_literal</li>
 * <li>preserved_enumeration_literal</li>
 * <li>added_enumeration_literal</li>
 * <li>removed_enumeration_literal</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Enumeration extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static Enumeration instance() {
    if (INSTANCE == null) {
        INSTANCE = new Enumeration();
    }
    return INSTANCE;
  }
  
  private static Enumeration INSTANCE;
  
  private Enumeration() {
    querySpecifications.add(Preserved_enumeration.instance());
    querySpecifications.add(Created_enumeration.instance());
    querySpecifications.add(Deleted_enumeration.instance());
    querySpecifications.add(Enumeration_name.instance());
    querySpecifications.add(Preserved_enumeration_name.instance());
    querySpecifications.add(Changed_enumeration_name.instance());
    querySpecifications.add(Enumeration_package.instance());
    querySpecifications.add(Preserved_enumeration_package.instance());
    querySpecifications.add(Changed_enumeration_package.instance());
    querySpecifications.add(Enumeration_literal.instance());
    querySpecifications.add(Preserved_enumeration_literal.instance());
    querySpecifications.add(Added_enumeration_literal.instance());
    querySpecifications.add(Removed_enumeration_literal.instance());
  }
  
  public Preserved_enumeration getPreserved_enumeration() {
    return Preserved_enumeration.instance();
  }
  
  public Preserved_enumeration.Matcher getPreserved_enumeration(final ViatraQueryEngine engine) {
    return Preserved_enumeration.Matcher.on(engine);
  }
  
  public Created_enumeration getCreated_enumeration() {
    return Created_enumeration.instance();
  }
  
  public Created_enumeration.Matcher getCreated_enumeration(final ViatraQueryEngine engine) {
    return Created_enumeration.Matcher.on(engine);
  }
  
  public Deleted_enumeration getDeleted_enumeration() {
    return Deleted_enumeration.instance();
  }
  
  public Deleted_enumeration.Matcher getDeleted_enumeration(final ViatraQueryEngine engine) {
    return Deleted_enumeration.Matcher.on(engine);
  }
  
  public Enumeration_name getEnumeration_name() {
    return Enumeration_name.instance();
  }
  
  public Enumeration_name.Matcher getEnumeration_name(final ViatraQueryEngine engine) {
    return Enumeration_name.Matcher.on(engine);
  }
  
  public Preserved_enumeration_name getPreserved_enumeration_name() {
    return Preserved_enumeration_name.instance();
  }
  
  public Preserved_enumeration_name.Matcher getPreserved_enumeration_name(final ViatraQueryEngine engine) {
    return Preserved_enumeration_name.Matcher.on(engine);
  }
  
  public Changed_enumeration_name getChanged_enumeration_name() {
    return Changed_enumeration_name.instance();
  }
  
  public Changed_enumeration_name.Matcher getChanged_enumeration_name(final ViatraQueryEngine engine) {
    return Changed_enumeration_name.Matcher.on(engine);
  }
  
  public Enumeration_package getEnumeration_package() {
    return Enumeration_package.instance();
  }
  
  public Enumeration_package.Matcher getEnumeration_package(final ViatraQueryEngine engine) {
    return Enumeration_package.Matcher.on(engine);
  }
  
  public Preserved_enumeration_package getPreserved_enumeration_package() {
    return Preserved_enumeration_package.instance();
  }
  
  public Preserved_enumeration_package.Matcher getPreserved_enumeration_package(final ViatraQueryEngine engine) {
    return Preserved_enumeration_package.Matcher.on(engine);
  }
  
  public Changed_enumeration_package getChanged_enumeration_package() {
    return Changed_enumeration_package.instance();
  }
  
  public Changed_enumeration_package.Matcher getChanged_enumeration_package(final ViatraQueryEngine engine) {
    return Changed_enumeration_package.Matcher.on(engine);
  }
  
  public Enumeration_literal getEnumeration_literal() {
    return Enumeration_literal.instance();
  }
  
  public Enumeration_literal.Matcher getEnumeration_literal(final ViatraQueryEngine engine) {
    return Enumeration_literal.Matcher.on(engine);
  }
  
  public Preserved_enumeration_literal getPreserved_enumeration_literal() {
    return Preserved_enumeration_literal.instance();
  }
  
  public Preserved_enumeration_literal.Matcher getPreserved_enumeration_literal(final ViatraQueryEngine engine) {
    return Preserved_enumeration_literal.Matcher.on(engine);
  }
  
  public Added_enumeration_literal getAdded_enumeration_literal() {
    return Added_enumeration_literal.instance();
  }
  
  public Added_enumeration_literal.Matcher getAdded_enumeration_literal(final ViatraQueryEngine engine) {
    return Added_enumeration_literal.Matcher.on(engine);
  }
  
  public Removed_enumeration_literal getRemoved_enumeration_literal() {
    return Removed_enumeration_literal.instance();
  }
  
  public Removed_enumeration_literal.Matcher getRemoved_enumeration_literal(final ViatraQueryEngine engine) {
    return Removed_enumeration_literal.Matcher.on(engine);
  }
}
