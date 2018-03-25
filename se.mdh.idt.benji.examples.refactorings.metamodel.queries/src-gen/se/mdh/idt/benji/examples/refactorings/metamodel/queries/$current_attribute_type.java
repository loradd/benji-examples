/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Metamodel.vql
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class $current_attribute_type extends BaseGeneratedEMFQuerySpecification<$current_attribute_type.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type pattern,
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
    private TraceLink fAttribute;
    
    private Attribute fCurrent_attribute;
    
    private TraceLink fType;
    
    private DataType fCurrent_type;
    
    private static List<String> parameterNames = makeImmutableList("attribute", "current_attribute", "type", "current_type");
    
    private Match(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      this.fAttribute = pAttribute;
      this.fCurrent_attribute = pCurrent_attribute;
      this.fType = pType;
      this.fCurrent_type = pCurrent_type;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("current_attribute".equals(parameterName)) return this.fCurrent_attribute;
      if ("type".equals(parameterName)) return this.fType;
      if ("current_type".equals(parameterName)) return this.fCurrent_type;
      return null;
    }
    
    public TraceLink getAttribute() {
      return this.fAttribute;
    }
    
    public Attribute getCurrent_attribute() {
      return this.fCurrent_attribute;
    }
    
    public TraceLink getType() {
      return this.fType;
    }
    
    public DataType getCurrent_type() {
      return this.fCurrent_type;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (TraceLink) newValue;
          return true;
      }
      if ("current_attribute".equals(parameterName) ) {
          this.fCurrent_attribute = (Attribute) newValue;
          return true;
      }
      if ("type".equals(parameterName) ) {
          this.fType = (TraceLink) newValue;
          return true;
      }
      if ("current_type".equals(parameterName) ) {
          this.fCurrent_type = (DataType) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttribute(final TraceLink pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setCurrent_attribute(final Attribute pCurrent_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attribute = pCurrent_attribute;
    }
    
    public void setType(final TraceLink pType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fType = pType;
    }
    
    public void setCurrent_type(final DataType pCurrent_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_type = pCurrent_type;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_attribute_type.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttribute, fCurrent_attribute, fType, fCurrent_type};
    }
    
    @Override
    public $current_attribute_type.Match toImmutable() {
      return isMutable() ? newMatch(fAttribute, fCurrent_attribute, fType, fCurrent_type) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"current_attribute\"=" + prettyPrintValue(fCurrent_attribute) + ", ");
      result.append("\"type\"=" + prettyPrintValue(fType) + ", ");
      result.append("\"current_type\"=" + prettyPrintValue(fCurrent_type));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fAttribute, fCurrent_attribute, fType, fCurrent_type);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_attribute_type.Match)) {
          $current_attribute_type.Match other = ($current_attribute_type.Match) obj;
          return Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fCurrent_attribute, other.fCurrent_attribute) && Objects.equals(fType, other.fType) && Objects.equals(fCurrent_type, other.fCurrent_type);
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
    public $current_attribute_type specification() {
      return $current_attribute_type.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_attribute_type.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_attribute_type.Match newMutableMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return new Mutable(pAttribute, pCurrent_attribute, pType, pCurrent_type);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_attribute_type.Match newMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return new Immutable(pAttribute, pCurrent_attribute, pType, pCurrent_type);
    }
    
    private static final class Mutable extends $current_attribute_type.Match {
      Mutable(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
        super(pAttribute, pCurrent_attribute, pType, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_attribute_type.Match {
      Immutable(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
        super(pAttribute, pCurrent_attribute, pType, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - type - current
   * pattern $current_attribute_type (attribute : TraceLink, current_attribute : Attribute, type : TraceLink, current_type : DataType) {
   * 	find $current_attribute (attribute, current_attribute);
   * 	find $current_datatype (type, current_type);
   * 	Attribute.type (current_attribute, current_type);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_attribute_type
   * 
   */
  public static class Matcher extends BaseMatcher<$current_attribute_type.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_attribute_type.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_attribute_type.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ATTRIBUTE = 0;
    
    private final static int POSITION_CURRENT_ATTRIBUTE = 1;
    
    private final static int POSITION_TYPE = 2;
    
    private final static int POSITION_CURRENT_TYPE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_attribute_type.Matcher.class);
    
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
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_attribute_type.Match> getAllMatches(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return rawGetAllMatches(new Object[]{pAttribute, pCurrent_attribute, pType, pCurrent_type});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_attribute_type.Match getOneArbitraryMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return rawGetOneArbitraryMatch(new Object[]{pAttribute, pCurrent_attribute, pType, pCurrent_type});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return rawHasMatch(new Object[]{pAttribute, pCurrent_attribute, pType, pCurrent_type});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return rawCountMatches(new Object[]{pAttribute, pCurrent_attribute, pType, pCurrent_type});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type, final IMatchProcessor<? super $current_attribute_type.Match> processor) {
      rawForEachMatch(new Object[]{pAttribute, pCurrent_attribute, pType, pCurrent_type}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type, final IMatchProcessor<? super $current_attribute_type.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttribute, pCurrent_attribute, pType, pCurrent_type}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_attribute_type.Match newMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return $current_attribute_type.Match.newMatch(pAttribute, pCurrent_attribute, pType, pCurrent_type);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfattribute(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute() {
      return rawAccumulateAllValuesOfattribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final $current_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      null, 
      pCurrent_attribute, 
      pType, 
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
    public Set<Attribute> getAllValuesOfcurrent_attribute(final $current_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute(final TraceLink pAttribute, final TraceLink pType, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_attribute(new Object[]{
      pAttribute, 
      null, 
      pType, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOftype(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftype() {
      return rawAccumulateAllValuesOftype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftype(final $current_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOftype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftype(final TraceLink pAttribute, final Attribute pCurrent_attribute, final DataType pCurrent_type) {
      return rawAccumulateAllValuesOftype(new Object[]{
      pAttribute, 
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
    public Set<DataType> getAllValuesOfcurrent_type(final $current_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_type(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType) {
      return rawAccumulateAllValuesOfcurrent_type(new Object[]{
      pAttribute, 
      pCurrent_attribute, 
      pType, 
      null
      });
    }
    
    @Override
    protected $current_attribute_type.Match tupleToMatch(final Tuple t) {
      try {
          return $current_attribute_type.Match.newMatch((TraceLink) t.get(POSITION_ATTRIBUTE), (Attribute) t.get(POSITION_CURRENT_ATTRIBUTE), (TraceLink) t.get(POSITION_TYPE), (DataType) t.get(POSITION_CURRENT_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_attribute_type.Match arrayToMatch(final Object[] match) {
      try {
          return $current_attribute_type.Match.newMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (TraceLink) match[POSITION_TYPE], (DataType) match[POSITION_CURRENT_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_attribute_type.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_attribute_type.Match.newMutableMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (TraceLink) match[POSITION_TYPE], (DataType) match[POSITION_CURRENT_TYPE]);
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
    public static IQuerySpecification<$current_attribute_type.Matcher> querySpecification() {
      return $current_attribute_type.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_attribute_type.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pCurrent_attribute the value of pattern parameter current_attribute in the currently processed match
     * @param pType the value of pattern parameter type in the currently processed match
     * @param pCurrent_type the value of pattern parameter current_type in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pType, final DataType pCurrent_type);
    
    @Override
    public void process(final $current_attribute_type.Match match) {
      process(match.getAttribute(), match.getCurrent_attribute(), match.getType(), match.getCurrent_type());
    }
  }
  
  private $current_attribute_type() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_attribute_type instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_attribute_type.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_attribute_type.Matcher.on(engine);
  }
  
  @Override
  public $current_attribute_type.Matcher instantiate() {
    return $current_attribute_type.Matcher.create();
  }
  
  @Override
  public $current_attribute_type.Match newEmptyMatch() {
    return $current_attribute_type.Match.newEmptyMatch();
  }
  
  @Override
  public $current_attribute_type.Match newMatch(final Object... parameters) {
    return $current_attribute_type.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type (visibility: PUBLIC, simpleName: $current_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type (visibility: PUBLIC, simpleName: $current_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_attribute_type INSTANCE = new $current_attribute_type();
    
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
    private final static $current_attribute_type.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attribute = new PParameter("current_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pType = new PParameter("type", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_type = new PParameter("current_type", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pAttribute, parameter_pCurrent_attribute, parameter_pType, parameter_pCurrent_type);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_attribute_type";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attribute","current_attribute","type","current_type");
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
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          PVariable var_current_attribute = body.getOrCreateVariableByName("current_attribute");
          PVariable var_type = body.getOrCreateVariableByName("type");
          PVariable var_current_type = body.getOrCreateVariableByName("current_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_current_attribute, parameter_pCurrent_attribute),
             new ExportedParameter(body, var_type, parameter_pType),
             new ExportedParameter(body, var_current_type, parameter_pCurrent_type)
          ));
          // 	find $current_attribute (attribute, current_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_current_attribute), $current_attribute.instance().getInternalQueryRepresentation());
          // 	find $current_datatype (type, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_type, var_current_type), $current_datatype.instance().getInternalQueryRepresentation());
          // 	Attribute.type (current_attribute, current_type)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new Equality(body, var__virtual_0_, var_current_type);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
