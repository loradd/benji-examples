/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Enumeration.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_dataType;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Preserved_enumeration extends BaseGeneratedEMFQuerySpecification<Preserved_enumeration.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumeration pattern,
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
    private Enumeration fInitial_enumeration;
    
    private Enumeration fCurrent_enumeration;
    
    private static List<String> parameterNames = makeImmutableList("initial_enumeration", "current_enumeration");
    
    private Match(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      this.fInitial_enumeration = pInitial_enumeration;
      this.fCurrent_enumeration = pCurrent_enumeration;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_enumeration".equals(parameterName)) return this.fInitial_enumeration;
      if ("current_enumeration".equals(parameterName)) return this.fCurrent_enumeration;
      return null;
    }
    
    public Enumeration getInitial_enumeration() {
      return this.fInitial_enumeration;
    }
    
    public Enumeration getCurrent_enumeration() {
      return this.fCurrent_enumeration;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_enumeration".equals(parameterName) ) {
          this.fInitial_enumeration = (Enumeration) newValue;
          return true;
      }
      if ("current_enumeration".equals(parameterName) ) {
          this.fCurrent_enumeration = (Enumeration) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_enumeration(final Enumeration pInitial_enumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_enumeration = pInitial_enumeration;
    }
    
    public void setCurrent_enumeration(final Enumeration pCurrent_enumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_enumeration = pCurrent_enumeration;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumeration";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved_enumeration.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_enumeration, fCurrent_enumeration};
    }
    
    @Override
    public Preserved_enumeration.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_enumeration, fCurrent_enumeration) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_enumeration\"=" + prettyPrintValue(fInitial_enumeration) + ", ");
      result.append("\"current_enumeration\"=" + prettyPrintValue(fCurrent_enumeration));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_enumeration, fCurrent_enumeration);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved_enumeration.Match)) {
          Preserved_enumeration.Match other = (Preserved_enumeration.Match) obj;
          return Objects.equals(fInitial_enumeration, other.fInitial_enumeration) && Objects.equals(fCurrent_enumeration, other.fCurrent_enumeration);
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
    public Preserved_enumeration specification() {
      return Preserved_enumeration.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved_enumeration.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved_enumeration.Match newMutableMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return new Mutable(pInitial_enumeration, pCurrent_enumeration);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved_enumeration.Match newMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return new Immutable(pInitial_enumeration, pCurrent_enumeration);
    }
    
    private static final class Mutable extends Preserved_enumeration.Match {
      Mutable(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
        super(pInitial_enumeration, pCurrent_enumeration);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved_enumeration.Match {
      Immutable(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
        super(pInitial_enumeration, pCurrent_enumeration);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumeration pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration - preserved
   * pattern preserved_enumeration (initial_enumeration : Enumeration, current_enumeration : Enumeration) {
   * 	find preserved_dataType (initial_enumeration, current_enumeration); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Preserved_enumeration
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved_enumeration.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved_enumeration.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved_enumeration.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_ENUMERATION = 0;
    
    private final static int POSITION_CURRENT_ENUMERATION = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved_enumeration.Matcher.class);
    
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
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved_enumeration.Match> getAllMatches(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return rawGetAllMatches(new Object[]{pInitial_enumeration, pCurrent_enumeration});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved_enumeration.Match getOneArbitraryMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return rawHasMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return rawCountMatches(new Object[]{pInitial_enumeration, pCurrent_enumeration});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final IMatchProcessor<? super Preserved_enumeration.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final IMatchProcessor<? super Preserved_enumeration.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved_enumeration.Match newMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return Preserved_enumeration.Match.newMatch(pInitial_enumeration, pCurrent_enumeration);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Enumeration> rawAccumulateAllValuesOfinitial_enumeration(final Object[] parameters) {
      Set<Enumeration> results = new HashSet<Enumeration>();
      rawAccumulateAllValues(POSITION_INITIAL_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfinitial_enumeration() {
      return rawAccumulateAllValuesOfinitial_enumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfinitial_enumeration(final Preserved_enumeration.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_enumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfinitial_enumeration(final Enumeration pCurrent_enumeration) {
      return rawAccumulateAllValuesOfinitial_enumeration(new Object[]{
      null, 
      pCurrent_enumeration
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Enumeration> rawAccumulateAllValuesOfcurrent_enumeration(final Object[] parameters) {
      Set<Enumeration> results = new HashSet<Enumeration>();
      rawAccumulateAllValues(POSITION_CURRENT_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration() {
      return rawAccumulateAllValuesOfcurrent_enumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final Preserved_enumeration.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_enumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final Enumeration pInitial_enumeration) {
      return rawAccumulateAllValuesOfcurrent_enumeration(new Object[]{
      pInitial_enumeration, 
      null
      });
    }
    
    @Override
    protected Preserved_enumeration.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved_enumeration.Match.newMatch((Enumeration) t.get(POSITION_INITIAL_ENUMERATION), (Enumeration) t.get(POSITION_CURRENT_ENUMERATION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_enumeration.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved_enumeration.Match.newMatch((Enumeration) match[POSITION_INITIAL_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_enumeration.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved_enumeration.Match.newMutableMatch((Enumeration) match[POSITION_INITIAL_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION]);
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
    public static IQuerySpecification<Preserved_enumeration.Matcher> querySpecification() {
      return Preserved_enumeration.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumeration pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Preserved_enumeration.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_enumeration the value of pattern parameter initial_enumeration in the currently processed match
     * @param pCurrent_enumeration the value of pattern parameter current_enumeration in the currently processed match
     * 
     */
    public abstract void process(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration);
    
    @Override
    public void process(final Preserved_enumeration.Match match) {
      process(match.getInitial_enumeration(), match.getCurrent_enumeration());
    }
  }
  
  private Preserved_enumeration() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved_enumeration instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved_enumeration.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved_enumeration.Matcher.on(engine);
  }
  
  @Override
  public Preserved_enumeration.Matcher instantiate() {
    return Preserved_enumeration.Matcher.create();
  }
  
  @Override
  public Preserved_enumeration.Match newEmptyMatch() {
    return Preserved_enumeration.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved_enumeration.Match newMatch(final Object... parameters) {
    return Preserved_enumeration.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration (visibility: PUBLIC, simpleName: Preserved_enumeration, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration (visibility: PUBLIC, simpleName: Preserved_enumeration, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved_enumeration INSTANCE = new Preserved_enumeration();
    
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
    private final static Preserved_enumeration.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_enumeration = new PParameter("initial_enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_enumeration = new PParameter("current_enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_enumeration, parameter_pCurrent_enumeration);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumeration";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_enumeration","current_enumeration");
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
          PVariable var_initial_enumeration = body.getOrCreateVariableByName("initial_enumeration");
          PVariable var_current_enumeration = body.getOrCreateVariableByName("current_enumeration");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_enumeration, parameter_pInitial_enumeration),
             new ExportedParameter(body, var_current_enumeration, parameter_pCurrent_enumeration)
          ));
          // 	find preserved_dataType (initial_enumeration, current_enumeration)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_enumeration, var_current_enumeration), Preserved_dataType.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
