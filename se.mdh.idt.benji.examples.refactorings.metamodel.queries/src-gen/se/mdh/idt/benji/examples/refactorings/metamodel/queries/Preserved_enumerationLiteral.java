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
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_modelElement;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Preserved_enumerationLiteral extends BaseGeneratedEMFQuerySpecification<Preserved_enumerationLiteral.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumerationLiteral pattern,
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
    private EnumerationLiteral fInitial_literal;
    
    private EnumerationLiteral fCurrent_literal;
    
    private static List<String> parameterNames = makeImmutableList("initial_literal", "current_literal");
    
    private Match(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      this.fInitial_literal = pInitial_literal;
      this.fCurrent_literal = pCurrent_literal;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_literal".equals(parameterName)) return this.fInitial_literal;
      if ("current_literal".equals(parameterName)) return this.fCurrent_literal;
      return null;
    }
    
    public EnumerationLiteral getInitial_literal() {
      return this.fInitial_literal;
    }
    
    public EnumerationLiteral getCurrent_literal() {
      return this.fCurrent_literal;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_literal".equals(parameterName) ) {
          this.fInitial_literal = (EnumerationLiteral) newValue;
          return true;
      }
      if ("current_literal".equals(parameterName) ) {
          this.fCurrent_literal = (EnumerationLiteral) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_literal(final EnumerationLiteral pInitial_literal) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_literal = pInitial_literal;
    }
    
    public void setCurrent_literal(final EnumerationLiteral pCurrent_literal) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_literal = pCurrent_literal;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumerationLiteral";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved_enumerationLiteral.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_literal, fCurrent_literal};
    }
    
    @Override
    public Preserved_enumerationLiteral.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_literal, fCurrent_literal) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_literal\"=" + prettyPrintValue(fInitial_literal) + ", ");
      result.append("\"current_literal\"=" + prettyPrintValue(fCurrent_literal));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_literal, fCurrent_literal);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved_enumerationLiteral.Match)) {
          Preserved_enumerationLiteral.Match other = (Preserved_enumerationLiteral.Match) obj;
          return Objects.equals(fInitial_literal, other.fInitial_literal) && Objects.equals(fCurrent_literal, other.fCurrent_literal);
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
    public Preserved_enumerationLiteral specification() {
      return Preserved_enumerationLiteral.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved_enumerationLiteral.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved_enumerationLiteral.Match newMutableMatch(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      return new Mutable(pInitial_literal, pCurrent_literal);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved_enumerationLiteral.Match newMatch(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      return new Immutable(pInitial_literal, pCurrent_literal);
    }
    
    private static final class Mutable extends Preserved_enumerationLiteral.Match {
      Mutable(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
        super(pInitial_literal, pCurrent_literal);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved_enumerationLiteral.Match {
      Immutable(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
        super(pInitial_literal, pCurrent_literal);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumerationLiteral pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration literal - preserved
   * pattern preserved_enumerationLiteral (initial_literal : EnumerationLiteral, current_literal : EnumerationLiteral) {
   * 	find preserved_modelElement (initial_literal, current_literal); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Preserved_enumerationLiteral
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved_enumerationLiteral.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved_enumerationLiteral.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved_enumerationLiteral.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_LITERAL = 0;
    
    private final static int POSITION_CURRENT_LITERAL = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved_enumerationLiteral.Matcher.class);
    
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
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved_enumerationLiteral.Match> getAllMatches(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      return rawGetAllMatches(new Object[]{pInitial_literal, pCurrent_literal});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved_enumerationLiteral.Match getOneArbitraryMatch(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_literal, pCurrent_literal});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      return rawHasMatch(new Object[]{pInitial_literal, pCurrent_literal});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      return rawCountMatches(new Object[]{pInitial_literal, pCurrent_literal});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal, final IMatchProcessor<? super Preserved_enumerationLiteral.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_literal, pCurrent_literal}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal, final IMatchProcessor<? super Preserved_enumerationLiteral.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_literal, pCurrent_literal}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param pCurrent_literal the fixed value of pattern parameter current_literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved_enumerationLiteral.Match newMatch(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal) {
      return Preserved_enumerationLiteral.Match.newMatch(pInitial_literal, pCurrent_literal);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EnumerationLiteral> rawAccumulateAllValuesOfinitial_literal(final Object[] parameters) {
      Set<EnumerationLiteral> results = new HashSet<EnumerationLiteral>();
      rawAccumulateAllValues(POSITION_INITIAL_LITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_literal() {
      return rawAccumulateAllValuesOfinitial_literal(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_literal(final Preserved_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_literal(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_literal(final EnumerationLiteral pCurrent_literal) {
      return rawAccumulateAllValuesOfinitial_literal(new Object[]{
      null, 
      pCurrent_literal
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EnumerationLiteral> rawAccumulateAllValuesOfcurrent_literal(final Object[] parameters) {
      Set<EnumerationLiteral> results = new HashSet<EnumerationLiteral>();
      rawAccumulateAllValues(POSITION_CURRENT_LITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfcurrent_literal() {
      return rawAccumulateAllValuesOfcurrent_literal(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfcurrent_literal(final Preserved_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_literal(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfcurrent_literal(final EnumerationLiteral pInitial_literal) {
      return rawAccumulateAllValuesOfcurrent_literal(new Object[]{
      pInitial_literal, 
      null
      });
    }
    
    @Override
    protected Preserved_enumerationLiteral.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved_enumerationLiteral.Match.newMatch((EnumerationLiteral) t.get(POSITION_INITIAL_LITERAL), (EnumerationLiteral) t.get(POSITION_CURRENT_LITERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_enumerationLiteral.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved_enumerationLiteral.Match.newMatch((EnumerationLiteral) match[POSITION_INITIAL_LITERAL], (EnumerationLiteral) match[POSITION_CURRENT_LITERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_enumerationLiteral.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved_enumerationLiteral.Match.newMutableMatch((EnumerationLiteral) match[POSITION_INITIAL_LITERAL], (EnumerationLiteral) match[POSITION_CURRENT_LITERAL]);
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
    public static IQuerySpecification<Preserved_enumerationLiteral.Matcher> querySpecification() {
      return Preserved_enumerationLiteral.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumerationLiteral pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Preserved_enumerationLiteral.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_literal the value of pattern parameter initial_literal in the currently processed match
     * @param pCurrent_literal the value of pattern parameter current_literal in the currently processed match
     * 
     */
    public abstract void process(final EnumerationLiteral pInitial_literal, final EnumerationLiteral pCurrent_literal);
    
    @Override
    public void process(final Preserved_enumerationLiteral.Match match) {
      process(match.getInitial_literal(), match.getCurrent_literal());
    }
  }
  
  private Preserved_enumerationLiteral() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved_enumerationLiteral instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved_enumerationLiteral.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved_enumerationLiteral.Matcher.on(engine);
  }
  
  @Override
  public Preserved_enumerationLiteral.Matcher instantiate() {
    return Preserved_enumerationLiteral.Matcher.create();
  }
  
  @Override
  public Preserved_enumerationLiteral.Match newEmptyMatch() {
    return Preserved_enumerationLiteral.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved_enumerationLiteral.Match newMatch(final Object... parameters) {
    return Preserved_enumerationLiteral.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral (visibility: PUBLIC, simpleName: Preserved_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral (visibility: PUBLIC, simpleName: Preserved_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved_enumerationLiteral INSTANCE = new Preserved_enumerationLiteral();
    
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
    private final static Preserved_enumerationLiteral.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_literal = new PParameter("initial_literal", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_literal = new PParameter("current_literal", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_literal, parameter_pCurrent_literal);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_enumerationLiteral";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_literal","current_literal");
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
          PVariable var_initial_literal = body.getOrCreateVariableByName("initial_literal");
          PVariable var_current_literal = body.getOrCreateVariableByName("current_literal");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_literal, parameter_pInitial_literal),
             new ExportedParameter(body, var_current_literal, parameter_pCurrent_literal)
          ));
          // 	find preserved_modelElement (initial_literal, current_literal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_literal, var_current_literal), Preserved_modelElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
