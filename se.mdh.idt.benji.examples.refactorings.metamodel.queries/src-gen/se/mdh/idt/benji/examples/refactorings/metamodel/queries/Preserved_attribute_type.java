/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Attribute.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_dataType;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Preserved_attribute_type extends BaseGeneratedEMFQuerySpecification<Preserved_attribute_type.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_attribute_type pattern,
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
    private Attribute fInitial_attribute;
    
    private Attribute fCurrent_attribute;
    
    private DataType fInitial_type;
    
    private DataType fCurrent_type;
    
    private static List<String> parameterNames = makeImmutableList("initial_attribute", "current_attribute", "initial_type", "current_type");
    
    private Match(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      this.fInitial_attribute = pInitial_attribute;
      this.fCurrent_attribute = pCurrent_attribute;
      this.fInitial_type = pInitial_type;
      this.fCurrent_type = pCurrent_type;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_attribute".equals(parameterName)) return this.fInitial_attribute;
      if ("current_attribute".equals(parameterName)) return this.fCurrent_attribute;
      if ("initial_type".equals(parameterName)) return this.fInitial_type;
      if ("current_type".equals(parameterName)) return this.fCurrent_type;
      return null;
    }
    
    public Attribute getInitial_attribute() {
      return this.fInitial_attribute;
    }
    
    public Attribute getCurrent_attribute() {
      return this.fCurrent_attribute;
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
      if ("initial_attribute".equals(parameterName) ) {
          this.fInitial_attribute = (Attribute) newValue;
          return true;
      }
      if ("current_attribute".equals(parameterName) ) {
          this.fCurrent_attribute = (Attribute) newValue;
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
    
    public void setInitial_attribute(final Attribute pInitial_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_attribute = pInitial_attribute;
    }
    
    public void setCurrent_attribute(final Attribute pCurrent_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attribute = pCurrent_attribute;
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
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_attribute_type";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved_attribute_type.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_attribute, fCurrent_attribute, fInitial_type, fCurrent_type};
    }
    
    @Override
    public Preserved_attribute_type.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_attribute, fCurrent_attribute, fInitial_type, fCurrent_type) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_attribute\"=" + prettyPrintValue(fInitial_attribute) + ", ");
      result.append("\"current_attribute\"=" + prettyPrintValue(fCurrent_attribute) + ", ");
      result.append("\"initial_type\"=" + prettyPrintValue(fInitial_type) + ", ");
      result.append("\"current_type\"=" + prettyPrintValue(fCurrent_type));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_attribute, fCurrent_attribute, fInitial_type, fCurrent_type);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved_attribute_type.Match)) {
          Preserved_attribute_type.Match other = (Preserved_attribute_type.Match) obj;
          return Objects.equals(fInitial_attribute, other.fInitial_attribute) && Objects.equals(fCurrent_attribute, other.fCurrent_attribute) && Objects.equals(fInitial_type, other.fInitial_type) && Objects.equals(fCurrent_type, other.fCurrent_type);
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
    public Preserved_attribute_type specification() {
      return Preserved_attribute_type.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved_attribute_type.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved_attribute_type.Match newMutableMatch(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return new Mutable(pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved_attribute_type.Match newMatch(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return new Immutable(pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type);
    }
    
    private static final class Mutable extends Preserved_attribute_type.Match {
      Mutable(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
        super(pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved_attribute_type.Match {
      Immutable(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
        super(pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_attribute_type pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - type - preserved
   * pattern preserved_attribute_type (initial_attribute : Attribute, current_attribute : Attribute, initial_type : DataType, current_type : DataType) {
   * 	find preserved_attribute (initial_attribute, current_attribute); 
   * 	find preserved_dataType (initial_type, current_type); 
   * 	find attribute_type (initial_attribute, initial_type);
   * 	find attribute_type (current_attribute, current_type); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Preserved_attribute_type
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved_attribute_type.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved_attribute_type.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved_attribute_type.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_ATTRIBUTE = 0;
    
    private final static int POSITION_CURRENT_ATTRIBUTE = 1;
    
    private final static int POSITION_INITIAL_TYPE = 2;
    
    private final static int POSITION_CURRENT_TYPE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved_attribute_type.Matcher.class);
    
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
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved_attribute_type.Match> getAllMatches(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawGetAllMatches(new Object[]{pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved_attribute_type.Match getOneArbitraryMatch(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawHasMatch(new Object[]{pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawCountMatches(new Object[]{pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type, final IMatchProcessor<? super Preserved_attribute_type.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type, final IMatchProcessor<? super Preserved_attribute_type.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved_attribute_type.Match newMatch(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return Preserved_attribute_type.Match.newMatch(pInitial_attribute, pCurrent_attribute, pInitial_type, pCurrent_type);
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
    public Set<Attribute> getAllValuesOfinitial_attribute(final Preserved_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_attribute(new Object[]{
      null, 
      pCurrent_attribute, 
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
    public Set<Attribute> getAllValuesOfcurrent_attribute(final Preserved_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute(final Attribute pInitial_attribute, final DataType pInitial_type, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_attribute(new Object[]{
      pInitial_attribute, 
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
    public Set<DataType> getAllValuesOfinitial_type(final Preserved_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_type(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_type(new Object[]{
      pInitial_attribute, 
      pCurrent_attribute, 
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
    public Set<DataType> getAllValuesOfcurrent_type(final Preserved_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_type(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type) {
      return rawAccumulateAllValuesOfcurrent_type(new Object[]{
      pInitial_attribute, 
      pCurrent_attribute, 
      pInitial_type, 
      null
      });
    }
    
    @Override
    protected Preserved_attribute_type.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved_attribute_type.Match.newMatch((Attribute) t.get(POSITION_INITIAL_ATTRIBUTE), (Attribute) t.get(POSITION_CURRENT_ATTRIBUTE), (DataType) t.get(POSITION_INITIAL_TYPE), (DataType) t.get(POSITION_CURRENT_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_attribute_type.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved_attribute_type.Match.newMatch((Attribute) match[POSITION_INITIAL_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (DataType) match[POSITION_INITIAL_TYPE], (DataType) match[POSITION_CURRENT_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_attribute_type.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved_attribute_type.Match.newMutableMatch((Attribute) match[POSITION_INITIAL_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (DataType) match[POSITION_INITIAL_TYPE], (DataType) match[POSITION_CURRENT_TYPE]);
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
    public static IQuerySpecification<Preserved_attribute_type.Matcher> querySpecification() {
      return Preserved_attribute_type.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_attribute_type pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Preserved_attribute_type.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_attribute the value of pattern parameter initial_attribute in the currently processed match
     * @param pCurrent_attribute the value of pattern parameter current_attribute in the currently processed match
     * @param pInitial_type the value of pattern parameter initial_type in the currently processed match
     * @param pCurrent_type the value of pattern parameter current_type in the currently processed match
     * 
     */
    public abstract void process(final Attribute pInitial_attribute, final Attribute pCurrent_attribute, final DataType pInitial_type, final DataType pCurrent_type);
    
    @Override
    public void process(final Preserved_attribute_type.Match match) {
      process(match.getInitial_attribute(), match.getCurrent_attribute(), match.getInitial_type(), match.getCurrent_type());
    }
  }
  
  private Preserved_attribute_type() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved_attribute_type instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved_attribute_type.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved_attribute_type.Matcher.on(engine);
  }
  
  @Override
  public Preserved_attribute_type.Matcher instantiate() {
    return Preserved_attribute_type.Matcher.create();
  }
  
  @Override
  public Preserved_attribute_type.Match newEmptyMatch() {
    return Preserved_attribute_type.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved_attribute_type.Match newMatch(final Object... parameters) {
    return Preserved_attribute_type.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_type (visibility: PUBLIC, simpleName: Preserved_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_type (visibility: PUBLIC, simpleName: Preserved_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved_attribute_type INSTANCE = new Preserved_attribute_type();
    
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
    private final static Preserved_attribute_type.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_attribute = new PParameter("initial_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attribute = new PParameter("current_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_type = new PParameter("initial_type", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_type = new PParameter("current_type", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_attribute, parameter_pCurrent_attribute, parameter_pInitial_type, parameter_pCurrent_type);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_attribute_type";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_attribute","current_attribute","initial_type","current_type");
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
          PVariable var_initial_attribute = body.getOrCreateVariableByName("initial_attribute");
          PVariable var_current_attribute = body.getOrCreateVariableByName("current_attribute");
          PVariable var_initial_type = body.getOrCreateVariableByName("initial_type");
          PVariable var_current_type = body.getOrCreateVariableByName("current_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_attribute, parameter_pInitial_attribute),
             new ExportedParameter(body, var_current_attribute, parameter_pCurrent_attribute),
             new ExportedParameter(body, var_initial_type, parameter_pInitial_type),
             new ExportedParameter(body, var_current_type, parameter_pCurrent_type)
          ));
          // 	find preserved_attribute (initial_attribute, current_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_attribute, var_current_attribute), Preserved_attribute.instance().getInternalQueryRepresentation());
          //  	find preserved_dataType (initial_type, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_type, var_current_type), Preserved_dataType.instance().getInternalQueryRepresentation());
          //  	find attribute_type (initial_attribute, initial_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_attribute, var_initial_type), Attribute_type.instance().getInternalQueryRepresentation());
          // 	find attribute_type (current_attribute, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_attribute, var_current_type), Attribute_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
