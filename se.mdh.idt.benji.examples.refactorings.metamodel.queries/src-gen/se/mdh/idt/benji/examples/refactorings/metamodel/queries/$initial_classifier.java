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
import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_modelElement;
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
public final class $initial_classifier extends BaseGeneratedEMFQuerySpecification<$initial_classifier.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier pattern,
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
    private TraceLink fClassifier;
    
    private Classifier fInitial_classifier;
    
    private static List<String> parameterNames = makeImmutableList("classifier", "initial_classifier");
    
    private Match(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      this.fClassifier = pClassifier;
      this.fInitial_classifier = pInitial_classifier;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("classifier".equals(parameterName)) return this.fClassifier;
      if ("initial_classifier".equals(parameterName)) return this.fInitial_classifier;
      return null;
    }
    
    public TraceLink getClassifier() {
      return this.fClassifier;
    }
    
    public Classifier getInitial_classifier() {
      return this.fInitial_classifier;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("classifier".equals(parameterName) ) {
          this.fClassifier = (TraceLink) newValue;
          return true;
      }
      if ("initial_classifier".equals(parameterName) ) {
          this.fInitial_classifier = (Classifier) newValue;
          return true;
      }
      return false;
    }
    
    public void setClassifier(final TraceLink pClassifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClassifier = pClassifier;
    }
    
    public void setInitial_classifier(final Classifier pInitial_classifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_classifier = pInitial_classifier;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier";
    }
    
    @Override
    public List<String> parameterNames() {
      return $initial_classifier.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier, fInitial_classifier};
    }
    
    @Override
    public $initial_classifier.Match toImmutable() {
      return isMutable() ? newMatch(fClassifier, fInitial_classifier) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"classifier\"=" + prettyPrintValue(fClassifier) + ", ");
      result.append("\"initial_classifier\"=" + prettyPrintValue(fInitial_classifier));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClassifier, fInitial_classifier);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $initial_classifier.Match)) {
          $initial_classifier.Match other = ($initial_classifier.Match) obj;
          return Objects.equals(fClassifier, other.fClassifier) && Objects.equals(fInitial_classifier, other.fInitial_classifier);
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
    public $initial_classifier specification() {
      return $initial_classifier.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $initial_classifier.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $initial_classifier.Match newMutableMatch(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      return new Mutable(pClassifier, pInitial_classifier);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $initial_classifier.Match newMatch(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      return new Immutable(pClassifier, pInitial_classifier);
    }
    
    private static final class Mutable extends $initial_classifier.Match {
      Mutable(final TraceLink pClassifier, final Classifier pInitial_classifier) {
        super(pClassifier, pInitial_classifier);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $initial_classifier.Match {
      Immutable(final TraceLink pClassifier, final Classifier pInitial_classifier) {
        super(pClassifier, pInitial_classifier);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // classifier - initial
   * pattern $initial_classifier (classifier : TraceLink, initial_classifier : Classifier) {
   * 	find $initial_modelElement (classifier, initial_classifier); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $initial_classifier
   * 
   */
  public static class Matcher extends BaseMatcher<$initial_classifier.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $initial_classifier.Matcher on(final ViatraQueryEngine engine) {
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
    public static $initial_classifier.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASSIFIER = 0;
    
    private final static int POSITION_INITIAL_CLASSIFIER = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($initial_classifier.Matcher.class);
    
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
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$initial_classifier.Match> getAllMatches(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      return rawGetAllMatches(new Object[]{pClassifier, pInitial_classifier});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $initial_classifier.Match getOneArbitraryMatch(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      return rawGetOneArbitraryMatch(new Object[]{pClassifier, pInitial_classifier});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      return rawHasMatch(new Object[]{pClassifier, pInitial_classifier});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      return rawCountMatches(new Object[]{pClassifier, pInitial_classifier});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pClassifier, final Classifier pInitial_classifier, final IMatchProcessor<? super $initial_classifier.Match> processor) {
      rawForEachMatch(new Object[]{pClassifier, pInitial_classifier}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pClassifier, final Classifier pInitial_classifier, final IMatchProcessor<? super $initial_classifier.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClassifier, pInitial_classifier}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $initial_classifier.Match newMatch(final TraceLink pClassifier, final Classifier pInitial_classifier) {
      return $initial_classifier.Match.newMatch(pClassifier, pInitial_classifier);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfclassifier(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_CLASSIFIER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclassifier() {
      return rawAccumulateAllValuesOfclassifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclassifier(final $initial_classifier.Match partialMatch) {
      return rawAccumulateAllValuesOfclassifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclassifier(final Classifier pInitial_classifier) {
      return rawAccumulateAllValuesOfclassifier(new Object[]{
      null, 
      pInitial_classifier
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Classifier> rawAccumulateAllValuesOfinitial_classifier(final Object[] parameters) {
      Set<Classifier> results = new HashSet<Classifier>();
      rawAccumulateAllValues(POSITION_INITIAL_CLASSIFIER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfinitial_classifier() {
      return rawAccumulateAllValuesOfinitial_classifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfinitial_classifier(final $initial_classifier.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_classifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfinitial_classifier(final TraceLink pClassifier) {
      return rawAccumulateAllValuesOfinitial_classifier(new Object[]{
      pClassifier, 
      null
      });
    }
    
    @Override
    protected $initial_classifier.Match tupleToMatch(final Tuple t) {
      try {
          return $initial_classifier.Match.newMatch((TraceLink) t.get(POSITION_CLASSIFIER), (Classifier) t.get(POSITION_INITIAL_CLASSIFIER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $initial_classifier.Match arrayToMatch(final Object[] match) {
      try {
          return $initial_classifier.Match.newMatch((TraceLink) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_INITIAL_CLASSIFIER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $initial_classifier.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $initial_classifier.Match.newMutableMatch((TraceLink) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_INITIAL_CLASSIFIER]);
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
    public static IQuerySpecification<$initial_classifier.Matcher> querySpecification() {
      return $initial_classifier.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$initial_classifier.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClassifier the value of pattern parameter classifier in the currently processed match
     * @param pInitial_classifier the value of pattern parameter initial_classifier in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pClassifier, final Classifier pInitial_classifier);
    
    @Override
    public void process(final $initial_classifier.Match match) {
      process(match.getClassifier(), match.getInitial_classifier());
    }
  }
  
  private $initial_classifier() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $initial_classifier instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $initial_classifier.Matcher instantiate(final ViatraQueryEngine engine) {
    return $initial_classifier.Matcher.on(engine);
  }
  
  @Override
  public $initial_classifier.Matcher instantiate() {
    return $initial_classifier.Matcher.create();
  }
  
  @Override
  public $initial_classifier.Match newEmptyMatch() {
    return $initial_classifier.Match.newEmptyMatch();
  }
  
  @Override
  public $initial_classifier.Match newMatch(final Object... parameters) {
    return $initial_classifier.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Classifier) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier (visibility: PUBLIC, simpleName: $initial_classifier, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier (visibility: PUBLIC, simpleName: $initial_classifier, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $initial_classifier INSTANCE = new $initial_classifier();
    
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
    private final static $initial_classifier.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClassifier = new PParameter("classifier", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_classifier = new PParameter("initial_classifier", "se.mdh.idt.benji.examples.refactorings.metamodel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClassifier, parameter_pInitial_classifier);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_classifier";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classifier","initial_classifier");
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
          PVariable var_classifier = body.getOrCreateVariableByName("classifier");
          PVariable var_initial_classifier = body.getOrCreateVariableByName("initial_classifier");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_classifier, parameter_pClassifier),
             new ExportedParameter(body, var_initial_classifier, parameter_pInitial_classifier)
          ));
          // 	find $initial_modelElement (classifier, initial_classifier)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_classifier, var_initial_classifier), $initial_modelElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
