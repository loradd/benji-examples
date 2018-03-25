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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.wordnet.Synset;
import se.mdh.idt.benji.trace.TraceLink;
import se.mdh.idt.benji.trace.api.Current;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T22:01+0200")
public final class Current_synset extends BaseGeneratedEMFQuerySpecification<Current_synset.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_synset pattern,
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
    
    private Synset fCurrent_synset;
    
    private static List<String> parameterNames = makeImmutableList("synset", "current_synset");
    
    private Match(final TraceLink pSynset, final Synset pCurrent_synset) {
      this.fSynset = pSynset;
      this.fCurrent_synset = pCurrent_synset;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("synset".equals(parameterName)) return this.fSynset;
      if ("current_synset".equals(parameterName)) return this.fCurrent_synset;
      return null;
    }
    
    public TraceLink getSynset() {
      return this.fSynset;
    }
    
    public Synset getCurrent_synset() {
      return this.fCurrent_synset;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("synset".equals(parameterName) ) {
          this.fSynset = (TraceLink) newValue;
          return true;
      }
      if ("current_synset".equals(parameterName) ) {
          this.fCurrent_synset = (Synset) newValue;
          return true;
      }
      return false;
    }
    
    public void setSynset(final TraceLink pSynset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSynset = pSynset;
    }
    
    public void setCurrent_synset(final Synset pCurrent_synset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_synset = pCurrent_synset;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_synset";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_synset.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSynset, fCurrent_synset};
    }
    
    @Override
    public Current_synset.Match toImmutable() {
      return isMutable() ? newMatch(fSynset, fCurrent_synset) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"synset\"=" + prettyPrintValue(fSynset) + ", ");
      result.append("\"current_synset\"=" + prettyPrintValue(fCurrent_synset));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSynset, fCurrent_synset);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_synset.Match)) {
          Current_synset.Match other = (Current_synset.Match) obj;
          return Objects.equals(fSynset, other.fSynset) && Objects.equals(fCurrent_synset, other.fCurrent_synset);
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
    public Current_synset specification() {
      return Current_synset.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_synset.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_synset.Match newMutableMatch(final TraceLink pSynset, final Synset pCurrent_synset) {
      return new Mutable(pSynset, pCurrent_synset);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_synset.Match newMatch(final TraceLink pSynset, final Synset pCurrent_synset) {
      return new Immutable(pSynset, pCurrent_synset);
    }
    
    private static final class Mutable extends Current_synset.Match {
      Mutable(final TraceLink pSynset, final Synset pCurrent_synset) {
        super(pSynset, pCurrent_synset);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_synset.Match {
      Immutable(final TraceLink pSynset, final Synset pCurrent_synset) {
        super(pSynset, pCurrent_synset);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_synset pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // synset - current
   * pattern current_synset (synset : TraceLink, current_synset : Synset) {
   * 	find current (synset, current_synset);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_synset
   * 
   */
  public static class Matcher extends BaseMatcher<Current_synset.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_synset.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_synset.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_SYNSET = 0;
    
    private final static int POSITION_CURRENT_SYNSET = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_synset.Matcher.class);
    
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
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_synset.Match> getAllMatches(final TraceLink pSynset, final Synset pCurrent_synset) {
      return rawGetAllMatches(new Object[]{pSynset, pCurrent_synset});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_synset.Match getOneArbitraryMatch(final TraceLink pSynset, final Synset pCurrent_synset) {
      return rawGetOneArbitraryMatch(new Object[]{pSynset, pCurrent_synset});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pSynset, final Synset pCurrent_synset) {
      return rawHasMatch(new Object[]{pSynset, pCurrent_synset});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pSynset, final Synset pCurrent_synset) {
      return rawCountMatches(new Object[]{pSynset, pCurrent_synset});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pSynset, final Synset pCurrent_synset, final IMatchProcessor<? super Current_synset.Match> processor) {
      rawForEachMatch(new Object[]{pSynset, pCurrent_synset}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pSynset, final Synset pCurrent_synset, final IMatchProcessor<? super Current_synset.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSynset, pCurrent_synset}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pCurrent_synset the fixed value of pattern parameter current_synset, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_synset.Match newMatch(final TraceLink pSynset, final Synset pCurrent_synset) {
      return Current_synset.Match.newMatch(pSynset, pCurrent_synset);
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
    public Set<TraceLink> getAllValuesOfsynset(final Current_synset.Match partialMatch) {
      return rawAccumulateAllValuesOfsynset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsynset(final Synset pCurrent_synset) {
      return rawAccumulateAllValuesOfsynset(new Object[]{
      null, 
      pCurrent_synset
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Synset> rawAccumulateAllValuesOfcurrent_synset(final Object[] parameters) {
      Set<Synset> results = new HashSet<Synset>();
      rawAccumulateAllValues(POSITION_CURRENT_SYNSET, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synset> getAllValuesOfcurrent_synset() {
      return rawAccumulateAllValuesOfcurrent_synset(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synset> getAllValuesOfcurrent_synset(final Current_synset.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_synset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synset> getAllValuesOfcurrent_synset(final TraceLink pSynset) {
      return rawAccumulateAllValuesOfcurrent_synset(new Object[]{
      pSynset, 
      null
      });
    }
    
    @Override
    protected Current_synset.Match tupleToMatch(final Tuple t) {
      try {
          return Current_synset.Match.newMatch((TraceLink) t.get(POSITION_SYNSET), (Synset) t.get(POSITION_CURRENT_SYNSET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_synset.Match arrayToMatch(final Object[] match) {
      try {
          return Current_synset.Match.newMatch((TraceLink) match[POSITION_SYNSET], (Synset) match[POSITION_CURRENT_SYNSET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_synset.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_synset.Match.newMutableMatch((TraceLink) match[POSITION_SYNSET], (Synset) match[POSITION_CURRENT_SYNSET]);
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
    public static IQuerySpecification<Current_synset.Matcher> querySpecification() {
      return Current_synset.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_synset pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_synset.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pSynset the value of pattern parameter synset in the currently processed match
     * @param pCurrent_synset the value of pattern parameter current_synset in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pSynset, final Synset pCurrent_synset);
    
    @Override
    public void process(final Current_synset.Match match) {
      process(match.getSynset(), match.getCurrent_synset());
    }
  }
  
  private Current_synset() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_synset instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_synset.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_synset.Matcher.on(engine);
  }
  
  @Override
  public Current_synset.Matcher instantiate() {
    return Current_synset.Matcher.create();
  }
  
  @Override
  public Current_synset.Match newEmptyMatch() {
    return Current_synset.Match.newEmptyMatch();
  }
  
  @Override
  public Current_synset.Match newMatch(final Object... parameters) {
    return Current_synset.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.wordnet.Synset) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset (visibility: PUBLIC, simpleName: Current_synset, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset (visibility: PUBLIC, simpleName: Current_synset, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_synset INSTANCE = new Current_synset();
    
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
    private final static Current_synset.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSynset = new PParameter("synset", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_synset = new PParameter("current_synset", "se.mdh.idt.benji.examples.refactorings.wordnet.Synset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/WordNet", "Synset")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSynset, parameter_pCurrent_synset);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.current_synset";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("synset","current_synset");
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
          PVariable var_current_synset = body.getOrCreateVariableByName("current_synset");
          new TypeConstraint(body, Tuples.flatTupleOf(var_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/WordNet", "Synset")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_synset, parameter_pSynset),
             new ExportedParameter(body, var_current_synset, parameter_pCurrent_synset)
          ));
          // 	find current (synset, current_synset)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_synset, var_current_synset), Current.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
