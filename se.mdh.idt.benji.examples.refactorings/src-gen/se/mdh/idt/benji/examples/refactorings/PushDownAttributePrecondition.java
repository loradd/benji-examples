/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

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
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
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
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_super;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // CDACA22 - Push Down Attribute - Precondition
 *         pattern PushDownAttributePrecondition ($class : Trace, $super : Trace, $attribute : Trace) {
 *         	find preserved_class ($class);
 *         	find preserved_class ($super);
 *         	find preserved_attribute ($attribute);
 *         	find preserved_class_super ($class, $super);
 *         	find preserved_class_attribute ($super, $attribute);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class PushDownAttributePrecondition extends BaseGeneratedEMFQuerySpecification<PushDownAttributePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition pattern,
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
    private Trace f$class;
    
    private Trace f$super;
    
    private Trace f$attribute;
    
    private static List<String> parameterNames = makeImmutableList("$class", "$super", "$attribute");
    
    private Match(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      this.f$class = p$class;
      this.f$super = p$super;
      this.f$attribute = p$attribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$super".equals(parameterName)) return this.f$super;
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      return null;
    }
    
    public Trace get$class() {
      return this.f$class;
    }
    
    public Trace get$super() {
      return this.f$super;
    }
    
    public Trace get$attribute() {
      return this.f$attribute;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$class".equals(parameterName) ) {
          this.f$class = (Trace) newValue;
          return true;
      }
      if ("$super".equals(parameterName) ) {
          this.f$super = (Trace) newValue;
          return true;
      }
      if ("$attribute".equals(parameterName) ) {
          this.f$attribute = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void set$class(final Trace p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    public void set$super(final Trace p$super) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$super = p$super;
    }
    
    public void set$attribute(final Trace p$attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute = p$attribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return PushDownAttributePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$class, f$super, f$attribute};
    }
    
    @Override
    public PushDownAttributePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$class, f$super, f$attribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$super\"=" + prettyPrintValue(f$super) + ", ");
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(f$class, f$super, f$attribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PushDownAttributePrecondition.Match)) {
          PushDownAttributePrecondition.Match other = (PushDownAttributePrecondition.Match) obj;
          return Objects.equals(f$class, other.f$class) && Objects.equals(f$super, other.f$super) && Objects.equals(f$attribute, other.f$attribute);
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
    public PushDownAttributePrecondition specification() {
      return PushDownAttributePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PushDownAttributePrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PushDownAttributePrecondition.Match newMutableMatch(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return new Mutable(p$class, p$super, p$attribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PushDownAttributePrecondition.Match newMatch(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return new Immutable(p$class, p$super, p$attribute);
    }
    
    private static final class Mutable extends PushDownAttributePrecondition.Match {
      Mutable(final Trace p$class, final Trace p$super, final Trace p$attribute) {
        super(p$class, p$super, p$attribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PushDownAttributePrecondition.Match {
      Immutable(final Trace p$class, final Trace p$super, final Trace p$attribute) {
        super(p$class, p$super, p$attribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CDACA22 - Push Down Attribute - Precondition
   * pattern PushDownAttributePrecondition ($class : Trace, $super : Trace, $attribute : Trace) {
   * 	find preserved_class ($class);
   * 	find preserved_class ($super);
   * 	find preserved_attribute ($attribute);
   * 	find preserved_class_super ($class, $super);
   * 	find preserved_class_attribute ($super, $attribute);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see PushDownAttributePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<PushDownAttributePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PushDownAttributePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static PushDownAttributePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_$CLASS = 0;
    
    private static final int POSITION_$SUPER = 1;
    
    private static final int POSITION_$ATTRIBUTE = 2;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PushDownAttributePrecondition.Matcher.class);
    
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
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PushDownAttributePrecondition.Match> getAllMatches(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return rawStreamAllMatches(new Object[]{p$class, p$super, p$attribute}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<PushDownAttributePrecondition.Match> streamAllMatches(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return rawStreamAllMatches(new Object[]{p$class, p$super, p$attribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<PushDownAttributePrecondition.Match> getOneArbitraryMatch(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return rawGetOneArbitraryMatch(new Object[]{p$class, p$super, p$attribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return rawHasMatch(new Object[]{p$class, p$super, p$attribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return rawCountMatches(new Object[]{p$class, p$super, p$attribute});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace p$class, final Trace p$super, final Trace p$attribute, final Consumer<? super PushDownAttributePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$class, p$super, p$attribute}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace p$class, final Trace p$super, final Trace p$attribute, final Consumer<? super PushDownAttributePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$class, p$super, p$attribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PushDownAttributePrecondition.Match newMatch(final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return PushDownAttributePrecondition.Match.newMatch(p$class, p$super, p$attribute);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$class(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$CLASS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$class() {
      return rawStreamAllValuesOf$class(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$class() {
      return rawStreamAllValuesOf$class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$class(final PushDownAttributePrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$class(final Trace p$super, final Trace p$attribute) {
      return rawStreamAllValuesOf$class(new Object[]{null, p$super, p$attribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$class(final PushDownAttributePrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$class(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$class(final Trace p$super, final Trace p$attribute) {
      return rawStreamAllValuesOf$class(new Object[]{null, p$super, p$attribute}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$super(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$SUPER, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$super() {
      return rawStreamAllValuesOf$super(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$super() {
      return rawStreamAllValuesOf$super(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$super(final PushDownAttributePrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$super(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$super(final Trace p$class, final Trace p$attribute) {
      return rawStreamAllValuesOf$super(new Object[]{p$class, null, p$attribute});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$super(final PushDownAttributePrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$super(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$super(final Trace p$class, final Trace p$attribute) {
      return rawStreamAllValuesOf$super(new Object[]{p$class, null, p$attribute}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$attribute(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$ATTRIBUTE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$attribute() {
      return rawStreamAllValuesOf$attribute(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$attribute() {
      return rawStreamAllValuesOf$attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$attribute(final PushDownAttributePrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$attribute(final Trace p$class, final Trace p$super) {
      return rawStreamAllValuesOf$attribute(new Object[]{p$class, p$super, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$attribute(final PushDownAttributePrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$attribute(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$attribute(final Trace p$class, final Trace p$super) {
      return rawStreamAllValuesOf$attribute(new Object[]{p$class, p$super, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected PushDownAttributePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return PushDownAttributePrecondition.Match.newMatch((Trace) t.get(POSITION_$CLASS), (Trace) t.get(POSITION_$SUPER), (Trace) t.get(POSITION_$ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownAttributePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return PushDownAttributePrecondition.Match.newMatch((Trace) match[POSITION_$CLASS], (Trace) match[POSITION_$SUPER], (Trace) match[POSITION_$ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownAttributePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PushDownAttributePrecondition.Match.newMutableMatch((Trace) match[POSITION_$CLASS], (Trace) match[POSITION_$SUPER], (Trace) match[POSITION_$ATTRIBUTE]);
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
    public static IQuerySpecification<PushDownAttributePrecondition.Matcher> querySpecification() {
      return PushDownAttributePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<PushDownAttributePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$super the value of pattern parameter $super in the currently processed match
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * 
     */
    public abstract void accept(final Trace p$class, final Trace p$super, final Trace p$attribute);
    
    @Override
    public void accept(final PushDownAttributePrecondition.Match match) {
      accept(match.get$class(), match.get$super(), match.get$attribute());
    }
  }
  
  private PushDownAttributePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PushDownAttributePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PushDownAttributePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return PushDownAttributePrecondition.Matcher.on(engine);
  }
  
  @Override
  public PushDownAttributePrecondition.Matcher instantiate() {
    return PushDownAttributePrecondition.Matcher.create();
  }
  
  @Override
  public PushDownAttributePrecondition.Match newEmptyMatch() {
    return PushDownAttributePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public PushDownAttributePrecondition.Match newMatch(final Object... parameters) {
    return PushDownAttributePrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition (visibility: PUBLIC, simpleName: PushDownAttributePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition (visibility: PUBLIC, simpleName: PushDownAttributePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final PushDownAttributePrecondition INSTANCE = new PushDownAttributePrecondition();
    
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
    private static final PushDownAttributePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_$class = new PParameter("$class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_$super = new PParameter("$super", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_$class, parameter_$super, parameter_$attribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$class","$super","$attribute");
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
          PVariable var_$class = body.getOrCreateVariableByName("$class");
          PVariable var_$super = body.getOrCreateVariableByName("$super");
          PVariable var_$attribute = body.getOrCreateVariableByName("$attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$super), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$class, parameter_$class),
             new ExportedParameter(body, var_$super, parameter_$super),
             new ExportedParameter(body, var_$attribute, parameter_$attribute)
          ));
          // 	find preserved_class ($class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class), Preserved_class.instance().getInternalQueryRepresentation());
          // 	find preserved_class ($super)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$super), Preserved_class.instance().getInternalQueryRepresentation());
          // 	find preserved_attribute ($attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$attribute), Preserved_attribute.instance().getInternalQueryRepresentation());
          // 	find preserved_class_super ($class, $super)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$super), Preserved_class_super.instance().getInternalQueryRepresentation());
          // 	find preserved_class_attribute ($super, $attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$super, var_$attribute), Preserved_class_attribute.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
