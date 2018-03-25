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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_structuralFeature_owner;
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
public final class Initial_attribute_owner extends BaseGeneratedEMFQuerySpecification<Initial_attribute_owner.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute_owner pattern,
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
    
    private Attribute fInitial_attribute;
    
    private TraceLink fOwner;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_owner;
    
    private static List<String> parameterNames = makeImmutableList("attribute", "initial_attribute", "owner", "initial_owner");
    
    private Match(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      this.fAttribute = pAttribute;
      this.fInitial_attribute = pInitial_attribute;
      this.fOwner = pOwner;
      this.fInitial_owner = pInitial_owner;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("initial_attribute".equals(parameterName)) return this.fInitial_attribute;
      if ("owner".equals(parameterName)) return this.fOwner;
      if ("initial_owner".equals(parameterName)) return this.fInitial_owner;
      return null;
    }
    
    public TraceLink getAttribute() {
      return this.fAttribute;
    }
    
    public Attribute getInitial_attribute() {
      return this.fInitial_attribute;
    }
    
    public TraceLink getOwner() {
      return this.fOwner;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_owner() {
      return this.fInitial_owner;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (TraceLink) newValue;
          return true;
      }
      if ("initial_attribute".equals(parameterName) ) {
          this.fInitial_attribute = (Attribute) newValue;
          return true;
      }
      if ("owner".equals(parameterName) ) {
          this.fOwner = (TraceLink) newValue;
          return true;
      }
      if ("initial_owner".equals(parameterName) ) {
          this.fInitial_owner = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setAttribute(final TraceLink pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setInitial_attribute(final Attribute pInitial_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_attribute = pInitial_attribute;
    }
    
    public void setOwner(final TraceLink pOwner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOwner = pOwner;
    }
    
    public void setInitial_owner(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_owner = pInitial_owner;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute_owner";
    }
    
    @Override
    public List<String> parameterNames() {
      return Initial_attribute_owner.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fAttribute, fInitial_attribute, fOwner, fInitial_owner};
    }
    
    @Override
    public Initial_attribute_owner.Match toImmutable() {
      return isMutable() ? newMatch(fAttribute, fInitial_attribute, fOwner, fInitial_owner) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"initial_attribute\"=" + prettyPrintValue(fInitial_attribute) + ", ");
      result.append("\"owner\"=" + prettyPrintValue(fOwner) + ", ");
      result.append("\"initial_owner\"=" + prettyPrintValue(fInitial_owner));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fAttribute, fInitial_attribute, fOwner, fInitial_owner);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Initial_attribute_owner.Match)) {
          Initial_attribute_owner.Match other = (Initial_attribute_owner.Match) obj;
          return Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fInitial_attribute, other.fInitial_attribute) && Objects.equals(fOwner, other.fOwner) && Objects.equals(fInitial_owner, other.fInitial_owner);
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
    public Initial_attribute_owner specification() {
      return Initial_attribute_owner.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Initial_attribute_owner.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Initial_attribute_owner.Match newMutableMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return new Mutable(pAttribute, pInitial_attribute, pOwner, pInitial_owner);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Initial_attribute_owner.Match newMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return new Immutable(pAttribute, pInitial_attribute, pOwner, pInitial_owner);
    }
    
    private static final class Mutable extends Initial_attribute_owner.Match {
      Mutable(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
        super(pAttribute, pInitial_attribute, pOwner, pInitial_owner);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Initial_attribute_owner.Match {
      Immutable(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
        super(pAttribute, pInitial_attribute, pOwner, pInitial_owner);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute_owner pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // attribute - owner - initial
   * pattern initial_attribute_owner (attribute : TraceLink, initial_attribute : Attribute, owner : TraceLink, initial_owner : Class) {
   * 	find initial_structuralFeature_owner (attribute, initial_attribute, owner, initial_owner);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Initial_attribute_owner
   * 
   */
  public static class Matcher extends BaseMatcher<Initial_attribute_owner.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Initial_attribute_owner.Matcher on(final ViatraQueryEngine engine) {
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
    public static Initial_attribute_owner.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ATTRIBUTE = 0;
    
    private final static int POSITION_INITIAL_ATTRIBUTE = 1;
    
    private final static int POSITION_OWNER = 2;
    
    private final static int POSITION_INITIAL_OWNER = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Initial_attribute_owner.Matcher.class);
    
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
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Initial_attribute_owner.Match> getAllMatches(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawGetAllMatches(new Object[]{pAttribute, pInitial_attribute, pOwner, pInitial_owner});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Initial_attribute_owner.Match getOneArbitraryMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawGetOneArbitraryMatch(new Object[]{pAttribute, pInitial_attribute, pOwner, pInitial_owner});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawHasMatch(new Object[]{pAttribute, pInitial_attribute, pOwner, pInitial_owner});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawCountMatches(new Object[]{pAttribute, pInitial_attribute, pOwner, pInitial_owner});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final IMatchProcessor<? super Initial_attribute_owner.Match> processor) {
      rawForEachMatch(new Object[]{pAttribute, pInitial_attribute, pOwner, pInitial_owner}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner, final IMatchProcessor<? super Initial_attribute_owner.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pAttribute, pInitial_attribute, pOwner, pInitial_owner}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param pInitial_owner the fixed value of pattern parameter initial_owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Initial_attribute_owner.Match newMatch(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return Initial_attribute_owner.Match.newMatch(pAttribute, pInitial_attribute, pOwner, pInitial_owner);
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
    public Set<TraceLink> getAllValuesOfattribute(final Initial_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfattribute(final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      null, 
      pInitial_attribute, 
      pOwner, 
      pInitial_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfinitial_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_INITIAL_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute() {
      return rawAccumulateAllValuesOfinitial_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final Initial_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final TraceLink pAttribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawAccumulateAllValuesOfinitial_attribute(new Object[]{
      pAttribute, 
      null, 
      pOwner, 
      pInitial_owner
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
    public Set<TraceLink> getAllValuesOfowner(final Initial_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfowner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfowner(final TraceLink pAttribute, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner) {
      return rawAccumulateAllValuesOfowner(new Object[]{
      pAttribute, 
      pInitial_attribute, 
      null, 
      pInitial_owner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_owner(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_OWNER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner() {
      return rawAccumulateAllValuesOfinitial_owner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner(final Initial_attribute_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_owner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_owner(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner) {
      return rawAccumulateAllValuesOfinitial_owner(new Object[]{
      pAttribute, 
      pInitial_attribute, 
      pOwner, 
      null
      });
    }
    
    @Override
    protected Initial_attribute_owner.Match tupleToMatch(final Tuple t) {
      try {
          return Initial_attribute_owner.Match.newMatch((TraceLink) t.get(POSITION_ATTRIBUTE), (Attribute) t.get(POSITION_INITIAL_ATTRIBUTE), (TraceLink) t.get(POSITION_OWNER), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_OWNER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_attribute_owner.Match arrayToMatch(final Object[] match) {
      try {
          return Initial_attribute_owner.Match.newMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_INITIAL_ATTRIBUTE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_OWNER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Initial_attribute_owner.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Initial_attribute_owner.Match.newMutableMatch((TraceLink) match[POSITION_ATTRIBUTE], (Attribute) match[POSITION_INITIAL_ATTRIBUTE], (TraceLink) match[POSITION_OWNER], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_OWNER]);
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
    public static IQuerySpecification<Initial_attribute_owner.Matcher> querySpecification() {
      return Initial_attribute_owner.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute_owner pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Initial_attribute_owner.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pInitial_attribute the value of pattern parameter initial_attribute in the currently processed match
     * @param pOwner the value of pattern parameter owner in the currently processed match
     * @param pInitial_owner the value of pattern parameter initial_owner in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pAttribute, final Attribute pInitial_attribute, final TraceLink pOwner, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_owner);
    
    @Override
    public void process(final Initial_attribute_owner.Match match) {
      process(match.getAttribute(), match.getInitial_attribute(), match.getOwner(), match.getInitial_owner());
    }
  }
  
  private Initial_attribute_owner() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Initial_attribute_owner instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Initial_attribute_owner.Matcher instantiate(final ViatraQueryEngine engine) {
    return Initial_attribute_owner.Matcher.on(engine);
  }
  
  @Override
  public Initial_attribute_owner.Matcher instantiate() {
    return Initial_attribute_owner.Matcher.create();
  }
  
  @Override
  public Initial_attribute_owner.Match newEmptyMatch() {
    return Initial_attribute_owner.Match.newEmptyMatch();
  }
  
  @Override
  public Initial_attribute_owner.Match newMatch(final Object... parameters) {
    return Initial_attribute_owner.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_owner (visibility: PUBLIC, simpleName: Initial_attribute_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_owner (visibility: PUBLIC, simpleName: Initial_attribute_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Initial_attribute_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Initial_attribute_owner INSTANCE = new Initial_attribute_owner();
    
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
    private final static Initial_attribute_owner.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_attribute = new PParameter("initial_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOwner = new PParameter("owner", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_owner = new PParameter("initial_owner", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pAttribute, parameter_pInitial_attribute, parameter_pOwner, parameter_pInitial_owner);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.initial_attribute_owner";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("attribute","initial_attribute","owner","initial_owner");
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
          PVariable var_initial_attribute = body.getOrCreateVariableByName("initial_attribute");
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          PVariable var_initial_owner = body.getOrCreateVariableByName("initial_owner");
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_initial_attribute, parameter_pInitial_attribute),
             new ExportedParameter(body, var_owner, parameter_pOwner),
             new ExportedParameter(body, var_initial_owner, parameter_pInitial_owner)
          ));
          // 	find initial_structuralFeature_owner (attribute, initial_attribute, owner, initial_owner)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_initial_attribute, var_owner, var_initial_owner), Initial_structuralFeature_owner.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
