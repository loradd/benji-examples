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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_meronyms;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_meronyms;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-04-24T16:52+0200")
public final class Removed_synset_meronyms extends BaseGeneratedEMFQuerySpecification<Removed_synset_meronyms.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.removed_synset_meronyms pattern,
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
    
    private Trace fMeronym;
    
    private static List<String> parameterNames = makeImmutableList("synset", "meronym");
    
    private Match(final Trace pSynset, final Trace pMeronym) {
      this.fSynset = pSynset;
      this.fMeronym = pMeronym;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("synset".equals(parameterName)) return this.fSynset;
      if ("meronym".equals(parameterName)) return this.fMeronym;
      return null;
    }
    
    public Trace getSynset() {
      return this.fSynset;
    }
    
    public Trace getMeronym() {
      return this.fMeronym;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("synset".equals(parameterName) ) {
          this.fSynset = (Trace) newValue;
          return true;
      }
      if ("meronym".equals(parameterName) ) {
          this.fMeronym = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setSynset(final Trace pSynset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSynset = pSynset;
    }
    
    public void setMeronym(final Trace pMeronym) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fMeronym = pMeronym;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.removed_synset_meronyms";
    }
    
    @Override
    public List<String> parameterNames() {
      return Removed_synset_meronyms.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSynset, fMeronym};
    }
    
    @Override
    public Removed_synset_meronyms.Match toImmutable() {
      return isMutable() ? newMatch(fSynset, fMeronym) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"synset\"=" + prettyPrintValue(fSynset) + ", ");
      result.append("\"meronym\"=" + prettyPrintValue(fMeronym));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSynset, fMeronym);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Removed_synset_meronyms.Match)) {
          Removed_synset_meronyms.Match other = (Removed_synset_meronyms.Match) obj;
          return Objects.equals(fSynset, other.fSynset) && Objects.equals(fMeronym, other.fMeronym);
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
    public Removed_synset_meronyms specification() {
      return Removed_synset_meronyms.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Removed_synset_meronyms.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Removed_synset_meronyms.Match newMutableMatch(final Trace pSynset, final Trace pMeronym) {
      return new Mutable(pSynset, pMeronym);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Removed_synset_meronyms.Match newMatch(final Trace pSynset, final Trace pMeronym) {
      return new Immutable(pSynset, pMeronym);
    }
    
    private static final class Mutable extends Removed_synset_meronyms.Match {
      Mutable(final Trace pSynset, final Trace pMeronym) {
        super(pSynset, pMeronym);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Removed_synset_meronyms.Match {
      Immutable(final Trace pSynset, final Trace pMeronym) {
        super(pSynset, pMeronym);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.removed_synset_meronyms pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // synset - meronyms - removed
   * pattern removed_synset_meronyms (synset : Trace, meronym : Trace) {
   * 	find initial_synset_meronyms (synset, _initial_synset, meronym, _initial_meronym); 
   * 	neg find current_synset_meronyms (synset, _current_synset, meronym, _current_meronym); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Removed_synset_meronyms
   * 
   */
  public static class Matcher extends BaseMatcher<Removed_synset_meronyms.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Removed_synset_meronyms.Matcher on(final ViatraQueryEngine engine) {
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
    public static Removed_synset_meronyms.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_SYNSET = 0;
    
    private final static int POSITION_MERONYM = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Removed_synset_meronyms.Matcher.class);
    
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
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Removed_synset_meronyms.Match> getAllMatches(final Trace pSynset, final Trace pMeronym) {
      return rawGetAllMatches(new Object[]{pSynset, pMeronym});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Removed_synset_meronyms.Match getOneArbitraryMatch(final Trace pSynset, final Trace pMeronym) {
      return rawGetOneArbitraryMatch(new Object[]{pSynset, pMeronym});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pSynset, final Trace pMeronym) {
      return rawHasMatch(new Object[]{pSynset, pMeronym});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pSynset, final Trace pMeronym) {
      return rawCountMatches(new Object[]{pSynset, pMeronym});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pSynset, final Trace pMeronym, final IMatchProcessor<? super Removed_synset_meronyms.Match> processor) {
      rawForEachMatch(new Object[]{pSynset, pMeronym}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pSynset, final Trace pMeronym, final IMatchProcessor<? super Removed_synset_meronyms.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSynset, pMeronym}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pMeronym the fixed value of pattern parameter meronym, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Removed_synset_meronyms.Match newMatch(final Trace pSynset, final Trace pMeronym) {
      return Removed_synset_meronyms.Match.newMatch(pSynset, pMeronym);
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
    public Set<Trace> getAllValuesOfsynset(final Removed_synset_meronyms.Match partialMatch) {
      return rawAccumulateAllValuesOfsynset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsynset(final Trace pMeronym) {
      return rawAccumulateAllValuesOfsynset(new Object[]{
      null, 
      pMeronym
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for meronym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfmeronym(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_MERONYM, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for meronym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfmeronym() {
      return rawAccumulateAllValuesOfmeronym(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for meronym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfmeronym(final Removed_synset_meronyms.Match partialMatch) {
      return rawAccumulateAllValuesOfmeronym(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for meronym.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfmeronym(final Trace pSynset) {
      return rawAccumulateAllValuesOfmeronym(new Object[]{
      pSynset, 
      null
      });
    }
    
    @Override
    protected Removed_synset_meronyms.Match tupleToMatch(final Tuple t) {
      try {
          return Removed_synset_meronyms.Match.newMatch((Trace) t.get(POSITION_SYNSET), (Trace) t.get(POSITION_MERONYM));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Removed_synset_meronyms.Match arrayToMatch(final Object[] match) {
      try {
          return Removed_synset_meronyms.Match.newMatch((Trace) match[POSITION_SYNSET], (Trace) match[POSITION_MERONYM]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Removed_synset_meronyms.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Removed_synset_meronyms.Match.newMutableMatch((Trace) match[POSITION_SYNSET], (Trace) match[POSITION_MERONYM]);
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
    public static IQuerySpecification<Removed_synset_meronyms.Matcher> querySpecification() {
      return Removed_synset_meronyms.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.removed_synset_meronyms pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Removed_synset_meronyms.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pSynset the value of pattern parameter synset in the currently processed match
     * @param pMeronym the value of pattern parameter meronym in the currently processed match
     * 
     */
    public abstract void process(final Trace pSynset, final Trace pMeronym);
    
    @Override
    public void process(final Removed_synset_meronyms.Match match) {
      process(match.getSynset(), match.getMeronym());
    }
  }
  
  private Removed_synset_meronyms() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Removed_synset_meronyms instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Removed_synset_meronyms.Matcher instantiate(final ViatraQueryEngine engine) {
    return Removed_synset_meronyms.Matcher.on(engine);
  }
  
  @Override
  public Removed_synset_meronyms.Matcher instantiate() {
    return Removed_synset_meronyms.Matcher.create();
  }
  
  @Override
  public Removed_synset_meronyms.Match newEmptyMatch() {
    return Removed_synset_meronyms.Match.newEmptyMatch();
  }
  
  @Override
  public Removed_synset_meronyms.Match newMatch(final Object... parameters) {
    return Removed_synset_meronyms.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_meronyms (visibility: PUBLIC, simpleName: Removed_synset_meronyms, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_meronyms, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_meronyms (visibility: PUBLIC, simpleName: Removed_synset_meronyms, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Removed_synset_meronyms, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Removed_synset_meronyms INSTANCE = new Removed_synset_meronyms();
    
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
    private final static Removed_synset_meronyms.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSynset = new PParameter("synset", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pMeronym = new PParameter("meronym", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSynset, parameter_pMeronym);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.removed_synset_meronyms";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("synset","meronym");
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
          PVariable var_meronym = body.getOrCreateVariableByName("meronym");
          PVariable var__initial_synset = body.getOrCreateVariableByName("_initial_synset");
          PVariable var__initial_meronym = body.getOrCreateVariableByName("_initial_meronym");
          PVariable var__current_synset = body.getOrCreateVariableByName("_current_synset");
          PVariable var__current_meronym = body.getOrCreateVariableByName("_current_meronym");
          new TypeConstraint(body, Tuples.flatTupleOf(var_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_meronym), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_synset, parameter_pSynset),
             new ExportedParameter(body, var_meronym, parameter_pMeronym)
          ));
          // 	find initial_synset_meronyms (synset, _initial_synset, meronym, _initial_meronym)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_synset, var__initial_synset, var_meronym, var__initial_meronym), Initial_synset_meronyms.instance().getInternalQueryRepresentation());
          //  	neg find current_synset_meronyms (synset, _current_synset, meronym, _current_meronym)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_synset, var__current_synset, var_meronym, var__current_meronym), Current_synset_meronyms.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
