/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/MergeMetaclasses.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_attribute;
import se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference_typed;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_package_class;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class MergeMetaclassesPostcondition extends BaseGeneratedEMFQuerySpecification<MergeMetaclassesPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_left_metaclass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_right_metaclass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_merged_metaclass;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_left_metaclass", "initial_right_metaclass", "current_merged_metaclass");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_left_metaclass = pInitial_left_metaclass;
      this.fInitial_right_metaclass = pInitial_right_metaclass;
      this.fCurrent_merged_metaclass = pCurrent_merged_metaclass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_left_metaclass".equals(parameterName)) return this.fInitial_left_metaclass;
      if ("initial_right_metaclass".equals(parameterName)) return this.fInitial_right_metaclass;
      if ("current_merged_metaclass".equals(parameterName)) return this.fCurrent_merged_metaclass;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_left_metaclass() {
      return this.fInitial_left_metaclass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_right_metaclass() {
      return this.fInitial_right_metaclass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_merged_metaclass() {
      return this.fCurrent_merged_metaclass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_package".equals(parameterName) ) {
          this.fInitial_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("initial_left_metaclass".equals(parameterName) ) {
          this.fInitial_left_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_right_metaclass".equals(parameterName) ) {
          this.fInitial_right_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_merged_metaclass".equals(parameterName) ) {
          this.fCurrent_merged_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_package = pInitial_package;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    public void setInitial_left_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_left_metaclass = pInitial_left_metaclass;
    }
    
    public void setInitial_right_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_right_metaclass = pInitial_right_metaclass;
    }
    
    public void setCurrent_merged_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_merged_metaclass = pCurrent_merged_metaclass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MergeMetaclassesPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_left_metaclass, fInitial_right_metaclass, fCurrent_merged_metaclass};
    }
    
    @Override
    public MergeMetaclassesPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_left_metaclass, fInitial_right_metaclass, fCurrent_merged_metaclass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_left_metaclass\"=" + prettyPrintValue(fInitial_left_metaclass) + ", ");
      result.append("\"initial_right_metaclass\"=" + prettyPrintValue(fInitial_right_metaclass) + ", ");
      result.append("\"current_merged_metaclass\"=" + prettyPrintValue(fCurrent_merged_metaclass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_left_metaclass, fInitial_right_metaclass, fCurrent_merged_metaclass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MergeMetaclassesPostcondition.Match)) {
          MergeMetaclassesPostcondition.Match other = (MergeMetaclassesPostcondition.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_left_metaclass, other.fInitial_left_metaclass) && Objects.equals(fInitial_right_metaclass, other.fInitial_right_metaclass) && Objects.equals(fCurrent_merged_metaclass, other.fCurrent_merged_metaclass);
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
    public MergeMetaclassesPostcondition specification() {
      return MergeMetaclassesPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MergeMetaclassesPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MergeMetaclassesPostcondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MergeMetaclassesPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass);
    }
    
    private static final class Mutable extends MergeMetaclassesPostcondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
        super(pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MergeMetaclassesPostcondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
        super(pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCCAR9 - Merge Metaclasses - Postcondition
   * pattern MergeMetaclassesPostcondition (initial_package : Package, current_package : Package, initial_left_metaclass : Class, initial_right_metaclass : Class, current_merged_metaclass : Class) {
   * 	find removed_package_class (initial_package, current_package, initial_left_metaclass); 
   * 	find removed_package_class (initial_package, current_package, initial_right_metaclass); 
   * 	find added_package_class (initial_package, current_package, current_merged_metaclass); 
   * 	// attributes
   * 	count find class_attribute (current_merged_metaclass, _) == merged_attributes; 
   * 	count find common_class_attribute (initial_left_metaclass, initial_right_metaclass, _, _) == common_attributes; 
   * 	count find common_class_attribute (initial_left_metaclass, current_merged_metaclass, _, _) == left_attributes; 
   * 	count find common_class_attribute (initial_right_metaclass, current_merged_metaclass, _, _) == right_attributes;
   * 	check (merged_attributes == left_attributes + right_attributes - common_attributes);  
   * 	// references - out
   * 	count find class_reference (current_merged_metaclass, _) == merged_references_out; 
   * 	count find common_class_reference (initial_left_metaclass, initial_right_metaclass, _, _) == common_references_out; 
   * 	count find common_class_reference (initial_left_metaclass, current_merged_metaclass, _, _) == left_references_out; 
   * 	count find common_class_reference (initial_right_metaclass, current_merged_metaclass, _, _) == right_references_out; 
   * 	check (merged_references_out == left_references_out + right_references_out - common_references_out); 
   * 	// references - in
   * 	count find class_reference_typed (_, _, initial_left_metaclass) == left_references_in; 
   * 	count find class_reference_typed (_, _, initial_right_metaclass) == right_references_in; 
   * 	count find class_reference_typed (_, _, current_merged_metaclass) == merged_references_in; 
   * 	check (merged_references_in == left_references_in + right_references_in); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see MergeMetaclassesPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<MergeMetaclassesPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MergeMetaclassesPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MergeMetaclassesPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_LEFT_METACLASS = 2;
    
    private final static int POSITION_INITIAL_RIGHT_METACLASS = 3;
    
    private final static int POSITION_CURRENT_MERGED_METACLASS = 4;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MergeMetaclassesPostcondition.Matcher.class);
    
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
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MergeMetaclassesPostcondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public MergeMetaclassesPostcondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass, final IMatchProcessor<? super MergeMetaclassesPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass, final IMatchProcessor<? super MergeMetaclassesPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_merged_metaclass the fixed value of pattern parameter current_merged_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MergeMetaclassesPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return MergeMetaclassesPostcondition.Match.newMatch(pInitial_package, pCurrent_package, pInitial_left_metaclass, pInitial_right_metaclass, pCurrent_merged_metaclass);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final MergeMetaclassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_left_metaclass, 
      pInitial_right_metaclass, 
      pCurrent_merged_metaclass
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final MergeMetaclassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_left_metaclass, 
      pInitial_right_metaclass, 
      pCurrent_merged_metaclass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_left_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_LEFT_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_left_metaclass() {
      return rawAccumulateAllValuesOfinitial_left_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_left_metaclass(final MergeMetaclassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_left_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_left_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawAccumulateAllValuesOfinitial_left_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pInitial_right_metaclass, 
      pCurrent_merged_metaclass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_right_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_RIGHT_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_right_metaclass() {
      return rawAccumulateAllValuesOfinitial_right_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_right_metaclass(final MergeMetaclassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_right_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_right_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass) {
      return rawAccumulateAllValuesOfinitial_right_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_left_metaclass, 
      null, 
      pCurrent_merged_metaclass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_merged_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_merged_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_MERGED_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_merged_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_merged_metaclass() {
      return rawAccumulateAllValuesOfcurrent_merged_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_merged_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_merged_metaclass(final MergeMetaclassesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_merged_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_merged_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_merged_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass) {
      return rawAccumulateAllValuesOfcurrent_merged_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_left_metaclass, 
      pInitial_right_metaclass, 
      null
      });
    }
    
    @Override
    protected MergeMetaclassesPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return MergeMetaclassesPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_LEFT_METACLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_RIGHT_METACLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_MERGED_METACLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeMetaclassesPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return MergeMetaclassesPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_LEFT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_RIGHT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_MERGED_METACLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeMetaclassesPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MergeMetaclassesPostcondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_LEFT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_RIGHT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_MERGED_METACLASS]);
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
    public static IQuerySpecification<MergeMetaclassesPostcondition.Matcher> querySpecification() {
      return MergeMetaclassesPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<MergeMetaclassesPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_left_metaclass the value of pattern parameter initial_left_metaclass in the currently processed match
     * @param pInitial_right_metaclass the value of pattern parameter initial_right_metaclass in the currently processed match
     * @param pCurrent_merged_metaclass the value of pattern parameter current_merged_metaclass in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_merged_metaclass);
    
    @Override
    public void process(final MergeMetaclassesPostcondition.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_left_metaclass(), match.getInitial_right_metaclass(), match.getCurrent_merged_metaclass());
    }
  }
  
  private MergeMetaclassesPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MergeMetaclassesPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MergeMetaclassesPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MergeMetaclassesPostcondition.Matcher.on(engine);
  }
  
  @Override
  public MergeMetaclassesPostcondition.Matcher instantiate() {
    return MergeMetaclassesPostcondition.Matcher.create();
  }
  
  @Override
  public MergeMetaclassesPostcondition.Match newEmptyMatch() {
    return MergeMetaclassesPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public MergeMetaclassesPostcondition.Match newMatch(final Object... parameters) {
    return MergeMetaclassesPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition (visibility: PUBLIC, simpleName: MergeMetaclassesPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition (visibility: PUBLIC, simpleName: MergeMetaclassesPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MergeMetaclassesPostcondition INSTANCE = new MergeMetaclassesPostcondition();
    
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
    private final static MergeMetaclassesPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_left_metaclass = new PParameter("initial_left_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_right_metaclass = new PParameter("initial_right_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_merged_metaclass = new PParameter("current_merged_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_left_metaclass, parameter_pInitial_right_metaclass, parameter_pCurrent_merged_metaclass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_left_metaclass","initial_right_metaclass","current_merged_metaclass");
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
          PVariable var_initial_package = body.getOrCreateVariableByName("initial_package");
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          PVariable var_initial_left_metaclass = body.getOrCreateVariableByName("initial_left_metaclass");
          PVariable var_initial_right_metaclass = body.getOrCreateVariableByName("initial_right_metaclass");
          PVariable var_current_merged_metaclass = body.getOrCreateVariableByName("current_merged_metaclass");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_merged_attributes = body.getOrCreateVariableByName("merged_attributes");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var___2_ = body.getOrCreateVariableByName("_<2>");
          PVariable var_common_attributes = body.getOrCreateVariableByName("common_attributes");
          PVariable var___3_ = body.getOrCreateVariableByName("_<3>");
          PVariable var___4_ = body.getOrCreateVariableByName("_<4>");
          PVariable var_left_attributes = body.getOrCreateVariableByName("left_attributes");
          PVariable var___5_ = body.getOrCreateVariableByName("_<5>");
          PVariable var___6_ = body.getOrCreateVariableByName("_<6>");
          PVariable var_right_attributes = body.getOrCreateVariableByName("right_attributes");
          PVariable var___7_ = body.getOrCreateVariableByName("_<7>");
          PVariable var_merged_references_out = body.getOrCreateVariableByName("merged_references_out");
          PVariable var___8_ = body.getOrCreateVariableByName("_<8>");
          PVariable var___9_ = body.getOrCreateVariableByName("_<9>");
          PVariable var_common_references_out = body.getOrCreateVariableByName("common_references_out");
          PVariable var___10_ = body.getOrCreateVariableByName("_<10>");
          PVariable var___11_ = body.getOrCreateVariableByName("_<11>");
          PVariable var_left_references_out = body.getOrCreateVariableByName("left_references_out");
          PVariable var___12_ = body.getOrCreateVariableByName("_<12>");
          PVariable var___13_ = body.getOrCreateVariableByName("_<13>");
          PVariable var_right_references_out = body.getOrCreateVariableByName("right_references_out");
          PVariable var___14_ = body.getOrCreateVariableByName("_<14>");
          PVariable var___15_ = body.getOrCreateVariableByName("_<15>");
          PVariable var_left_references_in = body.getOrCreateVariableByName("left_references_in");
          PVariable var___16_ = body.getOrCreateVariableByName("_<16>");
          PVariable var___17_ = body.getOrCreateVariableByName("_<17>");
          PVariable var_right_references_in = body.getOrCreateVariableByName("right_references_in");
          PVariable var___18_ = body.getOrCreateVariableByName("_<18>");
          PVariable var___19_ = body.getOrCreateVariableByName("_<19>");
          PVariable var_merged_references_in = body.getOrCreateVariableByName("merged_references_in");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_left_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_right_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_merged_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_left_metaclass, parameter_pInitial_left_metaclass),
             new ExportedParameter(body, var_initial_right_metaclass, parameter_pInitial_right_metaclass),
             new ExportedParameter(body, var_current_merged_metaclass, parameter_pCurrent_merged_metaclass)
          ));
          // 	find removed_package_class (initial_package, current_package, initial_left_metaclass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_left_metaclass), Removed_package_class.instance().getInternalQueryRepresentation());
          //  	find removed_package_class (initial_package, current_package, initial_right_metaclass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_right_metaclass), Removed_package_class.instance().getInternalQueryRepresentation());
          //  	find added_package_class (initial_package, current_package, current_merged_metaclass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_current_merged_metaclass), Added_package_class.instance().getInternalQueryRepresentation());
          //  	// attributes	count find class_attribute (current_merged_metaclass, _) == merged_attributes
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_current_merged_metaclass, var___0_), Class_attribute.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var__virtual_0_, var_merged_attributes);
          //  	count find common_class_attribute (initial_left_metaclass, initial_right_metaclass, _, _) == common_attributes
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_initial_left_metaclass, var_initial_right_metaclass, var___1_, var___2_), Common_class_attribute.instance().getInternalQueryRepresentation(), var__virtual_1_);
          new Equality(body, var__virtual_1_, var_common_attributes);
          //  	count find common_class_attribute (initial_left_metaclass, current_merged_metaclass, _, _) == left_attributes
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_initial_left_metaclass, var_current_merged_metaclass, var___3_, var___4_), Common_class_attribute.instance().getInternalQueryRepresentation(), var__virtual_2_);
          new Equality(body, var__virtual_2_, var_left_attributes);
          //  	count find common_class_attribute (initial_right_metaclass, current_merged_metaclass, _, _) == right_attributes
          PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_initial_right_metaclass, var_current_merged_metaclass, var___5_, var___6_), Common_class_attribute.instance().getInternalQueryRepresentation(), var__virtual_3_);
          new Equality(body, var__virtual_3_, var_right_attributes);
          // 	check (merged_attributes == left_attributes + right_attributes - common_attributes)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern MergeMetaclassesPostcondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("common_attributes", "left_attributes", "merged_attributes", "right_attributes");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer common_attributes = (Integer) provider.getValue("common_attributes");
                  Integer left_attributes = (Integer) provider.getValue("left_attributes");
                  Integer merged_attributes = (Integer) provider.getValue("merged_attributes");
                  Integer right_attributes = (Integer) provider.getValue("right_attributes");
                  return evaluateExpression_1_1(common_attributes, left_attributes, merged_attributes, right_attributes);
              }
          },  null); 
          //   	// references - out	count find class_reference (current_merged_metaclass, _) == merged_references_out
          PVariable var__virtual_4_ = body.getOrCreateVariableByName(".virtual{4}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_current_merged_metaclass, var___7_), Class_reference.instance().getInternalQueryRepresentation(), var__virtual_4_);
          new Equality(body, var__virtual_4_, var_merged_references_out);
          //  	count find common_class_reference (initial_left_metaclass, initial_right_metaclass, _, _) == common_references_out
          PVariable var__virtual_5_ = body.getOrCreateVariableByName(".virtual{5}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_initial_left_metaclass, var_initial_right_metaclass, var___8_, var___9_), Common_class_reference.instance().getInternalQueryRepresentation(), var__virtual_5_);
          new Equality(body, var__virtual_5_, var_common_references_out);
          //  	count find common_class_reference (initial_left_metaclass, current_merged_metaclass, _, _) == left_references_out
          PVariable var__virtual_6_ = body.getOrCreateVariableByName(".virtual{6}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_initial_left_metaclass, var_current_merged_metaclass, var___10_, var___11_), Common_class_reference.instance().getInternalQueryRepresentation(), var__virtual_6_);
          new Equality(body, var__virtual_6_, var_left_references_out);
          //  	count find common_class_reference (initial_right_metaclass, current_merged_metaclass, _, _) == right_references_out
          PVariable var__virtual_7_ = body.getOrCreateVariableByName(".virtual{7}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_initial_right_metaclass, var_current_merged_metaclass, var___12_, var___13_), Common_class_reference.instance().getInternalQueryRepresentation(), var__virtual_7_);
          new Equality(body, var__virtual_7_, var_right_references_out);
          //  	check (merged_references_out == left_references_out + right_references_out - common_references_out)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern MergeMetaclassesPostcondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("common_references_out", "left_references_out", "merged_references_out", "right_references_out");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer common_references_out = (Integer) provider.getValue("common_references_out");
                  Integer left_references_out = (Integer) provider.getValue("left_references_out");
                  Integer merged_references_out = (Integer) provider.getValue("merged_references_out");
                  Integer right_references_out = (Integer) provider.getValue("right_references_out");
                  return evaluateExpression_1_2(common_references_out, left_references_out, merged_references_out, right_references_out);
              }
          },  null); 
          //  	// references - in	count find class_reference_typed (_, _, initial_left_metaclass) == left_references_in
          PVariable var__virtual_8_ = body.getOrCreateVariableByName(".virtual{8}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___14_, var___15_, var_initial_left_metaclass), Class_reference_typed.instance().getInternalQueryRepresentation(), var__virtual_8_);
          new Equality(body, var__virtual_8_, var_left_references_in);
          //  	count find class_reference_typed (_, _, initial_right_metaclass) == right_references_in
          PVariable var__virtual_9_ = body.getOrCreateVariableByName(".virtual{9}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___16_, var___17_, var_initial_right_metaclass), Class_reference_typed.instance().getInternalQueryRepresentation(), var__virtual_9_);
          new Equality(body, var__virtual_9_, var_right_references_in);
          //  	count find class_reference_typed (_, _, current_merged_metaclass) == merged_references_in
          PVariable var__virtual_10_ = body.getOrCreateVariableByName(".virtual{10}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var___18_, var___19_, var_current_merged_metaclass), Class_reference_typed.instance().getInternalQueryRepresentation(), var__virtual_10_);
          new Equality(body, var__virtual_10_, var_merged_references_in);
          //  	check (merged_references_in == left_references_in + right_references_in)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern MergeMetaclassesPostcondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("left_references_in", "merged_references_in", "right_references_in");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer left_references_in = (Integer) provider.getValue("left_references_in");
                  Integer merged_references_in = (Integer) provider.getValue("merged_references_in");
                  Integer right_references_in = (Integer) provider.getValue("right_references_in");
                  return evaluateExpression_1_3(left_references_in, merged_references_in, right_references_in);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer common_attributes, final Integer left_attributes, final Integer merged_attributes, final Integer right_attributes) {
    return ((merged_attributes).intValue() == (((left_attributes).intValue() + (right_attributes).intValue()) - (common_attributes).intValue()));
  }
  
  private static boolean evaluateExpression_1_2(final Integer common_references_out, final Integer left_references_out, final Integer merged_references_out, final Integer right_references_out) {
    return ((merged_references_out).intValue() == (((left_references_out).intValue() + (right_references_out).intValue()) - (common_references_out).intValue()));
  }
  
  private static boolean evaluateExpression_1_3(final Integer left_references_in, final Integer merged_references_in, final Integer right_references_in) {
    return ((merged_references_in).intValue() == ((left_references_in).intValue() + (right_references_in).intValue()));
  }
}
