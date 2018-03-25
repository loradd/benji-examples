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
import se.mdh.idt.benji.examples.refactorings.internal.Change_attribute_type;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:24+0200")
public final class ChangeAttributeTypePostcondition extends BaseGeneratedEMFQuerySpecification<ChangeAttributeTypePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition pattern,
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
    private TraceLink f$attribute;
    
    private TraceLink f$source_type;
    
    private TraceLink f$target_type;
    
    private static List<String> parameterNames = makeImmutableList("$attribute", "$source_type", "$target_type");
    
    private Match(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      this.f$attribute = p$attribute;
      this.f$source_type = p$source_type;
      this.f$target_type = p$target_type;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      if ("$source_type".equals(parameterName)) return this.f$source_type;
      if ("$target_type".equals(parameterName)) return this.f$target_type;
      return null;
    }
    
    public TraceLink get$attribute() {
      return this.f$attribute;
    }
    
    public TraceLink get$source_type() {
      return this.f$source_type;
    }
    
    public TraceLink get$target_type() {
      return this.f$target_type;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$attribute".equals(parameterName) ) {
          this.f$attribute = (TraceLink) newValue;
          return true;
      }
      if ("$source_type".equals(parameterName) ) {
          this.f$source_type = (TraceLink) newValue;
          return true;
      }
      if ("$target_type".equals(parameterName) ) {
          this.f$target_type = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void set$attribute(final TraceLink p$attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute = p$attribute;
    }
    
    public void set$source_type(final TraceLink p$source_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$source_type = p$source_type;
    }
    
    public void set$target_type(final TraceLink p$target_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$target_type = p$target_type;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ChangeAttributeTypePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$attribute, f$source_type, f$target_type};
    }
    
    @Override
    public ChangeAttributeTypePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$attribute, f$source_type, f$target_type) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute) + ", ");
      result.append("\"$source_type\"=" + prettyPrintValue(f$source_type) + ", ");
      result.append("\"$target_type\"=" + prettyPrintValue(f$target_type));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$attribute, f$source_type, f$target_type);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ChangeAttributeTypePostcondition.Match)) {
          ChangeAttributeTypePostcondition.Match other = (ChangeAttributeTypePostcondition.Match) obj;
          return Objects.equals(f$attribute, other.f$attribute) && Objects.equals(f$source_type, other.f$source_type) && Objects.equals(f$target_type, other.f$target_type);
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
    public ChangeAttributeTypePostcondition specification() {
      return ChangeAttributeTypePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ChangeAttributeTypePostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ChangeAttributeTypePostcondition.Match newMutableMatch(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      return new Mutable(p$attribute, p$source_type, p$target_type);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ChangeAttributeTypePostcondition.Match newMatch(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      return new Immutable(p$attribute, p$source_type, p$target_type);
    }
    
    private static final class Mutable extends ChangeAttributeTypePostcondition.Match {
      Mutable(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
        super(p$attribute, p$source_type, p$target_type);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ChangeAttributeTypePostcondition.Match {
      Immutable(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
        super(p$attribute, p$source_type, p$target_type);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACA12 - Change Attribute Type - Postcondition
   * pattern ChangeAttributeTypePostcondition ($attribute : TraceLink, $source_type : TraceLink, $target_type : TraceLink) {
   * 	find change_attribute_type ($attribute, $source_type, $target_type);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ChangeAttributeTypePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<ChangeAttributeTypePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ChangeAttributeTypePostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ChangeAttributeTypePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$ATTRIBUTE = 0;
    
    private final static int POSITION_$SOURCE_TYPE = 1;
    
    private final static int POSITION_$TARGET_TYPE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ChangeAttributeTypePostcondition.Matcher.class);
    
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
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ChangeAttributeTypePostcondition.Match> getAllMatches(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      return rawGetAllMatches(new Object[]{p$attribute, p$source_type, p$target_type});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ChangeAttributeTypePostcondition.Match getOneArbitraryMatch(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      return rawGetOneArbitraryMatch(new Object[]{p$attribute, p$source_type, p$target_type});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      return rawHasMatch(new Object[]{p$attribute, p$source_type, p$target_type});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      return rawCountMatches(new Object[]{p$attribute, p$source_type, p$target_type});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type, final IMatchProcessor<? super ChangeAttributeTypePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$attribute, p$source_type, p$target_type}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type, final IMatchProcessor<? super ChangeAttributeTypePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$attribute, p$source_type, p$target_type}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$source_type the fixed value of pattern parameter $source_type, or null if not bound.
     * @param p$target_type the fixed value of pattern parameter $target_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ChangeAttributeTypePostcondition.Match newMatch(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type) {
      return ChangeAttributeTypePostcondition.Match.newMatch(p$attribute, p$source_type, p$target_type);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$attribute(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute() {
      return rawAccumulateAllValuesOf$attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final TraceLink p$source_type, final TraceLink p$target_type) {
      return rawAccumulateAllValuesOf$attribute(new Object[]{
      null, 
      p$source_type, 
      p$target_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$source_type(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$SOURCE_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$source_type() {
      return rawAccumulateAllValuesOf$source_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$source_type(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$source_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$source_type(final TraceLink p$attribute, final TraceLink p$target_type) {
      return rawAccumulateAllValuesOf$source_type(new Object[]{
      p$attribute, 
      null, 
      p$target_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$target_type(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$TARGET_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$target_type() {
      return rawAccumulateAllValuesOf$target_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$target_type(final ChangeAttributeTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$target_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$target_type(final TraceLink p$attribute, final TraceLink p$source_type) {
      return rawAccumulateAllValuesOf$target_type(new Object[]{
      p$attribute, 
      p$source_type, 
      null
      });
    }
    
    @Override
    protected ChangeAttributeTypePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ChangeAttributeTypePostcondition.Match.newMatch((TraceLink) t.get(POSITION_$ATTRIBUTE), (TraceLink) t.get(POSITION_$SOURCE_TYPE), (TraceLink) t.get(POSITION_$TARGET_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeAttributeTypePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ChangeAttributeTypePostcondition.Match.newMatch((TraceLink) match[POSITION_$ATTRIBUTE], (TraceLink) match[POSITION_$SOURCE_TYPE], (TraceLink) match[POSITION_$TARGET_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeAttributeTypePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ChangeAttributeTypePostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$ATTRIBUTE], (TraceLink) match[POSITION_$SOURCE_TYPE], (TraceLink) match[POSITION_$TARGET_TYPE]);
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
    public static IQuerySpecification<ChangeAttributeTypePostcondition.Matcher> querySpecification() {
      return ChangeAttributeTypePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ChangeAttributeTypePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * @param p$source_type the value of pattern parameter $source_type in the currently processed match
     * @param p$target_type the value of pattern parameter $target_type in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$attribute, final TraceLink p$source_type, final TraceLink p$target_type);
    
    @Override
    public void process(final ChangeAttributeTypePostcondition.Match match) {
      process(match.get$attribute(), match.get$source_type(), match.get$target_type());
    }
  }
  
  private ChangeAttributeTypePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ChangeAttributeTypePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChangeAttributeTypePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ChangeAttributeTypePostcondition.Matcher.on(engine);
  }
  
  @Override
  public ChangeAttributeTypePostcondition.Matcher instantiate() {
    return ChangeAttributeTypePostcondition.Matcher.create();
  }
  
  @Override
  public ChangeAttributeTypePostcondition.Match newEmptyMatch() {
    return ChangeAttributeTypePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public ChangeAttributeTypePostcondition.Match newMatch(final Object... parameters) {
    return ChangeAttributeTypePostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition (visibility: PUBLIC, simpleName: ChangeAttributeTypePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition (visibility: PUBLIC, simpleName: ChangeAttributeTypePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ChangeAttributeTypePostcondition INSTANCE = new ChangeAttributeTypePostcondition();
    
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
    private final static ChangeAttributeTypePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$source_type = new PParameter("$source_type", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$target_type = new PParameter("$target_type", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$attribute, parameter_p$source_type, parameter_p$target_type);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ChangeAttributeTypePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$attribute","$source_type","$target_type");
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
          PVariable var_$attribute = body.getOrCreateVariableByName("$attribute");
          PVariable var_$source_type = body.getOrCreateVariableByName("$source_type");
          PVariable var_$target_type = body.getOrCreateVariableByName("$target_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$source_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$target_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$attribute, parameter_p$attribute),
             new ExportedParameter(body, var_$source_type, parameter_p$source_type),
             new ExportedParameter(body, var_$target_type, parameter_p$target_type)
          ));
          // 	find change_attribute_type ($attribute, $source_type, $target_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$attribute, var_$source_type, var_$target_type), Change_attribute_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
