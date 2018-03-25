/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Package.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_classifier;
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
public final class Initial_package_class extends BaseGeneratedEMFQuerySpecification<Initial_package_class.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_package_class pattern,
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
    
    private TraceLink fClass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_class;
    
    private static List<String> parameterNames = makeImmutableList("package", "initial_package", "class", "initial_class");
    
    private Match(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      this.fPackage = pPackage;
      this.fInitial_package = pInitial_package;
      this.fClass = pClass;
      this.fInitial_class = pInitial_class;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("class".equals(parameterName)) return this.fClass;
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      return null;
    }
    
    public TraceLink getPackage() {
      return this.fPackage;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public TraceLink getValueOfClass() {
      return this.fClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_class() {
      return this.fInitial_class;
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
      if ("class".equals(parameterName) ) {
          this.fClass = (TraceLink) newValue;
          return true;
      }
      if ("initial_class".equals(parameterName) ) {
          this.fInitial_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
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
    
    public void setClass(final TraceLink pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setInitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_class = pInitial_class;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_package_class";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_package_class.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fPackage, fInitial_package, fClass, fInitial_class};
    }
    
    @Override
    public Initial_package_class.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fInitial_package, fClass, fInitial_class) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fInitial_package, fClass, fInitial_class);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_package_class.Match)) {
          Initial_package_class.Match other = (Initial_package_class.Match) obj;
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fClass, other.fClass) && Objects.equals(fInitial_class, other.fInitial_class);
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
    public Initial_package_class specification() {
      return Initial_package_class.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_package_class.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_package_class.Match newMutableMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return new Mutable(pPackage, pInitial_package, pClass, pInitial_class);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_package_class.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return new Immutable(pPackage, pInitial_package, pClass, pInitial_class);
    }
    
    private static final class Mutable extends Initial_package_class.Match {
      Mutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
        super(pPackage, pInitial_package, pClass, pInitial_class);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_package_class.Match {
      Immutable(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
        super(pPackage, pInitial_package, pClass, pInitial_class);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_package_class pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // package - class - initial
   * pattern initial_package_class (^package : TraceLink, initial_package : Package, class : TraceLink, initial_class : Class) {
   * 	find initial_package_classifier (^package, initial_package, class, initial_class);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_package_class
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_package_class.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_package_class.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_package_class.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_INITIAL_PACKAGE = 1;
    
    private final static int POSITION_CLASS = 2;
    
    private final static int POSITION_INITIAL_CLASS = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_package_class.Matcher.class);
    
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
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_package_class.Match> getAllMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return rawGetAllMatches(new Object[]{pPackage, pInitial_package, pClass, pInitial_class});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_package_class.Match getOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pInitial_package, pClass, pInitial_class});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return rawHasMatch(new Object[]{pPackage, pInitial_package, pClass, pInitial_class});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return rawCountMatches(new Object[]{pPackage, pInitial_package, pClass, pInitial_class});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final IMatchProcessor<? super Initial_package_class.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pInitial_package, pClass, pInitial_class}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final IMatchProcessor<? super Initial_package_class.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pInitial_package, pClass, pInitial_class}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_package_class.Match newMatch(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return Initial_package_class.Match.newMatch(pPackage, pInitial_package, pClass, pInitial_class);
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
    public Set<TraceLink> getAllValuesOfpackage(final Initial_package_class.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfpackage(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pInitial_package, 
      pClass, 
      pInitial_class
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final Initial_package_class.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final TraceLink pPackage, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      pPackage, 
      null, 
      pClass, 
      pInitial_class
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfclass(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass() {
      return rawAccumulateAllValuesOfclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass(final Initial_package_class.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      pPackage, 
      pInitial_package, 
      null, 
      pInitial_class
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class() {
      return rawAccumulateAllValuesOfinitial_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final Initial_package_class.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      pPackage, 
      pInitial_package, 
      pClass, 
      null
      });
    }
    
    @Override
    protected Initial_package_class.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_package_class.Match.newMatch((TraceLink) t.get(POSITION_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (TraceLink) t.get(POSITION_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_package_class.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_package_class.Match.newMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_package_class.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_package_class.Match.newMutableMatch((TraceLink) match[POSITION_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS]);
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
    public static IQuerySpecification<Initial_package_class.Matcher> querySpecification() {
      return Initial_package_class.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_package_class pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_package_class.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pPackage, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class);
    
    @Override
    public void process(final Initial_package_class.Match match) {
      process(match.getPackage(), match.getInitial_package(), match.getValueOfClass(), match.getInitial_class());
    }
  }
  
  private Initial_package_class() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_package_class instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_package_class.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_package_class.Matcher.on(engine);
  }
  
  @Override
  public Initial_package_class.Matcher instantiate() {
    return Initial_package_class.Matcher.create();
  }
  
  @Override
  public Initial_package_class.Match newEmptyMatch() {
    return Initial_package_class.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_package_class.Match newMatch(final Object... parameters) {
    return Initial_package_class.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_class (visibility: PUBLIC, simpleName: Initial_package_class, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_class, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_class (visibility: PUBLIC, simpleName: Initial_package_class, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_package_class, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_package_class INSTANCE = new Initial_package_class();
    
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
    private final static Initial_package_class.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pInitial_package, parameter_pClass, parameter_pInitial_class);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_package_class";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","initial_package","class","initial_class");
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
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_initial_class = body.getOrCreateVariableByName("initial_class");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class)
          ));
          // 	find initial_package_classifier (^package, initial_package, class, initial_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_initial_package, var_class, var_initial_class), Initial_package_classifier.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
