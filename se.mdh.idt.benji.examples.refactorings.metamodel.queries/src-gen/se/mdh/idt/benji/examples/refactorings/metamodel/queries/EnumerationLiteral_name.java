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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.ModelElement_name;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class EnumerationLiteral_name extends BaseGeneratedEMFQuerySpecification<EnumerationLiteral_name.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_name pattern,
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
    
    private String fName;
    
    private static List<String> parameterNames = makeImmutableList("literal", "name");
    
    private Match(final EnumerationLiteral pLiteral, final String pName) {
      this.fLiteral = pLiteral;
      this.fName = pName;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("literal".equals(parameterName)) return this.fLiteral;
      if ("name".equals(parameterName)) return this.fName;
      return null;
    }
    
    public EnumerationLiteral getLiteral() {
      return this.fLiteral;
    }
    
    public String getName() {
      return this.fName;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("literal".equals(parameterName) ) {
          this.fLiteral = (EnumerationLiteral) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setLiteral(final EnumerationLiteral pLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLiteral = pLiteral;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_name";
    }
    
    @Override
    public List<String> parameterNames() {
      return EnumerationLiteral_name.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fLiteral, fName};
    }
    
    @Override
    public EnumerationLiteral_name.Match toImmutable() {
      return isMutable() ? newMatch(fLiteral, fName) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"literal\"=" + prettyPrintValue(fLiteral) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fLiteral, fName);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof EnumerationLiteral_name.Match)) {
          EnumerationLiteral_name.Match other = (EnumerationLiteral_name.Match) obj;
          return Objects.equals(fLiteral, other.fLiteral) && Objects.equals(fName, other.fName);
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
    public EnumerationLiteral_name specification() {
      return EnumerationLiteral_name.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static EnumerationLiteral_name.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static EnumerationLiteral_name.Match newMutableMatch(final EnumerationLiteral pLiteral, final String pName) {
      return new Mutable(pLiteral, pName);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static EnumerationLiteral_name.Match newMatch(final EnumerationLiteral pLiteral, final String pName) {
      return new Immutable(pLiteral, pName);
    }
    
    private static final class Mutable extends EnumerationLiteral_name.Match {
      Mutable(final EnumerationLiteral pLiteral, final String pName) {
        super(pLiteral, pName);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends EnumerationLiteral_name.Match {
      Immutable(final EnumerationLiteral pLiteral, final String pName) {
        super(pLiteral, pName);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_name pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration literal - name
   * pattern enumerationLiteral_name (literal : EnumerationLiteral, name : java String) {
   * 	find modelElement_name (literal, name); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see EnumerationLiteral_name
   * 
   */
  public static class Matcher extends BaseMatcher<EnumerationLiteral_name.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static EnumerationLiteral_name.Matcher on(final ViatraQueryEngine engine) {
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
    public static EnumerationLiteral_name.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_LITERAL = 0;
    
    private final static int POSITION_NAME = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(EnumerationLiteral_name.Matcher.class);
    
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
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<EnumerationLiteral_name.Match> getAllMatches(final EnumerationLiteral pLiteral, final String pName) {
      return rawGetAllMatches(new Object[]{pLiteral, pName});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public EnumerationLiteral_name.Match getOneArbitraryMatch(final EnumerationLiteral pLiteral, final String pName) {
      return rawGetOneArbitraryMatch(new Object[]{pLiteral, pName});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EnumerationLiteral pLiteral, final String pName) {
      return rawHasMatch(new Object[]{pLiteral, pName});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EnumerationLiteral pLiteral, final String pName) {
      return rawCountMatches(new Object[]{pLiteral, pName});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final EnumerationLiteral pLiteral, final String pName, final IMatchProcessor<? super EnumerationLiteral_name.Match> processor) {
      rawForEachMatch(new Object[]{pLiteral, pName}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EnumerationLiteral pLiteral, final String pName, final IMatchProcessor<? super EnumerationLiteral_name.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pLiteral, pName}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLiteral the fixed value of pattern parameter literal, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public EnumerationLiteral_name.Match newMatch(final EnumerationLiteral pLiteral, final String pName) {
      return EnumerationLiteral_name.Match.newMatch(pLiteral, pName);
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
    public Set<EnumerationLiteral> getAllValuesOfliteral(final EnumerationLiteral_name.Match partialMatch) {
      return rawAccumulateAllValuesOfliteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfliteral(final String pName) {
      return rawAccumulateAllValuesOfliteral(new Object[]{
      null, 
      pName
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname() {
      return rawAccumulateAllValuesOfname(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final EnumerationLiteral_name.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final EnumerationLiteral pLiteral) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pLiteral, 
      null
      });
    }
    
    @Override
    protected EnumerationLiteral_name.Match tupleToMatch(final Tuple t) {
      try {
          return EnumerationLiteral_name.Match.newMatch((EnumerationLiteral) t.get(POSITION_LITERAL), (String) t.get(POSITION_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EnumerationLiteral_name.Match arrayToMatch(final Object[] match) {
      try {
          return EnumerationLiteral_name.Match.newMatch((EnumerationLiteral) match[POSITION_LITERAL], (String) match[POSITION_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected EnumerationLiteral_name.Match arrayToMatchMutable(final Object[] match) {
      try {
          return EnumerationLiteral_name.Match.newMutableMatch((EnumerationLiteral) match[POSITION_LITERAL], (String) match[POSITION_NAME]);
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
    public static IQuerySpecification<EnumerationLiteral_name.Matcher> querySpecification() {
      return EnumerationLiteral_name.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_name pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<EnumerationLiteral_name.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pLiteral the value of pattern parameter literal in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * 
     */
    public abstract void process(final EnumerationLiteral pLiteral, final String pName);
    
    @Override
    public void process(final EnumerationLiteral_name.Match match) {
      process(match.getLiteral(), match.getName());
    }
  }
  
  private EnumerationLiteral_name() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static EnumerationLiteral_name instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected EnumerationLiteral_name.Matcher instantiate(final ViatraQueryEngine engine) {
    return EnumerationLiteral_name.Matcher.on(engine);
  }
  
  @Override
  public EnumerationLiteral_name.Matcher instantiate() {
    return EnumerationLiteral_name.Matcher.create();
  }
  
  @Override
  public EnumerationLiteral_name.Match newEmptyMatch() {
    return EnumerationLiteral_name.Match.newEmptyMatch();
  }
  
  @Override
  public EnumerationLiteral_name.Match newMatch(final Object... parameters) {
    return EnumerationLiteral_name.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_name (visibility: PUBLIC, simpleName: EnumerationLiteral_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_name (visibility: PUBLIC, simpleName: EnumerationLiteral_name, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.EnumerationLiteral_name, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static EnumerationLiteral_name INSTANCE = new EnumerationLiteral_name();
    
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
    private final static EnumerationLiteral_name.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pLiteral = new PParameter("literal", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pLiteral, parameter_pName);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.enumerationLiteral_name";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("literal","name");
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
          PVariable var_name = body.getOrCreateVariableByName("name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_literal, parameter_pLiteral),
             new ExportedParameter(body, var_name, parameter_pName)
          ));
          // 	find modelElement_name (literal, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_literal, var_name), ModelElement_name.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
