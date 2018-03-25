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
public final class $current_package_superPackage extends BaseGeneratedEMFQuerySpecification<$current_package_superPackage.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private TraceLink fSuperPackage;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_superPackage;
    
    private static List<String> parameterNames = makeImmutableList("package", "current_package", "superPackage", "current_superPackage");
    
    private Match(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      this.fPackage = pPackage;
      this.fCurrent_package = pCurrent_package;
      this.fSuperPackage = pSuperPackage;
      this.fCurrent_superPackage = pCurrent_superPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("superPackage".equals(parameterName)) return this.fSuperPackage;
      if ("current_superPackage".equals(parameterName)) return this.fCurrent_superPackage;
      return null;
    }
    
    public TraceLink getPackage() {
      return this.fPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public TraceLink getSuperPackage() {
      return this.fSuperPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_superPackage() {
      return this.fCurrent_superPackage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (TraceLink) newValue;
          return true;
      }
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("superPackage".equals(parameterName) ) {
          this.fSuperPackage = (TraceLink) newValue;
          return true;
      }
      if ("current_superPackage".equals(parameterName) ) {
          this.fCurrent_superPackage = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final TraceLink pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    public void setSuperPackage(final TraceLink pSuperPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSuperPackage = pSuperPackage;
    }
    
    public void setCurrent_superPackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_superPackage = pCurrent_superPackage;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_package_superPackage.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPackage, fCurrent_package, fSuperPackage, fCurrent_superPackage};
    }
    
    @Override
    public $current_package_superPackage.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fCurrent_package, fSuperPackage, fCurrent_superPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"superPackage\"=" + prettyPrintValue(fSuperPackage) + ", ");
      result.append("\"current_superPackage\"=" + prettyPrintValue(fCurrent_superPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fCurrent_package, fSuperPackage, fCurrent_superPackage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_package_superPackage.Match)) {
          $current_package_superPackage.Match other = ($current_package_superPackage.Match) obj;
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fSuperPackage, other.fSuperPackage) && Objects.equals(fCurrent_superPackage, other.fCurrent_superPackage);
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
    public $current_package_superPackage specification() {
      return $current_package_superPackage.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_package_superPackage.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_package_superPackage.Match newMutableMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return new Mutable(pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_package_superPackage.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return new Immutable(pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage);
    }
    
    private static final class Mutable extends $current_package_superPackage.Match {
      Mutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
        super(pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_package_superPackage.Match {
      Immutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
        super(pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - superPackage - current
   * pattern $current_package_superPackage (^package : TraceLink, current_package : Package, superPackage : TraceLink, current_superPackage : Package) {
   * 	find $current_classifier_package (^package, current_package, superPackage, current_superPackage); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_package_superPackage
   * 
   */
  public static class Matcher extends BaseMatcher<$current_package_superPackage.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_package_superPackage.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_package_superPackage.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_SUPERPACKAGE = 2;
    
    private final static int POSITION_CURRENT_SUPERPACKAGE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_package_superPackage.Matcher.class);
    
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
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_package_superPackage.Match> getAllMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return rawGetAllMatches(new Object[]{pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_package_superPackage.Match getOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return rawHasMatch(new Object[]{pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return rawCountMatches(new Object[]{pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage, final IMatchProcessor<? super $current_package_superPackage.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage, final IMatchProcessor<? super $current_package_superPackage.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pSuperPackage the fixed value of pattern parameter superPackage, or null if not bound.
     * @param pCurrent_superPackage the fixed value of pattern parameter current_superPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_package_superPackage.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return $current_package_superPackage.Match.newMatch(pPackage, pCurrent_package, pSuperPackage, pCurrent_superPackage);
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
    public Set<TraceLink> getAllValuesOfpackage(final $current_package_superPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pCurrent_package, 
      pSuperPackage, 
      pCurrent_superPackage
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final $current_package_superPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final TraceLink pPackage, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pPackage, 
      null, 
      pSuperPackage, 
      pCurrent_superPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfsuperPackage(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_SUPERPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsuperPackage() {
      return rawAccumulateAllValuesOfsuperPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsuperPackage(final $current_package_superPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfsuperPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsuperPackage(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage) {
      return rawAccumulateAllValuesOfsuperPackage(new Object[]{
      pPackage, 
      pCurrent_package, 
      null, 
      pCurrent_superPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfcurrent_superPackage(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_CURRENT_SUPERPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_superPackage() {
      return rawAccumulateAllValuesOfcurrent_superPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_superPackage(final $current_package_superPackage.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_superPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_superPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_superPackage(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage) {
      return rawAccumulateAllValuesOfcurrent_superPackage(new Object[]{
      pPackage, 
      pCurrent_package, 
      pSuperPackage, 
      null
      });
    }
    
    @Override
    protected $current_package_superPackage.Match tupleToMatch(final Tuple t) {
      try {
          return $current_package_superPackage.Match.newMatch((TraceLink) t.get(POSITION_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (TraceLink) t.get(POSITION_SUPERPACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_SUPERPACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_package_superPackage.Match arrayToMatch(final Object[] match) {
      try {
          return $current_package_superPackage.Match.newMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (TraceLink) match[POSITION_SUPERPACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_SUPERPACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_package_superPackage.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_package_superPackage.Match.newMutableMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (TraceLink) match[POSITION_SUPERPACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_SUPERPACKAGE]);
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
    public static IQuerySpecification<$current_package_superPackage.Matcher> querySpecification() {
      return $current_package_superPackage.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_package_superPackage.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pSuperPackage the value of pattern parameter superPackage in the currently processed match
     * @param pCurrent_superPackage the value of pattern parameter current_superPackage in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final TraceLink pSuperPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_superPackage);
    
    @Override
    public void process(final $current_package_superPackage.Match match) {
      process(match.getPackage(), match.getCurrent_package(), match.getSuperPackage(), match.getCurrent_superPackage());
    }
  }
  
  private $current_package_superPackage() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_package_superPackage instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_package_superPackage.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_package_superPackage.Matcher.on(engine);
  }
  
  @Override
  public $current_package_superPackage.Matcher instantiate() {
    return $current_package_superPackage.Matcher.create();
  }
  
  @Override
  public $current_package_superPackage.Match newEmptyMatch() {
    return $current_package_superPackage.Match.newEmptyMatch();
  }
  
  @Override
  public $current_package_superPackage.Match newMatch(final Object... parameters) {
    return $current_package_superPackage.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage (visibility: PUBLIC, simpleName: $current_package_superPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage (visibility: PUBLIC, simpleName: $current_package_superPackage, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_package_superPackage INSTANCE = new $current_package_superPackage();
    
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
    private final static $current_package_superPackage.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSuperPackage = new PParameter("superPackage", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_superPackage = new PParameter("current_superPackage", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pCurrent_package, parameter_pSuperPackage, parameter_pCurrent_superPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package_superPackage";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","current_package","superPackage","current_superPackage");
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
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          PVariable var_superPackage = body.getOrCreateVariableByName("superPackage");
          PVariable var_current_superPackage = body.getOrCreateVariableByName("current_superPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_superPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_superPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_superPackage, parameter_pSuperPackage),
             new ExportedParameter(body, var_current_superPackage, parameter_pCurrent_superPackage)
          ));
          // 	find $current_classifier_package (^package, current_package, superPackage, current_superPackage)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_current_package, var_superPackage, var_current_superPackage), $current_classifier_package.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
