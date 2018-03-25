/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/AttributeQueries.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_structuralFeature_owner;
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
public final class Current_attribute_owner extends BaseGeneratedEMFQuerySpecification<Current_attribute_owner.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_attribute_owner pattern,
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
    private TraceLink fAttribute;
    
    private Attribute fCurrent_attribute;
    
    private TraceLink fOwner;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_owner;
    
    private static List<String> parameterNames = makeImmutableList("attribute", "current_attribute", "owner", "current_owner");
    
    private Match(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      this.fAttribute = pAttribute;
      this.fCurrent_attribute = pCurrent_attribute;
      this.fOwner = pOwner;
      this.fCurrent_owner = pCurrent_owner;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("current_attribute".equals(parameterName)) return this.fCurrent_attribute;
      if ("owner".equals(parameterName)) return this.fOwner;
      if ("current_owner".equals(parameterName)) return this.fCurrent_owner;
      return null;
    }
    
    public TraceLink getAttribute() {
      return this.fAttribute;
    }
    
    public Attribute getCurrent_attribute() {
      return this.fCurrent_attribute;
    }
    
    public TraceLink getOwner() {
      return this.fOwner;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_owner() {
      return this.fCurrent_owner;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (TraceLink) newValue;
          return true;
      }
      if ("current_attribute".equals(parameterName) ) {
          this.fCurrent_attribute = (Attribute) newValue;
          return true;
      }
      if ("owner".equals(parameterName) ) {
          this.fOwner = (TraceLink) newValue;
          return true;
      }
      if ("current_owner".equals(parameterName) ) {
          this.fCurrent_owner = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttribute(final TraceLink pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setCurrent_attribute(final Attribute pCurrent_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attribute = pCurrent_attribute;
    }
    
    public void setOwner(final TraceLink pOwner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOwner = pOwner;
    }
    
    public void setCurrent_owner(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_owner = pCurrent_owner;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_attribute_owner";
    }
    
    @Override
    public List<String> parameterNames() {
      return Current_attribute_owner.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttribute, fCurrent_attribute, fOwner, fCurrent_owner};
    }
    
    @Override
    public Current_attribute_owner.Match toImmutable() {
      return isMutable() ? newMatch(fAttribute, fCurrent_attribute, fOwner, fCurrent_owner) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"current_attribute\"=" + prettyPrintValue(fCurrent_attribute) + ", ");
      result.append("\"owner\"=" + prettyPrintValue(fOwner) + ", ");
      result.append("\"current_owner\"=" + prettyPrintValue(fCurrent_owner));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fAttribute, fCurrent_attribute, fOwner, fCurrent_owner);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Current_attribute_owner.Match)) {
          Current_attribute_owner.Match other = (Current_attribute_owner.Match) obj;
          return Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fCurrent_attribute, other.fCurrent_attribute) && Objects.equals(fOwner, other.fOwner) && Objects.equals(fCurrent_owner, other.fCurrent_owner);
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
    public Current_attribute_owner specification() {
      return Current_attribute_owner.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Current_attribute_owner.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Current_attribute_owner.Match newMutableMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return new Mutable(pAttribute, pCurrent_attribute, pOwner, pCurrent_owner);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Current_attribute_owner.Match newMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return new Immutable(pAttribute, pCurrent_attribute, pOwner, pCurrent_owner);
    }
    
    private static final class Mutable extends Current_attribute_owner.Match {
      Mutable(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
        super(pAttribute, pCurrent_attribute, pOwner, pCurrent_owner);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Current_attribute_owner.Match {
      Immutable(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
        super(pAttribute, pCurrent_attribute, pOwner, pCurrent_owner);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_attribute_owner pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - owner - current
   * pattern current_attribute_owner (attribute : TraceLink, current_attribute : Attribute, owner : TraceLink, current_owner : Class) {
   * 	find current_structuralFeature_owner (attribute, current_attribute, owner, current_owner);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Current_attribute_owner
   * 
   */
  public static class Matcher extends BaseMatcher<Current_attribute_owner.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Current_attribute_owner.Matcher on(final ViatraQueryEngine engine) {
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
    public static Current_attribute_owner.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ATTRIBUTE = 0;
    
    private final static int POSITION_CURRENT_ATTRIBUTE = 1;
    
    private final static int POSITION_OWNER = 2;
    
    private final static int POSITION_CURRENT_OWNER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Current_attribute_owner.Matcher.class);
    
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
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Current_attribute_owner.Match> getAllMatches(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawGetAllMatches(new Object[]{pAttribute, pCurrent_attribute, pOwner, pCurrent_owner});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Current_attribute_owner.Match getOneArbitraryMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawGetOneArbitraryMatch(new Object[]{pAttribute, pCurrent_attribute, pOwner, pCurrent_owner});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawHasMatch(new Object[]{pAttribute, pCurrent_attribute, pOwner, pCurrent_owner});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawCountMatches(new Object[]{pAttribute, pCurrent_attribute, pOwner, pCurrent_owner});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner, final IMatchProcessor<? super Current_attribute_owner.Match> processor) {
      rawForEachMatch(new Object[]{pAttribute, pCurrent_attribute, pOwner, pCurrent_owner}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner, final IMatchProcessor<? super Current_attribute_owner.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttribute, pCurrent_attribute, pOwner, pCurrent_owner}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pCurrent_attribute the fixed value of pattern parameter current_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pCurrent_owner the fixed value of pattern parameter current_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Current_attribute_owner.Match newMatch(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return Current_attribute_owner.Match.newMatch(pAttribute, pCurrent_attribute, pOwner, pCurrent_owner);
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfattribute(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute() {
      return rawAccumulateAllValuesOfattribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final Current_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      null, 
      pCurrent_attribute, 
      pOwner, 
      pCurrent_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfcurrent_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_CURRENT_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute() {
      return rawAccumulateAllValuesOfcurrent_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute(final Current_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfcurrent_attribute(final TraceLink pAttribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfcurrent_attribute(new Object[]{
      pAttribute, 
      null, 
      pOwner, 
      pCurrent_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfowner(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_OWNER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner() {
      return rawAccumulateAllValuesOfowner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner(final Current_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfowner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner(final TraceLink pAttribute, final Attribute pCurrent_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner) {
      return rawAccumulateAllValuesOfowner(new Object[]{
      pAttribute, 
      pCurrent_attribute, 
      null, 
      pCurrent_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_owner(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_OWNER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner() {
      return rawAccumulateAllValuesOfcurrent_owner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner(final Current_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_owner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_owner(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner) {
      return rawAccumulateAllValuesOfcurrent_owner(new Object[]{
      pAttribute, 
      pCurrent_attribute, 
      pOwner, 
      null
      });
    }
    
    @Override
    protected Current_attribute_owner.Match tupleToMatch(final Tuple t) {
      try {
          return Current_attribute_owner.Match.newMatch((TraceLink) t.get(POSITION_ATTRIBUTE), (Attribute) t.get(POSITION_CURRENT_ATTRIBUTE), (TraceLink) t.get(POSITION_OWNER), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_OWNER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_attribute_owner.Match arrayToMatch(final Object[] match) {
      try {
          return Current_attribute_owner.Match.newMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_OWNER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Current_attribute_owner.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Current_attribute_owner.Match.newMutableMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_CURRENT_ATTRIBUTE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_OWNER]);
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
    public static IQuerySpecification<Current_attribute_owner.Matcher> querySpecification() {
      return Current_attribute_owner.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_attribute_owner pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Current_attribute_owner.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pCurrent_attribute the value of pattern parameter current_attribute in the currently processed match
     * @param pOwner the value of pattern parameter owner in the currently processed match
     * @param pCurrent_owner the value of pattern parameter current_owner in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pAttribute, final Attribute pCurrent_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_owner);
    
    @Override
    public void process(final Current_attribute_owner.Match match) {
      process(match.getAttribute(), match.getCurrent_attribute(), match.getOwner(), match.getCurrent_owner());
    }
  }
  
  private Current_attribute_owner() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Current_attribute_owner instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Current_attribute_owner.Matcher instantiate(final ViatraQueryEngine engine) {
    return Current_attribute_owner.Matcher.on(engine);
  }
  
  @Override
  public Current_attribute_owner.Matcher instantiate() {
    return Current_attribute_owner.Matcher.create();
  }
  
  @Override
  public Current_attribute_owner.Match newEmptyMatch() {
    return Current_attribute_owner.Match.newEmptyMatch();
  }
  
  @Override
  public Current_attribute_owner.Match newMatch(final Object... parameters) {
    return Current_attribute_owner.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_owner (visibility: PUBLIC, simpleName: Current_attribute_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_owner (visibility: PUBLIC, simpleName: Current_attribute_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Current_attribute_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Current_attribute_owner INSTANCE = new Current_attribute_owner();
    
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
    private final static Current_attribute_owner.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attribute = new PParameter("current_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOwner = new PParameter("owner", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_owner = new PParameter("current_owner", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pAttribute, parameter_pCurrent_attribute, parameter_pOwner, parameter_pCurrent_owner);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.current_attribute_owner";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attribute","current_attribute","owner","current_owner");
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
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          PVariable var_current_attribute = body.getOrCreateVariableByName("current_attribute");
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          PVariable var_current_owner = body.getOrCreateVariableByName("current_owner");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_current_attribute, parameter_pCurrent_attribute),
             new ExportedParameter(body, var_owner, parameter_pOwner),
             new ExportedParameter(body, var_current_owner, parameter_pCurrent_owner)
          ));
          // 	find current_structuralFeature_owner (attribute, current_attribute, owner, current_owner)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_current_attribute, var_owner, var_current_owner), Current_structuralFeature_owner.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
