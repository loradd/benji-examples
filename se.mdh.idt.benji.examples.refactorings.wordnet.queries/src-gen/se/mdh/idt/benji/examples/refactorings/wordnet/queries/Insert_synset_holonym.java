/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/SynsetQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.wordnet.queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_holonym;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_holonym;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T22:01+0200")
public final class Insert_synset_holonym extends BaseGeneratedEMFQuerySpecification<Insert_synset_holonym.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_holonym pattern,
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
    private TraceLink fSynset;
    
    private TraceLink fHolonym;
    
    private static List<String> parameterNames = makeImmutableList("synset", "holonym");
    
    private Match(final TraceLink pSynset, final TraceLink pHolonym) {
      this.fSynset = pSynset;
      this.fHolonym = pHolonym;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("synset".equals(parameterName)) return this.fSynset;
      if ("holonym".equals(parameterName)) return this.fHolonym;
      return null;
    }
    
    public TraceLink getSynset() {
      return this.fSynset;
    }
    
    public TraceLink getHolonym() {
      return this.fHolonym;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("synset".equals(parameterName) ) {
          this.fSynset = (TraceLink) newValue;
          return true;
      }
      if ("holonym".equals(parameterName) ) {
          this.fHolonym = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setSynset(final TraceLink pSynset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSynset = pSynset;
    }
    
    public void setHolonym(final TraceLink pHolonym) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fHolonym = pHolonym;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_holonym";
    }
    
    @Override
    public List<String> parameterNames() {
      return Insert_synset_holonym.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSynset, fHolonym};
    }
    
    @Override
    public Insert_synset_holonym.Match toImmutable() {
      return isMutable() ? newMatch(fSynset, fHolonym) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"synset\"=" + prettyPrintValue(fSynset) + ", ");
      result.append("\"holonym\"=" + prettyPrintValue(fHolonym));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSynset, fHolonym);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Insert_synset_holonym.Match)) {
          Insert_synset_holonym.Match other = (Insert_synset_holonym.Match) obj;
          return Objects.equals(fSynset, other.fSynset) && Objects.equals(fHolonym, other.fHolonym);
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
    public Insert_synset_holonym specification() {
      return Insert_synset_holonym.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Insert_synset_holonym.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Insert_synset_holonym.Match newMutableMatch(final TraceLink pSynset, final TraceLink pHolonym) {
      return new Mutable(pSynset, pHolonym);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Insert_synset_holonym.Match newMatch(final TraceLink pSynset, final TraceLink pHolonym) {
      return new Immutable(pSynset, pHolonym);
    }
    
    private static final class Mutable extends Insert_synset_holonym.Match {
      Mutable(final TraceLink pSynset, final TraceLink pHolonym) {
        super(pSynset, pHolonym);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Insert_synset_holonym.Match {
      Immutable(final TraceLink pSynset, final TraceLink pHolonym) {
        super(pSynset, pHolonym);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_holonym pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // synset - holonyms - insert
   * pattern insert_synset_holonym (synset : TraceLink, holonym : TraceLink) {
   * 	neg find initial_synset_holonym (synset, _initial_synset, holonym, _initial_holonym);
   * 	find current_synset_holonym (synset, _current_synset, holonym, _current_holonym); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Insert_synset_holonym
   * 
   */
  public static class Matcher extends BaseMatcher<Insert_synset_holonym.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Insert_synset_holonym.Matcher on(final ViatraQueryEngine engine) {
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
    public static Insert_synset_holonym.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_SYNSET = 0;
    
    private final static int POSITION_HOLONYM = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Insert_synset_holonym.Matcher.class);
    
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
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Insert_synset_holonym.Match> getAllMatches(final TraceLink pSynset, final TraceLink pHolonym) {
      return rawGetAllMatches(new Object[]{pSynset, pHolonym});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Insert_synset_holonym.Match getOneArbitraryMatch(final TraceLink pSynset, final TraceLink pHolonym) {
      return rawGetOneArbitraryMatch(new Object[]{pSynset, pHolonym});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pSynset, final TraceLink pHolonym) {
      return rawHasMatch(new Object[]{pSynset, pHolonym});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pSynset, final TraceLink pHolonym) {
      return rawCountMatches(new Object[]{pSynset, pHolonym});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pSynset, final TraceLink pHolonym, final IMatchProcessor<? super Insert_synset_holonym.Match> processor) {
      rawForEachMatch(new Object[]{pSynset, pHolonym}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pSynset, final TraceLink pHolonym, final IMatchProcessor<? super Insert_synset_holonym.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSynset, pHolonym}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pHolonym the fixed value of pattern parameter holonym, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Insert_synset_holonym.Match newMatch(final TraceLink pSynset, final TraceLink pHolonym) {
      return Insert_synset_holonym.Match.newMatch(pSynset, pHolonym);
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfsynset(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_SYNSET, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsynset() {
      return rawAccumulateAllValuesOfsynset(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsynset(final Insert_synset_holonym.Match partialMatch) {
      return rawAccumulateAllValuesOfsynset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsynset(final TraceLink pHolonym) {
      return rawAccumulateAllValuesOfsynset(new Object[]{
      null, 
      pHolonym
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for holonym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfholonym(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_HOLONYM, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for holonym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfholonym() {
      return rawAccumulateAllValuesOfholonym(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for holonym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfholonym(final Insert_synset_holonym.Match partialMatch) {
      return rawAccumulateAllValuesOfholonym(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for holonym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfholonym(final TraceLink pSynset) {
      return rawAccumulateAllValuesOfholonym(new Object[]{
      pSynset, 
      null
      });
    }
    
    @Override
    protected Insert_synset_holonym.Match tupleToMatch(final Tuple t) {
      try {
          return Insert_synset_holonym.Match.newMatch((TraceLink) t.get(POSITION_SYNSET), (TraceLink) t.get(POSITION_HOLONYM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Insert_synset_holonym.Match arrayToMatch(final Object[] match) {
      try {
          return Insert_synset_holonym.Match.newMatch((TraceLink) match[POSITION_SYNSET], (TraceLink) match[POSITION_HOLONYM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Insert_synset_holonym.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Insert_synset_holonym.Match.newMutableMatch((TraceLink) match[POSITION_SYNSET], (TraceLink) match[POSITION_HOLONYM]);
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
    public static IQuerySpecification<Insert_synset_holonym.Matcher> querySpecification() {
      return Insert_synset_holonym.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_holonym pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Insert_synset_holonym.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pSynset the value of pattern parameter synset in the currently processed match
     * @param pHolonym the value of pattern parameter holonym in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pSynset, final TraceLink pHolonym);
    
    @Override
    public void process(final Insert_synset_holonym.Match match) {
      process(match.getSynset(), match.getHolonym());
    }
  }
  
  private Insert_synset_holonym() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Insert_synset_holonym instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Insert_synset_holonym.Matcher instantiate(final ViatraQueryEngine engine) {
    return Insert_synset_holonym.Matcher.on(engine);
  }
  
  @Override
  public Insert_synset_holonym.Matcher instantiate() {
    return Insert_synset_holonym.Matcher.create();
  }
  
  @Override
  public Insert_synset_holonym.Match newEmptyMatch() {
    return Insert_synset_holonym.Match.newEmptyMatch();
  }
  
  @Override
  public Insert_synset_holonym.Match newMatch(final Object... parameters) {
    return Insert_synset_holonym.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_holonym (visibility: PUBLIC, simpleName: Insert_synset_holonym, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_holonym, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_holonym (visibility: PUBLIC, simpleName: Insert_synset_holonym, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_holonym, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Insert_synset_holonym INSTANCE = new Insert_synset_holonym();
    
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
    private final static Insert_synset_holonym.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSynset = new PParameter("synset", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pHolonym = new PParameter("holonym", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSynset, parameter_pHolonym);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_holonym";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("synset","holonym");
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
          PVariable var_synset = body.getOrCreateVariableByName("synset");
          PVariable var_holonym = body.getOrCreateVariableByName("holonym");
          PVariable var__initial_synset = body.getOrCreateVariableByName("_initial_synset");
          PVariable var__initial_holonym = body.getOrCreateVariableByName("_initial_holonym");
          PVariable var__current_synset = body.getOrCreateVariableByName("_current_synset");
          PVariable var__current_holonym = body.getOrCreateVariableByName("_current_holonym");
          new TypeConstraint(body, Tuples.flatTupleOf(var_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_holonym), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_synset, parameter_pSynset),
             new ExportedParameter(body, var_holonym, parameter_pHolonym)
          ));
          // 	neg find initial_synset_holonym (synset, _initial_synset, holonym, _initial_holonym)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_synset, var__initial_synset, var_holonym, var__initial_holonym), Initial_synset_holonym.instance().getInternalQueryRepresentation());
          // 	find current_synset_holonym (synset, _current_synset, holonym, _current_holonym)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_synset, var__current_synset, var_holonym, var__current_holonym), Current_synset_holonym.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
