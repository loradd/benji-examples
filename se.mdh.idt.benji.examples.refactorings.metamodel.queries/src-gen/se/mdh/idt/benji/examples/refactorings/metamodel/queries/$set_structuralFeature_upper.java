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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_structuralFeature_upper;
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
public final class $set_structuralFeature_upper extends BaseGeneratedEMFQuerySpecification<$set_structuralFeature_upper.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper pattern,
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
    
    private Integer fUpper;
    
    private static List<String> parameterNames = makeImmutableList("structuralFeature", "upper");
    
    private Match(final TraceLink pStructuralFeature, final Integer pUpper) {
      this.fStructuralFeature = pStructuralFeature;
      this.fUpper = pUpper;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("structuralFeature".equals(parameterName)) return this.fStructuralFeature;
      if ("upper".equals(parameterName)) return this.fUpper;
      return null;
    }
    
    public TraceLink getStructuralFeature() {
      return this.fStructuralFeature;
    }
    
    public Integer getUpper() {
      return this.fUpper;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("structuralFeature".equals(parameterName) ) {
          this.fStructuralFeature = (TraceLink) newValue;
          return true;
      }
      if ("upper".equals(parameterName) ) {
          this.fUpper = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setStructuralFeature(final TraceLink pStructuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStructuralFeature = pStructuralFeature;
    }
    
    public void setUpper(final Integer pUpper) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUpper = pUpper;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper";
    }
    
    @Override
    public List<String> parameterNames() {
      return $set_structuralFeature_upper.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fStructuralFeature, fUpper};
    }
    
    @Override
    public $set_structuralFeature_upper.Match toImmutable() {
      return isMutable() ? newMatch(fStructuralFeature, fUpper) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"structuralFeature\"=" + prettyPrintValue(fStructuralFeature) + ", ");
      result.append("\"upper\"=" + prettyPrintValue(fUpper));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fStructuralFeature, fUpper);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $set_structuralFeature_upper.Match)) {
          $set_structuralFeature_upper.Match other = ($set_structuralFeature_upper.Match) obj;
          return Objects.equals(fStructuralFeature, other.fStructuralFeature) && Objects.equals(fUpper, other.fUpper);
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
    public $set_structuralFeature_upper specification() {
      return $set_structuralFeature_upper.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $set_structuralFeature_upper.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $set_structuralFeature_upper.Match newMutableMatch(final TraceLink pStructuralFeature, final Integer pUpper) {
      return new Mutable(pStructuralFeature, pUpper);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $set_structuralFeature_upper.Match newMatch(final TraceLink pStructuralFeature, final Integer pUpper) {
      return new Immutable(pStructuralFeature, pUpper);
    }
    
    private static final class Mutable extends $set_structuralFeature_upper.Match {
      Mutable(final TraceLink pStructuralFeature, final Integer pUpper) {
        super(pStructuralFeature, pUpper);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $set_structuralFeature_upper.Match {
      Immutable(final TraceLink pStructuralFeature, final Integer pUpper) {
        super(pStructuralFeature, pUpper);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // structural feature - upper - set
   * pattern $set_structuralFeature_upper (structuralFeature : TraceLink, upper : java Integer) {
   * 	neg find $initial_structuralFeature_upper (structuralFeature, _initial_structuralFeature, upper);
   * 	find $current_structuralFeature_upper (structuralFeature, _current_structuralFeature, upper);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $set_structuralFeature_upper
   * 
   */
  public static class Matcher extends BaseMatcher<$set_structuralFeature_upper.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $set_structuralFeature_upper.Matcher on(final ViatraQueryEngine engine) {
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
    public static $set_structuralFeature_upper.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_STRUCTURALFEATURE = 0;
    
    private final static int POSITION_UPPER = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($set_structuralFeature_upper.Matcher.class);
    
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
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$set_structuralFeature_upper.Match> getAllMatches(final TraceLink pStructuralFeature, final Integer pUpper) {
      return rawGetAllMatches(new Object[]{pStructuralFeature, pUpper});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $set_structuralFeature_upper.Match getOneArbitraryMatch(final TraceLink pStructuralFeature, final Integer pUpper) {
      return rawGetOneArbitraryMatch(new Object[]{pStructuralFeature, pUpper});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pStructuralFeature, final Integer pUpper) {
      return rawHasMatch(new Object[]{pStructuralFeature, pUpper});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pStructuralFeature, final Integer pUpper) {
      return rawCountMatches(new Object[]{pStructuralFeature, pUpper});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pStructuralFeature, final Integer pUpper, final IMatchProcessor<? super $set_structuralFeature_upper.Match> processor) {
      rawForEachMatch(new Object[]{pStructuralFeature, pUpper}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pStructuralFeature, final Integer pUpper, final IMatchProcessor<? super $set_structuralFeature_upper.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pStructuralFeature, pUpper}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $set_structuralFeature_upper.Match newMatch(final TraceLink pStructuralFeature, final Integer pUpper) {
      return $set_structuralFeature_upper.Match.newMatch(pStructuralFeature, pUpper);
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
    public Set<TraceLink> getAllValuesOfstructuralFeature(final $set_structuralFeature_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfstructuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final Integer pUpper) {
      return rawAccumulateAllValuesOfstructuralFeature(new Object[]{
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
    public Set<Integer> getAllValuesOfupper(final $set_structuralFeature_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfupper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfupper(final TraceLink pStructuralFeature) {
      return rawAccumulateAllValuesOfupper(new Object[]{
      pStructuralFeature, 
      null
      });
    }
    
    @Override
    protected $set_structuralFeature_upper.Match tupleToMatch(final Tuple t) {
      try {
          return $set_structuralFeature_upper.Match.newMatch((TraceLink) t.get(POSITION_STRUCTURALFEATURE), (Integer) t.get(POSITION_UPPER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $set_structuralFeature_upper.Match arrayToMatch(final Object[] match) {
      try {
          return $set_structuralFeature_upper.Match.newMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (Integer) match[POSITION_UPPER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $set_structuralFeature_upper.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $set_structuralFeature_upper.Match.newMutableMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (Integer) match[POSITION_UPPER]);
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
    public static IQuerySpecification<$set_structuralFeature_upper.Matcher> querySpecification() {
      return $set_structuralFeature_upper.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$set_structuralFeature_upper.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pStructuralFeature the value of pattern parameter structuralFeature in the currently processed match
     * @param pUpper the value of pattern parameter upper in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pStructuralFeature, final Integer pUpper);
    
    @Override
    public void process(final $set_structuralFeature_upper.Match match) {
      process(match.getStructuralFeature(), match.getUpper());
    }
  }
  
  private $set_structuralFeature_upper() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $set_structuralFeature_upper instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $set_structuralFeature_upper.Matcher instantiate(final ViatraQueryEngine engine) {
    return $set_structuralFeature_upper.Matcher.on(engine);
  }
  
  @Override
  public $set_structuralFeature_upper.Matcher instantiate() {
    return $set_structuralFeature_upper.Matcher.create();
  }
  
  @Override
  public $set_structuralFeature_upper.Match newEmptyMatch() {
    return $set_structuralFeature_upper.Match.newEmptyMatch();
  }
  
  @Override
  public $set_structuralFeature_upper.Match newMatch(final Object... parameters) {
    return $set_structuralFeature_upper.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper (visibility: PUBLIC, simpleName: $set_structuralFeature_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper (visibility: PUBLIC, simpleName: $set_structuralFeature_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $set_structuralFeature_upper INSTANCE = new $set_structuralFeature_upper();
    
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
    private final static $set_structuralFeature_upper.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pStructuralFeature = new PParameter("structuralFeature", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pUpper = new PParameter("upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pStructuralFeature, parameter_pUpper);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$set_structuralFeature_upper";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("structuralFeature","upper");
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
          PVariable var_upper = body.getOrCreateVariableByName("upper");
          PVariable var__initial_structuralFeature = body.getOrCreateVariableByName("_initial_structuralFeature");
          PVariable var__current_structuralFeature = body.getOrCreateVariableByName("_current_structuralFeature");
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_structuralFeature, parameter_pStructuralFeature),
             new ExportedParameter(body, var_upper, parameter_pUpper)
          ));
          // 	neg find $initial_structuralFeature_upper (structuralFeature, _initial_structuralFeature, upper)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_structuralFeature, var__initial_structuralFeature, var_upper), $initial_structuralFeature_upper.instance().getInternalQueryRepresentation());
          // 	find $current_structuralFeature_upper (structuralFeature, _current_structuralFeature, upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_structuralFeature, var__current_structuralFeature, var_upper), $current_structuralFeature_upper.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
