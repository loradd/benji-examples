/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/PushDownProperty.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_attribute_owner;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_subClass;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class PushDownPropertyPostcondition extends BaseGeneratedEMFQuerySpecification<PushDownPropertyPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_class;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_class;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_subClass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_subClass;
    
    private Attribute fInitial_property;
    
    private Attribute fCurrent_property;
    
    private static List<String> parameterNames = makeImmutableList("initial_class", "current_class", "initial_subClass", "current_subClass", "initial_property", "current_property");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      this.fInitial_class = pInitial_class;
      this.fCurrent_class = pCurrent_class;
      this.fInitial_subClass = pInitial_subClass;
      this.fCurrent_subClass = pCurrent_subClass;
      this.fInitial_property = pInitial_property;
      this.fCurrent_property = pCurrent_property;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("initial_subClass".equals(parameterName)) return this.fInitial_subClass;
      if ("current_subClass".equals(parameterName)) return this.fCurrent_subClass;
      if ("initial_property".equals(parameterName)) return this.fInitial_property;
      if ("current_property".equals(parameterName)) return this.fCurrent_property;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_class() {
      return this.fInitial_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_subClass() {
      return this.fInitial_subClass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_subClass() {
      return this.fCurrent_subClass;
    }
    
    public Attribute getInitial_property() {
      return this.fInitial_property;
    }
    
    public Attribute getCurrent_property() {
      return this.fCurrent_property;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_class".equals(parameterName) ) {
          this.fInitial_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_class".equals(parameterName) ) {
          this.fCurrent_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_subClass".equals(parameterName) ) {
          this.fInitial_subClass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_subClass".equals(parameterName) ) {
          this.fCurrent_subClass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_property".equals(parameterName) ) {
          this.fInitial_property = (Attribute) newValue;
          return true;
      }
      if ("current_property".equals(parameterName) ) {
          this.fCurrent_property = (Attribute) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_class = pInitial_class;
    }
    
    public void setCurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_class = pCurrent_class;
    }
    
    public void setInitial_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_subClass = pInitial_subClass;
    }
    
    public void setCurrent_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_subClass = pCurrent_subClass;
    }
    
    public void setInitial_property(final Attribute pInitial_property) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_property = pInitial_property;
    }
    
    public void setCurrent_property(final Attribute pCurrent_property) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_property = pCurrent_property;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return PushDownPropertyPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_class, fCurrent_class, fInitial_subClass, fCurrent_subClass, fInitial_property, fCurrent_property};
    }
    
    @Override
    public PushDownPropertyPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_class, fCurrent_class, fInitial_subClass, fCurrent_subClass, fInitial_property, fCurrent_property) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"initial_subClass\"=" + prettyPrintValue(fInitial_subClass) + ", ");
      result.append("\"current_subClass\"=" + prettyPrintValue(fCurrent_subClass) + ", ");
      result.append("\"initial_property\"=" + prettyPrintValue(fInitial_property) + ", ");
      result.append("\"current_property\"=" + prettyPrintValue(fCurrent_property));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_class, fCurrent_class, fInitial_subClass, fCurrent_subClass, fInitial_property, fCurrent_property);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PushDownPropertyPostcondition.Match)) {
          PushDownPropertyPostcondition.Match other = (PushDownPropertyPostcondition.Match) obj;
          return Objects.equals(fInitial_class, other.fInitial_class) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fInitial_subClass, other.fInitial_subClass) && Objects.equals(fCurrent_subClass, other.fCurrent_subClass) && Objects.equals(fInitial_property, other.fInitial_property) && Objects.equals(fCurrent_property, other.fCurrent_property);
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
    public PushDownPropertyPostcondition specification() {
      return PushDownPropertyPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PushDownPropertyPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PushDownPropertyPostcondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return new Mutable(pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PushDownPropertyPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return new Immutable(pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property);
    }
    
    private static final class Mutable extends PushDownPropertyPostcondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
        super(pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PushDownPropertyPostcondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
        super(pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CDACA22 - Push Down Property - Postcondition
   * pattern PushDownPropertyPostcondition (
   * 	initial_class : Class, current_class : Class, 
   * 	initial_subClass : Class, current_subClass : Class, 
   * 	initial_property : Attribute, current_property : Attribute
   * ) {
   * 	find changed_attribute_owner (initial_property, current_property, initial_class, current_subClass); 
   * 	find preserved_class_subClass (initial_class, current_class, initial_subClass, current_subClass); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see PushDownPropertyPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<PushDownPropertyPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PushDownPropertyPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static PushDownPropertyPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_CLASS = 0;
    
    private final static int POSITION_CURRENT_CLASS = 1;
    
    private final static int POSITION_INITIAL_SUBCLASS = 2;
    
    private final static int POSITION_CURRENT_SUBCLASS = 3;
    
    private final static int POSITION_INITIAL_PROPERTY = 4;
    
    private final static int POSITION_CURRENT_PROPERTY = 5;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PushDownPropertyPostcondition.Matcher.class);
    
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
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PushDownPropertyPostcondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawGetAllMatches(new Object[]{pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public PushDownPropertyPostcondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawHasMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawCountMatches(new Object[]{pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property, final IMatchProcessor<? super PushDownPropertyPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property, final IMatchProcessor<? super PushDownPropertyPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_subClass the fixed value of pattern parameter initial_subClass, or null if not bound.
     * @param pCurrent_subClass the fixed value of pattern parameter current_subClass, or null if not bound.
     * @param pInitial_property the fixed value of pattern parameter initial_property, or null if not bound.
     * @param pCurrent_property the fixed value of pattern parameter current_property, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PushDownPropertyPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return PushDownPropertyPostcondition.Match.newMatch(pInitial_class, pCurrent_class, pInitial_subClass, pCurrent_subClass, pInitial_property, pCurrent_property);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final PushDownPropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      null, 
      pCurrent_class, 
      pInitial_subClass, 
      pCurrent_subClass, 
      pInitial_property, 
      pCurrent_property
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final PushDownPropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pInitial_class, 
      null, 
      pInitial_subClass, 
      pCurrent_subClass, 
      pInitial_property, 
      pCurrent_property
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_subClass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_SUBCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_subClass() {
      return rawAccumulateAllValuesOfinitial_subClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_subClass(final PushDownPropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_subClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawAccumulateAllValuesOfinitial_subClass(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      null, 
      pCurrent_subClass, 
      pInitial_property, 
      pCurrent_property
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_subClass(final PushDownPropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_subClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_subClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final Attribute pInitial_property, final Attribute pCurrent_property) {
      return rawAccumulateAllValuesOfcurrent_subClass(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      pInitial_subClass, 
      null, 
      pInitial_property, 
      pCurrent_property
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfinitial_property(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_INITIAL_PROPERTY, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_property() {
      return rawAccumulateAllValuesOfinitial_property(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_property(final PushDownPropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_property(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_property(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pCurrent_property) {
      return rawAccumulateAllValuesOfinitial_property(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      pInitial_subClass, 
      pCurrent_subClass, 
      null, 
      pCurrent_property
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfcurrent_property(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_CURRENT_PROPERTY, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_property() {
      return rawAccumulateAllValuesOfcurrent_property(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_property(final PushDownPropertyPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_property(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_property.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_property(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property) {
      return rawAccumulateAllValuesOfcurrent_property(new Object[]{
      pInitial_class, 
      pCurrent_class, 
      pInitial_subClass, 
      pCurrent_subClass, 
      pInitial_property, 
      null
      });
    }
    
    @Override
    protected PushDownPropertyPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return PushDownPropertyPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_SUBCLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_SUBCLASS), (Attribute) t.get(POSITION_INITIAL_PROPERTY), (Attribute) t.get(POSITION_CURRENT_PROPERTY));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownPropertyPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return PushDownPropertyPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_SUBCLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_SUBCLASS], (Attribute) match[POSITION_INITIAL_PROPERTY], (Attribute) match[POSITION_CURRENT_PROPERTY]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownPropertyPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PushDownPropertyPostcondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_SUBCLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_SUBCLASS], (Attribute) match[POSITION_INITIAL_PROPERTY], (Attribute) match[POSITION_CURRENT_PROPERTY]);
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
    public static IQuerySpecification<PushDownPropertyPostcondition.Matcher> querySpecification() {
      return PushDownPropertyPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<PushDownPropertyPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pInitial_subClass the value of pattern parameter initial_subClass in the currently processed match
     * @param pCurrent_subClass the value of pattern parameter current_subClass in the currently processed match
     * @param pInitial_property the value of pattern parameter initial_property in the currently processed match
     * @param pCurrent_property the value of pattern parameter current_property in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_subClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_subClass, final Attribute pInitial_property, final Attribute pCurrent_property);
    
    @Override
    public void process(final PushDownPropertyPostcondition.Match match) {
      process(match.getInitial_class(), match.getCurrent_class(), match.getInitial_subClass(), match.getCurrent_subClass(), match.getInitial_property(), match.getCurrent_property());
    }
  }
  
  private PushDownPropertyPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PushDownPropertyPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PushDownPropertyPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return PushDownPropertyPostcondition.Matcher.on(engine);
  }
  
  @Override
  public PushDownPropertyPostcondition.Matcher instantiate() {
    return PushDownPropertyPostcondition.Matcher.create();
  }
  
  @Override
  public PushDownPropertyPostcondition.Match newEmptyMatch() {
    return PushDownPropertyPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public PushDownPropertyPostcondition.Match newMatch(final Object... parameters) {
    return PushDownPropertyPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[4], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition (visibility: PUBLIC, simpleName: PushDownPropertyPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition (visibility: PUBLIC, simpleName: PushDownPropertyPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static PushDownPropertyPostcondition INSTANCE = new PushDownPropertyPostcondition();
    
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
    private final static PushDownPropertyPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_subClass = new PParameter("initial_subClass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_subClass = new PParameter("current_subClass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_property = new PParameter("initial_property", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_property = new PParameter("current_property", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_class, parameter_pCurrent_class, parameter_pInitial_subClass, parameter_pCurrent_subClass, parameter_pInitial_property, parameter_pCurrent_property);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.PushDownPropertyPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_class","current_class","initial_subClass","current_subClass","initial_property","current_property");
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
          PVariable var_initial_class = body.getOrCreateVariableByName("initial_class");
          PVariable var_current_class = body.getOrCreateVariableByName("current_class");
          PVariable var_initial_subClass = body.getOrCreateVariableByName("initial_subClass");
          PVariable var_current_subClass = body.getOrCreateVariableByName("current_subClass");
          PVariable var_initial_property = body.getOrCreateVariableByName("initial_property");
          PVariable var_current_property = body.getOrCreateVariableByName("current_property");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_subClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_subClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_property), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_initial_subClass, parameter_pInitial_subClass),
             new ExportedParameter(body, var_current_subClass, parameter_pCurrent_subClass),
             new ExportedParameter(body, var_initial_property, parameter_pInitial_property),
             new ExportedParameter(body, var_current_property, parameter_pCurrent_property)
          ));
          // 	find changed_attribute_owner (initial_property, current_property, initial_class, current_subClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_property, var_current_property, var_initial_class, var_current_subClass), Changed_attribute_owner.instance().getInternalQueryRepresentation());
          //  	find preserved_class_subClass (initial_class, current_class, initial_subClass, current_subClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var_initial_subClass, var_current_subClass), Preserved_class_subClass.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
