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
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Created_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Set_attribute_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Set_attribute_type;
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
public final class AddAttributePostcondition extends BaseGeneratedEMFQuerySpecification<AddAttributePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition pattern,
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
    
    private Trace fAttribute;
    
    private static List<String> parameterNames = makeImmutableList("class", "type", "name", "attribute");
    
    private Match(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      this.fClass = pClass;
      this.fType = pType;
      this.fName = pName;
      this.fAttribute = pAttribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("class".equals(parameterName)) return this.fClass;
      if ("type".equals(parameterName)) return this.fType;
      if ("name".equals(parameterName)) return this.fName;
      if ("attribute".equals(parameterName)) return this.fAttribute;
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
    
    public Trace getAttribute() {
      return this.fAttribute;
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
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (Trace) newValue;
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
    
    public void setAttribute(final Trace pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return AddAttributePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fClass, fType, fName, fAttribute};
    }
    
    @Override
    public AddAttributePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fClass, fType, fName, fAttribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"type\"=" + prettyPrintValue(fType) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName) + ", ");
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fClass, fType, fName, fAttribute);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AddAttributePostcondition.Match)) {
          AddAttributePostcondition.Match other = (AddAttributePostcondition.Match) obj;
          return Objects.equals(fClass, other.fClass) && Objects.equals(fType, other.fType) && Objects.equals(fName, other.fName) && Objects.equals(fAttribute, other.fAttribute);
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
    public AddAttributePostcondition specification() {
      return AddAttributePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AddAttributePostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AddAttributePostcondition.Match newMutableMatch(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      return new Mutable(pClass, pType, pName, pAttribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AddAttributePostcondition.Match newMatch(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      return new Immutable(pClass, pType, pName, pAttribute);
    }
    
    private static final class Mutable extends AddAttributePostcondition.Match {
      Mutable(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
        super(pClass, pType, pName, pAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends AddAttributePostcondition.Match {
      Immutable(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
        super(pClass, pType, pName, pAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // AAA10 - Add Attribute - Postcondition
   * pattern AddAttributePostcondition (class : Trace, type : Trace, name : java String, attribute : Trace) {
   * 	find created_class_attribute (class, attribute);
   * 	find set_attribute_name (attribute, name);
   * 	find set_attribute_type (attribute, type);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AddAttributePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<AddAttributePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AddAttributePostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static AddAttributePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_CLASS = 0;
    
    private final static int POSITION_TYPE = 1;
    
    private final static int POSITION_NAME = 2;
    
    private final static int POSITION_ATTRIBUTE = 3;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AddAttributePostcondition.Matcher.class);
    
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
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AddAttributePostcondition.Match> getAllMatches(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      return rawGetAllMatches(new Object[]{pClass, pType, pName, pAttribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public AddAttributePostcondition.Match getOneArbitraryMatch(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      return rawGetOneArbitraryMatch(new Object[]{pClass, pType, pName, pAttribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      return rawHasMatch(new Object[]{pClass, pType, pName, pAttribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      return rawCountMatches(new Object[]{pClass, pType, pName, pAttribute});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute, final IMatchProcessor<? super AddAttributePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pClass, pType, pName, pAttribute}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute, final IMatchProcessor<? super AddAttributePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pClass, pType, pName, pAttribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AddAttributePostcondition.Match newMatch(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute) {
      return AddAttributePostcondition.Match.newMatch(pClass, pType, pName, pAttribute);
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
    public Set<Trace> getAllValuesOfclass(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass(final Trace pType, final String pName, final Trace pAttribute) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      null, 
      pType, 
      pName, 
      pAttribute
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
    public Set<Trace> getAllValuesOftype(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOftype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftype(final Trace pClass, final String pName, final Trace pAttribute) {
      return rawAccumulateAllValuesOftype(new Object[]{
      pClass, 
      null, 
      pName, 
      pAttribute
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
    public Set<String> getAllValuesOfname(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Trace pClass, final Trace pType, final Trace pAttribute) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pClass, 
      pType, 
      null, 
      pAttribute
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfattribute(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute() {
      return rawAccumulateAllValuesOfattribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute(final AddAttributePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute(final Trace pClass, final Trace pType, final String pName) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      pClass, 
      pType, 
      pName, 
      null
      });
    }
    
    @Override
    protected AddAttributePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return AddAttributePostcondition.Match.newMatch((Trace) t.get(POSITION_CLASS), (Trace) t.get(POSITION_TYPE), (String) t.get(POSITION_NAME), (Trace) t.get(POSITION_ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddAttributePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return AddAttributePostcondition.Match.newMatch((Trace) match[POSITION_CLASS], (Trace) match[POSITION_TYPE], (String) match[POSITION_NAME], (Trace) match[POSITION_ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected AddAttributePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AddAttributePostcondition.Match.newMutableMatch((Trace) match[POSITION_CLASS], (Trace) match[POSITION_TYPE], (String) match[POSITION_NAME], (Trace) match[POSITION_ATTRIBUTE]);
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
    public static IQuerySpecification<AddAttributePostcondition.Matcher> querySpecification() {
      return AddAttributePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<AddAttributePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pType the value of pattern parameter type in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * 
     */
    public abstract void process(final Trace pClass, final Trace pType, final String pName, final Trace pAttribute);
    
    @Override
    public void process(final AddAttributePostcondition.Match match) {
      process(match.getValueOfClass(), match.getType(), match.getName(), match.getAttribute());
    }
  }
  
  private AddAttributePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AddAttributePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected AddAttributePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return AddAttributePostcondition.Matcher.on(engine);
  }
  
  @Override
  public AddAttributePostcondition.Matcher instantiate() {
    return AddAttributePostcondition.Matcher.create();
  }
  
  @Override
  public AddAttributePostcondition.Match newEmptyMatch() {
    return AddAttributePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public AddAttributePostcondition.Match newMatch(final Object... parameters) {
    return AddAttributePostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (java.lang.String) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition (visibility: PUBLIC, simpleName: AddAttributePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition (visibility: PUBLIC, simpleName: AddAttributePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static AddAttributePostcondition INSTANCE = new AddAttributePostcondition();
    
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
    private final static AddAttributePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pType = new PParameter("type", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pClass, parameter_pType, parameter_pName, parameter_pAttribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.AddAttributePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("class","type","name","attribute");
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
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_type, parameter_pType),
             new ExportedParameter(body, var_name, parameter_pName),
             new ExportedParameter(body, var_attribute, parameter_pAttribute)
          ));
          // 	find created_class_attribute (class, attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_attribute), Created_class_attribute.instance().getInternalQueryRepresentation());
          // 	find set_attribute_name (attribute, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_name), Set_attribute_name.instance().getInternalQueryRepresentation());
          // 	find set_attribute_type (attribute, type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_type), Set_attribute_type.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
