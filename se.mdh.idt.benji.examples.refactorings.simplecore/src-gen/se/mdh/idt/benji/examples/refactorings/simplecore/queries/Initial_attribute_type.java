/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/AttributeQueries.vql
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_datatype;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // attribute - type - initial
 *         pattern initial_attribute_type (attribute : Trace, dataType : Trace) {
 *         	find initial_attribute (attribute, initial_attribute);
 *         	find initial_datatype (dataType, initial_dataType);
 *         	Attribute.type (initial_attribute, initial_dataType);	
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Initial_attribute_type extends BaseGeneratedEMFQuerySpecification<Initial_attribute_type.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.initial_attribute_type pattern,
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
    private Trace fAttribute;
    
    private Trace fDataType;
    
    private static List<String> parameterNames = makeImmutableList("attribute", "dataType");
    
    private Match(final Trace pAttribute, final Trace pDataType) {
      this.fAttribute = pAttribute;
      this.fDataType = pDataType;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("dataType".equals(parameterName)) return this.fDataType;
      return null;
    }
    
    public Trace getAttribute() {
      return this.fAttribute;
    }
    
    public Trace getDataType() {
      return this.fDataType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (Trace) newValue;
          return true;
      }
      if ("dataType".equals(parameterName) ) {
          this.fDataType = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttribute(final Trace pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setDataType(final Trace pDataType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDataType = pDataType;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.initial_attribute_type";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_attribute_type.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttribute, fDataType};
    }
    
    @Override
    public Initial_attribute_type.Match toImmutable() {
      return isMutable() ? newMatch(fAttribute, fDataType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"dataType\"=" + prettyPrintValue(fDataType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fAttribute, fDataType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_attribute_type.Match)) {
          Initial_attribute_type.Match other = (Initial_attribute_type.Match) obj;
          return Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fDataType, other.fDataType);
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
    public Initial_attribute_type specification() {
      return Initial_attribute_type.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_attribute_type.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_attribute_type.Match newMutableMatch(final Trace pAttribute, final Trace pDataType) {
      return new Mutable(pAttribute, pDataType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_attribute_type.Match newMatch(final Trace pAttribute, final Trace pDataType) {
      return new Immutable(pAttribute, pDataType);
    }
    
    private static final class Mutable extends Initial_attribute_type.Match {
      Mutable(final Trace pAttribute, final Trace pDataType) {
        super(pAttribute, pDataType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_attribute_type.Match {
      Immutable(final Trace pAttribute, final Trace pDataType) {
        super(pAttribute, pDataType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.initial_attribute_type pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - type - initial
   * pattern initial_attribute_type (attribute : Trace, dataType : Trace) {
   * 	find initial_attribute (attribute, initial_attribute);
   * 	find initial_datatype (dataType, initial_dataType);
   * 	Attribute.type (initial_attribute, initial_dataType);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_attribute_type
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_attribute_type.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_attribute_type.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_attribute_type.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_ATTRIBUTE = 0;
    
    private static final int POSITION_DATATYPE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_attribute_type.Matcher.class);
    
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
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_attribute_type.Match> getAllMatches(final Trace pAttribute, final Trace pDataType) {
      return rawStreamAllMatches(new Object[]{pAttribute, pDataType}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Initial_attribute_type.Match> streamAllMatches(final Trace pAttribute, final Trace pDataType) {
      return rawStreamAllMatches(new Object[]{pAttribute, pDataType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Initial_attribute_type.Match> getOneArbitraryMatch(final Trace pAttribute, final Trace pDataType) {
      return rawGetOneArbitraryMatch(new Object[]{pAttribute, pDataType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pAttribute, final Trace pDataType) {
      return rawHasMatch(new Object[]{pAttribute, pDataType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pAttribute, final Trace pDataType) {
      return rawCountMatches(new Object[]{pAttribute, pDataType});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pAttribute, final Trace pDataType, final Consumer<? super Initial_attribute_type.Match> processor) {
      rawForEachMatch(new Object[]{pAttribute, pDataType}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pAttribute, final Trace pDataType, final Consumer<? super Initial_attribute_type.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttribute, pDataType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_attribute_type.Match newMatch(final Trace pAttribute, final Trace pDataType) {
      return Initial_attribute_type.Match.newMatch(pAttribute, pDataType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfattribute(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ATTRIBUTE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute() {
      return rawStreamAllValuesOfattribute(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfattribute() {
      return rawStreamAllValuesOfattribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfattribute(final Initial_attribute_type.Match partialMatch) {
      return rawStreamAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfattribute(final Trace pDataType) {
      return rawStreamAllValuesOfattribute(new Object[]{null, pDataType});
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute(final Initial_attribute_type.Match partialMatch) {
      return rawStreamAllValuesOfattribute(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute(final Trace pDataType) {
      return rawStreamAllValuesOfattribute(new Object[]{null, pDataType}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfdataType(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DATATYPE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfdataType() {
      return rawStreamAllValuesOfdataType(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfdataType() {
      return rawStreamAllValuesOfdataType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfdataType(final Initial_attribute_type.Match partialMatch) {
      return rawStreamAllValuesOfdataType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfdataType(final Trace pAttribute) {
      return rawStreamAllValuesOfdataType(new Object[]{pAttribute, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfdataType(final Initial_attribute_type.Match partialMatch) {
      return rawStreamAllValuesOfdataType(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfdataType(final Trace pAttribute) {
      return rawStreamAllValuesOfdataType(new Object[]{pAttribute, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Initial_attribute_type.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_attribute_type.Match.newMatch((Trace) t.get(POSITION_ATTRIBUTE), (Trace) t.get(POSITION_DATATYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_attribute_type.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_attribute_type.Match.newMatch((Trace) match[POSITION_ATTRIBUTE], (Trace) match[POSITION_DATATYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_attribute_type.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_attribute_type.Match.newMutableMatch((Trace) match[POSITION_ATTRIBUTE], (Trace) match[POSITION_DATATYPE]);
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
    public static IQuerySpecification<Initial_attribute_type.Matcher> querySpecification() {
      return Initial_attribute_type.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.simplecore.queries.initial_attribute_type pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Initial_attribute_type.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pDataType the value of pattern parameter dataType in the currently processed match
     * 
     */
    public abstract void accept(final Trace pAttribute, final Trace pDataType);
    
    @Override
    public void accept(final Initial_attribute_type.Match match) {
      accept(match.getAttribute(), match.getDataType());
    }
  }
  
  private Initial_attribute_type() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_attribute_type instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_attribute_type.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_attribute_type.Matcher.on(engine);
  }
  
  @Override
  public Initial_attribute_type.Matcher instantiate() {
    return Initial_attribute_type.Matcher.create();
  }
  
  @Override
  public Initial_attribute_type.Match newEmptyMatch() {
    return Initial_attribute_type.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_attribute_type.Match newMatch(final Object... parameters) {
    return Initial_attribute_type.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute_type (visibility: PUBLIC, simpleName: Initial_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute_type (visibility: PUBLIC, simpleName: Initial_attribute_type, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Initial_attribute_type, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Initial_attribute_type INSTANCE = new Initial_attribute_type();
    
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
    private static final Initial_attribute_type.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_attribute = new PParameter("attribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_dataType = new PParameter("dataType", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_attribute, parameter_dataType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.initial_attribute_type";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attribute","dataType");
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
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          PVariable var_dataType = body.getOrCreateVariableByName("dataType");
          PVariable var_initial_attribute = body.getOrCreateVariableByName("initial_attribute");
          PVariable var_initial_dataType = body.getOrCreateVariableByName("initial_dataType");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_dataType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attribute, parameter_attribute),
             new ExportedParameter(body, var_dataType, parameter_dataType)
          ));
          // 	find initial_attribute (attribute, initial_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_initial_attribute), Initial_attribute.instance().getInternalQueryRepresentation());
          // 	find initial_datatype (dataType, initial_dataType)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_dataType, var_initial_dataType), Initial_datatype.instance().getInternalQueryRepresentation());
          // 	Attribute.type (initial_attribute, initial_dataType)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "Attribute")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "Attribute", "type")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "DataType")));
          new Equality(body, var__virtual_0_, var_initial_dataType);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
