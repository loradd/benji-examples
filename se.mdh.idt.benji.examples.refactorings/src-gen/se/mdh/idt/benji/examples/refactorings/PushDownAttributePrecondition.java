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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_subClass;
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
public final class PushDownAttributePrecondition extends BaseGeneratedEMFQuerySpecification<PushDownAttributePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition pattern,
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
    
    private TraceLink f$subClass;
    
    private TraceLink f$attribute;
    
    private static List<String> parameterNames = makeImmutableList("$class", "$subClass", "$attribute");
    
    private Match(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      this.f$class = p$class;
      this.f$subClass = p$subClass;
      this.f$attribute = p$attribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$subClass".equals(parameterName)) return this.f$subClass;
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      return null;
    }
    
    public TraceLink get$class() {
      return this.f$class;
    }
    
    public TraceLink get$subClass() {
      return this.f$subClass;
    }
    
    public TraceLink get$attribute() {
      return this.f$attribute;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$class".equals(parameterName) ) {
          this.f$class = (TraceLink) newValue;
          return true;
      }
      if ("$subClass".equals(parameterName) ) {
          this.f$subClass = (TraceLink) newValue;
          return true;
      }
      if ("$attribute".equals(parameterName) ) {
          this.f$attribute = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void set$class(final TraceLink p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    public void set$subClass(final TraceLink p$subClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$subClass = p$subClass;
    }
    
    public void set$attribute(final TraceLink p$attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute = p$attribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return PushDownAttributePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$class, f$subClass, f$attribute};
    }
    
    @Override
    public PushDownAttributePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$class, f$subClass, f$attribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$subClass\"=" + prettyPrintValue(f$subClass) + ", ");
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$class, f$subClass, f$attribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof PushDownAttributePrecondition.Match)) {
          PushDownAttributePrecondition.Match other = (PushDownAttributePrecondition.Match) obj;
          return Objects.equals(f$class, other.f$class) && Objects.equals(f$subClass, other.f$subClass) && Objects.equals(f$attribute, other.f$attribute);
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
    public PushDownAttributePrecondition specification() {
      return PushDownAttributePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static PushDownAttributePrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PushDownAttributePrecondition.Match newMutableMatch(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      return new Mutable(p$class, p$subClass, p$attribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PushDownAttributePrecondition.Match newMatch(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      return new Immutable(p$class, p$subClass, p$attribute);
    }
    
    private static final class Mutable extends PushDownAttributePrecondition.Match {
      Mutable(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
        super(p$class, p$subClass, p$attribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PushDownAttributePrecondition.Match {
      Immutable(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
        super(p$class, p$subClass, p$attribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCCAR21 - Flatten Hierarchy [TODO]
   * 
   * // CDACA22 - Push Down Attribute - Precondition
   * pattern PushDownAttributePrecondition ($class : TraceLink, $subClass : TraceLink, $attribute : TraceLink) {
   * 	find get_class_subClass ($class, $subClass);
   * 	find get_class_attribute ($class, $attribute);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see PushDownAttributePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<PushDownAttributePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static PushDownAttributePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static PushDownAttributePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$CLASS = 0;
    
    private final static int POSITION_$SUBCLASS = 1;
    
    private final static int POSITION_$ATTRIBUTE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(PushDownAttributePrecondition.Matcher.class);
    
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
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PushDownAttributePrecondition.Match> getAllMatches(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      return rawGetAllMatches(new Object[]{p$class, p$subClass, p$attribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public PushDownAttributePrecondition.Match getOneArbitraryMatch(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      return rawGetOneArbitraryMatch(new Object[]{p$class, p$subClass, p$attribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      return rawHasMatch(new Object[]{p$class, p$subClass, p$attribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      return rawCountMatches(new Object[]{p$class, p$subClass, p$attribute});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute, final IMatchProcessor<? super PushDownAttributePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$class, p$subClass, p$attribute}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute, final IMatchProcessor<? super PushDownAttributePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$class, p$subClass, p$attribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$subClass the fixed value of pattern parameter $subClass, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PushDownAttributePrecondition.Match newMatch(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute) {
      return PushDownAttributePrecondition.Match.newMatch(p$class, p$subClass, p$attribute);
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
    public Set<TraceLink> getAllValuesOf$class(final PushDownAttributePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$subClass, final TraceLink p$attribute) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      null, 
      p$subClass, 
      p$attribute
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$subClass(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$SUBCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$subClass() {
      return rawAccumulateAllValuesOf$subClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$subClass(final PushDownAttributePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$subClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$subClass(final TraceLink p$class, final TraceLink p$attribute) {
      return rawAccumulateAllValuesOf$subClass(new Object[]{
      p$class, 
      null, 
      p$attribute
      });
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
    public Set<TraceLink> getAllValuesOf$attribute(final PushDownAttributePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final TraceLink p$class, final TraceLink p$subClass) {
      return rawAccumulateAllValuesOf$attribute(new Object[]{
      p$class, 
      p$subClass, 
      null
      });
    }
    
    @Override
    protected PushDownAttributePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return PushDownAttributePrecondition.Match.newMatch((TraceLink) t.get(POSITION_$CLASS), (TraceLink) t.get(POSITION_$SUBCLASS), (TraceLink) t.get(POSITION_$ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownAttributePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return PushDownAttributePrecondition.Match.newMatch((TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$SUBCLASS], (TraceLink) match[POSITION_$ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownAttributePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PushDownAttributePrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$SUBCLASS], (TraceLink) match[POSITION_$ATTRIBUTE]);
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
    public static IQuerySpecification<PushDownAttributePrecondition.Matcher> querySpecification() {
      return PushDownAttributePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<PushDownAttributePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$subClass the value of pattern parameter $subClass in the currently processed match
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$class, final TraceLink p$subClass, final TraceLink p$attribute);
    
    @Override
    public void process(final PushDownAttributePrecondition.Match match) {
      process(match.get$class(), match.get$subClass(), match.get$attribute());
    }
  }
  
  private PushDownAttributePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static PushDownAttributePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected PushDownAttributePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return PushDownAttributePrecondition.Matcher.on(engine);
  }
  
  @Override
  public PushDownAttributePrecondition.Matcher instantiate() {
    return PushDownAttributePrecondition.Matcher.create();
  }
  
  @Override
  public PushDownAttributePrecondition.Match newEmptyMatch() {
    return PushDownAttributePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public PushDownAttributePrecondition.Match newMatch(final Object... parameters) {
    return PushDownAttributePrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition (visibility: PUBLIC, simpleName: PushDownAttributePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition (visibility: PUBLIC, simpleName: PushDownAttributePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static PushDownAttributePrecondition INSTANCE = new PushDownAttributePrecondition();
    
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
    private final static PushDownAttributePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$subClass = new PParameter("$subClass", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$class, parameter_p$subClass, parameter_p$attribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$class","$subClass","$attribute");
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
          PVariable var_$subClass = body.getOrCreateVariableByName("$subClass");
          PVariable var_$attribute = body.getOrCreateVariableByName("$attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$subClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$subClass, parameter_p$subClass),
             new ExportedParameter(body, var_$attribute, parameter_p$attribute)
          ));
          // 	find get_class_subClass ($class, $subClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$subClass), Get_class_subClass.instance().getInternalQueryRepresentation());
          // 	find get_class_attribute ($class, $attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$attribute), Get_class_attribute.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
