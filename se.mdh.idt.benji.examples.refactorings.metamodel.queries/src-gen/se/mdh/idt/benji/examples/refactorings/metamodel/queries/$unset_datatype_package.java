/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Metamodel.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_datatype_package;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class $unset_datatype_package extends BaseGeneratedEMFQuerySpecification<$unset_datatype_package.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package pattern,
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
    private TraceLink fDatatype;
    
    private TraceLink fPackage;
    
    private static List<String> parameterNames = makeImmutableList("datatype", "package");
    
    private Match(final TraceLink pDatatype, final TraceLink pPackage) {
      this.fDatatype = pDatatype;
      this.fPackage = pPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("datatype".equals(parameterName)) return this.fDatatype;
      if ("package".equals(parameterName)) return this.fPackage;
      return null;
    }
    
    public TraceLink getDatatype() {
      return this.fDatatype;
    }
    
    public TraceLink getPackage() {
      return this.fPackage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("datatype".equals(parameterName) ) {
          this.fDatatype = (TraceLink) newValue;
          return true;
      }
      if ("package".equals(parameterName) ) {
          this.fPackage = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setDatatype(final TraceLink pDatatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDatatype = pDatatype;
    }
    
    public void setPackage(final TraceLink pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package";
    }
    
    @Override
    public List<String> parameterNames() {
      return $unset_datatype_package.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDatatype, fPackage};
    }
    
    @Override
    public $unset_datatype_package.Match toImmutable() {
      return isMutable() ? newMatch(fDatatype, fPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"datatype\"=" + prettyPrintValue(fDatatype) + ", ");
      result.append("\"package\"=" + prettyPrintValue(fPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fDatatype, fPackage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $unset_datatype_package.Match)) {
          $unset_datatype_package.Match other = ($unset_datatype_package.Match) obj;
          return Objects.equals(fDatatype, other.fDatatype) && Objects.equals(fPackage, other.fPackage);
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
    public $unset_datatype_package specification() {
      return $unset_datatype_package.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $unset_datatype_package.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $unset_datatype_package.Match newMutableMatch(final TraceLink pDatatype, final TraceLink pPackage) {
      return new Mutable(pDatatype, pPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $unset_datatype_package.Match newMatch(final TraceLink pDatatype, final TraceLink pPackage) {
      return new Immutable(pDatatype, pPackage);
    }
    
    private static final class Mutable extends $unset_datatype_package.Match {
      Mutable(final TraceLink pDatatype, final TraceLink pPackage) {
        super(pDatatype, pPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $unset_datatype_package.Match {
      Immutable(final TraceLink pDatatype, final TraceLink pPackage) {
        super(pDatatype, pPackage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // datatype - package - unset
   * pattern $unset_datatype_package (datatype : TraceLink, ^package : TraceLink) {
   * 	find $initial_datatype_package (datatype, _initial_datatype, ^package, _initial_package);
   * 	neg find $current_datatype_package (datatype, _current_datatype, ^package, _current_package);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $unset_datatype_package
   * 
   */
  public static class Matcher extends BaseMatcher<$unset_datatype_package.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $unset_datatype_package.Matcher on(final ViatraQueryEngine engine) {
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
    public static $unset_datatype_package.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_DATATYPE = 0;
    
    private final static int POSITION_PACKAGE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($unset_datatype_package.Matcher.class);
    
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
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$unset_datatype_package.Match> getAllMatches(final TraceLink pDatatype, final TraceLink pPackage) {
      return rawGetAllMatches(new Object[]{pDatatype, pPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $unset_datatype_package.Match getOneArbitraryMatch(final TraceLink pDatatype, final TraceLink pPackage) {
      return rawGetOneArbitraryMatch(new Object[]{pDatatype, pPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pDatatype, final TraceLink pPackage) {
      return rawHasMatch(new Object[]{pDatatype, pPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pDatatype, final TraceLink pPackage) {
      return rawCountMatches(new Object[]{pDatatype, pPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pDatatype, final TraceLink pPackage, final IMatchProcessor<? super $unset_datatype_package.Match> processor) {
      rawForEachMatch(new Object[]{pDatatype, pPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pDatatype, final TraceLink pPackage, final IMatchProcessor<? super $unset_datatype_package.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDatatype, pPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $unset_datatype_package.Match newMatch(final TraceLink pDatatype, final TraceLink pPackage) {
      return $unset_datatype_package.Match.newMatch(pDatatype, pPackage);
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfdatatype(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype() {
      return rawAccumulateAllValuesOfdatatype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype(final $unset_datatype_package.Match partialMatch) {
      return rawAccumulateAllValuesOfdatatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype(final TraceLink pPackage) {
      return rawAccumulateAllValuesOfdatatype(new Object[]{
      null, 
      pPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfpackage(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage() {
      return rawAccumulateAllValuesOfpackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final $unset_datatype_package.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final TraceLink pDatatype) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      pDatatype, 
      null
      });
    }
    
    @Override
    protected $unset_datatype_package.Match tupleToMatch(final Tuple t) {
      try {
          return $unset_datatype_package.Match.newMatch((TraceLink) t.get(POSITION_DATATYPE), (TraceLink) t.get(POSITION_PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $unset_datatype_package.Match arrayToMatch(final Object[] match) {
      try {
          return $unset_datatype_package.Match.newMatch((TraceLink) match[POSITION_DATATYPE], (TraceLink) match[POSITION_PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $unset_datatype_package.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $unset_datatype_package.Match.newMutableMatch((TraceLink) match[POSITION_DATATYPE], (TraceLink) match[POSITION_PACKAGE]);
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
    public static IQuerySpecification<$unset_datatype_package.Matcher> querySpecification() {
      return $unset_datatype_package.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$unset_datatype_package.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pDatatype the value of pattern parameter datatype in the currently processed match
     * @param pPackage the value of pattern parameter package in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pDatatype, final TraceLink pPackage);
    
    @Override
    public void process(final $unset_datatype_package.Match match) {
      process(match.getDatatype(), match.getPackage());
    }
  }
  
  private $unset_datatype_package() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $unset_datatype_package instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $unset_datatype_package.Matcher instantiate(final ViatraQueryEngine engine) {
    return $unset_datatype_package.Matcher.on(engine);
  }
  
  @Override
  public $unset_datatype_package.Matcher instantiate() {
    return $unset_datatype_package.Matcher.create();
  }
  
  @Override
  public $unset_datatype_package.Match newEmptyMatch() {
    return $unset_datatype_package.Match.newEmptyMatch();
  }
  
  @Override
  public $unset_datatype_package.Match newMatch(final Object... parameters) {
    return $unset_datatype_package.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package (visibility: PUBLIC, simpleName: $unset_datatype_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package (visibility: PUBLIC, simpleName: $unset_datatype_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $unset_datatype_package INSTANCE = new $unset_datatype_package();
    
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
    private final static $unset_datatype_package.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pDatatype = new PParameter("datatype", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pDatatype, parameter_pPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$unset_datatype_package";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("datatype","package");
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
          PVariable var_datatype = body.getOrCreateVariableByName("datatype");
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var__initial_datatype = body.getOrCreateVariableByName("_initial_datatype");
          PVariable var__initial_package = body.getOrCreateVariableByName("_initial_package");
          PVariable var__current_datatype = body.getOrCreateVariableByName("_current_datatype");
          PVariable var__current_package = body.getOrCreateVariableByName("_current_package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_datatype, parameter_pDatatype),
             new ExportedParameter(body, var_package, parameter_pPackage)
          ));
          // 	find $initial_datatype_package (datatype, _initial_datatype, ^package, _initial_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_datatype, var__initial_datatype, var_package, var__initial_package), $initial_datatype_package.instance().getInternalQueryRepresentation());
          // 	neg find $current_datatype_package (datatype, _current_datatype, ^package, _current_package)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_datatype, var__current_datatype, var_package, var__current_package), $current_datatype_package.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
