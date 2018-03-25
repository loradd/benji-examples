/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ModelElementQueries.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_modelElement;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_modelElement;
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
public final class Create_modelElement extends BaseGeneratedEMFQuerySpecification<Create_modelElement.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.create_modelElement pattern,
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
    private TraceLink fModelElement;
    
    private static List<String> parameterNames = makeImmutableList("modelElement");
    
    private Match(final TraceLink pModelElement) {
      this.fModelElement = pModelElement;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("modelElement".equals(parameterName)) return this.fModelElement;
      return null;
    }
    
    public TraceLink getModelElement() {
      return this.fModelElement;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("modelElement".equals(parameterName) ) {
          this.fModelElement = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setModelElement(final TraceLink pModelElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fModelElement = pModelElement;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.create_modelElement";
    }
    
    @Override
    public List<String> parameterNames() {
      return Create_modelElement.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fModelElement};
    }
    
    @Override
    public Create_modelElement.Match toImmutable() {
      return isMutable() ? newMatch(fModelElement) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"modelElement\"=" + prettyPrintValue(fModelElement));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fModelElement);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Create_modelElement.Match)) {
          Create_modelElement.Match other = (Create_modelElement.Match) obj;
          return Objects.equals(fModelElement, other.fModelElement);
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
    public Create_modelElement specification() {
      return Create_modelElement.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Create_modelElement.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Create_modelElement.Match newMutableMatch(final TraceLink pModelElement) {
      return new Mutable(pModelElement);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Create_modelElement.Match newMatch(final TraceLink pModelElement) {
      return new Immutable(pModelElement);
    }
    
    private static final class Mutable extends Create_modelElement.Match {
      Mutable(final TraceLink pModelElement) {
        super(pModelElement);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Create_modelElement.Match {
      Immutable(final TraceLink pModelElement) {
        super(pModelElement);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.create_modelElement pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // model element - create 
   * pattern create_modelElement (modelElement : TraceLink) {
   * 	neg find initial_modelElement (modelElement, _initial_modelElement);
   * 	find current_modelElement (modelElement, _current_modelElement);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Create_modelElement
   * 
   */
  public static class Matcher extends BaseMatcher<Create_modelElement.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Create_modelElement.Matcher on(final ViatraQueryEngine engine) {
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
    public static Create_modelElement.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_MODELELEMENT = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Create_modelElement.Matcher.class);
    
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
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Create_modelElement.Match> getAllMatches(final TraceLink pModelElement) {
      return rawGetAllMatches(new Object[]{pModelElement});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Create_modelElement.Match getOneArbitraryMatch(final TraceLink pModelElement) {
      return rawGetOneArbitraryMatch(new Object[]{pModelElement});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pModelElement) {
      return rawHasMatch(new Object[]{pModelElement});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pModelElement) {
      return rawCountMatches(new Object[]{pModelElement});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pModelElement, final IMatchProcessor<? super Create_modelElement.Match> processor) {
      rawForEachMatch(new Object[]{pModelElement}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pModelElement, final IMatchProcessor<? super Create_modelElement.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pModelElement}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pModelElement the fixed value of pattern parameter modelElement, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Create_modelElement.Match newMatch(final TraceLink pModelElement) {
      return Create_modelElement.Match.newMatch(pModelElement);
    }
    
    /**
     * Retrieve the set of values that occur in matches for modelElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfmodelElement(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_MODELELEMENT, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for modelElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfmodelElement() {
      return rawAccumulateAllValuesOfmodelElement(emptyArray());
    }
    
    @Override
    protected Create_modelElement.Match tupleToMatch(final Tuple t) {
      try {
          return Create_modelElement.Match.newMatch((TraceLink) t.get(POSITION_MODELELEMENT));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Create_modelElement.Match arrayToMatch(final Object[] match) {
      try {
          return Create_modelElement.Match.newMatch((TraceLink) match[POSITION_MODELELEMENT]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Create_modelElement.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Create_modelElement.Match.newMutableMatch((TraceLink) match[POSITION_MODELELEMENT]);
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
    public static IQuerySpecification<Create_modelElement.Matcher> querySpecification() {
      return Create_modelElement.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.create_modelElement pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Create_modelElement.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pModelElement the value of pattern parameter modelElement in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pModelElement);
    
    @Override
    public void process(final Create_modelElement.Match match) {
      process(match.getModelElement());
    }
  }
  
  private Create_modelElement() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Create_modelElement instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Create_modelElement.Matcher instantiate(final ViatraQueryEngine engine) {
    return Create_modelElement.Matcher.on(engine);
  }
  
  @Override
  public Create_modelElement.Matcher instantiate() {
    return Create_modelElement.Matcher.create();
  }
  
  @Override
  public Create_modelElement.Match newEmptyMatch() {
    return Create_modelElement.Match.newEmptyMatch();
  }
  
  @Override
  public Create_modelElement.Match newMatch(final Object... parameters) {
    return Create_modelElement.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_modelElement (visibility: PUBLIC, simpleName: Create_modelElement, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_modelElement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_modelElement (visibility: PUBLIC, simpleName: Create_modelElement, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_modelElement, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Create_modelElement INSTANCE = new Create_modelElement();
    
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
    private final static Create_modelElement.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pModelElement = new PParameter("modelElement", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pModelElement);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.create_modelElement";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("modelElement");
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
          PVariable var_modelElement = body.getOrCreateVariableByName("modelElement");
          PVariable var__initial_modelElement = body.getOrCreateVariableByName("_initial_modelElement");
          PVariable var__current_modelElement = body.getOrCreateVariableByName("_current_modelElement");
          new TypeConstraint(body, Tuples.flatTupleOf(var_modelElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_modelElement, parameter_pModelElement)
          ));
          // 	neg find initial_modelElement (modelElement, _initial_modelElement)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_modelElement, var__initial_modelElement), Initial_modelElement.instance().getInternalQueryRepresentation());
          // 	find current_modelElement (modelElement, _current_modelElement)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_modelElement, var__current_modelElement), Current_modelElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
