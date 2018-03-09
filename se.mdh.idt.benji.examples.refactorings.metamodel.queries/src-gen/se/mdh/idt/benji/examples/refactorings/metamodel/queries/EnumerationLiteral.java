/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/EnumerationLiteral.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_enumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral_name;

/**
 * A pattern group formed of all public patterns defined in EnumerationLiteral.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file EnumerationLiteral.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_enumerationLiteral</li>
 * <li>created_enumerationLiteral</li>
 * <li>deleted_enumerationLiteral</li>
 * <li>enumerationLiteral_name</li>
 * <li>preserved_enumerationLiteral_name</li>
 * <li>changed_enumerationLiteral_name</li>
 * <li>enumerationLiteral_enumeration</li>
 * <li>preserved_enumerationLiteral_enumeration</li>
 * <li>changed_enumerationLiteral_enumeration</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class EnumerationLiteral extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static EnumerationLiteral instance() {
    if (INSTANCE == null) {
        INSTANCE = new EnumerationLiteral();
    }
    return INSTANCE;
  }
  
  private static EnumerationLiteral INSTANCE;
  
  private EnumerationLiteral() {
    querySpecifications.add(Preserved_enumerationLiteral.instance());
    querySpecifications.add(Created_enumerationLiteral.instance());
    querySpecifications.add(Deleted_enumerationLiteral.instance());
    querySpecifications.add(EnumerationLiteral_name.instance());
    querySpecifications.add(Preserved_enumerationLiteral_name.instance());
    querySpecifications.add(Changed_enumerationLiteral_name.instance());
    querySpecifications.add(EnumerationLiteral_enumeration.instance());
    querySpecifications.add(Preserved_enumerationLiteral_enumeration.instance());
    querySpecifications.add(Changed_enumerationLiteral_enumeration.instance());
  }
  
  public Preserved_enumerationLiteral getPreserved_enumerationLiteral() {
    return Preserved_enumerationLiteral.instance();
  }
  
  public Preserved_enumerationLiteral.Matcher getPreserved_enumerationLiteral(final ViatraQueryEngine engine) {
    return Preserved_enumerationLiteral.Matcher.on(engine);
  }
  
  public Created_enumerationLiteral getCreated_enumerationLiteral() {
    return Created_enumerationLiteral.instance();
  }
  
  public Created_enumerationLiteral.Matcher getCreated_enumerationLiteral(final ViatraQueryEngine engine) {
    return Created_enumerationLiteral.Matcher.on(engine);
  }
  
  public Deleted_enumerationLiteral getDeleted_enumerationLiteral() {
    return Deleted_enumerationLiteral.instance();
  }
  
  public Deleted_enumerationLiteral.Matcher getDeleted_enumerationLiteral(final ViatraQueryEngine engine) {
    return Deleted_enumerationLiteral.Matcher.on(engine);
  }
  
  public EnumerationLiteral_name getEnumerationLiteral_name() {
    return EnumerationLiteral_name.instance();
  }
  
  public EnumerationLiteral_name.Matcher getEnumerationLiteral_name(final ViatraQueryEngine engine) {
    return EnumerationLiteral_name.Matcher.on(engine);
  }
  
  public Preserved_enumerationLiteral_name getPreserved_enumerationLiteral_name() {
    return Preserved_enumerationLiteral_name.instance();
  }
  
  public Preserved_enumerationLiteral_name.Matcher getPreserved_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return Preserved_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public Changed_enumerationLiteral_name getChanged_enumerationLiteral_name() {
    return Changed_enumerationLiteral_name.instance();
  }
  
  public Changed_enumerationLiteral_name.Matcher getChanged_enumerationLiteral_name(final ViatraQueryEngine engine) {
    return Changed_enumerationLiteral_name.Matcher.on(engine);
  }
  
  public EnumerationLiteral_enumeration getEnumerationLiteral_enumeration() {
    return EnumerationLiteral_enumeration.instance();
  }
  
  public EnumerationLiteral_enumeration.Matcher getEnumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return EnumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public Preserved_enumerationLiteral_enumeration getPreserved_enumerationLiteral_enumeration() {
    return Preserved_enumerationLiteral_enumeration.instance();
  }
  
  public Preserved_enumerationLiteral_enumeration.Matcher getPreserved_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return Preserved_enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  public Changed_enumerationLiteral_enumeration getChanged_enumerationLiteral_enumeration() {
    return Changed_enumerationLiteral_enumeration.instance();
  }
  
  public Changed_enumerationLiteral_enumeration.Matcher getChanged_enumerationLiteral_enumeration(final ViatraQueryEngine engine) {
    return Changed_enumerationLiteral_enumeration.Matcher.on(engine);
  }
}
