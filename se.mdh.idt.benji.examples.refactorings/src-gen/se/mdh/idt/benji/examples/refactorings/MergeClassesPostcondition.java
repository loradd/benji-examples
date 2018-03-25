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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
import se.mdh.idt.benji.examples.refactorings.internal.Change_reference_type;
import se.mdh.idt.benji.examples.refactorings.internal.Create_package_class;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_attribute_difference;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_attribute_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_reference_difference;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_reference_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_package_class;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_class_attribute_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference_intersection;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_attribute_difference;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_reference_difference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Unset_reference_type;
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
public final class MergeClassesPostcondition extends BaseGeneratedEMFQuerySpecification<MergeClassesPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition pattern,
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
    
    private TraceLink f$merged_class;
    
    private String f$merged_class_name;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$left_class", "$right_class", "$merged_class", "$merged_class_name");
    
    private Match(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      this.f$package = p$package;
      this.f$left_class = p$left_class;
      this.f$right_class = p$right_class;
      this.f$merged_class = p$merged_class;
      this.f$merged_class_name = p$merged_class_name;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$left_class".equals(parameterName)) return this.f$left_class;
      if ("$right_class".equals(parameterName)) return this.f$right_class;
      if ("$merged_class".equals(parameterName)) return this.f$merged_class;
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
    
    public TraceLink get$merged_class() {
      return this.f$merged_class;
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
      if ("$merged_class".equals(parameterName) ) {
          this.f$merged_class = (TraceLink) newValue;
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
    
    public void set$merged_class(final TraceLink p$merged_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$merged_class = p$merged_class;
    }
    
    public void set$merged_class_name(final String p$merged_class_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$merged_class_name = p$merged_class_name;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MergeClassesPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$left_class, f$right_class, f$merged_class, f$merged_class_name};
    }
    
    @Override
    public MergeClassesPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$left_class, f$right_class, f$merged_class, f$merged_class_name) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$left_class\"=" + prettyPrintValue(f$left_class) + ", ");
      result.append("\"$right_class\"=" + prettyPrintValue(f$right_class) + ", ");
      result.append("\"$merged_class\"=" + prettyPrintValue(f$merged_class) + ", ");
      result.append("\"$merged_class_name\"=" + prettyPrintValue(f$merged_class_name));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$left_class, f$right_class, f$merged_class, f$merged_class_name);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MergeClassesPostcondition.Match)) {
          MergeClassesPostcondition.Match other = (MergeClassesPostcondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$left_class, other.f$left_class) && Objects.equals(f$right_class, other.f$right_class) && Objects.equals(f$merged_class, other.f$merged_class) && Objects.equals(f$merged_class_name, other.f$merged_class_name);
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
    public MergeClassesPostcondition specification() {
      return MergeClassesPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MergeClassesPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MergeClassesPostcondition.Match newMutableMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return new Mutable(p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MergeClassesPostcondition.Match newMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return new Immutable(p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name);
    }
    
    private static final class Mutable extends MergeClassesPostcondition.Match {
      Mutable(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
        super(p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MergeClassesPostcondition.Match {
      Immutable(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
        super(p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCCAR9 - Merge Classes - Postcondition
   * pattern MergeClassesPostcondition ($package : TraceLink, $left_class : TraceLink, $right_class : TraceLink, 
   * 	$merged_class : TraceLink, $merged_class_name : java String
   * ) {
   * 	find create_package_class ($package, $merged_class);
   * 	find set_class_name ($merged_class, $merged_class_name); 
   * 	count find delete_class_attribute_intersection ($left_class, $right_class, _, _) 
   * 	== count find merge_class_attribute_intersection ($left_class, $right_class, _, _, $merged_class);
   * 	count find delete_class_attribute_difference ($left_class, $right_class, _)
   * 	== count find move_class_attribute_difference ($left_class, $right_class, _, $merged_class);
   * 	count find delete_class_attribute_difference ($right_class, $left_class, _)
   * 	== count find move_class_attribute_difference ($right_class, $left_class, _, $merged_class);
   * 	count find delete_class_reference_intersection ($left_class, $right_class, _, _)
   * 	== count find merge_class_reference_intersection ($left_class, $right_class, _, _, $merged_class);
   * 	count find delete_class_reference_difference ($left_class, $right_class, _)
   * 	== count find move_class_reference_difference ($left_class, $right_class, _, $merged_class);
   * 	count find delete_class_reference_difference ($right_class, $left_class, _)
   * 	== count find move_class_reference_difference ($right_class, $left_class, _, $merged_class);
   * 	count find unset_reference_type (_, $left_class)
   * 	== count find change_reference_type (_, $left_class, $merged_class);
   * 	count find unset_reference_type (_, $right_class)
   * 	== count find change_reference_type (_, $right_class, $merged_class);
   * 	find delete_package_class ($package, $left_class);
   * 	find delete_package_class ($package, $right_class);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see MergeClassesPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<MergeClassesPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MergeClassesPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MergeClassesPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$LEFT_CLASS = 1;
    
    private final static int POSITION_$RIGHT_CLASS = 2;
    
    private final static int POSITION_$MERGED_CLASS = 3;
    
    private final static int POSITION_$MERGED_CLASS_NAME = 4;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MergeClassesPostcondition.Matcher.class);
    
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
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MergeClassesPostcondition.Match> getAllMatches(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return rawGetAllMatches(new Object[]{p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public MergeClassesPostcondition.Match getOneArbitraryMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return rawHasMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return rawCountMatches(new Object[]{p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name, final IMatchProcessor<? super MergeClassesPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name, final IMatchProcessor<? super MergeClassesPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$left_class the fixed value of pattern parameter $left_class, or null if not bound.
     * @param p$right_class the fixed value of pattern parameter $right_class, or null if not bound.
     * @param p$merged_class the fixed value of pattern parameter $merged_class, or null if not bound.
     * @param p$merged_class_name the fixed value of pattern parameter $merged_class_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MergeClassesPostcondition.Match newMatch(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return MergeClassesPostcondition.Match.newMatch(p$package, p$left_class, p$right_class, p$merged_class, p$merged_class_name);
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
    public Set<TraceLink> getAllValuesOf$package(final MergeClassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$left_class, 
      p$right_class, 
      p$merged_class, 
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
    public Set<TraceLink> getAllValuesOf$left_class(final MergeClassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$left_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$left_class(final TraceLink p$package, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return rawAccumulateAllValuesOf$left_class(new Object[]{
      p$package, 
      null, 
      p$right_class, 
      p$merged_class, 
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
    public Set<TraceLink> getAllValuesOf$right_class(final MergeClassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$right_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$right_class(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$merged_class, final String p$merged_class_name) {
      return rawAccumulateAllValuesOf$right_class(new Object[]{
      p$package, 
      p$left_class, 
      null, 
      p$merged_class, 
      p$merged_class_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$merged_class(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$MERGED_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$merged_class() {
      return rawAccumulateAllValuesOf$merged_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$merged_class(final MergeClassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$merged_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$merged_class(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final String p$merged_class_name) {
      return rawAccumulateAllValuesOf$merged_class(new Object[]{
      p$package, 
      p$left_class, 
      p$right_class, 
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
    public Set<String> getAllValuesOf$merged_class_name(final MergeClassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$merged_class_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $merged_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$merged_class_name(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class) {
      return rawAccumulateAllValuesOf$merged_class_name(new Object[]{
      p$package, 
      p$left_class, 
      p$right_class, 
      p$merged_class, 
      null
      });
    }
    
    @Override
    protected MergeClassesPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return MergeClassesPostcondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (TraceLink) t.get(POSITION_$LEFT_CLASS), (TraceLink) t.get(POSITION_$RIGHT_CLASS), (TraceLink) t.get(POSITION_$MERGED_CLASS), (String) t.get(POSITION_$MERGED_CLASS_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeClassesPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return MergeClassesPostcondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$LEFT_CLASS], (TraceLink) match[POSITION_$RIGHT_CLASS], (TraceLink) match[POSITION_$MERGED_CLASS], (String) match[POSITION_$MERGED_CLASS_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeClassesPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MergeClassesPostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$LEFT_CLASS], (TraceLink) match[POSITION_$RIGHT_CLASS], (TraceLink) match[POSITION_$MERGED_CLASS], (String) match[POSITION_$MERGED_CLASS_NAME]);
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
    public static IQuerySpecification<MergeClassesPostcondition.Matcher> querySpecification() {
      return MergeClassesPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<MergeClassesPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$left_class the value of pattern parameter $left_class in the currently processed match
     * @param p$right_class the value of pattern parameter $right_class in the currently processed match
     * @param p$merged_class the value of pattern parameter $merged_class in the currently processed match
     * @param p$merged_class_name the value of pattern parameter $merged_class_name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final TraceLink p$left_class, final TraceLink p$right_class, final TraceLink p$merged_class, final String p$merged_class_name);
    
    @Override
    public void process(final MergeClassesPostcondition.Match match) {
      process(match.get$package(), match.get$left_class(), match.get$right_class(), match.get$merged_class(), match.get$merged_class_name());
    }
  }
  
  private MergeClassesPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MergeClassesPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MergeClassesPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MergeClassesPostcondition.Matcher.on(engine);
  }
  
  @Override
  public MergeClassesPostcondition.Matcher instantiate() {
    return MergeClassesPostcondition.Matcher.create();
  }
  
  @Override
  public MergeClassesPostcondition.Match newEmptyMatch() {
    return MergeClassesPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public MergeClassesPostcondition.Match newMatch(final Object... parameters) {
    return MergeClassesPostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.trace.TraceLink) parameters[3], (java.lang.String) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition (visibility: PUBLIC, simpleName: MergeClassesPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition (visibility: PUBLIC, simpleName: MergeClassesPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MergeClassesPostcondition INSTANCE = new MergeClassesPostcondition();
    
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
    private final static MergeClassesPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$left_class = new PParameter("$left_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$right_class = new PParameter("$right_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$merged_class = new PParameter("$merged_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$merged_class_name = new PParameter("$merged_class_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$left_class, parameter_p$right_class, parameter_p$merged_class, parameter_p$merged_class_name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.MergeClassesPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$left_class","$right_class","$merged_class","$merged_class_name");
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
          PVariable var_$merged_class = body.getOrCreateVariableByName("$merged_class");
          PVariable var_$merged_class_name = body.getOrCreateVariableByName("$merged_class_name");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
          PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
          PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
          PVariable var___6_ = body.getOrCreateVariableByName("_<6>");
          PVariable var___7_ = body.getOrCreateVariableByName("_<7>");
          PVariable var___8_ = body.getOrCreateVariableByName("_<8>");
          PVariable var___9_ = body.getOrCreateVariableByName("_<9>");
          PVariable var___10_ = body.getOrCreateVariableByName("_<10>");
          PVariable var___11_ = body.getOrCreateVariableByName("_<11>");
          PVariable var___12_ = body.getOrCreateVariableByName("_<12>");
          PVariable var___13_ = body.getOrCreateVariableByName("_<13>");
          PVariable var___14_ = body.getOrCreateVariableByName("_<14>");
          PVariable var___15_ = body.getOrCreateVariableByName("_<15>");
          PVariable var___16_ = body.getOrCreateVariableByName("_<16>");
          PVariable var___17_ = body.getOrCreateVariableByName("_<17>");
          PVariable var___18_ = body.getOrCreateVariableByName("_<18>");
          PVariable var___19_ = body.getOrCreateVariableByName("_<19>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$left_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$right_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$merged_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$merged_class_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$left_class, parameter_p$left_class),
             new ExportedParameter(body, var_$right_class, parameter_p$right_class),
             new ExportedParameter(body, var_$merged_class, parameter_p$merged_class),
             new ExportedParameter(body, var_$merged_class_name, parameter_p$merged_class_name)
          ));
          // 	find create_package_class ($package, $merged_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$merged_class), Create_package_class.instance().getInternalQueryRepresentation());
          // 	find set_class_name ($merged_class, $merged_class_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$merged_class, var_$merged_class_name), Set_class_name.instance().getInternalQueryRepresentation());
          //  	count find delete_class_attribute_intersection ($left_class, $right_class, _, _) 	== count find merge_class_attribute_intersection ($left_class, $right_class, _, _, $merged_class)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___0_, var___1_), Delete_class_attribute_intersection.instance().getInternalQueryRepresentation(), var__virtual_0_);
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___2_, var___3_, var_$merged_class), Merge_class_attribute_intersection.instance().getInternalQueryRepresentation(), var__virtual_1_);
          new Equality(body, var__virtual_0_, var__virtual_1_);
          // 	count find delete_class_attribute_difference ($left_class, $right_class, _)	== count find move_class_attribute_difference ($left_class, $right_class, _, $merged_class)
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___4_), Delete_class_attribute_difference.instance().getInternalQueryRepresentation(), var__virtual_2_);
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___5_, var_$merged_class), Move_class_attribute_difference.instance().getInternalQueryRepresentation(), var__virtual_3_);
          new Equality(body, var__virtual_2_, var__virtual_3_);
          // 	count find delete_class_attribute_difference ($right_class, $left_class, _)	== count find move_class_attribute_difference ($right_class, $left_class, _, $merged_class)
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$right_class, var_$left_class, var___6_), Delete_class_attribute_difference.instance().getInternalQueryRepresentation(), var__virtual_4_);
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$right_class, var_$left_class, var___7_, var_$merged_class), Move_class_attribute_difference.instance().getInternalQueryRepresentation(), var__virtual_5_);
          new Equality(body, var__virtual_4_, var__virtual_5_);
          // 	count find delete_class_reference_intersection ($left_class, $right_class, _, _)	== count find merge_class_reference_intersection ($left_class, $right_class, _, _, $merged_class)
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___8_, var___9_), Delete_class_reference_intersection.instance().getInternalQueryRepresentation(), var__virtual_6_);
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___10_, var___11_, var_$merged_class), Merge_class_reference_intersection.instance().getInternalQueryRepresentation(), var__virtual_7_);
          new Equality(body, var__virtual_6_, var__virtual_7_);
          // 	count find delete_class_reference_difference ($left_class, $right_class, _)	== count find move_class_reference_difference ($left_class, $right_class, _, $merged_class)
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___12_), Delete_class_reference_difference.instance().getInternalQueryRepresentation(), var__virtual_8_);
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$left_class, var_$right_class, var___13_, var_$merged_class), Move_class_reference_difference.instance().getInternalQueryRepresentation(), var__virtual_9_);
          new Equality(body, var__virtual_8_, var__virtual_9_);
          // 	count find delete_class_reference_difference ($right_class, $left_class, _)	== count find move_class_reference_difference ($right_class, $left_class, _, $merged_class)
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$right_class, var_$left_class, var___14_), Delete_class_reference_difference.instance().getInternalQueryRepresentation(), var__virtual_10_);
          PVariable var__virtual_11_ = body.getOrCreateVariableByName(".virtual{11}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$right_class, var_$left_class, var___15_, var_$merged_class), Move_class_reference_difference.instance().getInternalQueryRepresentation(), var__virtual_11_);
          new Equality(body, var__virtual_10_, var__virtual_11_);
          // 	count find unset_reference_type (_, $left_class)	== count find change_reference_type (_, $left_class, $merged_class)
          PVariable var__virtual_12_ = body.getOrCreateVariableByName(".virtual{12}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___16_, var_$left_class), Unset_reference_type.instance().getInternalQueryRepresentation(), var__virtual_12_);
          PVariable var__virtual_13_ = body.getOrCreateVariableByName(".virtual{13}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___17_, var_$left_class, var_$merged_class), Change_reference_type.instance().getInternalQueryRepresentation(), var__virtual_13_);
          new Equality(body, var__virtual_12_, var__virtual_13_);
          // 	count find unset_reference_type (_, $right_class)	== count find change_reference_type (_, $right_class, $merged_class)
          PVariable var__virtual_14_ = body.getOrCreateVariableByName(".virtual{14}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___18_, var_$right_class), Unset_reference_type.instance().getInternalQueryRepresentation(), var__virtual_14_);
          PVariable var__virtual_15_ = body.getOrCreateVariableByName(".virtual{15}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___19_, var_$right_class, var_$merged_class), Change_reference_type.instance().getInternalQueryRepresentation(), var__virtual_15_);
          new Equality(body, var__virtual_14_, var__virtual_15_);
          // 	find delete_package_class ($package, $left_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$left_class), Delete_package_class.instance().getInternalQueryRepresentation());
          // 	find delete_package_class ($package, $right_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$right_class), Delete_package_class.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
