/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Metamodel.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_reference_containment;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_reference_containment;
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
public final class $reference_containment extends BaseGeneratedEMFQuerySpecification<$reference_containment.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment pattern,
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
    
    private Boolean fContainment;
    
    private static List<String> parameterNames = makeImmutableList("reference", "containment");
    
    private Match(final TraceLink pReference, final Boolean pContainment) {
      this.fReference = pReference;
      this.fContainment = pContainment;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("containment".equals(parameterName)) return this.fContainment;
      return null;
    }
    
    public TraceLink getReference() {
      return this.fReference;
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
    
    public void setContainment(final Boolean pContainment) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fContainment = pContainment;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment";
    }
    
    @Override
    public List<String> parameterNames() {
      return $reference_containment.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fContainment};
    }
    
    @Override
    public $reference_containment.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fContainment) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"containment\"=" + prettyPrintValue(fContainment));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fReference, fContainment);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $reference_containment.Match)) {
          $reference_containment.Match other = ($reference_containment.Match) obj;
          return Objects.equals(fReference, other.fReference) && Objects.equals(fContainment, other.fContainment);
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
    public $reference_containment specification() {
      return $reference_containment.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $reference_containment.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $reference_containment.Match newMutableMatch(final TraceLink pReference, final Boolean pContainment) {
      return new Mutable(pReference, pContainment);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $reference_containment.Match newMatch(final TraceLink pReference, final Boolean pContainment) {
      return new Immutable(pReference, pContainment);
    }
    
    private static final class Mutable extends $reference_containment.Match {
      Mutable(final TraceLink pReference, final Boolean pContainment) {
        super(pReference, pContainment);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $reference_containment.Match {
      Immutable(final TraceLink pReference, final Boolean pContainment) {
        super(pReference, pContainment);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - containment - get
   * pattern $reference_containment (reference : TraceLink, containment : java Boolean) {
   * 	find $initial_reference_containment (reference, _initial_reference, containment); 
   * 	find $current_reference_containment (reference, _current_reference, containment);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $reference_containment
   * 
   */
  public static class Matcher extends BaseMatcher<$reference_containment.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $reference_containment.Matcher on(final ViatraQueryEngine engine) {
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
    public static $reference_containment.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_REFERENCE = 0;
    
    private final static int POSITION_CONTAINMENT = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($reference_containment.Matcher.class);
    
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
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$reference_containment.Match> getAllMatches(final TraceLink pReference, final Boolean pContainment) {
      return rawGetAllMatches(new Object[]{pReference, pContainment});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $reference_containment.Match getOneArbitraryMatch(final TraceLink pReference, final Boolean pContainment) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pContainment});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pReference, final Boolean pContainment) {
      return rawHasMatch(new Object[]{pReference, pContainment});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pReference, final Boolean pContainment) {
      return rawCountMatches(new Object[]{pReference, pContainment});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pReference, final Boolean pContainment, final IMatchProcessor<? super $reference_containment.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pContainment}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pReference, final Boolean pContainment, final IMatchProcessor<? super $reference_containment.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pContainment}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pContainment the fixed value of pattern parameter containment, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $reference_containment.Match newMatch(final TraceLink pReference, final Boolean pContainment) {
      return $reference_containment.Match.newMatch(pReference, pContainment);
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
    public Set<TraceLink> getAllValuesOfreference(final $reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final Boolean pContainment) {
      return rawAccumulateAllValuesOfreference(new Object[]{
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
    public Set<Boolean> getAllValuesOfcontainment(final $reference_containment.Match partialMatch) {
      return rawAccumulateAllValuesOfcontainment(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for containment.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Boolean> getAllValuesOfcontainment(final TraceLink pReference) {
      return rawAccumulateAllValuesOfcontainment(new Object[]{
      pReference, 
      null
      });
    }
    
    @Override
    protected $reference_containment.Match tupleToMatch(final Tuple t) {
      try {
          return $reference_containment.Match.newMatch((TraceLink) t.get(POSITION_REFERENCE), (Boolean) t.get(POSITION_CONTAINMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $reference_containment.Match arrayToMatch(final Object[] match) {
      try {
          return $reference_containment.Match.newMatch((TraceLink) match[POSITION_REFERENCE], (Boolean) match[POSITION_CONTAINMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $reference_containment.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $reference_containment.Match.newMutableMatch((TraceLink) match[POSITION_REFERENCE], (Boolean) match[POSITION_CONTAINMENT]);
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
    public static IQuerySpecification<$reference_containment.Matcher> querySpecification() {
      return $reference_containment.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$reference_containment.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pContainment the value of pattern parameter containment in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pReference, final Boolean pContainment);
    
    @Override
    public void process(final $reference_containment.Match match) {
      process(match.getReference(), match.getContainment());
    }
  }
  
  private $reference_containment() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $reference_containment instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $reference_containment.Matcher instantiate(final ViatraQueryEngine engine) {
    return $reference_containment.Matcher.on(engine);
  }
  
  @Override
  public $reference_containment.Matcher instantiate() {
    return $reference_containment.Matcher.create();
  }
  
  @Override
  public $reference_containment.Match newEmptyMatch() {
    return $reference_containment.Match.newEmptyMatch();
  }
  
  @Override
  public $reference_containment.Match newMatch(final Object... parameters) {
    return $reference_containment.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.Boolean) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment (visibility: PUBLIC, simpleName: $reference_containment, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment (visibility: PUBLIC, simpleName: $reference_containment, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $reference_containment INSTANCE = new $reference_containment();
    
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
    private final static $reference_containment.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pContainment = new PParameter("containment", "java.lang.Boolean", new JavaTransitiveInstancesKey(java.lang.Boolean.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pReference, parameter_pContainment);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$reference_containment";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","containment");
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
          PVariable var_containment = body.getOrCreateVariableByName("containment");
          PVariable var__initial_reference = body.getOrCreateVariableByName("_initial_reference");
          PVariable var__current_reference = body.getOrCreateVariableByName("_current_reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_containment), new JavaTransitiveInstancesKey(java.lang.Boolean.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_containment, parameter_pContainment)
          ));
          // 	find $initial_reference_containment (reference, _initial_reference, containment)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var__initial_reference, var_containment), $initial_reference_containment.instance().getInternalQueryRepresentation());
          //  	find $current_reference_containment (reference, _current_reference, containment)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var__current_reference, var_containment), $current_reference_containment.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
