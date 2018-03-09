/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ChangeAttributeType.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Generated;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_dataType;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class ChangeAttributeTypePostcondition extends BaseGeneratedEMFQuerySpecification<ChangeAttributeTypePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   *  @see Processor
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_class;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_class;
    
    private Attribute fInitial_attribute;
    
    private Attribute fCurrent_attribute;
    
    private DataType fInitial_attribute_type;
    
    private DataType fCurrent_attribute_type;
    
    private DataType fInitial_type;
    
    private DataType fCurrent_type;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_class", "current_class", "initial_attribute", "current_attribute", "initial_attribute_type", "current_attribute_type", "initial_type", "current_type");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_class = pInitial_class;
      this.fCurrent_class = pCurrent_class;
      this.fInitial_attribute = pInitial_attribute;
      this.fCurrent_attribute = pCurrent_attribute;
      this.fInitial_attribute_type = pInitial_attribute_type;
      this.fCurrent_attribute_type = pCurrent_attribute_type;
      this.fInitial_type = pInitial_type;
      this.fCurrent_type = pCurrent_type;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("initial_attribute".equals(parameterName)) return this.fInitial_attribute;
      if ("current_attribute".equals(parameterName)) return this.fCurrent_attribute;
      if ("initial_attribute_type".equals(parameterName)) return this.fInitial_attribute_type;
      if ("current_attribute_type".equals(parameterName)) return this.fCurrent_attribute_type;
      if ("initial_type".equals(parameterName)) return this.fInitial_type;
      if ("current_type".equals(parameterName)) return this.fCurrent_type;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_class() {
      return this.fInitial_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public Attribute getInitial_attribute() {
      return this.fInitial_attribute;
    }
    
    public Attribute getCurrent_attribute() {
      return this.fCurrent_attribute;
    }
    
    public DataType getInitial_attribute_type() {
      return this.fInitial_attribute_type;
    }
    
    public DataType getCurrent_attribute_type() {
      return this.fCurrent_attribute_type;
    }
    
    public DataType getInitial_type() {
      return this.fInitial_type;
    }
    
    public DataType getCurrent_type() {
      return this.fCurrent_type;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_package".equals(parameterName) ) {
          this.fInitial_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("initial_class".equals(parameterName) ) {
          this.fInitial_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_class".equals(parameterName) ) {
          this.fCurrent_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_attribute".equals(parameterName) ) {
          this.fInitial_attribute = (Attribute) newValue;
          return true;
      }
      if ("current_attribute".equals(parameterName) ) {
          this.fCurrent_attribute = (Attribute) newValue;
          return true;
      }
      if ("initial_attribute_type".equals(parameterName) ) {
          this.fInitial_attribute_type = (DataType) newValue;
          return true;
      }
      if ("current_attribute_type".equals(parameterName) ) {
          this.fCurrent_attribute_type = (DataType) newValue;
          return true;
      }
      if ("initial_type".equals(parameterName) ) {
          this.fInitial_type = (DataType) newValue;
          return true;
      }
      if ("current_type".equals(parameterName) ) {
          this.fCurrent_type = (DataType) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_package = pInitial_package;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    public void setInitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_class = pInitial_class;
    }
    
    public void setCurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_class = pCurrent_class;
    }
    
    public void setInitial_attribute(final Attribute pInitial_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_attribute = pInitial_attribute;
    }
    
    public void setCurrent_attribute(final Attribute pCurrent_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attribute = pCurrent_attribute;
    }
    
    public void setInitial_attribute_type(final DataType pInitial_attribute_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_attribute_type = pInitial_attribute_type;
    }
    
    public void setCurrent_attribute_type(final DataType pCurrent_attribute_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attribute_type = pCurrent_attribute_type;
    }
    
    public void setInitial_type(final DataType pInitial_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_type = pInitial_type;
    }
    
    public void setCurrent_type(final DataType pCurrent_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_type = pCurrent_type;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ChangeAttributeTypePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_attribute, fCurrent_attribute, fInitial_attribute_type, fCurrent_attribute_type, fInitial_type, fCurrent_type};
    }
    
    @Override
    public ChangeAttributeTypePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_attribute, fCurrent_attribute, fInitial_attribute_type, fCurrent_attribute_type, fInitial_type, fCurrent_type) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"initial_attribute\"=" + prettyPrintValue(fInitial_attribute) + ", ");
      result.append("\"current_attribute\"=" + prettyPrintValue(fCurrent_attribute) + ", ");
      result.append("\"initial_attribute_type\"=" + prettyPrintValue(fInitial_attribute_type) + ", ");
      result.append("\"current_attribute_type\"=" + prettyPrintValue(fCurrent_attribute_type) + ", ");
      result.append("\"initial_type\"=" + prettyPrintValue(fInitial_type) + ", ");
      result.append("\"current_type\"=" + prettyPrintValue(fCurrent_type));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_attribute, fCurrent_attribute, fInitial_attribute_type, fCurrent_attribute_type, fInitial_type, fCurrent_type);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ChangeAttributeTypePostcondition.Match)) {
          ChangeAttributeTypePostcondition.Match other = (ChangeAttributeTypePostcondition.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_class, other.fInitial_class) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fInitial_attribute, other.fInitial_attribute) && Objects.equals(fCurrent_attribute, other.fCurrent_attribute) && Objects.equals(fInitial_attribute_type, other.fInitial_attribute_type) && Objects.equals(fCurrent_attribute_type, other.fCurrent_attribute_type) && Objects.equals(fInitial_type, other.fInitial_type) && Objects.equals(fCurrent_type, other.fCurrent_type);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }
    
    @Override
    public ChangeAttributeTypePostcondition specification() {
      return ChangeAttributeTypePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ChangeAttributeTypePostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ChangeAttributeTypePostcondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ChangeAttributeTypePostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type);
    }
    
    private static final class Mutable extends ChangeAttributeTypePostcondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
        super(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ChangeAttributeTypePostcondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
        super(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACA12 - Change Attribute Type - Postcondition
   * pattern ChangeAttributeTypePostcondition (
   * 	initial_package : Package, current_package : Package, 
   * 	initial_class : Class, current_class : Class, 
   * 	initial_attribute : Attribute, current_attribute : Attribute,
   * 	initial_attribute_type : DataType, current_attribute_type : DataType,  
   * 	initial_type : DataType, current_type : DataType
   * ) {
   * 	find preserved_package_class (initial_package, current_package, initial_class, current_class); 
   * 	find preserved_package_dataType (initial_package, current_package, initial_type, current_type);
   * 	find preserved_package_dataType (initial_package, current_package, initial_attribute_type, current_attribute_type);  
   * 	find preserved_class_attribute (initial_class, current_class, initial_attribute, current_attribute);
   * 	find changed_attribute_type (initial_attribute, current_attribute, initial_attribute_type, current_type);
   * 	initial_attribute_type != initial_type; 
   * 	current_attribute_type != current_type;   
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ChangeAttributeTypePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<ChangeAttributeTypePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ChangeAttributeTypePostcondition.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }
    
    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static ChangeAttributeTypePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_CLASS = 2;
    
    private final static int POSITION_CURRENT_CLASS = 3;
    
    private final static int POSITION_INITIAL_ATTRIBUTE = 4;
    
    private final static int POSITION_CURRENT_ATTRIBUTE = 5;
    
    private final static int POSITION_INITIAL_ATTRIBUTE_TYPE = 6;
    
    private final static int POSITION_CURRENT_ATTRIBUTE_TYPE = 7;
    
    private final static int POSITION_INITIAL_TYPE = 8;
    
    private final static int POSITION_CURRENT_TYPE = 9;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ChangeAttributeTypePostcondition.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ChangeAttributeTypePostcondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ChangeAttributeTypePostcondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type, final IMatchProcessor<? super ChangeAttributeTypePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type, final IMatchProcessor<? super ChangeAttributeTypePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_attribute_type the fixed value of pattern parameter initial_attribute_type, or null if not bound.
     * @param pCurrent_attribute_type the fixed value of pattern parameter current_attribute_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ChangeAttributeTypePostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return ChangeAttributeTypePostcondition.Match.newMatch(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_attribute, pCurrent_attribute, pInitial_attribute_type, pCurrent_attribute_type, pInitial_type, pCurrent_type);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfinitial_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_INITIAL_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package() {
      return rawAccumulateAllValuesOfinitial_package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfcurrent_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_CURRENT_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package() {
      return rawAccumulateAllValuesOfcurrent_package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class() {
      return rawAccumulateAllValuesOfinitial_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pCurrent_class, 
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class() {
      return rawAccumulateAllValuesOfcurrent_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      null, 
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfinitial_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_INITIAL_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute() {
      return rawAccumulateAllValuesOfinitial_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_attribute(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      null, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfcurrent_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_CURRENT_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute() {
      return rawAccumulateAllValuesOfcurrent_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_attribute(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_attribute, 
      null, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfinitial_attribute_type(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_INITIAL_ATTRIBUTE_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_attribute_type() {
      return rawAccumulateAllValuesOfinitial_attribute_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_attribute_type(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_attribute_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_attribute_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_attribute_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_attribute, 
      pCurrent_attribute, 
      null, 
      pCurrent_attribute_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfcurrent_attribute_type(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_CURRENT_ATTRIBUTE_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_attribute_type() {
      return rawAccumulateAllValuesOfcurrent_attribute_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_attribute_type(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attribute_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_attribute_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_attribute_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      null, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfinitial_type(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_INITIAL_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_type() {
      return rawAccumulateAllValuesOfinitial_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_type(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      null, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfcurrent_type(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_CURRENT_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_type() {
      return rawAccumulateAllValuesOfcurrent_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_type(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type) {
      return rawAccumulateAllValuesOfcurrent_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_attribute_type, 
      pCurrent_attribute_type, 
      pInitial_type, 
      null
      });
    }
    
    @Override
    protected ChangeAttributeTypePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ChangeAttributeTypePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (Attribute) t.get(POSITION_INITIAL_ATTRIBUTE), (Attribute) t.get(POSITION_CURRENT_ATTRIBUTE), (DataType) t.get(POSITION_INITIAL_ATTRIBUTE_TYPE), (DataType) t.get(POSITION_CURRENT_ATTRIBUTE_TYPE), (DataType) t.get(POSITION_INITIAL_TYPE), (DataType) t.get(POSITION_CURRENT_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeAttributeTypePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ChangeAttributeTypePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Attribute) match[POSITION_INITIAL_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (DataType) match[POSITION_INITIAL_ATTRIBUTE_TYPE], (DataType) match[POSITION_CURRENT_ATTRIBUTE_TYPE], (DataType) match[POSITION_INITIAL_TYPE], (DataType) match[POSITION_CURRENT_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeAttributeTypePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ChangeAttributeTypePostcondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Attribute) match[POSITION_INITIAL_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (DataType) match[POSITION_INITIAL_ATTRIBUTE_TYPE], (DataType) match[POSITION_CURRENT_ATTRIBUTE_TYPE], (DataType) match[POSITION_INITIAL_TYPE], (DataType) match[POSITION_CURRENT_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<ChangeAttributeTypePostcondition.Matcher> querySpecification() {
      return ChangeAttributeTypePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ChangeAttributeTypePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pInitial_attribute the value of pattern parameter initial_attribute in the currently processed match
     * @param pCurrent_attribute the value of pattern parameter current_attribute in the currently processed match
     * @param pInitial_attribute_type the value of pattern parameter initial_attribute_type in the currently processed match
     * @param pCurrent_attribute_type the value of pattern parameter current_attribute_type in the currently processed match
     * @param pInitial_type the value of pattern parameter initial_type in the currently processed match
     * @param pCurrent_type the value of pattern parameter current_type in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_attribute_type, final DataType pCurrent_attribute_type, final DataType pInitial_type, final DataType pCurrent_type);
    
    @Override
    public void process(final ChangeAttributeTypePostcondition.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_class(), match.getCurrent_class(), match.getInitial_attribute(), match.getCurrent_attribute(), match.getInitial_attribute_type(), match.getCurrent_attribute_type(), match.getInitial_type(), match.getCurrent_type());
    }
  }
  
  private ChangeAttributeTypePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ChangeAttributeTypePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChangeAttributeTypePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ChangeAttributeTypePostcondition.Matcher.on(engine);
  }
  
  @Override
  public ChangeAttributeTypePostcondition.Matcher instantiate() {
    return ChangeAttributeTypePostcondition.Matcher.create();
  }
  
  @Override
  public ChangeAttributeTypePostcondition.Match newEmptyMatch() {
    return ChangeAttributeTypePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public ChangeAttributeTypePostcondition.Match newMatch(final Object... parameters) {
    return ChangeAttributeTypePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[4], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[5], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[6], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[7], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[8], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[9]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition (visibility: PUBLIC, simpleName: ChangeAttributeTypePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition (visibility: PUBLIC, simpleName: ChangeAttributeTypePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ChangeAttributeTypePostcondition INSTANCE = new ChangeAttributeTypePostcondition();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private final static Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static ChangeAttributeTypePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_attribute = new PParameter("initial_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attribute = new PParameter("current_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_attribute_type = new PParameter("initial_attribute_type", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attribute_type = new PParameter("current_attribute_type", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_type = new PParameter("initial_type", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_type = new PParameter("current_type", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_class, parameter_pCurrent_class, parameter_pInitial_attribute, parameter_pCurrent_attribute, parameter_pInitial_attribute_type, parameter_pCurrent_attribute_type, parameter_pInitial_type, parameter_pCurrent_type);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeAttributeTypePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_class","current_class","initial_attribute","current_attribute","initial_attribute_type","current_attribute_type","initial_type","current_type");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_initial_package = body.getOrCreateVariableByName("initial_package");
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          PVariable var_initial_class = body.getOrCreateVariableByName("initial_class");
          PVariable var_current_class = body.getOrCreateVariableByName("current_class");
          PVariable var_initial_attribute = body.getOrCreateVariableByName("initial_attribute");
          PVariable var_current_attribute = body.getOrCreateVariableByName("current_attribute");
          PVariable var_initial_attribute_type = body.getOrCreateVariableByName("initial_attribute_type");
          PVariable var_current_attribute_type = body.getOrCreateVariableByName("current_attribute_type");
          PVariable var_initial_type = body.getOrCreateVariableByName("initial_type");
          PVariable var_current_type = body.getOrCreateVariableByName("current_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_initial_attribute, parameter_pInitial_attribute),
             new ExportedParameter(body, var_current_attribute, parameter_pCurrent_attribute),
             new ExportedParameter(body, var_initial_attribute_type, parameter_pInitial_attribute_type),
             new ExportedParameter(body, var_current_attribute_type, parameter_pCurrent_attribute_type),
             new ExportedParameter(body, var_initial_type, parameter_pInitial_type),
             new ExportedParameter(body, var_current_type, parameter_pCurrent_type)
          ));
          // 	find preserved_package_class (initial_package, current_package, initial_class, current_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_class, var_current_class), Preserved_package_class.instance().getInternalQueryRepresentation());
          //  	find preserved_package_dataType (initial_package, current_package, initial_type, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_type, var_current_type), Preserved_package_dataType.instance().getInternalQueryRepresentation());
          // 	find preserved_package_dataType (initial_package, current_package, initial_attribute_type, current_attribute_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_attribute_type, var_current_attribute_type), Preserved_package_dataType.instance().getInternalQueryRepresentation());
          //   	find preserved_class_attribute (initial_class, current_class, initial_attribute, current_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var_initial_attribute, var_current_attribute), Preserved_class_attribute.instance().getInternalQueryRepresentation());
          // 	find changed_attribute_type (initial_attribute, current_attribute, initial_attribute_type, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_attribute, var_current_attribute, var_initial_attribute_type, var_current_type), Changed_attribute_type.instance().getInternalQueryRepresentation());
          // 	initial_attribute_type != initial_type
          new Inequality(body, var_initial_attribute_type, var_initial_type);
          //  	current_attribute_type != current_type
          new Inequality(body, var_current_attribute_type, var_current_type);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
