/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ClassifierQueries.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_classifier_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_classifier_name;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class Set_classifier_name extends BaseGeneratedEMFQuerySpecification<Set_classifier_name.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_classifier_name pattern,
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
    
    private String fName;
    
    private static List<String> parameterNames = makeImmutableList("classifier", "name");
    
    private Match(final TraceLink pClassifier, final String pName) {
      this.fClassifier = pClassifier;
      this.fName = pName;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("classifier".equals(parameterName)) return this.fClassifier;
      if ("name".equals(parameterName)) return this.fName;
      return null;
    }
    
    public TraceLink getClassifier() {
      return this.fClassifier;
    }
    
    public String getName() {
      return this.fName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("classifier".equals(parameterName) ) {
          this.fClassifier = (TraceLink) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setClassifier(final TraceLink pClassifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClassifier = pClassifier;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_classifier_name";
    }
    
    @Override
    public List<String> parameterNames() {
      return Set_classifier_name.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier, fName};
    }
    
    @Override
    public Set_classifier_name.Match toImmutable() {
      return isMutable() ? newMatch(fClassifier, fName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"classifier\"=" + prettyPrintValue(fClassifier) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClassifier, fName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Set_classifier_name.Match)) {
          Set_classifier_name.Match other = (Set_classifier_name.Match) obj;
          return Objects.equals(fClassifier, other.fClassifier) && Objects.equals(fName, other.fName);
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
    public Set_classifier_name specification() {
      return Set_classifier_name.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Set_classifier_name.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Set_classifier_name.Match newMutableMatch(final TraceLink pClassifier, final String pName) {
      return new Mutable(pClassifier, pName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Set_classifier_name.Match newMatch(final TraceLink pClassifier, final String pName) {
      return new Immutable(pClassifier, pName);
    }
    
    private static final class Mutable extends Set_classifier_name.Match {
      Mutable(final TraceLink pClassifier, final String pName) {
        super(pClassifier, pName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Set_classifier_name.Match {
      Immutable(final TraceLink pClassifier, final String pName) {
        super(pClassifier, pName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_classifier_name pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // classifier - name - set
   * pattern set_classifier_name (classifier : TraceLink, name : java String) {
   * 	neg find initial_classifier_name (classifier, _initial_classifier, name);
   * 	find current_classifier_name (classifier, _current_classifier, name);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Set_classifier_name
   * 
   */
  public static class Matcher extends BaseMatcher<Set_classifier_name.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Set_classifier_name.Matcher on(final ViatraQueryEngine engine) {
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
    public static Set_classifier_name.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASSIFIER = 0;
    
    private final static int POSITION_NAME = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Set_classifier_name.Matcher.class);
    
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
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Set_classifier_name.Match> getAllMatches(final TraceLink pClassifier, final String pName) {
      return rawGetAllMatches(new Object[]{pClassifier, pName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Set_classifier_name.Match getOneArbitraryMatch(final TraceLink pClassifier, final String pName) {
      return rawGetOneArbitraryMatch(new Object[]{pClassifier, pName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pClassifier, final String pName) {
      return rawHasMatch(new Object[]{pClassifier, pName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pClassifier, final String pName) {
      return rawCountMatches(new Object[]{pClassifier, pName});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pClassifier, final String pName, final IMatchProcessor<? super Set_classifier_name.Match> processor) {
      rawForEachMatch(new Object[]{pClassifier, pName}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pClassifier, final String pName, final IMatchProcessor<? super Set_classifier_name.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClassifier, pName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Set_classifier_name.Match newMatch(final TraceLink pClassifier, final String pName) {
      return Set_classifier_name.Match.newMatch(pClassifier, pName);
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
    public Set<TraceLink> getAllValuesOfclassifier(final Set_classifier_name.Match partialMatch) {
      return rawAccumulateAllValuesOfclassifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclassifier(final String pName) {
      return rawAccumulateAllValuesOfclassifier(new Object[]{
      null, 
      pName
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname() {
      return rawAccumulateAllValuesOfname(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Set_classifier_name.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final TraceLink pClassifier) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pClassifier, 
      null
      });
    }
    
    @Override
    protected Set_classifier_name.Match tupleToMatch(final Tuple t) {
      try {
          return Set_classifier_name.Match.newMatch((TraceLink) t.get(POSITION_CLASSIFIER), (String) t.get(POSITION_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Set_classifier_name.Match arrayToMatch(final Object[] match) {
      try {
          return Set_classifier_name.Match.newMatch((TraceLink) match[POSITION_CLASSIFIER], (String) match[POSITION_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Set_classifier_name.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Set_classifier_name.Match.newMutableMatch((TraceLink) match[POSITION_CLASSIFIER], (String) match[POSITION_NAME]);
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
    public static IQuerySpecification<Set_classifier_name.Matcher> querySpecification() {
      return Set_classifier_name.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_classifier_name pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Set_classifier_name.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClassifier the value of pattern parameter classifier in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pClassifier, final String pName);
    
    @Override
    public void process(final Set_classifier_name.Match match) {
      process(match.getClassifier(), match.getName());
    }
  }
  
  private Set_classifier_name() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Set_classifier_name instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Set_classifier_name.Matcher instantiate(final ViatraQueryEngine engine) {
    return Set_classifier_name.Matcher.on(engine);
  }
  
  @Override
  public Set_classifier_name.Matcher instantiate() {
    return Set_classifier_name.Matcher.create();
  }
  
  @Override
  public Set_classifier_name.Match newEmptyMatch() {
    return Set_classifier_name.Match.newEmptyMatch();
  }
  
  @Override
  public Set_classifier_name.Match newMatch(final Object... parameters) {
    return Set_classifier_name.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_classifier_name (visibility: PUBLIC, simpleName: Set_classifier_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_classifier_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_classifier_name (visibility: PUBLIC, simpleName: Set_classifier_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_classifier_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Set_classifier_name INSTANCE = new Set_classifier_name();
    
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
    private final static Set_classifier_name.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClassifier = new PParameter("classifier", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClassifier, parameter_pName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_classifier_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classifier","name");
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
          PVariable var_name = body.getOrCreateVariableByName("name");
          PVariable var__initial_classifier = body.getOrCreateVariableByName("_initial_classifier");
          PVariable var__current_classifier = body.getOrCreateVariableByName("_current_classifier");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_classifier, parameter_pClassifier),
             new ExportedParameter(body, var_name, parameter_pName)
          ));
          // 	neg find initial_classifier_name (classifier, _initial_classifier, name)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_classifier, var__initial_classifier, var_name), Initial_classifier_name.instance().getInternalQueryRepresentation());
          // 	find current_classifier_name (classifier, _current_classifier, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_classifier, var__current_classifier, var_name), Current_classifier_name.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
