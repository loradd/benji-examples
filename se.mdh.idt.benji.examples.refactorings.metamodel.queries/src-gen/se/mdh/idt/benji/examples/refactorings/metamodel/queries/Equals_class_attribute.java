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
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Attribute_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_attribute;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Equals_class_attribute extends BaseGeneratedEMFQuerySpecification<Equals_class_attribute.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.equals_class_attribute pattern,
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
    
    private Attribute fLeft_attribute;
    
    private Attribute fRight_attribute;
    
    private static List<String> parameterNames = makeImmutableList("left_class", "right_class", "left_attribute", "right_attribute");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      this.fLeft_class = pLeft_class;
      this.fRight_class = pRight_class;
      this.fLeft_attribute = pLeft_attribute;
      this.fRight_attribute = pRight_attribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("left_class".equals(parameterName)) return this.fLeft_class;
      if ("right_class".equals(parameterName)) return this.fRight_class;
      if ("left_attribute".equals(parameterName)) return this.fLeft_attribute;
      if ("right_attribute".equals(parameterName)) return this.fRight_attribute;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getLeft_class() {
      return this.fLeft_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getRight_class() {
      return this.fRight_class;
    }
    
    public Attribute getLeft_attribute() {
      return this.fLeft_attribute;
    }
    
    public Attribute getRight_attribute() {
      return this.fRight_attribute;
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
      if ("left_attribute".equals(parameterName) ) {
          this.fLeft_attribute = (Attribute) newValue;
          return true;
      }
      if ("right_attribute".equals(parameterName) ) {
          this.fRight_attribute = (Attribute) newValue;
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
    
    public void setLeft_attribute(final Attribute pLeft_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fLeft_attribute = pLeft_attribute;
    }
    
    public void setRight_attribute(final Attribute pRight_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fRight_attribute = pRight_attribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.equals_class_attribute";
    }
    
    @Override
    public List<String> parameterNames() {
      return Equals_class_attribute.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fLeft_class, fRight_class, fLeft_attribute, fRight_attribute};
    }
    
    @Override
    public Equals_class_attribute.Match toImmutable() {
      return isMutable() ? newMatch(fLeft_class, fRight_class, fLeft_attribute, fRight_attribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"left_class\"=" + prettyPrintValue(fLeft_class) + ", ");
      result.append("\"right_class\"=" + prettyPrintValue(fRight_class) + ", ");
      result.append("\"left_attribute\"=" + prettyPrintValue(fLeft_attribute) + ", ");
      result.append("\"right_attribute\"=" + prettyPrintValue(fRight_attribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fLeft_class, fRight_class, fLeft_attribute, fRight_attribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Equals_class_attribute.Match)) {
          Equals_class_attribute.Match other = (Equals_class_attribute.Match) obj;
          return Objects.equals(fLeft_class, other.fLeft_class) && Objects.equals(fRight_class, other.fRight_class) && Objects.equals(fLeft_attribute, other.fLeft_attribute) && Objects.equals(fRight_attribute, other.fRight_attribute);
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
    public Equals_class_attribute specification() {
      return Equals_class_attribute.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Equals_class_attribute.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Equals_class_attribute.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return new Mutable(pLeft_class, pRight_class, pLeft_attribute, pRight_attribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Equals_class_attribute.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return new Immutable(pLeft_class, pRight_class, pLeft_attribute, pRight_attribute);
    }
    
    private static final class Mutable extends Equals_class_attribute.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
        super(pLeft_class, pRight_class, pLeft_attribute, pRight_attribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Equals_class_attribute.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
        super(pLeft_class, pRight_class, pLeft_attribute, pRight_attribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.equals_class_attribute pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // {@literal @}TODO class - structuralFeatures (attribute) - equals
   * pattern equals_class_attribute (left_class : Class, right_class : Class, left_attribute : Attribute, right_attribute : Attribute) {
   * 	find class_attribute (left_class, left_attribute);  
   * 	find class_attribute (right_class, right_attribute); 
   * 	find attribute_name (left_attribute, attribute_name); 
   * 	find attribute_name (right_attribute, attribute_name); 
   * 	find attribute_type (left_attribute, attribute_type); 
   * 	find attribute_type (right_attribute, attribute_type); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Equals_class_attribute
   * 
   */
  public static class Matcher extends BaseMatcher<Equals_class_attribute.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Equals_class_attribute.Matcher on(final ViatraQueryEngine engine) {
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
    public static Equals_class_attribute.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_LEFT_CLASS = 0;
    
    private final static int POSITION_RIGHT_CLASS = 1;
    
    private final static int POSITION_LEFT_ATTRIBUTE = 2;
    
    private final static int POSITION_RIGHT_ATTRIBUTE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Equals_class_attribute.Matcher.class);
    
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
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Equals_class_attribute.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return rawGetAllMatches(new Object[]{pLeft_class, pRight_class, pLeft_attribute, pRight_attribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Equals_class_attribute.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return rawGetOneArbitraryMatch(new Object[]{pLeft_class, pRight_class, pLeft_attribute, pRight_attribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return rawHasMatch(new Object[]{pLeft_class, pRight_class, pLeft_attribute, pRight_attribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return rawCountMatches(new Object[]{pLeft_class, pRight_class, pLeft_attribute, pRight_attribute});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute, final IMatchProcessor<? super Equals_class_attribute.Match> processor) {
      rawForEachMatch(new Object[]{pLeft_class, pRight_class, pLeft_attribute, pRight_attribute}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute, final IMatchProcessor<? super Equals_class_attribute.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pLeft_class, pRight_class, pLeft_attribute, pRight_attribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pLeft_class the fixed value of pattern parameter left_class, or null if not bound.
     * @param pRight_class the fixed value of pattern parameter right_class, or null if not bound.
     * @param pLeft_attribute the fixed value of pattern parameter left_attribute, or null if not bound.
     * @param pRight_attribute the fixed value of pattern parameter right_attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Equals_class_attribute.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return Equals_class_attribute.Match.newMatch(pLeft_class, pRight_class, pLeft_attribute, pRight_attribute);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfleft_class(final Equals_class_attribute.Match partialMatch) {
      return rawAccumulateAllValuesOfleft_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfleft_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return rawAccumulateAllValuesOfleft_class(new Object[]{
      null, 
      pRight_class, 
      pLeft_attribute, 
      pRight_attribute
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfright_class(final Equals_class_attribute.Match partialMatch) {
      return rawAccumulateAllValuesOfright_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfright_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final Attribute pLeft_attribute, final Attribute pRight_attribute) {
      return rawAccumulateAllValuesOfright_class(new Object[]{
      pLeft_class, 
      null, 
      pLeft_attribute, 
      pRight_attribute
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfleft_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_LEFT_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfleft_attribute() {
      return rawAccumulateAllValuesOfleft_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfleft_attribute(final Equals_class_attribute.Match partialMatch) {
      return rawAccumulateAllValuesOfleft_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for left_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfleft_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pRight_attribute) {
      return rawAccumulateAllValuesOfleft_attribute(new Object[]{
      pLeft_class, 
      pRight_class, 
      null, 
      pRight_attribute
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfright_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_RIGHT_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfright_attribute() {
      return rawAccumulateAllValuesOfright_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfright_attribute(final Equals_class_attribute.Match partialMatch) {
      return rawAccumulateAllValuesOfright_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for right_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfright_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute) {
      return rawAccumulateAllValuesOfright_attribute(new Object[]{
      pLeft_class, 
      pRight_class, 
      pLeft_attribute, 
      null
      });
    }
    
    @Override
    protected Equals_class_attribute.Match tupleToMatch(final Tuple t) {
      try {
          return Equals_class_attribute.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_LEFT_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_RIGHT_CLASS), (Attribute) t.get(POSITION_LEFT_ATTRIBUTE), (Attribute) t.get(POSITION_RIGHT_ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Equals_class_attribute.Match arrayToMatch(final Object[] match) {
      try {
          return Equals_class_attribute.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_LEFT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_RIGHT_CLASS], (Attribute) match[POSITION_LEFT_ATTRIBUTE], (Attribute) match[POSITION_RIGHT_ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Equals_class_attribute.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Equals_class_attribute.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_LEFT_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_RIGHT_CLASS], (Attribute) match[POSITION_LEFT_ATTRIBUTE], (Attribute) match[POSITION_RIGHT_ATTRIBUTE]);
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
    public static IQuerySpecification<Equals_class_attribute.Matcher> querySpecification() {
      return Equals_class_attribute.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.equals_class_attribute pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Equals_class_attribute.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pLeft_class the value of pattern parameter left_class in the currently processed match
     * @param pRight_class the value of pattern parameter right_class in the currently processed match
     * @param pLeft_attribute the value of pattern parameter left_attribute in the currently processed match
     * @param pRight_attribute the value of pattern parameter right_attribute in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pLeft_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pRight_class, final Attribute pLeft_attribute, final Attribute pRight_attribute);
    
    @Override
    public void process(final Equals_class_attribute.Match match) {
      process(match.getLeft_class(), match.getRight_class(), match.getLeft_attribute(), match.getRight_attribute());
    }
  }
  
  private Equals_class_attribute() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Equals_class_attribute instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Equals_class_attribute.Matcher instantiate(final ViatraQueryEngine engine) {
    return Equals_class_attribute.Matcher.on(engine);
  }
  
  @Override
  public Equals_class_attribute.Matcher instantiate() {
    return Equals_class_attribute.Matcher.create();
  }
  
  @Override
  public Equals_class_attribute.Match newEmptyMatch() {
    return Equals_class_attribute.Match.newEmptyMatch();
  }
  
  @Override
  public Equals_class_attribute.Match newMatch(final Object... parameters) {
    return Equals_class_attribute.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Equals_class_attribute (visibility: PUBLIC, simpleName: Equals_class_attribute, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Equals_class_attribute, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Equals_class_attribute (visibility: PUBLIC, simpleName: Equals_class_attribute, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Equals_class_attribute, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Equals_class_attribute INSTANCE = new Equals_class_attribute();
    
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
    private final static Equals_class_attribute.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pLeft_class = new PParameter("left_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pRight_class = new PParameter("right_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pLeft_attribute = new PParameter("left_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pRight_attribute = new PParameter("right_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pLeft_class, parameter_pRight_class, parameter_pLeft_attribute, parameter_pRight_attribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.equals_class_attribute";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("left_class","right_class","left_attribute","right_attribute");
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
          PVariable var_left_attribute = body.getOrCreateVariableByName("left_attribute");
          PVariable var_right_attribute = body.getOrCreateVariableByName("right_attribute");
          PVariable var_attribute_name = body.getOrCreateVariableByName("attribute_name");
          PVariable var_attribute_type = body.getOrCreateVariableByName("attribute_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_left_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_right_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_left_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_right_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_left_class, parameter_pLeft_class),
             new ExportedParameter(body, var_right_class, parameter_pRight_class),
             new ExportedParameter(body, var_left_attribute, parameter_pLeft_attribute),
             new ExportedParameter(body, var_right_attribute, parameter_pRight_attribute)
          ));
          // 	find class_attribute (left_class, left_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_left_class, var_left_attribute), Class_attribute.instance().getInternalQueryRepresentation());
          //   	find class_attribute (right_class, right_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_right_class, var_right_attribute), Class_attribute.instance().getInternalQueryRepresentation());
          //  	find attribute_name (left_attribute, attribute_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_left_attribute, var_attribute_name), Attribute_name.instance().getInternalQueryRepresentation());
          //  	find attribute_name (right_attribute, attribute_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_right_attribute, var_attribute_name), Attribute_name.instance().getInternalQueryRepresentation());
          //  	find attribute_type (left_attribute, attribute_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_left_attribute, var_attribute_type), Attribute_type.instance().getInternalQueryRepresentation());
          //  	find attribute_type (right_attribute, attribute_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_right_attribute, var_attribute_type), Attribute_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
