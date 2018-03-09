/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/Common.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_type;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Common_class_reference extends BaseGeneratedEMFQuerySpecification<Common_class_reference.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.common_class_reference pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fLeft_class;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fRight_class;
    
    private Reference fLeft_reference;
    
    private Reference fRight_reference;
    
    private static List<String> parameterNames = makeImmutableList("left_class", "right_class", "left_reference", "right_reference");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      this.fLeft_class = pLeft_class;
      this.fRight_class = pRight_class;
      this.fLeft_reference = pLeft_reference;
      this.fRight_reference = pRight_reference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("left_class".equals(parameterName)) return this.fLeft_class;
      if ("right_class".equals(parameterName)) return this.fRight_class;
      if ("left_reference".equals(parameterName)) return this.fLeft_reference;
      if ("right_reference".equals(parameterName)) return this.fRight_reference;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getLeft_class() {
      return this.fLeft_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getRight_class() {
      return this.fRight_class;
    }
    
    public Reference getLeft_reference() {
      return this.fLeft_reference;
    }
    
    public Reference getRight_reference() {
      return this.fRight_reference;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("left_class".equals(parameterName) ) {
          this.fLeft_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("right_class".equals(parameterName) ) {
          this.fRight_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("left_reference".equals(parameterName) ) {
          this.fLeft_reference = (Reference) newValue;
          return true;
      }
      if ("right_reference".equals(parameterName) ) {
          this.fRight_reference = (Reference) newValue;
          return true;
      }
      return false;
    }
    
    public void setLeft_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLeft_class = pLeft_class;
    }
    
    public void setRight_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRight_class = pRight_class;
    }
    
    public void setLeft_reference(final Reference pLeft_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLeft_reference = pLeft_reference;
    }
    
    public void setRight_reference(final Reference pRight_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRight_reference = pRight_reference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.common_class_reference";
    }
    
    @Override
    public List<String> parameterNames() {
      return Common_class_reference.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fLeft_class, fRight_class, fLeft_reference, fRight_reference};
    }
    
    @Override
    public Common_class_reference.Match toImmutable() {
      return isMutable() ? newMatch(fLeft_class, fRight_class, fLeft_reference, fRight_reference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"left_class\"=" + prettyPrintValue(fLeft_class) + ", ");
      result.append("\"right_class\"=" + prettyPrintValue(fRight_class) + ", ");
      result.append("\"left_reference\"=" + prettyPrintValue(fLeft_reference) + ", ");
      result.append("\"right_reference\"=" + prettyPrintValue(fRight_reference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fLeft_class, fRight_class, fLeft_reference, fRight_reference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Common_class_reference.Match)) {
          Common_class_reference.Match other = (Common_class_reference.Match) obj;
          return Objects.equals(fLeft_class, other.fLeft_class) && Objects.equals(fRight_class, other.fRight_class) && Objects.equals(fLeft_reference, other.fLeft_reference) && Objects.equals(fRight_reference, other.fRight_reference);
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
    public Common_class_reference specification() {
      return Common_class_reference.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Common_class_reference.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Common_class_reference.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return new Mutable(pLeft_class, pRight_class, pLeft_reference, pRight_reference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Common_class_reference.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return new Immutable(pLeft_class, pRight_class, pLeft_reference, pRight_reference);
    }
    
    private static final class Mutable extends Common_class_reference.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
        super(pLeft_class, pRight_class, pLeft_reference, pRight_reference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Common_class_reference.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
        super(pLeft_class, pRight_class, pLeft_reference, pRight_reference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.common_class_reference pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // Utils - Common Class References
   * pattern common_class_reference (left_class : Class, right_class : Class, left_reference : Reference, right_reference : Reference) {
   * 	find class_reference (left_class, left_reference); 
   * 	find class_reference (right_class, right_reference);
   * 	find reference_name (left_reference, reference_name); 
   * 	find reference_name (right_reference, reference_name);
   * 	find reference_type (left_reference, reference_type); 
   * 	find reference_type (right_reference, reference_type); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Common_class_reference
   * 
   */
  public static class Matcher extends BaseMatcher<Common_class_reference.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Common_class_reference.Matcher on(final ViatraQueryEngine engine) {
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
    public static Common_class_reference.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_LEFT_CLASS = 0;
    
    private final static int POSITION_RIGHT_CLASS = 1;
    
    private final static int POSITION_LEFT_REFERENCE = 2;
    
    private final static int POSITION_RIGHT_REFERENCE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Common_class_reference.Matcher.class);
    
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
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Common_class_reference.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return rawGetAllMatches(new Object[]{pLeft_class, pRight_class, pLeft_reference, pRight_reference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Common_class_reference.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return rawGetOneArbitraryMatch(new Object[]{pLeft_class, pRight_class, pLeft_reference, pRight_reference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return rawHasMatch(new Object[]{pLeft_class, pRight_class, pLeft_reference, pRight_reference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return rawCountMatches(new Object[]{pLeft_class, pRight_class, pLeft_reference, pRight_reference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference, final IMatchProcessor<? super Common_class_reference.Match> processor) {
      rawForEachMatch(new Object[]{pLeft_class, pRight_class, pLeft_reference, pRight_reference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference, final IMatchProcessor<? super Common_class_reference.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pLeft_class, pRight_class, pLeft_reference, pRight_reference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_reference the fixed value of pattern parameter left_reference, or null if not bound.
     * @param pRight_reference the fixed value of pattern parameter right_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Common_class_reference.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return Common_class_reference.Match.newMatch(pLeft_class, pRight_class, pLeft_reference, pRight_reference);
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfleft_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_LEFT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfleft_class() {
      return rawAccumulateAllValuesOfleft_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfleft_class(final Common_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfleft_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfleft_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return rawAccumulateAllValuesOfleft_class(new Object[]{
      null, 
      pRight_class, 
      pLeft_reference, 
      pRight_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfright_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_RIGHT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfright_class() {
      return rawAccumulateAllValuesOfright_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfright_class(final Common_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfright_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfright_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final Reference pLeft_reference, final Reference pRight_reference) {
      return rawAccumulateAllValuesOfright_class(new Object[]{
      pLeft_class, 
      null, 
      pLeft_reference, 
      pRight_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfleft_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_LEFT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfleft_reference() {
      return rawAccumulateAllValuesOfleft_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfleft_reference(final Common_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfleft_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfleft_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pRight_reference) {
      return rawAccumulateAllValuesOfleft_reference(new Object[]{
      pLeft_class, 
      pRight_class, 
      null, 
      pRight_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfright_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_RIGHT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfright_reference() {
      return rawAccumulateAllValuesOfright_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfright_reference(final Common_class_reference.Match partialMatch) {
      return rawAccumulateAllValuesOfright_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfright_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference) {
      return rawAccumulateAllValuesOfright_reference(new Object[]{
      pLeft_class, 
      pRight_class, 
      pLeft_reference, 
      null
      });
    }
    
    @Override
    protected Common_class_reference.Match tupleToMatch(final Tuple t) {
      try {
          return Common_class_reference.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_LEFT_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_RIGHT_CLASS), (Reference) t.get(POSITION_LEFT_REFERENCE), (Reference) t.get(POSITION_RIGHT_REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Common_class_reference.Match arrayToMatch(final Object[] match) {
      try {
          return Common_class_reference.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_LEFT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_RIGHT_CLASS], (Reference) match[POSITION_LEFT_REFERENCE], (Reference) match[POSITION_RIGHT_REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Common_class_reference.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Common_class_reference.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_LEFT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_RIGHT_CLASS], (Reference) match[POSITION_LEFT_REFERENCE], (Reference) match[POSITION_RIGHT_REFERENCE]);
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
    public static IQuerySpecification<Common_class_reference.Matcher> querySpecification() {
      return Common_class_reference.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.common_class_reference pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Common_class_reference.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pLeft_class the value of pattern parameter left_class in the currently processed match
     * @param pRight_class the value of pattern parameter right_class in the currently processed match
     * @param pLeft_reference the value of pattern parameter left_reference in the currently processed match
     * @param pRight_reference the value of pattern parameter right_reference in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Reference pLeft_reference, final Reference pRight_reference);
    
    @Override
    public void process(final Common_class_reference.Match match) {
      process(match.getLeft_class(), match.getRight_class(), match.getLeft_reference(), match.getRight_reference());
    }
  }
  
  private Common_class_reference() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Common_class_reference instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Common_class_reference.Matcher instantiate(final ViatraQueryEngine engine) {
    return Common_class_reference.Matcher.on(engine);
  }
  
  @Override
  public Common_class_reference.Matcher instantiate() {
    return Common_class_reference.Matcher.create();
  }
  
  @Override
  public Common_class_reference.Match newEmptyMatch() {
    return Common_class_reference.Match.newEmptyMatch();
  }
  
  @Override
  public Common_class_reference.Match newMatch(final Object... parameters) {
    return Common_class_reference.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_reference (visibility: PUBLIC, simpleName: Common_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_reference (visibility: PUBLIC, simpleName: Common_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.Common_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Common_class_reference INSTANCE = new Common_class_reference();
    
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
    private final static Common_class_reference.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pLeft_class = new PParameter("left_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pRight_class = new PParameter("right_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pLeft_reference = new PParameter("left_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pRight_reference = new PParameter("right_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pLeft_class, parameter_pRight_class, parameter_pLeft_reference, parameter_pRight_reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.common_class_reference";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("left_class","right_class","left_reference","right_reference");
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
          PVariable var_left_class = body.getOrCreateVariableByName("left_class");
          PVariable var_right_class = body.getOrCreateVariableByName("right_class");
          PVariable var_left_reference = body.getOrCreateVariableByName("left_reference");
          PVariable var_right_reference = body.getOrCreateVariableByName("right_reference");
          PVariable var_reference_name = body.getOrCreateVariableByName("reference_name");
          PVariable var_reference_type = body.getOrCreateVariableByName("reference_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_left_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_right_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_left_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_right_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_left_class, parameter_pLeft_class),
             new ExportedParameter(body, var_right_class, parameter_pRight_class),
             new ExportedParameter(body, var_left_reference, parameter_pLeft_reference),
             new ExportedParameter(body, var_right_reference, parameter_pRight_reference)
          ));
          // 	find class_reference (left_class, left_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_left_class, var_left_reference), Class_reference.instance().getInternalQueryRepresentation());
          //  	find class_reference (right_class, right_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_right_class, var_right_reference), Class_reference.instance().getInternalQueryRepresentation());
          // 	find reference_name (left_reference, reference_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_left_reference, var_reference_name), Reference_name.instance().getInternalQueryRepresentation());
          //  	find reference_name (right_reference, reference_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_right_reference, var_reference_name), Reference_name.instance().getInternalQueryRepresentation());
          // 	find reference_type (left_reference, reference_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_left_reference, var_reference_type), Reference_type.instance().getInternalQueryRepresentation());
          //  	find reference_type (right_reference, reference_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_right_reference, var_reference_type), Reference_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
