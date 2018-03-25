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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_package;
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
public final class $current_classifier_package extends BaseGeneratedEMFQuerySpecification<$current_classifier_package.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package pattern,
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
    private TraceLink fClassifier;
    
    private Classifier fCurrent_classifier;
    
    private TraceLink fPackage;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private static List<String> parameterNames = makeImmutableList("classifier", "current_classifier", "package", "current_package");
    
    private Match(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      this.fClassifier = pClassifier;
      this.fCurrent_classifier = pCurrent_classifier;
      this.fPackage = pPackage;
      this.fCurrent_package = pCurrent_package;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("classifier".equals(parameterName)) return this.fClassifier;
      if ("current_classifier".equals(parameterName)) return this.fCurrent_classifier;
      if ("package".equals(parameterName)) return this.fPackage;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      return null;
    }
    
    public TraceLink getClassifier() {
      return this.fClassifier;
    }
    
    public Classifier getCurrent_classifier() {
      return this.fCurrent_classifier;
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
      if ("classifier".equals(parameterName) ) {
          this.fClassifier = (TraceLink) newValue;
          return true;
      }
      if ("current_classifier".equals(parameterName) ) {
          this.fCurrent_classifier = (Classifier) newValue;
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
    
    public void setClassifier(final TraceLink pClassifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClassifier = pClassifier;
    }
    
    public void setCurrent_classifier(final Classifier pCurrent_classifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_classifier = pCurrent_classifier;
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
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_classifier_package.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClassifier, fCurrent_classifier, fPackage, fCurrent_package};
    }
    
    @Override
    public $current_classifier_package.Match toImmutable() {
      return isMutable() ? newMatch(fClassifier, fCurrent_classifier, fPackage, fCurrent_package) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"classifier\"=" + prettyPrintValue(fClassifier) + ", ");
      result.append("\"current_classifier\"=" + prettyPrintValue(fCurrent_classifier) + ", ");
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClassifier, fCurrent_classifier, fPackage, fCurrent_package);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_classifier_package.Match)) {
          $current_classifier_package.Match other = ($current_classifier_package.Match) obj;
          return Objects.equals(fClassifier, other.fClassifier) && Objects.equals(fCurrent_classifier, other.fCurrent_classifier) && Objects.equals(fPackage, other.fPackage) && Objects.equals(fCurrent_package, other.fCurrent_package);
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
    public $current_classifier_package specification() {
      return $current_classifier_package.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_classifier_package.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_classifier_package.Match newMutableMatch(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Mutable(pClassifier, pCurrent_classifier, pPackage, pCurrent_package);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_classifier_package.Match newMatch(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Immutable(pClassifier, pCurrent_classifier, pPackage, pCurrent_package);
    }
    
    private static final class Mutable extends $current_classifier_package.Match {
      Mutable(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pClassifier, pCurrent_classifier, pPackage, pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_classifier_package.Match {
      Immutable(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pClassifier, pCurrent_classifier, pPackage, pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // classifier - package - current
   * pattern $current_classifier_package (classifier : TraceLink, current_classifier : Classifier, ^package : TraceLink, current_package : Package) {
   * 	find $current_classifier (classifier, current_classifier);
   * 	find $current_package (^package, current_package); 
   * 	Classifier.^package (current_classifier, current_package);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_classifier_package
   * 
   */
  public static class Matcher extends BaseMatcher<$current_classifier_package.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_classifier_package.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_classifier_package.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASSIFIER = 0;
    
    private final static int POSITION_CURRENT_CLASSIFIER = 1;
    
    private final static int POSITION_PACKAGE = 2;
    
    private final static int POSITION_CURRENT_PACKAGE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_classifier_package.Matcher.class);
    
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
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_classifier_package.Match> getAllMatches(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetAllMatches(new Object[]{pClassifier, pCurrent_classifier, pPackage, pCurrent_package});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_classifier_package.Match getOneArbitraryMatch(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetOneArbitraryMatch(new Object[]{pClassifier, pCurrent_classifier, pPackage, pCurrent_package});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawHasMatch(new Object[]{pClassifier, pCurrent_classifier, pPackage, pCurrent_package});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawCountMatches(new Object[]{pClassifier, pCurrent_classifier, pPackage, pCurrent_package});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super $current_classifier_package.Match> processor) {
      rawForEachMatch(new Object[]{pClassifier, pCurrent_classifier, pPackage, pCurrent_package}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super $current_classifier_package.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClassifier, pCurrent_classifier, pPackage, pCurrent_package}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClassifier the fixed value of pattern parameter classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_classifier_package.Match newMatch(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return $current_classifier_package.Match.newMatch(pClassifier, pCurrent_classifier, pPackage, pCurrent_package);
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfclassifier(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_CLASSIFIER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclassifier() {
      return rawAccumulateAllValuesOfclassifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclassifier(final $current_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfclassifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclassifier(final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfclassifier(new Object[]{
      null, 
      pCurrent_classifier, 
      pPackage, 
      pCurrent_package
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Classifier> rawAccumulateAllValuesOfcurrent_classifier(final Object[] parameters) {
      Set<Classifier> results = new HashSet<Classifier>();
      rawAccumulateAllValues(POSITION_CURRENT_CLASSIFIER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfcurrent_classifier() {
      return rawAccumulateAllValuesOfcurrent_classifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfcurrent_classifier(final $current_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_classifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfcurrent_classifier(final TraceLink pClassifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfcurrent_classifier(new Object[]{
      pClassifier, 
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
    public Set<TraceLink> getAllValuesOfpackage(final $current_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final TraceLink pClassifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      pClassifier, 
      pCurrent_classifier, 
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final $current_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pClassifier, 
      pCurrent_classifier, 
      pPackage, 
      null
      });
    }
    
    @Override
    protected $current_classifier_package.Match tupleToMatch(final Tuple t) {
      try {
          return $current_classifier_package.Match.newMatch((TraceLink) t.get(POSITION_CLASSIFIER), (Classifier) t.get(POSITION_CURRENT_CLASSIFIER), (TraceLink) t.get(POSITION_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_classifier_package.Match arrayToMatch(final Object[] match) {
      try {
          return $current_classifier_package.Match.newMatch((TraceLink) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_CURRENT_CLASSIFIER], (TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_classifier_package.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_classifier_package.Match.newMutableMatch((TraceLink) match[POSITION_CLASSIFIER], (Classifier) match[POSITION_CURRENT_CLASSIFIER], (TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
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
    public static IQuerySpecification<$current_classifier_package.Matcher> querySpecification() {
      return $current_classifier_package.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_classifier_package.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClassifier the value of pattern parameter classifier in the currently processed match
     * @param pCurrent_classifier the value of pattern parameter current_classifier in the currently processed match
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pClassifier, final Classifier pCurrent_classifier, final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package);
    
    @Override
    public void process(final $current_classifier_package.Match match) {
      process(match.getClassifier(), match.getCurrent_classifier(), match.getPackage(), match.getCurrent_package());
    }
  }
  
  private $current_classifier_package() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_classifier_package instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_classifier_package.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_classifier_package.Matcher.on(engine);
  }
  
  @Override
  public $current_classifier_package.Matcher instantiate() {
    return $current_classifier_package.Matcher.create();
  }
  
  @Override
  public $current_classifier_package.Match newEmptyMatch() {
    return $current_classifier_package.Match.newEmptyMatch();
  }
  
  @Override
  public $current_classifier_package.Match newMatch(final Object... parameters) {
    return $current_classifier_package.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Classifier) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package (visibility: PUBLIC, simpleName: $current_classifier_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package (visibility: PUBLIC, simpleName: $current_classifier_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_classifier_package INSTANCE = new $current_classifier_package();
    
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
    private final static $current_classifier_package.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClassifier = new PParameter("classifier", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_classifier = new PParameter("current_classifier", "se.mdh.idt.benji.examples.refactorings.metamodel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClassifier, parameter_pCurrent_classifier, parameter_pPackage, parameter_pCurrent_package);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_classifier_package";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("classifier","current_classifier","package","current_package");
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
          PVariable var_classifier = body.getOrCreateVariableByName("classifier");
          PVariable var_current_classifier = body.getOrCreateVariableByName("current_classifier");
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_classifier, parameter_pClassifier),
             new ExportedParameter(body, var_current_classifier, parameter_pCurrent_classifier),
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package)
          ));
          // 	find $current_classifier (classifier, current_classifier)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_classifier, var_current_classifier), $current_classifier.instance().getInternalQueryRepresentation());
          // 	find $current_package (^package, current_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_current_package), $current_package.instance().getInternalQueryRepresentation());
          //  	Classifier.package (current_classifier, current_package)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_classifier, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier", "package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new Equality(body, var__virtual_0_, var_current_package);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
