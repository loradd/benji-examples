/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/MetamodelQueries.vql
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
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IMatchProcessor;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:23+0200")
public final class $current_reference_containment extends BaseGeneratedEMFQuerySpecification<$current_reference_containment.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment pattern,
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
    
    private Boolean fContainment;
    
    private static List<String> parameterNames = makeImmutableList("reference", "current_reference", "containment");
    
    private Match(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      this.fReference = pReference;
      this.fCurrent_reference = pCurrent_reference;
      this.fContainment = pContainment;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      if ("containment".equals(parameterName)) return this.fContainment;
      return null;
    }
    
    public TraceLink getReference() {
      return this.fReference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
    }
    
    public Boolean getContainment() {
      return this.fContainment;
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
      if ("containment".equals(parameterName) ) {
          this.fContainment = (Boolean) newValue;
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
    
    public void setContainment(final Boolean pContainment) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fContainment = pContainment;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_reference_containment.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fCurrent_reference, fContainment};
    }
    
    @Override
    public $current_reference_containment.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fCurrent_reference, fContainment) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference) + ", ");
      result.append("\"containment\"=" + prettyPrintValue(fContainment));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fReference, fCurrent_reference, fContainment);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_reference_containment.Match)) {
          $current_reference_containment.Match other = ($current_reference_containment.Match) obj;
          return Objects.equals(fReference, other.fReference) && Objects.equals(fCurrent_reference, other.fCurrent_reference) && Objects.equals(fContainment, other.fContainment);
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
    public $current_reference_containment specification() {
      return $current_reference_containment.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_reference_containment.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_reference_containment.Match newMutableMatch(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      return new Mutable(pReference, pCurrent_reference, pContainment);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_reference_containment.Match newMatch(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      return new Immutable(pReference, pCurrent_reference, pContainment);
    }
    
    private static final class Mutable extends $current_reference_containment.Match {
      Mutable(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
        super(pReference, pCurrent_reference, pContainment);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_reference_containment.Match {
      Immutable(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
        super(pReference, pCurrent_reference, pContainment);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - containment - current
   * pattern $current_reference_containment (reference : TraceLink, current_reference : Reference, containment : java Boolean) {
   * 	find $current_reference (reference, current_reference);
   * 	Reference.containment (current_reference, containment);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_reference_containment
   * 
   */
  public static class Matcher extends BaseMatcher<$current_reference_containment.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_reference_containment.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_reference_containment.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_REFERENCE = 0;
    
    private final static int POSITION_CURRENT_REFERENCE = 1;
    
    private final static int POSITION_CONTAINMENT = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_reference_containment.Matcher.class);
    
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
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_reference_containment.Match> getAllMatches(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      return rawGetAllMatches(new Object[]{pReference, pCurrent_reference, pContainment});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_reference_containment.Match getOneArbitraryMatch(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pCurrent_reference, pContainment});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      return rawHasMatch(new Object[]{pReference, pCurrent_reference, pContainment});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      return rawCountMatches(new Object[]{pReference, pCurrent_reference, pContainment});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment, final IMatchProcessor<? super $current_reference_containment.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pCurrent_reference, pContainment}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment, final IMatchProcessor<? super $current_reference_containment.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pCurrent_reference, pContainment}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_reference_containment.Match newMatch(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment) {
      return $current_reference_containment.Match.newMatch(pReference, pCurrent_reference, pContainment);
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
    public Set<TraceLink> getAllValuesOfreference(final $current_reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final Reference pCurrent_reference, final Boolean pContainment) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      null, 
      pCurrent_reference, 
      pContainment
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
    public Set<Reference> getAllValuesOfcurrent_reference(final $current_reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final TraceLink pReference, final Boolean pContainment) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pReference, 
      null, 
      pContainment
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Boolean> rawAccumulateAllValuesOfcontainment(final Object[] parameters) {
      Set<Boolean> results = new HashSet<Boolean>();
      rawAccumulateAllValues(POSITION_CONTAINMENT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcontainment() {
      return rawAccumulateAllValuesOfcontainment(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcontainment(final $current_reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfcontainment(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcontainment(final TraceLink pReference, final Reference pCurrent_reference) {
      return rawAccumulateAllValuesOfcontainment(new Object[]{
      pReference, 
      pCurrent_reference, 
      null
      });
    }
    
    @Override
    protected $current_reference_containment.Match tupleToMatch(final Tuple t) {
      try {
          return $current_reference_containment.Match.newMatch((TraceLink) t.get(POSITION_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE), (Boolean) t.get(POSITION_CONTAINMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_reference_containment.Match arrayToMatch(final Object[] match) {
      try {
          return $current_reference_containment.Match.newMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Boolean) match[POSITION_CONTAINMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_reference_containment.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_reference_containment.Match.newMutableMatch((TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (Boolean) match[POSITION_CONTAINMENT]);
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
    public static IQuerySpecification<$current_reference_containment.Matcher> querySpecification() {
      return $current_reference_containment.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_reference_containment.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * @param pContainment the value of pattern parameter containment in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pReference, final Reference pCurrent_reference, final Boolean pContainment);
    
    @Override
    public void process(final $current_reference_containment.Match match) {
      process(match.getReference(), match.getCurrent_reference(), match.getContainment());
    }
  }
  
  private $current_reference_containment() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_reference_containment instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_reference_containment.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_reference_containment.Matcher.on(engine);
  }
  
  @Override
  public $current_reference_containment.Matcher instantiate() {
    return $current_reference_containment.Matcher.create();
  }
  
  @Override
  public $current_reference_containment.Match newEmptyMatch() {
    return $current_reference_containment.Match.newEmptyMatch();
  }
  
  @Override
  public $current_reference_containment.Match newMatch(final Object... parameters) {
    return $current_reference_containment.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (java.lang.Boolean) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment (visibility: PUBLIC, simpleName: $current_reference_containment, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment (visibility: PUBLIC, simpleName: $current_reference_containment, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_reference_containment INSTANCE = new $current_reference_containment();
    
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
    private final static $current_reference_containment.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pContainment = new PParameter("containment", "java.lang.Boolean", new JavaTransitiveInstancesKey(java.lang.Boolean.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pReference, parameter_pCurrent_reference, parameter_pContainment);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","current_reference","containment");
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
          PVariable var_containment = body.getOrCreateVariableByName("containment");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_containment), new JavaTransitiveInstancesKey(java.lang.Boolean.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference),
             new ExportedParameter(body, var_containment, parameter_pContainment)
          ));
          // 	find $current_reference (reference, current_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_current_reference), $current_reference.instance().getInternalQueryRepresentation());
          // 	Reference.containment (current_reference, containment)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference", "containment")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EBooleanObject")));
          new Equality(body, var__virtual_0_, var_containment);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
