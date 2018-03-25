/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ReferenceQueries.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class Current_reference_opposite extends BaseGeneratedEMFQuerySpecification<Current_reference_opposite.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_opposite pattern,
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
    
    private Reference fCurrent_reference;
    
    private TraceLink fOpposite;
    
    private Reference fCurrent_opposite;
    
    private static List<String> parameterNames = makeImmutableList("reference", "current_reference", "opposite", "current_opposite");
    
    private Match(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      this.fReference = pReference;
      this.fCurrent_reference = pCurrent_reference;
      this.fOpposite = pOpposite;
      this.fCurrent_opposite = pCurrent_opposite;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      if ("opposite".equals(parameterName)) return this.fOpposite;
      if ("current_opposite".equals(parameterName)) return this.fCurrent_opposite;
      return null;
    }
    
    public TraceLink getReference() {
      return this.fReference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
    }
    
    public TraceLink getOpposite() {
      return this.fOpposite;
    }
    
    public Reference getCurrent_opposite() {
      return this.fCurrent_opposite;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("reference".equals(parameterName) ) {
          this.fReference = (TraceLink) newValue;
          return true;
      }
      if ("current_reference".equals(parameterName) ) {
          this.fCurrent_reference = (Reference) newValue;
          return true;
      }
      if ("opposite".equals(parameterName) ) {
          this.fOpposite = (TraceLink) newValue;
          return true;
      }
      if ("current_opposite".equals(parameterName) ) {
          this.fCurrent_opposite = (Reference) newValue;
          return true;
      }
      return false;
    }
    
    public void setReference(final TraceLink pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    public void setCurrent_reference(final Reference pCurrent_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_reference = pCurrent_reference;
    }
    
    public void setOpposite(final TraceLink pOpposite) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOpposite = pOpposite;
    }
    
    public void setCurrent_opposite(final Reference pCurrent_opposite) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_opposite = pCurrent_opposite;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_opposite";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_reference_opposite.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fCurrent_reference, fOpposite, fCurrent_opposite};
    }
    
    @Override
    public Current_reference_opposite.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fCurrent_reference, fOpposite, fCurrent_opposite) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference) + ", ");
      result.append("\"opposite\"=" + prettyPrintValue(fOpposite) + ", ");
      result.append("\"current_opposite\"=" + prettyPrintValue(fCurrent_opposite));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fReference, fCurrent_reference, fOpposite, fCurrent_opposite);
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
          return Objects.equals(fReference, other.fReference) && Objects.equals(fCurrent_reference, other.fCurrent_reference) && Objects.equals(fOpposite, other.fOpposite) && Objects.equals(fCurrent_opposite, other.fCurrent_opposite);
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
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_reference_opposite.Match newMutableMatch(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return new Mutable(pReference, pCurrent_reference, pOpposite, pCurrent_opposite);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_reference_opposite.Match newMatch(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return new Immutable(pReference, pCurrent_reference, pOpposite, pCurrent_opposite);
    }
    
    private static final class Mutable extends Current_reference_opposite.Match {
      Mutable(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
        super(pReference, pCurrent_reference, pOpposite, pCurrent_opposite);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_reference_opposite.Match {
      Immutable(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
        super(pReference, pCurrent_reference, pOpposite, pCurrent_opposite);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_opposite pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - opposite - current
   * pattern current_reference_opposite (reference : TraceLink, current_reference : Reference, opposite : TraceLink, current_opposite : Reference) {
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
     * The match set will be incrementally refreshed upon updates.
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
    
    private final static int POSITION_REFERENCE = 0;
    
    private final static int POSITION_CURRENT_REFERENCE = 1;
    
    private final static int POSITION_OPPOSITE = 2;
    
    private final static int POSITION_CURRENT_OPPOSITE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_reference_opposite.Matcher.class);
    
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
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_reference_opposite.Match> getAllMatches(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return rawGetAllMatches(new Object[]{pReference, pCurrent_reference, pOpposite, pCurrent_opposite});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_reference_opposite.Match getOneArbitraryMatch(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pCurrent_reference, pOpposite, pCurrent_opposite});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return rawHasMatch(new Object[]{pReference, pCurrent_reference, pOpposite, pCurrent_opposite});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return rawCountMatches(new Object[]{pReference, pCurrent_reference, pOpposite, pCurrent_opposite});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite, final IMatchProcessor<? super Current_reference_opposite.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pCurrent_reference, pOpposite, pCurrent_opposite}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite, final IMatchProcessor<? super Current_reference_opposite.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pCurrent_reference, pOpposite, pCurrent_opposite}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param pCurrent_opposite the fixed value of pattern parameter current_opposite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_reference_opposite.Match newMatch(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return Current_reference_opposite.Match.newMatch(pReference, pCurrent_reference, pOpposite, pCurrent_opposite);
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
    public Set<TraceLink> getAllValuesOfreference(final Current_reference_opposite.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      null, 
      pCurrent_reference, 
      pOpposite, 
      pCurrent_opposite
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
    public Set<Reference> getAllValuesOfcurrent_reference(final Current_reference_opposite.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final TraceLink pReference, final TraceLink pOpposite, final Reference pCurrent_opposite) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pReference, 
      null, 
      pOpposite, 
      pCurrent_opposite
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfopposite(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_OPPOSITE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfopposite() {
      return rawAccumulateAllValuesOfopposite(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfopposite(final Current_reference_opposite.Match partialMatch) {
      return rawAccumulateAllValuesOfopposite(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfopposite(final TraceLink pReference, final Reference pCurrent_reference, final Reference pCurrent_opposite) {
      return rawAccumulateAllValuesOfopposite(new Object[]{
      pReference, 
      pCurrent_reference, 
      null, 
      pCurrent_opposite
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfcurrent_opposite(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_CURRENT_OPPOSITE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_opposite() {
      return rawAccumulateAllValuesOfcurrent_opposite(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_opposite(final Current_reference_opposite.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_opposite(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_opposite(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite) {
      return rawAccumulateAllValuesOfcurrent_opposite(new Object[]{
      pReference, 
      pCurrent_reference, 
      pOpposite, 
      null
      });
    }
    
    @Override
    protected Current_reference_opposite.Match tupleToMatch(final Tuple t) {
      try {
          return Current_reference_opposite.Match.newMatch((TraceLink) t.get(POSITION_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE), (TraceLink) t.get(POSITION_OPPOSITE), (Reference) t.get(POSITION_CURRENT_OPPOSITE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_reference_opposite.Match arrayToMatch(final Object[] match) {
      try {
          return Current_reference_opposite.Match.newMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (TraceLink) match[POSITION_OPPOSITE], (Reference) match[POSITION_CURRENT_OPPOSITE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_reference_opposite.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_reference_opposite.Match.newMutableMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (TraceLink) match[POSITION_OPPOSITE], (Reference) match[POSITION_CURRENT_OPPOSITE]);
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
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_opposite pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_reference_opposite.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * @param pOpposite the value of pattern parameter opposite in the currently processed match
     * @param pCurrent_opposite the value of pattern parameter current_opposite in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pReference, final Reference pCurrent_reference, final TraceLink pOpposite, final Reference pCurrent_opposite);
    
    @Override
    public void process(final Current_reference_opposite.Match match) {
      process(match.getReference(), match.getCurrent_reference(), match.getOpposite(), match.getCurrent_opposite());
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
    return Current_reference_opposite.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_opposite (visibility: PUBLIC, simpleName: Current_reference_opposite, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_opposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_opposite (visibility: PUBLIC, simpleName: Current_reference_opposite, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_opposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_reference_opposite INSTANCE = new Current_reference_opposite();
    
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
    private final static Current_reference_opposite.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOpposite = new PParameter("opposite", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_opposite = new PParameter("current_opposite", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pReference, parameter_pCurrent_reference, parameter_pOpposite, parameter_pCurrent_opposite);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_opposite";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","current_reference","opposite","current_opposite");
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
          PVariable var_current_reference = body.getOrCreateVariableByName("current_reference");
          PVariable var_opposite = body.getOrCreateVariableByName("opposite");
          PVariable var_current_opposite = body.getOrCreateVariableByName("current_opposite");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_opposite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_opposite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference),
             new ExportedParameter(body, var_opposite, parameter_pOpposite),
             new ExportedParameter(body, var_current_opposite, parameter_pCurrent_opposite)
          ));
          // 	find current_reference (reference, current_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_current_reference), Current_reference.instance().getInternalQueryRepresentation());
          // 	find current_reference (opposite, current_opposite)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_opposite, var_current_opposite), Current_reference.instance().getInternalQueryRepresentation());
          // 	Reference.opposite (current_reference, current_opposite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference", "opposite")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new Equality(body, var__virtual_0_, var_current_opposite);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
