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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_attribute_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_class;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:20+0200")
public final class ExtractClassPrecondition extends BaseGeneratedEMFQuerySpecification<ExtractClassPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition pattern,
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
    
    private TraceLink f$class;
    
    private TraceLink f$attribute;
    
    private String f$attribute_class_name;
    
    private String f$attribute_reference_name;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$class", "$attribute", "$attribute_class_name", "$attribute_reference_name");
    
    private Match(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      this.f$package = p$package;
      this.f$class = p$class;
      this.f$attribute = p$attribute;
      this.f$attribute_class_name = p$attribute_class_name;
      this.f$attribute_reference_name = p$attribute_reference_name;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      if ("$attribute_class_name".equals(parameterName)) return this.f$attribute_class_name;
      if ("$attribute_reference_name".equals(parameterName)) return this.f$attribute_reference_name;
      return null;
    }
    
    public TraceLink get$package() {
      return this.f$package;
    }
    
    public TraceLink get$class() {
      return this.f$class;
    }
    
    public TraceLink get$attribute() {
      return this.f$attribute;
    }
    
    public String get$attribute_class_name() {
      return this.f$attribute_class_name;
    }
    
    public String get$attribute_reference_name() {
      return this.f$attribute_reference_name;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (TraceLink) newValue;
          return true;
      }
      if ("$class".equals(parameterName) ) {
          this.f$class = (TraceLink) newValue;
          return true;
      }
      if ("$attribute".equals(parameterName) ) {
          this.f$attribute = (TraceLink) newValue;
          return true;
      }
      if ("$attribute_class_name".equals(parameterName) ) {
          this.f$attribute_class_name = (String) newValue;
          return true;
      }
      if ("$attribute_reference_name".equals(parameterName) ) {
          this.f$attribute_reference_name = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final TraceLink p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    public void set$class(final TraceLink p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    public void set$attribute(final TraceLink p$attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute = p$attribute;
    }
    
    public void set$attribute_class_name(final String p$attribute_class_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute_class_name = p$attribute_class_name;
    }
    
    public void set$attribute_reference_name(final String p$attribute_reference_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute_reference_name = p$attribute_reference_name;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExtractClassPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$class, f$attribute, f$attribute_class_name, f$attribute_reference_name};
    }
    
    @Override
    public ExtractClassPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$class, f$attribute, f$attribute_class_name, f$attribute_reference_name) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute) + ", ");
      result.append("\"$attribute_class_name\"=" + prettyPrintValue(f$attribute_class_name) + ", ");
      result.append("\"$attribute_reference_name\"=" + prettyPrintValue(f$attribute_reference_name));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$class, f$attribute, f$attribute_class_name, f$attribute_reference_name);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ExtractClassPrecondition.Match)) {
          ExtractClassPrecondition.Match other = (ExtractClassPrecondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$class, other.f$class) && Objects.equals(f$attribute, other.f$attribute) && Objects.equals(f$attribute_class_name, other.f$attribute_class_name) && Objects.equals(f$attribute_reference_name, other.f$attribute_reference_name);
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
    public ExtractClassPrecondition specification() {
      return ExtractClassPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ExtractClassPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractClassPrecondition.Match newMutableMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return new Mutable(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractClassPrecondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return new Immutable(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name);
    }
    
    private static final class Mutable extends ExtractClassPrecondition.Match {
      Mutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
        super(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractClassPrecondition.Match {
      Immutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
        super(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CCAC8 - Extract Class - Precondition
   * pattern ExtractClassPrecondition ($package : TraceLink, $class : TraceLink, $attribute : TraceLink, $attribute_class_name : java String, $attribute_reference_name : java String) {
   * 	find get_package_class ($package, $class);
   * 	find get_class_attribute ($class, $attribute);	
   * 	find get_attribute_name ($attribute, $attribute_name);
   * 	$attribute_class_name == eval($attribute_name.toFirstUpper + "Class");
   * 	$attribute_reference_name == eval($attribute_name + "Reference"); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ExtractClassPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<ExtractClassPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ExtractClassPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ExtractClassPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$CLASS = 1;
    
    private final static int POSITION_$ATTRIBUTE = 2;
    
    private final static int POSITION_$ATTRIBUTE_CLASS_NAME = 3;
    
    private final static int POSITION_$ATTRIBUTE_REFERENCE_NAME = 4;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExtractClassPrecondition.Matcher.class);
    
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
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractClassPrecondition.Match> getAllMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return rawGetAllMatches(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ExtractClassPrecondition.Match getOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return rawHasMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return rawCountMatches(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final IMatchProcessor<? super ExtractClassPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final IMatchProcessor<? super ExtractClassPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractClassPrecondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return ExtractClassPrecondition.Match.newMatch(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name);
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
    public Set<TraceLink> getAllValuesOf$package(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$class, 
      p$attribute, 
      p$attribute_class_name, 
      p$attribute_reference_name
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
    public Set<TraceLink> getAllValuesOf$class(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$package, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      p$package, 
      null, 
      p$attribute, 
      p$attribute_class_name, 
      p$attribute_reference_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$attribute(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute() {
      return rawAccumulateAllValuesOf$attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final TraceLink p$package, final TraceLink p$class, final String p$attribute_class_name, final String p$attribute_reference_name) {
      return rawAccumulateAllValuesOf$attribute(new Object[]{
      p$package, 
      p$class, 
      null, 
      p$attribute_class_name, 
      p$attribute_reference_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$attribute_class_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$ATTRIBUTE_CLASS_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_class_name() {
      return rawAccumulateAllValuesOf$attribute_class_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_class_name(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute_class_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_class_name(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_reference_name) {
      return rawAccumulateAllValuesOf$attribute_class_name(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      null, 
      p$attribute_reference_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$attribute_reference_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$ATTRIBUTE_REFERENCE_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_reference_name() {
      return rawAccumulateAllValuesOf$attribute_reference_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_reference_name(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute_reference_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_reference_name(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name) {
      return rawAccumulateAllValuesOf$attribute_reference_name(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      p$attribute_class_name, 
      null
      });
    }
    
    @Override
    protected ExtractClassPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractClassPrecondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (TraceLink) t.get(POSITION_$CLASS), (TraceLink) t.get(POSITION_$ATTRIBUTE), (String) t.get(POSITION_$ATTRIBUTE_CLASS_NAME), (String) t.get(POSITION_$ATTRIBUTE_REFERENCE_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractClassPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractClassPrecondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (String) match[POSITION_$ATTRIBUTE_CLASS_NAME], (String) match[POSITION_$ATTRIBUTE_REFERENCE_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractClassPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractClassPrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (String) match[POSITION_$ATTRIBUTE_CLASS_NAME], (String) match[POSITION_$ATTRIBUTE_REFERENCE_NAME]);
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
    public static IQuerySpecification<ExtractClassPrecondition.Matcher> querySpecification() {
      return ExtractClassPrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ExtractClassPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * @param p$attribute_class_name the value of pattern parameter $attribute_class_name in the currently processed match
     * @param p$attribute_reference_name the value of pattern parameter $attribute_reference_name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name);
    
    @Override
    public void process(final ExtractClassPrecondition.Match match) {
      process(match.get$package(), match.get$class(), match.get$attribute(), match.get$attribute_class_name(), match.get$attribute_reference_name());
    }
  }
  
  private ExtractClassPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ExtractClassPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExtractClassPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ExtractClassPrecondition.Matcher.on(engine);
  }
  
  @Override
  public ExtractClassPrecondition.Matcher instantiate() {
    return ExtractClassPrecondition.Matcher.create();
  }
  
  @Override
  public ExtractClassPrecondition.Match newEmptyMatch() {
    return ExtractClassPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public ExtractClassPrecondition.Match newMatch(final Object... parameters) {
    return ExtractClassPrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (java.lang.String) parameters[3], (java.lang.String) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition (visibility: PUBLIC, simpleName: ExtractClassPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition (visibility: PUBLIC, simpleName: ExtractClassPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ExtractClassPrecondition INSTANCE = new ExtractClassPrecondition();
    
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
    private final static ExtractClassPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute_class_name = new PParameter("$attribute_class_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute_reference_name = new PParameter("$attribute_reference_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$class, parameter_p$attribute, parameter_p$attribute_class_name, parameter_p$attribute_reference_name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$class","$attribute","$attribute_class_name","$attribute_reference_name");
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
          PVariable var_$class = body.getOrCreateVariableByName("$class");
          PVariable var_$attribute = body.getOrCreateVariableByName("$attribute");
          PVariable var_$attribute_class_name = body.getOrCreateVariableByName("$attribute_class_name");
          PVariable var_$attribute_reference_name = body.getOrCreateVariableByName("$attribute_reference_name");
          PVariable var_$attribute_name = body.getOrCreateVariableByName("$attribute_name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$attribute_class_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$attribute_reference_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$attribute, parameter_p$attribute),
             new ExportedParameter(body, var_$attribute_class_name, parameter_p$attribute_class_name),
             new ExportedParameter(body, var_$attribute_reference_name, parameter_p$attribute_reference_name)
          ));
          // 	find get_package_class ($package, $class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$class), Get_package_class.instance().getInternalQueryRepresentation());
          // 	find get_class_attribute ($class, $attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$attribute), Get_class_attribute.instance().getInternalQueryRepresentation());
          // 		find get_attribute_name ($attribute, $attribute_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$attribute, var_$attribute_name), Get_attribute_name.instance().getInternalQueryRepresentation());
          // 	$attribute_class_name == eval($attribute_name.toFirstUpper + "Class")
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern ExtractClassPrecondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("$attribute_name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String $attribute_name = (String) provider.getValue("$attribute_name");
                  return evaluateExpression_1_1($attribute_name);
              }
          },  var__virtual_0_ ); 
          new Equality(body, var_$attribute_class_name, var__virtual_0_);
          // 	$attribute_reference_name == eval($attribute_name + "Reference")
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern ExtractClassPrecondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("$attribute_name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String $attribute_name = (String) provider.getValue("$attribute_name");
                  return evaluateExpression_1_2($attribute_name);
              }
          },  var__virtual_1_ ); 
          new Equality(body, var_$attribute_reference_name, var__virtual_1_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final String $attribute_name) {
    String _firstUpper = StringExtensions.toFirstUpper($attribute_name);
    String _plus = (_firstUpper + "Class");
    return _plus;
  }
  
  private static String evaluateExpression_1_2(final String $attribute_name) {
    return ($attribute_name + "Reference");
  }
}
