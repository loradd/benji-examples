/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.internal.Create_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_class;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:20+0200")
public final class MergeClassesPrecondition extends BaseGeneratedEMFQuerySpecification<MergeClassesPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition pattern,
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
    private TraceLink f$package;
    
    private TraceLink f$left_class;
    
    private TraceLink f$right_class;
    
    private String f$merged_class_name;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$left_class", "$right_class", "$merged_class_name");
    
    private Match(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      this.f$package = p$package;
      this.f$left_class = p$left_class;
      this.f$right_class = p$right_class;
      this.f$merged_class_name = p$merged_class_name;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$left_class".equals(parameterName)) return this.f$left_class;
      if ("$right_class".equals(parameterName)) return this.f$right_class;
      if ("$merged_class_name".equals(parameterName)) return this.f$merged_class_name;
      return null;
    }
    
    public TraceLink get$package() {
      return this.f$package;
    }
    
    public TraceLink get$left_class() {
      return this.f$left_class;
    }
    
    public TraceLink get$right_class() {
      return this.f$right_class;
    }
    
    public String get$merged_class_name() {
      return this.f$merged_class_name;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (TraceLink) newValue;
          return true;
      }
      if ("$left_class".equals(parameterName) ) {
          this.f$left_class = (TraceLink) newValue;
          return true;
      }
      if ("$right_class".equals(parameterName) ) {
          this.f$right_class = (TraceLink) newValue;
          return true;
      }
      if ("$merged_class_name".equals(parameterName) ) {
          this.f$merged_class_name = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final TraceLink p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    public void set$left_class(final TraceLink p$left_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$left_class = p$left_class;
    }
    
    public void set$right_class(final TraceLink p$right_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$right_class = p$right_class;
    }
    
    public void set$merged_class_name(final String p$merged_class_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$merged_class_name = p$merged_class_name;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MergeClassesPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$left_class, f$right_class, f$merged_class_name};
    }
    
    @Override
    public MergeClassesPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$left_class, f$right_class, f$merged_class_name) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$left_class\"=" + prettyPrintValue(f$left_class) + ", ");
      result.append("\"$right_class\"=" + prettyPrintValue(f$right_class) + ", ");
      result.append("\"$merged_class_name\"=" + prettyPrintValue(f$merged_class_name));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$left_class, f$right_class, f$merged_class_name);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MergeClassesPrecondition.Match)) {
          MergeClassesPrecondition.Match other = (MergeClassesPrecondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$left_class, other.f$left_class) && Objects.equals(f$right_class, other.f$right_class) && Objects.equals(f$merged_class_name, other.f$merged_class_name);
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
    public MergeClassesPrecondition specification() {
      return MergeClassesPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MergeClassesPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MergeClassesPrecondition.Match newMutableMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return new Mutable(p$package, p$left_class, p$right_class, p$merged_class_name);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MergeClassesPrecondition.Match newMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return new Immutable(p$package, p$left_class, p$right_class, p$merged_class_name);
    }
    
    private static final class Mutable extends MergeClassesPrecondition.Match {
      Mutable(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
        super(p$package, p$left_class, p$right_class, p$merged_class_name);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MergeClassesPrecondition.Match {
      Immutable(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
        super(p$package, p$left_class, p$right_class, p$merged_class_name);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCCAR9 - Merge Classes - Precondition
   * pattern MergeClassesPrecondition ($package : TraceLink, $left_class : TraceLink, $right_class : TraceLink, $merged_class_name : java String) {
   * 	find get_package_class ($package, $left_class);
   * 	find get_package_class ($package, $right_class);
   * 	$right_class != $left_class;
   * 	$merged_class_index == count find create_package_class($package, _); 
   * 	$merged_class_name == eval("merged_class_" + $merged_class_index); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see MergeClassesPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<MergeClassesPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MergeClassesPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MergeClassesPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$LEFT_CLASS = 1;
    
    private final static int POSITION_$RIGHT_CLASS = 2;
    
    private final static int POSITION_$MERGED_CLASS_NAME = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MergeClassesPrecondition.Matcher.class);
    
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
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MergeClassesPrecondition.Match> getAllMatches(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return rawGetAllMatches(new Object[]{p$package, p$left_class, p$right_class, p$merged_class_name});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public MergeClassesPrecondition.Match getOneArbitraryMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class_name});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return rawHasMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class_name});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return rawCountMatches(new Object[]{p$package, p$left_class, p$right_class, p$merged_class_name});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name, final IMatchProcessor<? super MergeClassesPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class_name}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name, final IMatchProcessor<? super MergeClassesPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class_name}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MergeClassesPrecondition.Match newMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return MergeClassesPrecondition.Match.newMatch(p$package, p$left_class, p$right_class, p$merged_class_name);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$package(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package() {
      return rawAccumulateAllValuesOf$package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final MergeClassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$left_class, 
      p$right_class, 
      p$merged_class_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$left_class(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$LEFT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$left_class() {
      return rawAccumulateAllValuesOf$left_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$left_class(final MergeClassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$left_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$left_class(final TraceLink p$package, final TraceLink p$right_class, final String p$merged_class_name) {
      return rawAccumulateAllValuesOf$left_class(new Object[]{
      p$package, 
      null, 
      p$right_class, 
      p$merged_class_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$right_class(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$RIGHT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$right_class() {
      return rawAccumulateAllValuesOf$right_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$right_class(final MergeClassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$right_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$right_class(final TraceLink p$package, final TraceLink p$left_class, final String p$merged_class_name) {
      return rawAccumulateAllValuesOf$right_class(new Object[]{
      p$package, 
      p$left_class, 
      null, 
      p$merged_class_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$merged_class_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$MERGED_CLASS_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$merged_class_name() {
      return rawAccumulateAllValuesOf$merged_class_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$merged_class_name(final MergeClassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$merged_class_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$merged_class_name(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class) {
      return rawAccumulateAllValuesOf$merged_class_name(new Object[]{
      p$package, 
      p$left_class, 
      p$right_class, 
      null
      });
    }
    
    @Override
    protected MergeClassesPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return MergeClassesPrecondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (TraceLink) t.get(POSITION_$LEFT_CLASS), (TraceLink) t.get(POSITION_$RIGHT_CLASS), (String) t.get(POSITION_$MERGED_CLASS_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeClassesPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return MergeClassesPrecondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$LEFT_CLASS], (TraceLink) match[POSITION_$RIGHT_CLASS], (String) match[POSITION_$MERGED_CLASS_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeClassesPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MergeClassesPrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$LEFT_CLASS], (TraceLink) match[POSITION_$RIGHT_CLASS], (String) match[POSITION_$MERGED_CLASS_NAME]);
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
    public static IQuerySpecification<MergeClassesPrecondition.Matcher> querySpecification() {
      return MergeClassesPrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<MergeClassesPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$left_class the value of pattern parameter $left_class in the currently processed match
     * @param p$right_class the value of pattern parameter $right_class in the currently processed match
     * @param p$merged_class_name the value of pattern parameter $merged_class_name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name);
    
    @Override
    public void process(final MergeClassesPrecondition.Match match) {
      process(match.get$package(), match.get$left_class(), match.get$right_class(), match.get$merged_class_name());
    }
  }
  
  private MergeClassesPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MergeClassesPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MergeClassesPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MergeClassesPrecondition.Matcher.on(engine);
  }
  
  @Override
  public MergeClassesPrecondition.Matcher instantiate() {
    return MergeClassesPrecondition.Matcher.create();
  }
  
  @Override
  public MergeClassesPrecondition.Match newEmptyMatch() {
    return MergeClassesPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public MergeClassesPrecondition.Match newMatch(final Object... parameters) {
    return MergeClassesPrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (java.lang.String) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition (visibility: PUBLIC, simpleName: MergeClassesPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition (visibility: PUBLIC, simpleName: MergeClassesPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MergeClassesPrecondition INSTANCE = new MergeClassesPrecondition();
    
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
    private final static MergeClassesPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$left_class = new PParameter("$left_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$right_class = new PParameter("$right_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$merged_class_name = new PParameter("$merged_class_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$left_class, parameter_p$right_class, parameter_p$merged_class_name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.MergeClassesPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$left_class","$right_class","$merged_class_name");
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
          PVariable var_$package = body.getOrCreateVariableByName("$package");
          PVariable var_$left_class = body.getOrCreateVariableByName("$left_class");
          PVariable var_$right_class = body.getOrCreateVariableByName("$right_class");
          PVariable var_$merged_class_name = body.getOrCreateVariableByName("$merged_class_name");
          PVariable var_$merged_class_index = body.getOrCreateVariableByName("$merged_class_index");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$left_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$right_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$merged_class_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$left_class, parameter_p$left_class),
             new ExportedParameter(body, var_$right_class, parameter_p$right_class),
             new ExportedParameter(body, var_$merged_class_name, parameter_p$merged_class_name)
          ));
          // 	find get_package_class ($package, $left_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$left_class), Get_package_class.instance().getInternalQueryRepresentation());
          // 	find get_package_class ($package, $right_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$right_class), Get_package_class.instance().getInternalQueryRepresentation());
          // 	$right_class != $left_class
          new Inequality(body, var_$right_class, var_$left_class);
          // 	$merged_class_index == count find create_package_class($package, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$package, var___0_), Create_package_class.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_$merged_class_index, var__virtual_0_);
          //  	$merged_class_name == eval("merged_class_" + $merged_class_index)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern MergeClassesPrecondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("$merged_class_index");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer $merged_class_index = (Integer) provider.getValue("$merged_class_index");
                  return evaluateExpression_1_1($merged_class_index);
              }
          },  var__virtual_1_ ); 
          new Equality(body, var_$merged_class_name, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final Integer $merged_class_index) {
    return ("merged_class_" + $merged_class_index);
  }
}
