/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Class.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class;
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
public final class Current_class_subClass extends BaseGeneratedEMFQuerySpecification<Current_class_subClass.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_subClass pattern,
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
    private TraceLink fClass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_class;
    
    private TraceLink fSubClass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_subClass;
    
    private static List<String> parameterNames = makeImmutableList("class", "current_class", "subClass", "current_subClass");
    
    private Match(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      this.fClass = pClass;
      this.fCurrent_class = pCurrent_class;
      this.fSubClass = pSubClass;
      this.fCurrent_subClass = pCurrent_subClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("subClass".equals(parameterName)) return this.fSubClass;
      if ("current_subClass".equals(parameterName)) return this.fCurrent_subClass;
      return null;
    }
    
    public TraceLink getValueOfClass() {
      return this.fClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public TraceLink getSubClass() {
      return this.fSubClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_subClass() {
      return this.fCurrent_subClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("class".equals(parameterName) ) {
          this.fClass = (TraceLink) newValue;
          return true;
      }
      if ("current_class".equals(parameterName) ) {
          this.fCurrent_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("subClass".equals(parameterName) ) {
          this.fSubClass = (TraceLink) newValue;
          return true;
      }
      if ("current_subClass".equals(parameterName) ) {
          this.fCurrent_subClass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setClass(final TraceLink pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setCurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_class = pCurrent_class;
    }
    
    public void setSubClass(final TraceLink pSubClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSubClass = pSubClass;
    }
    
    public void setCurrent_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_subClass = pCurrent_subClass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_subClass";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_class_subClass.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass, fCurrent_class, fSubClass, fCurrent_subClass};
    }
    
    @Override
    public Current_class_subClass.Match toImmutable() {
      return isMutable() ? newMatch(fClass, fCurrent_class, fSubClass, fCurrent_subClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"subClass\"=" + prettyPrintValue(fSubClass) + ", ");
      result.append("\"current_subClass\"=" + prettyPrintValue(fCurrent_subClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClass, fCurrent_class, fSubClass, fCurrent_subClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_class_subClass.Match)) {
          Current_class_subClass.Match other = (Current_class_subClass.Match) obj;
          return Objects.equals(fClass, other.fClass) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fSubClass, other.fSubClass) && Objects.equals(fCurrent_subClass, other.fCurrent_subClass);
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
    public Current_class_subClass specification() {
      return Current_class_subClass.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_class_subClass.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_class_subClass.Match newMutableMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return new Mutable(pClass, pCurrent_class, pSubClass, pCurrent_subClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_class_subClass.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return new Immutable(pClass, pCurrent_class, pSubClass, pCurrent_subClass);
    }
    
    private static final class Mutable extends Current_class_subClass.Match {
      Mutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
        super(pClass, pCurrent_class, pSubClass, pCurrent_subClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_class_subClass.Match {
      Immutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
        super(pClass, pCurrent_class, pSubClass, pCurrent_subClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_subClass pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // class - subClass - current
   * pattern current_class_subClass (class : TraceLink, current_class : Class, subClass : TraceLink, current_subClass : Class) {
   * 	find current_class (class, current_class);
   * 	find current_class (subClass, current_subClass);
   * 	Class.subClasses (current_class, current_subClass);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_class_subClass
   * 
   */
  public static class Matcher extends BaseMatcher<Current_class_subClass.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_class_subClass.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_class_subClass.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static int POSITION_CURRENT_CLASS = 1;
    
    private final static int POSITION_SUBCLASS = 2;
    
    private final static int POSITION_CURRENT_SUBCLASS = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_class_subClass.Matcher.class);
    
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
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_class_subClass.Match> getAllMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return rawGetAllMatches(new Object[]{pClass, pCurrent_class, pSubClass, pCurrent_subClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_class_subClass.Match getOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return rawGetOneArbitraryMatch(new Object[]{pClass, pCurrent_class, pSubClass, pCurrent_subClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return rawHasMatch(new Object[]{pClass, pCurrent_class, pSubClass, pCurrent_subClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return rawCountMatches(new Object[]{pClass, pCurrent_class, pSubClass, pCurrent_subClass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final IMatchProcessor<? super Current_class_subClass.Match> processor) {
      rawForEachMatch(new Object[]{pClass, pCurrent_class, pSubClass, pCurrent_subClass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final IMatchProcessor<? super Current_class_subClass.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass, pCurrent_class, pSubClass, pCurrent_subClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_class_subClass.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return Current_class_subClass.Match.newMatch(pClass, pCurrent_class, pSubClass, pCurrent_subClass);
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
    public Set<TraceLink> getAllValuesOfclass(final Current_class_subClass.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      null, 
      pCurrent_class, 
      pSubClass, 
      pCurrent_subClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class() {
      return rawAccumulateAllValuesOfcurrent_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final Current_class_subClass.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final TraceLink pClass, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pClass, 
      null, 
      pSubClass, 
      pCurrent_subClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfsubClass(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_SUBCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsubClass() {
      return rawAccumulateAllValuesOfsubClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsubClass(final Current_class_subClass.Match partialMatch) {
      return rawAccumulateAllValuesOfsubClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfsubClass(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      return rawAccumulateAllValuesOfsubClass(new Object[]{
      pClass, 
      pCurrent_class, 
      null, 
      pCurrent_subClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_subClass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_SUBCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_subClass() {
      return rawAccumulateAllValuesOfcurrent_subClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_subClass(final Current_class_subClass.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_subClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_subClass(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass) {
      return rawAccumulateAllValuesOfcurrent_subClass(new Object[]{
      pClass, 
      pCurrent_class, 
      pSubClass, 
      null
      });
    }
    
    @Override
    protected Current_class_subClass.Match tupleToMatch(final Tuple t) {
      try {
          return Current_class_subClass.Match.newMatch((TraceLink) t.get(POSITION_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (TraceLink) t.get(POSITION_SUBCLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_SUBCLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_class_subClass.Match arrayToMatch(final Object[] match) {
      try {
          return Current_class_subClass.Match.newMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (TraceLink) match[POSITION_SUBCLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_SUBCLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_class_subClass.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_class_subClass.Match.newMutableMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (TraceLink) match[POSITION_SUBCLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_SUBCLASS]);
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
    public static IQuerySpecification<Current_class_subClass.Matcher> querySpecification() {
      return Current_class_subClass.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_subClass pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_class_subClass.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pSubClass the value of pattern parameter subClass in the currently processed match
     * @param pCurrent_subClass the value of pattern parameter current_subClass in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pSubClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass);
    
    @Override
    public void process(final Current_class_subClass.Match match) {
      process(match.getValueOfClass(), match.getCurrent_class(), match.getSubClass(), match.getCurrent_subClass());
    }
  }
  
  private Current_class_subClass() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_class_subClass instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_class_subClass.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_class_subClass.Matcher.on(engine);
  }
  
  @Override
  public Current_class_subClass.Matcher instantiate() {
    return Current_class_subClass.Matcher.create();
  }
  
  @Override
  public Current_class_subClass.Match newEmptyMatch() {
    return Current_class_subClass.Match.newEmptyMatch();
  }
  
  @Override
  public Current_class_subClass.Match newMatch(final Object... parameters) {
    return Current_class_subClass.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_subClass (visibility: PUBLIC, simpleName: Current_class_subClass, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_subClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_subClass (visibility: PUBLIC, simpleName: Current_class_subClass, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_subClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_class_subClass INSTANCE = new Current_class_subClass();
    
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
    private final static Current_class_subClass.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSubClass = new PParameter("subClass", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_subClass = new PParameter("current_subClass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pCurrent_class, parameter_pSubClass, parameter_pCurrent_subClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_subClass";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","current_class","subClass","current_subClass");
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
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_current_class = body.getOrCreateVariableByName("current_class");
          PVariable var_subClass = body.getOrCreateVariableByName("subClass");
          PVariable var_current_subClass = body.getOrCreateVariableByName("current_subClass");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_subClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_subClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_subClass, parameter_pSubClass),
             new ExportedParameter(body, var_current_subClass, parameter_pCurrent_subClass)
          ));
          // 	find current_class (class, current_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_current_class), Current_class.instance().getInternalQueryRepresentation());
          // 	find current_class (subClass, current_subClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_subClass, var_current_subClass), Current_class.instance().getInternalQueryRepresentation());
          // 	Class.subClasses (current_class, current_subClass)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class", "subClasses")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new Equality(body, var__virtual_0_, var_current_subClass);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
