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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Create_package;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Insert_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_package_name;
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
public final class AddPackagePostcondition extends BaseGeneratedEMFQuerySpecification<AddPackagePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition pattern,
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
    
    private String f$subPackage_name;
    
    private TraceLink f$subPackage;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$subPackage_name", "$subPackage");
    
    private Match(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      this.f$package = p$package;
      this.f$subPackage_name = p$subPackage_name;
      this.f$subPackage = p$subPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$subPackage_name".equals(parameterName)) return this.f$subPackage_name;
      if ("$subPackage".equals(parameterName)) return this.f$subPackage;
      return null;
    }
    
    public TraceLink get$package() {
      return this.f$package;
    }
    
    public String get$subPackage_name() {
      return this.f$subPackage_name;
    }
    
    public TraceLink get$subPackage() {
      return this.f$subPackage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (TraceLink) newValue;
          return true;
      }
      if ("$subPackage_name".equals(parameterName) ) {
          this.f$subPackage_name = (String) newValue;
          return true;
      }
      if ("$subPackage".equals(parameterName) ) {
          this.f$subPackage = (TraceLink) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final TraceLink p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    public void set$subPackage_name(final String p$subPackage_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$subPackage_name = p$subPackage_name;
    }
    
    public void set$subPackage(final TraceLink p$subPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$subPackage = p$subPackage;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddPackagePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$subPackage_name, f$subPackage};
    }
    
    @Override
    public AddPackagePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$subPackage_name, f$subPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$subPackage_name\"=" + prettyPrintValue(f$subPackage_name) + ", ");
      result.append("\"$subPackage\"=" + prettyPrintValue(f$subPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$subPackage_name, f$subPackage);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AddPackagePostcondition.Match)) {
          AddPackagePostcondition.Match other = (AddPackagePostcondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$subPackage_name, other.f$subPackage_name) && Objects.equals(f$subPackage, other.f$subPackage);
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
    public AddPackagePostcondition specification() {
      return AddPackagePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddPackagePostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddPackagePostcondition.Match newMutableMatch(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      return new Mutable(p$package, p$subPackage_name, p$subPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddPackagePostcondition.Match newMatch(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      return new Immutable(p$package, p$subPackage_name, p$subPackage);
    }
    
    private static final class Mutable extends AddPackagePostcondition.Match {
      Mutable(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
        super(p$package, p$subPackage_name, p$subPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddPackagePostcondition.Match {
      Immutable(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
        super(p$package, p$subPackage_name, p$subPackage);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // AAP4 - Add Package - Postcondition
   * pattern AddPackagePostcondition ($package : TraceLink, $subPackage_name : java String, $subPackage : TraceLink) {
   * 	find create_package ($subPackage);
   * 	find set_package_name ($subPackage, $subPackage_name);
   * 	find insert_package_subPackage ($package, $subPackage);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AddPackagePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<AddPackagePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddPackagePostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddPackagePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$SUBPACKAGE_NAME = 1;
    
    private final static int POSITION_$SUBPACKAGE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddPackagePostcondition.Matcher.class);
    
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
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddPackagePostcondition.Match> getAllMatches(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      return rawGetAllMatches(new Object[]{p$package, p$subPackage_name, p$subPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddPackagePostcondition.Match getOneArbitraryMatch(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$subPackage_name, p$subPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      return rawHasMatch(new Object[]{p$package, p$subPackage_name, p$subPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      return rawCountMatches(new Object[]{p$package, p$subPackage_name, p$subPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage, final IMatchProcessor<? super AddPackagePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$subPackage_name, p$subPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage, final IMatchProcessor<? super AddPackagePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$subPackage_name, p$subPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$subPackage_name the fixed value of pattern parameter $subPackage_name, or null if not bound.
     * @param p$subPackage the fixed value of pattern parameter $subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddPackagePostcondition.Match newMatch(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage) {
      return AddPackagePostcondition.Match.newMatch(p$package, p$subPackage_name, p$subPackage);
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
    public Set<TraceLink> getAllValuesOf$package(final AddPackagePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final String p$subPackage_name, final TraceLink p$subPackage) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$subPackage_name, 
      p$subPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$subPackage_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$SUBPACKAGE_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$subPackage_name() {
      return rawAccumulateAllValuesOf$subPackage_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$subPackage_name(final AddPackagePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$subPackage_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$subPackage_name(final TraceLink p$package, final TraceLink p$subPackage) {
      return rawAccumulateAllValuesOf$subPackage_name(new Object[]{
      p$package, 
      null, 
      p$subPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$subPackage(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$SUBPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$subPackage() {
      return rawAccumulateAllValuesOf$subPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$subPackage(final AddPackagePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$subPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$subPackage(final TraceLink p$package, final String p$subPackage_name) {
      return rawAccumulateAllValuesOf$subPackage(new Object[]{
      p$package, 
      p$subPackage_name, 
      null
      });
    }
    
    @Override
    protected AddPackagePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddPackagePostcondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (String) t.get(POSITION_$SUBPACKAGE_NAME), (TraceLink) t.get(POSITION_$SUBPACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddPackagePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddPackagePostcondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (String) match[POSITION_$SUBPACKAGE_NAME], (TraceLink) match[POSITION_$SUBPACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddPackagePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddPackagePostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (String) match[POSITION_$SUBPACKAGE_NAME], (TraceLink) match[POSITION_$SUBPACKAGE]);
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
    public static IQuerySpecification<AddPackagePostcondition.Matcher> querySpecification() {
      return AddPackagePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<AddPackagePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$subPackage_name the value of pattern parameter $subPackage_name in the currently processed match
     * @param p$subPackage the value of pattern parameter $subPackage in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final String p$subPackage_name, final TraceLink p$subPackage);
    
    @Override
    public void process(final AddPackagePostcondition.Match match) {
      process(match.get$package(), match.get$subPackage_name(), match.get$subPackage());
    }
  }
  
  private AddPackagePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddPackagePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddPackagePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddPackagePostcondition.Matcher.on(engine);
  }
  
  @Override
  public AddPackagePostcondition.Matcher instantiate() {
    return AddPackagePostcondition.Matcher.create();
  }
  
  @Override
  public AddPackagePostcondition.Match newEmptyMatch() {
    return AddPackagePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public AddPackagePostcondition.Match newMatch(final Object... parameters) {
    return AddPackagePostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.String) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition (visibility: PUBLIC, simpleName: AddPackagePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition (visibility: PUBLIC, simpleName: AddPackagePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AddPackagePostcondition INSTANCE = new AddPackagePostcondition();
    
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
    private final static AddPackagePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$subPackage_name = new PParameter("$subPackage_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$subPackage = new PParameter("$subPackage", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$subPackage_name, parameter_p$subPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$subPackage_name","$subPackage");
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
          PVariable var_$subPackage_name = body.getOrCreateVariableByName("$subPackage_name");
          PVariable var_$subPackage = body.getOrCreateVariableByName("$subPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$subPackage_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$subPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$subPackage_name, parameter_p$subPackage_name),
             new ExportedParameter(body, var_$subPackage, parameter_p$subPackage)
          ));
          // 	find create_package ($subPackage)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$subPackage), Create_package.instance().getInternalQueryRepresentation());
          // 	find set_package_name ($subPackage, $subPackage_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$subPackage, var_$subPackage_name), Set_package_name.instance().getInternalQueryRepresentation());
          // 	find insert_package_subPackage ($package, $subPackage)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$subPackage), Insert_package_subPackage.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
