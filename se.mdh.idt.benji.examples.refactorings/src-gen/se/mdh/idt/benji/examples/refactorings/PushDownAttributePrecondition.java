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
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_class_superClass;
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
    private Trace fSuperClass;
    
    private Trace fClass;
    
    private Trace fAttribute;
    
    private static List<String> parameterNames = makeImmutableList("superClass", "class", "attribute");
    
    private Match(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      this.fSuperClass = pSuperClass;
      this.fClass = pClass;
      this.fAttribute = pAttribute;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("superClass".equals(parameterName)) return this.fSuperClass;
      if ("class".equals(parameterName)) return this.fClass;
      if ("attribute".equals(parameterName)) return this.fAttribute;
      return null;
    }
    
    public Trace getSuperClass() {
      return this.fSuperClass;
    }
    
    public Trace getValueOfClass() {
      return this.fClass;
    }
    
    public Trace getAttribute() {
      return this.fAttribute;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("superClass".equals(parameterName) ) {
          this.fSuperClass = (Trace) newValue;
          return true;
      }
      if ("class".equals(parameterName) ) {
          this.fClass = (Trace) newValue;
          return true;
      }
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setSuperClass(final Trace pSuperClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSuperClass = pSuperClass;
    }
    
    public void setClass(final Trace pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setAttribute(final Trace pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
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
      return new Object[]{fSuperClass, fClass, fAttribute};
    }
    
    @Override
    public PushDownAttributePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fSuperClass, fClass, fAttribute) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"superClass\"=" + prettyPrintValue(fSuperClass) + ", ");
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fSuperClass, fClass, fAttribute);
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
          return Objects.equals(fSuperClass, other.fSuperClass) && Objects.equals(fClass, other.fClass) && Objects.equals(fAttribute, other.fAttribute);
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
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static PushDownAttributePrecondition.Match newMutableMatch(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      return new Mutable(pSuperClass, pClass, pAttribute);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static PushDownAttributePrecondition.Match newMatch(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      return new Immutable(pSuperClass, pClass, pAttribute);
    }
    
    private static final class Mutable extends PushDownAttributePrecondition.Match {
      Mutable(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
        super(pSuperClass, pClass, pAttribute);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends PushDownAttributePrecondition.Match {
      Immutable(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
        super(pSuperClass, pClass, pAttribute);
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
   * // CDACA22 - Push Down Attribute - Precondition
   * pattern PushDownAttributePrecondition (superClass : Trace, class : Trace, attribute : Trace) {
   * 	find preserved_class_attribute (superClass, attribute);
   * 	find preserved_class_superClass (class, superClass); 
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
    
    private final static int POSITION_SUPERCLASS = 0;
    
    private final static int POSITION_CLASS = 1;
    
    private final static int POSITION_ATTRIBUTE = 2;
    
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
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<PushDownAttributePrecondition.Match> getAllMatches(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      return rawGetAllMatches(new Object[]{pSuperClass, pClass, pAttribute});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public PushDownAttributePrecondition.Match getOneArbitraryMatch(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      return rawGetOneArbitraryMatch(new Object[]{pSuperClass, pClass, pAttribute});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      return rawHasMatch(new Object[]{pSuperClass, pClass, pAttribute});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      return rawCountMatches(new Object[]{pSuperClass, pClass, pAttribute});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pSuperClass, final Trace pClass, final Trace pAttribute, final IMatchProcessor<? super PushDownAttributePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{pSuperClass, pClass, pAttribute}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pSuperClass, final Trace pClass, final Trace pAttribute, final IMatchProcessor<? super PushDownAttributePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pSuperClass, pClass, pAttribute}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public PushDownAttributePrecondition.Match newMatch(final Trace pSuperClass, final Trace pClass, final Trace pAttribute) {
      return PushDownAttributePrecondition.Match.newMatch(pSuperClass, pClass, pAttribute);
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfsuperClass(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_SUPERCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsuperClass() {
      return rawAccumulateAllValuesOfsuperClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsuperClass(final PushDownAttributePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfsuperClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsuperClass(final Trace pClass, final Trace pAttribute) {
      return rawAccumulateAllValuesOfsuperClass(new Object[]{
      null, 
      pClass, 
      pAttribute
      });
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
    public Set<Trace> getAllValuesOfclass(final PushDownAttributePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass(final Trace pSuperClass, final Trace pAttribute) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      pSuperClass, 
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
    public Set<Trace> getAllValuesOfattribute(final PushDownAttributePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute(final Trace pSuperClass, final Trace pClass) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      pSuperClass, 
      pClass, 
      null
      });
    }
    
    @Override
    protected PushDownAttributePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return PushDownAttributePrecondition.Match.newMatch((Trace) t.get(POSITION_SUPERCLASS), (Trace) t.get(POSITION_CLASS), (Trace) t.get(POSITION_ATTRIBUTE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownAttributePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return PushDownAttributePrecondition.Match.newMatch((Trace) match[POSITION_SUPERCLASS], (Trace) match[POSITION_CLASS], (Trace) match[POSITION_ATTRIBUTE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected PushDownAttributePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return PushDownAttributePrecondition.Match.newMutableMatch((Trace) match[POSITION_SUPERCLASS], (Trace) match[POSITION_CLASS], (Trace) match[POSITION_ATTRIBUTE]);
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
     * @param pSuperClass the value of pattern parameter superClass in the currently processed match
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * 
     */
    public abstract void process(final Trace pSuperClass, final Trace pClass, final Trace pAttribute);
    
    @Override
    public void process(final PushDownAttributePrecondition.Match match) {
      process(match.getSuperClass(), match.getValueOfClass(), match.getAttribute());
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
    return PushDownAttributePrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2]);
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
    
    private final PParameter parameter_pSuperClass = new PParameter("superClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pSuperClass, parameter_pClass, parameter_pAttribute);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.PushDownAttributePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("superClass","class","attribute");
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
          PVariable var_superClass = body.getOrCreateVariableByName("superClass");
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          new TypeConstraint(body, Tuples.flatTupleOf(var_superClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_superClass, parameter_pSuperClass),
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_attribute, parameter_pAttribute)
          ));
          // 	find preserved_class_attribute (superClass, attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_superClass, var_attribute), Preserved_class_attribute.instance().getInternalQueryRepresentation());
          // 	find preserved_class_superClass (class, superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_superClass), Preserved_class_superClass.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
