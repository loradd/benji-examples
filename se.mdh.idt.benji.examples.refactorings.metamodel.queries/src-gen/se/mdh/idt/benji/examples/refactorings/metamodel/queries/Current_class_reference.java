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
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_structuralFeature;
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
public final class Current_class_reference extends BaseGeneratedEMFQuerySpecification<Current_class_reference.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_reference pattern,
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
    
    private TraceLink fReference;
    
    private Reference fCurrent_reference;
    
    private static List<String> parameterNames = makeImmutableList("class", "current_class", "reference", "current_reference");
    
    private Match(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      this.fClass = pClass;
      this.fCurrent_class = pCurrent_class;
      this.fReference = pReference;
      this.fCurrent_reference = pCurrent_reference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("reference".equals(parameterName)) return this.fReference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      return null;
    }
    
    public TraceLink getValueOfClass() {
      return this.fClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public TraceLink getReference() {
      return this.fReference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
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
      if ("reference".equals(parameterName) ) {
          this.fReference = (TraceLink) newValue;
          return true;
      }
      if ("current_reference".equals(parameterName) ) {
          this.fCurrent_reference = (Reference) newValue;
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
    
    public void setReference(final TraceLink pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    public void setCurrent_reference(final Reference pCurrent_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_reference = pCurrent_reference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_reference";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_class_reference.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass, fCurrent_class, fReference, fCurrent_reference};
    }
    
    @Override
    public Current_class_reference.Match toImmutable() {
      return isMutable() ? newMatch(fClass, fCurrent_class, fReference, fCurrent_reference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClass, fCurrent_class, fReference, fCurrent_reference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_class_reference.Match)) {
          Current_class_reference.Match other = (Current_class_reference.Match) obj;
          return Objects.equals(fClass, other.fClass) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fReference, other.fReference) && Objects.equals(fCurrent_reference, other.fCurrent_reference);
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
    public Current_class_reference specification() {
      return Current_class_reference.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_class_reference.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_class_reference.Match newMutableMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return new Mutable(pClass, pCurrent_class, pReference, pCurrent_reference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_class_reference.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return new Immutable(pClass, pCurrent_class, pReference, pCurrent_reference);
    }
    
    private static final class Mutable extends Current_class_reference.Match {
      Mutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
        super(pClass, pCurrent_class, pReference, pCurrent_reference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_class_reference.Match {
      Immutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
        super(pClass, pCurrent_class, pReference, pCurrent_reference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_reference pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // class - reference - current
   * pattern current_class_reference (class : TraceLink, current_class : Class, reference : TraceLink, current_reference : Reference) {
   * 	find current_class_structuralFeature (class, current_class, reference, current_reference);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_class_reference
   * 
   */
  public static class Matcher extends BaseMatcher<Current_class_reference.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_class_reference.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_class_reference.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static int POSITION_CURRENT_CLASS = 1;
    
    private final static int POSITION_REFERENCE = 2;
    
    private final static int POSITION_CURRENT_REFERENCE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_class_reference.Matcher.class);
    
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
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_class_reference.Match> getAllMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return rawGetAllMatches(new Object[]{pClass, pCurrent_class, pReference, pCurrent_reference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_class_reference.Match getOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return rawGetOneArbitraryMatch(new Object[]{pClass, pCurrent_class, pReference, pCurrent_reference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return rawHasMatch(new Object[]{pClass, pCurrent_class, pReference, pCurrent_reference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return rawCountMatches(new Object[]{pClass, pCurrent_class, pReference, pCurrent_reference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference, final IMatchProcessor<? super Current_class_reference.Match> processor) {
      rawForEachMatch(new Object[]{pClass, pCurrent_class, pReference, pCurrent_reference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference, final IMatchProcessor<? super Current_class_reference.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass, pCurrent_class, pReference, pCurrent_reference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_class_reference.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return Current_class_reference.Match.newMatch(pClass, pCurrent_class, pReference, pCurrent_reference);
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
    public Set<TraceLink> getAllValuesOfclass(final Current_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      null, 
      pCurrent_class, 
      pReference, 
      pCurrent_reference
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final Current_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final TraceLink pClass, final TraceLink pReference, final Reference pCurrent_reference) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pClass, 
      null, 
      pReference, 
      pCurrent_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfreference(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference() {
      return rawAccumulateAllValuesOfreference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final Current_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfreference(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pCurrent_reference) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      pClass, 
      pCurrent_class, 
      null, 
      pCurrent_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfcurrent_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_CURRENT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference() {
      return rawAccumulateAllValuesOfcurrent_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final Current_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pClass, 
      pCurrent_class, 
      pReference, 
      null
      });
    }
    
    @Override
    protected Current_class_reference.Match tupleToMatch(final Tuple t) {
      try {
          return Current_class_reference.Match.newMatch((TraceLink) t.get(POSITION_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (TraceLink) t.get(POSITION_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_class_reference.Match arrayToMatch(final Object[] match) {
      try {
          return Current_class_reference.Match.newMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_class_reference.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_class_reference.Match.newMutableMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (TraceLink) match[POSITION_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE]);
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
    public static IQuerySpecification<Current_class_reference.Matcher> querySpecification() {
      return Current_class_reference.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_reference pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_class_reference.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final TraceLink pReference, final Reference pCurrent_reference);
    
    @Override
    public void process(final Current_class_reference.Match match) {
      process(match.getValueOfClass(), match.getCurrent_class(), match.getReference(), match.getCurrent_reference());
    }
  }
  
  private Current_class_reference() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_class_reference instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_class_reference.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_class_reference.Matcher.on(engine);
  }
  
  @Override
  public Current_class_reference.Matcher instantiate() {
    return Current_class_reference.Matcher.create();
  }
  
  @Override
  public Current_class_reference.Match newEmptyMatch() {
    return Current_class_reference.Match.newEmptyMatch();
  }
  
  @Override
  public Current_class_reference.Match newMatch(final Object... parameters) {
    return Current_class_reference.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_reference (visibility: PUBLIC, simpleName: Current_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_reference (visibility: PUBLIC, simpleName: Current_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_class_reference INSTANCE = new Current_class_reference();
    
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
    private final static Current_class_reference.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pCurrent_class, parameter_pReference, parameter_pCurrent_reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_class_reference";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","current_class","reference","current_reference");
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
          PVariable var_reference = body.getOrCreateVariableByName("reference");
          PVariable var_current_reference = body.getOrCreateVariableByName("current_reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference)
          ));
          // 	find current_class_structuralFeature (class, current_class, reference, current_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_current_class, var_reference, var_current_reference), Current_class_structuralFeature.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
