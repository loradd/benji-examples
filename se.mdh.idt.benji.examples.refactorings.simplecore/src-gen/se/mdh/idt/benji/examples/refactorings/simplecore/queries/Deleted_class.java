/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/ClassQueries.vql
 */
package se.mdh.idt.benji.examples.refactorings.simplecore.queries;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
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
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_class;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // class - deleted
 *         pattern deleted_class (class : Trace) {
 *         	find initial_class (class, _initial_class);
 *         	neg find current_class (class, _current_class);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Deleted_class extends BaseGeneratedEMFQuerySpecification<Deleted_class.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.deleted_class pattern,
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
    private Trace fClass;
    
    private static List<String> parameterNames = makeImmutableList("class");
    
    private Match(final Trace pClass) {
      this.fClass = pClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      return null;
    }
    
    public Trace getValueOfClass() {
      return this.fClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("class".equals(parameterName) ) {
          this.fClass = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setClass(final Trace pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.deleted_class";
    }
    
    @Override
    public List<String> parameterNames() {
      return Deleted_class.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass};
    }
    
    @Override
    public Deleted_class.Match toImmutable() {
      return isMutable() ? newMatch(fClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Deleted_class.Match)) {
          Deleted_class.Match other = (Deleted_class.Match) obj;
          return Objects.equals(fClass, other.fClass);
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
    public Deleted_class specification() {
      return Deleted_class.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Deleted_class.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Deleted_class.Match newMutableMatch(final Trace pClass) {
      return new Mutable(pClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Deleted_class.Match newMatch(final Trace pClass) {
      return new Immutable(pClass);
    }
    
    private static final class Mutable extends Deleted_class.Match {
      Mutable(final Trace pClass) {
        super(pClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Deleted_class.Match {
      Immutable(final Trace pClass) {
        super(pClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.deleted_class pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // class - deleted
   * pattern deleted_class (class : Trace) {
   * 	find initial_class (class, _initial_class);
   * 	neg find current_class (class, _current_class);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Deleted_class
   * 
   */
  public static class Matcher extends BaseMatcher<Deleted_class.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Deleted_class.Matcher on(final ViatraQueryEngine engine) {
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
    public static Deleted_class.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_CLASS = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Deleted_class.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }
    
    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Deleted_class.Match> getAllMatches(final Trace pClass) {
      return rawStreamAllMatches(new Object[]{pClass}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Deleted_class.Match> streamAllMatches(final Trace pClass) {
      return rawStreamAllMatches(new Object[]{pClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Deleted_class.Match> getOneArbitraryMatch(final Trace pClass) {
      return rawGetOneArbitraryMatch(new Object[]{pClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pClass) {
      return rawHasMatch(new Object[]{pClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pClass) {
      return rawCountMatches(new Object[]{pClass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pClass, final Consumer<? super Deleted_class.Match> processor) {
      rawForEachMatch(new Object[]{pClass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pClass, final Consumer<? super Deleted_class.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Deleted_class.Match newMatch(final Trace pClass) {
      return Deleted_class.Match.newMatch(pClass);
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfclass(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CLASS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass() {
      return rawStreamAllValuesOfclass(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfclass() {
      return rawStreamAllValuesOfclass(emptyArray());
    }
    
    @Override
    protected Deleted_class.Match tupleToMatch(final Tuple t) {
      try {
          return Deleted_class.Match.newMatch((Trace) t.get(POSITION_CLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted_class.Match arrayToMatch(final Object[] match) {
      try {
          return Deleted_class.Match.newMatch((Trace) match[POSITION_CLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted_class.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Deleted_class.Match.newMutableMatch((Trace) match[POSITION_CLASS]);
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
    public static IQuerySpecification<Deleted_class.Matcher> querySpecification() {
      return Deleted_class.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.simplecore.queries.deleted_class pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Deleted_class.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * 
     */
    public abstract void accept(final Trace pClass);
    
    @Override
    public void accept(final Deleted_class.Match match) {
      accept(match.getValueOfClass());
    }
  }
  
  private Deleted_class() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Deleted_class instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Deleted_class.Matcher instantiate(final ViatraQueryEngine engine) {
    return Deleted_class.Matcher.on(engine);
  }
  
  @Override
  public Deleted_class.Matcher instantiate() {
    return Deleted_class.Matcher.create();
  }
  
  @Override
  public Deleted_class.Match newEmptyMatch() {
    return Deleted_class.Match.newEmptyMatch();
  }
  
  @Override
  public Deleted_class.Match newMatch(final Object... parameters) {
    return Deleted_class.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_class (visibility: PUBLIC, simpleName: Deleted_class, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_class, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_class (visibility: PUBLIC, simpleName: Deleted_class, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Deleted_class, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Deleted_class INSTANCE = new Deleted_class();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final Deleted_class.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_class = new PParameter("class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_class);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.deleted_class";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var__initial_class = body.getOrCreateVariableByName("_initial_class");
          PVariable var__current_class = body.getOrCreateVariableByName("_current_class");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_class)
          ));
          // 	find initial_class (class, _initial_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var__initial_class), Initial_class.instance().getInternalQueryRepresentation());
          // 	neg find current_class (class, _current_class)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_class, var__current_class), Current_class.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
