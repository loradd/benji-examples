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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_modelElement;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Deleted_enumerationLiteral extends BaseGeneratedEMFQuerySpecification<Deleted_enumerationLiteral.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_enumerationLiteral pattern,
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
    
    private static List<String> parameterNames = makeImmutableList("initial_literal");
    
    private Match(final EnumerationLiteral pInitial_literal) {
      this.fInitial_literal = pInitial_literal;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_literal".equals(parameterName)) return this.fInitial_literal;
      return null;
    }
    
    public EnumerationLiteral getInitial_literal() {
      return this.fInitial_literal;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_literal".equals(parameterName) ) {
          this.fInitial_literal = (EnumerationLiteral) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_literal(final EnumerationLiteral pInitial_literal) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_literal = pInitial_literal;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_enumerationLiteral";
    }
    
    @Override
    public List<String> parameterNames() {
      return Deleted_enumerationLiteral.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_literal};
    }
    
    @Override
    public Deleted_enumerationLiteral.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_literal) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_literal\"=" + prettyPrintValue(fInitial_literal));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_literal);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Deleted_enumerationLiteral.Match)) {
          Deleted_enumerationLiteral.Match other = (Deleted_enumerationLiteral.Match) obj;
          return Objects.equals(fInitial_literal, other.fInitial_literal);
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
    public Deleted_enumerationLiteral specification() {
      return Deleted_enumerationLiteral.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Deleted_enumerationLiteral.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Deleted_enumerationLiteral.Match newMutableMatch(final EnumerationLiteral pInitial_literal) {
      return new Mutable(pInitial_literal);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Deleted_enumerationLiteral.Match newMatch(final EnumerationLiteral pInitial_literal) {
      return new Immutable(pInitial_literal);
    }
    
    private static final class Mutable extends Deleted_enumerationLiteral.Match {
      Mutable(final EnumerationLiteral pInitial_literal) {
        super(pInitial_literal);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Deleted_enumerationLiteral.Match {
      Immutable(final EnumerationLiteral pInitial_literal) {
        super(pInitial_literal);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_enumerationLiteral pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration literal - deleted
   * pattern deleted_enumerationLiteral (initial_literal : EnumerationLiteral) {
   * 	find deleted_modelElement (initial_literal); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Deleted_enumerationLiteral
   * 
   */
  public static class Matcher extends BaseMatcher<Deleted_enumerationLiteral.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Deleted_enumerationLiteral.Matcher on(final ViatraQueryEngine engine) {
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
    public static Deleted_enumerationLiteral.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_LITERAL = 0;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Deleted_enumerationLiteral.Matcher.class);
    
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
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Deleted_enumerationLiteral.Match> getAllMatches(final EnumerationLiteral pInitial_literal) {
      return rawGetAllMatches(new Object[]{pInitial_literal});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Deleted_enumerationLiteral.Match getOneArbitraryMatch(final EnumerationLiteral pInitial_literal) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_literal});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EnumerationLiteral pInitial_literal) {
      return rawHasMatch(new Object[]{pInitial_literal});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EnumerationLiteral pInitial_literal) {
      return rawCountMatches(new Object[]{pInitial_literal});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final EnumerationLiteral pInitial_literal, final IMatchProcessor<? super Deleted_enumerationLiteral.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_literal}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EnumerationLiteral pInitial_literal, final IMatchProcessor<? super Deleted_enumerationLiteral.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_literal}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Deleted_enumerationLiteral.Match newMatch(final EnumerationLiteral pInitial_literal) {
      return Deleted_enumerationLiteral.Match.newMatch(pInitial_literal);
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
    
    @Override
    protected Deleted_enumerationLiteral.Match tupleToMatch(final Tuple t) {
      try {
          return Deleted_enumerationLiteral.Match.newMatch((EnumerationLiteral) t.get(POSITION_INITIAL_LITERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted_enumerationLiteral.Match arrayToMatch(final Object[] match) {
      try {
          return Deleted_enumerationLiteral.Match.newMatch((EnumerationLiteral) match[POSITION_INITIAL_LITERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Deleted_enumerationLiteral.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Deleted_enumerationLiteral.Match.newMutableMatch((EnumerationLiteral) match[POSITION_INITIAL_LITERAL]);
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
    public static IQuerySpecification<Deleted_enumerationLiteral.Matcher> querySpecification() {
      return Deleted_enumerationLiteral.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_enumerationLiteral pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Deleted_enumerationLiteral.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_literal the value of pattern parameter initial_literal in the currently processed match
     * 
     */
    public abstract void process(final EnumerationLiteral pInitial_literal);
    
    @Override
    public void process(final Deleted_enumerationLiteral.Match match) {
      process(match.getInitial_literal());
    }
  }
  
  private Deleted_enumerationLiteral() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Deleted_enumerationLiteral instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Deleted_enumerationLiteral.Matcher instantiate(final ViatraQueryEngine engine) {
    return Deleted_enumerationLiteral.Matcher.on(engine);
  }
  
  @Override
  public Deleted_enumerationLiteral.Matcher instantiate() {
    return Deleted_enumerationLiteral.Matcher.create();
  }
  
  @Override
  public Deleted_enumerationLiteral.Match newEmptyMatch() {
    return Deleted_enumerationLiteral.Match.newEmptyMatch();
  }
  
  @Override
  public Deleted_enumerationLiteral.Match newMatch(final Object... parameters) {
    return Deleted_enumerationLiteral.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_enumerationLiteral (visibility: PUBLIC, simpleName: Deleted_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_enumerationLiteral (visibility: PUBLIC, simpleName: Deleted_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Deleted_enumerationLiteral INSTANCE = new Deleted_enumerationLiteral();
    
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
    private final static Deleted_enumerationLiteral.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_literal = new PParameter("initial_literal", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_literal);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.deleted_enumerationLiteral";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_literal");
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
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_literal, parameter_pInitial_literal)
          ));
          // 	find deleted_modelElement (initial_literal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_literal), Deleted_modelElement.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
