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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package;
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
public final class $current_datatype_package extends BaseGeneratedEMFQuerySpecification<$current_datatype_package.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package pattern,
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
    
    private DataType fCurrent_datatype;
    
    private TraceLink fPackage;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private static List<String> parameterNames = makeImmutableList("datatype", "current_datatype", "package", "current_package");
    
    private Match(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      this.fDatatype = pDatatype;
      this.fCurrent_datatype = pCurrent_datatype;
      this.fPackage = pPackage;
      this.fCurrent_package = pCurrent_package;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("datatype".equals(parameterName)) return this.fDatatype;
      if ("current_datatype".equals(parameterName)) return this.fCurrent_datatype;
      if ("package".equals(parameterName)) return this.fPackage;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      return null;
    }
    
    public TraceLink getDatatype() {
      return this.fDatatype;
    }
    
    public DataType getCurrent_datatype() {
      return this.fCurrent_datatype;
    }
    
    public TraceLink getPackage() {
      return this.fPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("datatype".equals(parameterName) ) {
          this.fDatatype = (TraceLink) newValue;
          return true;
      }
      if ("current_datatype".equals(parameterName) ) {
          this.fCurrent_datatype = (DataType) newValue;
          return true;
      }
      if ("package".equals(parameterName) ) {
          this.fPackage = (TraceLink) newValue;
          return true;
      }
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setDatatype(final TraceLink pDatatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fDatatype = pDatatype;
    }
    
    public void setCurrent_datatype(final DataType pCurrent_datatype) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_datatype = pCurrent_datatype;
    }
    
    public void setPackage(final TraceLink pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_datatype_package.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fDatatype, fCurrent_datatype, fPackage, fCurrent_package};
    }
    
    @Override
    public $current_datatype_package.Match toImmutable() {
      return isMutable() ? newMatch(fDatatype, fCurrent_datatype, fPackage, fCurrent_package) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"datatype\"=" + prettyPrintValue(fDatatype) + ", ");
      result.append("\"current_datatype\"=" + prettyPrintValue(fCurrent_datatype) + ", ");
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fDatatype, fCurrent_datatype, fPackage, fCurrent_package);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_datatype_package.Match)) {
          $current_datatype_package.Match other = ($current_datatype_package.Match) obj;
          return Objects.equals(fDatatype, other.fDatatype) && Objects.equals(fCurrent_datatype, other.fCurrent_datatype) && Objects.equals(fPackage, other.fPackage) && Objects.equals(fCurrent_package, other.fCurrent_package);
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
    public $current_datatype_package specification() {
      return $current_datatype_package.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_datatype_package.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_datatype_package.Match newMutableMatch(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Mutable(pDatatype, pCurrent_datatype, pPackage, pCurrent_package);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_datatype_package.Match newMatch(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Immutable(pDatatype, pCurrent_datatype, pPackage, pCurrent_package);
    }
    
    private static final class Mutable extends $current_datatype_package.Match {
      Mutable(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pDatatype, pCurrent_datatype, pPackage, pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_datatype_package.Match {
      Immutable(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pDatatype, pCurrent_datatype, pPackage, pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // datatype - package - current
   * pattern $current_datatype_package (datatype : TraceLink, current_datatype : DataType, ^package : TraceLink, current_package : Package) {
   * 	find $current_classifier_package (datatype, current_datatype, ^package, current_package);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_datatype_package
   * 
   */
  public static class Matcher extends BaseMatcher<$current_datatype_package.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_datatype_package.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_datatype_package.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_DATATYPE = 0;
    
    private final static int POSITION_CURRENT_DATATYPE = 1;
    
    private final static int POSITION_PACKAGE = 2;
    
    private final static int POSITION_CURRENT_PACKAGE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_datatype_package.Matcher.class);
    
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
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_datatype_package.Match> getAllMatches(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetAllMatches(new Object[]{pDatatype, pCurrent_datatype, pPackage, pCurrent_package});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_datatype_package.Match getOneArbitraryMatch(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetOneArbitraryMatch(new Object[]{pDatatype, pCurrent_datatype, pPackage, pCurrent_package});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawHasMatch(new Object[]{pDatatype, pCurrent_datatype, pPackage, pCurrent_package});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawCountMatches(new Object[]{pDatatype, pCurrent_datatype, pPackage, pCurrent_package});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super $current_datatype_package.Match> processor) {
      rawForEachMatch(new Object[]{pDatatype, pCurrent_datatype, pPackage, pCurrent_package}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super $current_datatype_package.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pDatatype, pCurrent_datatype, pPackage, pCurrent_package}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pDatatype the fixed value of pattern parameter datatype, or null if not bound.
     * @param pCurrent_datatype the fixed value of pattern parameter current_datatype, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_datatype_package.Match newMatch(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return $current_datatype_package.Match.newMatch(pDatatype, pCurrent_datatype, pPackage, pCurrent_package);
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
    public Set<TraceLink> getAllValuesOfdatatype(final $current_datatype_package.Match partialMatch) {
      return rawAccumulateAllValuesOfdatatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfdatatype(final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfdatatype(new Object[]{
      null, 
      pCurrent_datatype, 
      pPackage, 
      pCurrent_package
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<DataType> rawAccumulateAllValuesOfcurrent_datatype(final Object[] parameters) {
      Set<DataType> results = new HashSet<DataType>();
      rawAccumulateAllValues(POSITION_CURRENT_DATATYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_datatype() {
      return rawAccumulateAllValuesOfcurrent_datatype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_datatype(final $current_datatype_package.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_datatype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_datatype.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<DataType> getAllValuesOfcurrent_datatype(final TraceLink pDatatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfcurrent_datatype(new Object[]{
      pDatatype, 
      null, 
      pPackage, 
      pCurrent_package
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
    public Set<TraceLink> getAllValuesOfpackage(final $current_datatype_package.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final TraceLink pDatatype, final DataType pCurrent_datatype, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      pDatatype, 
      pCurrent_datatype, 
      null, 
      pCurrent_package
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfcurrent_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_CURRENT_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package() {
      return rawAccumulateAllValuesOfcurrent_package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final $current_datatype_package.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pDatatype, 
      pCurrent_datatype, 
      pPackage, 
      null
      });
    }
    
    @Override
    protected $current_datatype_package.Match tupleToMatch(final Tuple t) {
      try {
          return $current_datatype_package.Match.newMatch((TraceLink) t.get(POSITION_DATATYPE), (DataType) t.get(POSITION_CURRENT_DATATYPE), (TraceLink) t.get(POSITION_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_datatype_package.Match arrayToMatch(final Object[] match) {
      try {
          return $current_datatype_package.Match.newMatch((TraceLink) match[POSITION_DATATYPE], (DataType) match[POSITION_CURRENT_DATATYPE], (TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_datatype_package.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_datatype_package.Match.newMutableMatch((TraceLink) match[POSITION_DATATYPE], (DataType) match[POSITION_CURRENT_DATATYPE], (TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
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
    public static IQuerySpecification<$current_datatype_package.Matcher> querySpecification() {
      return $current_datatype_package.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_datatype_package.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pDatatype the value of pattern parameter datatype in the currently processed match
     * @param pCurrent_datatype the value of pattern parameter current_datatype in the currently processed match
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pDatatype, final DataType pCurrent_datatype, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package);
    
    @Override
    public void process(final $current_datatype_package.Match match) {
      process(match.getDatatype(), match.getCurrent_datatype(), match.getPackage(), match.getCurrent_package());
    }
  }
  
  private $current_datatype_package() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_datatype_package instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_datatype_package.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_datatype_package.Matcher.on(engine);
  }
  
  @Override
  public $current_datatype_package.Matcher instantiate() {
    return $current_datatype_package.Matcher.create();
  }
  
  @Override
  public $current_datatype_package.Match newEmptyMatch() {
    return $current_datatype_package.Match.newEmptyMatch();
  }
  
  @Override
  public $current_datatype_package.Match newMatch(final Object... parameters) {
    return $current_datatype_package.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.DataType) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package (visibility: PUBLIC, simpleName: $current_datatype_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package (visibility: PUBLIC, simpleName: $current_datatype_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_datatype_package INSTANCE = new $current_datatype_package();
    
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
    private final static $current_datatype_package.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pDatatype = new PParameter("datatype", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_datatype = new PParameter("current_datatype", "se.mdh.idt.benji.examples.refactorings.metamodel.DataType", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pDatatype, parameter_pCurrent_datatype, parameter_pPackage, parameter_pCurrent_package);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_datatype_package";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("datatype","current_datatype","package","current_package");
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
          PVariable var_current_datatype = body.getOrCreateVariableByName("current_datatype");
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_datatype), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "DataType")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_datatype, parameter_pDatatype),
             new ExportedParameter(body, var_current_datatype, parameter_pCurrent_datatype),
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package)
          ));
          // 	find $current_classifier_package (datatype, current_datatype, ^package, current_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_datatype, var_current_datatype, var_package, var_current_package), $current_classifier_package.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
