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
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_containment;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Changed_reference_containment extends BaseGeneratedEMFQuerySpecification<Changed_reference_containment.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_containment pattern,
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
    
    private Boolean fInitial_containment;
    
    private Boolean fCurrent_containment;
    
    private static List<String> parameterNames = makeImmutableList("initial_reference", "current_reference", "initial_containment", "current_containment");
    
    private Match(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      this.fInitial_reference = pInitial_reference;
      this.fCurrent_reference = pCurrent_reference;
      this.fInitial_containment = pInitial_containment;
      this.fCurrent_containment = pCurrent_containment;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_reference".equals(parameterName)) return this.fInitial_reference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      if ("initial_containment".equals(parameterName)) return this.fInitial_containment;
      if ("current_containment".equals(parameterName)) return this.fCurrent_containment;
      return null;
    }
    
    public Reference getInitial_reference() {
      return this.fInitial_reference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
    }
    
    public Boolean getInitial_containment() {
      return this.fInitial_containment;
    }
    
    public Boolean getCurrent_containment() {
      return this.fCurrent_containment;
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
      if ("initial_containment".equals(parameterName) ) {
          this.fInitial_containment = (Boolean) newValue;
          return true;
      }
      if ("current_containment".equals(parameterName) ) {
          this.fCurrent_containment = (Boolean) newValue;
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
    
    public void setInitial_containment(final Boolean pInitial_containment) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_containment = pInitial_containment;
    }
    
    public void setCurrent_containment(final Boolean pCurrent_containment) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_containment = pCurrent_containment;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_containment";
    }
    
    @Override
    public List<String> parameterNames() {
      return Changed_reference_containment.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_reference, fCurrent_reference, fInitial_containment, fCurrent_containment};
    }
    
    @Override
    public Changed_reference_containment.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_reference, fCurrent_reference, fInitial_containment, fCurrent_containment) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_reference\"=" + prettyPrintValue(fInitial_reference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference) + ", ");
      result.append("\"initial_containment\"=" + prettyPrintValue(fInitial_containment) + ", ");
      result.append("\"current_containment\"=" + prettyPrintValue(fCurrent_containment));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_reference, fCurrent_reference, fInitial_containment, fCurrent_containment);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Changed_reference_containment.Match)) {
          Changed_reference_containment.Match other = (Changed_reference_containment.Match) obj;
          return Objects.equals(fInitial_reference, other.fInitial_reference) && Objects.equals(fCurrent_reference, other.fCurrent_reference) && Objects.equals(fInitial_containment, other.fInitial_containment) && Objects.equals(fCurrent_containment, other.fCurrent_containment);
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
    public Changed_reference_containment specification() {
      return Changed_reference_containment.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Changed_reference_containment.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Changed_reference_containment.Match newMutableMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return new Mutable(pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Changed_reference_containment.Match newMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return new Immutable(pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment);
    }
    
    private static final class Mutable extends Changed_reference_containment.Match {
      Mutable(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
        super(pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Changed_reference_containment.Match {
      Immutable(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
        super(pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_containment pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - containment - changed
   * pattern changed_reference_containment (initial_reference : Reference, current_reference : Reference, initial_containment : java Boolean, current_containment : java Boolean) {
   * 	find preserved_reference (initial_reference, current_reference); 
   * 	find reference_containment (initial_reference, initial_containment); 
   * 	find reference_containment (current_reference, current_containment); 
   * 	check (initial_containment != current_containment); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Changed_reference_containment
   * 
   */
  public static class Matcher extends BaseMatcher<Changed_reference_containment.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Changed_reference_containment.Matcher on(final ViatraQueryEngine engine) {
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
    public static Changed_reference_containment.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_REFERENCE = 0;
    
    private final static int POSITION_CURRENT_REFERENCE = 1;
    
    private final static int POSITION_INITIAL_CONTAINMENT = 2;
    
    private final static int POSITION_CURRENT_CONTAINMENT = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Changed_reference_containment.Matcher.class);
    
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
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Changed_reference_containment.Match> getAllMatches(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return rawGetAllMatches(new Object[]{pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Changed_reference_containment.Match getOneArbitraryMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return rawHasMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return rawCountMatches(new Object[]{pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment, final IMatchProcessor<? super Changed_reference_containment.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment, final IMatchProcessor<? super Changed_reference_containment.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_containment the fixed value of pattern parameter initial_containment, or null if not bound.
     * @param pCurrent_containment the fixed value of pattern parameter current_containment, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Changed_reference_containment.Match newMatch(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return Changed_reference_containment.Match.newMatch(pInitial_reference, pCurrent_reference, pInitial_containment, pCurrent_containment);
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
    public Set<Reference> getAllValuesOfinitial_reference(final Changed_reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference(final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return rawAccumulateAllValuesOfinitial_reference(new Object[]{
      null, 
      pCurrent_reference, 
      pInitial_containment, 
      pCurrent_containment
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
    public Set<Reference> getAllValuesOfcurrent_reference(final Changed_reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final Reference pInitial_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pInitial_reference, 
      null, 
      pInitial_containment, 
      pCurrent_containment
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Boolean> rawAccumulateAllValuesOfinitial_containment(final Object[] parameters) {
      Set<Boolean> results = new HashSet<Boolean>();
      rawAccumulateAllValues(POSITION_INITIAL_CONTAINMENT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfinitial_containment() {
      return rawAccumulateAllValuesOfinitial_containment(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfinitial_containment(final Changed_reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_containment(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfinitial_containment(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pCurrent_containment) {
      return rawAccumulateAllValuesOfinitial_containment(new Object[]{
      pInitial_reference, 
      pCurrent_reference, 
      null, 
      pCurrent_containment
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Boolean> rawAccumulateAllValuesOfcurrent_containment(final Object[] parameters) {
      Set<Boolean> results = new HashSet<Boolean>();
      rawAccumulateAllValues(POSITION_CURRENT_CONTAINMENT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcurrent_containment() {
      return rawAccumulateAllValuesOfcurrent_containment(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcurrent_containment(final Changed_reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_containment(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcurrent_containment(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment) {
      return rawAccumulateAllValuesOfcurrent_containment(new Object[]{
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_containment, 
      null
      });
    }
    
    @Override
    protected Changed_reference_containment.Match tupleToMatch(final Tuple t) {
      try {
          return Changed_reference_containment.Match.newMatch((Reference) t.get(POSITION_INITIAL_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE), (Boolean) t.get(POSITION_INITIAL_CONTAINMENT), (Boolean) t.get(POSITION_CURRENT_CONTAINMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_reference_containment.Match arrayToMatch(final Object[] match) {
      try {
          return Changed_reference_containment.Match.newMatch((Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Boolean) match[POSITION_INITIAL_CONTAINMENT], (Boolean) match[POSITION_CURRENT_CONTAINMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_reference_containment.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Changed_reference_containment.Match.newMutableMatch((Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Boolean) match[POSITION_INITIAL_CONTAINMENT], (Boolean) match[POSITION_CURRENT_CONTAINMENT]);
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
    public static IQuerySpecification<Changed_reference_containment.Matcher> querySpecification() {
      return Changed_reference_containment.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_containment pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Changed_reference_containment.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_reference the value of pattern parameter initial_reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * @param pInitial_containment the value of pattern parameter initial_containment in the currently processed match
     * @param pCurrent_containment the value of pattern parameter current_containment in the currently processed match
     * 
     */
    public abstract void process(final Reference pInitial_reference, final Reference pCurrent_reference, final Boolean pInitial_containment, final Boolean pCurrent_containment);
    
    @Override
    public void process(final Changed_reference_containment.Match match) {
      process(match.getInitial_reference(), match.getCurrent_reference(), match.getInitial_containment(), match.getCurrent_containment());
    }
  }
  
  private Changed_reference_containment() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Changed_reference_containment instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Changed_reference_containment.Matcher instantiate(final ViatraQueryEngine engine) {
    return Changed_reference_containment.Matcher.on(engine);
  }
  
  @Override
  public Changed_reference_containment.Matcher instantiate() {
    return Changed_reference_containment.Matcher.create();
  }
  
  @Override
  public Changed_reference_containment.Match newEmptyMatch() {
    return Changed_reference_containment.Match.newEmptyMatch();
  }
  
  @Override
  public Changed_reference_containment.Match newMatch(final Object... parameters) {
    return Changed_reference_containment.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (java.lang.Boolean) parameters[2], (java.lang.Boolean) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_containment (visibility: PUBLIC, simpleName: Changed_reference_containment, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_containment, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_containment (visibility: PUBLIC, simpleName: Changed_reference_containment, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_containment, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Changed_reference_containment INSTANCE = new Changed_reference_containment();
    
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
    private final static Changed_reference_containment.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_reference = new PParameter("initial_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_containment = new PParameter("initial_containment", "java.lang.Boolean", new JavaTransitiveInstancesKey(java.lang.Boolean.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_containment = new PParameter("current_containment", "java.lang.Boolean", new JavaTransitiveInstancesKey(java.lang.Boolean.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_reference, parameter_pCurrent_reference, parameter_pInitial_containment, parameter_pCurrent_containment);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_reference_containment";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_reference","current_reference","initial_containment","current_containment");
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
          PVariable var_initial_containment = body.getOrCreateVariableByName("initial_containment");
          PVariable var_current_containment = body.getOrCreateVariableByName("current_containment");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_initial_containment), new JavaTransitiveInstancesKey(java.lang.Boolean.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_current_containment), new JavaTransitiveInstancesKey(java.lang.Boolean.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_reference, parameter_pInitial_reference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference),
             new ExportedParameter(body, var_initial_containment, parameter_pInitial_containment),
             new ExportedParameter(body, var_current_containment, parameter_pCurrent_containment)
          ));
          // 	find preserved_reference (initial_reference, current_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_reference, var_current_reference), Preserved_reference.instance().getInternalQueryRepresentation());
          //  	find reference_containment (initial_reference, initial_containment)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_reference, var_initial_containment), Reference_containment.instance().getInternalQueryRepresentation());
          //  	find reference_containment (current_reference, current_containment)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_reference, var_current_containment), Reference_containment.instance().getInternalQueryRepresentation());
          //  	check (initial_containment != current_containment)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern changed_reference_containment";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("current_containment", "initial_containment");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Boolean current_containment = (Boolean) provider.getValue("current_containment");
                  Boolean initial_containment = (Boolean) provider.getValue("initial_containment");
                  return evaluateExpression_1_1(current_containment, initial_containment);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Boolean current_containment, final Boolean initial_containment) {
    boolean _notEquals = (!com.google.common.base.Objects.equal(initial_containment, current_containment));
    return _notEquals;
  }
}
