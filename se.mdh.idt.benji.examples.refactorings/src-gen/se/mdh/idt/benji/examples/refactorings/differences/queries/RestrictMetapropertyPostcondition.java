/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/RestrictMetaproperty.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_structuralFeature_upper;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class RestrictMetapropertyPostcondition extends BaseGeneratedEMFQuerySpecification<RestrictMetapropertyPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition pattern,
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
    private StructuralFeature fInitial_property;
    
    private StructuralFeature fCurrent_property;
    
    private static List<String> parameterNames = makeImmutableList("initial_property", "current_property");
    
    private Match(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      this.fInitial_property = pInitial_property;
      this.fCurrent_property = pCurrent_property;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_property".equals(parameterName)) return this.fInitial_property;
      if ("current_property".equals(parameterName)) return this.fCurrent_property;
      return null;
    }
    
    public StructuralFeature getInitial_property() {
      return this.fInitial_property;
    }
    
    public StructuralFeature getCurrent_property() {
      return this.fCurrent_property;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_property".equals(parameterName) ) {
          this.fInitial_property = (StructuralFeature) newValue;
          return true;
      }
      if ("current_property".equals(parameterName) ) {
          this.fCurrent_property = (StructuralFeature) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_property(final StructuralFeature pInitial_property) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_property = pInitial_property;
    }
    
    public void setCurrent_property(final StructuralFeature pCurrent_property) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_property = pCurrent_property;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return RestrictMetapropertyPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_property, fCurrent_property};
    }
    
    @Override
    public RestrictMetapropertyPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_property, fCurrent_property) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_property\"=" + prettyPrintValue(fInitial_property) + ", ");
      result.append("\"current_property\"=" + prettyPrintValue(fCurrent_property));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_property, fCurrent_property);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RestrictMetapropertyPostcondition.Match)) {
          RestrictMetapropertyPostcondition.Match other = (RestrictMetapropertyPostcondition.Match) obj;
          return Objects.equals(fInitial_property, other.fInitial_property) && Objects.equals(fCurrent_property, other.fCurrent_property);
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
    public RestrictMetapropertyPostcondition specification() {
      return RestrictMetapropertyPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RestrictMetapropertyPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RestrictMetapropertyPostcondition.Match newMutableMatch(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      return new Mutable(pInitial_property, pCurrent_property);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RestrictMetapropertyPostcondition.Match newMatch(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      return new Immutable(pInitial_property, pCurrent_property);
    }
    
    private static final class Mutable extends RestrictMetapropertyPostcondition.Match {
      Mutable(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
        super(pInitial_property, pCurrent_property);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RestrictMetapropertyPostcondition.Match {
      Immutable(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
        super(pInitial_property, pCurrent_property);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACCR20 - Restrict Metaproperty - Postcondition
   * pattern RestrictMetapropertyPostcondition (initial_property : StructuralFeature, current_property : StructuralFeature) {
   * 	find changed_structuralFeature_upper (initial_property, current_property, initial_upper, current_upper); 
   * 	check (initial_upper {@literal >}= current_upper); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see RestrictMetapropertyPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<RestrictMetapropertyPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RestrictMetapropertyPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static RestrictMetapropertyPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PROPERTY = 0;
    
    private final static int POSITION_CURRENT_PROPERTY = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RestrictMetapropertyPostcondition.Matcher.class);
    
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
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RestrictMetapropertyPostcondition.Match> getAllMatches(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      return rawGetAllMatches(new Object[]{pInitial_property, pCurrent_property});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public RestrictMetapropertyPostcondition.Match getOneArbitraryMatch(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_property, pCurrent_property});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      return rawHasMatch(new Object[]{pInitial_property, pCurrent_property});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      return rawCountMatches(new Object[]{pInitial_property, pCurrent_property});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property, final IMatchProcessor<? super RestrictMetapropertyPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_property, pCurrent_property}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property, final IMatchProcessor<? super RestrictMetapropertyPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_property, pCurrent_property}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RestrictMetapropertyPostcondition.Match newMatch(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property) {
      return RestrictMetapropertyPostcondition.Match.newMatch(pInitial_property, pCurrent_property);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<StructuralFeature> rawAccumulateAllValuesOfinitial_property(final Object[] parameters) {
      Set<StructuralFeature> results = new HashSet<StructuralFeature>();
      rawAccumulateAllValues(POSITION_INITIAL_PROPERTY, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_property() {
      return rawAccumulateAllValuesOfinitial_property(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_property(final RestrictMetapropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_property(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_property(final StructuralFeature pCurrent_property) {
      return rawAccumulateAllValuesOfinitial_property(new Object[]{
      null, 
      pCurrent_property
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<StructuralFeature> rawAccumulateAllValuesOfcurrent_property(final Object[] parameters) {
      Set<StructuralFeature> results = new HashSet<StructuralFeature>();
      rawAccumulateAllValues(POSITION_CURRENT_PROPERTY, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_property() {
      return rawAccumulateAllValuesOfcurrent_property(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_property(final RestrictMetapropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_property(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_property(final StructuralFeature pInitial_property) {
      return rawAccumulateAllValuesOfcurrent_property(new Object[]{
      pInitial_property, 
      null
      });
    }
    
    @Override
    protected RestrictMetapropertyPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return RestrictMetapropertyPostcondition.Match.newMatch((StructuralFeature) t.get(POSITION_INITIAL_PROPERTY), (StructuralFeature) t.get(POSITION_CURRENT_PROPERTY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RestrictMetapropertyPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return RestrictMetapropertyPostcondition.Match.newMatch((StructuralFeature) match[POSITION_INITIAL_PROPERTY], (StructuralFeature) match[POSITION_CURRENT_PROPERTY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RestrictMetapropertyPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RestrictMetapropertyPostcondition.Match.newMutableMatch((StructuralFeature) match[POSITION_INITIAL_PROPERTY], (StructuralFeature) match[POSITION_CURRENT_PROPERTY]);
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
    public static IQuerySpecification<RestrictMetapropertyPostcondition.Matcher> querySpecification() {
      return RestrictMetapropertyPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<RestrictMetapropertyPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_property the value of pattern parameter initial_property in the currently processed match
     * @param pCurrent_property the value of pattern parameter current_property in the currently processed match
     * 
     */
    public abstract void process(final StructuralFeature pInitial_property, final StructuralFeature pCurrent_property);
    
    @Override
    public void process(final RestrictMetapropertyPostcondition.Match match) {
      process(match.getInitial_property(), match.getCurrent_property());
    }
  }
  
  private RestrictMetapropertyPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RestrictMetapropertyPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RestrictMetapropertyPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return RestrictMetapropertyPostcondition.Matcher.on(engine);
  }
  
  @Override
  public RestrictMetapropertyPostcondition.Matcher instantiate() {
    return RestrictMetapropertyPostcondition.Matcher.create();
  }
  
  @Override
  public RestrictMetapropertyPostcondition.Match newEmptyMatch() {
    return RestrictMetapropertyPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public RestrictMetapropertyPostcondition.Match newMatch(final Object... parameters) {
    return RestrictMetapropertyPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition (visibility: PUBLIC, simpleName: RestrictMetapropertyPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition (visibility: PUBLIC, simpleName: RestrictMetapropertyPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RestrictMetapropertyPostcondition INSTANCE = new RestrictMetapropertyPostcondition();
    
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
    private final static RestrictMetapropertyPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_property = new PParameter("initial_property", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_property = new PParameter("current_property", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_property, parameter_pCurrent_property);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.RestrictMetapropertyPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_property","current_property");
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
          PVariable var_initial_property = body.getOrCreateVariableByName("initial_property");
          PVariable var_current_property = body.getOrCreateVariableByName("current_property");
          PVariable var_initial_upper = body.getOrCreateVariableByName("initial_upper");
          PVariable var_current_upper = body.getOrCreateVariableByName("current_upper");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_property, parameter_pInitial_property),
             new ExportedParameter(body, var_current_property, parameter_pCurrent_property)
          ));
          // 	find changed_structuralFeature_upper (initial_property, current_property, initial_upper, current_upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_property, var_current_property, var_initial_upper, var_current_upper), Changed_structuralFeature_upper.instance().getInternalQueryRepresentation());
          //  	check (initial_upper >= current_upper)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern RestrictMetapropertyPostcondition";
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
    boolean _greaterEqualsThan = (initial_upper.compareTo(current_upper) >= 0);
    return _greaterEqualsThan;
  }
}
