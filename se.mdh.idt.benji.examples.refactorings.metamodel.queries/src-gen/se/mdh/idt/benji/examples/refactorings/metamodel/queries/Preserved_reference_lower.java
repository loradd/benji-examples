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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature_lower;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Preserved_reference_lower extends BaseGeneratedEMFQuerySpecification<Preserved_reference_lower.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_reference_lower pattern,
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
    
    private Integer fInitial_lower;
    
    private Integer fCurrent_lower;
    
    private static List<String> parameterNames = makeImmutableList("initial_reference", "current_reference", "initial_lower", "current_lower");
    
    private Match(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      this.fInitial_reference = pInitial_reference;
      this.fCurrent_reference = pCurrent_reference;
      this.fInitial_lower = pInitial_lower;
      this.fCurrent_lower = pCurrent_lower;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_reference".equals(parameterName)) return this.fInitial_reference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      if ("initial_lower".equals(parameterName)) return this.fInitial_lower;
      if ("current_lower".equals(parameterName)) return this.fCurrent_lower;
      return null;
    }
    
    public Reference getInitial_reference() {
      return this.fInitial_reference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
    }
    
    public Integer getInitial_lower() {
      return this.fInitial_lower;
    }
    
    public Integer getCurrent_lower() {
      return this.fCurrent_lower;
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
      if ("initial_lower".equals(parameterName) ) {
          this.fInitial_lower = (Integer) newValue;
          return true;
      }
      if ("current_lower".equals(parameterName) ) {
          this.fCurrent_lower = (Integer) newValue;
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
    
    public void setInitial_lower(final Integer pInitial_lower) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_lower = pInitial_lower;
    }
    
    public void setCurrent_lower(final Integer pCurrent_lower) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_lower = pCurrent_lower;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_reference_lower";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved_reference_lower.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_reference, fCurrent_reference, fInitial_lower, fCurrent_lower};
    }
    
    @Override
    public Preserved_reference_lower.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_reference, fCurrent_reference, fInitial_lower, fCurrent_lower) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_reference\"=" + prettyPrintValue(fInitial_reference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference) + ", ");
      result.append("\"initial_lower\"=" + prettyPrintValue(fInitial_lower) + ", ");
      result.append("\"current_lower\"=" + prettyPrintValue(fCurrent_lower));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_reference, fCurrent_reference, fInitial_lower, fCurrent_lower);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved_reference_lower.Match)) {
          Preserved_reference_lower.Match other = (Preserved_reference_lower.Match) obj;
          return Objects.equals(fInitial_reference, other.fInitial_reference) && Objects.equals(fCurrent_reference, other.fCurrent_reference) && Objects.equals(fInitial_lower, other.fInitial_lower) && Objects.equals(fCurrent_lower, other.fCurrent_lower);
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
    public Preserved_reference_lower specification() {
      return Preserved_reference_lower.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved_reference_lower.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved_reference_lower.Match newMutableMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return new Mutable(pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved_reference_lower.Match newMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return new Immutable(pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower);
    }
    
    private static final class Mutable extends Preserved_reference_lower.Match {
      Mutable(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
        super(pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved_reference_lower.Match {
      Immutable(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
        super(pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_reference_lower pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - lower - preserved
   * pattern preserved_reference_lower (initial_reference : Reference, current_reference : Reference, initial_lower : java Integer, current_lower : java Integer) {
   * 	find preserved_structuralFeature_lower (initial_reference, current_reference, initial_lower, current_lower); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Preserved_reference_lower
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved_reference_lower.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved_reference_lower.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved_reference_lower.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_REFERENCE = 0;
    
    private final static int POSITION_CURRENT_REFERENCE = 1;
    
    private final static int POSITION_INITIAL_LOWER = 2;
    
    private final static int POSITION_CURRENT_LOWER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved_reference_lower.Matcher.class);
    
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
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved_reference_lower.Match> getAllMatches(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return rawGetAllMatches(new Object[]{pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved_reference_lower.Match getOneArbitraryMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return rawHasMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return rawCountMatches(new Object[]{pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower, final IMatchProcessor<? super Preserved_reference_lower.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower, final IMatchProcessor<? super Preserved_reference_lower.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_lower the fixed value of pattern parameter initial_lower, or null if not bound.
     * @param pCurrent_lower the fixed value of pattern parameter current_lower, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved_reference_lower.Match newMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return Preserved_reference_lower.Match.newMatch(pInitial_reference, pCurrent_reference, pInitial_lower, pCurrent_lower);
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
    public Set<Reference> getAllValuesOfinitial_reference(final Preserved_reference_lower.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference(final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return rawAccumulateAllValuesOfinitial_reference(new Object[]{
      null, 
      pCurrent_reference, 
      pInitial_lower, 
      pCurrent_lower
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
    public Set<Reference> getAllValuesOfcurrent_reference(final Preserved_reference_lower.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final Reference pInitial_reference, final Integer pInitial_lower, final Integer pCurrent_lower) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pInitial_reference, 
      null, 
      pInitial_lower, 
      pCurrent_lower
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOfinitial_lower(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_INITIAL_LOWER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfinitial_lower() {
      return rawAccumulateAllValuesOfinitial_lower(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfinitial_lower(final Preserved_reference_lower.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_lower(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfinitial_lower(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pCurrent_lower) {
      return rawAccumulateAllValuesOfinitial_lower(new Object[]{
      pInitial_reference, 
      pCurrent_reference, 
      null, 
      pCurrent_lower
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOfcurrent_lower(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_CURRENT_LOWER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfcurrent_lower() {
      return rawAccumulateAllValuesOfcurrent_lower(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfcurrent_lower(final Preserved_reference_lower.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_lower(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_lower.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfcurrent_lower(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower) {
      return rawAccumulateAllValuesOfcurrent_lower(new Object[]{
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_lower, 
      null
      });
    }
    
    @Override
    protected Preserved_reference_lower.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved_reference_lower.Match.newMatch((Reference) t.get(POSITION_INITIAL_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE), (Integer) t.get(POSITION_INITIAL_LOWER), (Integer) t.get(POSITION_CURRENT_LOWER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_reference_lower.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved_reference_lower.Match.newMatch((Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Integer) match[POSITION_INITIAL_LOWER], (Integer) match[POSITION_CURRENT_LOWER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_reference_lower.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved_reference_lower.Match.newMutableMatch((Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Integer) match[POSITION_INITIAL_LOWER], (Integer) match[POSITION_CURRENT_LOWER]);
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
    public static IQuerySpecification<Preserved_reference_lower.Matcher> querySpecification() {
      return Preserved_reference_lower.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_reference_lower pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Preserved_reference_lower.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_reference the value of pattern parameter initial_reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * @param pInitial_lower the value of pattern parameter initial_lower in the currently processed match
     * @param pCurrent_lower the value of pattern parameter current_lower in the currently processed match
     * 
     */
    public abstract void process(final Reference pInitial_reference, final Reference pCurrent_reference, final Integer pInitial_lower, final Integer pCurrent_lower);
    
    @Override
    public void process(final Preserved_reference_lower.Match match) {
      process(match.getInitial_reference(), match.getCurrent_reference(), match.getInitial_lower(), match.getCurrent_lower());
    }
  }
  
  private Preserved_reference_lower() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved_reference_lower instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved_reference_lower.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved_reference_lower.Matcher.on(engine);
  }
  
  @Override
  public Preserved_reference_lower.Matcher instantiate() {
    return Preserved_reference_lower.Matcher.create();
  }
  
  @Override
  public Preserved_reference_lower.Match newEmptyMatch() {
    return Preserved_reference_lower.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved_reference_lower.Match newMatch(final Object... parameters) {
    return Preserved_reference_lower.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (java.lang.Integer) parameters[2], (java.lang.Integer) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_lower (visibility: PUBLIC, simpleName: Preserved_reference_lower, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_lower, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_lower (visibility: PUBLIC, simpleName: Preserved_reference_lower, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference_lower, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved_reference_lower INSTANCE = new Preserved_reference_lower();
    
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
    private final static Preserved_reference_lower.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_reference = new PParameter("initial_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_lower = new PParameter("initial_lower", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_lower = new PParameter("current_lower", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_reference, parameter_pCurrent_reference, parameter_pInitial_lower, parameter_pCurrent_lower);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_reference_lower";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_reference","current_reference","initial_lower","current_lower");
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
          PVariable var_initial_lower = body.getOrCreateVariableByName("initial_lower");
          PVariable var_current_lower = body.getOrCreateVariableByName("current_lower");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_initial_lower), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_current_lower), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_reference, parameter_pInitial_reference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference),
             new ExportedParameter(body, var_initial_lower, parameter_pInitial_lower),
             new ExportedParameter(body, var_current_lower, parameter_pCurrent_lower)
          ));
          // 	find preserved_structuralFeature_lower (initial_reference, current_reference, initial_lower, current_lower)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_reference, var_current_reference, var_initial_lower, var_current_lower), Preserved_structuralFeature_lower.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
