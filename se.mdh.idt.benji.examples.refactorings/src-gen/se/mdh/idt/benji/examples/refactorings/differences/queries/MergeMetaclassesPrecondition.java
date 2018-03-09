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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_class;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class MergeMetaclassesPrecondition extends BaseGeneratedEMFQuerySpecification<MergeMetaclassesPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_left_metaclass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_right_metaclass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_right_metaclass;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_left_metaclass", "current_left_metaclass", "initial_right_metaclass", "current_right_metaclass");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_left_metaclass = pInitial_left_metaclass;
      this.fCurrent_left_metaclass = pCurrent_left_metaclass;
      this.fInitial_right_metaclass = pInitial_right_metaclass;
      this.fCurrent_right_metaclass = pCurrent_right_metaclass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_left_metaclass".equals(parameterName)) return this.fInitial_left_metaclass;
      if ("current_left_metaclass".equals(parameterName)) return this.fCurrent_left_metaclass;
      if ("initial_right_metaclass".equals(parameterName)) return this.fInitial_right_metaclass;
      if ("current_right_metaclass".equals(parameterName)) return this.fCurrent_right_metaclass;
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
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_left_metaclass() {
      return this.fCurrent_left_metaclass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_right_metaclass() {
      return this.fInitial_right_metaclass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_right_metaclass() {
      return this.fCurrent_right_metaclass;
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
      if ("current_left_metaclass".equals(parameterName) ) {
          this.fCurrent_left_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_right_metaclass".equals(parameterName) ) {
          this.fInitial_right_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_right_metaclass".equals(parameterName) ) {
          this.fCurrent_right_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
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
    
    public void setCurrent_left_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_left_metaclass = pCurrent_left_metaclass;
    }
    
    public void setInitial_right_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_right_metaclass = pInitial_right_metaclass;
    }
    
    public void setCurrent_right_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_right_metaclass = pCurrent_right_metaclass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MergeMetaclassesPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_left_metaclass, fCurrent_left_metaclass, fInitial_right_metaclass, fCurrent_right_metaclass};
    }
    
    @Override
    public MergeMetaclassesPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_left_metaclass, fCurrent_left_metaclass, fInitial_right_metaclass, fCurrent_right_metaclass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_left_metaclass\"=" + prettyPrintValue(fInitial_left_metaclass) + ", ");
      result.append("\"current_left_metaclass\"=" + prettyPrintValue(fCurrent_left_metaclass) + ", ");
      result.append("\"initial_right_metaclass\"=" + prettyPrintValue(fInitial_right_metaclass) + ", ");
      result.append("\"current_right_metaclass\"=" + prettyPrintValue(fCurrent_right_metaclass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_left_metaclass, fCurrent_left_metaclass, fInitial_right_metaclass, fCurrent_right_metaclass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MergeMetaclassesPrecondition.Match)) {
          MergeMetaclassesPrecondition.Match other = (MergeMetaclassesPrecondition.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_left_metaclass, other.fInitial_left_metaclass) && Objects.equals(fCurrent_left_metaclass, other.fCurrent_left_metaclass) && Objects.equals(fInitial_right_metaclass, other.fInitial_right_metaclass) && Objects.equals(fCurrent_right_metaclass, other.fCurrent_right_metaclass);
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
    public MergeMetaclassesPrecondition specification() {
      return MergeMetaclassesPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MergeMetaclassesPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MergeMetaclassesPrecondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MergeMetaclassesPrecondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass);
    }
    
    private static final class Mutable extends MergeMetaclassesPrecondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
        super(pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MergeMetaclassesPrecondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
        super(pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCCAR9 - Merge Metaclasses - Precondition
   * pattern MergeMetaclassesPrecondition (initial_package : Package, current_package : Package, initial_left_metaclass : Class, current_left_metaclass : Class, initial_right_metaclass : Class, current_right_metaclass : Class) {
   * 	find preserved_package_class (initial_package, current_package, initial_left_metaclass, current_left_metaclass);
   * 	find preserved_package_class (initial_package, current_package, initial_right_metaclass, current_right_metaclass); 
   * 	initial_left_metaclass != initial_right_metaclass; 
   * 	current_left_metaclass != current_right_metaclass; 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see MergeMetaclassesPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<MergeMetaclassesPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MergeMetaclassesPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MergeMetaclassesPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_LEFT_METACLASS = 2;
    
    private final static int POSITION_CURRENT_LEFT_METACLASS = 3;
    
    private final static int POSITION_INITIAL_RIGHT_METACLASS = 4;
    
    private final static int POSITION_CURRENT_RIGHT_METACLASS = 5;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MergeMetaclassesPrecondition.Matcher.class);
    
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
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MergeMetaclassesPrecondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public MergeMetaclassesPrecondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass, final IMatchProcessor<? super MergeMetaclassesPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass, final IMatchProcessor<? super MergeMetaclassesPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_left_metaclass the fixed value of pattern parameter initial_left_metaclass, or null if not bound.
     * @param pCurrent_left_metaclass the fixed value of pattern parameter current_left_metaclass, or null if not bound.
     * @param pInitial_right_metaclass the fixed value of pattern parameter initial_right_metaclass, or null if not bound.
     * @param pCurrent_right_metaclass the fixed value of pattern parameter current_right_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MergeMetaclassesPrecondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return MergeMetaclassesPrecondition.Match.newMatch(pInitial_package, pCurrent_package, pInitial_left_metaclass, pCurrent_left_metaclass, pInitial_right_metaclass, pCurrent_right_metaclass);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final MergeMetaclassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_left_metaclass, 
      pCurrent_left_metaclass, 
      pInitial_right_metaclass, 
      pCurrent_right_metaclass
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final MergeMetaclassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_left_metaclass, 
      pCurrent_left_metaclass, 
      pInitial_right_metaclass, 
      pCurrent_right_metaclass
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_left_metaclass(final MergeMetaclassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_left_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_left_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawAccumulateAllValuesOfinitial_left_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pCurrent_left_metaclass, 
      pInitial_right_metaclass, 
      pCurrent_right_metaclass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_left_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_LEFT_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_left_metaclass() {
      return rawAccumulateAllValuesOfcurrent_left_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_left_metaclass(final MergeMetaclassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_left_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_left_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_left_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawAccumulateAllValuesOfcurrent_left_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_left_metaclass, 
      null, 
      pInitial_right_metaclass, 
      pCurrent_right_metaclass
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_right_metaclass(final MergeMetaclassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_right_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_right_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass) {
      return rawAccumulateAllValuesOfinitial_right_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_left_metaclass, 
      pCurrent_left_metaclass, 
      null, 
      pCurrent_right_metaclass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_right_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_RIGHT_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_right_metaclass() {
      return rawAccumulateAllValuesOfcurrent_right_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_right_metaclass(final MergeMetaclassesPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_right_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_right_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_right_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass) {
      return rawAccumulateAllValuesOfcurrent_right_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_left_metaclass, 
      pCurrent_left_metaclass, 
      pInitial_right_metaclass, 
      null
      });
    }
    
    @Override
    protected MergeMetaclassesPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return MergeMetaclassesPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_LEFT_METACLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_LEFT_METACLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_RIGHT_METACLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_RIGHT_METACLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeMetaclassesPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return MergeMetaclassesPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_LEFT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_LEFT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_RIGHT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_RIGHT_METACLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeMetaclassesPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MergeMetaclassesPrecondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_LEFT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_LEFT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_RIGHT_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_RIGHT_METACLASS]);
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
    public static IQuerySpecification<MergeMetaclassesPrecondition.Matcher> querySpecification() {
      return MergeMetaclassesPrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<MergeMetaclassesPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_left_metaclass the value of pattern parameter initial_left_metaclass in the currently processed match
     * @param pCurrent_left_metaclass the value of pattern parameter current_left_metaclass in the currently processed match
     * @param pInitial_right_metaclass the value of pattern parameter initial_right_metaclass in the currently processed match
     * @param pCurrent_right_metaclass the value of pattern parameter current_right_metaclass in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_left_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_right_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_right_metaclass);
    
    @Override
    public void process(final MergeMetaclassesPrecondition.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_left_metaclass(), match.getCurrent_left_metaclass(), match.getInitial_right_metaclass(), match.getCurrent_right_metaclass());
    }
  }
  
  private MergeMetaclassesPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MergeMetaclassesPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MergeMetaclassesPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MergeMetaclassesPrecondition.Matcher.on(engine);
  }
  
  @Override
  public MergeMetaclassesPrecondition.Matcher instantiate() {
    return MergeMetaclassesPrecondition.Matcher.create();
  }
  
  @Override
  public MergeMetaclassesPrecondition.Match newEmptyMatch() {
    return MergeMetaclassesPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public MergeMetaclassesPrecondition.Match newMatch(final Object... parameters) {
    return MergeMetaclassesPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[4], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition (visibility: PUBLIC, simpleName: MergeMetaclassesPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition (visibility: PUBLIC, simpleName: MergeMetaclassesPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MergeMetaclassesPrecondition INSTANCE = new MergeMetaclassesPrecondition();
    
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
    private final static MergeMetaclassesPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_left_metaclass = new PParameter("initial_left_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_left_metaclass = new PParameter("current_left_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_right_metaclass = new PParameter("initial_right_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_right_metaclass = new PParameter("current_right_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_left_metaclass, parameter_pCurrent_left_metaclass, parameter_pInitial_right_metaclass, parameter_pCurrent_right_metaclass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.MergeMetaclassesPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_left_metaclass","current_left_metaclass","initial_right_metaclass","current_right_metaclass");
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
          PVariable var_current_left_metaclass = body.getOrCreateVariableByName("current_left_metaclass");
          PVariable var_initial_right_metaclass = body.getOrCreateVariableByName("initial_right_metaclass");
          PVariable var_current_right_metaclass = body.getOrCreateVariableByName("current_right_metaclass");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_left_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_left_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_right_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_right_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_left_metaclass, parameter_pInitial_left_metaclass),
             new ExportedParameter(body, var_current_left_metaclass, parameter_pCurrent_left_metaclass),
             new ExportedParameter(body, var_initial_right_metaclass, parameter_pInitial_right_metaclass),
             new ExportedParameter(body, var_current_right_metaclass, parameter_pCurrent_right_metaclass)
          ));
          // 	find preserved_package_class (initial_package, current_package, initial_left_metaclass, current_left_metaclass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_left_metaclass, var_current_left_metaclass), Preserved_package_class.instance().getInternalQueryRepresentation());
          // 	find preserved_package_class (initial_package, current_package, initial_right_metaclass, current_right_metaclass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_right_metaclass, var_current_right_metaclass), Preserved_package_class.instance().getInternalQueryRepresentation());
          //  	initial_left_metaclass != initial_right_metaclass
          new Inequality(body, var_initial_left_metaclass, var_initial_right_metaclass);
          //  	current_left_metaclass != current_right_metaclass
          new Inequality(body, var_current_left_metaclass, var_current_right_metaclass);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
