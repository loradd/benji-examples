/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Classifier.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Classifier_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Preserved_classifier_package extends BaseGeneratedEMFQuerySpecification<Preserved_classifier_package.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_classifier_package pattern,
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
    private Classifier fInitial_classifier;
    
    private Classifier fCurrent_classifier;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private static List<String> parameterNames = makeImmutableList("initial_classifier", "current_classifier", "initial_package", "current_package");
    
    private Match(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      this.fInitial_classifier = pInitial_classifier;
      this.fCurrent_classifier = pCurrent_classifier;
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_classifier".equals(parameterName)) return this.fInitial_classifier;
      if ("current_classifier".equals(parameterName)) return this.fCurrent_classifier;
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      return null;
    }
    
    public Classifier getInitial_classifier() {
      return this.fInitial_classifier;
    }
    
    public Classifier getCurrent_classifier() {
      return this.fCurrent_classifier;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_classifier".equals(parameterName) ) {
          this.fInitial_classifier = (Classifier) newValue;
          return true;
      }
      if ("current_classifier".equals(parameterName) ) {
          this.fCurrent_classifier = (Classifier) newValue;
          return true;
      }
      if ("initial_package".equals(parameterName) ) {
          this.fInitial_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_classifier(final Classifier pInitial_classifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_classifier = pInitial_classifier;
    }
    
    public void setCurrent_classifier(final Classifier pCurrent_classifier) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_classifier = pCurrent_classifier;
    }
    
    public void setInitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_package = pInitial_package;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_classifier_package";
    }
    
    @Override
    public List<String> parameterNames() {
      return Preserved_classifier_package.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_classifier, fCurrent_classifier, fInitial_package, fCurrent_package};
    }
    
    @Override
    public Preserved_classifier_package.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_classifier, fCurrent_classifier, fInitial_package, fCurrent_package) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_classifier\"=" + prettyPrintValue(fInitial_classifier) + ", ");
      result.append("\"current_classifier\"=" + prettyPrintValue(fCurrent_classifier) + ", ");
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_classifier, fCurrent_classifier, fInitial_package, fCurrent_package);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Preserved_classifier_package.Match)) {
          Preserved_classifier_package.Match other = (Preserved_classifier_package.Match) obj;
          return Objects.equals(fInitial_classifier, other.fInitial_classifier) && Objects.equals(fCurrent_classifier, other.fCurrent_classifier) && Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package);
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
    public Preserved_classifier_package specification() {
      return Preserved_classifier_package.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Preserved_classifier_package.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Preserved_classifier_package.Match newMutableMatch(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Mutable(pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Preserved_classifier_package.Match newMatch(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return new Immutable(pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package);
    }
    
    private static final class Mutable extends Preserved_classifier_package.Match {
      Mutable(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Preserved_classifier_package.Match {
      Immutable(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
        super(pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_classifier_package pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // classifier - package - preserved
   * pattern preserved_classifier_package (initial_classifier : Classifier, current_classifier : Classifier, initial_package : Package, current_package : Package) {
   * 	find preserved_classifier (initial_classifier, current_classifier); 
   * 	find preserved_package (initial_package, current_package); 
   * 	find classifier_package (initial_classifier, initial_package); 
   * 	find classifier_package (current_classifier, current_package); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Preserved_classifier_package
   * 
   */
  public static class Matcher extends BaseMatcher<Preserved_classifier_package.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Preserved_classifier_package.Matcher on(final ViatraQueryEngine engine) {
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
    public static Preserved_classifier_package.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_CLASSIFIER = 0;
    
    private final static int POSITION_CURRENT_CLASSIFIER = 1;
    
    private final static int POSITION_INITIAL_PACKAGE = 2;
    
    private final static int POSITION_CURRENT_PACKAGE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Preserved_classifier_package.Matcher.class);
    
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
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Preserved_classifier_package.Match> getAllMatches(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetAllMatches(new Object[]{pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Preserved_classifier_package.Match getOneArbitraryMatch(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawHasMatch(new Object[]{pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawCountMatches(new Object[]{pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super Preserved_classifier_package.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final IMatchProcessor<? super Preserved_classifier_package.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_classifier the fixed value of pattern parameter initial_classifier, or null if not bound.
     * @param pCurrent_classifier the fixed value of pattern parameter current_classifier, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Preserved_classifier_package.Match newMatch(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return Preserved_classifier_package.Match.newMatch(pInitial_classifier, pCurrent_classifier, pInitial_package, pCurrent_package);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Classifier> rawAccumulateAllValuesOfinitial_classifier(final Object[] parameters) {
      Set<Classifier> results = new HashSet<Classifier>();
      rawAccumulateAllValues(POSITION_INITIAL_CLASSIFIER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfinitial_classifier() {
      return rawAccumulateAllValuesOfinitial_classifier(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfinitial_classifier(final Preserved_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_classifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfinitial_classifier(final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfinitial_classifier(new Object[]{
      null, 
      pCurrent_classifier, 
      pInitial_package, 
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
    public Set<Classifier> getAllValuesOfcurrent_classifier(final Preserved_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_classifier(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_classifier.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Classifier> getAllValuesOfcurrent_classifier(final Classifier pInitial_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfcurrent_classifier(new Object[]{
      pInitial_classifier, 
      null, 
      pInitial_package, 
      pCurrent_package
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final Preserved_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      pInitial_classifier, 
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final Preserved_classifier_package.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_classifier, 
      pCurrent_classifier, 
      pInitial_package, 
      null
      });
    }
    
    @Override
    protected Preserved_classifier_package.Match tupleToMatch(final Tuple t) {
      try {
          return Preserved_classifier_package.Match.newMatch((Classifier) t.get(POSITION_INITIAL_CLASSIFIER), (Classifier) t.get(POSITION_CURRENT_CLASSIFIER), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_classifier_package.Match arrayToMatch(final Object[] match) {
      try {
          return Preserved_classifier_package.Match.newMatch((Classifier) match[POSITION_INITIAL_CLASSIFIER], (Classifier) match[POSITION_CURRENT_CLASSIFIER], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Preserved_classifier_package.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Preserved_classifier_package.Match.newMutableMatch((Classifier) match[POSITION_INITIAL_CLASSIFIER], (Classifier) match[POSITION_CURRENT_CLASSIFIER], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE]);
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
    public static IQuerySpecification<Preserved_classifier_package.Matcher> querySpecification() {
      return Preserved_classifier_package.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_classifier_package pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Preserved_classifier_package.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_classifier the value of pattern parameter initial_classifier in the currently processed match
     * @param pCurrent_classifier the value of pattern parameter current_classifier in the currently processed match
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * 
     */
    public abstract void process(final Classifier pInitial_classifier, final Classifier pCurrent_classifier, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package);
    
    @Override
    public void process(final Preserved_classifier_package.Match match) {
      process(match.getInitial_classifier(), match.getCurrent_classifier(), match.getInitial_package(), match.getCurrent_package());
    }
  }
  
  private Preserved_classifier_package() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Preserved_classifier_package instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Preserved_classifier_package.Matcher instantiate(final ViatraQueryEngine engine) {
    return Preserved_classifier_package.Matcher.on(engine);
  }
  
  @Override
  public Preserved_classifier_package.Matcher instantiate() {
    return Preserved_classifier_package.Matcher.create();
  }
  
  @Override
  public Preserved_classifier_package.Match newEmptyMatch() {
    return Preserved_classifier_package.Match.newEmptyMatch();
  }
  
  @Override
  public Preserved_classifier_package.Match newMatch(final Object... parameters) {
    return Preserved_classifier_package.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Classifier) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Classifier) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier_package (visibility: PUBLIC, simpleName: Preserved_classifier_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier_package (visibility: PUBLIC, simpleName: Preserved_classifier_package, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_classifier_package, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Preserved_classifier_package INSTANCE = new Preserved_classifier_package();
    
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
    private final static Preserved_classifier_package.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_classifier = new PParameter("initial_classifier", "se.mdh.idt.benji.examples.refactorings.metamodel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_classifier = new PParameter("current_classifier", "se.mdh.idt.benji.examples.refactorings.metamodel.Classifier", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_classifier, parameter_pCurrent_classifier, parameter_pInitial_package, parameter_pCurrent_package);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.preserved_classifier_package";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_classifier","current_classifier","initial_package","current_package");
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
          PVariable var_initial_classifier = body.getOrCreateVariableByName("initial_classifier");
          PVariable var_current_classifier = body.getOrCreateVariableByName("current_classifier");
          PVariable var_initial_package = body.getOrCreateVariableByName("initial_package");
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_classifier), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Classifier")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_classifier, parameter_pInitial_classifier),
             new ExportedParameter(body, var_current_classifier, parameter_pCurrent_classifier),
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package)
          ));
          // 	find preserved_classifier (initial_classifier, current_classifier)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_classifier, var_current_classifier), Preserved_classifier.instance().getInternalQueryRepresentation());
          //  	find preserved_package (initial_package, current_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package), Preserved_package.instance().getInternalQueryRepresentation());
          //  	find classifier_package (initial_classifier, initial_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_classifier, var_initial_package), Classifier_package.instance().getInternalQueryRepresentation());
          //  	find classifier_package (current_classifier, current_package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_current_classifier, var_current_package), Classifier_package.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
