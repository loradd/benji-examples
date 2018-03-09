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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Enumeration_literal extends BaseGeneratedEMFQuerySpecification<Enumeration_literal.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumeration_literal pattern,
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
    private Enumeration fEnumeration;
    
    private EnumerationLiteral fLiteral;
    
    private static List<String> parameterNames = makeImmutableList("enumeration", "literal");
    
    private Match(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      this.fEnumeration = pEnumeration;
      this.fLiteral = pLiteral;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("enumeration".equals(parameterName)) return this.fEnumeration;
      if ("literal".equals(parameterName)) return this.fLiteral;
      return null;
    }
    
    public Enumeration getEnumeration() {
      return this.fEnumeration;
    }
    
    public EnumerationLiteral getLiteral() {
      return this.fLiteral;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("enumeration".equals(parameterName) ) {
          this.fEnumeration = (Enumeration) newValue;
          return true;
      }
      if ("literal".equals(parameterName) ) {
          this.fLiteral = (EnumerationLiteral) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnumeration(final Enumeration pEnumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumeration = pEnumeration;
    }
    
    public void setLiteral(final EnumerationLiteral pLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLiteral = pLiteral;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumeration_literal";
    }
    
    @Override
    public List<String> parameterNames() {
      return Enumeration_literal.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnumeration, fLiteral};
    }
    
    @Override
    public Enumeration_literal.Match toImmutable() {
      return isMutable() ? newMatch(fEnumeration, fLiteral) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"enumeration\"=" + prettyPrintValue(fEnumeration) + ", ");
      result.append("\"literal\"=" + prettyPrintValue(fLiteral));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fEnumeration, fLiteral);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Enumeration_literal.Match)) {
          Enumeration_literal.Match other = (Enumeration_literal.Match) obj;
          return Objects.equals(fEnumeration, other.fEnumeration) && Objects.equals(fLiteral, other.fLiteral);
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
    public Enumeration_literal specification() {
      return Enumeration_literal.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Enumeration_literal.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Enumeration_literal.Match newMutableMatch(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      return new Mutable(pEnumeration, pLiteral);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Enumeration_literal.Match newMatch(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      return new Immutable(pEnumeration, pLiteral);
    }
    
    private static final class Mutable extends Enumeration_literal.Match {
      Mutable(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
        super(pEnumeration, pLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Enumeration_literal.Match {
      Immutable(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
        super(pEnumeration, pLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumeration_literal pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration - literals
   * pattern enumeration_literal (enumeration : Enumeration, literal : EnumerationLiteral) {
   * 	Enumeration.literals (enumeration, literal); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Enumeration_literal
   * 
   */
  public static class Matcher extends BaseMatcher<Enumeration_literal.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Enumeration_literal.Matcher on(final ViatraQueryEngine engine) {
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
    public static Enumeration_literal.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ENUMERATION = 0;
    
    private final static int POSITION_LITERAL = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Enumeration_literal.Matcher.class);
    
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
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Enumeration_literal.Match> getAllMatches(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      return rawGetAllMatches(new Object[]{pEnumeration, pLiteral});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Enumeration_literal.Match getOneArbitraryMatch(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      return rawGetOneArbitraryMatch(new Object[]{pEnumeration, pLiteral});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      return rawHasMatch(new Object[]{pEnumeration, pLiteral});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      return rawCountMatches(new Object[]{pEnumeration, pLiteral});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Enumeration pEnumeration, final EnumerationLiteral pLiteral, final IMatchProcessor<? super Enumeration_literal.Match> processor) {
      rawForEachMatch(new Object[]{pEnumeration, pLiteral}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Enumeration pEnumeration, final EnumerationLiteral pLiteral, final IMatchProcessor<? super Enumeration_literal.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnumeration, pLiteral}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Enumeration_literal.Match newMatch(final Enumeration pEnumeration, final EnumerationLiteral pLiteral) {
      return Enumeration_literal.Match.newMatch(pEnumeration, pLiteral);
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Enumeration> rawAccumulateAllValuesOfenumeration(final Object[] parameters) {
      Set<Enumeration> results = new HashSet<Enumeration>();
      rawAccumulateAllValues(POSITION_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfenumeration() {
      return rawAccumulateAllValuesOfenumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfenumeration(final Enumeration_literal.Match partialMatch) {
      return rawAccumulateAllValuesOfenumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfenumeration(final EnumerationLiteral pLiteral) {
      return rawAccumulateAllValuesOfenumeration(new Object[]{
      null, 
      pLiteral
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EnumerationLiteral> rawAccumulateAllValuesOfliteral(final Object[] parameters) {
      Set<EnumerationLiteral> results = new HashSet<EnumerationLiteral>();
      rawAccumulateAllValues(POSITION_LITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfliteral() {
      return rawAccumulateAllValuesOfliteral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfliteral(final Enumeration_literal.Match partialMatch) {
      return rawAccumulateAllValuesOfliteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfliteral(final Enumeration pEnumeration) {
      return rawAccumulateAllValuesOfliteral(new Object[]{
      pEnumeration, 
      null
      });
    }
    
    @Override
    protected Enumeration_literal.Match tupleToMatch(final Tuple t) {
      try {
          return Enumeration_literal.Match.newMatch((Enumeration) t.get(POSITION_ENUMERATION), (EnumerationLiteral) t.get(POSITION_LITERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Enumeration_literal.Match arrayToMatch(final Object[] match) {
      try {
          return Enumeration_literal.Match.newMatch((Enumeration) match[POSITION_ENUMERATION], (EnumerationLiteral) match[POSITION_LITERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Enumeration_literal.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Enumeration_literal.Match.newMutableMatch((Enumeration) match[POSITION_ENUMERATION], (EnumerationLiteral) match[POSITION_LITERAL]);
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
    public static IQuerySpecification<Enumeration_literal.Matcher> querySpecification() {
      return Enumeration_literal.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumeration_literal pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Enumeration_literal.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEnumeration the value of pattern parameter enumeration in the currently processed match
     * @param pLiteral the value of pattern parameter literal in the currently processed match
     * 
     */
    public abstract void process(final Enumeration pEnumeration, final EnumerationLiteral pLiteral);
    
    @Override
    public void process(final Enumeration_literal.Match match) {
      process(match.getEnumeration(), match.getLiteral());
    }
  }
  
  private Enumeration_literal() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Enumeration_literal instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Enumeration_literal.Matcher instantiate(final ViatraQueryEngine engine) {
    return Enumeration_literal.Matcher.on(engine);
  }
  
  @Override
  public Enumeration_literal.Matcher instantiate() {
    return Enumeration_literal.Matcher.create();
  }
  
  @Override
  public Enumeration_literal.Match newEmptyMatch() {
    return Enumeration_literal.Match.newEmptyMatch();
  }
  
  @Override
  public Enumeration_literal.Match newMatch(final Object... parameters) {
    return Enumeration_literal.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_literal (visibility: PUBLIC, simpleName: Enumeration_literal, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_literal, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_literal (visibility: PUBLIC, simpleName: Enumeration_literal, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_literal, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Enumeration_literal INSTANCE = new Enumeration_literal();
    
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
    private final static Enumeration_literal.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEnumeration = new PParameter("enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pLiteral = new PParameter("literal", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEnumeration, parameter_pLiteral);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumeration_literal";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("enumeration","literal");
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
          PVariable var_enumeration = body.getOrCreateVariableByName("enumeration");
          PVariable var_literal = body.getOrCreateVariableByName("literal");
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_enumeration, parameter_pEnumeration),
             new ExportedParameter(body, var_literal, parameter_pLiteral)
          ));
          // 	Enumeration.literals (enumeration, literal)
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumeration, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration", "literals")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          new Equality(body, var__virtual_0_, var_literal);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
