/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/EnumerationLiteral.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_enumerationLiteral;
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
public final class Get_enumerationLiteral extends BaseGeneratedEMFQuerySpecification<Get_enumerationLiteral.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.get_enumerationLiteral pattern,
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
    private TraceLink fEnumerationLiteral;
    
    private static List<String> parameterNames = makeImmutableList("enumerationLiteral");
    
    private Match(final TraceLink pEnumerationLiteral) {
      this.fEnumerationLiteral = pEnumerationLiteral;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("enumerationLiteral".equals(parameterName)) return this.fEnumerationLiteral;
      return null;
    }
    
    public TraceLink getEnumerationLiteral() {
      return this.fEnumerationLiteral;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("enumerationLiteral".equals(parameterName) ) {
          this.fEnumerationLiteral = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnumerationLiteral(final TraceLink pEnumerationLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumerationLiteral = pEnumerationLiteral;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.get_enumerationLiteral";
    }
    
    @Override
    public List<String> parameterNames() {
      return Get_enumerationLiteral.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnumerationLiteral};
    }
    
    @Override
    public Get_enumerationLiteral.Match toImmutable() {
      return isMutable() ? newMatch(fEnumerationLiteral) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"enumerationLiteral\"=" + prettyPrintValue(fEnumerationLiteral));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fEnumerationLiteral);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Get_enumerationLiteral.Match)) {
          Get_enumerationLiteral.Match other = (Get_enumerationLiteral.Match) obj;
          return Objects.equals(fEnumerationLiteral, other.fEnumerationLiteral);
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
    public Get_enumerationLiteral specification() {
      return Get_enumerationLiteral.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Get_enumerationLiteral.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Get_enumerationLiteral.Match newMutableMatch(final TraceLink pEnumerationLiteral) {
      return new Mutable(pEnumerationLiteral);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Get_enumerationLiteral.Match newMatch(final TraceLink pEnumerationLiteral) {
      return new Immutable(pEnumerationLiteral);
    }
    
    private static final class Mutable extends Get_enumerationLiteral.Match {
      Mutable(final TraceLink pEnumerationLiteral) {
        super(pEnumerationLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Get_enumerationLiteral.Match {
      Immutable(final TraceLink pEnumerationLiteral) {
        super(pEnumerationLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.get_enumerationLiteral pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration literal - get
   * pattern get_enumerationLiteral (enumerationLiteral : TraceLink) {
   * 	find initial_enumerationLiteral (enumerationLiteral, _initial_enumerationLiteral);
   * 	find current_enumerationLiteral (enumerationLiteral, _current_enumerationLiteral);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Get_enumerationLiteral
   * 
   */
  public static class Matcher extends BaseMatcher<Get_enumerationLiteral.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Get_enumerationLiteral.Matcher on(final ViatraQueryEngine engine) {
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
    public static Get_enumerationLiteral.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ENUMERATIONLITERAL = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Get_enumerationLiteral.Matcher.class);
    
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
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Get_enumerationLiteral.Match> getAllMatches(final TraceLink pEnumerationLiteral) {
      return rawGetAllMatches(new Object[]{pEnumerationLiteral});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Get_enumerationLiteral.Match getOneArbitraryMatch(final TraceLink pEnumerationLiteral) {
      return rawGetOneArbitraryMatch(new Object[]{pEnumerationLiteral});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pEnumerationLiteral) {
      return rawHasMatch(new Object[]{pEnumerationLiteral});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pEnumerationLiteral) {
      return rawCountMatches(new Object[]{pEnumerationLiteral});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pEnumerationLiteral, final IMatchProcessor<? super Get_enumerationLiteral.Match> processor) {
      rawForEachMatch(new Object[]{pEnumerationLiteral}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pEnumerationLiteral, final IMatchProcessor<? super Get_enumerationLiteral.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnumerationLiteral}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Get_enumerationLiteral.Match newMatch(final TraceLink pEnumerationLiteral) {
      return Get_enumerationLiteral.Match.newMatch(pEnumerationLiteral);
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfenumerationLiteral(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ENUMERATIONLITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral() {
      return rawAccumulateAllValuesOfenumerationLiteral(emptyArray());
    }
    
    @Override
    protected Get_enumerationLiteral.Match tupleToMatch(final Tuple t) {
      try {
          return Get_enumerationLiteral.Match.newMatch((TraceLink) t.get(POSITION_ENUMERATIONLITERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Get_enumerationLiteral.Match arrayToMatch(final Object[] match) {
      try {
          return Get_enumerationLiteral.Match.newMatch((TraceLink) match[POSITION_ENUMERATIONLITERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Get_enumerationLiteral.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Get_enumerationLiteral.Match.newMutableMatch((TraceLink) match[POSITION_ENUMERATIONLITERAL]);
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
    public static IQuerySpecification<Get_enumerationLiteral.Matcher> querySpecification() {
      return Get_enumerationLiteral.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.get_enumerationLiteral pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Get_enumerationLiteral.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEnumerationLiteral the value of pattern parameter enumerationLiteral in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pEnumerationLiteral);
    
    @Override
    public void process(final Get_enumerationLiteral.Match match) {
      process(match.getEnumerationLiteral());
    }
  }
  
  private Get_enumerationLiteral() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Get_enumerationLiteral instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Get_enumerationLiteral.Matcher instantiate(final ViatraQueryEngine engine) {
    return Get_enumerationLiteral.Matcher.on(engine);
  }
  
  @Override
  public Get_enumerationLiteral.Matcher instantiate() {
    return Get_enumerationLiteral.Matcher.create();
  }
  
  @Override
  public Get_enumerationLiteral.Match newEmptyMatch() {
    return Get_enumerationLiteral.Match.newEmptyMatch();
  }
  
  @Override
  public Get_enumerationLiteral.Match newMatch(final Object... parameters) {
    return Get_enumerationLiteral.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumerationLiteral (visibility: PUBLIC, simpleName: Get_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumerationLiteral (visibility: PUBLIC, simpleName: Get_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Get_enumerationLiteral INSTANCE = new Get_enumerationLiteral();
    
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
    private final static Get_enumerationLiteral.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEnumerationLiteral = new PParameter("enumerationLiteral", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEnumerationLiteral);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.get_enumerationLiteral";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("enumerationLiteral");
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
          PVariable var_enumerationLiteral = body.getOrCreateVariableByName("enumerationLiteral");
          PVariable var__initial_enumerationLiteral = body.getOrCreateVariableByName("_initial_enumerationLiteral");
          PVariable var__current_enumerationLiteral = body.getOrCreateVariableByName("_current_enumerationLiteral");
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumerationLiteral), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_enumerationLiteral, parameter_pEnumerationLiteral)
          ));
          // 	find initial_enumerationLiteral (enumerationLiteral, _initial_enumerationLiteral)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumerationLiteral, var__initial_enumerationLiteral), Initial_enumerationLiteral.instance().getInternalQueryRepresentation());
          // 	find current_enumerationLiteral (enumerationLiteral, _current_enumerationLiteral)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumerationLiteral, var__current_enumerationLiteral), Current_enumerationLiteral.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
