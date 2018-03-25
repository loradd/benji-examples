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
import org.eclipse.viatra.query.runtime.matchers.context.common.JavaTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.internal.Create_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class;
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
public final class AddReferencePrecondition extends BaseGeneratedEMFQuerySpecification<AddReferencePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition pattern,
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
    
    private TraceLink f$type;
    
    private String f$name;
    
    private static List<String> parameterNames = makeImmutableList("$class", "$type", "$name");
    
    private Match(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      this.f$class = p$class;
      this.f$type = p$type;
      this.f$name = p$name;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$type".equals(parameterName)) return this.f$type;
      if ("$name".equals(parameterName)) return this.f$name;
      return null;
    }
    
    public TraceLink get$class() {
      return this.f$class;
    }
    
    public TraceLink get$type() {
      return this.f$type;
    }
    
    public String get$name() {
      return this.f$name;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$class".equals(parameterName) ) {
          this.f$class = (TraceLink) newValue;
          return true;
      }
      if ("$type".equals(parameterName) ) {
          this.f$type = (TraceLink) newValue;
          return true;
      }
      if ("$name".equals(parameterName) ) {
          this.f$name = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void set$class(final TraceLink p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    public void set$type(final TraceLink p$type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$type = p$type;
    }
    
    public void set$name(final String p$name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$name = p$name;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddReferencePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$class, f$type, f$name};
    }
    
    @Override
    public AddReferencePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$class, f$type, f$name) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$type\"=" + prettyPrintValue(f$type) + ", ");
      result.append("\"$name\"=" + prettyPrintValue(f$name));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$class, f$type, f$name);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AddReferencePrecondition.Match)) {
          AddReferencePrecondition.Match other = (AddReferencePrecondition.Match) obj;
          return Objects.equals(f$class, other.f$class) && Objects.equals(f$type, other.f$type) && Objects.equals(f$name, other.f$name);
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
    public AddReferencePrecondition specification() {
      return AddReferencePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddReferencePrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddReferencePrecondition.Match newMutableMatch(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      return new Mutable(p$class, p$type, p$name);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddReferencePrecondition.Match newMatch(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      return new Immutable(p$class, p$type, p$name);
    }
    
    private static final class Mutable extends AddReferencePrecondition.Match {
      Mutable(final TraceLink p$class, final TraceLink p$type, final String p$name) {
        super(p$class, p$type, p$name);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddReferencePrecondition.Match {
      Immutable(final TraceLink p$class, final TraceLink p$type, final String p$name) {
        super(p$class, p$type, p$name);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // AACR13 - Add Reference - Precondition
   * pattern AddReferencePrecondition ($class : TraceLink, $type : TraceLink, $name : java String) {
   * 	find get_class ($class);
   * 	find get_class ($type);
   * 	$index == count find create_class_reference ($class, _); 
   * 	$name == eval ("created_reference_" + $index);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AddReferencePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<AddReferencePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddReferencePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddReferencePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$CLASS = 0;
    
    private final static int POSITION_$TYPE = 1;
    
    private final static int POSITION_$NAME = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddReferencePrecondition.Matcher.class);
    
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
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddReferencePrecondition.Match> getAllMatches(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      return rawGetAllMatches(new Object[]{p$class, p$type, p$name});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddReferencePrecondition.Match getOneArbitraryMatch(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      return rawGetOneArbitraryMatch(new Object[]{p$class, p$type, p$name});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      return rawHasMatch(new Object[]{p$class, p$type, p$name});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      return rawCountMatches(new Object[]{p$class, p$type, p$name});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$class, final TraceLink p$type, final String p$name, final IMatchProcessor<? super AddReferencePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$class, p$type, p$name}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$class, final TraceLink p$type, final String p$name, final IMatchProcessor<? super AddReferencePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$class, p$type, p$name}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$type the fixed value of pattern parameter $type, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddReferencePrecondition.Match newMatch(final TraceLink p$class, final TraceLink p$type, final String p$name) {
      return AddReferencePrecondition.Match.newMatch(p$class, p$type, p$name);
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
    public Set<TraceLink> getAllValuesOf$class(final AddReferencePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$type, final String p$name) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      null, 
      p$type, 
      p$name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$type(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$type() {
      return rawAccumulateAllValuesOf$type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$type(final AddReferencePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$type(final TraceLink p$class, final String p$name) {
      return rawAccumulateAllValuesOf$type(new Object[]{
      p$class, 
      null, 
      p$name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$name() {
      return rawAccumulateAllValuesOf$name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$name(final AddReferencePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$name(final TraceLink p$class, final TraceLink p$type) {
      return rawAccumulateAllValuesOf$name(new Object[]{
      p$class, 
      p$type, 
      null
      });
    }
    
    @Override
    protected AddReferencePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddReferencePrecondition.Match.newMatch((TraceLink) t.get(POSITION_$CLASS), (TraceLink) t.get(POSITION_$TYPE), (String) t.get(POSITION_$NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddReferencePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddReferencePrecondition.Match.newMatch((TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$TYPE], (String) match[POSITION_$NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddReferencePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddReferencePrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$TYPE], (String) match[POSITION_$NAME]);
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
    public static IQuerySpecification<AddReferencePrecondition.Matcher> querySpecification() {
      return AddReferencePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<AddReferencePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$type the value of pattern parameter $type in the currently processed match
     * @param p$name the value of pattern parameter $name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$class, final TraceLink p$type, final String p$name);
    
    @Override
    public void process(final AddReferencePrecondition.Match match) {
      process(match.get$class(), match.get$type(), match.get$name());
    }
  }
  
  private AddReferencePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddReferencePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddReferencePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddReferencePrecondition.Matcher.on(engine);
  }
  
  @Override
  public AddReferencePrecondition.Matcher instantiate() {
    return AddReferencePrecondition.Matcher.create();
  }
  
  @Override
  public AddReferencePrecondition.Match newEmptyMatch() {
    return AddReferencePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public AddReferencePrecondition.Match newMatch(final Object... parameters) {
    return AddReferencePrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (java.lang.String) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition (visibility: PUBLIC, simpleName: AddReferencePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition (visibility: PUBLIC, simpleName: AddReferencePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AddReferencePrecondition INSTANCE = new AddReferencePrecondition();
    
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
    private final static AddReferencePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$type = new PParameter("$type", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$name = new PParameter("$name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$class, parameter_p$type, parameter_p$name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.AddReferencePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$class","$type","$name");
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
          PVariable var_$type = body.getOrCreateVariableByName("$type");
          PVariable var_$name = body.getOrCreateVariableByName("$name");
          PVariable var_$index = body.getOrCreateVariableByName("$index");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$type, parameter_p$type),
             new ExportedParameter(body, var_$name, parameter_p$name)
          ));
          // 	find get_class ($class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class), Get_class.instance().getInternalQueryRepresentation());
          // 	find get_class ($type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$type), Get_class.instance().getInternalQueryRepresentation());
          // 	$index == count find create_class_reference ($class, _)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_$class, var___0_), Create_class_reference.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var_$index, var__virtual_0_);
          //  	$name == eval ("created_reference_" + $index)
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern AddReferencePrecondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("$index");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer $index = (Integer) provider.getValue("$index");
                  return evaluateExpression_1_1($index);
              }
          },  var__virtual_1_ ); 
          new Equality(body, var_$name, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final Integer $index) {
    return ("created_reference_" + $index);
  }
}
