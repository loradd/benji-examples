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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_upper;
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
public final class Current_reference_upper extends BaseGeneratedEMFQuerySpecification<Current_reference_upper.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_upper pattern,
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
    
    private Integer fUpper;
    
    private static List<String> parameterNames = makeImmutableList("reference", "current_reference", "upper");
    
    private Match(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      this.fReference = pReference;
      this.fCurrent_reference = pCurrent_reference;
      this.fUpper = pUpper;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      if ("upper".equals(parameterName)) return this.fUpper;
      return null;
    }
    
    public TraceLink getReference() {
      return this.fReference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
    }
    
    public Integer getUpper() {
      return this.fUpper;
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
      if ("upper".equals(parameterName) ) {
          this.fUpper = (Integer) newValue;
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
    
    public void setUpper(final Integer pUpper) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUpper = pUpper;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_upper";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_reference_upper.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fCurrent_reference, fUpper};
    }
    
    @Override
    public Current_reference_upper.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fCurrent_reference, fUpper) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference) + ", ");
      result.append("\"upper\"=" + prettyPrintValue(fUpper));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fReference, fCurrent_reference, fUpper);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_reference_upper.Match)) {
          Current_reference_upper.Match other = (Current_reference_upper.Match) obj;
          return Objects.equals(fReference, other.fReference) && Objects.equals(fCurrent_reference, other.fCurrent_reference) && Objects.equals(fUpper, other.fUpper);
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
    public Current_reference_upper specification() {
      return Current_reference_upper.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_reference_upper.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_reference_upper.Match newMutableMatch(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      return new Mutable(pReference, pCurrent_reference, pUpper);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_reference_upper.Match newMatch(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      return new Immutable(pReference, pCurrent_reference, pUpper);
    }
    
    private static final class Mutable extends Current_reference_upper.Match {
      Mutable(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
        super(pReference, pCurrent_reference, pUpper);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_reference_upper.Match {
      Immutable(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
        super(pReference, pCurrent_reference, pUpper);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_upper pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - upper - current
   * pattern current_reference_upper (reference : TraceLink, current_reference : Reference, upper : java Integer) {
   * 	find current_structuralFeature_upper (reference, current_reference, upper);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_reference_upper
   * 
   */
  public static class Matcher extends BaseMatcher<Current_reference_upper.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_reference_upper.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_reference_upper.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_REFERENCE = 0;
    
    private final static int POSITION_CURRENT_REFERENCE = 1;
    
    private final static int POSITION_UPPER = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_reference_upper.Matcher.class);
    
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
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_reference_upper.Match> getAllMatches(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      return rawGetAllMatches(new Object[]{pReference, pCurrent_reference, pUpper});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_reference_upper.Match getOneArbitraryMatch(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pCurrent_reference, pUpper});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      return rawHasMatch(new Object[]{pReference, pCurrent_reference, pUpper});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      return rawCountMatches(new Object[]{pReference, pCurrent_reference, pUpper});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper, final IMatchProcessor<? super Current_reference_upper.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pCurrent_reference, pUpper}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper, final IMatchProcessor<? super Current_reference_upper.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pCurrent_reference, pUpper}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_reference_upper.Match newMatch(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper) {
      return Current_reference_upper.Match.newMatch(pReference, pCurrent_reference, pUpper);
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
    public Set<TraceLink> getAllValuesOfreference(final Current_reference_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final Reference pCurrent_reference, final Integer pUpper) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      null, 
      pCurrent_reference, 
      pUpper
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
    public Set<Reference> getAllValuesOfcurrent_reference(final Current_reference_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final TraceLink pReference, final Integer pUpper) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pReference, 
      null, 
      pUpper
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOfupper(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_UPPER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfupper() {
      return rawAccumulateAllValuesOfupper(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfupper(final Current_reference_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfupper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfupper(final TraceLink pReference, final Reference pCurrent_reference) {
      return rawAccumulateAllValuesOfupper(new Object[]{
      pReference, 
      pCurrent_reference, 
      null
      });
    }
    
    @Override
    protected Current_reference_upper.Match tupleToMatch(final Tuple t) {
      try {
          return Current_reference_upper.Match.newMatch((TraceLink) t.get(POSITION_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE), (Integer) t.get(POSITION_UPPER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_reference_upper.Match arrayToMatch(final Object[] match) {
      try {
          return Current_reference_upper.Match.newMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Integer) match[POSITION_UPPER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_reference_upper.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_reference_upper.Match.newMutableMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Integer) match[POSITION_UPPER]);
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
    public static IQuerySpecification<Current_reference_upper.Matcher> querySpecification() {
      return Current_reference_upper.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_upper pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_reference_upper.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * @param pUpper the value of pattern parameter upper in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pReference, final Reference pCurrent_reference, final Integer pUpper);
    
    @Override
    public void process(final Current_reference_upper.Match match) {
      process(match.getReference(), match.getCurrent_reference(), match.getUpper());
    }
  }
  
  private Current_reference_upper() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_reference_upper instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_reference_upper.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_reference_upper.Matcher.on(engine);
  }
  
  @Override
  public Current_reference_upper.Matcher instantiate() {
    return Current_reference_upper.Matcher.create();
  }
  
  @Override
  public Current_reference_upper.Match newEmptyMatch() {
    return Current_reference_upper.Match.newEmptyMatch();
  }
  
  @Override
  public Current_reference_upper.Match newMatch(final Object... parameters) {
    return Current_reference_upper.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (java.lang.Integer) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_upper (visibility: PUBLIC, simpleName: Current_reference_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_upper (visibility: PUBLIC, simpleName: Current_reference_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_reference_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_reference_upper INSTANCE = new Current_reference_upper();
    
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
    private final static Current_reference_upper.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pUpper = new PParameter("upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pReference, parameter_pCurrent_reference, parameter_pUpper);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_reference_upper";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","current_reference","upper");
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
          PVariable var_upper = body.getOrCreateVariableByName("upper");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference),
             new ExportedParameter(body, var_upper, parameter_pUpper)
          ));
          // 	find current_structuralFeature_upper (reference, current_reference, upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_current_reference, var_upper), Current_structuralFeature_upper.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}