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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
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
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature;
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
public final class Current_structuralFeature_owner extends BaseGeneratedEMFQuerySpecification<Current_structuralFeature_owner.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_structuralFeature_owner pattern,
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
    private TraceLink fStructuralFeature;
    
    private StructuralFeature fCurrent_structuralFeature;
    
    private TraceLink fOwner;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_owner;
    
    private static List<String> parameterNames = makeImmutableList("structuralFeature", "current_structuralFeature", "owner", "current_owner");
    
    private Match(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      this.fStructuralFeature = pStructuralFeature;
      this.fCurrent_structuralFeature = pCurrent_structuralFeature;
      this.fOwner = pOwner;
      this.fCurrent_owner = pCurrent_owner;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("structuralFeature".equals(parameterName)) return this.fStructuralFeature;
      if ("current_structuralFeature".equals(parameterName)) return this.fCurrent_structuralFeature;
      if ("owner".equals(parameterName)) return this.fOwner;
      if ("current_owner".equals(parameterName)) return this.fCurrent_owner;
      return null;
    }
    
    public TraceLink getStructuralFeature() {
      return this.fStructuralFeature;
    }
    
    public StructuralFeature getCurrent_structuralFeature() {
      return this.fCurrent_structuralFeature;
    }
    
    public TraceLink getOwner() {
      return this.fOwner;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_owner() {
      return this.fCurrent_owner;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("structuralFeature".equals(parameterName) ) {
          this.fStructuralFeature = (TraceLink) newValue;
          return true;
      }
      if ("current_structuralFeature".equals(parameterName) ) {
          this.fCurrent_structuralFeature = (StructuralFeature) newValue;
          return true;
      }
      if ("owner".equals(parameterName) ) {
          this.fOwner = (TraceLink) newValue;
          return true;
      }
      if ("current_owner".equals(parameterName) ) {
          this.fCurrent_owner = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setStructuralFeature(final TraceLink pStructuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStructuralFeature = pStructuralFeature;
    }
    
    public void setCurrent_structuralFeature(final StructuralFeature pCurrent_structuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_structuralFeature = pCurrent_structuralFeature;
    }
    
    public void setOwner(final TraceLink pOwner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOwner = pOwner;
    }
    
    public void setCurrent_owner(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_owner = pCurrent_owner;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_structuralFeature_owner";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_structuralFeature_owner.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fStructuralFeature, fCurrent_structuralFeature, fOwner, fCurrent_owner};
    }
    
    @Override
    public Current_structuralFeature_owner.Match toImmutable() {
      return isMutable() ? newMatch(fStructuralFeature, fCurrent_structuralFeature, fOwner, fCurrent_owner) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"structuralFeature\"=" + prettyPrintValue(fStructuralFeature) + ", ");
      result.append("\"current_structuralFeature\"=" + prettyPrintValue(fCurrent_structuralFeature) + ", ");
      result.append("\"owner\"=" + prettyPrintValue(fOwner) + ", ");
      result.append("\"current_owner\"=" + prettyPrintValue(fCurrent_owner));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fStructuralFeature, fCurrent_structuralFeature, fOwner, fCurrent_owner);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_structuralFeature_owner.Match)) {
          Current_structuralFeature_owner.Match other = (Current_structuralFeature_owner.Match) obj;
          return Objects.equals(fStructuralFeature, other.fStructuralFeature) && Objects.equals(fCurrent_structuralFeature, other.fCurrent_structuralFeature) && Objects.equals(fOwner, other.fOwner) && Objects.equals(fCurrent_owner, other.fCurrent_owner);
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
    public Current_structuralFeature_owner specification() {
      return Current_structuralFeature_owner.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_structuralFeature_owner.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_structuralFeature_owner.Match newMutableMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return new Mutable(pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_structuralFeature_owner.Match newMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return new Immutable(pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner);
    }
    
    private static final class Mutable extends Current_structuralFeature_owner.Match {
      Mutable(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
        super(pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_structuralFeature_owner.Match {
      Immutable(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
        super(pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_structuralFeature_owner pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // structural feature - owner - current
   * pattern current_structuralFeature_owner (structuralFeature : TraceLink, current_structuralFeature : StructuralFeature, owner : TraceLink, current_owner : Class) {
   * 	find current_structuralFeature (structuralFeature, current_structuralFeature);
   * 	find current_class (owner, current_owner);
   * 	StructuralFeature.owner (current_structuralFeature, current_owner);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_structuralFeature_owner
   * 
   */
  public static class Matcher extends BaseMatcher<Current_structuralFeature_owner.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_structuralFeature_owner.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_structuralFeature_owner.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_STRUCTURALFEATURE = 0;
    
    private final static int POSITION_CURRENT_STRUCTURALFEATURE = 1;
    
    private final static int POSITION_OWNER = 2;
    
    private final static int POSITION_CURRENT_OWNER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_structuralFeature_owner.Matcher.class);
    
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
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_structuralFeature_owner.Match> getAllMatches(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawGetAllMatches(new Object[]{pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_structuralFeature_owner.Match getOneArbitraryMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawGetOneArbitraryMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawHasMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawCountMatches(new Object[]{pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner, final IMatchProcessor<? super Current_structuralFeature_owner.Match> processor) {
      rawForEachMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner, final IMatchProcessor<? super Current_structuralFeature_owner.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_structuralFeature_owner.Match newMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return Current_structuralFeature_owner.Match.newMatch(pStructuralFeature, pCurrent_structuralFeature, pOwner, pCurrent_owner);
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfstructuralFeature(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature() {
      return rawAccumulateAllValuesOfstructuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final Current_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfstructuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfstructuralFeature(new Object[]{
      null, 
      pCurrent_structuralFeature, 
      pOwner, 
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
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final Current_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final TraceLink pStructuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(new Object[]{
      pStructuralFeature, 
      null, 
      pOwner, 
      pCurrent_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfowner(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_OWNER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner() {
      return rawAccumulateAllValuesOfowner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner(final Current_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfowner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfowner(new Object[]{
      pStructuralFeature, 
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner(final Current_structuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_owner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner) {
      return rawAccumulateAllValuesOfcurrent_owner(new Object[]{
      pStructuralFeature, 
      pCurrent_structuralFeature, 
      pOwner, 
      null
      });
    }
    
    @Override
    protected Current_structuralFeature_owner.Match tupleToMatch(final Tuple t) {
      try {
          return Current_structuralFeature_owner.Match.newMatch((TraceLink) t.get(POSITION_STRUCTURALFEATURE), (StructuralFeature) t.get(POSITION_CURRENT_STRUCTURALFEATURE), (TraceLink) t.get(POSITION_OWNER), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_OWNER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_structuralFeature_owner.Match arrayToMatch(final Object[] match) {
      try {
          return Current_structuralFeature_owner.Match.newMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_OWNER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_structuralFeature_owner.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_structuralFeature_owner.Match.newMutableMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_OWNER]);
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
    public static IQuerySpecification<Current_structuralFeature_owner.Matcher> querySpecification() {
      return Current_structuralFeature_owner.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_structuralFeature_owner pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_structuralFeature_owner.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pStructuralFeature the value of pattern parameter structuralFeature in the currently processed match
     * @param pCurrent_structuralFeature the value of pattern parameter current_structuralFeature in the currently processed match
     * @param pOwner the value of pattern parameter owner in the currently processed match
     * @param pCurrent_owner the value of pattern parameter current_owner in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner);
    
    @Override
    public void process(final Current_structuralFeature_owner.Match match) {
      process(match.getStructuralFeature(), match.getCurrent_structuralFeature(), match.getOwner(), match.getCurrent_owner());
    }
  }
  
  private Current_structuralFeature_owner() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_structuralFeature_owner instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_structuralFeature_owner.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_structuralFeature_owner.Matcher.on(engine);
  }
  
  @Override
  public Current_structuralFeature_owner.Matcher instantiate() {
    return Current_structuralFeature_owner.Matcher.create();
  }
  
  @Override
  public Current_structuralFeature_owner.Match newEmptyMatch() {
    return Current_structuralFeature_owner.Match.newEmptyMatch();
  }
  
  @Override
  public Current_structuralFeature_owner.Match newMatch(final Object... parameters) {
    return Current_structuralFeature_owner.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_owner (visibility: PUBLIC, simpleName: Current_structuralFeature_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_owner (visibility: PUBLIC, simpleName: Current_structuralFeature_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_structuralFeature_owner INSTANCE = new Current_structuralFeature_owner();
    
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
    private final static Current_structuralFeature_owner.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pStructuralFeature = new PParameter("structuralFeature", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_structuralFeature = new PParameter("current_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOwner = new PParameter("owner", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_owner = new PParameter("current_owner", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pStructuralFeature, parameter_pCurrent_structuralFeature, parameter_pOwner, parameter_pCurrent_owner);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_structuralFeature_owner";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("structuralFeature","current_structuralFeature","owner","current_owner");
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
          PVariable var_structuralFeature = body.getOrCreateVariableByName("structuralFeature");
          PVariable var_current_structuralFeature = body.getOrCreateVariableByName("current_structuralFeature");
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          PVariable var_current_owner = body.getOrCreateVariableByName("current_owner");
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_structuralFeature, parameter_pStructuralFeature),
             new ExportedParameter(body, var_current_structuralFeature, parameter_pCurrent_structuralFeature),
             new ExportedParameter(body, var_owner, parameter_pOwner),
             new ExportedParameter(body, var_current_owner, parameter_pCurrent_owner)
          ));
          // 	find current_structuralFeature (structuralFeature, current_structuralFeature)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_structuralFeature, var_current_structuralFeature), Current_structuralFeature.instance().getInternalQueryRepresentation());
          // 	find current_class (owner, current_owner)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_owner, var_current_owner), Current_class.instance().getInternalQueryRepresentation());
          // 	StructuralFeature.owner (current_structuralFeature, current_owner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_structuralFeature, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature", "owner")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new Equality(body, var__virtual_0_, var_current_owner);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
