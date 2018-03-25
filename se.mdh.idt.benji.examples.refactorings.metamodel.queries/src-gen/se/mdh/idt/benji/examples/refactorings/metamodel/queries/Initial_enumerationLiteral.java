/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/EnumerationLiteral.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_modelElement;
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
public final class Initial_enumerationLiteral extends BaseGeneratedEMFQuerySpecification<Initial_enumerationLiteral.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_enumerationLiteral pattern,
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
    private TraceLink fEnumerationLiteral;
    
    private EnumerationLiteral fInitial_enumerationLiteral;
    
    private static List<String> parameterNames = makeImmutableList("enumerationLiteral", "initial_enumerationLiteral");
    
    private Match(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      this.fEnumerationLiteral = pEnumerationLiteral;
      this.fInitial_enumerationLiteral = pInitial_enumerationLiteral;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("enumerationLiteral".equals(parameterName)) return this.fEnumerationLiteral;
      if ("initial_enumerationLiteral".equals(parameterName)) return this.fInitial_enumerationLiteral;
      return null;
    }
    
    public TraceLink getEnumerationLiteral() {
      return this.fEnumerationLiteral;
    }
    
    public EnumerationLiteral getInitial_enumerationLiteral() {
      return this.fInitial_enumerationLiteral;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("enumerationLiteral".equals(parameterName) ) {
          this.fEnumerationLiteral = (TraceLink) newValue;
          return true;
      }
      if ("initial_enumerationLiteral".equals(parameterName) ) {
          this.fInitial_enumerationLiteral = (EnumerationLiteral) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnumerationLiteral(final TraceLink pEnumerationLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumerationLiteral = pEnumerationLiteral;
    }
    
    public void setInitial_enumerationLiteral(final EnumerationLiteral pInitial_enumerationLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_enumerationLiteral = pInitial_enumerationLiteral;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_enumerationLiteral";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_enumerationLiteral.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnumerationLiteral, fInitial_enumerationLiteral};
    }
    
    @Override
    public Initial_enumerationLiteral.Match toImmutable() {
      return isMutable() ? newMatch(fEnumerationLiteral, fInitial_enumerationLiteral) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"enumerationLiteral\"=" + prettyPrintValue(fEnumerationLiteral) + ", ");
      result.append("\"initial_enumerationLiteral\"=" + prettyPrintValue(fInitial_enumerationLiteral));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fEnumerationLiteral, fInitial_enumerationLiteral);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_enumerationLiteral.Match)) {
          Initial_enumerationLiteral.Match other = (Initial_enumerationLiteral.Match) obj;
          return Objects.equals(fEnumerationLiteral, other.fEnumerationLiteral) && Objects.equals(fInitial_enumerationLiteral, other.fInitial_enumerationLiteral);
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
    public Initial_enumerationLiteral specification() {
      return Initial_enumerationLiteral.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_enumerationLiteral.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_enumerationLiteral.Match newMutableMatch(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      return new Mutable(pEnumerationLiteral, pInitial_enumerationLiteral);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_enumerationLiteral.Match newMatch(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      return new Immutable(pEnumerationLiteral, pInitial_enumerationLiteral);
    }
    
    private static final class Mutable extends Initial_enumerationLiteral.Match {
      Mutable(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
        super(pEnumerationLiteral, pInitial_enumerationLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_enumerationLiteral.Match {
      Immutable(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
        super(pEnumerationLiteral, pInitial_enumerationLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_enumerationLiteral pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration literal - initial
   * pattern initial_enumerationLiteral (enumerationLiteral : TraceLink, initial_enumerationLiteral : EnumerationLiteral) {
   * 	find initial_modelElement (enumerationLiteral, initial_enumerationLiteral);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_enumerationLiteral
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_enumerationLiteral.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_enumerationLiteral.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_enumerationLiteral.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ENUMERATIONLITERAL = 0;
    
    private final static int POSITION_INITIAL_ENUMERATIONLITERAL = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_enumerationLiteral.Matcher.class);
    
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
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_enumerationLiteral.Match> getAllMatches(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      return rawGetAllMatches(new Object[]{pEnumerationLiteral, pInitial_enumerationLiteral});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_enumerationLiteral.Match getOneArbitraryMatch(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      return rawGetOneArbitraryMatch(new Object[]{pEnumerationLiteral, pInitial_enumerationLiteral});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      return rawHasMatch(new Object[]{pEnumerationLiteral, pInitial_enumerationLiteral});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      return rawCountMatches(new Object[]{pEnumerationLiteral, pInitial_enumerationLiteral});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral, final IMatchProcessor<? super Initial_enumerationLiteral.Match> processor) {
      rawForEachMatch(new Object[]{pEnumerationLiteral, pInitial_enumerationLiteral}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral, final IMatchProcessor<? super Initial_enumerationLiteral.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnumerationLiteral, pInitial_enumerationLiteral}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pInitial_enumerationLiteral the fixed value of pattern parameter initial_enumerationLiteral, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_enumerationLiteral.Match newMatch(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral) {
      return Initial_enumerationLiteral.Match.newMatch(pEnumerationLiteral, pInitial_enumerationLiteral);
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfenumerationLiteral(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ENUMERATIONLITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral() {
      return rawAccumulateAllValuesOfenumerationLiteral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral(final Initial_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfenumerationLiteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral(final EnumerationLiteral pInitial_enumerationLiteral) {
      return rawAccumulateAllValuesOfenumerationLiteral(new Object[]{
      null, 
      pInitial_enumerationLiteral
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EnumerationLiteral> rawAccumulateAllValuesOfinitial_enumerationLiteral(final Object[] parameters) {
      Set<EnumerationLiteral> results = new HashSet<EnumerationLiteral>();
      rawAccumulateAllValues(POSITION_INITIAL_ENUMERATIONLITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_enumerationLiteral() {
      return rawAccumulateAllValuesOfinitial_enumerationLiteral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_enumerationLiteral(final Initial_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_enumerationLiteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_enumerationLiteral(final TraceLink pEnumerationLiteral) {
      return rawAccumulateAllValuesOfinitial_enumerationLiteral(new Object[]{
      pEnumerationLiteral, 
      null
      });
    }
    
    @Override
    protected Initial_enumerationLiteral.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_enumerationLiteral.Match.newMatch((TraceLink) t.get(POSITION_ENUMERATIONLITERAL), (EnumerationLiteral) t.get(POSITION_INITIAL_ENUMERATIONLITERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_enumerationLiteral.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_enumerationLiteral.Match.newMatch((TraceLink) match[POSITION_ENUMERATIONLITERAL], (EnumerationLiteral) match[POSITION_INITIAL_ENUMERATIONLITERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_enumerationLiteral.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_enumerationLiteral.Match.newMutableMatch((TraceLink) match[POSITION_ENUMERATIONLITERAL], (EnumerationLiteral) match[POSITION_INITIAL_ENUMERATIONLITERAL]);
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
    public static IQuerySpecification<Initial_enumerationLiteral.Matcher> querySpecification() {
      return Initial_enumerationLiteral.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_enumerationLiteral pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_enumerationLiteral.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEnumerationLiteral the value of pattern parameter enumerationLiteral in the currently processed match
     * @param pInitial_enumerationLiteral the value of pattern parameter initial_enumerationLiteral in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pEnumerationLiteral, final EnumerationLiteral pInitial_enumerationLiteral);
    
    @Override
    public void process(final Initial_enumerationLiteral.Match match) {
      process(match.getEnumerationLiteral(), match.getInitial_enumerationLiteral());
    }
  }
  
  private Initial_enumerationLiteral() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_enumerationLiteral instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_enumerationLiteral.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_enumerationLiteral.Matcher.on(engine);
  }
  
  @Override
  public Initial_enumerationLiteral.Matcher instantiate() {
    return Initial_enumerationLiteral.Matcher.create();
  }
  
  @Override
  public Initial_enumerationLiteral.Match newEmptyMatch() {
    return Initial_enumerationLiteral.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_enumerationLiteral.Match newMatch(final Object... parameters) {
    return Initial_enumerationLiteral.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral (visibility: PUBLIC, simpleName: Initial_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral (visibility: PUBLIC, simpleName: Initial_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_enumerationLiteral INSTANCE = new Initial_enumerationLiteral();
    
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
    private final static Initial_enumerationLiteral.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEnumerationLiteral = new PParameter("enumerationLiteral", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_enumerationLiteral = new PParameter("initial_enumerationLiteral", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEnumerationLiteral, parameter_pInitial_enumerationLiteral);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_enumerationLiteral";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("enumerationLiteral","initial_enumerationLiteral");
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
          PVariable var_enumerationLiteral = body.getOrCreateVariableByName("enumerationLiteral");
          PVariable var_initial_enumerationLiteral = body.getOrCreateVariableByName("initial_enumerationLiteral");
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumerationLiteral), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_enumerationLiteral), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_enumerationLiteral, parameter_pEnumerationLiteral),
             new ExportedParameter(body, var_initial_enumerationLiteral, parameter_pInitial_enumerationLiteral)
          ));
          // 	find initial_modelElement (enumerationLiteral, initial_enumerationLiteral)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumerationLiteral, var_initial_enumerationLiteral), Initial_modelElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
