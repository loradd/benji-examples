/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/StructuralFeature.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class StructuralFeature_owner extends BaseGeneratedEMFQuerySpecification<StructuralFeature_owner.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.structuralFeature_owner pattern,
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
    private StructuralFeature fStructuralFeature;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fOwner;
    
    private static List<String> parameterNames = makeImmutableList("structuralFeature", "owner");
    
    private Match(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      this.fStructuralFeature = pStructuralFeature;
      this.fOwner = pOwner;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("structuralFeature".equals(parameterName)) return this.fStructuralFeature;
      if ("owner".equals(parameterName)) return this.fOwner;
      return null;
    }
    
    public StructuralFeature getStructuralFeature() {
      return this.fStructuralFeature;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getOwner() {
      return this.fOwner;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("structuralFeature".equals(parameterName) ) {
          this.fStructuralFeature = (StructuralFeature) newValue;
          return true;
      }
      if ("owner".equals(parameterName) ) {
          this.fOwner = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setStructuralFeature(final StructuralFeature pStructuralFeature) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fStructuralFeature = pStructuralFeature;
    }
    
    public void setOwner(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOwner = pOwner;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.structuralFeature_owner";
    }
    
    @Override
    public List<String> parameterNames() {
      return StructuralFeature_owner.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fStructuralFeature, fOwner};
    }
    
    @Override
    public StructuralFeature_owner.Match toImmutable() {
      return isMutable() ? newMatch(fStructuralFeature, fOwner) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"structuralFeature\"=" + prettyPrintValue(fStructuralFeature) + ", ");
      result.append("\"owner\"=" + prettyPrintValue(fOwner));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fStructuralFeature, fOwner);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof StructuralFeature_owner.Match)) {
          StructuralFeature_owner.Match other = (StructuralFeature_owner.Match) obj;
          return Objects.equals(fStructuralFeature, other.fStructuralFeature) && Objects.equals(fOwner, other.fOwner);
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
    public StructuralFeature_owner specification() {
      return StructuralFeature_owner.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static StructuralFeature_owner.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static StructuralFeature_owner.Match newMutableMatch(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return new Mutable(pStructuralFeature, pOwner);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static StructuralFeature_owner.Match newMatch(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return new Immutable(pStructuralFeature, pOwner);
    }
    
    private static final class Mutable extends StructuralFeature_owner.Match {
      Mutable(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
        super(pStructuralFeature, pOwner);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends StructuralFeature_owner.Match {
      Immutable(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
        super(pStructuralFeature, pOwner);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.structuralFeature_owner pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // structuralFeature - owner
   * pattern structuralFeature_owner (structuralFeature : StructuralFeature, owner : Class) {
   * 	StructuralFeature.owner (structuralFeature, owner); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see StructuralFeature_owner
   * 
   */
  public static class Matcher extends BaseMatcher<StructuralFeature_owner.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static StructuralFeature_owner.Matcher on(final ViatraQueryEngine engine) {
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
    public static StructuralFeature_owner.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_STRUCTURALFEATURE = 0;
    
    private final static int POSITION_OWNER = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(StructuralFeature_owner.Matcher.class);
    
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
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<StructuralFeature_owner.Match> getAllMatches(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return rawGetAllMatches(new Object[]{pStructuralFeature, pOwner});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public StructuralFeature_owner.Match getOneArbitraryMatch(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return rawGetOneArbitraryMatch(new Object[]{pStructuralFeature, pOwner});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return rawHasMatch(new Object[]{pStructuralFeature, pOwner});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return rawCountMatches(new Object[]{pStructuralFeature, pOwner});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner, final IMatchProcessor<? super StructuralFeature_owner.Match> processor) {
      rawForEachMatch(new Object[]{pStructuralFeature, pOwner}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner, final IMatchProcessor<? super StructuralFeature_owner.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pStructuralFeature, pOwner}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pStructuralFeature the fixed value of pattern parameter structuralFeature, or null if not bound.
     * @param pOwner the fixed value of pattern parameter owner, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public StructuralFeature_owner.Match newMatch(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return StructuralFeature_owner.Match.newMatch(pStructuralFeature, pOwner);
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<StructuralFeature> rawAccumulateAllValuesOfstructuralFeature(final Object[] parameters) {
      Set<StructuralFeature> results = new HashSet<StructuralFeature>();
      rawAccumulateAllValues(POSITION_STRUCTURALFEATURE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfstructuralFeature() {
      return rawAccumulateAllValuesOfstructuralFeature(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfstructuralFeature(final StructuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfstructuralFeature(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for structuralFeature.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<StructuralFeature> getAllValuesOfstructuralFeature(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner) {
      return rawAccumulateAllValuesOfstructuralFeature(new Object[]{
      null, 
      pOwner
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfowner(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_OWNER, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfowner() {
      return rawAccumulateAllValuesOfowner(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfowner(final StructuralFeature_owner.Match partialMatch) {
      return rawAccumulateAllValuesOfowner(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for owner.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfowner(final StructuralFeature pStructuralFeature) {
      return rawAccumulateAllValuesOfowner(new Object[]{
      pStructuralFeature, 
      null
      });
    }
    
    @Override
    protected StructuralFeature_owner.Match tupleToMatch(final Tuple t) {
      try {
          return StructuralFeature_owner.Match.newMatch((StructuralFeature) t.get(POSITION_STRUCTURALFEATURE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_OWNER));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StructuralFeature_owner.Match arrayToMatch(final Object[] match) {
      try {
          return StructuralFeature_owner.Match.newMatch((StructuralFeature) match[POSITION_STRUCTURALFEATURE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_OWNER]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected StructuralFeature_owner.Match arrayToMatchMutable(final Object[] match) {
      try {
          return StructuralFeature_owner.Match.newMutableMatch((StructuralFeature) match[POSITION_STRUCTURALFEATURE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_OWNER]);
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
    public static IQuerySpecification<StructuralFeature_owner.Matcher> querySpecification() {
      return StructuralFeature_owner.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.structuralFeature_owner pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<StructuralFeature_owner.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pStructuralFeature the value of pattern parameter structuralFeature in the currently processed match
     * @param pOwner the value of pattern parameter owner in the currently processed match
     * 
     */
    public abstract void process(final StructuralFeature pStructuralFeature, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pOwner);
    
    @Override
    public void process(final StructuralFeature_owner.Match match) {
      process(match.getStructuralFeature(), match.getOwner());
    }
  }
  
  private StructuralFeature_owner() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static StructuralFeature_owner instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected StructuralFeature_owner.Matcher instantiate(final ViatraQueryEngine engine) {
    return StructuralFeature_owner.Matcher.on(engine);
  }
  
  @Override
  public StructuralFeature_owner.Matcher instantiate() {
    return StructuralFeature_owner.Matcher.create();
  }
  
  @Override
  public StructuralFeature_owner.Match newEmptyMatch() {
    return StructuralFeature_owner.Match.newEmptyMatch();
  }
  
  @Override
  public StructuralFeature_owner.Match newMatch(final Object... parameters) {
    return StructuralFeature_owner.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_owner (visibility: PUBLIC, simpleName: StructuralFeature_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_owner (visibility: PUBLIC, simpleName: StructuralFeature_owner, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.StructuralFeature_owner, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static StructuralFeature_owner INSTANCE = new StructuralFeature_owner();
    
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
    private final static StructuralFeature_owner.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pStructuralFeature = new PParameter("structuralFeature", "se.mdh.idt.benji.examples.refactorings.metamodel.StructuralFeature", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOwner = new PParameter("owner", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pStructuralFeature, parameter_pOwner);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.structuralFeature_owner";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("structuralFeature","owner");
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
          PVariable var_structuralFeature = body.getOrCreateVariableByName("structuralFeature");
          PVariable var_owner = body.getOrCreateVariableByName("owner");
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_owner), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_structuralFeature, parameter_pStructuralFeature),
             new ExportedParameter(body, var_owner, parameter_pOwner)
          ));
          // 	StructuralFeature.owner (structuralFeature, owner)
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_structuralFeature, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "StructuralFeature", "owner")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new Equality(body, var__virtual_0_, var_owner);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
