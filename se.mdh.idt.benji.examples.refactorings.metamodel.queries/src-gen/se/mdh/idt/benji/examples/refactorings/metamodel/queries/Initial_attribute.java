/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Attribute.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature;
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
public final class Initial_attribute extends BaseGeneratedEMFQuerySpecification<Initial_attribute.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute pattern,
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
    
    private Attribute fInitial_attribute;
    
    private static List<String> parameterNames = makeImmutableList("attribute", "initial_attribute");
    
    private Match(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      this.fAttribute = pAttribute;
      this.fInitial_attribute = pInitial_attribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("initial_attribute".equals(parameterName)) return this.fInitial_attribute;
      return null;
    }
    
    public TraceLink getAttribute() {
      return this.fAttribute;
    }
    
    public Attribute getInitial_attribute() {
      return this.fInitial_attribute;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (TraceLink) newValue;
          return true;
      }
      if ("initial_attribute".equals(parameterName) ) {
          this.fInitial_attribute = (Attribute) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttribute(final TraceLink pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setInitial_attribute(final Attribute pInitial_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_attribute = pInitial_attribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_attribute.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttribute, fInitial_attribute};
    }
    
    @Override
    public Initial_attribute.Match toImmutable() {
      return isMutable() ? newMatch(fAttribute, fInitial_attribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"initial_attribute\"=" + prettyPrintValue(fInitial_attribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fAttribute, fInitial_attribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_attribute.Match)) {
          Initial_attribute.Match other = (Initial_attribute.Match) obj;
          return Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fInitial_attribute, other.fInitial_attribute);
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
    public Initial_attribute specification() {
      return Initial_attribute.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_attribute.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_attribute.Match newMutableMatch(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      return new Mutable(pAttribute, pInitial_attribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_attribute.Match newMatch(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      return new Immutable(pAttribute, pInitial_attribute);
    }
    
    private static final class Mutable extends Initial_attribute.Match {
      Mutable(final TraceLink pAttribute, final Attribute pInitial_attribute) {
        super(pAttribute, pInitial_attribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_attribute.Match {
      Immutable(final TraceLink pAttribute, final Attribute pInitial_attribute) {
        super(pAttribute, pInitial_attribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - initial
   * pattern initial_attribute (attribute : TraceLink, initial_attribute : Attribute) {
   * 	find initial_structuralFeature (attribute, initial_attribute);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_attribute
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_attribute.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_attribute.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_attribute.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ATTRIBUTE = 0;
    
    private final static int POSITION_INITIAL_ATTRIBUTE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_attribute.Matcher.class);
    
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
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_attribute.Match> getAllMatches(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      return rawGetAllMatches(new Object[]{pAttribute, pInitial_attribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_attribute.Match getOneArbitraryMatch(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      return rawGetOneArbitraryMatch(new Object[]{pAttribute, pInitial_attribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      return rawHasMatch(new Object[]{pAttribute, pInitial_attribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      return rawCountMatches(new Object[]{pAttribute, pInitial_attribute});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final IMatchProcessor<? super Initial_attribute.Match> processor) {
      rawForEachMatch(new Object[]{pAttribute, pInitial_attribute}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final IMatchProcessor<? super Initial_attribute.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttribute, pInitial_attribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_attribute.Match newMatch(final TraceLink pAttribute, final Attribute pInitial_attribute) {
      return Initial_attribute.Match.newMatch(pAttribute, pInitial_attribute);
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
    public Set<TraceLink> getAllValuesOfattribute(final Initial_attribute.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final Attribute pInitial_attribute) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      null, 
      pInitial_attribute
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfinitial_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_INITIAL_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute() {
      return rawAccumulateAllValuesOfinitial_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final Initial_attribute.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final TraceLink pAttribute) {
      return rawAccumulateAllValuesOfinitial_attribute(new Object[]{
      pAttribute, 
      null
      });
    }
    
    @Override
    protected Initial_attribute.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_attribute.Match.newMatch((TraceLink) t.get(POSITION_ATTRIBUTE), (Attribute) t.get(POSITION_INITIAL_ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_attribute.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_attribute.Match.newMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_INITIAL_ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_attribute.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_attribute.Match.newMutableMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_INITIAL_ATTRIBUTE]);
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
    public static IQuerySpecification<Initial_attribute.Matcher> querySpecification() {
      return Initial_attribute.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_attribute.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pInitial_attribute the value of pattern parameter initial_attribute in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pAttribute, final Attribute pInitial_attribute);
    
    @Override
    public void process(final Initial_attribute.Match match) {
      process(match.getAttribute(), match.getInitial_attribute());
    }
  }
  
  private Initial_attribute() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_attribute instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_attribute.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_attribute.Matcher.on(engine);
  }
  
  @Override
  public Initial_attribute.Matcher instantiate() {
    return Initial_attribute.Matcher.create();
  }
  
  @Override
  public Initial_attribute.Match newEmptyMatch() {
    return Initial_attribute.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_attribute.Match newMatch(final Object... parameters) {
    return Initial_attribute.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute (visibility: PUBLIC, simpleName: Initial_attribute, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute (visibility: PUBLIC, simpleName: Initial_attribute, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_attribute INSTANCE = new Initial_attribute();
    
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
    private final static Initial_attribute.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_attribute = new PParameter("initial_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pAttribute, parameter_pInitial_attribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attribute","initial_attribute");
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
          PVariable var_initial_attribute = body.getOrCreateVariableByName("initial_attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_initial_attribute, parameter_pInitial_attribute)
          ));
          // 	find initial_structuralFeature (attribute, initial_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_initial_attribute), Initial_structuralFeature.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
