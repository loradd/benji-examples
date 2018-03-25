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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumerationLiteral_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_enumerationLiteral_enumeration;
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
public final class $enumerationLiteral_enumeration extends BaseGeneratedEMFQuerySpecification<$enumerationLiteral_enumeration.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration pattern,
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
    private TraceLink fEnumerationLiteral;
    
    private TraceLink fEnumeration;
    
    private static List<String> parameterNames = makeImmutableList("enumerationLiteral", "enumeration");
    
    private Match(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      this.fEnumerationLiteral = pEnumerationLiteral;
      this.fEnumeration = pEnumeration;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("enumerationLiteral".equals(parameterName)) return this.fEnumerationLiteral;
      if ("enumeration".equals(parameterName)) return this.fEnumeration;
      return null;
    }
    
    public TraceLink getEnumerationLiteral() {
      return this.fEnumerationLiteral;
    }
    
    public TraceLink getEnumeration() {
      return this.fEnumeration;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("enumerationLiteral".equals(parameterName) ) {
          this.fEnumerationLiteral = (TraceLink) newValue;
          return true;
      }
      if ("enumeration".equals(parameterName) ) {
          this.fEnumeration = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnumerationLiteral(final TraceLink pEnumerationLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumerationLiteral = pEnumerationLiteral;
    }
    
    public void setEnumeration(final TraceLink pEnumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumeration = pEnumeration;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration";
    }
    
    @Override
    public List<String> parameterNames() {
      return $enumerationLiteral_enumeration.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnumerationLiteral, fEnumeration};
    }
    
    @Override
    public $enumerationLiteral_enumeration.Match toImmutable() {
      return isMutable() ? newMatch(fEnumerationLiteral, fEnumeration) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"enumerationLiteral\"=" + prettyPrintValue(fEnumerationLiteral) + ", ");
      result.append("\"enumeration\"=" + prettyPrintValue(fEnumeration));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fEnumerationLiteral, fEnumeration);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $enumerationLiteral_enumeration.Match)) {
          $enumerationLiteral_enumeration.Match other = ($enumerationLiteral_enumeration.Match) obj;
          return Objects.equals(fEnumerationLiteral, other.fEnumerationLiteral) && Objects.equals(fEnumeration, other.fEnumeration);
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
    public $enumerationLiteral_enumeration specification() {
      return $enumerationLiteral_enumeration.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $enumerationLiteral_enumeration.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $enumerationLiteral_enumeration.Match newMutableMatch(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      return new Mutable(pEnumerationLiteral, pEnumeration);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $enumerationLiteral_enumeration.Match newMatch(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      return new Immutable(pEnumerationLiteral, pEnumeration);
    }
    
    private static final class Mutable extends $enumerationLiteral_enumeration.Match {
      Mutable(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
        super(pEnumerationLiteral, pEnumeration);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $enumerationLiteral_enumeration.Match {
      Immutable(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
        super(pEnumerationLiteral, pEnumeration);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration literal - enumeration - get
   * pattern $enumerationLiteral_enumeration (enumerationLiteral : TraceLink, enumeration : TraceLink) {
   * 	find $initial_enumerationLiteral_enumeration (enumerationLiteral, _initial_enumerationLiteral, enumeration, _initial_enumeration); 
   * 	find $current_enumerationLiteral_enumeration (enumerationLiteral, _current_enumerationLiteral, enumeration, _current_enumeration); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $enumerationLiteral_enumeration
   * 
   */
  public static class Matcher extends BaseMatcher<$enumerationLiteral_enumeration.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $enumerationLiteral_enumeration.Matcher on(final ViatraQueryEngine engine) {
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
    public static $enumerationLiteral_enumeration.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ENUMERATIONLITERAL = 0;
    
    private final static int POSITION_ENUMERATION = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($enumerationLiteral_enumeration.Matcher.class);
    
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
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$enumerationLiteral_enumeration.Match> getAllMatches(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      return rawGetAllMatches(new Object[]{pEnumerationLiteral, pEnumeration});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $enumerationLiteral_enumeration.Match getOneArbitraryMatch(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      return rawGetOneArbitraryMatch(new Object[]{pEnumerationLiteral, pEnumeration});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      return rawHasMatch(new Object[]{pEnumerationLiteral, pEnumeration});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      return rawCountMatches(new Object[]{pEnumerationLiteral, pEnumeration});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration, final IMatchProcessor<? super $enumerationLiteral_enumeration.Match> processor) {
      rawForEachMatch(new Object[]{pEnumerationLiteral, pEnumeration}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration, final IMatchProcessor<? super $enumerationLiteral_enumeration.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnumerationLiteral, pEnumeration}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $enumerationLiteral_enumeration.Match newMatch(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration) {
      return $enumerationLiteral_enumeration.Match.newMatch(pEnumerationLiteral, pEnumeration);
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfenumerationLiteral(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ENUMERATIONLITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral() {
      return rawAccumulateAllValuesOfenumerationLiteral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral(final $enumerationLiteral_enumeration.Match partialMatch) {
      return rawAccumulateAllValuesOfenumerationLiteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral(final TraceLink pEnumeration) {
      return rawAccumulateAllValuesOfenumerationLiteral(new Object[]{
      null, 
      pEnumeration
      });
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
    public Set<TraceLink> getAllValuesOfenumeration(final $enumerationLiteral_enumeration.Match partialMatch) {
      return rawAccumulateAllValuesOfenumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumeration(final TraceLink pEnumerationLiteral) {
      return rawAccumulateAllValuesOfenumeration(new Object[]{
      pEnumerationLiteral, 
      null
      });
    }
    
    @Override
    protected $enumerationLiteral_enumeration.Match tupleToMatch(final Tuple t) {
      try {
          return $enumerationLiteral_enumeration.Match.newMatch((TraceLink) t.get(POSITION_ENUMERATIONLITERAL), (TraceLink) t.get(POSITION_ENUMERATION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $enumerationLiteral_enumeration.Match arrayToMatch(final Object[] match) {
      try {
          return $enumerationLiteral_enumeration.Match.newMatch((TraceLink) match[POSITION_ENUMERATIONLITERAL], (TraceLink) match[POSITION_ENUMERATION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $enumerationLiteral_enumeration.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $enumerationLiteral_enumeration.Match.newMutableMatch((TraceLink) match[POSITION_ENUMERATIONLITERAL], (TraceLink) match[POSITION_ENUMERATION]);
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
    public static IQuerySpecification<$enumerationLiteral_enumeration.Matcher> querySpecification() {
      return $enumerationLiteral_enumeration.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$enumerationLiteral_enumeration.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEnumerationLiteral the value of pattern parameter enumerationLiteral in the currently processed match
     * @param pEnumeration the value of pattern parameter enumeration in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pEnumerationLiteral, final TraceLink pEnumeration);
    
    @Override
    public void process(final $enumerationLiteral_enumeration.Match match) {
      process(match.getEnumerationLiteral(), match.getEnumeration());
    }
  }
  
  private $enumerationLiteral_enumeration() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $enumerationLiteral_enumeration instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $enumerationLiteral_enumeration.Matcher instantiate(final ViatraQueryEngine engine) {
    return $enumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  @Override
  public $enumerationLiteral_enumeration.Matcher instantiate() {
    return $enumerationLiteral_enumeration.Matcher.create();
  }
  
  @Override
  public $enumerationLiteral_enumeration.Match newEmptyMatch() {
    return $enumerationLiteral_enumeration.Match.newEmptyMatch();
  }
  
  @Override
  public $enumerationLiteral_enumeration.Match newMatch(final Object... parameters) {
    return $enumerationLiteral_enumeration.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration (visibility: PUBLIC, simpleName: $enumerationLiteral_enumeration, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration (visibility: PUBLIC, simpleName: $enumerationLiteral_enumeration, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $enumerationLiteral_enumeration INSTANCE = new $enumerationLiteral_enumeration();
    
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
    private final static $enumerationLiteral_enumeration.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEnumerationLiteral = new PParameter("enumerationLiteral", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEnumeration = new PParameter("enumeration", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEnumerationLiteral, parameter_pEnumeration);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$enumerationLiteral_enumeration";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("enumerationLiteral","enumeration");
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
          PVariable var_enumerationLiteral = body.getOrCreateVariableByName("enumerationLiteral");
          PVariable var_enumeration = body.getOrCreateVariableByName("enumeration");
          PVariable var__initial_enumerationLiteral = body.getOrCreateVariableByName("_initial_enumerationLiteral");
          PVariable var__initial_enumeration = body.getOrCreateVariableByName("_initial_enumeration");
          PVariable var__current_enumerationLiteral = body.getOrCreateVariableByName("_current_enumerationLiteral");
          PVariable var__current_enumeration = body.getOrCreateVariableByName("_current_enumeration");
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumerationLiteral), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_enumerationLiteral, parameter_pEnumerationLiteral),
             new ExportedParameter(body, var_enumeration, parameter_pEnumeration)
          ));
          // 	find $initial_enumerationLiteral_enumeration (enumerationLiteral, _initial_enumerationLiteral, enumeration, _initial_enumeration)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumerationLiteral, var__initial_enumerationLiteral, var_enumeration, var__initial_enumeration), $initial_enumerationLiteral_enumeration.instance().getInternalQueryRepresentation());
          //  	find $current_enumerationLiteral_enumeration (enumerationLiteral, _current_enumerationLiteral, enumeration, _current_enumeration)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumerationLiteral, var__current_enumerationLiteral, var_enumeration, var__current_enumeration), $current_enumerationLiteral_enumeration.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
