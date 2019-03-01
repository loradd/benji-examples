/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/ReferenceQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
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
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // reference - opposite - current
 *         pattern current_reference_opposite (reference : Trace, opposite : Trace) {
 *         	find current_reference (reference, current_reference);
 *         	find current_reference (opposite, current_opposite);
 *         	Reference.opposite (current_reference, current_opposite);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Current_reference_opposite extends BaseGeneratedEMFQuerySpecification<Current_reference_opposite.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_reference_opposite pattern,
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
    private Trace fReference;
    
    private Trace fOpposite;
    
    private static List<String> parameterNames = makeImmutableList("reference", "opposite");
    
    private Match(final Trace pReference, final Trace pOpposite) {
      this.fReference = pReference;
      this.fOpposite = pOpposite;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("opposite".equals(parameterName)) return this.fOpposite;
      return null;
    }
    
    public Trace getReference() {
      return this.fReference;
    }
    
    public Trace getOpposite() {
      return this.fOpposite;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("reference".equals(parameterName) ) {
          this.fReference = (Trace) newValue;
          return true;
      }
      if ("opposite".equals(parameterName) ) {
          this.fOpposite = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setReference(final Trace pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    public void setOpposite(final Trace pOpposite) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOpposite = pOpposite;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_reference_opposite";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_reference_opposite.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fOpposite};
    }
    
    @Override
    public Current_reference_opposite.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fOpposite) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"opposite\"=" + prettyPrintValue(fOpposite));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fReference, fOpposite);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_reference_opposite.Match)) {
          Current_reference_opposite.Match other = (Current_reference_opposite.Match) obj;
          return Objects.equals(fReference, other.fReference) && Objects.equals(fOpposite, other.fOpposite);
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
    public Current_reference_opposite specification() {
      return Current_reference_opposite.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_reference_opposite.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_reference_opposite.Match newMutableMatch(final Trace pReference, final Trace pOpposite) {
      return new Mutable(pReference, pOpposite);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_reference_opposite.Match newMatch(final Trace pReference, final Trace pOpposite) {
      return new Immutable(pReference, pOpposite);
    }
    
    private static final class Mutable extends Current_reference_opposite.Match {
      Mutable(final Trace pReference, final Trace pOpposite) {
        super(pReference, pOpposite);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_reference_opposite.Match {
      Immutable(final Trace pReference, final Trace pOpposite) {
        super(pReference, pOpposite);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_reference_opposite pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - opposite - current
   * pattern current_reference_opposite (reference : Trace, opposite : Trace) {
   * 	find current_reference (reference, current_reference);
   * 	find current_reference (opposite, current_opposite);
   * 	Reference.opposite (current_reference, current_opposite);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_reference_opposite
   * 
   */
  public static class Matcher extends BaseMatcher<Current_reference_opposite.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_reference_opposite.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_reference_opposite.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_REFERENCE = 0;
    
    private static final int POSITION_OPPOSITE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_reference_opposite.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_reference_opposite.Match> getAllMatches(final Trace pReference, final Trace pOpposite) {
      return rawStreamAllMatches(new Object[]{pReference, pOpposite}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Current_reference_opposite.Match> streamAllMatches(final Trace pReference, final Trace pOpposite) {
      return rawStreamAllMatches(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Current_reference_opposite.Match> getOneArbitraryMatch(final Trace pReference, final Trace pOpposite) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pReference, final Trace pOpposite) {
      return rawHasMatch(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pReference, final Trace pOpposite) {
      return rawCountMatches(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pReference, final Trace pOpposite, final Consumer<? super Current_reference_opposite.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pOpposite}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pReference, final Trace pOpposite, final Consumer<? super Current_reference_opposite.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pOpposite}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_reference_opposite.Match newMatch(final Trace pReference, final Trace pOpposite) {
      return Current_reference_opposite.Match.newMatch(pReference, pOpposite);
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfreference(final Object[] parameters) {
      return rawStreamAllValues(POSITION_REFERENCE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference() {
      return rawStreamAllValuesOfreference(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfreference() {
      return rawStreamAllValuesOfreference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfreference(final Current_reference_opposite.Match partialMatch) {
      return rawStreamAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfreference(final Trace pOpposite) {
      return rawStreamAllValuesOfreference(new Object[]{null, pOpposite});
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference(final Current_reference_opposite.Match partialMatch) {
      return rawStreamAllValuesOfreference(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference(final Trace pOpposite) {
      return rawStreamAllValuesOfreference(new Object[]{null, pOpposite}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfopposite(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OPPOSITE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfopposite() {
      return rawStreamAllValuesOfopposite(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfopposite() {
      return rawStreamAllValuesOfopposite(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfopposite(final Current_reference_opposite.Match partialMatch) {
      return rawStreamAllValuesOfopposite(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfopposite(final Trace pReference) {
      return rawStreamAllValuesOfopposite(new Object[]{pReference, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfopposite(final Current_reference_opposite.Match partialMatch) {
      return rawStreamAllValuesOfopposite(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfopposite(final Trace pReference) {
      return rawStreamAllValuesOfopposite(new Object[]{pReference, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Current_reference_opposite.Match tupleToMatch(final Tuple t) {
      try {
          return Current_reference_opposite.Match.newMatch((Trace) t.get(POSITION_REFERENCE), (Trace) t.get(POSITION_OPPOSITE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_reference_opposite.Match arrayToMatch(final Object[] match) {
      try {
          return Current_reference_opposite.Match.newMatch((Trace) match[POSITION_REFERENCE], (Trace) match[POSITION_OPPOSITE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_reference_opposite.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_reference_opposite.Match.newMutableMatch((Trace) match[POSITION_REFERENCE], (Trace) match[POSITION_OPPOSITE]);
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
    public static IQuerySpecification<Current_reference_opposite.Matcher> querySpecification() {
      return Current_reference_opposite.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_reference_opposite pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Current_reference_opposite.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pOpposite the value of pattern parameter opposite in the currently processed match
     * 
     */
    public abstract void accept(final Trace pReference, final Trace pOpposite);
    
    @Override
    public void accept(final Current_reference_opposite.Match match) {
      accept(match.getReference(), match.getOpposite());
    }
  }
  
  private Current_reference_opposite() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_reference_opposite instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_reference_opposite.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_reference_opposite.Matcher.on(engine);
  }
  
  @Override
  public Current_reference_opposite.Matcher instantiate() {
    return Current_reference_opposite.Matcher.create();
  }
  
  @Override
  public Current_reference_opposite.Match newEmptyMatch() {
    return Current_reference_opposite.Match.newEmptyMatch();
  }
  
  @Override
  public Current_reference_opposite.Match newMatch(final Object... parameters) {
    return Current_reference_opposite.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference_opposite (visibility: PUBLIC, simpleName: Current_reference_opposite, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference_opposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference_opposite (visibility: PUBLIC, simpleName: Current_reference_opposite, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_reference_opposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Current_reference_opposite INSTANCE = new Current_reference_opposite();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final Current_reference_opposite.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_reference = new PParameter("reference", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_opposite = new PParameter("opposite", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_reference, parameter_opposite);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_reference_opposite";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","opposite");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_reference = body.getOrCreateVariableByName("reference");
          PVariable var_opposite = body.getOrCreateVariableByName("opposite");
          PVariable var_current_reference = body.getOrCreateVariableByName("current_reference");
          PVariable var_current_opposite = body.getOrCreateVariableByName("current_opposite");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_opposite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_reference),
             new ExportedParameter(body, var_opposite, parameter_opposite)
          ));
          // 	find current_reference (reference, current_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_current_reference), Current_reference.instance().getInternalQueryRepresentation());
          // 	find current_reference (opposite, current_opposite)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_opposite, var_current_opposite), Current_reference.instance().getInternalQueryRepresentation());
          // 	Reference.opposite (current_reference, current_opposite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "Reference")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "Reference", "opposite")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "Reference")));
          new Equality(body, var__virtual_0_, var_current_opposite);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
