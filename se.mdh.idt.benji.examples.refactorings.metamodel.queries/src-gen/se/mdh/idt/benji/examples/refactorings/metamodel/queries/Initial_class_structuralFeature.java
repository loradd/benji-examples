/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/ClassQueries.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class Initial_class_structuralFeature extends BaseGeneratedEMFQuerySpecification<Initial_class_structuralFeature.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_class_structuralFeature pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_class;
    
    private TraceLink fStructuralFeature;
    
    private StructuralFeature fInitial_structuralFeature;
    
    private static List<String> parameterNames = makeImmutableList("class", "initial_class", "structuralFeature", "initial_structuralFeature");
    
    private Match(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      this.fClass = pClass;
      this.fInitial_class = pInitial_class;
      this.fStructuralFeature = pStructuralFeature;
      this.fInitial_structuralFeature = pInitial_structuralFeature;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      if ("structuralFeature".equals(parameterName)) return this.fStructuralFeature;
      if ("initial_structuralFeature".equals(parameterName)) return this.fInitial_structuralFeature;
      return null;
    }
    
    public TraceLink getValueOfClass() {
      return this.fClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_class() {
      return this.fInitial_class;
    }
    
    public TraceLink getStructuralFeature() {
      return this.fStructuralFeature;
    }
    
    public StructuralFeature getInitial_structuralFeature() {
      return this.fInitial_structuralFeature;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("class".equals(parameterName) ) {
          this.fClass = (TraceLink) newValue;
          return true;
      }
      if ("initial_class".equals(parameterName) ) {
          this.fInitial_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("structuralFeature".equals(parameterName) ) {
          this.fStructuralFeature = (TraceLink) newValue;
          return true;
      }
      if ("initial_structuralFeature".equals(parameterName) ) {
          this.fInitial_structuralFeature = (StructuralFeature) newValue;
          return true;
      }
      return false;
    }
    
    public void setClass(final TraceLink pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setInitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_class = pInitial_class;
    }
    
    public void setStructuralFeature(final TraceLink pStructuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStructuralFeature = pStructuralFeature;
    }
    
    public void setInitial_structuralFeature(final StructuralFeature pInitial_structuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_structuralFeature = pInitial_structuralFeature;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_class_structuralFeature";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_class_structuralFeature.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass, fInitial_class, fStructuralFeature, fInitial_structuralFeature};
    }
    
    @Override
    public Initial_class_structuralFeature.Match toImmutable() {
      return isMutable() ? newMatch(fClass, fInitial_class, fStructuralFeature, fInitial_structuralFeature) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class) + ", ");
      result.append("\"structuralFeature\"=" + prettyPrintValue(fStructuralFeature) + ", ");
      result.append("\"initial_structuralFeature\"=" + prettyPrintValue(fInitial_structuralFeature));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClass, fInitial_class, fStructuralFeature, fInitial_structuralFeature);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_class_structuralFeature.Match)) {
          Initial_class_structuralFeature.Match other = (Initial_class_structuralFeature.Match) obj;
          return Objects.equals(fClass, other.fClass) && Objects.equals(fInitial_class, other.fInitial_class) && Objects.equals(fStructuralFeature, other.fStructuralFeature) && Objects.equals(fInitial_structuralFeature, other.fInitial_structuralFeature);
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
    public Initial_class_structuralFeature specification() {
      return Initial_class_structuralFeature.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_class_structuralFeature.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_class_structuralFeature.Match newMutableMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return new Mutable(pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_class_structuralFeature.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return new Immutable(pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature);
    }
    
    private static final class Mutable extends Initial_class_structuralFeature.Match {
      Mutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
        super(pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_class_structuralFeature.Match {
      Immutable(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
        super(pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_class_structuralFeature pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // class - structuralFeature - initial
   * pattern initial_class_structuralFeature (class : TraceLink, initial_class : Class, structuralFeature : TraceLink, initial_structuralFeature : StructuralFeature) {
   * 	find initial_class (class, initial_class);
   * 	find initial_structuralFeature (structuralFeature, initial_structuralFeature);
   * 	Class.structuralFeatures (initial_class, initial_structuralFeature);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_class_structuralFeature
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_class_structuralFeature.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_class_structuralFeature.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_class_structuralFeature.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static int POSITION_INITIAL_CLASS = 1;
    
    private final static int POSITION_STRUCTURALFEATURE = 2;
    
    private final static int POSITION_INITIAL_STRUCTURALFEATURE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_class_structuralFeature.Matcher.class);
    
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
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_class_structuralFeature.Match> getAllMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return rawGetAllMatches(new Object[]{pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_class_structuralFeature.Match getOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return rawGetOneArbitraryMatch(new Object[]{pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return rawHasMatch(new Object[]{pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return rawCountMatches(new Object[]{pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final IMatchProcessor<? super Initial_class_structuralFeature.Match> processor) {
      rawForEachMatch(new Object[]{pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature, final IMatchProcessor<? super Initial_class_structuralFeature.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pInitial_structuralFeature the fixed value of pattern parameter initial_structuralFeature, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_class_structuralFeature.Match newMatch(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return Initial_class_structuralFeature.Match.newMatch(pClass, pInitial_class, pStructuralFeature, pInitial_structuralFeature);
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
    public Set<TraceLink> getAllValuesOfclass(final Initial_class_structuralFeature.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      null, 
      pInitial_class, 
      pStructuralFeature, 
      pInitial_structuralFeature
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final Initial_class_structuralFeature.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final TraceLink pClass, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      pClass, 
      null, 
      pStructuralFeature, 
      pInitial_structuralFeature
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfstructuralFeature(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature() {
      return rawAccumulateAllValuesOfstructuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final Initial_class_structuralFeature.Match partialMatch) {
      return rawAccumulateAllValuesOfstructuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfstructuralFeature(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final StructuralFeature pInitial_structuralFeature) {
      return rawAccumulateAllValuesOfstructuralFeature(new Object[]{
      pClass, 
      pInitial_class, 
      null, 
      pInitial_structuralFeature
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<StructuralFeature> rawAccumulateAllValuesOfinitial_structuralFeature(final Object[] parameters) {
      Set<StructuralFeature> results = new HashSet<StructuralFeature>();
      rawAccumulateAllValues(POSITION_INITIAL_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature() {
      return rawAccumulateAllValuesOfinitial_structuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final Initial_class_structuralFeature.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfinitial_structuralFeature(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature) {
      return rawAccumulateAllValuesOfinitial_structuralFeature(new Object[]{
      pClass, 
      pInitial_class, 
      pStructuralFeature, 
      null
      });
    }
    
    @Override
    protected Initial_class_structuralFeature.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_class_structuralFeature.Match.newMatch((TraceLink) t.get(POSITION_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS), (TraceLink) t.get(POSITION_STRUCTURALFEATURE), (StructuralFeature) t.get(POSITION_INITIAL_STRUCTURALFEATURE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_class_structuralFeature.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_class_structuralFeature.Match.newMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_class_structuralFeature.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_class_structuralFeature.Match.newMutableMatch((TraceLink) match[POSITION_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (TraceLink) match[POSITION_STRUCTURALFEATURE], (StructuralFeature) match[POSITION_INITIAL_STRUCTURALFEATURE]);
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
    public static IQuerySpecification<Initial_class_structuralFeature.Matcher> querySpecification() {
      return Initial_class_structuralFeature.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_class_structuralFeature pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_class_structuralFeature.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * @param pStructuralFeature the value of pattern parameter structuralFeature in the currently processed match
     * @param pInitial_structuralFeature the value of pattern parameter initial_structuralFeature in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final TraceLink pStructuralFeature, final StructuralFeature pInitial_structuralFeature);
    
    @Override
    public void process(final Initial_class_structuralFeature.Match match) {
      process(match.getValueOfClass(), match.getInitial_class(), match.getStructuralFeature(), match.getInitial_structuralFeature());
    }
  }
  
  private Initial_class_structuralFeature() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_class_structuralFeature instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_class_structuralFeature.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_class_structuralFeature.Matcher.on(engine);
  }
  
  @Override
  public Initial_class_structuralFeature.Matcher instantiate() {
    return Initial_class_structuralFeature.Matcher.create();
  }
  
  @Override
  public Initial_class_structuralFeature.Match newEmptyMatch() {
    return Initial_class_structuralFeature.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_class_structuralFeature.Match newMatch(final Object... parameters) {
    return Initial_class_structuralFeature.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_structuralFeature (visibility: PUBLIC, simpleName: Initial_class_structuralFeature, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_structuralFeature, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_structuralFeature (visibility: PUBLIC, simpleName: Initial_class_structuralFeature, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_class_structuralFeature, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_class_structuralFeature INSTANCE = new Initial_class_structuralFeature();
    
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
    private final static Initial_class_structuralFeature.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pStructuralFeature = new PParameter("structuralFeature", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_structuralFeature = new PParameter("initial_structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pInitial_class, parameter_pStructuralFeature, parameter_pInitial_structuralFeature);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_class_structuralFeature";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","initial_class","structuralFeature","initial_structuralFeature");
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
          PVariable var_initial_class = body.getOrCreateVariableByName("initial_class");
          PVariable var_structuralFeature = body.getOrCreateVariableByName("structuralFeature");
          PVariable var_initial_structuralFeature = body.getOrCreateVariableByName("initial_structuralFeature");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_structuralFeature, parameter_pStructuralFeature),
             new ExportedParameter(body, var_initial_structuralFeature, parameter_pInitial_structuralFeature)
          ));
          // 	find initial_class (class, initial_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_initial_class), Initial_class.instance().getInternalQueryRepresentation());
          // 	find initial_structuralFeature (structuralFeature, initial_structuralFeature)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_structuralFeature, var_initial_structuralFeature), Initial_structuralFeature.instance().getInternalQueryRepresentation());
          // 	Class.structuralFeatures (initial_class, initial_structuralFeature)
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class", "structuralFeatures")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new Equality(body, var__virtual_0_, var_initial_structuralFeature);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
