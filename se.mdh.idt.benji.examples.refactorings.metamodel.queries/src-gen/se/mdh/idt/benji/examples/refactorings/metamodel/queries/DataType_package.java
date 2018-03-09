/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/DataType.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Classifier_package;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class DataType_package extends BaseGeneratedEMFQuerySpecification<DataType_package.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.dataType_package pattern,
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
    private DataType fDataType;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fPackage;
    
    private static List<String> parameterNames = makeImmutableList("dataType", "package");
    
    private Match(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      this.fDataType = pDataType;
      this.fPackage = pPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("dataType".equals(parameterName)) return this.fDataType;
      if ("package".equals(parameterName)) return this.fPackage;
      return null;
    }
    
    public DataType getDataType() {
      return this.fDataType;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getPackage() {
      return this.fPackage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("dataType".equals(parameterName) ) {
          this.fDataType = (DataType) newValue;
          return true;
      }
      if ("package".equals(parameterName) ) {
          this.fPackage = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setDataType(final DataType pDataType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDataType = pDataType;
    }
    
    public void setPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.dataType_package";
    }
    
    @Override
    public List<String> parameterNames() {
      return DataType_package.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDataType, fPackage};
    }
    
    @Override
    public DataType_package.Match toImmutable() {
      return isMutable() ? newMatch(fDataType, fPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"dataType\"=" + prettyPrintValue(fDataType) + ", ");
      result.append("\"package\"=" + prettyPrintValue(fPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fDataType, fPackage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DataType_package.Match)) {
          DataType_package.Match other = (DataType_package.Match) obj;
          return Objects.equals(fDataType, other.fDataType) && Objects.equals(fPackage, other.fPackage);
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
    public DataType_package specification() {
      return DataType_package.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DataType_package.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DataType_package.Match newMutableMatch(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return new Mutable(pDataType, pPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DataType_package.Match newMatch(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return new Immutable(pDataType, pPackage);
    }
    
    private static final class Mutable extends DataType_package.Match {
      Mutable(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
        super(pDataType, pPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DataType_package.Match {
      Immutable(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
        super(pDataType, pPackage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.dataType_package pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // dataType - package
   * pattern dataType_package (dataType : DataType, ^package : Package) {
   * 	find classifier_package (dataType, ^package); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see DataType_package
   * 
   */
  public static class Matcher extends BaseMatcher<DataType_package.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DataType_package.Matcher on(final ViatraQueryEngine engine) {
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
    public static DataType_package.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_DATATYPE = 0;
    
    private final static int POSITION_PACKAGE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DataType_package.Matcher.class);
    
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
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DataType_package.Match> getAllMatches(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return rawGetAllMatches(new Object[]{pDataType, pPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public DataType_package.Match getOneArbitraryMatch(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return rawGetOneArbitraryMatch(new Object[]{pDataType, pPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return rawHasMatch(new Object[]{pDataType, pPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return rawCountMatches(new Object[]{pDataType, pPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final IMatchProcessor<? super DataType_package.Match> processor) {
      rawForEachMatch(new Object[]{pDataType, pPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage, final IMatchProcessor<? super DataType_package.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDataType, pPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDataType the fixed value of pattern parameter dataType, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DataType_package.Match newMatch(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return DataType_package.Match.newMatch(pDataType, pPackage);
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfdataType(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfdataType() {
      return rawAccumulateAllValuesOfdataType(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfdataType(final DataType_package.Match partialMatch) {
      return rawAccumulateAllValuesOfdataType(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for dataType.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfdataType(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage) {
      return rawAccumulateAllValuesOfdataType(new Object[]{
      null, 
      pPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfpackage(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfpackage() {
      return rawAccumulateAllValuesOfpackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfpackage(final DataType_package.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfpackage(final DataType pDataType) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      pDataType, 
      null
      });
    }
    
    @Override
    protected DataType_package.Match tupleToMatch(final Tuple t) {
      try {
          return DataType_package.Match.newMatch((DataType) t.get(POSITION_DATATYPE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DataType_package.Match arrayToMatch(final Object[] match) {
      try {
          return DataType_package.Match.newMatch((DataType) match[POSITION_DATATYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DataType_package.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DataType_package.Match.newMutableMatch((DataType) match[POSITION_DATATYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_PACKAGE]);
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
    public static IQuerySpecification<DataType_package.Matcher> querySpecification() {
      return DataType_package.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.dataType_package pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<DataType_package.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pDataType the value of pattern parameter dataType in the currently processed match
     * @param pPackage the value of pattern parameter package in the currently processed match
     * 
     */
    public abstract void process(final DataType pDataType, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pPackage);
    
    @Override
    public void process(final DataType_package.Match match) {
      process(match.getDataType(), match.getPackage());
    }
  }
  
  private DataType_package() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DataType_package instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DataType_package.Matcher instantiate(final ViatraQueryEngine engine) {
    return DataType_package.Matcher.on(engine);
  }
  
  @Override
  public DataType_package.Matcher instantiate() {
    return DataType_package.Matcher.create();
  }
  
  @Override
  public DataType_package.Match newEmptyMatch() {
    return DataType_package.Match.newEmptyMatch();
  }
  
  @Override
  public DataType_package.Match newMatch(final Object... parameters) {
    return DataType_package.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.DataType_package (visibility: PUBLIC, simpleName: DataType_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.DataType_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.DataType_package (visibility: PUBLIC, simpleName: DataType_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.DataType_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static DataType_package INSTANCE = new DataType_package();
    
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
    private final static DataType_package.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pDataType = new PParameter("dataType", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pDataType, parameter_pPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.dataType_package";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("dataType","package");
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
          PVariable var_dataType = body.getOrCreateVariableByName("dataType");
          PVariable var_package = body.getOrCreateVariableByName("package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_dataType), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_dataType, parameter_pDataType),
             new ExportedParameter(body, var_package, parameter_pPackage)
          ));
          // 	find classifier_package (dataType, ^package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_dataType, var_package), Classifier_package.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
