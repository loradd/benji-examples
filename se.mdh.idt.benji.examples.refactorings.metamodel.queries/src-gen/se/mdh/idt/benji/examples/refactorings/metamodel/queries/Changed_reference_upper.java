/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Reference.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_upper;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Changed_reference_upper extends BaseGeneratedEMFQuerySpecification<Changed_reference_upper.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_upper pattern,
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
    private Reference fInitial_reference;
    
    private Reference fCurrent_reference;
    
    private Integer fInitial_upper;
    
    private Integer fCurrent_upper;
    
    private static List<String> parameterNames = makeImmutableList("initial_reference", "current_reference", "initial_upper", "current_upper");
    
    private Match(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      this.fInitial_reference = pInitial_reference;
      this.fCurrent_reference = pCurrent_reference;
      this.fInitial_upper = pInitial_upper;
      this.fCurrent_upper = pCurrent_upper;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_reference".equals(parameterName)) return this.fInitial_reference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      if ("initial_upper".equals(parameterName)) return this.fInitial_upper;
      if ("current_upper".equals(parameterName)) return this.fCurrent_upper;
      return null;
    }
    
    public Reference getInitial_reference() {
      return this.fInitial_reference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
    }
    
    public Integer getInitial_upper() {
      return this.fInitial_upper;
    }
    
    public Integer getCurrent_upper() {
      return this.fCurrent_upper;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_reference".equals(parameterName) ) {
          this.fInitial_reference = (Reference) newValue;
          return true;
      }
      if ("current_reference".equals(parameterName) ) {
          this.fCurrent_reference = (Reference) newValue;
          return true;
      }
      if ("initial_upper".equals(parameterName) ) {
          this.fInitial_upper = (Integer) newValue;
          return true;
      }
      if ("current_upper".equals(parameterName) ) {
          this.fCurrent_upper = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_reference(final Reference pInitial_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_reference = pInitial_reference;
    }
    
    public void setCurrent_reference(final Reference pCurrent_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_reference = pCurrent_reference;
    }
    
    public void setInitial_upper(final Integer pInitial_upper) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_upper = pInitial_upper;
    }
    
    public void setCurrent_upper(final Integer pCurrent_upper) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_upper = pCurrent_upper;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_upper";
    }
    
    @Override
    public List<String> parameterNames() {
      return Changed_reference_upper.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_reference, fCurrent_reference, fInitial_upper, fCurrent_upper};
    }
    
    @Override
    public Changed_reference_upper.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_reference, fCurrent_reference, fInitial_upper, fCurrent_upper) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_reference\"=" + prettyPrintValue(fInitial_reference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference) + ", ");
      result.append("\"initial_upper\"=" + prettyPrintValue(fInitial_upper) + ", ");
      result.append("\"current_upper\"=" + prettyPrintValue(fCurrent_upper));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_reference, fCurrent_reference, fInitial_upper, fCurrent_upper);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Changed_reference_upper.Match)) {
          Changed_reference_upper.Match other = (Changed_reference_upper.Match) obj;
          return Objects.equals(fInitial_reference, other.fInitial_reference) && Objects.equals(fCurrent_reference, other.fCurrent_reference) && Objects.equals(fInitial_upper, other.fInitial_upper) && Objects.equals(fCurrent_upper, other.fCurrent_upper);
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
    public Changed_reference_upper specification() {
      return Changed_reference_upper.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Changed_reference_upper.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Changed_reference_upper.Match newMutableMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return new Mutable(pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Changed_reference_upper.Match newMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return new Immutable(pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper);
    }
    
    private static final class Mutable extends Changed_reference_upper.Match {
      Mutable(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
        super(pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Changed_reference_upper.Match {
      Immutable(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
        super(pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_upper pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - upper - changed
   * pattern changed_reference_upper (initial_reference : Reference, current_reference : Reference, initial_upper : java Integer, current_upper : java Integer) {
   * 	find changed_structuralFeature_upper (initial_reference, current_reference, initial_upper, current_upper);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Changed_reference_upper
   * 
   */
  public static class Matcher extends BaseMatcher<Changed_reference_upper.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Changed_reference_upper.Matcher on(final ViatraQueryEngine engine) {
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
    public static Changed_reference_upper.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_REFERENCE = 0;
    
    private final static int POSITION_CURRENT_REFERENCE = 1;
    
    private final static int POSITION_INITIAL_UPPER = 2;
    
    private final static int POSITION_CURRENT_UPPER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Changed_reference_upper.Matcher.class);
    
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
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Changed_reference_upper.Match> getAllMatches(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawGetAllMatches(new Object[]{pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Changed_reference_upper.Match getOneArbitraryMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawHasMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawCountMatches(new Object[]{pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper, final IMatchProcessor<? super Changed_reference_upper.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper, final IMatchProcessor<? super Changed_reference_upper.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Changed_reference_upper.Match newMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return Changed_reference_upper.Match.newMatch(pInitial_reference, pCurrent_reference, pInitial_upper, pCurrent_upper);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfinitial_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_INITIAL_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference() {
      return rawAccumulateAllValuesOfinitial_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference(final Changed_reference_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference(final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawAccumulateAllValuesOfinitial_reference(new Object[]{
      null, 
      pCurrent_reference, 
      pInitial_upper, 
      pCurrent_upper
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfcurrent_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_CURRENT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference() {
      return rawAccumulateAllValuesOfcurrent_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final Changed_reference_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final Reference pInitial_reference, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pInitial_reference, 
      null, 
      pInitial_upper, 
      pCurrent_upper
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOfinitial_upper(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_INITIAL_UPPER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfinitial_upper() {
      return rawAccumulateAllValuesOfinitial_upper(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfinitial_upper(final Changed_reference_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_upper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfinitial_upper(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pCurrent_upper) {
      return rawAccumulateAllValuesOfinitial_upper(new Object[]{
      pInitial_reference, 
      pCurrent_reference, 
      null, 
      pCurrent_upper
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOfcurrent_upper(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_CURRENT_UPPER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfcurrent_upper() {
      return rawAccumulateAllValuesOfcurrent_upper(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfcurrent_upper(final Changed_reference_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_upper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfcurrent_upper(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper) {
      return rawAccumulateAllValuesOfcurrent_upper(new Object[]{
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_upper, 
      null
      });
    }
    
    @Override
    protected Changed_reference_upper.Match tupleToMatch(final Tuple t) {
      try {
          return Changed_reference_upper.Match.newMatch((Reference) t.get(POSITION_INITIAL_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE), (Integer) t.get(POSITION_INITIAL_UPPER), (Integer) t.get(POSITION_CURRENT_UPPER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_reference_upper.Match arrayToMatch(final Object[] match) {
      try {
          return Changed_reference_upper.Match.newMatch((Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Integer) match[POSITION_INITIAL_UPPER], (Integer) match[POSITION_CURRENT_UPPER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_reference_upper.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Changed_reference_upper.Match.newMutableMatch((Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Integer) match[POSITION_INITIAL_UPPER], (Integer) match[POSITION_CURRENT_UPPER]);
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
    public static IQuerySpecification<Changed_reference_upper.Matcher> querySpecification() {
      return Changed_reference_upper.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_upper pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Changed_reference_upper.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_reference the value of pattern parameter initial_reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * @param pInitial_upper the value of pattern parameter initial_upper in the currently processed match
     * @param pCurrent_upper the value of pattern parameter current_upper in the currently processed match
     * 
     */
    public abstract void process(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_upper, final Integer pCurrent_upper);
    
    @Override
    public void process(final Changed_reference_upper.Match match) {
      process(match.getInitial_reference(), match.getCurrent_reference(), match.getInitial_upper(), match.getCurrent_upper());
    }
  }
  
  private Changed_reference_upper() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Changed_reference_upper instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Changed_reference_upper.Matcher instantiate(final ViatraQueryEngine engine) {
    return Changed_reference_upper.Matcher.on(engine);
  }
  
  @Override
  public Changed_reference_upper.Matcher instantiate() {
    return Changed_reference_upper.Matcher.create();
  }
  
  @Override
  public Changed_reference_upper.Match newEmptyMatch() {
    return Changed_reference_upper.Match.newEmptyMatch();
  }
  
  @Override
  public Changed_reference_upper.Match newMatch(final Object... parameters) {
    return Changed_reference_upper.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (java.lang.Integer) parameters[2], (java.lang.Integer) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_upper (visibility: PUBLIC, simpleName: Changed_reference_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_upper (visibility: PUBLIC, simpleName: Changed_reference_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Changed_reference_upper INSTANCE = new Changed_reference_upper();
    
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
    private final static Changed_reference_upper.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_reference = new PParameter("initial_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_upper = new PParameter("initial_upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_upper = new PParameter("current_upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_reference, parameter_pCurrent_reference, parameter_pInitial_upper, parameter_pCurrent_upper);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_upper";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_reference","current_reference","initial_upper","current_upper");
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
          PVariable var_initial_reference = body.getOrCreateVariableByName("initial_reference");
          PVariable var_current_reference = body.getOrCreateVariableByName("current_reference");
          PVariable var_initial_upper = body.getOrCreateVariableByName("initial_upper");
          PVariable var_current_upper = body.getOrCreateVariableByName("current_upper");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_initial_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_current_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_reference, parameter_pInitial_reference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference),
             new ExportedParameter(body, var_initial_upper, parameter_pInitial_upper),
             new ExportedParameter(body, var_current_upper, parameter_pCurrent_upper)
          ));
          // 	find changed_structuralFeature_upper (initial_reference, current_reference, initial_upper, current_upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_reference, var_current_reference, var_initial_upper, var_current_upper), Changed_structuralFeature_upper.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
