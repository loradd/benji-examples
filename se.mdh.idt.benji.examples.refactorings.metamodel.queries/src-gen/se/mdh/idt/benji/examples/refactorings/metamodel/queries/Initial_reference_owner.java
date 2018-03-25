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
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_owner;
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
public final class Initial_reference_owner extends BaseGeneratedEMFQuerySpecification<Initial_reference_owner.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_reference_owner pattern,
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
    private TraceLink fReference;
    
    private Reference fInitial_reference;
    
    private TraceLink fOwner;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_owner;
    
    private static List<String> parameterNames = makeImmutableList("reference", "initial_reference", "owner", "initial_owner");
    
    private Match(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      this.fReference = pReference;
      this.fInitial_reference = pInitial_reference;
      this.fOwner = pOwner;
      this.fInitial_owner = pInitial_owner;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("initial_reference".equals(parameterName)) return this.fInitial_reference;
      if ("owner".equals(parameterName)) return this.fOwner;
      if ("initial_owner".equals(parameterName)) return this.fInitial_owner;
      return null;
    }
    
    public TraceLink getReference() {
      return this.fReference;
    }
    
    public Reference getInitial_reference() {
      return this.fInitial_reference;
    }
    
    public TraceLink getOwner() {
      return this.fOwner;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_owner() {
      return this.fInitial_owner;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("reference".equals(parameterName) ) {
          this.fReference = (TraceLink) newValue;
          return true;
      }
      if ("initial_reference".equals(parameterName) ) {
          this.fInitial_reference = (Reference) newValue;
          return true;
      }
      if ("owner".equals(parameterName) ) {
          this.fOwner = (TraceLink) newValue;
          return true;
      }
      if ("initial_owner".equals(parameterName) ) {
          this.fInitial_owner = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setReference(final TraceLink pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    public void setInitial_reference(final Reference pInitial_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_reference = pInitial_reference;
    }
    
    public void setOwner(final TraceLink pOwner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOwner = pOwner;
    }
    
    public void setInitial_owner(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_owner = pInitial_owner;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_reference_owner";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_reference_owner.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fInitial_reference, fOwner, fInitial_owner};
    }
    
    @Override
    public Initial_reference_owner.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fInitial_reference, fOwner, fInitial_owner) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"initial_reference\"=" + prettyPrintValue(fInitial_reference) + ", ");
      result.append("\"owner\"=" + prettyPrintValue(fOwner) + ", ");
      result.append("\"initial_owner\"=" + prettyPrintValue(fInitial_owner));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fReference, fInitial_reference, fOwner, fInitial_owner);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_reference_owner.Match)) {
          Initial_reference_owner.Match other = (Initial_reference_owner.Match) obj;
          return Objects.equals(fReference, other.fReference) && Objects.equals(fInitial_reference, other.fInitial_reference) && Objects.equals(fOwner, other.fOwner) && Objects.equals(fInitial_owner, other.fInitial_owner);
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
    public Initial_reference_owner specification() {
      return Initial_reference_owner.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_reference_owner.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_reference_owner.Match newMutableMatch(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return new Mutable(pReference, pInitial_reference, pOwner, pInitial_owner);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_reference_owner.Match newMatch(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return new Immutable(pReference, pInitial_reference, pOwner, pInitial_owner);
    }
    
    private static final class Mutable extends Initial_reference_owner.Match {
      Mutable(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
        super(pReference, pInitial_reference, pOwner, pInitial_owner);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_reference_owner.Match {
      Immutable(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
        super(pReference, pInitial_reference, pOwner, pInitial_owner);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_reference_owner pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - owner - initial
   * pattern initial_reference_owner (reference : TraceLink, initial_reference : Reference, owner : TraceLink, initial_owner : Class) {
   * 	find initial_structuralFeature_owner (reference, initial_reference, owner, initial_owner);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_reference_owner
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_reference_owner.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_reference_owner.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_reference_owner.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_REFERENCE = 0;
    
    private final static int POSITION_INITIAL_REFERENCE = 1;
    
    private final static int POSITION_OWNER = 2;
    
    private final static int POSITION_INITIAL_OWNER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_reference_owner.Matcher.class);
    
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
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_reference_owner.Match> getAllMatches(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawGetAllMatches(new Object[]{pReference, pInitial_reference, pOwner, pInitial_owner});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_reference_owner.Match getOneArbitraryMatch(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pInitial_reference, pOwner, pInitial_owner});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawHasMatch(new Object[]{pReference, pInitial_reference, pOwner, pInitial_owner});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawCountMatches(new Object[]{pReference, pInitial_reference, pOwner, pInitial_owner});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final IMatchProcessor<? super Initial_reference_owner.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pInitial_reference, pOwner, pInitial_owner}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final IMatchProcessor<? super Initial_reference_owner.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pInitial_reference, pOwner, pInitial_owner}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_reference_owner.Match newMatch(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return Initial_reference_owner.Match.newMatch(pReference, pInitial_reference, pOwner, pInitial_owner);
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfreference(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference() {
      return rawAccumulateAllValuesOfreference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final Initial_reference_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      null, 
      pInitial_reference, 
      pOwner, 
      pInitial_owner
      });
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
    public Set<Reference> getAllValuesOfinitial_reference(final Initial_reference_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference(final TraceLink pReference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawAccumulateAllValuesOfinitial_reference(new Object[]{
      pReference, 
      null, 
      pOwner, 
      pInitial_owner
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
    public Set<TraceLink> getAllValuesOfowner(final Initial_reference_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfowner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner(final TraceLink pReference, final Reference pInitial_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawAccumulateAllValuesOfowner(new Object[]{
      pReference, 
      pInitial_reference, 
      null, 
      pInitial_owner
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner(final Initial_reference_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_owner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner) {
      return rawAccumulateAllValuesOfinitial_owner(new Object[]{
      pReference, 
      pInitial_reference, 
      pOwner, 
      null
      });
    }
    
    @Override
    protected Initial_reference_owner.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_reference_owner.Match.newMatch((TraceLink) t.get(POSITION_REFERENCE), (Reference) t.get(POSITION_INITIAL_REFERENCE), (TraceLink) t.get(POSITION_OWNER), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_OWNER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_reference_owner.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_reference_owner.Match.newMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_INITIAL_REFERENCE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_OWNER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_reference_owner.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_reference_owner.Match.newMutableMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_INITIAL_REFERENCE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_OWNER]);
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
    public static IQuerySpecification<Initial_reference_owner.Matcher> querySpecification() {
      return Initial_reference_owner.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_reference_owner pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_reference_owner.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pInitial_reference the value of pattern parameter initial_reference in the currently processed match
     * @param pOwner the value of pattern parameter owner in the currently processed match
     * @param pInitial_owner the value of pattern parameter initial_owner in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pReference, final Reference pInitial_reference, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner);
    
    @Override
    public void process(final Initial_reference_owner.Match match) {
      process(match.getReference(), match.getInitial_reference(), match.getOwner(), match.getInitial_owner());
    }
  }
  
  private Initial_reference_owner() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_reference_owner instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_reference_owner.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_reference_owner.Matcher.on(engine);
  }
  
  @Override
  public Initial_reference_owner.Matcher instantiate() {
    return Initial_reference_owner.Matcher.create();
  }
  
  @Override
  public Initial_reference_owner.Match newEmptyMatch() {
    return Initial_reference_owner.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_reference_owner.Match newMatch(final Object... parameters) {
    return Initial_reference_owner.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_owner (visibility: PUBLIC, simpleName: Initial_reference_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_owner (visibility: PUBLIC, simpleName: Initial_reference_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_reference_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_reference_owner INSTANCE = new Initial_reference_owner();
    
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
    private final static Initial_reference_owner.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_reference = new PParameter("initial_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOwner = new PParameter("owner", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_owner = new PParameter("initial_owner", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pReference, parameter_pInitial_reference, parameter_pOwner, parameter_pInitial_owner);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_reference_owner";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","initial_reference","owner","initial_owner");
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
          PVariable var_reference = body.getOrCreateVariableByName("reference");
          PVariable var_initial_reference = body.getOrCreateVariableByName("initial_reference");
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          PVariable var_initial_owner = body.getOrCreateVariableByName("initial_owner");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_initial_reference, parameter_pInitial_reference),
             new ExportedParameter(body, var_owner, parameter_pOwner),
             new ExportedParameter(body, var_initial_owner, parameter_pInitial_owner)
          ));
          // 	find initial_structuralFeature_owner (reference, initial_reference, owner, initial_owner)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_initial_reference, var_owner, var_initial_owner), Initial_structuralFeature_owner.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
