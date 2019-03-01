/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.simplecore/src/se/mdh/idt/benji/examples/refactorings/simplecore/queries/NamedElementQueries.vql
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
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.internal.Current_namedElement_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.internal.Initial_namedElement_name;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // named element - name - set
 *         pattern set_namedElement_name (namedElement : Trace, name : java String) {
 *         	neg find initial_namedElement_name (namedElement, name);
 *         	find current_namedElement_name (namedElement, name);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class Set_namedElement_name extends BaseGeneratedEMFQuerySpecification<Set_namedElement_name.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.set_namedElement_name pattern,
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
    private Trace fNamedElement;
    
    private String fName;
    
    private static List<String> parameterNames = makeImmutableList("namedElement", "name");
    
    private Match(final Trace pNamedElement, final String pName) {
      this.fNamedElement = pNamedElement;
      this.fName = pName;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("namedElement".equals(parameterName)) return this.fNamedElement;
      if ("name".equals(parameterName)) return this.fName;
      return null;
    }
    
    public Trace getNamedElement() {
      return this.fNamedElement;
    }
    
    public String getName() {
      return this.fName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("namedElement".equals(parameterName) ) {
          this.fNamedElement = (Trace) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setNamedElement(final Trace pNamedElement) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fNamedElement = pNamedElement;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.set_namedElement_name";
    }
    
    @Override
    public List<String> parameterNames() {
      return Set_namedElement_name.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fNamedElement, fName};
    }
    
    @Override
    public Set_namedElement_name.Match toImmutable() {
      return isMutable() ? newMatch(fNamedElement, fName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"namedElement\"=" + prettyPrintValue(fNamedElement) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(fNamedElement, fName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Set_namedElement_name.Match)) {
          Set_namedElement_name.Match other = (Set_namedElement_name.Match) obj;
          return Objects.equals(fNamedElement, other.fNamedElement) && Objects.equals(fName, other.fName);
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
    public Set_namedElement_name specification() {
      return Set_namedElement_name.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Set_namedElement_name.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Set_namedElement_name.Match newMutableMatch(final Trace pNamedElement, final String pName) {
      return new Mutable(pNamedElement, pName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Set_namedElement_name.Match newMatch(final Trace pNamedElement, final String pName) {
      return new Immutable(pNamedElement, pName);
    }
    
    private static final class Mutable extends Set_namedElement_name.Match {
      Mutable(final Trace pNamedElement, final String pName) {
        super(pNamedElement, pName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Set_namedElement_name.Match {
      Immutable(final Trace pNamedElement, final String pName) {
        super(pNamedElement, pName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.simplecore.queries.set_namedElement_name pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // named element - name - set
   * pattern set_namedElement_name (namedElement : Trace, name : java String) {
   * 	neg find initial_namedElement_name (namedElement, name);
   * 	find current_namedElement_name (namedElement, name);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Set_namedElement_name
   * 
   */
  public static class Matcher extends BaseMatcher<Set_namedElement_name.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Set_namedElement_name.Matcher on(final ViatraQueryEngine engine) {
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
    public static Set_namedElement_name.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_NAMEDELEMENT = 0;
    
    private static final int POSITION_NAME = 1;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Set_namedElement_name.Matcher.class);
    
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
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Set_namedElement_name.Match> getAllMatches(final Trace pNamedElement, final String pName) {
      return rawStreamAllMatches(new Object[]{pNamedElement, pName}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Set_namedElement_name.Match> streamAllMatches(final Trace pNamedElement, final String pName) {
      return rawStreamAllMatches(new Object[]{pNamedElement, pName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Set_namedElement_name.Match> getOneArbitraryMatch(final Trace pNamedElement, final String pName) {
      return rawGetOneArbitraryMatch(new Object[]{pNamedElement, pName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pNamedElement, final String pName) {
      return rawHasMatch(new Object[]{pNamedElement, pName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pNamedElement, final String pName) {
      return rawCountMatches(new Object[]{pNamedElement, pName});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pNamedElement, final String pName, final Consumer<? super Set_namedElement_name.Match> processor) {
      rawForEachMatch(new Object[]{pNamedElement, pName}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pNamedElement, final String pName, final Consumer<? super Set_namedElement_name.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pNamedElement, pName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pNamedElement the fixed value of pattern parameter namedElement, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Set_namedElement_name.Match newMatch(final Trace pNamedElement, final String pName) {
      return Set_namedElement_name.Match.newMatch(pNamedElement, pName);
    }
    
    /**
     * Retrieve the set of values that occur in matches for namedElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOfnamedElement(final Object[] parameters) {
      return rawStreamAllValues(POSITION_NAMEDELEMENT, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for namedElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfnamedElement() {
      return rawStreamAllValuesOfnamedElement(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namedElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfnamedElement() {
      return rawStreamAllValuesOfnamedElement(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namedElement.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfnamedElement(final Set_namedElement_name.Match partialMatch) {
      return rawStreamAllValuesOfnamedElement(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namedElement.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOfnamedElement(final String pName) {
      return rawStreamAllValuesOfnamedElement(new Object[]{null, pName});
    }
    
    /**
     * Retrieve the set of values that occur in matches for namedElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfnamedElement(final Set_namedElement_name.Match partialMatch) {
      return rawStreamAllValuesOfnamedElement(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for namedElement.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfnamedElement(final String pName) {
      return rawStreamAllValuesOfnamedElement(new Object[]{null, pName}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<String> rawStreamAllValuesOfname(final Object[] parameters) {
      return rawStreamAllValues(POSITION_NAME, parameters).map(String.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname() {
      return rawStreamAllValuesOfname(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfname() {
      return rawStreamAllValuesOfname(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfname(final Set_namedElement_name.Match partialMatch) {
      return rawStreamAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<String> streamAllValuesOfname(final Trace pNamedElement) {
      return rawStreamAllValuesOfname(new Object[]{pNamedElement, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Set_namedElement_name.Match partialMatch) {
      return rawStreamAllValuesOfname(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Trace pNamedElement) {
      return rawStreamAllValuesOfname(new Object[]{pNamedElement, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected Set_namedElement_name.Match tupleToMatch(final Tuple t) {
      try {
          return Set_namedElement_name.Match.newMatch((Trace) t.get(POSITION_NAMEDELEMENT), (String) t.get(POSITION_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Set_namedElement_name.Match arrayToMatch(final Object[] match) {
      try {
          return Set_namedElement_name.Match.newMatch((Trace) match[POSITION_NAMEDELEMENT], (String) match[POSITION_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Set_namedElement_name.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Set_namedElement_name.Match.newMutableMatch((Trace) match[POSITION_NAMEDELEMENT], (String) match[POSITION_NAME]);
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
    public static IQuerySpecification<Set_namedElement_name.Matcher> querySpecification() {
      return Set_namedElement_name.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.simplecore.queries.set_namedElement_name pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Set_namedElement_name.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pNamedElement the value of pattern parameter namedElement in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * 
     */
    public abstract void accept(final Trace pNamedElement, final String pName);
    
    @Override
    public void accept(final Set_namedElement_name.Match match) {
      accept(match.getNamedElement(), match.getName());
    }
  }
  
  private Set_namedElement_name() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Set_namedElement_name instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Set_namedElement_name.Matcher instantiate(final ViatraQueryEngine engine) {
    return Set_namedElement_name.Matcher.on(engine);
  }
  
  @Override
  public Set_namedElement_name.Matcher instantiate() {
    return Set_namedElement_name.Matcher.create();
  }
  
  @Override
  public Set_namedElement_name.Match newEmptyMatch() {
    return Set_namedElement_name.Match.newEmptyMatch();
  }
  
  @Override
  public Set_namedElement_name.Match newMatch(final Object... parameters) {
    return Set_namedElement_name.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_namedElement_name (visibility: PUBLIC, simpleName: Set_namedElement_name, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_namedElement_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_namedElement_name (visibility: PUBLIC, simpleName: Set_namedElement_name, identifier: se.mdh.idt.benji.examples.refactorings.simplecore.queries.Set_namedElement_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.simplecore.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Set_namedElement_name INSTANCE = new Set_namedElement_name();
    
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
    private static final Set_namedElement_name.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_namedElement = new PParameter("namedElement", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_name = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_namedElement, parameter_name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.simplecore.queries.set_namedElement_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("namedElement","name");
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
          PVariable var_namedElement = body.getOrCreateVariableByName("namedElement");
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_namedElement), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_namedElement, parameter_namedElement),
             new ExportedParameter(body, var_name, parameter_name)
          ));
          // 	neg find initial_namedElement_name (namedElement, name)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_namedElement, var_name), Initial_namedElement_name.instance().getInternalQueryRepresentation());
          // 	find current_namedElement_name (namedElement, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_namedElement, var_name), Current_namedElement_name.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
