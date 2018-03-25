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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_type;
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
public final class Set_attribute_type extends BaseGeneratedEMFQuerySpecification<Set_attribute_type.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_attribute_type pattern,
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
    
    private TraceLink fType;
    
    private static List<String> parameterNames = makeImmutableList("attribute", "type");
    
    private Match(final TraceLink pAttribute, final TraceLink pType) {
      this.fAttribute = pAttribute;
      this.fType = pType;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("type".equals(parameterName)) return this.fType;
      return null;
    }
    
    public TraceLink getAttribute() {
      return this.fAttribute;
    }
    
    public TraceLink getType() {
      return this.fType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (TraceLink) newValue;
          return true;
      }
      if ("type".equals(parameterName) ) {
          this.fType = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttribute(final TraceLink pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setType(final TraceLink pType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fType = pType;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_attribute_type";
    }
    
    @Override
    public List<String> parameterNames() {
      return Set_attribute_type.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttribute, fType};
    }
    
    @Override
    public Set_attribute_type.Match toImmutable() {
      return isMutable() ? newMatch(fAttribute, fType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"type\"=" + prettyPrintValue(fType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fAttribute, fType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Set_attribute_type.Match)) {
          Set_attribute_type.Match other = (Set_attribute_type.Match) obj;
          return Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fType, other.fType);
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
    public Set_attribute_type specification() {
      return Set_attribute_type.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Set_attribute_type.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Set_attribute_type.Match newMutableMatch(final TraceLink pAttribute, final TraceLink pType) {
      return new Mutable(pAttribute, pType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Set_attribute_type.Match newMatch(final TraceLink pAttribute, final TraceLink pType) {
      return new Immutable(pAttribute, pType);
    }
    
    private static final class Mutable extends Set_attribute_type.Match {
      Mutable(final TraceLink pAttribute, final TraceLink pType) {
        super(pAttribute, pType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Set_attribute_type.Match {
      Immutable(final TraceLink pAttribute, final TraceLink pType) {
        super(pAttribute, pType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_attribute_type pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - type - set
   * pattern set_attribute_type (attribute : TraceLink, type : TraceLink) {
   * 	neg find initial_attribute_type (attribute, _initial_attribute, type, _initial_type); 
   * 	find current_attribute_type (attribute, _current_attribute, type, _current_type);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Set_attribute_type
   * 
   */
  public static class Matcher extends BaseMatcher<Set_attribute_type.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Set_attribute_type.Matcher on(final ViatraQueryEngine engine) {
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
    public static Set_attribute_type.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ATTRIBUTE = 0;
    
    private final static int POSITION_TYPE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Set_attribute_type.Matcher.class);
    
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
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Set_attribute_type.Match> getAllMatches(final TraceLink pAttribute, final TraceLink pType) {
      return rawGetAllMatches(new Object[]{pAttribute, pType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Set_attribute_type.Match getOneArbitraryMatch(final TraceLink pAttribute, final TraceLink pType) {
      return rawGetOneArbitraryMatch(new Object[]{pAttribute, pType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pAttribute, final TraceLink pType) {
      return rawHasMatch(new Object[]{pAttribute, pType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pAttribute, final TraceLink pType) {
      return rawCountMatches(new Object[]{pAttribute, pType});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pAttribute, final TraceLink pType, final IMatchProcessor<? super Set_attribute_type.Match> processor) {
      rawForEachMatch(new Object[]{pAttribute, pType}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pAttribute, final TraceLink pType, final IMatchProcessor<? super Set_attribute_type.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttribute, pType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Set_attribute_type.Match newMatch(final TraceLink pAttribute, final TraceLink pType) {
      return Set_attribute_type.Match.newMatch(pAttribute, pType);
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
    public Set<TraceLink> getAllValuesOfattribute(final Set_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final TraceLink pType) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      null, 
      pType
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOftype(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftype() {
      return rawAccumulateAllValuesOftype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftype(final Set_attribute_type.Match partialMatch) {
      return rawAccumulateAllValuesOftype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOftype(final TraceLink pAttribute) {
      return rawAccumulateAllValuesOftype(new Object[]{
      pAttribute, 
      null
      });
    }
    
    @Override
    protected Set_attribute_type.Match tupleToMatch(final Tuple t) {
      try {
          return Set_attribute_type.Match.newMatch((TraceLink) t.get(POSITION_ATTRIBUTE), (TraceLink) t.get(POSITION_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Set_attribute_type.Match arrayToMatch(final Object[] match) {
      try {
          return Set_attribute_type.Match.newMatch((TraceLink) match[POSITION_ATTRIBUTE], (TraceLink) match[POSITION_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Set_attribute_type.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Set_attribute_type.Match.newMutableMatch((TraceLink) match[POSITION_ATTRIBUTE], (TraceLink) match[POSITION_TYPE]);
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
    public static IQuerySpecification<Set_attribute_type.Matcher> querySpecification() {
      return Set_attribute_type.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_attribute_type pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Set_attribute_type.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pType the value of pattern parameter type in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pAttribute, final TraceLink pType);
    
    @Override
    public void process(final Set_attribute_type.Match match) {
      process(match.getAttribute(), match.getType());
    }
  }
  
  private Set_attribute_type() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Set_attribute_type instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Set_attribute_type.Matcher instantiate(final ViatraQueryEngine engine) {
    return Set_attribute_type.Matcher.on(engine);
  }
  
  @Override
  public Set_attribute_type.Matcher instantiate() {
    return Set_attribute_type.Matcher.create();
  }
  
  @Override
  public Set_attribute_type.Match newEmptyMatch() {
    return Set_attribute_type.Match.newEmptyMatch();
  }
  
  @Override
  public Set_attribute_type.Match newMatch(final Object... parameters) {
    return Set_attribute_type.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_type (visibility: PUBLIC, simpleName: Set_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_type (visibility: PUBLIC, simpleName: Set_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Set_attribute_type INSTANCE = new Set_attribute_type();
    
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
    private final static Set_attribute_type.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pType = new PParameter("type", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pAttribute, parameter_pType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.set_attribute_type";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attribute","type");
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
          PVariable var_type = body.getOrCreateVariableByName("type");
          PVariable var__initial_attribute = body.getOrCreateVariableByName("_initial_attribute");
          PVariable var__initial_type = body.getOrCreateVariableByName("_initial_type");
          PVariable var__current_attribute = body.getOrCreateVariableByName("_current_attribute");
          PVariable var__current_type = body.getOrCreateVariableByName("_current_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_type, parameter_pType)
          ));
          // 	neg find initial_attribute_type (attribute, _initial_attribute, type, _initial_type)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_attribute, var__initial_attribute, var_type, var__initial_type), Initial_attribute_type.instance().getInternalQueryRepresentation());
          //  	find current_attribute_type (attribute, _current_attribute, type, _current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var__current_attribute, var_type, var__current_type), Current_attribute_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
