/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/MetamodelQueries.vql
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
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:23+0200")
public final class $initial_package_subPackage extends BaseGeneratedEMFQuerySpecification<$initial_package_subPackage.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage pattern,
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
    
    private TraceLink fSubPackage;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_subPackage;
    
    private static List<String> parameterNames = makeImmutableList("package", "initial_package", "subPackage", "initial_subPackage");
    
    private Match(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      this.fPackage = pPackage;
      this.fInitial_package = pInitial_package;
      this.fSubPackage = pSubPackage;
      this.fInitial_subPackage = pInitial_subPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("subPackage".equals(parameterName)) return this.fSubPackage;
      if ("initial_subPackage".equals(parameterName)) return this.fInitial_subPackage;
      return null;
    }
    
    public TraceLink getPackage() {
      return this.fPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public TraceLink getSubPackage() {
      return this.fSubPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_subPackage() {
      return this.fInitial_subPackage;
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
      if ("subPackage".equals(parameterName) ) {
          this.fSubPackage = (TraceLink) newValue;
          return true;
      }
      if ("initial_subPackage".equals(parameterName) ) {
          this.fInitial_subPackage = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
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
    
    public void setSubPackage(final TraceLink pSubPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSubPackage = pSubPackage;
    }
    
    public void setInitial_subPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_subPackage = pInitial_subPackage;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage";
    }
    
    @Override
    public List<String> parameterNames() {
      return $initial_package_subPackage.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPackage, fInitial_package, fSubPackage, fInitial_subPackage};
    }
    
    @Override
    public $initial_package_subPackage.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fInitial_package, fSubPackage, fInitial_subPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"subPackage\"=" + prettyPrintValue(fSubPackage) + ", ");
      result.append("\"initial_subPackage\"=" + prettyPrintValue(fInitial_subPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fInitial_package, fSubPackage, fInitial_subPackage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $initial_package_subPackage.Match)) {
          $initial_package_subPackage.Match other = ($initial_package_subPackage.Match) obj;
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fSubPackage, other.fSubPackage) && Objects.equals(fInitial_subPackage, other.fInitial_subPackage);
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
    public $initial_package_subPackage specification() {
      return $initial_package_subPackage.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $initial_package_subPackage.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $initial_package_subPackage.Match newMutableMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return new Mutable(pPackage, pInitial_package, pSubPackage, pInitial_subPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $initial_package_subPackage.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return new Immutable(pPackage, pInitial_package, pSubPackage, pInitial_subPackage);
    }
    
    private static final class Mutable extends $initial_package_subPackage.Match {
      Mutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
        super(pPackage, pInitial_package, pSubPackage, pInitial_subPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $initial_package_subPackage.Match {
      Immutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
        super(pPackage, pInitial_package, pSubPackage, pInitial_subPackage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - subPackage - initial
   * pattern $initial_package_subPackage (^package : TraceLink, initial_package : Package, subPackage : TraceLink, initial_subPackage : Package) {
   * 	find $initial_package_classifier (^package, initial_package, subPackage, initial_subPackage);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $initial_package_subPackage
   * 
   */
  public static class Matcher extends BaseMatcher<$initial_package_subPackage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $initial_package_subPackage.Matcher on(final ViatraQueryEngine engine) {
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
    public static $initial_package_subPackage.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_INITIAL_PACKAGE = 1;
    
    private final static int POSITION_SUBPACKAGE = 2;
    
    private final static int POSITION_INITIAL_SUBPACKAGE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($initial_package_subPackage.Matcher.class);
    
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
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$initial_package_subPackage.Match> getAllMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawGetAllMatches(new Object[]{pPackage, pInitial_package, pSubPackage, pInitial_subPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $initial_package_subPackage.Match getOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pInitial_package, pSubPackage, pInitial_subPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawHasMatch(new Object[]{pPackage, pInitial_package, pSubPackage, pInitial_subPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawCountMatches(new Object[]{pPackage, pInitial_package, pSubPackage, pInitial_subPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final IMatchProcessor<? super $initial_package_subPackage.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pInitial_package, pSubPackage, pInitial_subPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage, final IMatchProcessor<? super $initial_package_subPackage.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pInitial_package, pSubPackage, pInitial_subPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param pInitial_subPackage the fixed value of pattern parameter initial_subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $initial_package_subPackage.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return $initial_package_subPackage.Match.newMatch(pPackage, pInitial_package, pSubPackage, pInitial_subPackage);
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
    public Set<TraceLink> getAllValuesOfpackage(final $initial_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pInitial_package, 
      pSubPackage, 
      pInitial_subPackage
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final $initial_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final TraceLink pPackage, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      pPackage, 
      null, 
      pSubPackage, 
      pInitial_subPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfsubPackage(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_SUBPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsubPackage() {
      return rawAccumulateAllValuesOfsubPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsubPackage(final $initial_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfsubPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsubPackage(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage) {
      return rawAccumulateAllValuesOfsubPackage(new Object[]{
      pPackage, 
      pInitial_package, 
      null, 
      pInitial_subPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfinitial_subPackage(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_INITIAL_SUBPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_subPackage() {
      return rawAccumulateAllValuesOfinitial_subPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_subPackage(final $initial_package_subPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_subPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_subPackage(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage) {
      return rawAccumulateAllValuesOfinitial_subPackage(new Object[]{
      pPackage, 
      pInitial_package, 
      pSubPackage, 
      null
      });
    }
    
    @Override
    protected $initial_package_subPackage.Match tupleToMatch(final Tuple t) {
      try {
          return $initial_package_subPackage.Match.newMatch((TraceLink) t.get(POSITION_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (TraceLink) t.get(POSITION_SUBPACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_SUBPACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $initial_package_subPackage.Match arrayToMatch(final Object[] match) {
      try {
          return $initial_package_subPackage.Match.newMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (TraceLink) match[POSITION_SUBPACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_SUBPACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $initial_package_subPackage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $initial_package_subPackage.Match.newMutableMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (TraceLink) match[POSITION_SUBPACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_SUBPACKAGE]);
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
    public static IQuerySpecification<$initial_package_subPackage.Matcher> querySpecification() {
      return $initial_package_subPackage.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$initial_package_subPackage.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pSubPackage the value of pattern parameter subPackage in the currently processed match
     * @param pInitial_subPackage the value of pattern parameter initial_subPackage in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pSubPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_subPackage);
    
    @Override
    public void process(final $initial_package_subPackage.Match match) {
      process(match.getPackage(), match.getInitial_package(), match.getSubPackage(), match.getInitial_subPackage());
    }
  }
  
  private $initial_package_subPackage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $initial_package_subPackage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $initial_package_subPackage.Matcher instantiate(final ViatraQueryEngine engine) {
    return $initial_package_subPackage.Matcher.on(engine);
  }
  
  @Override
  public $initial_package_subPackage.Matcher instantiate() {
    return $initial_package_subPackage.Matcher.create();
  }
  
  @Override
  public $initial_package_subPackage.Match newEmptyMatch() {
    return $initial_package_subPackage.Match.newEmptyMatch();
  }
  
  @Override
  public $initial_package_subPackage.Match newMatch(final Object... parameters) {
    return $initial_package_subPackage.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage (visibility: PUBLIC, simpleName: $initial_package_subPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage (visibility: PUBLIC, simpleName: $initial_package_subPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $initial_package_subPackage INSTANCE = new $initial_package_subPackage();
    
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
    private final static $initial_package_subPackage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSubPackage = new PParameter("subPackage", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_subPackage = new PParameter("initial_subPackage", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pInitial_package, parameter_pSubPackage, parameter_pInitial_subPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$initial_package_subPackage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","initial_package","subPackage","initial_subPackage");
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
          PVariable var_subPackage = body.getOrCreateVariableByName("subPackage");
          PVariable var_initial_subPackage = body.getOrCreateVariableByName("initial_subPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_subPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_subPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_subPackage, parameter_pSubPackage),
             new ExportedParameter(body, var_initial_subPackage, parameter_pInitial_subPackage)
          ));
          // 	find $initial_package_classifier (^package, initial_package, subPackage, initial_subPackage)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_initial_package, var_subPackage, var_initial_subPackage), $initial_package_classifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
