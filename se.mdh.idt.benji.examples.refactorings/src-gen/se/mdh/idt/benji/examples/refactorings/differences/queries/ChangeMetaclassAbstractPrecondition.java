/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ChangeMetaclassAbstract.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.ConstantValue;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_abstract;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class ChangeMetaclassAbstractPrecondition extends BaseGeneratedEMFQuerySpecification<ChangeMetaclassAbstractPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_metaclass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_metaclass;
    
    private static List<String> parameterNames = makeImmutableList("initial_metaclass", "current_metaclass");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      this.fInitial_metaclass = pInitial_metaclass;
      this.fCurrent_metaclass = pCurrent_metaclass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_metaclass".equals(parameterName)) return this.fInitial_metaclass;
      if ("current_metaclass".equals(parameterName)) return this.fCurrent_metaclass;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_metaclass() {
      return this.fInitial_metaclass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_metaclass() {
      return this.fCurrent_metaclass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_metaclass".equals(parameterName) ) {
          this.fInitial_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_metaclass".equals(parameterName) ) {
          this.fCurrent_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_metaclass = pInitial_metaclass;
    }
    
    public void setCurrent_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_metaclass = pCurrent_metaclass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ChangeMetaclassAbstractPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_metaclass, fCurrent_metaclass};
    }
    
    @Override
    public ChangeMetaclassAbstractPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_metaclass, fCurrent_metaclass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_metaclass\"=" + prettyPrintValue(fInitial_metaclass) + ", ");
      result.append("\"current_metaclass\"=" + prettyPrintValue(fCurrent_metaclass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_metaclass, fCurrent_metaclass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ChangeMetaclassAbstractPrecondition.Match)) {
          ChangeMetaclassAbstractPrecondition.Match other = (ChangeMetaclassAbstractPrecondition.Match) obj;
          return Objects.equals(fInitial_metaclass, other.fInitial_metaclass) && Objects.equals(fCurrent_metaclass, other.fCurrent_metaclass);
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
    public ChangeMetaclassAbstractPrecondition specification() {
      return ChangeMetaclassAbstractPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ChangeMetaclassAbstractPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ChangeMetaclassAbstractPrecondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return new Mutable(pInitial_metaclass, pCurrent_metaclass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ChangeMetaclassAbstractPrecondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return new Immutable(pInitial_metaclass, pCurrent_metaclass);
    }
    
    private static final class Mutable extends ChangeMetaclassAbstractPrecondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
        super(pInitial_metaclass, pCurrent_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ChangeMetaclassAbstractPrecondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
        super(pInitial_metaclass, pCurrent_metaclass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACC19 - Change Metaclass Abstract - Precondition
   * pattern ChangeMetaclassAbstractPrecondition (initial_metaclass : Class, current_metaclass : Class) {
   * 	find preserved_class_abstract (initial_metaclass, current_metaclass, false, false); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ChangeMetaclassAbstractPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<ChangeMetaclassAbstractPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ChangeMetaclassAbstractPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ChangeMetaclassAbstractPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_METACLASS = 0;
    
    private final static int POSITION_CURRENT_METACLASS = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ChangeMetaclassAbstractPrecondition.Matcher.class);
    
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
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ChangeMetaclassAbstractPrecondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawGetAllMatches(new Object[]{pInitial_metaclass, pCurrent_metaclass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ChangeMetaclassAbstractPrecondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_metaclass, pCurrent_metaclass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawHasMatch(new Object[]{pInitial_metaclass, pCurrent_metaclass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawCountMatches(new Object[]{pInitial_metaclass, pCurrent_metaclass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final IMatchProcessor<? super ChangeMetaclassAbstractPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_metaclass, pCurrent_metaclass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final IMatchProcessor<? super ChangeMetaclassAbstractPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_metaclass, pCurrent_metaclass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ChangeMetaclassAbstractPrecondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return ChangeMetaclassAbstractPrecondition.Match.newMatch(pInitial_metaclass, pCurrent_metaclass);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_metaclass() {
      return rawAccumulateAllValuesOfinitial_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_metaclass(final ChangeMetaclassAbstractPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      return rawAccumulateAllValuesOfinitial_metaclass(new Object[]{
      null, 
      pCurrent_metaclass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass() {
      return rawAccumulateAllValuesOfcurrent_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass(final ChangeMetaclassAbstractPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass) {
      return rawAccumulateAllValuesOfcurrent_metaclass(new Object[]{
      pInitial_metaclass, 
      null
      });
    }
    
    @Override
    protected ChangeMetaclassAbstractPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return ChangeMetaclassAbstractPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_METACLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_METACLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeMetaclassAbstractPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return ChangeMetaclassAbstractPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_METACLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeMetaclassAbstractPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ChangeMetaclassAbstractPrecondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_METACLASS]);
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
    public static IQuerySpecification<ChangeMetaclassAbstractPrecondition.Matcher> querySpecification() {
      return ChangeMetaclassAbstractPrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ChangeMetaclassAbstractPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_metaclass the value of pattern parameter initial_metaclass in the currently processed match
     * @param pCurrent_metaclass the value of pattern parameter current_metaclass in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass);
    
    @Override
    public void process(final ChangeMetaclassAbstractPrecondition.Match match) {
      process(match.getInitial_metaclass(), match.getCurrent_metaclass());
    }
  }
  
  private ChangeMetaclassAbstractPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ChangeMetaclassAbstractPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChangeMetaclassAbstractPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ChangeMetaclassAbstractPrecondition.Matcher.on(engine);
  }
  
  @Override
  public ChangeMetaclassAbstractPrecondition.Matcher instantiate() {
    return ChangeMetaclassAbstractPrecondition.Matcher.create();
  }
  
  @Override
  public ChangeMetaclassAbstractPrecondition.Match newEmptyMatch() {
    return ChangeMetaclassAbstractPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public ChangeMetaclassAbstractPrecondition.Match newMatch(final Object... parameters) {
    return ChangeMetaclassAbstractPrecondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition (visibility: PUBLIC, simpleName: ChangeMetaclassAbstractPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition (visibility: PUBLIC, simpleName: ChangeMetaclassAbstractPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ChangeMetaclassAbstractPrecondition INSTANCE = new ChangeMetaclassAbstractPrecondition();
    
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
    private final static ChangeMetaclassAbstractPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_metaclass = new PParameter("initial_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_metaclass = new PParameter("current_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_metaclass, parameter_pCurrent_metaclass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeMetaclassAbstractPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_metaclass","current_metaclass");
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
          PVariable var_initial_metaclass = body.getOrCreateVariableByName("initial_metaclass");
          PVariable var_current_metaclass = body.getOrCreateVariableByName("current_metaclass");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_metaclass, parameter_pInitial_metaclass),
             new ExportedParameter(body, var_current_metaclass, parameter_pCurrent_metaclass)
          ));
          // 	find preserved_class_abstract (initial_metaclass, current_metaclass, false, false)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ConstantValue(body, var__virtual_0_, false);
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ConstantValue(body, var__virtual_1_, false);
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_metaclass, var_current_metaclass, var__virtual_0_, var__virtual_1_), Preserved_class_abstract.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1() {
    return false;
  }
  
  private static boolean evaluateExpression_1_2() {
    return false;
  }
}
