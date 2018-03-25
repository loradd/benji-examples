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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_superClass;
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
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:24+0200")
public final class ExtractSuperclassPrecondition extends BaseGeneratedEMFQuerySpecification<ExtractSuperclassPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition pattern,
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
    
    private TraceLink f$reference;
    
    private TraceLink f$source_superClass;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$class", "$attribute", "$reference", "$source_superClass");
    
    private Match(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      this.f$package = p$package;
      this.f$class = p$class;
      this.f$attribute = p$attribute;
      this.f$reference = p$reference;
      this.f$source_superClass = p$source_superClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      if ("$reference".equals(parameterName)) return this.f$reference;
      if ("$source_superClass".equals(parameterName)) return this.f$source_superClass;
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
    
    public TraceLink get$reference() {
      return this.f$reference;
    }
    
    public TraceLink get$source_superClass() {
      return this.f$source_superClass;
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
      if ("$reference".equals(parameterName) ) {
          this.f$reference = (TraceLink) newValue;
          return true;
      }
      if ("$source_superClass".equals(parameterName) ) {
          this.f$source_superClass = (TraceLink) newValue;
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
    
    public void set$reference(final TraceLink p$reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$reference = p$reference;
    }
    
    public void set$source_superClass(final TraceLink p$source_superClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$source_superClass = p$source_superClass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExtractSuperclassPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$class, f$attribute, f$reference, f$source_superClass};
    }
    
    @Override
    public ExtractSuperclassPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$class, f$attribute, f$reference, f$source_superClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute) + ", ");
      result.append("\"$reference\"=" + prettyPrintValue(f$reference) + ", ");
      result.append("\"$source_superClass\"=" + prettyPrintValue(f$source_superClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$class, f$attribute, f$reference, f$source_superClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ExtractSuperclassPrecondition.Match)) {
          ExtractSuperclassPrecondition.Match other = (ExtractSuperclassPrecondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$class, other.f$class) && Objects.equals(f$attribute, other.f$attribute) && Objects.equals(f$reference, other.f$reference) && Objects.equals(f$source_superClass, other.f$source_superClass);
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
    public ExtractSuperclassPrecondition specification() {
      return ExtractSuperclassPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ExtractSuperclassPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractSuperclassPrecondition.Match newMutableMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return new Mutable(p$package, p$class, p$attribute, p$reference, p$source_superClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractSuperclassPrecondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return new Immutable(p$package, p$class, p$attribute, p$reference, p$source_superClass);
    }
    
    private static final class Mutable extends ExtractSuperclassPrecondition.Match {
      Mutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
        super(p$package, p$class, p$attribute, p$reference, p$source_superClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractSuperclassPrecondition.Match {
      Immutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
        super(p$package, p$class, p$attribute, p$reference, p$source_superClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCAR18 - Extract Superclass - Precondition
   * pattern ExtractSuperclassPrecondition ($package : TraceLink, $class : TraceLink, $attribute : TraceLink, $reference : TraceLink, $source_superClass : TraceLink) {
   * 	find get_package_class ($package, $class);
   * 	find get_class_attribute ($class, $attribute);
   * 	find get_class_reference ($class, $reference);
   * 	find get_class_superClass ($class, $source_superClass);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ExtractSuperclassPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<ExtractSuperclassPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ExtractSuperclassPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ExtractSuperclassPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$CLASS = 1;
    
    private final static int POSITION_$ATTRIBUTE = 2;
    
    private final static int POSITION_$REFERENCE = 3;
    
    private final static int POSITION_$SOURCE_SUPERCLASS = 4;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExtractSuperclassPrecondition.Matcher.class);
    
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
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractSuperclassPrecondition.Match> getAllMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawGetAllMatches(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ExtractSuperclassPrecondition.Match getOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawHasMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawCountMatches(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final IMatchProcessor<? super ExtractSuperclassPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final IMatchProcessor<? super ExtractSuperclassPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractSuperclassPrecondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return ExtractSuperclassPrecondition.Match.newMatch(p$package, p$class, p$attribute, p$reference, p$source_superClass);
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
    public Set<TraceLink> getAllValuesOf$package(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$class, 
      p$attribute, 
      p$reference, 
      p$source_superClass
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
    public Set<TraceLink> getAllValuesOf$class(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$package, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      p$package, 
      null, 
      p$attribute, 
      p$reference, 
      p$source_superClass
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
    public Set<TraceLink> getAllValuesOf$attribute(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final TraceLink p$package, final TraceLink p$class, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawAccumulateAllValuesOf$attribute(new Object[]{
      p$package, 
      p$class, 
      null, 
      p$reference, 
      p$source_superClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$reference(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$reference() {
      return rawAccumulateAllValuesOf$reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$reference(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$reference(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$source_superClass) {
      return rawAccumulateAllValuesOf$reference(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      null, 
      p$source_superClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$source_superClass(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$SOURCE_SUPERCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$source_superClass() {
      return rawAccumulateAllValuesOf$source_superClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$source_superClass(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$source_superClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$source_superClass(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference) {
      return rawAccumulateAllValuesOf$source_superClass(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      p$reference, 
      null
      });
    }
    
    @Override
    protected ExtractSuperclassPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractSuperclassPrecondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (TraceLink) t.get(POSITION_$CLASS), (TraceLink) t.get(POSITION_$ATTRIBUTE), (TraceLink) t.get(POSITION_$REFERENCE), (TraceLink) t.get(POSITION_$SOURCE_SUPERCLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractSuperclassPrecondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (TraceLink) match[POSITION_$REFERENCE], (TraceLink) match[POSITION_$SOURCE_SUPERCLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractSuperclassPrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (TraceLink) match[POSITION_$REFERENCE], (TraceLink) match[POSITION_$SOURCE_SUPERCLASS]);
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
    public static IQuerySpecification<ExtractSuperclassPrecondition.Matcher> querySpecification() {
      return ExtractSuperclassPrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ExtractSuperclassPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * @param p$reference the value of pattern parameter $reference in the currently processed match
     * @param p$source_superClass the value of pattern parameter $source_superClass in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass);
    
    @Override
    public void process(final ExtractSuperclassPrecondition.Match match) {
      process(match.get$package(), match.get$class(), match.get$attribute(), match.get$reference(), match.get$source_superClass());
    }
  }
  
  private ExtractSuperclassPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ExtractSuperclassPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExtractSuperclassPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ExtractSuperclassPrecondition.Matcher.on(engine);
  }
  
  @Override
  public ExtractSuperclassPrecondition.Matcher instantiate() {
    return ExtractSuperclassPrecondition.Matcher.create();
  }
  
  @Override
  public ExtractSuperclassPrecondition.Match newEmptyMatch() {
    return ExtractSuperclassPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public ExtractSuperclassPrecondition.Match newMatch(final Object... parameters) {
    return ExtractSuperclassPrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.trace.TraceLink) parameters[3], (se.mdh.idt.benji.trace.TraceLink) parameters[4]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition (visibility: PUBLIC, simpleName: ExtractSuperclassPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition (visibility: PUBLIC, simpleName: ExtractSuperclassPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ExtractSuperclassPrecondition INSTANCE = new ExtractSuperclassPrecondition();
    
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
    private final static ExtractSuperclassPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$reference = new PParameter("$reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$source_superClass = new PParameter("$source_superClass", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$class, parameter_p$attribute, parameter_p$reference, parameter_p$source_superClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$class","$attribute","$reference","$source_superClass");
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
          PVariable var_$reference = body.getOrCreateVariableByName("$reference");
          PVariable var_$source_superClass = body.getOrCreateVariableByName("$source_superClass");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$source_superClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$attribute, parameter_p$attribute),
             new ExportedParameter(body, var_$reference, parameter_p$reference),
             new ExportedParameter(body, var_$source_superClass, parameter_p$source_superClass)
          ));
          // 	find get_package_class ($package, $class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$class), Get_package_class.instance().getInternalQueryRepresentation());
          // 	find get_class_attribute ($class, $attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$attribute), Get_class_attribute.instance().getInternalQueryRepresentation());
          // 	find get_class_reference ($class, $reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$reference), Get_class_reference.instance().getInternalQueryRepresentation());
          // 	find get_class_superClass ($class, $source_superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$source_superClass), Get_class_superClass.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
