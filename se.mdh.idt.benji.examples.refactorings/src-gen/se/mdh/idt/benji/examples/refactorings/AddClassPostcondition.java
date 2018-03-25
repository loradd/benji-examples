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
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_name;
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
public final class AddClassPostcondition extends BaseGeneratedEMFQuerySpecification<AddClassPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.AddClassPostcondition pattern,
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
    private TraceLink f$package;
    
    private String f$class_name;
    
    private TraceLink f$class;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$class_name", "$class");
    
    private Match(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      this.f$package = p$package;
      this.f$class_name = p$class_name;
      this.f$class = p$class;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$class_name".equals(parameterName)) return this.f$class_name;
      if ("$class".equals(parameterName)) return this.f$class;
      return null;
    }
    
    public TraceLink get$package() {
      return this.f$package;
    }
    
    public String get$class_name() {
      return this.f$class_name;
    }
    
    public TraceLink get$class() {
      return this.f$class;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (TraceLink) newValue;
          return true;
      }
      if ("$class_name".equals(parameterName) ) {
          this.f$class_name = (String) newValue;
          return true;
      }
      if ("$class".equals(parameterName) ) {
          this.f$class = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final TraceLink p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    public void set$class_name(final String p$class_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class_name = p$class_name;
    }
    
    public void set$class(final TraceLink p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.AddClassPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddClassPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$class_name, f$class};
    }
    
    @Override
    public AddClassPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$class_name, f$class) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$class_name\"=" + prettyPrintValue(f$class_name) + ", ");
      result.append("\"$class\"=" + prettyPrintValue(f$class));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$class_name, f$class);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AddClassPostcondition.Match)) {
          AddClassPostcondition.Match other = (AddClassPostcondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$class_name, other.f$class_name) && Objects.equals(f$class, other.f$class);
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
    public AddClassPostcondition specification() {
      return AddClassPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddClassPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddClassPostcondition.Match newMutableMatch(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      return new Mutable(p$package, p$class_name, p$class);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddClassPostcondition.Match newMatch(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      return new Immutable(p$package, p$class_name, p$class);
    }
    
    private static final class Mutable extends AddClassPostcondition.Match {
      Mutable(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
        super(p$package, p$class_name, p$class);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddClassPostcondition.Match {
      Immutable(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
        super(p$package, p$class_name, p$class);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.AddClassPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // AAC5 - Add Class - Postcondition
   * pattern AddClassPostcondition ($package : TraceLink, $class_name : java String, $class : TraceLink) {
   * 	find create_class ($class);
   * 	find set_class_name ($class, $class_name);
   * 	find insert_package_class ($package, $class);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AddClassPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<AddClassPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddClassPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddClassPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$CLASS_NAME = 1;
    
    private final static int POSITION_$CLASS = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddClassPostcondition.Matcher.class);
    
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
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddClassPostcondition.Match> getAllMatches(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      return rawGetAllMatches(new Object[]{p$package, p$class_name, p$class});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddClassPostcondition.Match getOneArbitraryMatch(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$class_name, p$class});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      return rawHasMatch(new Object[]{p$package, p$class_name, p$class});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      return rawCountMatches(new Object[]{p$package, p$class_name, p$class});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final String p$class_name, final TraceLink p$class, final IMatchProcessor<? super AddClassPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$class_name, p$class}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final String p$class_name, final TraceLink p$class, final IMatchProcessor<? super AddClassPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$class_name, p$class}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class_name the fixed value of pattern parameter $class_name, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddClassPostcondition.Match newMatch(final TraceLink p$package, final String p$class_name, final TraceLink p$class) {
      return AddClassPostcondition.Match.newMatch(p$package, p$class_name, p$class);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$package(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package() {
      return rawAccumulateAllValuesOf$package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final AddClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final String p$class_name, final TraceLink p$class) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$class_name, 
      p$class
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$class_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$CLASS_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$class_name() {
      return rawAccumulateAllValuesOf$class_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$class_name(final AddClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$class_name(final TraceLink p$package, final TraceLink p$class) {
      return rawAccumulateAllValuesOf$class_name(new Object[]{
      p$package, 
      null, 
      p$class
      });
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
    public Set<TraceLink> getAllValuesOf$class(final AddClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$package, final String p$class_name) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      p$package, 
      p$class_name, 
      null
      });
    }
    
    @Override
    protected AddClassPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddClassPostcondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (String) t.get(POSITION_$CLASS_NAME), (TraceLink) t.get(POSITION_$CLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddClassPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddClassPostcondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (String) match[POSITION_$CLASS_NAME], (TraceLink) match[POSITION_$CLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddClassPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddClassPostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (String) match[POSITION_$CLASS_NAME], (TraceLink) match[POSITION_$CLASS]);
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
    public static IQuerySpecification<AddClassPostcondition.Matcher> querySpecification() {
      return AddClassPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.AddClassPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<AddClassPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$class_name the value of pattern parameter $class_name in the currently processed match
     * @param p$class the value of pattern parameter $class in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final String p$class_name, final TraceLink p$class);
    
    @Override
    public void process(final AddClassPostcondition.Match match) {
      process(match.get$package(), match.get$class_name(), match.get$class());
    }
  }
  
  private AddClassPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddClassPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddClassPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddClassPostcondition.Matcher.on(engine);
  }
  
  @Override
  public AddClassPostcondition.Matcher instantiate() {
    return AddClassPostcondition.Matcher.create();
  }
  
  @Override
  public AddClassPostcondition.Match newEmptyMatch() {
    return AddClassPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public AddClassPostcondition.Match newMatch(final Object... parameters) {
    return AddClassPostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.String) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddClassPostcondition (visibility: PUBLIC, simpleName: AddClassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddClassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddClassPostcondition (visibility: PUBLIC, simpleName: AddClassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddClassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AddClassPostcondition INSTANCE = new AddClassPostcondition();
    
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
    private final static AddClassPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$class_name = new PParameter("$class_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$class_name, parameter_p$class);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.AddClassPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$class_name","$class");
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
          PVariable var_$package = body.getOrCreateVariableByName("$package");
          PVariable var_$class_name = body.getOrCreateVariableByName("$class_name");
          PVariable var_$class = body.getOrCreateVariableByName("$class");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$class_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$class_name, parameter_p$class_name),
             new ExportedParameter(body, var_$class, parameter_p$class)
          ));
          // 	find create_class ($class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class), Create_class.instance().getInternalQueryRepresentation());
          // 	find set_class_name ($class, $class_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$class_name), Set_class_name.instance().getInternalQueryRepresentation());
          // 	find insert_package_class ($package, $class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$class), Insert_package_class.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
