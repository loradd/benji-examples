/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/DataType.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

import javax.annotation.Generated;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_dataType_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_dataType_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_dataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.DataType_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.DataType_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_dataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_dataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_dataType_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_dataType_package;

/**
 * A pattern group formed of all public patterns defined in DataType.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file DataType.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package se.mdh.idt.benji.examples.refactorings.metamodel.queries, the group contains the definition of the following patterns: <ul>
 * <li>preserved_dataType</li>
 * <li>created_dataType</li>
 * <li>deleted_dataType</li>
 * <li>dataType_name</li>
 * <li>preserved_dataType_name</li>
 * <li>changed_dataType_name</li>
 * <li>dataType_package</li>
 * <li>preserved_dataType_package</li>
 * <li>changed_dataType_package</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class DataType extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DataType instance() {
    if (INSTANCE == null) {
        INSTANCE = new DataType();
    }
    return INSTANCE;
  }
  
  private static DataType INSTANCE;
  
  private DataType() {
    querySpecifications.add(Preserved_dataType.instance());
    querySpecifications.add(Created_dataType.instance());
    querySpecifications.add(Deleted_dataType.instance());
    querySpecifications.add(DataType_name.instance());
    querySpecifications.add(Preserved_dataType_name.instance());
    querySpecifications.add(Changed_dataType_name.instance());
    querySpecifications.add(DataType_package.instance());
    querySpecifications.add(Preserved_dataType_package.instance());
    querySpecifications.add(Changed_dataType_package.instance());
  }
  
  public Preserved_dataType getPreserved_dataType() {
    return Preserved_dataType.instance();
  }
  
  public Preserved_dataType.Matcher getPreserved_dataType(final ViatraQueryEngine engine) {
    return Preserved_dataType.Matcher.on(engine);
  }
  
  public Created_dataType getCreated_dataType() {
    return Created_dataType.instance();
  }
  
  public Created_dataType.Matcher getCreated_dataType(final ViatraQueryEngine engine) {
    return Created_dataType.Matcher.on(engine);
  }
  
  public Deleted_dataType getDeleted_dataType() {
    return Deleted_dataType.instance();
  }
  
  public Deleted_dataType.Matcher getDeleted_dataType(final ViatraQueryEngine engine) {
    return Deleted_dataType.Matcher.on(engine);
  }
  
  public DataType_name getDataType_name() {
    return DataType_name.instance();
  }
  
  public DataType_name.Matcher getDataType_name(final ViatraQueryEngine engine) {
    return DataType_name.Matcher.on(engine);
  }
  
  public Preserved_dataType_name getPreserved_dataType_name() {
    return Preserved_dataType_name.instance();
  }
  
  public Preserved_dataType_name.Matcher getPreserved_dataType_name(final ViatraQueryEngine engine) {
    return Preserved_dataType_name.Matcher.on(engine);
  }
  
  public Changed_dataType_name getChanged_dataType_name() {
    return Changed_dataType_name.instance();
  }
  
  public Changed_dataType_name.Matcher getChanged_dataType_name(final ViatraQueryEngine engine) {
    return Changed_dataType_name.Matcher.on(engine);
  }
  
  public DataType_package getDataType_package() {
    return DataType_package.instance();
  }
  
  public DataType_package.Matcher getDataType_package(final ViatraQueryEngine engine) {
    return DataType_package.Matcher.on(engine);
  }
  
  public Preserved_dataType_package getPreserved_dataType_package() {
    return Preserved_dataType_package.instance();
  }
  
  public Preserved_dataType_package.Matcher getPreserved_dataType_package(final ViatraQueryEngine engine) {
    return Preserved_dataType_package.Matcher.on(engine);
  }
  
  public Changed_dataType_package getChanged_dataType_package() {
    return Changed_dataType_package.instance();
  }
  
  public Changed_dataType_package.Matcher getChanged_dataType_package(final ViatraQueryEngine engine) {
    return Changed_dataType_package.Matcher.on(engine);
  }
}
