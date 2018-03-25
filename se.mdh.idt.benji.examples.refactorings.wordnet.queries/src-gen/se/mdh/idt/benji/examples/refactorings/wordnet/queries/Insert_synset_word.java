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
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Current_synset_word;
import se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_synset_word;
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
public final class Insert_synset_word extends BaseGeneratedEMFQuerySpecification<Insert_synset_word.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_word pattern,
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
    
    private TraceLink fWord;
    
    private static List<String> parameterNames = makeImmutableList("synset", "word");
    
    private Match(final TraceLink pSynset, final TraceLink pWord) {
      this.fSynset = pSynset;
      this.fWord = pWord;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("synset".equals(parameterName)) return this.fSynset;
      if ("word".equals(parameterName)) return this.fWord;
      return null;
    }
    
    public TraceLink getSynset() {
      return this.fSynset;
    }
    
    public TraceLink getWord() {
      return this.fWord;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("synset".equals(parameterName) ) {
          this.fSynset = (TraceLink) newValue;
          return true;
      }
      if ("word".equals(parameterName) ) {
          this.fWord = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setSynset(final TraceLink pSynset) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSynset = pSynset;
    }
    
    public void setWord(final TraceLink pWord) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fWord = pWord;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_word";
    }
    
    @Override
    public List<String> parameterNames() {
      return Insert_synset_word.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fSynset, fWord};
    }
    
    @Override
    public Insert_synset_word.Match toImmutable() {
      return isMutable() ? newMatch(fSynset, fWord) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"synset\"=" + prettyPrintValue(fSynset) + ", ");
      result.append("\"word\"=" + prettyPrintValue(fWord));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSynset, fWord);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Insert_synset_word.Match)) {
          Insert_synset_word.Match other = (Insert_synset_word.Match) obj;
          return Objects.equals(fSynset, other.fSynset) && Objects.equals(fWord, other.fWord);
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
    public Insert_synset_word specification() {
      return Insert_synset_word.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Insert_synset_word.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Insert_synset_word.Match newMutableMatch(final TraceLink pSynset, final TraceLink pWord) {
      return new Mutable(pSynset, pWord);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Insert_synset_word.Match newMatch(final TraceLink pSynset, final TraceLink pWord) {
      return new Immutable(pSynset, pWord);
    }
    
    private static final class Mutable extends Insert_synset_word.Match {
      Mutable(final TraceLink pSynset, final TraceLink pWord) {
        super(pSynset, pWord);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Insert_synset_word.Match {
      Immutable(final TraceLink pSynset, final TraceLink pWord) {
        super(pSynset, pWord);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_word pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // synset - words - insert
   * pattern insert_synset_word (synset : TraceLink, word : TraceLink) {
   * 	neg find initial_synset_word (synset, _initial_synset, word, _initial_word);
   * 	find current_synset_word (synset, _current_synset, word, _current_word);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Insert_synset_word
   * 
   */
  public static class Matcher extends BaseMatcher<Insert_synset_word.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Insert_synset_word.Matcher on(final ViatraQueryEngine engine) {
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
    public static Insert_synset_word.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_SYNSET = 0;
    
    private final static int POSITION_WORD = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Insert_synset_word.Matcher.class);
    
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
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Insert_synset_word.Match> getAllMatches(final TraceLink pSynset, final TraceLink pWord) {
      return rawGetAllMatches(new Object[]{pSynset, pWord});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Insert_synset_word.Match getOneArbitraryMatch(final TraceLink pSynset, final TraceLink pWord) {
      return rawGetOneArbitraryMatch(new Object[]{pSynset, pWord});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pSynset, final TraceLink pWord) {
      return rawHasMatch(new Object[]{pSynset, pWord});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pSynset, final TraceLink pWord) {
      return rawCountMatches(new Object[]{pSynset, pWord});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pSynset, final TraceLink pWord, final IMatchProcessor<? super Insert_synset_word.Match> processor) {
      rawForEachMatch(new Object[]{pSynset, pWord}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pSynset, final TraceLink pWord, final IMatchProcessor<? super Insert_synset_word.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSynset, pWord}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSynset the fixed value of pattern parameter synset, or null if not bound.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Insert_synset_word.Match newMatch(final TraceLink pSynset, final TraceLink pWord) {
      return Insert_synset_word.Match.newMatch(pSynset, pWord);
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
    public Set<TraceLink> getAllValuesOfsynset(final Insert_synset_word.Match partialMatch) {
      return rawAccumulateAllValuesOfsynset(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for synset.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsynset(final TraceLink pWord) {
      return rawAccumulateAllValuesOfsynset(new Object[]{
      null, 
      pWord
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfword(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_WORD, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfword() {
      return rawAccumulateAllValuesOfword(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfword(final Insert_synset_word.Match partialMatch) {
      return rawAccumulateAllValuesOfword(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfword(final TraceLink pSynset) {
      return rawAccumulateAllValuesOfword(new Object[]{
      pSynset, 
      null
      });
    }
    
    @Override
    protected Insert_synset_word.Match tupleToMatch(final Tuple t) {
      try {
          return Insert_synset_word.Match.newMatch((TraceLink) t.get(POSITION_SYNSET), (TraceLink) t.get(POSITION_WORD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Insert_synset_word.Match arrayToMatch(final Object[] match) {
      try {
          return Insert_synset_word.Match.newMatch((TraceLink) match[POSITION_SYNSET], (TraceLink) match[POSITION_WORD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Insert_synset_word.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Insert_synset_word.Match.newMutableMatch((TraceLink) match[POSITION_SYNSET], (TraceLink) match[POSITION_WORD]);
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
    public static IQuerySpecification<Insert_synset_word.Matcher> querySpecification() {
      return Insert_synset_word.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_word pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Insert_synset_word.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pSynset the value of pattern parameter synset in the currently processed match
     * @param pWord the value of pattern parameter word in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pSynset, final TraceLink pWord);
    
    @Override
    public void process(final Insert_synset_word.Match match) {
      process(match.getSynset(), match.getWord());
    }
  }
  
  private Insert_synset_word() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Insert_synset_word instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Insert_synset_word.Matcher instantiate(final ViatraQueryEngine engine) {
    return Insert_synset_word.Matcher.on(engine);
  }
  
  @Override
  public Insert_synset_word.Matcher instantiate() {
    return Insert_synset_word.Matcher.create();
  }
  
  @Override
  public Insert_synset_word.Match newEmptyMatch() {
    return Insert_synset_word.Match.newEmptyMatch();
  }
  
  @Override
  public Insert_synset_word.Match newMatch(final Object... parameters) {
    return Insert_synset_word.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_word (visibility: PUBLIC, simpleName: Insert_synset_word, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_word, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_word (visibility: PUBLIC, simpleName: Insert_synset_word, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Insert_synset_word, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Insert_synset_word INSTANCE = new Insert_synset_word();
    
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
    private final static Insert_synset_word.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pSynset = new PParameter("synset", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pWord = new PParameter("word", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSynset, parameter_pWord);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.insert_synset_word";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("synset","word");
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
          PVariable var_word = body.getOrCreateVariableByName("word");
          PVariable var__initial_synset = body.getOrCreateVariableByName("_initial_synset");
          PVariable var__initial_word = body.getOrCreateVariableByName("_initial_word");
          PVariable var__current_synset = body.getOrCreateVariableByName("_current_synset");
          PVariable var__current_word = body.getOrCreateVariableByName("_current_word");
          new TypeConstraint(body, Tuples.flatTupleOf(var_synset), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_word), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_synset, parameter_pSynset),
             new ExportedParameter(body, var_word, parameter_pWord)
          ));
          // 	neg find initial_synset_word (synset, _initial_synset, word, _initial_word)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_synset, var__initial_synset, var_word, var__initial_word), Initial_synset_word.instance().getInternalQueryRepresentation());
          // 	find current_synset_word (synset, _current_synset, word, _current_word)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_synset, var__current_synset, var_word, var__current_word), Current_synset_word.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
