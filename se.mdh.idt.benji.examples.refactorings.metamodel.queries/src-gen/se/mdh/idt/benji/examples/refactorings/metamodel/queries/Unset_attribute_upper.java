/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/AttributeQueries.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_upper;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_upper;
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
public final class Unset_attribute_upper extends BaseGeneratedEMFQuerySpecification<Unset_attribute_upper.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.unset_attribute_upper pattern,
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
    private TraceLink fAttribute;
    
    private Integer fUpper;
    
    private static List<String> parameterNames = makeImmutableList("attribute", "upper");
    
    private Match(final TraceLink pAttribute, final Integer pUpper) {
      this.fAttribute = pAttribute;
      this.fUpper = pUpper;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("upper".equals(parameterName)) return this.fUpper;
      return null;
    }
    
    public TraceLink getAttribute() {
      return this.fAttribute;
    }
    
    public Integer getUpper() {
      return this.fUpper;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (TraceLink) newValue;
          return true;
      }
      if ("upper".equals(parameterName) ) {
          this.fUpper = (Integer) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttribute(final TraceLink pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setUpper(final Integer pUpper) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUpper = pUpper;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.unset_attribute_upper";
    }
    
    @Override
    public List<String> parameterNames() {
      return Unset_attribute_upper.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttribute, fUpper};
    }
    
    @Override
    public Unset_attribute_upper.Match toImmutable() {
      return isMutable() ? newMatch(fAttribute, fUpper) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"upper\"=" + prettyPrintValue(fUpper));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fAttribute, fUpper);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Unset_attribute_upper.Match)) {
          Unset_attribute_upper.Match other = (Unset_attribute_upper.Match) obj;
          return Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fUpper, other.fUpper);
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
    public Unset_attribute_upper specification() {
      return Unset_attribute_upper.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Unset_attribute_upper.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Unset_attribute_upper.Match newMutableMatch(final TraceLink pAttribute, final Integer pUpper) {
      return new Mutable(pAttribute, pUpper);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Unset_attribute_upper.Match newMatch(final TraceLink pAttribute, final Integer pUpper) {
      return new Immutable(pAttribute, pUpper);
    }
    
    private static final class Mutable extends Unset_attribute_upper.Match {
      Mutable(final TraceLink pAttribute, final Integer pUpper) {
        super(pAttribute, pUpper);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Unset_attribute_upper.Match {
      Immutable(final TraceLink pAttribute, final Integer pUpper) {
        super(pAttribute, pUpper);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.unset_attribute_upper pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - upper - unset
   * pattern unset_attribute_upper (attribute : TraceLink, upper : java Integer) {
   * 	find initial_attribute_upper (attribute, _initial_attribute, upper);
   * 	neg find current_attribute_upper (attribute, _current_attribute, upper);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Unset_attribute_upper
   * 
   */
  public static class Matcher extends BaseMatcher<Unset_attribute_upper.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Unset_attribute_upper.Matcher on(final ViatraQueryEngine engine) {
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
    public static Unset_attribute_upper.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ATTRIBUTE = 0;
    
    private final static int POSITION_UPPER = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Unset_attribute_upper.Matcher.class);
    
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
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Unset_attribute_upper.Match> getAllMatches(final TraceLink pAttribute, final Integer pUpper) {
      return rawGetAllMatches(new Object[]{pAttribute, pUpper});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Unset_attribute_upper.Match getOneArbitraryMatch(final TraceLink pAttribute, final Integer pUpper) {
      return rawGetOneArbitraryMatch(new Object[]{pAttribute, pUpper});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pAttribute, final Integer pUpper) {
      return rawHasMatch(new Object[]{pAttribute, pUpper});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pAttribute, final Integer pUpper) {
      return rawCountMatches(new Object[]{pAttribute, pUpper});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pAttribute, final Integer pUpper, final IMatchProcessor<? super Unset_attribute_upper.Match> processor) {
      rawForEachMatch(new Object[]{pAttribute, pUpper}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pAttribute, final Integer pUpper, final IMatchProcessor<? super Unset_attribute_upper.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttribute, pUpper}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pUpper the fixed value of pattern parameter upper, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Unset_attribute_upper.Match newMatch(final TraceLink pAttribute, final Integer pUpper) {
      return Unset_attribute_upper.Match.newMatch(pAttribute, pUpper);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfattribute(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute() {
      return rawAccumulateAllValuesOfattribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final Unset_attribute_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final Integer pUpper) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      null, 
      pUpper
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Integer> rawAccumulateAllValuesOfupper(final Object[] parameters) {
      Set<Integer> results = new HashSet<Integer>();
      rawAccumulateAllValues(POSITION_UPPER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfupper() {
      return rawAccumulateAllValuesOfupper(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfupper(final Unset_attribute_upper.Match partialMatch) {
      return rawAccumulateAllValuesOfupper(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for upper.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Integer> getAllValuesOfupper(final TraceLink pAttribute) {
      return rawAccumulateAllValuesOfupper(new Object[]{
      pAttribute, 
      null
      });
    }
    
    @Override
    protected Unset_attribute_upper.Match tupleToMatch(final Tuple t) {
      try {
          return Unset_attribute_upper.Match.newMatch((TraceLink) t.get(POSITION_ATTRIBUTE), (Integer) t.get(POSITION_UPPER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unset_attribute_upper.Match arrayToMatch(final Object[] match) {
      try {
          return Unset_attribute_upper.Match.newMatch((TraceLink) match[POSITION_ATTRIBUTE], (Integer) match[POSITION_UPPER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Unset_attribute_upper.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Unset_attribute_upper.Match.newMutableMatch((TraceLink) match[POSITION_ATTRIBUTE], (Integer) match[POSITION_UPPER]);
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
    public static IQuerySpecification<Unset_attribute_upper.Matcher> querySpecification() {
      return Unset_attribute_upper.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.unset_attribute_upper pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Unset_attribute_upper.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pUpper the value of pattern parameter upper in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pAttribute, final Integer pUpper);
    
    @Override
    public void process(final Unset_attribute_upper.Match match) {
      process(match.getAttribute(), match.getUpper());
    }
  }
  
  private Unset_attribute_upper() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Unset_attribute_upper instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Unset_attribute_upper.Matcher instantiate(final ViatraQueryEngine engine) {
    return Unset_attribute_upper.Matcher.on(engine);
  }
  
  @Override
  public Unset_attribute_upper.Matcher instantiate() {
    return Unset_attribute_upper.Matcher.create();
  }
  
  @Override
  public Unset_attribute_upper.Match newEmptyMatch() {
    return Unset_attribute_upper.Match.newEmptyMatch();
  }
  
  @Override
  public Unset_attribute_upper.Match newMatch(final Object... parameters) {
    return Unset_attribute_upper.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_upper (visibility: PUBLIC, simpleName: Unset_attribute_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_upper (visibility: PUBLIC, simpleName: Unset_attribute_upper, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_attribute_upper, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Unset_attribute_upper INSTANCE = new Unset_attribute_upper();
    
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
    private final static Unset_attribute_upper.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pUpper = new PParameter("upper", "java.lang.Integer", new JavaTransitiveInstancesKey(java.lang.Integer.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pAttribute, parameter_pUpper);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.unset_attribute_upper";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attribute","upper");
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
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          PVariable var_upper = body.getOrCreateVariableByName("upper");
          PVariable var__initial_attribute = body.getOrCreateVariableByName("_initial_attribute");
          PVariable var__current_attribute = body.getOrCreateVariableByName("_current_attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_upper), new JavaTransitiveInstancesKey(java.lang.Integer.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_upper, parameter_pUpper)
          ));
          // 	find initial_attribute_upper (attribute, _initial_attribute, upper)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var__initial_attribute, var_upper), Initial_attribute_upper.instance().getInternalQueryRepresentation());
          // 	neg find current_attribute_upper (attribute, _current_attribute, upper)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_attribute, var__current_attribute, var_upper), Current_attribute_upper.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
