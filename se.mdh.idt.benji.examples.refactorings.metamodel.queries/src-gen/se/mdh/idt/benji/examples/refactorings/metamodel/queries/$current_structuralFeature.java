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
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_modelElement;
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
public final class $current_structuralFeature extends BaseGeneratedEMFQuerySpecification<$current_structuralFeature.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("structuralFeature", "current_structuralFeature");
    
    private Match(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      this.fStructuralFeature = pStructuralFeature;
      this.fCurrent_structuralFeature = pCurrent_structuralFeature;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("structuralFeature".equals(parameterName)) return this.fStructuralFeature;
      if ("current_structuralFeature".equals(parameterName)) return this.fCurrent_structuralFeature;
      return null;
    }
    
    public TraceLink getStructuralFeature() {
      return this.fStructuralFeature;
    }
    
    public StructuralFeature getCurrent_structuralFeature() {
      return this.fCurrent_structuralFeature;
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
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_structuralFeature.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fStructuralFeature, fCurrent_structuralFeature};
    }
    
    @Override
    public $current_structuralFeature.Match toImmutable() {
      return isMutable() ? newMatch(fStructuralFeature, fCurrent_structuralFeature) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"structuralFeature\"=" + prettyPrintValue(fStructuralFeature) + ", ");
      result.append("\"current_structuralFeature\"=" + prettyPrintValue(fCurrent_structuralFeature));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fStructuralFeature, fCurrent_structuralFeature);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_structuralFeature.Match)) {
          $current_structuralFeature.Match other = ($current_structuralFeature.Match) obj;
          return Objects.equals(fStructuralFeature, other.fStructuralFeature) && Objects.equals(fCurrent_structuralFeature, other.fCurrent_structuralFeature);
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
    public $current_structuralFeature specification() {
      return $current_structuralFeature.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_structuralFeature.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_structuralFeature.Match newMutableMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      return new Mutable(pStructuralFeature, pCurrent_structuralFeature);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_structuralFeature.Match newMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      return new Immutable(pStructuralFeature, pCurrent_structuralFeature);
    }
    
    private static final class Mutable extends $current_structuralFeature.Match {
      Mutable(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
        super(pStructuralFeature, pCurrent_structuralFeature);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_structuralFeature.Match {
      Immutable(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
        super(pStructuralFeature, pCurrent_structuralFeature);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // structural feature - current
   * pattern $current_structuralFeature (structuralFeature : TraceLink, current_structuralFeature : StructuralFeature) {
   * 	find $current_modelElement (structuralFeature, current_structuralFeature);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_structuralFeature
   * 
   */
  public static class Matcher extends BaseMatcher<$current_structuralFeature.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_structuralFeature.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_structuralFeature.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_STRUCTURALFEATURE = 0;
    
    private final static int POSITION_CURRENT_STRUCTURALFEATURE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_structuralFeature.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_structuralFeature.Match> getAllMatches(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      return rawGetAllMatches(new Object[]{pStructuralFeature, pCurrent_structuralFeature});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_structuralFeature.Match getOneArbitraryMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      return rawGetOneArbitraryMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      return rawHasMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      return rawCountMatches(new Object[]{pStructuralFeature, pCurrent_structuralFeature});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final IMatchProcessor<? super $current_structuralFeature.Match> processor) {
      rawForEachMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature, final IMatchProcessor<? super $current_structuralFeature.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pStructuralFeature, pCurrent_structuralFeature}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pCurrent_structuralFeature the fixed value of pattern parameter current_structuralFeature, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_structuralFeature.Match newMatch(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature) {
      return $current_structuralFeature.Match.newMatch(pStructuralFeature, pCurrent_structuralFeature);
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
    public Set<TraceLink> getAllValuesOfstructuralFeature(final $current_structuralFeature.Match partialMatch) {
      return rawAccumulateAllValuesOfstructuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final StructuralFeature pCurrent_structuralFeature) {
      return rawAccumulateAllValuesOfstructuralFeature(new Object[]{
      null, 
      pCurrent_structuralFeature
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
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final $current_structuralFeature.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfcurrent_structuralFeature(final TraceLink pStructuralFeature) {
      return rawAccumulateAllValuesOfcurrent_structuralFeature(new Object[]{
      pStructuralFeature, 
      null
      });
    }
    
    @Override
    protected $current_structuralFeature.Match tupleToMatch(final Tuple t) {
      try {
          return $current_structuralFeature.Match.newMatch((TraceLink) t.get(POSITION_STRUCTURALFEATURE), (StructuralFeature) t.get(POSITION_CURRENT_STRUCTURALFEATURE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_structuralFeature.Match arrayToMatch(final Object[] match) {
      try {
          return $current_structuralFeature.Match.newMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_structuralFeature.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_structuralFeature.Match.newMutableMatch((TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_CURRENT_STRUCTURALFEATURE]);
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
    public static IQuerySpecification<$current_structuralFeature.Matcher> querySpecification() {
      return $current_structuralFeature.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_structuralFeature.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pStructuralFeature the value of pattern parameter structuralFeature in the currently processed match
     * @param pCurrent_structuralFeature the value of pattern parameter current_structuralFeature in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pStructuralFeature, final StructuralFeature pCurrent_structuralFeature);
    
    @Override
    public void process(final $current_structuralFeature.Match match) {
      process(match.getStructuralFeature(), match.getCurrent_structuralFeature());
    }
  }
  
  private $current_structuralFeature() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_structuralFeature instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_structuralFeature.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_structuralFeature.Matcher.on(engine);
  }
  
  @Override
  public $current_structuralFeature.Matcher instantiate() {
    return $current_structuralFeature.Matcher.create();
  }
  
  @Override
  public $current_structuralFeature.Match newEmptyMatch() {
    return $current_structuralFeature.Match.newEmptyMatch();
  }
  
  @Override
  public $current_structuralFeature.Match newMatch(final Object... parameters) {
    return $current_structuralFeature.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature (visibility: PUBLIC, simpleName: $current_structuralFeature, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature (visibility: PUBLIC, simpleName: $current_structuralFeature, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_structuralFeature INSTANCE = new $current_structuralFeature();
    
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
    private final static $current_structuralFeature.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pStructuralFeature = new PParameter("structuralFeature", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_structuralFeature = new PParameter("current_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pStructuralFeature, parameter_pCurrent_structuralFeature);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_structuralFeature";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("structuralFeature","current_structuralFeature");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_structuralFeature, parameter_pStructuralFeature),
             new ExportedParameter(body, var_current_structuralFeature, parameter_pCurrent_structuralFeature)
          ));
          // 	find $current_modelElement (structuralFeature, current_structuralFeature)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_structuralFeature, var_current_structuralFeature), $current_modelElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
