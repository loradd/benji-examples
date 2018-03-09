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
public final class EnumerationLiteral_enumeration extends BaseGeneratedEMFQuerySpecification<EnumerationLiteral_enumeration.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_enumeration pattern,
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
    private EnumerationLiteral fLiteral;
    
    private Enumeration fEnumeration;
    
    private static List<String> parameterNames = makeImmutableList("literal", "enumeration");
    
    private Match(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      this.fLiteral = pLiteral;
      this.fEnumeration = pEnumeration;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("literal".equals(parameterName)) return this.fLiteral;
      if ("enumeration".equals(parameterName)) return this.fEnumeration;
      return null;
    }
    
    public EnumerationLiteral getLiteral() {
      return this.fLiteral;
    }
    
    public Enumeration getEnumeration() {
      return this.fEnumeration;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("literal".equals(parameterName) ) {
          this.fLiteral = (EnumerationLiteral) newValue;
          return true;
      }
      if ("enumeration".equals(parameterName) ) {
          this.fEnumeration = (Enumeration) newValue;
          return true;
      }
      return false;
    }
    
    public void setLiteral(final EnumerationLiteral pLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLiteral = pLiteral;
    }
    
    public void setEnumeration(final Enumeration pEnumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumeration = pEnumeration;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_enumeration";
    }
    
    @Override
    public List<String> parameterNames() {
      return EnumerationLiteral_enumeration.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fLiteral, fEnumeration};
    }
    
    @Override
    public EnumerationLiteral_enumeration.Match toImmutable() {
      return isMutable() ? newMatch(fLiteral, fEnumeration) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"literal\"=" + prettyPrintValue(fLiteral) + ", ");
      result.append("\"enumeration\"=" + prettyPrintValue(fEnumeration));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fLiteral, fEnumeration);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EnumerationLiteral_enumeration.Match)) {
          EnumerationLiteral_enumeration.Match other = (EnumerationLiteral_enumeration.Match) obj;
          return Objects.equals(fLiteral, other.fLiteral) && Objects.equals(fEnumeration, other.fEnumeration);
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
    public EnumerationLiteral_enumeration specification() {
      return EnumerationLiteral_enumeration.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EnumerationLiteral_enumeration.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EnumerationLiteral_enumeration.Match newMutableMatch(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      return new Mutable(pLiteral, pEnumeration);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EnumerationLiteral_enumeration.Match newMatch(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      return new Immutable(pLiteral, pEnumeration);
    }
    
    private static final class Mutable extends EnumerationLiteral_enumeration.Match {
      Mutable(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
        super(pLiteral, pEnumeration);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EnumerationLiteral_enumeration.Match {
      Immutable(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
        super(pLiteral, pEnumeration);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_enumeration pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration literal - enumeration
   * pattern enumerationLiteral_enumeration (literal : EnumerationLiteral, enumeration : Enumeration) {
   * 	EnumerationLiteral.enumeration (literal, enumeration); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see EnumerationLiteral_enumeration
   * 
   */
  public static class Matcher extends BaseMatcher<EnumerationLiteral_enumeration.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EnumerationLiteral_enumeration.Matcher on(final ViatraQueryEngine engine) {
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
    public static EnumerationLiteral_enumeration.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_LITERAL = 0;
    
    private final static int POSITION_ENUMERATION = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EnumerationLiteral_enumeration.Matcher.class);
    
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
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EnumerationLiteral_enumeration.Match> getAllMatches(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      return rawGetAllMatches(new Object[]{pLiteral, pEnumeration});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public EnumerationLiteral_enumeration.Match getOneArbitraryMatch(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      return rawGetOneArbitraryMatch(new Object[]{pLiteral, pEnumeration});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      return rawHasMatch(new Object[]{pLiteral, pEnumeration});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      return rawCountMatches(new Object[]{pLiteral, pEnumeration});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final EnumerationLiteral pLiteral, final Enumeration pEnumeration, final IMatchProcessor<? super EnumerationLiteral_enumeration.Match> processor) {
      rawForEachMatch(new Object[]{pLiteral, pEnumeration}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EnumerationLiteral pLiteral, final Enumeration pEnumeration, final IMatchProcessor<? super EnumerationLiteral_enumeration.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pLiteral, pEnumeration}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EnumerationLiteral_enumeration.Match newMatch(final EnumerationLiteral pLiteral, final Enumeration pEnumeration) {
      return EnumerationLiteral_enumeration.Match.newMatch(pLiteral, pEnumeration);
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
    public Set<EnumerationLiteral> getAllValuesOfliteral(final EnumerationLiteral_enumeration.Match partialMatch) {
      return rawAccumulateAllValuesOfliteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfliteral(final Enumeration pEnumeration) {
      return rawAccumulateAllValuesOfliteral(new Object[]{
      null, 
      pEnumeration
      });
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
    public Set<Enumeration> getAllValuesOfenumeration(final EnumerationLiteral_enumeration.Match partialMatch) {
      return rawAccumulateAllValuesOfenumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfenumeration(final EnumerationLiteral pLiteral) {
      return rawAccumulateAllValuesOfenumeration(new Object[]{
      pLiteral, 
      null
      });
    }
    
    @Override
    protected EnumerationLiteral_enumeration.Match tupleToMatch(final Tuple t) {
      try {
          return EnumerationLiteral_enumeration.Match.newMatch((EnumerationLiteral) t.get(POSITION_LITERAL), (Enumeration) t.get(POSITION_ENUMERATION));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EnumerationLiteral_enumeration.Match arrayToMatch(final Object[] match) {
      try {
          return EnumerationLiteral_enumeration.Match.newMatch((EnumerationLiteral) match[POSITION_LITERAL], (Enumeration) match[POSITION_ENUMERATION]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EnumerationLiteral_enumeration.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EnumerationLiteral_enumeration.Match.newMutableMatch((EnumerationLiteral) match[POSITION_LITERAL], (Enumeration) match[POSITION_ENUMERATION]);
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
    public static IQuerySpecification<EnumerationLiteral_enumeration.Matcher> querySpecification() {
      return EnumerationLiteral_enumeration.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_enumeration pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<EnumerationLiteral_enumeration.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pLiteral the value of pattern parameter literal in the currently processed match
     * @param pEnumeration the value of pattern parameter enumeration in the currently processed match
     * 
     */
    public abstract void process(final EnumerationLiteral pLiteral, final Enumeration pEnumeration);
    
    @Override
    public void process(final EnumerationLiteral_enumeration.Match match) {
      process(match.getLiteral(), match.getEnumeration());
    }
  }
  
  private EnumerationLiteral_enumeration() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EnumerationLiteral_enumeration instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EnumerationLiteral_enumeration.Matcher instantiate(final ViatraQueryEngine engine) {
    return EnumerationLiteral_enumeration.Matcher.on(engine);
  }
  
  @Override
  public EnumerationLiteral_enumeration.Matcher instantiate() {
    return EnumerationLiteral_enumeration.Matcher.create();
  }
  
  @Override
  public EnumerationLiteral_enumeration.Match newEmptyMatch() {
    return EnumerationLiteral_enumeration.Match.newEmptyMatch();
  }
  
  @Override
  public EnumerationLiteral_enumeration.Match newMatch(final Object... parameters) {
    return EnumerationLiteral_enumeration.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_enumeration (visibility: PUBLIC, simpleName: EnumerationLiteral_enumeration, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_enumeration, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_enumeration (visibility: PUBLIC, simpleName: EnumerationLiteral_enumeration, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_enumeration, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EnumerationLiteral_enumeration INSTANCE = new EnumerationLiteral_enumeration();
    
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
    private final static EnumerationLiteral_enumeration.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pLiteral = new PParameter("literal", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEnumeration = new PParameter("enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pLiteral, parameter_pEnumeration);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_enumeration";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("literal","enumeration");
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
          PVariable var_literal = body.getOrCreateVariableByName("literal");
          PVariable var_enumeration = body.getOrCreateVariableByName("enumeration");
          new TypeConstraint(body, Tuples.flatTupleOf(var_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_literal, parameter_pLiteral),
             new ExportedParameter(body, var_enumeration, parameter_pEnumeration)
          ));
          // 	EnumerationLiteral.enumeration (literal, enumeration)
          new TypeConstraint(body, Tuples.flatTupleOf(var_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_literal, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral", "enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new Equality(body, var__virtual_0_, var_enumeration);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
