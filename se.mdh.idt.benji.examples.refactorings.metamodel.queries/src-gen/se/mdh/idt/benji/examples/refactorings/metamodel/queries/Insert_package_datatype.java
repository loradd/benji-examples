/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/PackageQueries.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_package_datatype;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_datatype;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class Insert_package_datatype extends BaseGeneratedEMFQuerySpecification<Insert_package_datatype.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.insert_package_datatype pattern,
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
    private TraceLink fPackage;
    
    private TraceLink fDatatype;
    
    private static List<String> parameterNames = makeImmutableList("package", "datatype");
    
    private Match(final TraceLink pPackage, final TraceLink pDatatype) {
      this.fPackage = pPackage;
      this.fDatatype = pDatatype;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("datatype".equals(parameterName)) return this.fDatatype;
      return null;
    }
    
    public TraceLink getPackage() {
      return this.fPackage;
    }
    
    public TraceLink getDatatype() {
      return this.fDatatype;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (TraceLink) newValue;
          return true;
      }
      if ("datatype".equals(parameterName) ) {
          this.fDatatype = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final TraceLink pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setDatatype(final TraceLink pDatatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDatatype = pDatatype;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.insert_package_datatype";
    }
    
    @Override
    public List<String> parameterNames() {
      return Insert_package_datatype.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPackage, fDatatype};
    }
    
    @Override
    public Insert_package_datatype.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fDatatype) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"datatype\"=" + prettyPrintValue(fDatatype));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fDatatype);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Insert_package_datatype.Match)) {
          Insert_package_datatype.Match other = (Insert_package_datatype.Match) obj;
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fDatatype, other.fDatatype);
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
    public Insert_package_datatype specification() {
      return Insert_package_datatype.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Insert_package_datatype.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Insert_package_datatype.Match newMutableMatch(final TraceLink pPackage, final TraceLink pDatatype) {
      return new Mutable(pPackage, pDatatype);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Insert_package_datatype.Match newMatch(final TraceLink pPackage, final TraceLink pDatatype) {
      return new Immutable(pPackage, pDatatype);
    }
    
    private static final class Mutable extends Insert_package_datatype.Match {
      Mutable(final TraceLink pPackage, final TraceLink pDatatype) {
        super(pPackage, pDatatype);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Insert_package_datatype.Match {
      Immutable(final TraceLink pPackage, final TraceLink pDatatype) {
        super(pPackage, pDatatype);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.insert_package_datatype pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - datatype - insert
   * pattern insert_package_datatype (^package : TraceLink, datatype : TraceLink) {
   * 	neg find initial_package_datatype (^package, _initial_package, datatype, _initial_datatype);
   * 	find current_package_datatype (^package, _current_package, datatype, _current_datatype);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Insert_package_datatype
   * 
   */
  public static class Matcher extends BaseMatcher<Insert_package_datatype.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Insert_package_datatype.Matcher on(final ViatraQueryEngine engine) {
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
    public static Insert_package_datatype.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_DATATYPE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Insert_package_datatype.Matcher.class);
    
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Insert_package_datatype.Match> getAllMatches(final TraceLink pPackage, final TraceLink pDatatype) {
      return rawGetAllMatches(new Object[]{pPackage, pDatatype});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Insert_package_datatype.Match getOneArbitraryMatch(final TraceLink pPackage, final TraceLink pDatatype) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pDatatype});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pPackage, final TraceLink pDatatype) {
      return rawHasMatch(new Object[]{pPackage, pDatatype});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pPackage, final TraceLink pDatatype) {
      return rawCountMatches(new Object[]{pPackage, pDatatype});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pPackage, final TraceLink pDatatype, final IMatchProcessor<? super Insert_package_datatype.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pDatatype}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pPackage, final TraceLink pDatatype, final IMatchProcessor<? super Insert_package_datatype.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pDatatype}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Insert_package_datatype.Match newMatch(final TraceLink pPackage, final TraceLink pDatatype) {
      return Insert_package_datatype.Match.newMatch(pPackage, pDatatype);
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
    public Set<TraceLink> getAllValuesOfpackage(final Insert_package_datatype.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final TraceLink pDatatype) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pDatatype
      });
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
    public Set<TraceLink> getAllValuesOfdatatype(final Insert_package_datatype.Match partialMatch) {
      return rawAccumulateAllValuesOfdatatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype(final TraceLink pPackage) {
      return rawAccumulateAllValuesOfdatatype(new Object[]{
      pPackage, 
      null
      });
    }
    
    @Override
    protected Insert_package_datatype.Match tupleToMatch(final Tuple t) {
      try {
          return Insert_package_datatype.Match.newMatch((TraceLink) t.get(POSITION_PACKAGE), (TraceLink) t.get(POSITION_DATATYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Insert_package_datatype.Match arrayToMatch(final Object[] match) {
      try {
          return Insert_package_datatype.Match.newMatch((TraceLink) match[POSITION_PACKAGE], (TraceLink) match[POSITION_DATATYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Insert_package_datatype.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Insert_package_datatype.Match.newMutableMatch((TraceLink) match[POSITION_PACKAGE], (TraceLink) match[POSITION_DATATYPE]);
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
    public static IQuerySpecification<Insert_package_datatype.Matcher> querySpecification() {
      return Insert_package_datatype.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.insert_package_datatype pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Insert_package_datatype.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pDatatype the value of pattern parameter datatype in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pPackage, final TraceLink pDatatype);
    
    @Override
    public void process(final Insert_package_datatype.Match match) {
      process(match.getPackage(), match.getDatatype());
    }
  }
  
  private Insert_package_datatype() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Insert_package_datatype instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Insert_package_datatype.Matcher instantiate(final ViatraQueryEngine engine) {
    return Insert_package_datatype.Matcher.on(engine);
  }
  
  @Override
  public Insert_package_datatype.Matcher instantiate() {
    return Insert_package_datatype.Matcher.create();
  }
  
  @Override
  public Insert_package_datatype.Match newEmptyMatch() {
    return Insert_package_datatype.Match.newEmptyMatch();
  }
  
  @Override
  public Insert_package_datatype.Match newMatch(final Object... parameters) {
    return Insert_package_datatype.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_datatype (visibility: PUBLIC, simpleName: Insert_package_datatype, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_datatype, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_datatype (visibility: PUBLIC, simpleName: Insert_package_datatype, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_datatype, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Insert_package_datatype INSTANCE = new Insert_package_datatype();
    
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
    private final static Insert_package_datatype.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pDatatype = new PParameter("datatype", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pDatatype);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.insert_package_datatype";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","datatype");
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
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var_datatype = body.getOrCreateVariableByName("datatype");
          PVariable var__initial_package = body.getOrCreateVariableByName("_initial_package");
          PVariable var__initial_datatype = body.getOrCreateVariableByName("_initial_datatype");
          PVariable var__current_package = body.getOrCreateVariableByName("_current_package");
          PVariable var__current_datatype = body.getOrCreateVariableByName("_current_datatype");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_datatype, parameter_pDatatype)
          ));
          // 	neg find initial_package_datatype (^package, _initial_package, datatype, _initial_datatype)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_package, var__initial_package, var_datatype, var__initial_datatype), Initial_package_datatype.instance().getInternalQueryRepresentation());
          // 	find current_package_datatype (^package, _current_package, datatype, _current_datatype)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var__current_package, var_datatype, var__current_datatype), Current_package_datatype.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
