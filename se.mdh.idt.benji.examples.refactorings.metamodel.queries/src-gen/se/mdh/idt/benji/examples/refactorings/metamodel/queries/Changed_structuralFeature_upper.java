/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/StructuralFeature.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_upper;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Changed_structuralFeature_upper extends BaseGeneratedEMFQuerySpecification<Changed_structuralFeature_upper.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_upper pattern,
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
    private StructuralFeature fInitial_structuralFeature;
    
    private StructuralFeature fCurrent_structuralFeature;
    
    private Integer fInitial_upper;
    
    private Integer fCurrent_upper;
    
    private static List<String> parameterNames = makeImmutableList("initial_structuralFeature", "current_structuralFeature", "initial_upper", "current_upper");
    
    private Match(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      this.fInitial_structuralFeature = pInitial_structuralFeature;
      this.fCurrent_structuralFeature = pCurrent_structuralFeature;
      this.fInitial_upper = pInitial_upper;
      this.fCurrent_upper = pCurrent_upper;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_structuralFeature".equals(parameterName)) return this.fInitial_structuralFeature;
      if ("current_structuralFeature".equals(parameterName)) return this.fCurrent_structuralFeature;
      if ("initial_upper".equals(parameterName)) return this.fInitial_upper;
      if ("current_upper".equals(parameterName)) return this.fCurrent_upper;
      return null;
    }
    
    public StructuralFeature getInitial_structuralFeature() {
      return this.fInitial_structuralFeature;
    }
    
    public StructuralFeature getCurrent_structuralFeature() {
      return this.fCurrent_structuralFeature;
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
      if ("initial_structuralFeature".equals(parameterName) ) {
          this.fInitial_structuralFeature = (StructuralFeature) newValue;
          return true;
      }
      if ("current_structuralFeature".equals(parameterName) ) {
          this.fCurrent_structuralFeature = (StructuralFeature) newValue;
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
    
    public void setInitial_structuralFeature(final StructuralFeature pInitial_structuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_structuralFeature = pInitial_structuralFeature;
    }
    
    public void setCurrent_structuralFeature(final StructuralFeature pCurrent_structuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_structuralFeature = pCurrent_structuralFeature;
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
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_upper";
    }
    
    @Override
    public List<String> parameterNames() {
      return Changed_structuralFeature_upper.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_structuralFeature, fCurrent_structuralFeature, fInitial_upper, fCurrent_upper};
    }
    
    @Override
    public Changed_structuralFeature_upper.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_structuralFeature, fCurrent_structuralFeature, fInitial_upper, fCurrent_upper) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_structuralFeature\"=" + prettyPrintValue(fInitial_structuralFeature) + ", ");
      result.append("\"current_structuralFeature\"=" + prettyPrintValue(fCurrent_structuralFeature) + ", ");
      result.append("\"initial_upper\"=" + prettyPrintValue(fInitial_upper) + ", ");
      result.append("\"current_upper\"=" + prettyPrintValue(fCurrent_upper));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_structuralFeature, fCurrent_structuralFeature, fInitial_upper, fCurrent_upper);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Changed_structuralFeature_upper.Match)) {
          Changed_structuralFeature_upper.Match other = (Changed_structuralFeature_upper.Match) obj;
          return Objects.equals(fInitial_structuralFeature, other.fInitial_structuralFeature) && Objects.equals(fCurrent_structuralFeature, other.fCurrent_structuralFeature) && Objects.equals(fInitial_upper, other.fInitial_upper) && Objects.equals(fCurrent_upper, other.fCurrent_upper);
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
    public Changed_structuralFeature_upper specification() {
      return Changed_structuralFeature_upper.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Changed_structuralFeature_upper.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Changed_structuralFeature_upper.Match newMutableMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return new Mutable(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Changed_structuralFeature_upper.Match newMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return new Immutable(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper);
    }
    
    private static final class Mutable extends Changed_structuralFeature_upper.Match {
      Mutable(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
        super(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Changed_structuralFeature_upper.Match {
      Immutable(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
        super(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_upper pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // structuralFeature - upper - changed
   * pattern changed_structuralFeature_upper (initial_structuralFeature : StructuralFeature, current_structuralFeature : StructuralFeature, initial_upper : java Integer, current_upper : java Integer) {
   * 	find preserved_structuralFeature (initial_structuralFeature, current_structuralFeature); 
   * 	find structuralFeature_upper (initial_structuralFeature, initial_upper); 
   * 	find structuralFeature_upper (current_structuralFeature, current_upper); 
   * 	check (initial_upper != current_upper); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Changed_structuralFeature_upper
   * 
   */
  public static class Matcher extends BaseMatcher<Changed_structuralFeature_upper.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Changed_structuralFeature_upper.Matcher on(final ViatraQueryEngine engine) {
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
    public static Changed_structuralFeature_upper.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_STRUCTURALFEATURE = 0;
    
    private final static int POSITION_CURRENT_STRUCTURALFEATURE = 1;
    
    private final static int POSITION_INITIAL_UPPER = 2;
    
    private final static int POSITION_CURRENT_UPPER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Changed_structuralFeature_upper.Matcher.class);
    
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
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Changed_structuralFeature_upper.Match> getAllMatches(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawGetAllMatches(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Changed_structuralFeature_upper.Match getOneArbitraryMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawHasMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawCountMatches(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper, final IMatchProcessor<? super Changed_structuralFeature_upper.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper, final IMatchProcessor<? super Changed_structuralFeature_upper.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_upper the fixed value of pattern parameter initial_upper, or null if not bound.
     * @param pCurrent_upper the fixed value of pattern parameter current_upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Changed_structuralFeature_upper.Match newMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return Changed_structuralFeature_upper.Match.newMatch(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_upper, pCurrent_upper);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<StructuralFeature> rawAccumulateAllValuesOfinitial_structuralFeature(final Object[] parameters) {
      Set<StructuralFeature> results = new HashSet<StructuralFeature>();
      rawAccumulateAllValues(POSITION_INITIAL_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature() {
      return rawAccumulateAllValuesOfinitial_structuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final Changed_structuralFeature_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(new Object[]{
      null, 
      pCurrent_structuralFeature, 
      pInitial_upper, 
      pCurrent_upper
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<StructuralFeature> rawAccumulateAllValuesOfcurrent_structuralFeature(final Object[] parameters) {
      Set<StructuralFeature> results = new HashSet<StructuralFeature>();
      rawAccumulateAllValues(POSITION_CURRENT_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature() {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final Changed_structuralFeature_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final StructuralFeature pInitial_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(new Object[]{
      pInitial_structuralFeature, 
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
    public Set<Integer> getAllValuesOfinitial_upper(final Changed_structuralFeature_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_upper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfinitial_upper(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pCurrent_upper) {
      return rawAccumulateAllValuesOfinitial_upper(new Object[]{
      pInitial_structuralFeature, 
      pCurrent_structuralFeature, 
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
    public Set<Integer> getAllValuesOfcurrent_upper(final Changed_structuralFeature_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_upper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfcurrent_upper(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper) {
      return rawAccumulateAllValuesOfcurrent_upper(new Object[]{
      pInitial_structuralFeature, 
      pCurrent_structuralFeature, 
      pInitial_upper, 
      null
      });
    }
    
    @Override
    protected Changed_structuralFeature_upper.Match tupleToMatch(final Tuple t) {
      try {
          return Changed_structuralFeature_upper.Match.newMatch((StructuralFeature) t.get(POSITION_INITIAL_STRUCTURALFEATURE), (StructuralFeature) t.get(POSITION_CURRENT_STRUCTURALFEATURE), (Integer) t.get(POSITION_INITIAL_UPPER), (Integer) t.get(POSITION_CURRENT_UPPER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_structuralFeature_upper.Match arrayToMatch(final Object[] match) {
      try {
          return Changed_structuralFeature_upper.Match.newMatch((StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE], (Integer) match[POSITION_INITIAL_UPPER], (Integer) match[POSITION_CURRENT_UPPER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_structuralFeature_upper.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Changed_structuralFeature_upper.Match.newMutableMatch((StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE], (Integer) match[POSITION_INITIAL_UPPER], (Integer) match[POSITION_CURRENT_UPPER]);
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
    public static IQuerySpecification<Changed_structuralFeature_upper.Matcher> querySpecification() {
      return Changed_structuralFeature_upper.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_upper pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Changed_structuralFeature_upper.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_structuralFeature the value of pattern parameter initial_structuralFeature in the currently processed match
     * @param pCurrent_structuralFeature the value of pattern parameter current_structuralFeature in the currently processed match
     * @param pInitial_upper the value of pattern parameter initial_upper in the currently processed match
     * @param pCurrent_upper the value of pattern parameter current_upper in the currently processed match
     * 
     */
    public abstract void process(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final Integer pInitial_upper, final Integer pCurrent_upper);
    
    @Override
    public void process(final Changed_structuralFeature_upper.Match match) {
      process(match.getInitial_structuralFeature(), match.getCurrent_structuralFeature(), match.getInitial_upper(), match.getCurrent_upper());
    }
  }
  
  private Changed_structuralFeature_upper() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Changed_structuralFeature_upper instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Changed_structuralFeature_upper.Matcher instantiate(final ViatraQueryEngine engine) {
    return Changed_structuralFeature_upper.Matcher.on(engine);
  }
  
  @Override
  public Changed_structuralFeature_upper.Matcher instantiate() {
    return Changed_structuralFeature_upper.Matcher.create();
  }
  
  @Override
  public Changed_structuralFeature_upper.Match newEmptyMatch() {
    return Changed_structuralFeature_upper.Match.newEmptyMatch();
  }
  
  @Override
  public Changed_structuralFeature_upper.Match newMatch(final Object... parameters) {
    return Changed_structuralFeature_upper.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[1], (java.lang.Integer) parameters[2], (java.lang.Integer) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_upper (visibility: PUBLIC, simpleName: Changed_structuralFeature_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_upper (visibility: PUBLIC, simpleName: Changed_structuralFeature_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Changed_structuralFeature_upper INSTANCE = new Changed_structuralFeature_upper();
    
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
    private final static Changed_structuralFeature_upper.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_structuralFeature = new PParameter("initial_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_structuralFeature = new PParameter("current_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_upper = new PParameter("initial_upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_upper = new PParameter("current_upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_structuralFeature, parameter_pCurrent_structuralFeature, parameter_pInitial_upper, parameter_pCurrent_upper);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_upper";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_structuralFeature","current_structuralFeature","initial_upper","current_upper");
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
          PVariable var_initial_structuralFeature = body.getOrCreateVariableByName("initial_structuralFeature");
          PVariable var_current_structuralFeature = body.getOrCreateVariableByName("current_structuralFeature");
          PVariable var_initial_upper = body.getOrCreateVariableByName("initial_upper");
          PVariable var_current_upper = body.getOrCreateVariableByName("current_upper");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_initial_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_current_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_structuralFeature, parameter_pInitial_structuralFeature),
             new ExportedParameter(body, var_current_structuralFeature, parameter_pCurrent_structuralFeature),
             new ExportedParameter(body, var_initial_upper, parameter_pInitial_upper),
             new ExportedParameter(body, var_current_upper, parameter_pCurrent_upper)
          ));
          // 	find preserved_structuralFeature (initial_structuralFeature, current_structuralFeature)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_structuralFeature, var_current_structuralFeature), Preserved_structuralFeature.instance().getInternalQueryRepresentation());
          //  	find structuralFeature_upper (initial_structuralFeature, initial_upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_structuralFeature, var_initial_upper), StructuralFeature_upper.instance().getInternalQueryRepresentation());
          //  	find structuralFeature_upper (current_structuralFeature, current_upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_structuralFeature, var_current_upper), StructuralFeature_upper.instance().getInternalQueryRepresentation());
          //  	check (initial_upper != current_upper)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern changed_structuralFeature_upper";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("current_upper", "initial_upper");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer current_upper = (Integer) provider.getValue("current_upper");
                  Integer initial_upper = (Integer) provider.getValue("initial_upper");
                  return evaluateExpression_1_1(current_upper, initial_upper);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer current_upper, final Integer initial_upper) {
    boolean _notEquals = (!com.google.common.base.Objects.equal(initial_upper, current_upper));
    return _notEquals;
  }
}
