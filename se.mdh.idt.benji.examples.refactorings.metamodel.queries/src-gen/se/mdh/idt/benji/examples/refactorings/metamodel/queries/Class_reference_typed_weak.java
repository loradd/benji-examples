/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Class.vql
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
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_type_weak;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Class_reference_typed_weak extends BaseGeneratedEMFQuerySpecification<Class_reference_typed_weak.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.class_reference_typed_weak pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fClass;
    
    private Reference fReference;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fType;
    
    private static List<String> parameterNames = makeImmutableList("class", "reference", "type");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      this.fClass = pClass;
      this.fReference = pReference;
      this.fType = pType;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      if ("reference".equals(parameterName)) return this.fReference;
      if ("type".equals(parameterName)) return this.fType;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getValueOfClass() {
      return this.fClass;
    }
    
    public Reference getReference() {
      return this.fReference;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getType() {
      return this.fType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("class".equals(parameterName) ) {
          this.fClass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("reference".equals(parameterName) ) {
          this.fReference = (Reference) newValue;
          return true;
      }
      if ("type".equals(parameterName) ) {
          this.fType = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      return false;
    }
    
    public void setClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setReference(final Reference pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    public void setType(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fType = pType;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.class_reference_typed_weak";
    }
    
    @Override
    public List<String> parameterNames() {
      return Class_reference_typed_weak.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass, fReference, fType};
    }
    
    @Override
    public Class_reference_typed_weak.Match toImmutable() {
      return isMutable() ? newMatch(fClass, fReference, fType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"type\"=" + prettyPrintValue(fType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClass, fReference, fType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Class_reference_typed_weak.Match)) {
          Class_reference_typed_weak.Match other = (Class_reference_typed_weak.Match) obj;
          return Objects.equals(fClass, other.fClass) && Objects.equals(fReference, other.fReference) && Objects.equals(fType, other.fType);
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
    public Class_reference_typed_weak specification() {
      return Class_reference_typed_weak.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Class_reference_typed_weak.Match newEmptyMatch() {
      return new Mutable(null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Class_reference_typed_weak.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return new Mutable(pClass, pReference, pType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Class_reference_typed_weak.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return new Immutable(pClass, pReference, pType);
    }
    
    private static final class Mutable extends Class_reference_typed_weak.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
        super(pClass, pReference, pType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Class_reference_typed_weak.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
        super(pClass, pReference, pType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.class_reference_typed_weak pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // class - structuralFeature (reference) - weak typed
   * pattern class_reference_typed_weak (class : Class, reference : Reference, type : Class) {
   * 	find class_reference (class, reference); 
   * 	find reference_type_weak(reference, type);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Class_reference_typed_weak
   * 
   */
  public static class Matcher extends BaseMatcher<Class_reference_typed_weak.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Class_reference_typed_weak.Matcher on(final ViatraQueryEngine engine) {
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
    public static Class_reference_typed_weak.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static int POSITION_REFERENCE = 1;
    
    private final static int POSITION_TYPE = 2;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Class_reference_typed_weak.Matcher.class);
    
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
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Class_reference_typed_weak.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return rawGetAllMatches(new Object[]{pClass, pReference, pType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Class_reference_typed_weak.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return rawGetOneArbitraryMatch(new Object[]{pClass, pReference, pType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return rawHasMatch(new Object[]{pClass, pReference, pType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return rawCountMatches(new Object[]{pClass, pReference, pType});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType, final IMatchProcessor<? super Class_reference_typed_weak.Match> processor) {
      rawForEachMatch(new Object[]{pClass, pReference, pType}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType, final IMatchProcessor<? super Class_reference_typed_weak.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass, pReference, pType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Class_reference_typed_weak.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return Class_reference_typed_weak.Match.newMatch(pClass, pReference, pType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfclass() {
      return rawAccumulateAllValuesOfclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfclass(final Class_reference_typed_weak.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfclass(final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      null, 
      pReference, 
      pType
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfreference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfreference() {
      return rawAccumulateAllValuesOfreference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfreference(final Class_reference_typed_weak.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfreference(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      pClass, 
      null, 
      pType
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOftype(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOftype() {
      return rawAccumulateAllValuesOftype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOftype(final Class_reference_typed_weak.Match partialMatch) {
      return rawAccumulateAllValuesOftype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOftype(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference) {
      return rawAccumulateAllValuesOftype(new Object[]{
      pClass, 
      pReference, 
      null
      });
    }
    
    @Override
    protected Class_reference_typed_weak.Match tupleToMatch(final Tuple t) {
      try {
          return Class_reference_typed_weak.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CLASS), (Reference) t.get(POSITION_REFERENCE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Class_reference_typed_weak.Match arrayToMatch(final Object[] match) {
      try {
          return Class_reference_typed_weak.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CLASS], (Reference) match[POSITION_REFERENCE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Class_reference_typed_weak.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Class_reference_typed_weak.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CLASS], (Reference) match[POSITION_REFERENCE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_TYPE]);
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
    public static IQuerySpecification<Class_reference_typed_weak.Matcher> querySpecification() {
      return Class_reference_typed_weak.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.class_reference_typed_weak pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Class_reference_typed_weak.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pType the value of pattern parameter type in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pClass, final Reference pReference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pType);
    
    @Override
    public void process(final Class_reference_typed_weak.Match match) {
      process(match.getValueOfClass(), match.getReference(), match.getType());
    }
  }
  
  private Class_reference_typed_weak() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Class_reference_typed_weak instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Class_reference_typed_weak.Matcher instantiate(final ViatraQueryEngine engine) {
    return Class_reference_typed_weak.Matcher.on(engine);
  }
  
  @Override
  public Class_reference_typed_weak.Matcher instantiate() {
    return Class_reference_typed_weak.Matcher.create();
  }
  
  @Override
  public Class_reference_typed_weak.Match newEmptyMatch() {
    return Class_reference_typed_weak.Match.newEmptyMatch();
  }
  
  @Override
  public Class_reference_typed_weak.Match newMatch(final Object... parameters) {
    return Class_reference_typed_weak.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference_typed_weak (visibility: PUBLIC, simpleName: Class_reference_typed_weak, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference_typed_weak, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference_typed_weak (visibility: PUBLIC, simpleName: Class_reference_typed_weak, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_reference_typed_weak, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Class_reference_typed_weak INSTANCE = new Class_reference_typed_weak();
    
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
    private final static Class_reference_typed_weak.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pType = new PParameter("type", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pReference, parameter_pType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.class_reference_typed_weak";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","reference","type");
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
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_reference = body.getOrCreateVariableByName("reference");
          PVariable var_type = body.getOrCreateVariableByName("type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_type, parameter_pType)
          ));
          // 	find class_reference (class, reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_reference), Class_reference.instance().getInternalQueryRepresentation());
          //  	find reference_type_weak(reference, type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_type), Reference_type_weak.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
