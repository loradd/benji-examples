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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_name;
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
public final class $current_enumeration_name extends BaseGeneratedEMFQuerySpecification<$current_enumeration_name.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name pattern,
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
    private TraceLink fEnumeration;
    
    private Enumeration fCurrent_enumeration;
    
    private String fName;
    
    private static List<String> parameterNames = makeImmutableList("enumeration", "current_enumeration", "name");
    
    private Match(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      this.fEnumeration = pEnumeration;
      this.fCurrent_enumeration = pCurrent_enumeration;
      this.fName = pName;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("enumeration".equals(parameterName)) return this.fEnumeration;
      if ("current_enumeration".equals(parameterName)) return this.fCurrent_enumeration;
      if ("name".equals(parameterName)) return this.fName;
      return null;
    }
    
    public TraceLink getEnumeration() {
      return this.fEnumeration;
    }
    
    public Enumeration getCurrent_enumeration() {
      return this.fCurrent_enumeration;
    }
    
    public String getName() {
      return this.fName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("enumeration".equals(parameterName) ) {
          this.fEnumeration = (TraceLink) newValue;
          return true;
      }
      if ("current_enumeration".equals(parameterName) ) {
          this.fCurrent_enumeration = (Enumeration) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnumeration(final TraceLink pEnumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumeration = pEnumeration;
    }
    
    public void setCurrent_enumeration(final Enumeration pCurrent_enumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_enumeration = pCurrent_enumeration;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_enumeration_name.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnumeration, fCurrent_enumeration, fName};
    }
    
    @Override
    public $current_enumeration_name.Match toImmutable() {
      return isMutable() ? newMatch(fEnumeration, fCurrent_enumeration, fName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"enumeration\"=" + prettyPrintValue(fEnumeration) + ", ");
      result.append("\"current_enumeration\"=" + prettyPrintValue(fCurrent_enumeration) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fEnumeration, fCurrent_enumeration, fName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_enumeration_name.Match)) {
          $current_enumeration_name.Match other = ($current_enumeration_name.Match) obj;
          return Objects.equals(fEnumeration, other.fEnumeration) && Objects.equals(fCurrent_enumeration, other.fCurrent_enumeration) && Objects.equals(fName, other.fName);
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
    public $current_enumeration_name specification() {
      return $current_enumeration_name.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_enumeration_name.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_enumeration_name.Match newMutableMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      return new Mutable(pEnumeration, pCurrent_enumeration, pName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_enumeration_name.Match newMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      return new Immutable(pEnumeration, pCurrent_enumeration, pName);
    }
    
    private static final class Mutable extends $current_enumeration_name.Match {
      Mutable(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
        super(pEnumeration, pCurrent_enumeration, pName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_enumeration_name.Match {
      Immutable(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
        super(pEnumeration, pCurrent_enumeration, pName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration - name - current
   * pattern $current_enumeration_name (enumeration : TraceLink, current_enumeration : Enumeration, name : java String) {
   * 	find $current_datatype_name (enumeration, current_enumeration, name);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_enumeration_name
   * 
   */
  public static class Matcher extends BaseMatcher<$current_enumeration_name.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_enumeration_name.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_enumeration_name.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ENUMERATION = 0;
    
    private final static int POSITION_CURRENT_ENUMERATION = 1;
    
    private final static int POSITION_NAME = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_enumeration_name.Matcher.class);
    
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
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_enumeration_name.Match> getAllMatches(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      return rawGetAllMatches(new Object[]{pEnumeration, pCurrent_enumeration, pName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_enumeration_name.Match getOneArbitraryMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      return rawGetOneArbitraryMatch(new Object[]{pEnumeration, pCurrent_enumeration, pName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      return rawHasMatch(new Object[]{pEnumeration, pCurrent_enumeration, pName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      return rawCountMatches(new Object[]{pEnumeration, pCurrent_enumeration, pName});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName, final IMatchProcessor<? super $current_enumeration_name.Match> processor) {
      rawForEachMatch(new Object[]{pEnumeration, pCurrent_enumeration, pName}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName, final IMatchProcessor<? super $current_enumeration_name.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnumeration, pCurrent_enumeration, pName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_enumeration_name.Match newMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName) {
      return $current_enumeration_name.Match.newMatch(pEnumeration, pCurrent_enumeration, pName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfenumeration(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumeration() {
      return rawAccumulateAllValuesOfenumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumeration(final $current_enumeration_name.Match partialMatch) {
      return rawAccumulateAllValuesOfenumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumeration(final Enumeration pCurrent_enumeration, final String pName) {
      return rawAccumulateAllValuesOfenumeration(new Object[]{
      null, 
      pCurrent_enumeration, 
      pName
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Enumeration> rawAccumulateAllValuesOfcurrent_enumeration(final Object[] parameters) {
      Set<Enumeration> results = new HashSet<Enumeration>();
      rawAccumulateAllValues(POSITION_CURRENT_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration() {
      return rawAccumulateAllValuesOfcurrent_enumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final $current_enumeration_name.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_enumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final TraceLink pEnumeration, final String pName) {
      return rawAccumulateAllValuesOfcurrent_enumeration(new Object[]{
      pEnumeration, 
      null, 
      pName
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname() {
      return rawAccumulateAllValuesOfname(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final $current_enumeration_name.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pEnumeration, 
      pCurrent_enumeration, 
      null
      });
    }
    
    @Override
    protected $current_enumeration_name.Match tupleToMatch(final Tuple t) {
      try {
          return $current_enumeration_name.Match.newMatch((TraceLink) t.get(POSITION_ENUMERATION), (Enumeration) t.get(POSITION_CURRENT_ENUMERATION), (String) t.get(POSITION_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_enumeration_name.Match arrayToMatch(final Object[] match) {
      try {
          return $current_enumeration_name.Match.newMatch((TraceLink) match[POSITION_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION], (String) match[POSITION_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_enumeration_name.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_enumeration_name.Match.newMutableMatch((TraceLink) match[POSITION_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION], (String) match[POSITION_NAME]);
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
    public static IQuerySpecification<$current_enumeration_name.Matcher> querySpecification() {
      return $current_enumeration_name.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_enumeration_name.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEnumeration the value of pattern parameter enumeration in the currently processed match
     * @param pCurrent_enumeration the value of pattern parameter current_enumeration in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final String pName);
    
    @Override
    public void process(final $current_enumeration_name.Match match) {
      process(match.getEnumeration(), match.getCurrent_enumeration(), match.getName());
    }
  }
  
  private $current_enumeration_name() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_enumeration_name instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_enumeration_name.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_enumeration_name.Matcher.on(engine);
  }
  
  @Override
  public $current_enumeration_name.Matcher instantiate() {
    return $current_enumeration_name.Matcher.create();
  }
  
  @Override
  public $current_enumeration_name.Match newEmptyMatch() {
    return $current_enumeration_name.Match.newEmptyMatch();
  }
  
  @Override
  public $current_enumeration_name.Match newMatch(final Object... parameters) {
    return $current_enumeration_name.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name (visibility: PUBLIC, simpleName: $current_enumeration_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name (visibility: PUBLIC, simpleName: $current_enumeration_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_enumeration_name INSTANCE = new $current_enumeration_name();
    
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
    private final static $current_enumeration_name.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEnumeration = new PParameter("enumeration", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_enumeration = new PParameter("current_enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEnumeration, parameter_pCurrent_enumeration, parameter_pName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("enumeration","current_enumeration","name");
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
          PVariable var_enumeration = body.getOrCreateVariableByName("enumeration");
          PVariable var_current_enumeration = body.getOrCreateVariableByName("current_enumeration");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_enumeration, parameter_pEnumeration),
             new ExportedParameter(body, var_current_enumeration, parameter_pCurrent_enumeration),
             new ExportedParameter(body, var_name, parameter_pName)
          ));
          // 	find $current_datatype_name (enumeration, current_enumeration, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumeration, var_current_enumeration, var_name), $current_datatype_name.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
