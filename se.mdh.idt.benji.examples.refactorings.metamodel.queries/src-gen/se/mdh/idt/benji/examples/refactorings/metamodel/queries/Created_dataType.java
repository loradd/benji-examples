/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/DataType.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_classifier;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Created_dataType extends BaseGeneratedEMFQuerySpecification<Created_dataType.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_dataType pattern,
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
    private DataType fCurrent_dataType;
    
    private static List<String> parameterNames = makeImmutableList("current_dataType");
    
    private Match(final DataType pCurrent_dataType) {
      this.fCurrent_dataType = pCurrent_dataType;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("current_dataType".equals(parameterName)) return this.fCurrent_dataType;
      return null;
    }
    
    public DataType getCurrent_dataType() {
      return this.fCurrent_dataType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("current_dataType".equals(parameterName) ) {
          this.fCurrent_dataType = (DataType) newValue;
          return true;
      }
      return false;
    }
    
    public void setCurrent_dataType(final DataType pCurrent_dataType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_dataType = pCurrent_dataType;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_dataType";
    }
    
    @Override
    public List<String> parameterNames() {
      return Created_dataType.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fCurrent_dataType};
    }
    
    @Override
    public Created_dataType.Match toImmutable() {
      return isMutable() ? newMatch(fCurrent_dataType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"current_dataType\"=" + prettyPrintValue(fCurrent_dataType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fCurrent_dataType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Created_dataType.Match)) {
          Created_dataType.Match other = (Created_dataType.Match) obj;
          return Objects.equals(fCurrent_dataType, other.fCurrent_dataType);
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
    public Created_dataType specification() {
      return Created_dataType.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Created_dataType.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Created_dataType.Match newMutableMatch(final DataType pCurrent_dataType) {
      return new Mutable(pCurrent_dataType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Created_dataType.Match newMatch(final DataType pCurrent_dataType) {
      return new Immutable(pCurrent_dataType);
    }
    
    private static final class Mutable extends Created_dataType.Match {
      Mutable(final DataType pCurrent_dataType) {
        super(pCurrent_dataType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Created_dataType.Match {
      Immutable(final DataType pCurrent_dataType) {
        super(pCurrent_dataType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_dataType pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // dataType - created
   * pattern created_dataType (current_dataType : DataType) {
   * 	find created_classifier (current_dataType); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Created_dataType
   * 
   */
  public static class Matcher extends BaseMatcher<Created_dataType.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Created_dataType.Matcher on(final ViatraQueryEngine engine) {
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
    public static Created_dataType.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CURRENT_DATATYPE = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Created_dataType.Matcher.class);
    
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
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Created_dataType.Match> getAllMatches(final DataType pCurrent_dataType) {
      return rawGetAllMatches(new Object[]{pCurrent_dataType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Created_dataType.Match getOneArbitraryMatch(final DataType pCurrent_dataType) {
      return rawGetOneArbitraryMatch(new Object[]{pCurrent_dataType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DataType pCurrent_dataType) {
      return rawHasMatch(new Object[]{pCurrent_dataType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DataType pCurrent_dataType) {
      return rawCountMatches(new Object[]{pCurrent_dataType});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final DataType pCurrent_dataType, final IMatchProcessor<? super Created_dataType.Match> processor) {
      rawForEachMatch(new Object[]{pCurrent_dataType}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DataType pCurrent_dataType, final IMatchProcessor<? super Created_dataType.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pCurrent_dataType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pCurrent_dataType the fixed value of pattern parameter current_dataType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Created_dataType.Match newMatch(final DataType pCurrent_dataType) {
      return Created_dataType.Match.newMatch(pCurrent_dataType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfcurrent_dataType(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_CURRENT_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_dataType() {
      return rawAccumulateAllValuesOfcurrent_dataType(emptyArray());
    }
    
    @Override
    protected Created_dataType.Match tupleToMatch(final Tuple t) {
      try {
          return Created_dataType.Match.newMatch((DataType) t.get(POSITION_CURRENT_DATATYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Created_dataType.Match arrayToMatch(final Object[] match) {
      try {
          return Created_dataType.Match.newMatch((DataType) match[POSITION_CURRENT_DATATYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Created_dataType.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Created_dataType.Match.newMutableMatch((DataType) match[POSITION_CURRENT_DATATYPE]);
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
    public static IQuerySpecification<Created_dataType.Matcher> querySpecification() {
      return Created_dataType.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_dataType pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Created_dataType.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pCurrent_dataType the value of pattern parameter current_dataType in the currently processed match
     * 
     */
    public abstract void process(final DataType pCurrent_dataType);
    
    @Override
    public void process(final Created_dataType.Match match) {
      process(match.getCurrent_dataType());
    }
  }
  
  private Created_dataType() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Created_dataType instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Created_dataType.Matcher instantiate(final ViatraQueryEngine engine) {
    return Created_dataType.Matcher.on(engine);
  }
  
  @Override
  public Created_dataType.Matcher instantiate() {
    return Created_dataType.Matcher.create();
  }
  
  @Override
  public Created_dataType.Match newEmptyMatch() {
    return Created_dataType.Match.newEmptyMatch();
  }
  
  @Override
  public Created_dataType.Match newMatch(final Object... parameters) {
    return Created_dataType.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_dataType (visibility: PUBLIC, simpleName: Created_dataType, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_dataType, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_dataType (visibility: PUBLIC, simpleName: Created_dataType, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Created_dataType, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Created_dataType INSTANCE = new Created_dataType();
    
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
    private final static Created_dataType.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pCurrent_dataType = new PParameter("current_dataType", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pCurrent_dataType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.created_dataType";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("current_dataType");
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
          PVariable var_current_dataType = body.getOrCreateVariableByName("current_dataType");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_dataType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_current_dataType, parameter_pCurrent_dataType)
          ));
          // 	find created_classifier (current_dataType)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_dataType), Created_classifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
