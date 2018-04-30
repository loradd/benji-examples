/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.wordnet.queries/src/se/mdh/idt/benji/examples/refactorings/wordnet/queries/WordPatterns.vql
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
import se.mdh.idt.benji.examples.refactorings.wordnet.Word;
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
public final class Initial_word extends BaseGeneratedEMFQuerySpecification<Initial_word.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_word pattern,
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
    private Trace fWord;
    
    private Word fInitial_word;
    
    private static List<String> parameterNames = makeImmutableList("word", "initial_word");
    
    private Match(final Trace pWord, final Word pInitial_word) {
      this.fWord = pWord;
      this.fInitial_word = pInitial_word;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("word".equals(parameterName)) return this.fWord;
      if ("initial_word".equals(parameterName)) return this.fInitial_word;
      return null;
    }
    
    public Trace getWord() {
      return this.fWord;
    }
    
    public Word getInitial_word() {
      return this.fInitial_word;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("word".equals(parameterName) ) {
          this.fWord = (Trace) newValue;
          return true;
      }
      if ("initial_word".equals(parameterName) ) {
          this.fInitial_word = (Word) newValue;
          return true;
      }
      return false;
    }
    
    public void setWord(final Trace pWord) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fWord = pWord;
    }
    
    public void setInitial_word(final Word pInitial_word) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_word = pInitial_word;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_word";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_word.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fWord, fInitial_word};
    }
    
    @Override
    public Initial_word.Match toImmutable() {
      return isMutable() ? newMatch(fWord, fInitial_word) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"word\"=" + prettyPrintValue(fWord) + ", ");
      result.append("\"initial_word\"=" + prettyPrintValue(fInitial_word));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fWord, fInitial_word);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_word.Match)) {
          Initial_word.Match other = (Initial_word.Match) obj;
          return Objects.equals(fWord, other.fWord) && Objects.equals(fInitial_word, other.fInitial_word);
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
    public Initial_word specification() {
      return Initial_word.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_word.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_word.Match newMutableMatch(final Trace pWord, final Word pInitial_word) {
      return new Mutable(pWord, pInitial_word);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_word.Match newMatch(final Trace pWord, final Word pInitial_word) {
      return new Immutable(pWord, pInitial_word);
    }
    
    private static final class Mutable extends Initial_word.Match {
      Mutable(final Trace pWord, final Word pInitial_word) {
        super(pWord, pInitial_word);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_word.Match {
      Immutable(final Trace pWord, final Word pInitial_word) {
        super(pWord, pInitial_word);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_word pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // word - initial
   * pattern initial_word (word : Trace, initial_word : Word) {
   * 	find initial (word, initial_word); 
   * 	Word (initial_word); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_word
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_word.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_word.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_word.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_WORD = 0;
    
    private final static int POSITION_INITIAL_WORD = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_word.Matcher.class);
    
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
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_word.Match> getAllMatches(final Trace pWord, final Word pInitial_word) {
      return rawGetAllMatches(new Object[]{pWord, pInitial_word});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_word.Match getOneArbitraryMatch(final Trace pWord, final Word pInitial_word) {
      return rawGetOneArbitraryMatch(new Object[]{pWord, pInitial_word});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pWord, final Word pInitial_word) {
      return rawHasMatch(new Object[]{pWord, pInitial_word});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pWord, final Word pInitial_word) {
      return rawCountMatches(new Object[]{pWord, pInitial_word});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pWord, final Word pInitial_word, final IMatchProcessor<? super Initial_word.Match> processor) {
      rawForEachMatch(new Object[]{pWord, pInitial_word}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pWord, final Word pInitial_word, final IMatchProcessor<? super Initial_word.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pWord, pInitial_word}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pWord the fixed value of pattern parameter word, or null if not bound.
     * @param pInitial_word the fixed value of pattern parameter initial_word, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_word.Match newMatch(final Trace pWord, final Word pInitial_word) {
      return Initial_word.Match.newMatch(pWord, pInitial_word);
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfword(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_WORD, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfword() {
      return rawAccumulateAllValuesOfword(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfword(final Initial_word.Match partialMatch) {
      return rawAccumulateAllValuesOfword(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfword(final Word pInitial_word) {
      return rawAccumulateAllValuesOfword(new Object[]{
      null, 
      pInitial_word
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Word> rawAccumulateAllValuesOfinitial_word(final Object[] parameters) {
      Set<Word> results = new HashSet<Word>();
      rawAccumulateAllValues(POSITION_INITIAL_WORD, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Word> getAllValuesOfinitial_word() {
      return rawAccumulateAllValuesOfinitial_word(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Word> getAllValuesOfinitial_word(final Initial_word.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_word(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_word.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Word> getAllValuesOfinitial_word(final Trace pWord) {
      return rawAccumulateAllValuesOfinitial_word(new Object[]{
      pWord, 
      null
      });
    }
    
    @Override
    protected Initial_word.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_word.Match.newMatch((Trace) t.get(POSITION_WORD), (Word) t.get(POSITION_INITIAL_WORD));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_word.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_word.Match.newMatch((Trace) match[POSITION_WORD], (Word) match[POSITION_INITIAL_WORD]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_word.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_word.Match.newMutableMatch((Trace) match[POSITION_WORD], (Word) match[POSITION_INITIAL_WORD]);
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
    public static IQuerySpecification<Initial_word.Matcher> querySpecification() {
      return Initial_word.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_word pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_word.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pWord the value of pattern parameter word in the currently processed match
     * @param pInitial_word the value of pattern parameter initial_word in the currently processed match
     * 
     */
    public abstract void process(final Trace pWord, final Word pInitial_word);
    
    @Override
    public void process(final Initial_word.Match match) {
      process(match.getWord(), match.getInitial_word());
    }
  }
  
  private Initial_word() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_word instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_word.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_word.Matcher.on(engine);
  }
  
  @Override
  public Initial_word.Matcher instantiate() {
    return Initial_word.Matcher.create();
  }
  
  @Override
  public Initial_word.Match newEmptyMatch() {
    return Initial_word.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_word.Match newMatch(final Object... parameters) {
    return Initial_word.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.examples.refactorings.wordnet.Word) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word (visibility: PUBLIC, simpleName: Initial_word, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word (visibility: PUBLIC, simpleName: Initial_word, identifier: se.mdh.idt.benji.examples.refactorings.wordnet.queries.Initial_word, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.wordnet.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_word INSTANCE = new Initial_word();
    
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
    private final static Initial_word.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pWord = new PParameter("word", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_word = new PParameter("initial_word", "se.mdh.idt.benji.examples.refactorings.wordnet.Word", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/WordNet", "Word")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pWord, parameter_pInitial_word);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.wordnet.queries.initial_word";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("word","initial_word");
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
          PVariable var_word = body.getOrCreateVariableByName("word");
          PVariable var_initial_word = body.getOrCreateVariableByName("initial_word");
          new TypeConstraint(body, Tuples.flatTupleOf(var_word), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_word), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/WordNet", "Word")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_word, parameter_pWord),
             new ExportedParameter(body, var_initial_word, parameter_pInitial_word)
          ));
          // 	find initial (word, initial_word)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_word, var_initial_word), Initial.instance().getInternalQueryRepresentation());
          //  	Word (initial_word)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_word), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/WordNet", "Word")));
          bodies.add(body);
      }
      return bodies;
    }
  }
}
