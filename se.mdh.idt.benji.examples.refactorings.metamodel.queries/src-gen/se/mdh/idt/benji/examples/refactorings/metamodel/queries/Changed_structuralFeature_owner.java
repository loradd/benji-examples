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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_structuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_owner;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Changed_structuralFeature_owner extends BaseGeneratedEMFQuerySpecification<Changed_structuralFeature_owner.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_owner pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_owner;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_owner;
    
    private static List<String> parameterNames = makeImmutableList("initial_structuralFeature", "current_structuralFeature", "initial_owner", "current_owner");
    
    private Match(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      this.fInitial_structuralFeature = pInitial_structuralFeature;
      this.fCurrent_structuralFeature = pCurrent_structuralFeature;
      this.fInitial_owner = pInitial_owner;
      this.fCurrent_owner = pCurrent_owner;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_structuralFeature".equals(parameterName)) return this.fInitial_structuralFeature;
      if ("current_structuralFeature".equals(parameterName)) return this.fCurrent_structuralFeature;
      if ("initial_owner".equals(parameterName)) return this.fInitial_owner;
      if ("current_owner".equals(parameterName)) return this.fCurrent_owner;
      return null;
    }
    
    public StructuralFeature getInitial_structuralFeature() {
      return this.fInitial_structuralFeature;
    }
    
    public StructuralFeature getCurrent_structuralFeature() {
      return this.fCurrent_structuralFeature;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_owner() {
      return this.fInitial_owner;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_owner() {
      return this.fCurrent_owner;
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
      if ("initial_owner".equals(parameterName) ) {
          this.fInitial_owner = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_owner".equals(parameterName) ) {
          this.fCurrent_owner = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
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
    
    public void setInitial_owner(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_owner = pInitial_owner;
    }
    
    public void setCurrent_owner(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_owner = pCurrent_owner;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_owner";
    }
    
    @Override
    public List<String> parameterNames() {
      return Changed_structuralFeature_owner.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_structuralFeature, fCurrent_structuralFeature, fInitial_owner, fCurrent_owner};
    }
    
    @Override
    public Changed_structuralFeature_owner.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_structuralFeature, fCurrent_structuralFeature, fInitial_owner, fCurrent_owner) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_structuralFeature\"=" + prettyPrintValue(fInitial_structuralFeature) + ", ");
      result.append("\"current_structuralFeature\"=" + prettyPrintValue(fCurrent_structuralFeature) + ", ");
      result.append("\"initial_owner\"=" + prettyPrintValue(fInitial_owner) + ", ");
      result.append("\"current_owner\"=" + prettyPrintValue(fCurrent_owner));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_structuralFeature, fCurrent_structuralFeature, fInitial_owner, fCurrent_owner);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Changed_structuralFeature_owner.Match)) {
          Changed_structuralFeature_owner.Match other = (Changed_structuralFeature_owner.Match) obj;
          return Objects.equals(fInitial_structuralFeature, other.fInitial_structuralFeature) && Objects.equals(fCurrent_structuralFeature, other.fCurrent_structuralFeature) && Objects.equals(fInitial_owner, other.fInitial_owner) && Objects.equals(fCurrent_owner, other.fCurrent_owner);
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
    public Changed_structuralFeature_owner specification() {
      return Changed_structuralFeature_owner.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Changed_structuralFeature_owner.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Changed_structuralFeature_owner.Match newMutableMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return new Mutable(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Changed_structuralFeature_owner.Match newMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return new Immutable(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner);
    }
    
    private static final class Mutable extends Changed_structuralFeature_owner.Match {
      Mutable(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
        super(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Changed_structuralFeature_owner.Match {
      Immutable(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
        super(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_owner pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // structuralFeature - owner - changed
   * pattern changed_structuralFeature_owner (initial_structuralFeature : StructuralFeature, current_structuralFeature : StructuralFeature, initial_owner : Class, current_owner : Class) {
   * 	find preserved_structuralFeature (initial_structuralFeature, current_structuralFeature); 
   * 	neg find preserved_class (initial_owner, current_owner); 
   * 	find structuralFeature_owner (initial_structuralFeature, initial_owner); 
   * 	find structuralFeature_owner (current_structuralFeature, current_owner); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Changed_structuralFeature_owner
   * 
   */
  public static class Matcher extends BaseMatcher<Changed_structuralFeature_owner.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Changed_structuralFeature_owner.Matcher on(final ViatraQueryEngine engine) {
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
    public static Changed_structuralFeature_owner.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_STRUCTURALFEATURE = 0;
    
    private final static int POSITION_CURRENT_STRUCTURALFEATURE = 1;
    
    private final static int POSITION_INITIAL_OWNER = 2;
    
    private final static int POSITION_CURRENT_OWNER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Changed_structuralFeature_owner.Matcher.class);
    
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
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Changed_structuralFeature_owner.Match> getAllMatches(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawGetAllMatches(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Changed_structuralFeature_owner.Match getOneArbitraryMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawHasMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawCountMatches(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner, final IMatchProcessor<? super Changed_structuralFeature_owner.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner, final IMatchProcessor<? super Changed_structuralFeature_owner.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Changed_structuralFeature_owner.Match newMatch(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return Changed_structuralFeature_owner.Match.newMatch(pInitial_structuralFeature, pCurrent_structuralFeature, pInitial_owner, pCurrent_owner);
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
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final Changed_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(new Object[]{
      null, 
      pCurrent_structuralFeature, 
      pInitial_owner, 
      pCurrent_owner
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
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final Changed_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final StructuralFeature pInitial_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(new Object[]{
      pInitial_structuralFeature, 
      null, 
      pInitial_owner, 
      pCurrent_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_owner(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_OWNER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner() {
      return rawAccumulateAllValuesOfinitial_owner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner(final Changed_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_owner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfinitial_owner(new Object[]{
      pInitial_structuralFeature, 
      pCurrent_structuralFeature, 
      null, 
      pCurrent_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_owner(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_OWNER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner() {
      return rawAccumulateAllValuesOfcurrent_owner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner(final Changed_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_owner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawAccumulateAllValuesOfcurrent_owner(new Object[]{
      pInitial_structuralFeature, 
      pCurrent_structuralFeature, 
      pInitial_owner, 
      null
      });
    }
    
    @Override
    protected Changed_structuralFeature_owner.Match tupleToMatch(final Tuple t) {
      try {
          return Changed_structuralFeature_owner.Match.newMatch((StructuralFeature) t.get(POSITION_INITIAL_STRUCTURALFEATURE), (StructuralFeature) t.get(POSITION_CURRENT_STRUCTURALFEATURE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_OWNER), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_OWNER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_structuralFeature_owner.Match arrayToMatch(final Object[] match) {
      try {
          return Changed_structuralFeature_owner.Match.newMatch((StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_OWNER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Changed_structuralFeature_owner.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Changed_structuralFeature_owner.Match.newMutableMatch((StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_OWNER]);
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
    public static IQuerySpecification<Changed_structuralFeature_owner.Matcher> querySpecification() {
      return Changed_structuralFeature_owner.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_owner pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Changed_structuralFeature_owner.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_structuralFeature the value of pattern parameter initial_structuralFeature in the currently processed match
     * @param pCurrent_structuralFeature the value of pattern parameter current_structuralFeature in the currently processed match
     * @param pInitial_owner the value of pattern parameter initial_owner in the currently processed match
     * @param pCurrent_owner the value of pattern parameter current_owner in the currently processed match
     * 
     */
    public abstract void process(final StructuralFeature pInitial_structuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner);
    
    @Override
    public void process(final Changed_structuralFeature_owner.Match match) {
      process(match.getInitial_structuralFeature(), match.getCurrent_structuralFeature(), match.getInitial_owner(), match.getCurrent_owner());
    }
  }
  
  private Changed_structuralFeature_owner() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Changed_structuralFeature_owner instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Changed_structuralFeature_owner.Matcher instantiate(final ViatraQueryEngine engine) {
    return Changed_structuralFeature_owner.Matcher.on(engine);
  }
  
  @Override
  public Changed_structuralFeature_owner.Matcher instantiate() {
    return Changed_structuralFeature_owner.Matcher.create();
  }
  
  @Override
  public Changed_structuralFeature_owner.Match newEmptyMatch() {
    return Changed_structuralFeature_owner.Match.newEmptyMatch();
  }
  
  @Override
  public Changed_structuralFeature_owner.Match newMatch(final Object... parameters) {
    return Changed_structuralFeature_owner.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_owner (visibility: PUBLIC, simpleName: Changed_structuralFeature_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_owner (visibility: PUBLIC, simpleName: Changed_structuralFeature_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Changed_structuralFeature_owner INSTANCE = new Changed_structuralFeature_owner();
    
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
    private final static Changed_structuralFeature_owner.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_structuralFeature = new PParameter("initial_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_structuralFeature = new PParameter("current_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_owner = new PParameter("initial_owner", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_owner = new PParameter("current_owner", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_structuralFeature, parameter_pCurrent_structuralFeature, parameter_pInitial_owner, parameter_pCurrent_owner);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.changed_structuralFeature_owner";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_structuralFeature","current_structuralFeature","initial_owner","current_owner");
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
          PVariable var_initial_owner = body.getOrCreateVariableByName("initial_owner");
          PVariable var_current_owner = body.getOrCreateVariableByName("current_owner");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_structuralFeature, parameter_pInitial_structuralFeature),
             new ExportedParameter(body, var_current_structuralFeature, parameter_pCurrent_structuralFeature),
             new ExportedParameter(body, var_initial_owner, parameter_pInitial_owner),
             new ExportedParameter(body, var_current_owner, parameter_pCurrent_owner)
          ));
          // 	find preserved_structuralFeature (initial_structuralFeature, current_structuralFeature)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_structuralFeature, var_current_structuralFeature), Preserved_structuralFeature.instance().getInternalQueryRepresentation());
          //  	neg find preserved_class (initial_owner, current_owner)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_initial_owner, var_current_owner), Preserved_class.instance().getInternalQueryRepresentation());
          //  	find structuralFeature_owner (initial_structuralFeature, initial_owner)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_structuralFeature, var_initial_owner), StructuralFeature_owner.instance().getInternalQueryRepresentation());
          //  	find structuralFeature_owner (current_structuralFeature, current_owner)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_structuralFeature, var_current_owner), StructuralFeature_owner.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
