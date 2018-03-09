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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.BinaryTransitiveClosure;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_superClass;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Common_class_superClass extends BaseGeneratedEMFQuerySpecification<Common_class_superClass.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.common_class_superClass pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fSuper_class;
    
    private static List<String> parameterNames = makeImmutableList("left_class", "right_class", "super_class");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      this.fLeft_class = pLeft_class;
      this.fRight_class = pRight_class;
      this.fSuper_class = pSuper_class;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("left_class".equals(parameterName)) return this.fLeft_class;
      if ("right_class".equals(parameterName)) return this.fRight_class;
      if ("super_class".equals(parameterName)) return this.fSuper_class;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getLeft_class() {
      return this.fLeft_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getRight_class() {
      return this.fRight_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getSuper_class() {
      return this.fSuper_class;
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
      if ("super_class".equals(parameterName) ) {
          this.fSuper_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
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
    
    public void setSuper_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSuper_class = pSuper_class;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.common_class_superClass";
    }
    
    @Override
    public List<String> parameterNames() {
      return Common_class_superClass.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fLeft_class, fRight_class, fSuper_class};
    }
    
    @Override
    public Common_class_superClass.Match toImmutable() {
      return isMutable() ? newMatch(fLeft_class, fRight_class, fSuper_class) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"left_class\"=" + prettyPrintValue(fLeft_class) + ", ");
      result.append("\"right_class\"=" + prettyPrintValue(fRight_class) + ", ");
      result.append("\"super_class\"=" + prettyPrintValue(fSuper_class));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fLeft_class, fRight_class, fSuper_class);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Common_class_superClass.Match)) {
          Common_class_superClass.Match other = (Common_class_superClass.Match) obj;
          return Objects.equals(fLeft_class, other.fLeft_class) && Objects.equals(fRight_class, other.fRight_class) && Objects.equals(fSuper_class, other.fSuper_class);
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
    public Common_class_superClass specification() {
      return Common_class_superClass.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Common_class_superClass.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Common_class_superClass.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return new Mutable(pLeft_class, pRight_class, pSuper_class);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Common_class_superClass.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return new Immutable(pLeft_class, pRight_class, pSuper_class);
    }
    
    private static final class Mutable extends Common_class_superClass.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
        super(pLeft_class, pRight_class, pSuper_class);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Common_class_superClass.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
        super(pLeft_class, pRight_class, pSuper_class);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.common_class_superClass pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // {@literal @}TODO class - superClasses - common
   * pattern common_class_superClass (left_class : Class, right_class : Class, super_class : Class) {
   * 	find class_superClass+(left_class, super_class); 
   * 	find class_superClass+(right_class, super_class); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Common_class_superClass
   * 
   */
  public static class Matcher extends BaseMatcher<Common_class_superClass.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Common_class_superClass.Matcher on(final ViatraQueryEngine engine) {
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
    public static Common_class_superClass.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_LEFT_CLASS = 0;
    
    private final static int POSITION_RIGHT_CLASS = 1;
    
    private final static int POSITION_SUPER_CLASS = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Common_class_superClass.Matcher.class);
    
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
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Common_class_superClass.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return rawGetAllMatches(new Object[]{pLeft_class, pRight_class, pSuper_class});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Common_class_superClass.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return rawGetOneArbitraryMatch(new Object[]{pLeft_class, pRight_class, pSuper_class});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return rawHasMatch(new Object[]{pLeft_class, pRight_class, pSuper_class});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return rawCountMatches(new Object[]{pLeft_class, pRight_class, pSuper_class});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class, final IMatchProcessor<? super Common_class_superClass.Match> processor) {
      rawForEachMatch(new Object[]{pLeft_class, pRight_class, pSuper_class}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class, final IMatchProcessor<? super Common_class_superClass.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pLeft_class, pRight_class, pSuper_class}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pSuper_class the fixed value of pattern parameter super_class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Common_class_superClass.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return Common_class_superClass.Match.newMatch(pLeft_class, pRight_class, pSuper_class);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfleft_class(final Common_class_superClass.Match partialMatch) {
      return rawAccumulateAllValuesOfleft_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfleft_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return rawAccumulateAllValuesOfleft_class(new Object[]{
      null, 
      pRight_class, 
      pSuper_class
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfright_class(final Common_class_superClass.Match partialMatch) {
      return rawAccumulateAllValuesOfright_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfright_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class) {
      return rawAccumulateAllValuesOfright_class(new Object[]{
      pLeft_class, 
      null, 
      pSuper_class
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for super_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfsuper_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_SUPER_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for super_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfsuper_class() {
      return rawAccumulateAllValuesOfsuper_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for super_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfsuper_class(final Common_class_superClass.Match partialMatch) {
      return rawAccumulateAllValuesOfsuper_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for super_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfsuper_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class) {
      return rawAccumulateAllValuesOfsuper_class(new Object[]{
      pLeft_class, 
      pRight_class, 
      null
      });
    }
    
    @Override
    protected Common_class_superClass.Match tupleToMatch(final Tuple t) {
      try {
          return Common_class_superClass.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_LEFT_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_RIGHT_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_SUPER_CLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Common_class_superClass.Match arrayToMatch(final Object[] match) {
      try {
          return Common_class_superClass.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_LEFT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_RIGHT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_SUPER_CLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Common_class_superClass.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Common_class_superClass.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_LEFT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_RIGHT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_SUPER_CLASS]);
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
    public static IQuerySpecification<Common_class_superClass.Matcher> querySpecification() {
      return Common_class_superClass.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.common_class_superClass pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Common_class_superClass.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pLeft_class the value of pattern parameter left_class in the currently processed match
     * @param pRight_class the value of pattern parameter right_class in the currently processed match
     * @param pSuper_class the value of pattern parameter super_class in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pSuper_class);
    
    @Override
    public void process(final Common_class_superClass.Match match) {
      process(match.getLeft_class(), match.getRight_class(), match.getSuper_class());
    }
  }
  
  private Common_class_superClass() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Common_class_superClass instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Common_class_superClass.Matcher instantiate(final ViatraQueryEngine engine) {
    return Common_class_superClass.Matcher.on(engine);
  }
  
  @Override
  public Common_class_superClass.Matcher instantiate() {
    return Common_class_superClass.Matcher.create();
  }
  
  @Override
  public Common_class_superClass.Match newEmptyMatch() {
    return Common_class_superClass.Match.newEmptyMatch();
  }
  
  @Override
  public Common_class_superClass.Match newMatch(final Object... parameters) {
    return Common_class_superClass.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Common_class_superClass (visibility: PUBLIC, simpleName: Common_class_superClass, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Common_class_superClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Common_class_superClass (visibility: PUBLIC, simpleName: Common_class_superClass, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Common_class_superClass, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Common_class_superClass INSTANCE = new Common_class_superClass();
    
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
    private final static Common_class_superClass.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pLeft_class = new PParameter("left_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pRight_class = new PParameter("right_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSuper_class = new PParameter("super_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pLeft_class, parameter_pRight_class, parameter_pSuper_class);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.common_class_superClass";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("left_class","right_class","super_class");
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
          PVariable var_super_class = body.getOrCreateVariableByName("super_class");
          new TypeConstraint(body, Tuples.flatTupleOf(var_left_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_right_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_super_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_left_class, parameter_pLeft_class),
             new ExportedParameter(body, var_right_class, parameter_pRight_class),
             new ExportedParameter(body, var_super_class, parameter_pSuper_class)
          ));
          // 	find class_superClass+(left_class, super_class)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_left_class, var_super_class), Class_superClass.instance().getInternalQueryRepresentation());
          //  	find class_superClass+(right_class, super_class)
          new BinaryTransitiveClosure(body, Tuples.flatTupleOf(var_right_class, var_super_class), Class_superClass.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
