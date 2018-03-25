/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_lower;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_reference_upper;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:20+0200")
public final class RestrictReferencePrecondition extends BaseGeneratedEMFQuerySpecification<RestrictReferencePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition pattern,
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
    private TraceLink f$reference;
    
    private Integer f$source_upper;
    
    private Integer f$source_lower;
    
    private static List<String> parameterNames = makeImmutableList("$reference", "$source_upper", "$source_lower");
    
    private Match(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      this.f$reference = p$reference;
      this.f$source_upper = p$source_upper;
      this.f$source_lower = p$source_lower;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$reference".equals(parameterName)) return this.f$reference;
      if ("$source_upper".equals(parameterName)) return this.f$source_upper;
      if ("$source_lower".equals(parameterName)) return this.f$source_lower;
      return null;
    }
    
    public TraceLink get$reference() {
      return this.f$reference;
    }
    
    public Integer get$source_upper() {
      return this.f$source_upper;
    }
    
    public Integer get$source_lower() {
      return this.f$source_lower;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$reference".equals(parameterName) ) {
          this.f$reference = (TraceLink) newValue;
          return true;
      }
      if ("$source_upper".equals(parameterName) ) {
          this.f$source_upper = (Integer) newValue;
          return true;
      }
      if ("$source_lower".equals(parameterName) ) {
          this.f$source_lower = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void set$reference(final TraceLink p$reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$reference = p$reference;
    }
    
    public void set$source_upper(final Integer p$source_upper) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$source_upper = p$source_upper;
    }
    
    public void set$source_lower(final Integer p$source_lower) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$source_lower = p$source_lower;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return RestrictReferencePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$reference, f$source_upper, f$source_lower};
    }
    
    @Override
    public RestrictReferencePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$reference, f$source_upper, f$source_lower) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$reference\"=" + prettyPrintValue(f$reference) + ", ");
      result.append("\"$source_upper\"=" + prettyPrintValue(f$source_upper) + ", ");
      result.append("\"$source_lower\"=" + prettyPrintValue(f$source_lower));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$reference, f$source_upper, f$source_lower);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RestrictReferencePrecondition.Match)) {
          RestrictReferencePrecondition.Match other = (RestrictReferencePrecondition.Match) obj;
          return Objects.equals(f$reference, other.f$reference) && Objects.equals(f$source_upper, other.f$source_upper) && Objects.equals(f$source_lower, other.f$source_lower);
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
    public RestrictReferencePrecondition specification() {
      return RestrictReferencePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RestrictReferencePrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RestrictReferencePrecondition.Match newMutableMatch(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      return new Mutable(p$reference, p$source_upper, p$source_lower);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RestrictReferencePrecondition.Match newMatch(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      return new Immutable(p$reference, p$source_upper, p$source_lower);
    }
    
    private static final class Mutable extends RestrictReferencePrecondition.Match {
      Mutable(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
        super(p$reference, p$source_upper, p$source_lower);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RestrictReferencePrecondition.Match {
      Immutable(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
        super(p$reference, p$source_upper, p$source_lower);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACCR20 - Restrict Reference - Precondition
   * pattern RestrictReferencePrecondition ($reference : TraceLink, $source_upper : java Integer, $source_lower : java Integer) {
   * 	find get_reference_lower ($reference, $source_lower);
   * 	find get_reference_upper ($reference, $source_upper);	
   * 	check ($source_upper != 1);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see RestrictReferencePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<RestrictReferencePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RestrictReferencePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static RestrictReferencePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$REFERENCE = 0;
    
    private final static int POSITION_$SOURCE_UPPER = 1;
    
    private final static int POSITION_$SOURCE_LOWER = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RestrictReferencePrecondition.Matcher.class);
    
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
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RestrictReferencePrecondition.Match> getAllMatches(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      return rawGetAllMatches(new Object[]{p$reference, p$source_upper, p$source_lower});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public RestrictReferencePrecondition.Match getOneArbitraryMatch(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      return rawGetOneArbitraryMatch(new Object[]{p$reference, p$source_upper, p$source_lower});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      return rawHasMatch(new Object[]{p$reference, p$source_upper, p$source_lower});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      return rawCountMatches(new Object[]{p$reference, p$source_upper, p$source_lower});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower, final IMatchProcessor<? super RestrictReferencePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$reference, p$source_upper, p$source_lower}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower, final IMatchProcessor<? super RestrictReferencePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$reference, p$source_upper, p$source_lower}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_upper the fixed value of pattern parameter $source_upper, or null if not bound.
     * @param p$source_lower the fixed value of pattern parameter $source_lower, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RestrictReferencePrecondition.Match newMatch(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower) {
      return RestrictReferencePrecondition.Match.newMatch(p$reference, p$source_upper, p$source_lower);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$reference(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$reference() {
      return rawAccumulateAllValuesOf$reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$reference(final RestrictReferencePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$reference(final Integer p$source_upper, final Integer p$source_lower) {
      return rawAccumulateAllValuesOf$reference(new Object[]{
      null, 
      p$source_upper, 
      p$source_lower
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOf$source_upper(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_$SOURCE_UPPER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOf$source_upper() {
      return rawAccumulateAllValuesOf$source_upper(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOf$source_upper(final RestrictReferencePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$source_upper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOf$source_upper(final TraceLink p$reference, final Integer p$source_lower) {
      return rawAccumulateAllValuesOf$source_upper(new Object[]{
      p$reference, 
      null, 
      p$source_lower
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOf$source_lower(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_$SOURCE_LOWER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOf$source_lower() {
      return rawAccumulateAllValuesOf$source_lower(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOf$source_lower(final RestrictReferencePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$source_lower(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOf$source_lower(final TraceLink p$reference, final Integer p$source_upper) {
      return rawAccumulateAllValuesOf$source_lower(new Object[]{
      p$reference, 
      p$source_upper, 
      null
      });
    }
    
    @Override
    protected RestrictReferencePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return RestrictReferencePrecondition.Match.newMatch((TraceLink) t.get(POSITION_$REFERENCE), (Integer) t.get(POSITION_$SOURCE_UPPER), (Integer) t.get(POSITION_$SOURCE_LOWER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RestrictReferencePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return RestrictReferencePrecondition.Match.newMatch((TraceLink) match[POSITION_$REFERENCE], (Integer) match[POSITION_$SOURCE_UPPER], (Integer) match[POSITION_$SOURCE_LOWER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RestrictReferencePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RestrictReferencePrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$REFERENCE], (Integer) match[POSITION_$SOURCE_UPPER], (Integer) match[POSITION_$SOURCE_LOWER]);
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
    public static IQuerySpecification<RestrictReferencePrecondition.Matcher> querySpecification() {
      return RestrictReferencePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<RestrictReferencePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$reference the value of pattern parameter $reference in the currently processed match
     * @param p$source_upper the value of pattern parameter $source_upper in the currently processed match
     * @param p$source_lower the value of pattern parameter $source_lower in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$reference, final Integer p$source_upper, final Integer p$source_lower);
    
    @Override
    public void process(final RestrictReferencePrecondition.Match match) {
      process(match.get$reference(), match.get$source_upper(), match.get$source_lower());
    }
  }
  
  private RestrictReferencePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RestrictReferencePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RestrictReferencePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return RestrictReferencePrecondition.Matcher.on(engine);
  }
  
  @Override
  public RestrictReferencePrecondition.Matcher instantiate() {
    return RestrictReferencePrecondition.Matcher.create();
  }
  
  @Override
  public RestrictReferencePrecondition.Match newEmptyMatch() {
    return RestrictReferencePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public RestrictReferencePrecondition.Match newMatch(final Object... parameters) {
    return RestrictReferencePrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.Integer) parameters[1], (java.lang.Integer) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition (visibility: PUBLIC, simpleName: RestrictReferencePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition (visibility: PUBLIC, simpleName: RestrictReferencePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RestrictReferencePrecondition INSTANCE = new RestrictReferencePrecondition();
    
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
    private final static RestrictReferencePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$reference = new PParameter("$reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$source_upper = new PParameter("$source_upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$source_lower = new PParameter("$source_lower", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$reference, parameter_p$source_upper, parameter_p$source_lower);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.RestrictReferencePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$reference","$source_upper","$source_lower");
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
          PVariable var_$reference = body.getOrCreateVariableByName("$reference");
          PVariable var_$source_upper = body.getOrCreateVariableByName("$source_upper");
          PVariable var_$source_lower = body.getOrCreateVariableByName("$source_lower");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$source_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$source_lower), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$reference, parameter_p$reference),
             new ExportedParameter(body, var_$source_upper, parameter_p$source_upper),
             new ExportedParameter(body, var_$source_lower, parameter_p$source_lower)
          ));
          // 	find get_reference_lower ($reference, $source_lower)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$reference, var_$source_lower), Get_reference_lower.instance().getInternalQueryRepresentation());
          // 	find get_reference_upper ($reference, $source_upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$reference, var_$source_upper), Get_reference_upper.instance().getInternalQueryRepresentation());
          // 		check ($source_upper != 1)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern RestrictReferencePrecondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("$source_upper");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer $source_upper = (Integer) provider.getValue("$source_upper");
                  return evaluateExpression_1_1($source_upper);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer $source_upper) {
    return (($source_upper).intValue() != 1);
  }
}
