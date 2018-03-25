/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

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
import se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:20+0200")
public final class MergeReferencesPostcondition extends BaseGeneratedEMFQuerySpecification<MergeReferencesPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition pattern,
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
    private TraceLink f$class;
    
    private TraceLink f$left_reference;
    
    private TraceLink f$right_reference;
    
    private static List<String> parameterNames = makeImmutableList("$class", "$left_reference", "$right_reference");
    
    private Match(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      this.f$class = p$class;
      this.f$left_reference = p$left_reference;
      this.f$right_reference = p$right_reference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$left_reference".equals(parameterName)) return this.f$left_reference;
      if ("$right_reference".equals(parameterName)) return this.f$right_reference;
      return null;
    }
    
    public TraceLink get$class() {
      return this.f$class;
    }
    
    public TraceLink get$left_reference() {
      return this.f$left_reference;
    }
    
    public TraceLink get$right_reference() {
      return this.f$right_reference;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$class".equals(parameterName) ) {
          this.f$class = (TraceLink) newValue;
          return true;
      }
      if ("$left_reference".equals(parameterName) ) {
          this.f$left_reference = (TraceLink) newValue;
          return true;
      }
      if ("$right_reference".equals(parameterName) ) {
          this.f$right_reference = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void set$class(final TraceLink p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    public void set$left_reference(final TraceLink p$left_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$left_reference = p$left_reference;
    }
    
    public void set$right_reference(final TraceLink p$right_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$right_reference = p$right_reference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return MergeReferencesPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$class, f$left_reference, f$right_reference};
    }
    
    @Override
    public MergeReferencesPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$class, f$left_reference, f$right_reference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$left_reference\"=" + prettyPrintValue(f$left_reference) + ", ");
      result.append("\"$right_reference\"=" + prettyPrintValue(f$right_reference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$class, f$left_reference, f$right_reference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof MergeReferencesPostcondition.Match)) {
          MergeReferencesPostcondition.Match other = (MergeReferencesPostcondition.Match) obj;
          return Objects.equals(f$class, other.f$class) && Objects.equals(f$left_reference, other.f$left_reference) && Objects.equals(f$right_reference, other.f$right_reference);
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
    public MergeReferencesPostcondition specification() {
      return MergeReferencesPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static MergeReferencesPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static MergeReferencesPostcondition.Match newMutableMatch(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return new Mutable(p$class, p$left_reference, p$right_reference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static MergeReferencesPostcondition.Match newMatch(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return new Immutable(p$class, p$left_reference, p$right_reference);
    }
    
    private static final class Mutable extends MergeReferencesPostcondition.Match {
      Mutable(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
        super(p$class, p$left_reference, p$right_reference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends MergeReferencesPostcondition.Match {
      Immutable(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
        super(p$class, p$left_reference, p$right_reference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCCR16 - Merge References - Postcondition
   * pattern MergeReferencesPostcondition ($class : TraceLink, $left_reference : TraceLink, $right_reference : TraceLink) {
   * 	find merge_class_reference ($class, $class, $left_reference, $right_reference, $class);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see MergeReferencesPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<MergeReferencesPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static MergeReferencesPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static MergeReferencesPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$CLASS = 0;
    
    private final static int POSITION_$LEFT_REFERENCE = 1;
    
    private final static int POSITION_$RIGHT_REFERENCE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(MergeReferencesPostcondition.Matcher.class);
    
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
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<MergeReferencesPostcondition.Match> getAllMatches(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return rawGetAllMatches(new Object[]{p$class, p$left_reference, p$right_reference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public MergeReferencesPostcondition.Match getOneArbitraryMatch(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return rawGetOneArbitraryMatch(new Object[]{p$class, p$left_reference, p$right_reference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return rawHasMatch(new Object[]{p$class, p$left_reference, p$right_reference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return rawCountMatches(new Object[]{p$class, p$left_reference, p$right_reference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference, final IMatchProcessor<? super MergeReferencesPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$class, p$left_reference, p$right_reference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference, final IMatchProcessor<? super MergeReferencesPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$class, p$left_reference, p$right_reference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$left_reference the fixed value of pattern parameter $left_reference, or null if not bound.
     * @param p$right_reference the fixed value of pattern parameter $right_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public MergeReferencesPostcondition.Match newMatch(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return MergeReferencesPostcondition.Match.newMatch(p$class, p$left_reference, p$right_reference);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$class(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class() {
      return rawAccumulateAllValuesOf$class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final MergeReferencesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$left_reference, final TraceLink p$right_reference) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      null, 
      p$left_reference, 
      p$right_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$left_reference(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$LEFT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$left_reference() {
      return rawAccumulateAllValuesOf$left_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$left_reference(final MergeReferencesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$left_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $left_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$left_reference(final TraceLink p$class, final TraceLink p$right_reference) {
      return rawAccumulateAllValuesOf$left_reference(new Object[]{
      p$class, 
      null, 
      p$right_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$right_reference(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$RIGHT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$right_reference() {
      return rawAccumulateAllValuesOf$right_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$right_reference(final MergeReferencesPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$right_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $right_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$right_reference(final TraceLink p$class, final TraceLink p$left_reference) {
      return rawAccumulateAllValuesOf$right_reference(new Object[]{
      p$class, 
      p$left_reference, 
      null
      });
    }
    
    @Override
    protected MergeReferencesPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return MergeReferencesPostcondition.Match.newMatch((TraceLink) t.get(POSITION_$CLASS), (TraceLink) t.get(POSITION_$LEFT_REFERENCE), (TraceLink) t.get(POSITION_$RIGHT_REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeReferencesPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return MergeReferencesPostcondition.Match.newMatch((TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$LEFT_REFERENCE], (TraceLink) match[POSITION_$RIGHT_REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected MergeReferencesPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return MergeReferencesPostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$LEFT_REFERENCE], (TraceLink) match[POSITION_$RIGHT_REFERENCE]);
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
    public static IQuerySpecification<MergeReferencesPostcondition.Matcher> querySpecification() {
      return MergeReferencesPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<MergeReferencesPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$left_reference the value of pattern parameter $left_reference in the currently processed match
     * @param p$right_reference the value of pattern parameter $right_reference in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$class, final TraceLink p$left_reference, final TraceLink p$right_reference);
    
    @Override
    public void process(final MergeReferencesPostcondition.Match match) {
      process(match.get$class(), match.get$left_reference(), match.get$right_reference());
    }
  }
  
  private MergeReferencesPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static MergeReferencesPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected MergeReferencesPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return MergeReferencesPostcondition.Matcher.on(engine);
  }
  
  @Override
  public MergeReferencesPostcondition.Matcher instantiate() {
    return MergeReferencesPostcondition.Matcher.create();
  }
  
  @Override
  public MergeReferencesPostcondition.Match newEmptyMatch() {
    return MergeReferencesPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public MergeReferencesPostcondition.Match newMatch(final Object... parameters) {
    return MergeReferencesPostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition (visibility: PUBLIC, simpleName: MergeReferencesPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition (visibility: PUBLIC, simpleName: MergeReferencesPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static MergeReferencesPostcondition INSTANCE = new MergeReferencesPostcondition();
    
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
    private final static MergeReferencesPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$left_reference = new PParameter("$left_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$right_reference = new PParameter("$right_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$class, parameter_p$left_reference, parameter_p$right_reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.MergeReferencesPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$class","$left_reference","$right_reference");
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
          PVariable var_$class = body.getOrCreateVariableByName("$class");
          PVariable var_$left_reference = body.getOrCreateVariableByName("$left_reference");
          PVariable var_$right_reference = body.getOrCreateVariableByName("$right_reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$left_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$right_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$left_reference, parameter_p$left_reference),
             new ExportedParameter(body, var_$right_reference, parameter_p$right_reference)
          ));
          // 	find merge_class_reference ($class, $class, $left_reference, $right_reference, $class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$class, var_$left_reference, var_$right_reference, var_$class), Merge_class_reference.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
