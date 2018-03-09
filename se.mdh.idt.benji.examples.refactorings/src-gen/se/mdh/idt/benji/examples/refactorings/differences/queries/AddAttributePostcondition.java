/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/AddAttribute.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_attribute_typed;
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
public final class AddAttributePostcondition extends BaseGeneratedEMFQuerySpecification<AddAttributePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition pattern,
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
    
    private DataType fInitial_dataType;
    
    private DataType fCurrent_dataType;
    
    private Attribute fCurrent_attribute;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_class", "current_class", "initial_dataType", "current_dataType", "current_attribute");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_class = pInitial_class;
      this.fCurrent_class = pCurrent_class;
      this.fInitial_dataType = pInitial_dataType;
      this.fCurrent_dataType = pCurrent_dataType;
      this.fCurrent_attribute = pCurrent_attribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("initial_dataType".equals(parameterName)) return this.fInitial_dataType;
      if ("current_dataType".equals(parameterName)) return this.fCurrent_dataType;
      if ("current_attribute".equals(parameterName)) return this.fCurrent_attribute;
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
    
    public DataType getInitial_dataType() {
      return this.fInitial_dataType;
    }
    
    public DataType getCurrent_dataType() {
      return this.fCurrent_dataType;
    }
    
    public Attribute getCurrent_attribute() {
      return this.fCurrent_attribute;
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
      if ("initial_dataType".equals(parameterName) ) {
          this.fInitial_dataType = (DataType) newValue;
          return true;
      }
      if ("current_dataType".equals(parameterName) ) {
          this.fCurrent_dataType = (DataType) newValue;
          return true;
      }
      if ("current_attribute".equals(parameterName) ) {
          this.fCurrent_attribute = (Attribute) newValue;
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
    
    public void setInitial_dataType(final DataType pInitial_dataType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_dataType = pInitial_dataType;
    }
    
    public void setCurrent_dataType(final DataType pCurrent_dataType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_dataType = pCurrent_dataType;
    }
    
    public void setCurrent_attribute(final Attribute pCurrent_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attribute = pCurrent_attribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddAttributePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_dataType, fCurrent_dataType, fCurrent_attribute};
    }
    
    @Override
    public AddAttributePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_dataType, fCurrent_dataType, fCurrent_attribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"initial_dataType\"=" + prettyPrintValue(fInitial_dataType) + ", ");
      result.append("\"current_dataType\"=" + prettyPrintValue(fCurrent_dataType) + ", ");
      result.append("\"current_attribute\"=" + prettyPrintValue(fCurrent_attribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_dataType, fCurrent_dataType, fCurrent_attribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AddAttributePostcondition.Match)) {
          AddAttributePostcondition.Match other = (AddAttributePostcondition.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_class, other.fInitial_class) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fInitial_dataType, other.fInitial_dataType) && Objects.equals(fCurrent_dataType, other.fCurrent_dataType) && Objects.equals(fCurrent_attribute, other.fCurrent_attribute);
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
    public AddAttributePostcondition specification() {
      return AddAttributePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddAttributePostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddAttributePostcondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddAttributePostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute);
    }
    
    private static final class Mutable extends AddAttributePostcondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
        super(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddAttributePostcondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
        super(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // AAA10 - Add Attribute - Postcondition
   * pattern AddAttributePostcondition (initial_package : Package, current_package : Package, initial_class : Class, current_class : Class, initial_dataType : DataType, current_dataType : DataType, current_attribute : Attribute) {
   * 	find preserved_package_class (initial_package, current_package, initial_class, current_class); 
   * 	find preserved_package_dataType (initial_package, current_package, initial_dataType, current_dataType);
   * 	find added_class_attribute_typed (initial_class, current_class, current_attribute, current_dataType);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AddAttributePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<AddAttributePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddAttributePostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddAttributePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_CLASS = 2;
    
    private final static int POSITION_CURRENT_CLASS = 3;
    
    private final static int POSITION_INITIAL_DATATYPE = 4;
    
    private final static int POSITION_CURRENT_DATATYPE = 5;
    
    private final static int POSITION_CURRENT_ATTRIBUTE = 6;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddAttributePostcondition.Matcher.class);
    
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
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddAttributePostcondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddAttributePostcondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute, final IMatchProcessor<? super AddAttributePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute, final IMatchProcessor<? super AddAttributePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_dataType the fixed value of pattern parameter initial_dataType, or null if not bound.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddAttributePostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return AddAttributePostcondition.Match.newMatch(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_dataType, pCurrent_dataType, pCurrent_attribute);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_dataType, 
      pCurrent_dataType, 
      pCurrent_attribute
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_dataType, 
      pCurrent_dataType, 
      pCurrent_attribute
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pCurrent_class, 
      pInitial_dataType, 
      pCurrent_dataType, 
      pCurrent_attribute
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      null, 
      pInitial_dataType, 
      pCurrent_dataType, 
      pCurrent_attribute
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfinitial_dataType(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_INITIAL_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_dataType() {
      return rawAccumulateAllValuesOfinitial_dataType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_dataType(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_dataType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_dataType(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pCurrent_dataType, final Attribute pCurrent_attribute) {
      return rawAccumulateAllValuesOfinitial_dataType(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      null, 
      pCurrent_dataType, 
      pCurrent_attribute
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfcurrent_dataType(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_CURRENT_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_dataType() {
      return rawAccumulateAllValuesOfcurrent_dataType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_dataType(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_dataType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_dataType(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final Attribute pCurrent_attribute) {
      return rawAccumulateAllValuesOfcurrent_dataType(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_dataType, 
      null, 
      pCurrent_attribute
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
    public Set<Attribute> getAllValuesOfcurrent_attribute(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType) {
      return rawAccumulateAllValuesOfcurrent_attribute(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_dataType, 
      pCurrent_dataType, 
      null
      });
    }
    
    @Override
    protected AddAttributePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddAttributePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (DataType) t.get(POSITION_INITIAL_DATATYPE), (DataType) t.get(POSITION_CURRENT_DATATYPE), (Attribute) t.get(POSITION_CURRENT_ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddAttributePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddAttributePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (DataType) match[POSITION_INITIAL_DATATYPE], (DataType) match[POSITION_CURRENT_DATATYPE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddAttributePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddAttributePostcondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (DataType) match[POSITION_INITIAL_DATATYPE], (DataType) match[POSITION_CURRENT_DATATYPE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE]);
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
    public static IQuerySpecification<AddAttributePostcondition.Matcher> querySpecification() {
      return AddAttributePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<AddAttributePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pInitial_dataType the value of pattern parameter initial_dataType in the currently processed match
     * @param pCurrent_dataType the value of pattern parameter current_dataType in the currently processed match
     * @param pCurrent_attribute the value of pattern parameter current_attribute in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final DataType pInitial_dataType, final DataType pCurrent_dataType, final Attribute pCurrent_attribute);
    
    @Override
    public void process(final AddAttributePostcondition.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_class(), match.getCurrent_class(), match.getInitial_dataType(), match.getCurrent_dataType(), match.getCurrent_attribute());
    }
  }
  
  private AddAttributePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddAttributePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddAttributePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddAttributePostcondition.Matcher.on(engine);
  }
  
  @Override
  public AddAttributePostcondition.Matcher instantiate() {
    return AddAttributePostcondition.Matcher.create();
  }
  
  @Override
  public AddAttributePostcondition.Match newEmptyMatch() {
    return AddAttributePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public AddAttributePostcondition.Match newMatch(final Object... parameters) {
    return AddAttributePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[4], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[5], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[6]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition (visibility: PUBLIC, simpleName: AddAttributePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition (visibility: PUBLIC, simpleName: AddAttributePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AddAttributePostcondition INSTANCE = new AddAttributePostcondition();
    
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
    private final static AddAttributePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_dataType = new PParameter("initial_dataType", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_dataType = new PParameter("current_dataType", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attribute = new PParameter("current_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_class, parameter_pCurrent_class, parameter_pInitial_dataType, parameter_pCurrent_dataType, parameter_pCurrent_attribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.AddAttributePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_class","current_class","initial_dataType","current_dataType","current_attribute");
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
          PVariable var_initial_dataType = body.getOrCreateVariableByName("initial_dataType");
          PVariable var_current_dataType = body.getOrCreateVariableByName("current_dataType");
          PVariable var_current_attribute = body.getOrCreateVariableByName("current_attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_dataType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_dataType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_initial_dataType, parameter_pInitial_dataType),
             new ExportedParameter(body, var_current_dataType, parameter_pCurrent_dataType),
             new ExportedParameter(body, var_current_attribute, parameter_pCurrent_attribute)
          ));
          // 	find preserved_package_class (initial_package, current_package, initial_class, current_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_class, var_current_class), Preserved_package_class.instance().getInternalQueryRepresentation());
          //  	find preserved_package_dataType (initial_package, current_package, initial_dataType, current_dataType)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_dataType, var_current_dataType), Preserved_package_dataType.instance().getInternalQueryRepresentation());
          // 	find added_class_attribute_typed (initial_class, current_class, current_attribute, current_dataType)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var_current_attribute, var_current_dataType), Added_class_attribute_typed.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
