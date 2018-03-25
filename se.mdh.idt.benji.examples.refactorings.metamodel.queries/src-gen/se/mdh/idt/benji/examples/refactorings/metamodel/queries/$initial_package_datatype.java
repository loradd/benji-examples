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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.DataType;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_classifier;
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
public final class $initial_package_datatype extends BaseGeneratedEMFQuerySpecification<$initial_package_datatype.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_package;
    
    private TraceLink fDatatype;
    
    private DataType fInitial_datatype;
    
    private static List<String> parameterNames = makeImmutableList("package", "initial_package", "datatype", "initial_datatype");
    
    private Match(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      this.fPackage = pPackage;
      this.fInitial_package = pInitial_package;
      this.fDatatype = pDatatype;
      this.fInitial_datatype = pInitial_datatype;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("datatype".equals(parameterName)) return this.fDatatype;
      if ("initial_datatype".equals(parameterName)) return this.fInitial_datatype;
      return null;
    }
    
    public TraceLink getPackage() {
      return this.fPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public TraceLink getDatatype() {
      return this.fDatatype;
    }
    
    public DataType getInitial_datatype() {
      return this.fInitial_datatype;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (TraceLink) newValue;
          return true;
      }
      if ("initial_package".equals(parameterName) ) {
          this.fInitial_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("datatype".equals(parameterName) ) {
          this.fDatatype = (TraceLink) newValue;
          return true;
      }
      if ("initial_datatype".equals(parameterName) ) {
          this.fInitial_datatype = (DataType) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final TraceLink pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setInitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_package = pInitial_package;
    }
    
    public void setDatatype(final TraceLink pDatatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDatatype = pDatatype;
    }
    
    public void setInitial_datatype(final DataType pInitial_datatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_datatype = pInitial_datatype;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype";
    }
    
    @Override
    public List<String> parameterNames() {
      return $initial_package_datatype.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPackage, fInitial_package, fDatatype, fInitial_datatype};
    }
    
    @Override
    public $initial_package_datatype.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fInitial_package, fDatatype, fInitial_datatype) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"datatype\"=" + prettyPrintValue(fDatatype) + ", ");
      result.append("\"initial_datatype\"=" + prettyPrintValue(fInitial_datatype));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fInitial_package, fDatatype, fInitial_datatype);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $initial_package_datatype.Match)) {
          $initial_package_datatype.Match other = ($initial_package_datatype.Match) obj;
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fDatatype, other.fDatatype) && Objects.equals(fInitial_datatype, other.fInitial_datatype);
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
    public $initial_package_datatype specification() {
      return $initial_package_datatype.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $initial_package_datatype.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $initial_package_datatype.Match newMutableMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return new Mutable(pPackage, pInitial_package, pDatatype, pInitial_datatype);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $initial_package_datatype.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return new Immutable(pPackage, pInitial_package, pDatatype, pInitial_datatype);
    }
    
    private static final class Mutable extends $initial_package_datatype.Match {
      Mutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
        super(pPackage, pInitial_package, pDatatype, pInitial_datatype);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $initial_package_datatype.Match {
      Immutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
        super(pPackage, pInitial_package, pDatatype, pInitial_datatype);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - datatype - initial
   * pattern $initial_package_datatype (^package : TraceLink, initial_package : Package, datatype : TraceLink, initial_datatype : DataType) {
   * 	find $initial_package_classifier (^package, initial_package, datatype, initial_datatype); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $initial_package_datatype
   * 
   */
  public static class Matcher extends BaseMatcher<$initial_package_datatype.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $initial_package_datatype.Matcher on(final ViatraQueryEngine engine) {
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
    public static $initial_package_datatype.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_INITIAL_PACKAGE = 1;
    
    private final static int POSITION_DATATYPE = 2;
    
    private final static int POSITION_INITIAL_DATATYPE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($initial_package_datatype.Matcher.class);
    
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
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$initial_package_datatype.Match> getAllMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return rawGetAllMatches(new Object[]{pPackage, pInitial_package, pDatatype, pInitial_datatype});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $initial_package_datatype.Match getOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pInitial_package, pDatatype, pInitial_datatype});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return rawHasMatch(new Object[]{pPackage, pInitial_package, pDatatype, pInitial_datatype});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return rawCountMatches(new Object[]{pPackage, pInitial_package, pDatatype, pInitial_datatype});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype, final IMatchProcessor<? super $initial_package_datatype.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pInitial_package, pDatatype, pInitial_datatype}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype, final IMatchProcessor<? super $initial_package_datatype.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pInitial_package, pDatatype, pInitial_datatype}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pInitial_datatype the fixed value of pattern parameter initial_datatype, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $initial_package_datatype.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return $initial_package_datatype.Match.newMatch(pPackage, pInitial_package, pDatatype, pInitial_datatype);
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
    public Set<TraceLink> getAllValuesOfpackage(final $initial_package_datatype.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pInitial_package, 
      pDatatype, 
      pInitial_datatype
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfinitial_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_INITIAL_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package() {
      return rawAccumulateAllValuesOfinitial_package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final $initial_package_datatype.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final TraceLink pPackage, final TraceLink pDatatype, final DataType pInitial_datatype) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      pPackage, 
      null, 
      pDatatype, 
      pInitial_datatype
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
    public Set<TraceLink> getAllValuesOfdatatype(final $initial_package_datatype.Match partialMatch) {
      return rawAccumulateAllValuesOfdatatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final DataType pInitial_datatype) {
      return rawAccumulateAllValuesOfdatatype(new Object[]{
      pPackage, 
      pInitial_package, 
      null, 
      pInitial_datatype
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfinitial_datatype(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_INITIAL_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_datatype() {
      return rawAccumulateAllValuesOfinitial_datatype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_datatype(final $initial_package_datatype.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_datatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfinitial_datatype(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype) {
      return rawAccumulateAllValuesOfinitial_datatype(new Object[]{
      pPackage, 
      pInitial_package, 
      pDatatype, 
      null
      });
    }
    
    @Override
    protected $initial_package_datatype.Match tupleToMatch(final Tuple t) {
      try {
          return $initial_package_datatype.Match.newMatch((TraceLink) t.get(POSITION_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (TraceLink) t.get(POSITION_DATATYPE), (DataType) t.get(POSITION_INITIAL_DATATYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $initial_package_datatype.Match arrayToMatch(final Object[] match) {
      try {
          return $initial_package_datatype.Match.newMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (TraceLink) match[POSITION_DATATYPE], (DataType) match[POSITION_INITIAL_DATATYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $initial_package_datatype.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $initial_package_datatype.Match.newMutableMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (TraceLink) match[POSITION_DATATYPE], (DataType) match[POSITION_INITIAL_DATATYPE]);
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
    public static IQuerySpecification<$initial_package_datatype.Matcher> querySpecification() {
      return $initial_package_datatype.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$initial_package_datatype.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pDatatype the value of pattern parameter datatype in the currently processed match
     * @param pInitial_datatype the value of pattern parameter initial_datatype in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pDatatype, final DataType pInitial_datatype);
    
    @Override
    public void process(final $initial_package_datatype.Match match) {
      process(match.getPackage(), match.getInitial_package(), match.getDatatype(), match.getInitial_datatype());
    }
  }
  
  private $initial_package_datatype() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $initial_package_datatype instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $initial_package_datatype.Matcher instantiate(final ViatraQueryEngine engine) {
    return $initial_package_datatype.Matcher.on(engine);
  }
  
  @Override
  public $initial_package_datatype.Matcher instantiate() {
    return $initial_package_datatype.Matcher.create();
  }
  
  @Override
  public $initial_package_datatype.Match newEmptyMatch() {
    return $initial_package_datatype.Match.newEmptyMatch();
  }
  
  @Override
  public $initial_package_datatype.Match newMatch(final Object... parameters) {
    return $initial_package_datatype.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype (visibility: PUBLIC, simpleName: $initial_package_datatype, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype (visibility: PUBLIC, simpleName: $initial_package_datatype, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $initial_package_datatype INSTANCE = new $initial_package_datatype();
    
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
    private final static $initial_package_datatype.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pDatatype = new PParameter("datatype", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_datatype = new PParameter("initial_datatype", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pInitial_package, parameter_pDatatype, parameter_pInitial_datatype);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_datatype";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","initial_package","datatype","initial_datatype");
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
          PVariable var_initial_package = body.getOrCreateVariableByName("initial_package");
          PVariable var_datatype = body.getOrCreateVariableByName("datatype");
          PVariable var_initial_datatype = body.getOrCreateVariableByName("initial_datatype");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_datatype, parameter_pDatatype),
             new ExportedParameter(body, var_initial_datatype, parameter_pInitial_datatype)
          ));
          // 	find $initial_package_classifier (^package, initial_package, datatype, initial_datatype)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_initial_package, var_datatype, var_initial_datatype), $initial_package_classifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
