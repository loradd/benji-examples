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
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Created_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Set_reference_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Set_reference_type;
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
public final class AddReferencePostcondition extends BaseGeneratedEMFQuerySpecification<AddReferencePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition pattern,
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
    private Trace fClass;
    
    private Trace fType;
    
    private String fName;
    
    private Trace fReference;
    
    private static List<String> parameterNames = makeImmutableList("class", "type", "name", "reference");
    
    private Match(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      this.fClass = pClass;
      this.fType = pType;
      this.fName = pName;
      this.fReference = pReference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      if ("type".equals(parameterName)) return this.fType;
      if ("name".equals(parameterName)) return this.fName;
      if ("reference".equals(parameterName)) return this.fReference;
      return null;
    }
    
    public Trace getValueOfClass() {
      return this.fClass;
    }
    
    public Trace getType() {
      return this.fType;
    }
    
    public String getName() {
      return this.fName;
    }
    
    public Trace getReference() {
      return this.fReference;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("class".equals(parameterName) ) {
          this.fClass = (Trace) newValue;
          return true;
      }
      if ("type".equals(parameterName) ) {
          this.fType = (Trace) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      if ("reference".equals(parameterName) ) {
          this.fReference = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setClass(final Trace pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setType(final Trace pType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fType = pType;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    public void setReference(final Trace pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddReferencePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass, fType, fName, fReference};
    }
    
    @Override
    public AddReferencePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fClass, fType, fName, fReference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"type\"=" + prettyPrintValue(fType) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName) + ", ");
      result.append("\"reference\"=" + prettyPrintValue(fReference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClass, fType, fName, fReference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AddReferencePostcondition.Match)) {
          AddReferencePostcondition.Match other = (AddReferencePostcondition.Match) obj;
          return Objects.equals(fClass, other.fClass) && Objects.equals(fType, other.fType) && Objects.equals(fName, other.fName) && Objects.equals(fReference, other.fReference);
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
    public AddReferencePostcondition specification() {
      return AddReferencePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddReferencePostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddReferencePostcondition.Match newMutableMatch(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      return new Mutable(pClass, pType, pName, pReference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddReferencePostcondition.Match newMatch(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      return new Immutable(pClass, pType, pName, pReference);
    }
    
    private static final class Mutable extends AddReferencePostcondition.Match {
      Mutable(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
        super(pClass, pType, pName, pReference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddReferencePostcondition.Match {
      Immutable(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
        super(pClass, pType, pName, pReference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // AACR13 - Add Reference - Postcondition
   * pattern AddReferencePostcondition (class : Trace, type : Trace, name : java String, reference : Trace) {
   * 	find created_class_reference (class, reference);
   * 	find set_reference_name (reference, name);
   * 	find set_reference_type (reference, type);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AddReferencePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<AddReferencePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddReferencePostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddReferencePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static int POSITION_TYPE = 1;
    
    private final static int POSITION_NAME = 2;
    
    private final static int POSITION_REFERENCE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddReferencePostcondition.Matcher.class);
    
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
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddReferencePostcondition.Match> getAllMatches(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      return rawGetAllMatches(new Object[]{pClass, pType, pName, pReference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddReferencePostcondition.Match getOneArbitraryMatch(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      return rawGetOneArbitraryMatch(new Object[]{pClass, pType, pName, pReference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      return rawHasMatch(new Object[]{pClass, pType, pName, pReference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      return rawCountMatches(new Object[]{pClass, pType, pName, pReference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pClass, final Trace pType, final String pName, final Trace pReference, final IMatchProcessor<? super AddReferencePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pClass, pType, pName, pReference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pClass, final Trace pType, final String pName, final Trace pReference, final IMatchProcessor<? super AddReferencePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass, pType, pName, pReference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddReferencePostcondition.Match newMatch(final Trace pClass, final Trace pType, final String pName, final Trace pReference) {
      return AddReferencePostcondition.Match.newMatch(pClass, pType, pName, pReference);
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfclass(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass() {
      return rawAccumulateAllValuesOfclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass(final AddReferencePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass(final Trace pType, final String pName, final Trace pReference) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      null, 
      pType, 
      pName, 
      pReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOftype(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftype() {
      return rawAccumulateAllValuesOftype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftype(final AddReferencePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOftype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftype(final Trace pClass, final String pName, final Trace pReference) {
      return rawAccumulateAllValuesOftype(new Object[]{
      pClass, 
      null, 
      pName, 
      pReference
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
    public Set<String> getAllValuesOfname(final AddReferencePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Trace pClass, final Trace pType, final Trace pReference) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pClass, 
      pType, 
      null, 
      pReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfreference(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference() {
      return rawAccumulateAllValuesOfreference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference(final AddReferencePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference(final Trace pClass, final Trace pType, final String pName) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      pClass, 
      pType, 
      pName, 
      null
      });
    }
    
    @Override
    protected AddReferencePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddReferencePostcondition.Match.newMatch((Trace) t.get(POSITION_CLASS), (Trace) t.get(POSITION_TYPE), (String) t.get(POSITION_NAME), (Trace) t.get(POSITION_REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddReferencePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddReferencePostcondition.Match.newMatch((Trace) match[POSITION_CLASS], (Trace) match[POSITION_TYPE], (String) match[POSITION_NAME], (Trace) match[POSITION_REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddReferencePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddReferencePostcondition.Match.newMutableMatch((Trace) match[POSITION_CLASS], (Trace) match[POSITION_TYPE], (String) match[POSITION_NAME], (Trace) match[POSITION_REFERENCE]);
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
    public static IQuerySpecification<AddReferencePostcondition.Matcher> querySpecification() {
      return AddReferencePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<AddReferencePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pType the value of pattern parameter type in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * @param pReference the value of pattern parameter reference in the currently processed match
     * 
     */
    public abstract void process(final Trace pClass, final Trace pType, final String pName, final Trace pReference);
    
    @Override
    public void process(final AddReferencePostcondition.Match match) {
      process(match.getValueOfClass(), match.getType(), match.getName(), match.getReference());
    }
  }
  
  private AddReferencePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddReferencePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddReferencePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddReferencePostcondition.Matcher.on(engine);
  }
  
  @Override
  public AddReferencePostcondition.Matcher instantiate() {
    return AddReferencePostcondition.Matcher.create();
  }
  
  @Override
  public AddReferencePostcondition.Match newEmptyMatch() {
    return AddReferencePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public AddReferencePostcondition.Match newMatch(final Object... parameters) {
    return AddReferencePostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (java.lang.String) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition (visibility: PUBLIC, simpleName: AddReferencePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition (visibility: PUBLIC, simpleName: AddReferencePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AddReferencePostcondition INSTANCE = new AddReferencePostcondition();
    
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
    private final static AddReferencePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pType = new PParameter("type", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pType, parameter_pName, parameter_pReference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.AddReferencePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","type","name","reference");
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
          PVariable var_type = body.getOrCreateVariableByName("type");
          PVariable var_name = body.getOrCreateVariableByName("name");
          PVariable var_reference = body.getOrCreateVariableByName("reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_type, parameter_pType),
             new ExportedParameter(body, var_name, parameter_pName),
             new ExportedParameter(body, var_reference, parameter_pReference)
          ));
          // 	find created_class_reference (class, reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_reference), Created_class_reference.instance().getInternalQueryRepresentation());
          // 	find set_reference_name (reference, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_name), Set_reference_name.instance().getInternalQueryRepresentation());
          // 	find set_reference_type (reference, type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_type), Set_reference_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
