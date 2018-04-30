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
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Created_package_subPackage;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Set_package_name;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-04-25T00:59+0200")
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
    private Trace fPackage;
    
    private String fName;
    
    private Trace fSubPackage;
    
    private static List<String> parameterNames = makeImmutableList("package", "name", "subPackage");
    
    private Match(final Trace pPackage, final String pName, final Trace pSubPackage) {
      this.fPackage = pPackage;
      this.fName = pName;
      this.fSubPackage = pSubPackage;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("name".equals(parameterName)) return this.fName;
      if ("subPackage".equals(parameterName)) return this.fSubPackage;
      return null;
    }
    
    public Trace getPackage() {
      return this.fPackage;
    }
    
    public String getName() {
      return this.fName;
    }
    
    public Trace getSubPackage() {
      return this.fSubPackage;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (Trace) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      if ("subPackage".equals(parameterName) ) {
          this.fSubPackage = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final Trace pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    public void setSubPackage(final Trace pSubPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSubPackage = pSubPackage;
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
      return new Object[]{fPackage, fName, fSubPackage};
    }
    
    @Override
    public AddPackagePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fName, fSubPackage) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName) + ", ");
      result.append("\"subPackage\"=" + prettyPrintValue(fSubPackage));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fName, fSubPackage);
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
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fName, other.fName) && Objects.equals(fSubPackage, other.fSubPackage);
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddPackagePostcondition.Match newMutableMatch(final Trace pPackage, final String pName, final Trace pSubPackage) {
      return new Mutable(pPackage, pName, pSubPackage);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddPackagePostcondition.Match newMatch(final Trace pPackage, final String pName, final Trace pSubPackage) {
      return new Immutable(pPackage, pName, pSubPackage);
    }
    
    private static final class Mutable extends AddPackagePostcondition.Match {
      Mutable(final Trace pPackage, final String pName, final Trace pSubPackage) {
        super(pPackage, pName, pSubPackage);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddPackagePostcondition.Match {
      Immutable(final Trace pPackage, final String pName, final Trace pSubPackage) {
        super(pPackage, pName, pSubPackage);
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
   * pattern AddPackagePostcondition (^package : Trace, name : java String, subPackage : Trace) {
   * 	find created_package_subPackage (^package, subPackage);
   * 	find set_package_name (subPackage, name);
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
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_NAME = 1;
    
    private final static int POSITION_SUBPACKAGE = 2;
    
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddPackagePostcondition.Match> getAllMatches(final Trace pPackage, final String pName, final Trace pSubPackage) {
      return rawGetAllMatches(new Object[]{pPackage, pName, pSubPackage});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddPackagePostcondition.Match getOneArbitraryMatch(final Trace pPackage, final String pName, final Trace pSubPackage) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pName, pSubPackage});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pPackage, final String pName, final Trace pSubPackage) {
      return rawHasMatch(new Object[]{pPackage, pName, pSubPackage});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pPackage, final String pName, final Trace pSubPackage) {
      return rawCountMatches(new Object[]{pPackage, pName, pSubPackage});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pPackage, final String pName, final Trace pSubPackage, final IMatchProcessor<? super AddPackagePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pName, pSubPackage}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pPackage, final String pName, final Trace pSubPackage, final IMatchProcessor<? super AddPackagePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pName, pSubPackage}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pSubPackage the fixed value of pattern parameter subPackage, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddPackagePostcondition.Match newMatch(final Trace pPackage, final String pName, final Trace pSubPackage) {
      return AddPackagePostcondition.Match.newMatch(pPackage, pName, pSubPackage);
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfpackage(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage() {
      return rawAccumulateAllValuesOfpackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage(final AddPackagePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage(final String pName, final Trace pSubPackage) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pName, 
      pSubPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfname(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname() {
      return rawAccumulateAllValuesOfname(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final AddPackagePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Trace pPackage, final Trace pSubPackage) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pPackage, 
      null, 
      pSubPackage
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfsubPackage(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_SUBPACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsubPackage() {
      return rawAccumulateAllValuesOfsubPackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsubPackage(final AddPackagePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfsubPackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subPackage.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsubPackage(final Trace pPackage, final String pName) {
      return rawAccumulateAllValuesOfsubPackage(new Object[]{
      pPackage, 
      pName, 
      null
      });
    }
    
    @Override
    protected AddPackagePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddPackagePostcondition.Match.newMatch((Trace) t.get(POSITION_PACKAGE), (String) t.get(POSITION_NAME), (Trace) t.get(POSITION_SUBPACKAGE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddPackagePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddPackagePostcondition.Match.newMatch((Trace) match[POSITION_PACKAGE], (String) match[POSITION_NAME], (Trace) match[POSITION_SUBPACKAGE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddPackagePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddPackagePostcondition.Match.newMutableMatch((Trace) match[POSITION_PACKAGE], (String) match[POSITION_NAME], (Trace) match[POSITION_SUBPACKAGE]);
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
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * @param pSubPackage the value of pattern parameter subPackage in the currently processed match
     * 
     */
    public abstract void process(final Trace pPackage, final String pName, final Trace pSubPackage);
    
    @Override
    public void process(final AddPackagePostcondition.Match match) {
      process(match.getPackage(), match.getName(), match.getSubPackage());
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
    return AddPackagePostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (java.lang.String) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2]);
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
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSubPackage = new PParameter("subPackage", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pName, parameter_pSubPackage);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.AddPackagePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","name","subPackage");
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
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var_name = body.getOrCreateVariableByName("name");
          PVariable var_subPackage = body.getOrCreateVariableByName("subPackage");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_subPackage), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_name, parameter_pName),
             new ExportedParameter(body, var_subPackage, parameter_pSubPackage)
          ));
          // 	find created_package_subPackage (^package, subPackage)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_subPackage), Created_package_subPackage.instance().getInternalQueryRepresentation());
          // 	find set_package_name (subPackage, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_subPackage, var_name), Set_package_name.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
