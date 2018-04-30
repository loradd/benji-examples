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
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_gloss;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_gloss;
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
public final class Unset_synset_gloss extends BaseGeneratedEMFQuerySpecification<Unset_synset_gloss.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.unset_synset_gloss pattern,
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
    
    private String fGloss;
    
    private static List<String> parameterNames = makeImmutableList("synset", "gloss");
    
    private Match(final Trace pSynset, final String pGloss) {
      this.fSynset = pSynset;
      this.fGloss = pGloss;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("synset".equals(parameterName)) return this.fSynset;
      if ("gloss".equals(parameterName)) return this.fGloss;
      return null;
    }
    
    public Trace getSynset() {
      return this.fSynset;
    }
    
    public String getGloss() {
      return this.fGloss;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("synset".equals(parameterName) ) {
          this.fSynset = (Trace) newValue;
          return true;
      }
      if ("gloss".equals(parameterName) ) {
          this.fGloss = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setSynset(final Trace pSynset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSynset = pSynset;
    }
    
    public void setGloss(final String pGloss) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGloss = pGloss;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.unset_synset_gloss";
    }
    
    @Override
    public List<String> parameterNames() {
      return Unset_synset_gloss.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSynset, fGloss};
    }
    
    @Override
    public Unset_synset_gloss.Match toImmutable() {
      return isMutable() ? newMatch(fSynset, fGloss) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"synset\"=" + prettyPrintValue(fSynset) + ", ");
      result.append("\"gloss\"=" + prettyPrintValue(fGloss));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSynset, fGloss);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Unset_synset_gloss.Match)) {
          Unset_synset_gloss.Match other = (Unset_synset_gloss.Match) obj;
          return Objects.equals(fSynset, other.fSynset) && Objects.equals(fGloss, other.fGloss);
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
    public Unset_synset_gloss specification() {
      return Unset_synset_gloss.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Unset_synset_gloss.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Unset_synset_gloss.Match newMutableMatch(final Trace pSynset, final String pGloss) {
      return new Mutable(pSynset, pGloss);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Unset_synset_gloss.Match newMatch(final Trace pSynset, final String pGloss) {
      return new Immutable(pSynset, pGloss);
    }
    
    private static final class Mutable extends Unset_synset_gloss.Match {
      Mutable(final Trace pSynset, final String pGloss) {
        super(pSynset, pGloss);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Unset_synset_gloss.Match {
      Immutable(final Trace pSynset, final String pGloss) {
        super(pSynset, pGloss);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.unset_synset_gloss pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // synset - gloss - unset
   * pattern unset_synset_gloss (synset : Trace, gloss : java String) {
   * 	find initial_synset_gloss (synset, _initial_synset, gloss); 
   * 	neg find current_synset_gloss (synset, _current_synset, gloss); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Unset_synset_gloss
   * 
   */
  public static class Matcher extends BaseMatcher<Unset_synset_gloss.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Unset_synset_gloss.Matcher on(final ViatraQueryEngine engine) {
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
    public static Unset_synset_gloss.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_SYNSET = 0;
    
    private final static int POSITION_GLOSS = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Unset_synset_gloss.Matcher.class);
    
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
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Unset_synset_gloss.Match> getAllMatches(final Trace pSynset, final String pGloss) {
      return rawGetAllMatches(new Object[]{pSynset, pGloss});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Unset_synset_gloss.Match getOneArbitraryMatch(final Trace pSynset, final String pGloss) {
      return rawGetOneArbitraryMatch(new Object[]{pSynset, pGloss});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pSynset, final String pGloss) {
      return rawHasMatch(new Object[]{pSynset, pGloss});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pSynset, final String pGloss) {
      return rawCountMatches(new Object[]{pSynset, pGloss});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pSynset, final String pGloss, final IMatchProcessor<? super Unset_synset_gloss.Match> processor) {
      rawForEachMatch(new Object[]{pSynset, pGloss}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pSynset, final String pGloss, final IMatchProcessor<? super Unset_synset_gloss.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSynset, pGloss}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pGloss the fixed value of pattern parameter gloss, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Unset_synset_gloss.Match newMatch(final Trace pSynset, final String pGloss) {
      return Unset_synset_gloss.Match.newMatch(pSynset, pGloss);
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
    public Set<Trace> getAllValuesOfsynset(final Unset_synset_gloss.Match partialMatch) {
      return rawAccumulateAllValuesOfsynset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsynset(final String pGloss) {
      return rawAccumulateAllValuesOfsynset(new Object[]{
      null, 
      pGloss
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for gloss.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfgloss(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_GLOSS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for gloss.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfgloss() {
      return rawAccumulateAllValuesOfgloss(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for gloss.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfgloss(final Unset_synset_gloss.Match partialMatch) {
      return rawAccumulateAllValuesOfgloss(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for gloss.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfgloss(final Trace pSynset) {
      return rawAccumulateAllValuesOfgloss(new Object[]{
      pSynset, 
      null
      });
    }
    
    @Override
    protected Unset_synset_gloss.Match tupleToMatch(final Tuple t) {
      try {
          return Unset_synset_gloss.Match.newMatch((Trace) t.get(POSITION_SYNSET), (String) t.get(POSITION_GLOSS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unset_synset_gloss.Match arrayToMatch(final Object[] match) {
      try {
          return Unset_synset_gloss.Match.newMatch((Trace) match[POSITION_SYNSET], (String) match[POSITION_GLOSS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unset_synset_gloss.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Unset_synset_gloss.Match.newMutableMatch((Trace) match[POSITION_SYNSET], (String) match[POSITION_GLOSS]);
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
    public static IQuerySpecification<Unset_synset_gloss.Matcher> querySpecification() {
      return Unset_synset_gloss.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.unset_synset_gloss pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Unset_synset_gloss.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pSynset the value of pattern parameter synset in the currently processed match
     * @param pGloss the value of pattern parameter gloss in the currently processed match
     * 
     */
    public abstract void process(final Trace pSynset, final String pGloss);
    
    @Override
    public void process(final Unset_synset_gloss.Match match) {
      process(match.getSynset(), match.getGloss());
    }
  }
  
  private Unset_synset_gloss() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Unset_synset_gloss instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Unset_synset_gloss.Matcher instantiate(final ViatraQueryEngine engine) {
    return Unset_synset_gloss.Matcher.on(engine);
  }
  
  @Override
  public Unset_synset_gloss.Matcher instantiate() {
    return Unset_synset_gloss.Matcher.create();
  }
  
  @Override
  public Unset_synset_gloss.Match newEmptyMatch() {
    return Unset_synset_gloss.Match.newEmptyMatch();
  }
  
  @Override
  public Unset_synset_gloss.Match newMatch(final Object... parameters) {
    return Unset_synset_gloss.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_synset_gloss (visibility: PUBLIC, simpleName: Unset_synset_gloss, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_synset_gloss, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_synset_gloss (visibility: PUBLIC, simpleName: Unset_synset_gloss, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Unset_synset_gloss, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Unset_synset_gloss INSTANCE = new Unset_synset_gloss();
    
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
    private final static Unset_synset_gloss.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSynset = new PParameter("synset", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pGloss = new PParameter("gloss", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSynset, parameter_pGloss);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.unset_synset_gloss";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("synset","gloss");
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
          PVariable var_gloss = body.getOrCreateVariableByName("gloss");
          PVariable var__initial_synset = body.getOrCreateVariableByName("_initial_synset");
          PVariable var__current_synset = body.getOrCreateVariableByName("_current_synset");
          new TypeConstraint(body, Tuples.flatTupleOf(var_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_gloss), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_synset, parameter_pSynset),
             new ExportedParameter(body, var_gloss, parameter_pGloss)
          ));
          // 	find initial_synset_gloss (synset, _initial_synset, gloss)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_synset, var__initial_synset, var_gloss), Initial_synset_gloss.instance().getInternalQueryRepresentation());
          //  	neg find current_synset_gloss (synset, _current_synset, gloss)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_synset, var__current_synset, var_gloss), Current_synset_gloss.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
