/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Enumeration.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Deleted_enumerationLiteral;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Enumeration_literal;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_enumerationLiteral;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:33+0100")
public final class Removed_enumeration_literal extends BaseGeneratedEMFQuerySpecification<Removed_enumeration_literal.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.removed_enumeration_literal pattern,
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
    private Enumeration fInitial_enumeration;
    
    private Enumeration fCurrent_enumeration;
    
    private EnumerationLiteral fInitial_literal;
    
    private static List<String> parameterNames = makeImmutableList("initial_enumeration", "current_enumeration", "initial_literal");
    
    private Match(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      this.fInitial_enumeration = pInitial_enumeration;
      this.fCurrent_enumeration = pCurrent_enumeration;
      this.fInitial_literal = pInitial_literal;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_enumeration".equals(parameterName)) return this.fInitial_enumeration;
      if ("current_enumeration".equals(parameterName)) return this.fCurrent_enumeration;
      if ("initial_literal".equals(parameterName)) return this.fInitial_literal;
      return null;
    }
    
    public Enumeration getInitial_enumeration() {
      return this.fInitial_enumeration;
    }
    
    public Enumeration getCurrent_enumeration() {
      return this.fCurrent_enumeration;
    }
    
    public EnumerationLiteral getInitial_literal() {
      return this.fInitial_literal;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_enumeration".equals(parameterName) ) {
          this.fInitial_enumeration = (Enumeration) newValue;
          return true;
      }
      if ("current_enumeration".equals(parameterName) ) {
          this.fCurrent_enumeration = (Enumeration) newValue;
          return true;
      }
      if ("initial_literal".equals(parameterName) ) {
          this.fInitial_literal = (EnumerationLiteral) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_enumeration(final Enumeration pInitial_enumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_enumeration = pInitial_enumeration;
    }
    
    public void setCurrent_enumeration(final Enumeration pCurrent_enumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_enumeration = pCurrent_enumeration;
    }
    
    public void setInitial_literal(final EnumerationLiteral pInitial_literal) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_literal = pInitial_literal;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.removed_enumeration_literal";
    }
    
    @Override
    public List<String> parameterNames() {
      return Removed_enumeration_literal.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_enumeration, fCurrent_enumeration, fInitial_literal};
    }
    
    @Override
    public Removed_enumeration_literal.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_enumeration, fCurrent_enumeration, fInitial_literal) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_enumeration\"=" + prettyPrintValue(fInitial_enumeration) + ", ");
      result.append("\"current_enumeration\"=" + prettyPrintValue(fCurrent_enumeration) + ", ");
      result.append("\"initial_literal\"=" + prettyPrintValue(fInitial_literal));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_enumeration, fCurrent_enumeration, fInitial_literal);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Removed_enumeration_literal.Match)) {
          Removed_enumeration_literal.Match other = (Removed_enumeration_literal.Match) obj;
          return Objects.equals(fInitial_enumeration, other.fInitial_enumeration) && Objects.equals(fCurrent_enumeration, other.fCurrent_enumeration) && Objects.equals(fInitial_literal, other.fInitial_literal);
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
    public Removed_enumeration_literal specification() {
      return Removed_enumeration_literal.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Removed_enumeration_literal.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Removed_enumeration_literal.Match newMutableMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return new Mutable(pInitial_enumeration, pCurrent_enumeration, pInitial_literal);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Removed_enumeration_literal.Match newMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return new Immutable(pInitial_enumeration, pCurrent_enumeration, pInitial_literal);
    }
    
    private static final class Mutable extends Removed_enumeration_literal.Match {
      Mutable(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
        super(pInitial_enumeration, pCurrent_enumeration, pInitial_literal);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Removed_enumeration_literal.Match {
      Immutable(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
        super(pInitial_enumeration, pCurrent_enumeration, pInitial_literal);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.removed_enumeration_literal pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration - literals - removed
   * pattern removed_enumeration_literal (initial_enumeration : Enumeration, current_enumeration : Enumeration, initial_literal : EnumerationLiteral) {
   * 	find preserved_enumeration (initial_enumeration, current_enumeration); 
   * 	find deleted_enumerationLiteral (initial_literal); 
   * 	find enumeration_literal (initial_enumeration, initial_literal); 
   * } or {
   * 	find preserved_enumeration (initial_enumeration, current_enumeration); 
   * 	find preserved_enumerationLiteral (initial_literal, current_literal); 
   * 	find enumeration_literal (initial_enumeration, initial_literal); 
   * 	neg find enumeration_literal (current_enumeration, current_literal); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Removed_enumeration_literal
   * 
   */
  public static class Matcher extends BaseMatcher<Removed_enumeration_literal.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Removed_enumeration_literal.Matcher on(final ViatraQueryEngine engine) {
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
    public static Removed_enumeration_literal.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_ENUMERATION = 0;
    
    private final static int POSITION_CURRENT_ENUMERATION = 1;
    
    private final static int POSITION_INITIAL_LITERAL = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Removed_enumeration_literal.Matcher.class);
    
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
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Removed_enumeration_literal.Match> getAllMatches(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return rawGetAllMatches(new Object[]{pInitial_enumeration, pCurrent_enumeration, pInitial_literal});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Removed_enumeration_literal.Match getOneArbitraryMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration, pInitial_literal});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return rawHasMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration, pInitial_literal});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return rawCountMatches(new Object[]{pInitial_enumeration, pCurrent_enumeration, pInitial_literal});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal, final IMatchProcessor<? super Removed_enumeration_literal.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration, pInitial_literal}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal, final IMatchProcessor<? super Removed_enumeration_literal.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_enumeration, pCurrent_enumeration, pInitial_literal}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_enumeration the fixed value of pattern parameter initial_enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pInitial_literal the fixed value of pattern parameter initial_literal, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Removed_enumeration_literal.Match newMatch(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return Removed_enumeration_literal.Match.newMatch(pInitial_enumeration, pCurrent_enumeration, pInitial_literal);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Enumeration> rawAccumulateAllValuesOfinitial_enumeration(final Object[] parameters) {
      Set<Enumeration> results = new HashSet<Enumeration>();
      rawAccumulateAllValues(POSITION_INITIAL_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfinitial_enumeration() {
      return rawAccumulateAllValuesOfinitial_enumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfinitial_enumeration(final Removed_enumeration_literal.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_enumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfinitial_enumeration(final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal) {
      return rawAccumulateAllValuesOfinitial_enumeration(new Object[]{
      null, 
      pCurrent_enumeration, 
      pInitial_literal
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Enumeration> rawAccumulateAllValuesOfcurrent_enumeration(final Object[] parameters) {
      Set<Enumeration> results = new HashSet<Enumeration>();
      rawAccumulateAllValues(POSITION_CURRENT_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration() {
      return rawAccumulateAllValuesOfcurrent_enumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final Removed_enumeration_literal.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_enumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final Enumeration pInitial_enumeration, final EnumerationLiteral pInitial_literal) {
      return rawAccumulateAllValuesOfcurrent_enumeration(new Object[]{
      pInitial_enumeration, 
      null, 
      pInitial_literal
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EnumerationLiteral> rawAccumulateAllValuesOfinitial_literal(final Object[] parameters) {
      Set<EnumerationLiteral> results = new HashSet<EnumerationLiteral>();
      rawAccumulateAllValues(POSITION_INITIAL_LITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_literal() {
      return rawAccumulateAllValuesOfinitial_literal(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_literal(final Removed_enumeration_literal.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_literal(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_literal.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfinitial_literal(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration) {
      return rawAccumulateAllValuesOfinitial_literal(new Object[]{
      pInitial_enumeration, 
      pCurrent_enumeration, 
      null
      });
    }
    
    @Override
    protected Removed_enumeration_literal.Match tupleToMatch(final Tuple t) {
      try {
          return Removed_enumeration_literal.Match.newMatch((Enumeration) t.get(POSITION_INITIAL_ENUMERATION), (Enumeration) t.get(POSITION_CURRENT_ENUMERATION), (EnumerationLiteral) t.get(POSITION_INITIAL_LITERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Removed_enumeration_literal.Match arrayToMatch(final Object[] match) {
      try {
          return Removed_enumeration_literal.Match.newMatch((Enumeration) match[POSITION_INITIAL_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION], (EnumerationLiteral) match[POSITION_INITIAL_LITERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Removed_enumeration_literal.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Removed_enumeration_literal.Match.newMutableMatch((Enumeration) match[POSITION_INITIAL_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION], (EnumerationLiteral) match[POSITION_INITIAL_LITERAL]);
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
    public static IQuerySpecification<Removed_enumeration_literal.Matcher> querySpecification() {
      return Removed_enumeration_literal.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.removed_enumeration_literal pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Removed_enumeration_literal.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_enumeration the value of pattern parameter initial_enumeration in the currently processed match
     * @param pCurrent_enumeration the value of pattern parameter current_enumeration in the currently processed match
     * @param pInitial_literal the value of pattern parameter initial_literal in the currently processed match
     * 
     */
    public abstract void process(final Enumeration pInitial_enumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pInitial_literal);
    
    @Override
    public void process(final Removed_enumeration_literal.Match match) {
      process(match.getInitial_enumeration(), match.getCurrent_enumeration(), match.getInitial_literal());
    }
  }
  
  private Removed_enumeration_literal() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Removed_enumeration_literal instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Removed_enumeration_literal.Matcher instantiate(final ViatraQueryEngine engine) {
    return Removed_enumeration_literal.Matcher.on(engine);
  }
  
  @Override
  public Removed_enumeration_literal.Matcher instantiate() {
    return Removed_enumeration_literal.Matcher.create();
  }
  
  @Override
  public Removed_enumeration_literal.Match newEmptyMatch() {
    return Removed_enumeration_literal.Match.newEmptyMatch();
  }
  
  @Override
  public Removed_enumeration_literal.Match newMatch(final Object... parameters) {
    return Removed_enumeration_literal.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_enumeration_literal (visibility: PUBLIC, simpleName: Removed_enumeration_literal, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_enumeration_literal, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_enumeration_literal (visibility: PUBLIC, simpleName: Removed_enumeration_literal, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_enumeration_literal, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Removed_enumeration_literal INSTANCE = new Removed_enumeration_literal();
    
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
    private final static Removed_enumeration_literal.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_enumeration = new PParameter("initial_enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_enumeration = new PParameter("current_enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_literal = new PParameter("initial_literal", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_enumeration, parameter_pCurrent_enumeration, parameter_pInitial_literal);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.removed_enumeration_literal";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_enumeration","current_enumeration","initial_literal");
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
          PVariable var_initial_enumeration = body.getOrCreateVariableByName("initial_enumeration");
          PVariable var_current_enumeration = body.getOrCreateVariableByName("current_enumeration");
          PVariable var_initial_literal = body.getOrCreateVariableByName("initial_literal");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_enumeration, parameter_pInitial_enumeration),
             new ExportedParameter(body, var_current_enumeration, parameter_pCurrent_enumeration),
             new ExportedParameter(body, var_initial_literal, parameter_pInitial_literal)
          ));
          // 	find preserved_enumeration (initial_enumeration, current_enumeration)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_enumeration, var_current_enumeration), Preserved_enumeration.instance().getInternalQueryRepresentation());
          //  	find deleted_enumerationLiteral (initial_literal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_literal), Deleted_enumerationLiteral.instance().getInternalQueryRepresentation());
          //  	find enumeration_literal (initial_enumeration, initial_literal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_enumeration, var_initial_literal), Enumeration_literal.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      {
          PBody body = new PBody(this);
          PVariable var_initial_enumeration = body.getOrCreateVariableByName("initial_enumeration");
          PVariable var_current_enumeration = body.getOrCreateVariableByName("current_enumeration");
          PVariable var_initial_literal = body.getOrCreateVariableByName("initial_literal");
          PVariable var_current_literal = body.getOrCreateVariableByName("current_literal");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_literal), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_enumeration, parameter_pInitial_enumeration),
             new ExportedParameter(body, var_current_enumeration, parameter_pCurrent_enumeration),
             new ExportedParameter(body, var_initial_literal, parameter_pInitial_literal)
          ));
          // 	find preserved_enumeration (initial_enumeration, current_enumeration)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_enumeration, var_current_enumeration), Preserved_enumeration.instance().getInternalQueryRepresentation());
          //  	find preserved_enumerationLiteral (initial_literal, current_literal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_literal, var_current_literal), Preserved_enumerationLiteral.instance().getInternalQueryRepresentation());
          //  	find enumeration_literal (initial_enumeration, initial_literal)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_enumeration, var_initial_literal), Enumeration_literal.instance().getInternalQueryRepresentation());
          //  	neg find enumeration_literal (current_enumeration, current_literal)
          new NegativePatternCall(body, Tuples.flatTupleOf(var_current_enumeration, var_current_literal), Enumeration_literal.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
