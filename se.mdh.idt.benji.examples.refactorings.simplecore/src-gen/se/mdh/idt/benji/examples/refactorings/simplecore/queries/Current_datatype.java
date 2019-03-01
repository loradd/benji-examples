/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/DataTypeQueries.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.simplecore.DataType;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // datatype - current
 *         pattern current_datatype (datatype : Trace, current_datatype : DataType) {
 *         	Trace.current (datatype, current_datatype);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Current_datatype extends BaseGeneratedEMFQuerySpecification<Current_datatype.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_datatype pattern,
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
    private Trace fDatatype;
    
    private DataType fCurrent_datatype;
    
    private static List<String> parameterNames = makeImmutableList("datatype", "current_datatype");
    
    private Match(final Trace pDatatype, final DataType pCurrent_datatype) {
      this.fDatatype = pDatatype;
      this.fCurrent_datatype = pCurrent_datatype;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("datatype".equals(parameterName)) return this.fDatatype;
      if ("current_datatype".equals(parameterName)) return this.fCurrent_datatype;
      return null;
    }
    
    public Trace getDatatype() {
      return this.fDatatype;
    }
    
    public DataType getCurrent_datatype() {
      return this.fCurrent_datatype;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("datatype".equals(parameterName) ) {
          this.fDatatype = (Trace) newValue;
          return true;
      }
      if ("current_datatype".equals(parameterName) ) {
          this.fCurrent_datatype = (DataType) newValue;
          return true;
      }
      return false;
    }
    
    public void setDatatype(final Trace pDatatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDatatype = pDatatype;
    }
    
    public void setCurrent_datatype(final DataType pCurrent_datatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_datatype = pCurrent_datatype;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_datatype";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_datatype.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDatatype, fCurrent_datatype};
    }
    
    @Override
    public Current_datatype.Match toImmutable() {
      return isMutable() ? newMatch(fDatatype, fCurrent_datatype) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"datatype\"=" + prettyPrintValue(fDatatype) + ", ");
      result.append("\"current_datatype\"=" + prettyPrintValue(fCurrent_datatype));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fDatatype, fCurrent_datatype);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_datatype.Match)) {
          Current_datatype.Match other = (Current_datatype.Match) obj;
          return Objects.equals(fDatatype, other.fDatatype) && Objects.equals(fCurrent_datatype, other.fCurrent_datatype);
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
    public Current_datatype specification() {
      return Current_datatype.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_datatype.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_datatype.Match newMutableMatch(final Trace pDatatype, final DataType pCurrent_datatype) {
      return new Mutable(pDatatype, pCurrent_datatype);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_datatype.Match newMatch(final Trace pDatatype, final DataType pCurrent_datatype) {
      return new Immutable(pDatatype, pCurrent_datatype);
    }
    
    private static final class Mutable extends Current_datatype.Match {
      Mutable(final Trace pDatatype, final DataType pCurrent_datatype) {
        super(pDatatype, pCurrent_datatype);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_datatype.Match {
      Immutable(final Trace pDatatype, final DataType pCurrent_datatype) {
        super(pDatatype, pCurrent_datatype);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_datatype pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // datatype - current
   * pattern current_datatype (datatype : Trace, current_datatype : DataType) {
   * 	Trace.current (datatype, current_datatype);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_datatype
   * 
   */
  public static class Matcher extends BaseMatcher<Current_datatype.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_datatype.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_datatype.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_DATATYPE = 0;
    
    private static final int POSITION_CURRENT_DATATYPE = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_datatype.Matcher.class);
    
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
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_datatype.Match> getAllMatches(final Trace pDatatype, final DataType pCurrent_datatype) {
      return rawStreamAllMatches(new Object[]{pDatatype, pCurrent_datatype}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Current_datatype.Match> streamAllMatches(final Trace pDatatype, final DataType pCurrent_datatype) {
      return rawStreamAllMatches(new Object[]{pDatatype, pCurrent_datatype});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Current_datatype.Match> getOneArbitraryMatch(final Trace pDatatype, final DataType pCurrent_datatype) {
      return rawGetOneArbitraryMatch(new Object[]{pDatatype, pCurrent_datatype});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pDatatype, final DataType pCurrent_datatype) {
      return rawHasMatch(new Object[]{pDatatype, pCurrent_datatype});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pDatatype, final DataType pCurrent_datatype) {
      return rawCountMatches(new Object[]{pDatatype, pCurrent_datatype});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pDatatype, final DataType pCurrent_datatype, final Consumer<? super Current_datatype.Match> processor) {
      rawForEachMatch(new Object[]{pDatatype, pCurrent_datatype}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pDatatype, final DataType pCurrent_datatype, final Consumer<? super Current_datatype.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDatatype, pCurrent_datatype}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_datatype.Match newMatch(final Trace pDatatype, final DataType pCurrent_datatype) {
      return Current_datatype.Match.newMatch(pDatatype, pCurrent_datatype);
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfdatatype(final Object[] parameters) {
      return rawStreamAllValues(POSITION_DATATYPE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfdatatype() {
      return rawStreamAllValuesOfdatatype(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfdatatype() {
      return rawStreamAllValuesOfdatatype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfdatatype(final Current_datatype.Match partialMatch) {
      return rawStreamAllValuesOfdatatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfdatatype(final DataType pCurrent_datatype) {
      return rawStreamAllValuesOfdatatype(new Object[]{null, pCurrent_datatype});
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfdatatype(final Current_datatype.Match partialMatch) {
      return rawStreamAllValuesOfdatatype(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfdatatype(final DataType pCurrent_datatype) {
      return rawStreamAllValuesOfdatatype(new Object[]{null, pCurrent_datatype}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<DataType> rawStreamAllValuesOfcurrent_datatype(final Object[] parameters) {
      return rawStreamAllValues(POSITION_CURRENT_DATATYPE, parameters).map(DataType.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_datatype() {
      return rawStreamAllValuesOfcurrent_datatype(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<DataType> streamAllValuesOfcurrent_datatype() {
      return rawStreamAllValuesOfcurrent_datatype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DataType> streamAllValuesOfcurrent_datatype(final Current_datatype.Match partialMatch) {
      return rawStreamAllValuesOfcurrent_datatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<DataType> streamAllValuesOfcurrent_datatype(final Trace pDatatype) {
      return rawStreamAllValuesOfcurrent_datatype(new Object[]{pDatatype, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_datatype(final Current_datatype.Match partialMatch) {
      return rawStreamAllValuesOfcurrent_datatype(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_datatype(final Trace pDatatype) {
      return rawStreamAllValuesOfcurrent_datatype(new Object[]{pDatatype, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Current_datatype.Match tupleToMatch(final Tuple t) {
      try {
          return Current_datatype.Match.newMatch((Trace) t.get(POSITION_DATATYPE), (DataType) t.get(POSITION_CURRENT_DATATYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_datatype.Match arrayToMatch(final Object[] match) {
      try {
          return Current_datatype.Match.newMatch((Trace) match[POSITION_DATATYPE], (DataType) match[POSITION_CURRENT_DATATYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_datatype.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_datatype.Match.newMutableMatch((Trace) match[POSITION_DATATYPE], (DataType) match[POSITION_CURRENT_DATATYPE]);
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
    public static IQuerySpecification<Current_datatype.Matcher> querySpecification() {
      return Current_datatype.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_datatype pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Current_datatype.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pDatatype the value of pattern parameter datatype in the currently processed match
     * @param pCurrent_datatype the value of pattern parameter current_datatype in the currently processed match
     * 
     */
    public abstract void accept(final Trace pDatatype, final DataType pCurrent_datatype);
    
    @Override
    public void accept(final Current_datatype.Match match) {
      accept(match.getDatatype(), match.getCurrent_datatype());
    }
  }
  
  private Current_datatype() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_datatype instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_datatype.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_datatype.Matcher.on(engine);
  }
  
  @Override
  public Current_datatype.Matcher instantiate() {
    return Current_datatype.Matcher.create();
  }
  
  @Override
  public Current_datatype.Match newEmptyMatch() {
    return Current_datatype.Match.newEmptyMatch();
  }
  
  @Override
  public Current_datatype.Match newMatch(final Object... parameters) {
    return Current_datatype.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.examples.refactorings.simplecore.DataType) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_datatype (visibility: PUBLIC, simpleName: Current_datatype, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_datatype, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_datatype (visibility: PUBLIC, simpleName: Current_datatype, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Current_datatype, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Current_datatype INSTANCE = new Current_datatype();
    
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
    private static final Current_datatype.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_datatype = new PParameter("datatype", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_current_datatype = new PParameter("current_datatype", "se.mdh.idt.benji.examples.refactorings.simplecore.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "DataType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_datatype, parameter_current_datatype);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.current_datatype";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("datatype","current_datatype");
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
          PVariable var_datatype = body.getOrCreateVariableByName("datatype");
          PVariable var_current_datatype = body.getOrCreateVariableByName("current_datatype");
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/examples/refactorings/SimpleCore", "DataType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_datatype, parameter_datatype),
             new ExportedParameter(body, var_current_datatype, parameter_current_datatype)
          ));
          // 	Trace.current (datatype, current_datatype)
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace", "current")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.eclipse.org/emf/2002/Ecore", "EObject")));
          new Equality(body, var__virtual_0_, var_current_datatype);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
