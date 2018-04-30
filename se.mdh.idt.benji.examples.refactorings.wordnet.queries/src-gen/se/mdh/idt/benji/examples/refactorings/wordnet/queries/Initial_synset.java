/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/SynsetPatterns.vql
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
import se.mdh.idt.benji.trace.Trace;
import se.mdh.idt.benji.trace.api.Initial;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-04-24T16:52+0200")
public final class Initial_synset extends BaseGeneratedEMFQuerySpecification<Initial_synset.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_synset pattern,
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
    private Trace fSynset;
    
    private Synset fInitial_synset;
    
    private static List<String> parameterNames = makeImmutableList("synset", "initial_synset");
    
    private Match(final Trace pSynset, final Synset pInitial_synset) {
      this.fSynset = pSynset;
      this.fInitial_synset = pInitial_synset;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("synset".equals(parameterName)) return this.fSynset;
      if ("initial_synset".equals(parameterName)) return this.fInitial_synset;
      return null;
    }
    
    public Trace getSynset() {
      return this.fSynset;
    }
    
    public Synset getInitial_synset() {
      return this.fInitial_synset;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("synset".equals(parameterName) ) {
          this.fSynset = (Trace) newValue;
          return true;
      }
      if ("initial_synset".equals(parameterName) ) {
          this.fInitial_synset = (Synset) newValue;
          return true;
      }
      return false;
    }
    
    public void setSynset(final Trace pSynset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSynset = pSynset;
    }
    
    public void setInitial_synset(final Synset pInitial_synset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_synset = pInitial_synset;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_synset";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_synset.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSynset, fInitial_synset};
    }
    
    @Override
    public Initial_synset.Match toImmutable() {
      return isMutable() ? newMatch(fSynset, fInitial_synset) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"synset\"=" + prettyPrintValue(fSynset) + ", ");
      result.append("\"initial_synset\"=" + prettyPrintValue(fInitial_synset));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSynset, fInitial_synset);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_synset.Match)) {
          Initial_synset.Match other = (Initial_synset.Match) obj;
          return Objects.equals(fSynset, other.fSynset) && Objects.equals(fInitial_synset, other.fInitial_synset);
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
    public Initial_synset specification() {
      return Initial_synset.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_synset.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_synset.Match newMutableMatch(final Trace pSynset, final Synset pInitial_synset) {
      return new Mutable(pSynset, pInitial_synset);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_synset.Match newMatch(final Trace pSynset, final Synset pInitial_synset) {
      return new Immutable(pSynset, pInitial_synset);
    }
    
    private static final class Mutable extends Initial_synset.Match {
      Mutable(final Trace pSynset, final Synset pInitial_synset) {
        super(pSynset, pInitial_synset);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_synset.Match {
      Immutable(final Trace pSynset, final Synset pInitial_synset) {
        super(pSynset, pInitial_synset);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_synset pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // synset - initial
   * pattern initial_synset (synset : Trace, initial_synset : Synset) {
   * 	find initial (synset, initial_synset); 
   * 	Synset (initial_synset); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_synset
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_synset.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_synset.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_synset.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_SYNSET = 0;
    
    private final static int POSITION_INITIAL_SYNSET = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_synset.Matcher.class);
    
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
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_synset.Match> getAllMatches(final Trace pSynset, final Synset pInitial_synset) {
      return rawGetAllMatches(new Object[]{pSynset, pInitial_synset});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_synset.Match getOneArbitraryMatch(final Trace pSynset, final Synset pInitial_synset) {
      return rawGetOneArbitraryMatch(new Object[]{pSynset, pInitial_synset});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pSynset, final Synset pInitial_synset) {
      return rawHasMatch(new Object[]{pSynset, pInitial_synset});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pSynset, final Synset pInitial_synset) {
      return rawCountMatches(new Object[]{pSynset, pInitial_synset});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pSynset, final Synset pInitial_synset, final IMatchProcessor<? super Initial_synset.Match> processor) {
      rawForEachMatch(new Object[]{pSynset, pInitial_synset}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pSynset, final Synset pInitial_synset, final IMatchProcessor<? super Initial_synset.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSynset, pInitial_synset}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pInitial_synset the fixed value of pattern parameter initial_synset, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_synset.Match newMatch(final Trace pSynset, final Synset pInitial_synset) {
      return Initial_synset.Match.newMatch(pSynset, pInitial_synset);
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfsynset(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_SYNSET, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsynset() {
      return rawAccumulateAllValuesOfsynset(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsynset(final Initial_synset.Match partialMatch) {
      return rawAccumulateAllValuesOfsynset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsynset(final Synset pInitial_synset) {
      return rawAccumulateAllValuesOfsynset(new Object[]{
      null, 
      pInitial_synset
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Synset> rawAccumulateAllValuesOfinitial_synset(final Object[] parameters) {
      Set<Synset> results = new HashSet<Synset>();
      rawAccumulateAllValues(POSITION_INITIAL_SYNSET, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synset> getAllValuesOfinitial_synset() {
      return rawAccumulateAllValuesOfinitial_synset(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synset> getAllValuesOfinitial_synset(final Initial_synset.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_synset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Synset> getAllValuesOfinitial_synset(final Trace pSynset) {
      return rawAccumulateAllValuesOfinitial_synset(new Object[]{
      pSynset, 
      null
      });
    }
    
    @Override
    protected Initial_synset.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_synset.Match.newMatch((Trace) t.get(POSITION_SYNSET), (Synset) t.get(POSITION_INITIAL_SYNSET));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_synset.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_synset.Match.newMatch((Trace) match[POSITION_SYNSET], (Synset) match[POSITION_INITIAL_SYNSET]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_synset.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_synset.Match.newMutableMatch((Trace) match[POSITION_SYNSET], (Synset) match[POSITION_INITIAL_SYNSET]);
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
    public static IQuerySpecification<Initial_synset.Matcher> querySpecification() {
      return Initial_synset.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_synset pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_synset.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pSynset the value of pattern parameter synset in the currently processed match
     * @param pInitial_synset the value of pattern parameter initial_synset in the currently processed match
     * 
     */
    public abstract void process(final Trace pSynset, final Synset pInitial_synset);
    
    @Override
    public void process(final Initial_synset.Match match) {
      process(match.getSynset(), match.getInitial_synset());
    }
  }
  
  private Initial_synset() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_synset instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_synset.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_synset.Matcher.on(engine);
  }
  
  @Override
  public Initial_synset.Matcher instantiate() {
    return Initial_synset.Matcher.create();
  }
  
  @Override
  public Initial_synset.Match newEmptyMatch() {
    return Initial_synset.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_synset.Match newMatch(final Object... parameters) {
    return Initial_synset.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.examples.refactorings.wordnet.Synset) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset (visibility: PUBLIC, simpleName: Initial_synset, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset (visibility: PUBLIC, simpleName: Initial_synset, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_synset INSTANCE = new Initial_synset();
    
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
    private final static Initial_synset.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSynset = new PParameter("synset", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_synset = new PParameter("initial_synset", "se.mdh.idt.benji.examples.refactorings.wordnet.Synset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/WordNet", "Synset")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSynset, parameter_pInitial_synset);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_synset";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("synset","initial_synset");
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
          PVariable var_initial_synset = body.getOrCreateVariableByName("initial_synset");
          new TypeConstraint(body, Tuples.flatTupleOf(var_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/WordNet", "Synset")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_synset, parameter_pSynset),
             new ExportedParameter(body, var_initial_synset, parameter_pInitial_synset)
          ));
          // 	find initial (synset, initial_synset)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_synset, var_initial_synset), Initial.instance().getInternalQueryRepresentation());
          //  	Synset (initial_synset)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/WordNet", "Synset")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
