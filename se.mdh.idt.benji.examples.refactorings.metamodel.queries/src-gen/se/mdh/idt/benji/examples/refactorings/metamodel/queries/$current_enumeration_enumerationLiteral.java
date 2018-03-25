/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Metamodel.vql
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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumerationLiteral;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:19+0200")
public final class $current_enumeration_enumerationLiteral extends BaseGeneratedEMFQuerySpecification<$current_enumeration_enumerationLiteral.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral pattern,
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
    private TraceLink fEnumeration;
    
    private Enumeration fCurrent_enumeration;
    
    private TraceLink fEnumerationLiteral;
    
    private EnumerationLiteral fCurrent_enumerationLiteral;
    
    private static List<String> parameterNames = makeImmutableList("enumeration", "current_enumeration", "enumerationLiteral", "current_enumerationLiteral");
    
    private Match(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      this.fEnumeration = pEnumeration;
      this.fCurrent_enumeration = pCurrent_enumeration;
      this.fEnumerationLiteral = pEnumerationLiteral;
      this.fCurrent_enumerationLiteral = pCurrent_enumerationLiteral;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("enumeration".equals(parameterName)) return this.fEnumeration;
      if ("current_enumeration".equals(parameterName)) return this.fCurrent_enumeration;
      if ("enumerationLiteral".equals(parameterName)) return this.fEnumerationLiteral;
      if ("current_enumerationLiteral".equals(parameterName)) return this.fCurrent_enumerationLiteral;
      return null;
    }
    
    public TraceLink getEnumeration() {
      return this.fEnumeration;
    }
    
    public Enumeration getCurrent_enumeration() {
      return this.fCurrent_enumeration;
    }
    
    public TraceLink getEnumerationLiteral() {
      return this.fEnumerationLiteral;
    }
    
    public EnumerationLiteral getCurrent_enumerationLiteral() {
      return this.fCurrent_enumerationLiteral;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("enumeration".equals(parameterName) ) {
          this.fEnumeration = (TraceLink) newValue;
          return true;
      }
      if ("current_enumeration".equals(parameterName) ) {
          this.fCurrent_enumeration = (Enumeration) newValue;
          return true;
      }
      if ("enumerationLiteral".equals(parameterName) ) {
          this.fEnumerationLiteral = (TraceLink) newValue;
          return true;
      }
      if ("current_enumerationLiteral".equals(parameterName) ) {
          this.fCurrent_enumerationLiteral = (EnumerationLiteral) newValue;
          return true;
      }
      return false;
    }
    
    public void setEnumeration(final TraceLink pEnumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumeration = pEnumeration;
    }
    
    public void setCurrent_enumeration(final Enumeration pCurrent_enumeration) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_enumeration = pCurrent_enumeration;
    }
    
    public void setEnumerationLiteral(final TraceLink pEnumerationLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEnumerationLiteral = pEnumerationLiteral;
    }
    
    public void setCurrent_enumerationLiteral(final EnumerationLiteral pCurrent_enumerationLiteral) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_enumerationLiteral = pCurrent_enumerationLiteral;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral";
    }
    
    @Override
    public List<String> parameterNames() {
      return $current_enumeration_enumerationLiteral.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fEnumeration, fCurrent_enumeration, fEnumerationLiteral, fCurrent_enumerationLiteral};
    }
    
    @Override
    public $current_enumeration_enumerationLiteral.Match toImmutable() {
      return isMutable() ? newMatch(fEnumeration, fCurrent_enumeration, fEnumerationLiteral, fCurrent_enumerationLiteral) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"enumeration\"=" + prettyPrintValue(fEnumeration) + ", ");
      result.append("\"current_enumeration\"=" + prettyPrintValue(fCurrent_enumeration) + ", ");
      result.append("\"enumerationLiteral\"=" + prettyPrintValue(fEnumerationLiteral) + ", ");
      result.append("\"current_enumerationLiteral\"=" + prettyPrintValue(fCurrent_enumerationLiteral));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fEnumeration, fCurrent_enumeration, fEnumerationLiteral, fCurrent_enumerationLiteral);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof $current_enumeration_enumerationLiteral.Match)) {
          $current_enumeration_enumerationLiteral.Match other = ($current_enumeration_enumerationLiteral.Match) obj;
          return Objects.equals(fEnumeration, other.fEnumeration) && Objects.equals(fCurrent_enumeration, other.fCurrent_enumeration) && Objects.equals(fEnumerationLiteral, other.fEnumerationLiteral) && Objects.equals(fCurrent_enumerationLiteral, other.fCurrent_enumerationLiteral);
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
    public $current_enumeration_enumerationLiteral specification() {
      return $current_enumeration_enumerationLiteral.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static $current_enumeration_enumerationLiteral.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static $current_enumeration_enumerationLiteral.Match newMutableMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return new Mutable(pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static $current_enumeration_enumerationLiteral.Match newMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return new Immutable(pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral);
    }
    
    private static final class Mutable extends $current_enumeration_enumerationLiteral.Match {
      Mutable(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
        super(pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends $current_enumeration_enumerationLiteral.Match {
      Immutable(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
        super(pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // enumeration - enumeration literal - current
   * pattern $current_enumeration_enumerationLiteral (enumeration : TraceLink, current_enumeration : Enumeration, enumerationLiteral : TraceLink, current_enumerationLiteral : EnumerationLiteral) {
   * 	find $current_enumeration (enumeration, current_enumeration); 
   * 	find $current_enumerationLiteral (enumerationLiteral, current_enumerationLiteral);
   * 	Enumeration.enumerationLiterals (current_enumeration, current_enumerationLiteral); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see $current_enumeration_enumerationLiteral
   * 
   */
  public static class Matcher extends BaseMatcher<$current_enumeration_enumerationLiteral.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static $current_enumeration_enumerationLiteral.Matcher on(final ViatraQueryEngine engine) {
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
    public static $current_enumeration_enumerationLiteral.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_ENUMERATION = 0;
    
    private final static int POSITION_CURRENT_ENUMERATION = 1;
    
    private final static int POSITION_ENUMERATIONLITERAL = 2;
    
    private final static int POSITION_CURRENT_ENUMERATIONLITERAL = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger($current_enumeration_enumerationLiteral.Matcher.class);
    
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
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<$current_enumeration_enumerationLiteral.Match> getAllMatches(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return rawGetAllMatches(new Object[]{pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public $current_enumeration_enumerationLiteral.Match getOneArbitraryMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return rawGetOneArbitraryMatch(new Object[]{pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return rawHasMatch(new Object[]{pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return rawCountMatches(new Object[]{pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral, final IMatchProcessor<? super $current_enumeration_enumerationLiteral.Match> processor) {
      rawForEachMatch(new Object[]{pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral, final IMatchProcessor<? super $current_enumeration_enumerationLiteral.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pEnumeration the fixed value of pattern parameter enumeration, or null if not bound.
     * @param pCurrent_enumeration the fixed value of pattern parameter current_enumeration, or null if not bound.
     * @param pEnumerationLiteral the fixed value of pattern parameter enumerationLiteral, or null if not bound.
     * @param pCurrent_enumerationLiteral the fixed value of pattern parameter current_enumerationLiteral, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public $current_enumeration_enumerationLiteral.Match newMatch(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return $current_enumeration_enumerationLiteral.Match.newMatch(pEnumeration, pCurrent_enumeration, pEnumerationLiteral, pCurrent_enumerationLiteral);
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfenumeration(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ENUMERATION, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumeration() {
      return rawAccumulateAllValuesOfenumeration(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumeration(final $current_enumeration_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfenumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumeration(final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return rawAccumulateAllValuesOfenumeration(new Object[]{
      null, 
      pCurrent_enumeration, 
      pEnumerationLiteral, 
      pCurrent_enumerationLiteral
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
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final $current_enumeration_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_enumeration(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumeration.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Enumeration> getAllValuesOfcurrent_enumeration(final TraceLink pEnumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return rawAccumulateAllValuesOfcurrent_enumeration(new Object[]{
      pEnumeration, 
      null, 
      pEnumerationLiteral, 
      pCurrent_enumerationLiteral
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOfenumerationLiteral(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_ENUMERATIONLITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral() {
      return rawAccumulateAllValuesOfenumerationLiteral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral(final $current_enumeration_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfenumerationLiteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOfenumerationLiteral(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final EnumerationLiteral pCurrent_enumerationLiteral) {
      return rawAccumulateAllValuesOfenumerationLiteral(new Object[]{
      pEnumeration, 
      pCurrent_enumeration, 
      null, 
      pCurrent_enumerationLiteral
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<EnumerationLiteral> rawAccumulateAllValuesOfcurrent_enumerationLiteral(final Object[] parameters) {
      Set<EnumerationLiteral> results = new HashSet<EnumerationLiteral>();
      rawAccumulateAllValues(POSITION_CURRENT_ENUMERATIONLITERAL, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfcurrent_enumerationLiteral() {
      return rawAccumulateAllValuesOfcurrent_enumerationLiteral(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfcurrent_enumerationLiteral(final $current_enumeration_enumerationLiteral.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_enumerationLiteral(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_enumerationLiteral.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EnumerationLiteral> getAllValuesOfcurrent_enumerationLiteral(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral) {
      return rawAccumulateAllValuesOfcurrent_enumerationLiteral(new Object[]{
      pEnumeration, 
      pCurrent_enumeration, 
      pEnumerationLiteral, 
      null
      });
    }
    
    @Override
    protected $current_enumeration_enumerationLiteral.Match tupleToMatch(final Tuple t) {
      try {
          return $current_enumeration_enumerationLiteral.Match.newMatch((TraceLink) t.get(POSITION_ENUMERATION), (Enumeration) t.get(POSITION_CURRENT_ENUMERATION), (TraceLink) t.get(POSITION_ENUMERATIONLITERAL), (EnumerationLiteral) t.get(POSITION_CURRENT_ENUMERATIONLITERAL));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_enumeration_enumerationLiteral.Match arrayToMatch(final Object[] match) {
      try {
          return $current_enumeration_enumerationLiteral.Match.newMatch((TraceLink) match[POSITION_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION], (TraceLink) match[POSITION_ENUMERATIONLITERAL], (EnumerationLiteral) match[POSITION_CURRENT_ENUMERATIONLITERAL]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected $current_enumeration_enumerationLiteral.Match arrayToMatchMutable(final Object[] match) {
      try {
          return $current_enumeration_enumerationLiteral.Match.newMutableMatch((TraceLink) match[POSITION_ENUMERATION], (Enumeration) match[POSITION_CURRENT_ENUMERATION], (TraceLink) match[POSITION_ENUMERATIONLITERAL], (EnumerationLiteral) match[POSITION_CURRENT_ENUMERATIONLITERAL]);
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
    public static IQuerySpecification<$current_enumeration_enumerationLiteral.Matcher> querySpecification() {
      return $current_enumeration_enumerationLiteral.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<$current_enumeration_enumerationLiteral.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pEnumeration the value of pattern parameter enumeration in the currently processed match
     * @param pCurrent_enumeration the value of pattern parameter current_enumeration in the currently processed match
     * @param pEnumerationLiteral the value of pattern parameter enumerationLiteral in the currently processed match
     * @param pCurrent_enumerationLiteral the value of pattern parameter current_enumerationLiteral in the currently processed match
     * 
     */
    public abstract void process(final TraceLink pEnumeration, final Enumeration pCurrent_enumeration, final TraceLink pEnumerationLiteral, final EnumerationLiteral pCurrent_enumerationLiteral);
    
    @Override
    public void process(final $current_enumeration_enumerationLiteral.Match match) {
      process(match.getEnumeration(), match.getCurrent_enumeration(), match.getEnumerationLiteral(), match.getCurrent_enumerationLiteral());
    }
  }
  
  private $current_enumeration_enumerationLiteral() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static $current_enumeration_enumerationLiteral instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected $current_enumeration_enumerationLiteral.Matcher instantiate(final ViatraQueryEngine engine) {
    return $current_enumeration_enumerationLiteral.Matcher.on(engine);
  }
  
  @Override
  public $current_enumeration_enumerationLiteral.Matcher instantiate() {
    return $current_enumeration_enumerationLiteral.Matcher.create();
  }
  
  @Override
  public $current_enumeration_enumerationLiteral.Match newEmptyMatch() {
    return $current_enumeration_enumerationLiteral.Match.newEmptyMatch();
  }
  
  @Override
  public $current_enumeration_enumerationLiteral.Match newMatch(final Object... parameters) {
    return $current_enumeration_enumerationLiteral.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral (visibility: PUBLIC, simpleName: $current_enumeration_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral (visibility: PUBLIC, simpleName: $current_enumeration_enumerationLiteral, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static $current_enumeration_enumerationLiteral INSTANCE = new $current_enumeration_enumerationLiteral();
    
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
    private final static $current_enumeration_enumerationLiteral.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pEnumeration = new PParameter("enumeration", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_enumeration = new PParameter("current_enumeration", "se.mdh.idt.benji.examples.refactorings.metamodel.Enumeration", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pEnumerationLiteral = new PParameter("enumerationLiteral", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_enumerationLiteral = new PParameter("current_enumerationLiteral", "se.mdh.idt.benji.examples.refactorings.metamodel.EnumerationLiteral", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pEnumeration, parameter_pCurrent_enumeration, parameter_pEnumerationLiteral, parameter_pCurrent_enumerationLiteral);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.$current_enumeration_enumerationLiteral";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("enumeration","current_enumeration","enumerationLiteral","current_enumerationLiteral");
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
          PVariable var_enumeration = body.getOrCreateVariableByName("enumeration");
          PVariable var_current_enumeration = body.getOrCreateVariableByName("current_enumeration");
          PVariable var_enumerationLiteral = body.getOrCreateVariableByName("enumerationLiteral");
          PVariable var_current_enumerationLiteral = body.getOrCreateVariableByName("current_enumerationLiteral");
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_enumerationLiteral), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumerationLiteral), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_enumeration, parameter_pEnumeration),
             new ExportedParameter(body, var_current_enumeration, parameter_pCurrent_enumeration),
             new ExportedParameter(body, var_enumerationLiteral, parameter_pEnumerationLiteral),
             new ExportedParameter(body, var_current_enumerationLiteral, parameter_pCurrent_enumerationLiteral)
          ));
          // 	find $current_enumeration (enumeration, current_enumeration)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumeration, var_current_enumeration), $current_enumeration.instance().getInternalQueryRepresentation());
          //  	find $current_enumerationLiteral (enumerationLiteral, current_enumerationLiteral)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_enumerationLiteral, var_current_enumerationLiteral), $current_enumerationLiteral.instance().getInternalQueryRepresentation());
          // 	Enumeration.enumerationLiterals (current_enumeration, current_enumerationLiteral)
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumeration), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_enumeration, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Enumeration", "enumerationLiterals")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "EnumerationLiteral")));
          new Equality(body, var__virtual_0_, var_current_enumerationLiteral);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
