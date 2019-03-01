/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
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
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_class_super;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_reference;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // CADCAR18 - Extract Superclass - Precondition
 *         pattern ExtractSuperclassPrecondition($package : Trace, $class : Trace, $super : Trace, $attribute : Trace, $reference : Trace) {
 *         	find preserved_package ($package);
 *         	find preserved_class ($class);
 *         	find preserved_package_class ($package, $class);
 *         	find preserved_class ($super);
 *         	find preserved_package_class ($package, $super);
 *         	find preserved_class_name ($class, _class_name);
 *         	find preserved_class_super($class, $super);
 *         	find preserved_attribute ($attribute);
 *         	find preserved_class_attribute ($class, $attribute);
 *         	find preserved_reference ($reference);
 *         	find preserved_class_reference ($class, $reference);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
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
    private Trace f$package;
    
    private Trace f$class;
    
    private Trace f$super;
    
    private Trace f$attribute;
    
    private Trace f$reference;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$class", "$super", "$attribute", "$reference");
    
    private Match(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      this.f$package = p$package;
      this.f$class = p$class;
      this.f$super = p$super;
      this.f$attribute = p$attribute;
      this.f$reference = p$reference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$super".equals(parameterName)) return this.f$super;
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      if ("$reference".equals(parameterName)) return this.f$reference;
      return null;
    }
    
    public Trace get$package() {
      return this.f$package;
    }
    
    public Trace get$class() {
      return this.f$class;
    }
    
    public Trace get$super() {
      return this.f$super;
    }
    
    public Trace get$attribute() {
      return this.f$attribute;
    }
    
    public Trace get$reference() {
      return this.f$reference;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (Trace) newValue;
          return true;
      }
      if ("$class".equals(parameterName) ) {
          this.f$class = (Trace) newValue;
          return true;
      }
      if ("$super".equals(parameterName) ) {
          this.f$super = (Trace) newValue;
          return true;
      }
      if ("$attribute".equals(parameterName) ) {
          this.f$attribute = (Trace) newValue;
          return true;
      }
      if ("$reference".equals(parameterName) ) {
          this.f$reference = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final Trace p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    public void set$class(final Trace p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    public void set$super(final Trace p$super) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$super = p$super;
    }
    
    public void set$attribute(final Trace p$attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute = p$attribute;
    }
    
    public void set$reference(final Trace p$reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$reference = p$reference;
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
      return new Object[]{f$package, f$class, f$super, f$attribute, f$reference};
    }
    
    @Override
    public ExtractSuperclassPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$class, f$super, f$attribute, f$reference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$super\"=" + prettyPrintValue(f$super) + ", ");
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute) + ", ");
      result.append("\"$reference\"=" + prettyPrintValue(f$reference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(f$package, f$class, f$super, f$attribute, f$reference);
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
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$class, other.f$class) && Objects.equals(f$super, other.f$super) && Objects.equals(f$attribute, other.f$attribute) && Objects.equals(f$reference, other.f$reference);
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
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractSuperclassPrecondition.Match newMutableMatch(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return new Mutable(p$package, p$class, p$super, p$attribute, p$reference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractSuperclassPrecondition.Match newMatch(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return new Immutable(p$package, p$class, p$super, p$attribute, p$reference);
    }
    
    private static final class Mutable extends ExtractSuperclassPrecondition.Match {
      Mutable(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
        super(p$package, p$class, p$super, p$attribute, p$reference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractSuperclassPrecondition.Match {
      Immutable(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
        super(p$package, p$class, p$super, p$attribute, p$reference);
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
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCAR18 - Extract Superclass - Precondition
   * pattern ExtractSuperclassPrecondition($package : Trace, $class : Trace, $super : Trace, $attribute : Trace, $reference : Trace) {
   * 	find preserved_package ($package);
   * 	find preserved_class ($class);
   * 	find preserved_package_class ($package, $class);
   * 	find preserved_class ($super);
   * 	find preserved_package_class ($package, $super);
   * 	find preserved_class_name ($class, _class_name);
   * 	find preserved_class_super($class, $super);
   * 	find preserved_attribute ($attribute);
   * 	find preserved_class_attribute ($class, $attribute);
   * 	find preserved_reference ($reference);
   * 	find preserved_class_reference ($class, $reference);
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
     * 
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
    
    private static final int POSITION_$PACKAGE = 0;
    
    private static final int POSITION_$CLASS = 1;
    
    private static final int POSITION_$SUPER = 2;
    
    private static final int POSITION_$ATTRIBUTE = 3;
    
    private static final int POSITION_$REFERENCE = 4;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExtractSuperclassPrecondition.Matcher.class);
    
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
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
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractSuperclassPrecondition.Match> getAllMatches(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllMatches(new Object[]{p$package, p$class, p$super, p$attribute, p$reference}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<ExtractSuperclassPrecondition.Match> streamAllMatches(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllMatches(new Object[]{p$package, p$class, p$super, p$attribute, p$reference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<ExtractSuperclassPrecondition.Match> getOneArbitraryMatch(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$class, p$super, p$attribute, p$reference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawHasMatch(new Object[]{p$package, p$class, p$super, p$attribute, p$reference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawCountMatches(new Object[]{p$package, p$class, p$super, p$attribute, p$reference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference, final Consumer<? super ExtractSuperclassPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$class, p$super, p$attribute, p$reference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference, final Consumer<? super ExtractSuperclassPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$class, p$super, p$attribute, p$reference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$super the fixed value of pattern parameter $super, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractSuperclassPrecondition.Match newMatch(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return ExtractSuperclassPrecondition.Match.newMatch(p$package, p$class, p$super, p$attribute, p$reference);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$package(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$PACKAGE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$package() {
      return rawStreamAllValuesOf$package(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$package() {
      return rawStreamAllValuesOf$package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$package(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$package(final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllValuesOf$package(new Object[]{null, p$class, p$super, p$attribute, p$reference});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$package(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$package(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$package(final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllValuesOf$package(new Object[]{null, p$class, p$super, p$attribute, p$reference}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$class(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$CLASS, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$class() {
      return rawStreamAllValuesOf$class(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$class() {
      return rawStreamAllValuesOf$class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$class(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$class(final Trace p$package, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllValuesOf$class(new Object[]{p$package, null, p$super, p$attribute, p$reference});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$class(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$class(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$class(final Trace p$package, final Trace p$super, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllValuesOf$class(new Object[]{p$package, null, p$super, p$attribute, p$reference}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$super(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$SUPER, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$super() {
      return rawStreamAllValuesOf$super(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$super() {
      return rawStreamAllValuesOf$super(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$super(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$super(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$super(final Trace p$package, final Trace p$class, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllValuesOf$super(new Object[]{p$package, p$class, null, p$attribute, p$reference});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$super(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$super(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $super.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$super(final Trace p$package, final Trace p$class, final Trace p$attribute, final Trace p$reference) {
      return rawStreamAllValuesOf$super(new Object[]{p$package, p$class, null, p$attribute, p$reference}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$attribute(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$ATTRIBUTE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$attribute() {
      return rawStreamAllValuesOf$attribute(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$attribute() {
      return rawStreamAllValuesOf$attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$attribute(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$attribute(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$reference) {
      return rawStreamAllValuesOf$attribute(new Object[]{p$package, p$class, p$super, null, p$reference});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$attribute(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$attribute(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$attribute(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$reference) {
      return rawStreamAllValuesOf$attribute(new Object[]{p$package, p$class, p$super, null, p$reference}).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Trace> rawStreamAllValuesOf$reference(final Object[] parameters) {
      return rawStreamAllValues(POSITION_$REFERENCE, parameters).map(Trace.class::cast);
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$reference() {
      return rawStreamAllValuesOf$reference(emptyArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$reference() {
      return rawStreamAllValuesOf$reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$reference(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Trace> streamAllValuesOf$reference(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return rawStreamAllValuesOf$reference(new Object[]{p$package, p$class, p$super, p$attribute, null});
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$reference(final ExtractSuperclassPrecondition.Match partialMatch) {
      return rawStreamAllValuesOf$reference(partialMatch.toArray()).collect(Collectors.toSet());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOf$reference(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute) {
      return rawStreamAllValuesOf$reference(new Object[]{p$package, p$class, p$super, p$attribute, null}).collect(Collectors.toSet());
    }
    
    @Override
    protected ExtractSuperclassPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractSuperclassPrecondition.Match.newMatch((Trace) t.get(POSITION_$PACKAGE), (Trace) t.get(POSITION_$CLASS), (Trace) t.get(POSITION_$SUPER), (Trace) t.get(POSITION_$ATTRIBUTE), (Trace) t.get(POSITION_$REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractSuperclassPrecondition.Match.newMatch((Trace) match[POSITION_$PACKAGE], (Trace) match[POSITION_$CLASS], (Trace) match[POSITION_$SUPER], (Trace) match[POSITION_$ATTRIBUTE], (Trace) match[POSITION_$REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractSuperclassPrecondition.Match.newMutableMatch((Trace) match[POSITION_$PACKAGE], (Trace) match[POSITION_$CLASS], (Trace) match[POSITION_$SUPER], (Trace) match[POSITION_$ATTRIBUTE], (Trace) match[POSITION_$REFERENCE]);
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
  public static abstract class Processor implements Consumer<ExtractSuperclassPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$super the value of pattern parameter $super in the currently processed match
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * @param p$reference the value of pattern parameter $reference in the currently processed match
     * 
     */
    public abstract void accept(final Trace p$package, final Trace p$class, final Trace p$super, final Trace p$attribute, final Trace p$reference);
    
    @Override
    public void accept(final ExtractSuperclassPrecondition.Match match) {
      accept(match.get$package(), match.get$class(), match.get$super(), match.get$attribute(), match.get$reference());
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
    return ExtractSuperclassPrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3], (se.mdh.idt.benji.trace.Trace) parameters[4]);
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
    private static final ExtractSuperclassPrecondition INSTANCE = new ExtractSuperclassPrecondition();
    
    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();
    
    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final ExtractSuperclassPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_$package = new PParameter("$package", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_$class = new PParameter("$class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_$super = new PParameter("$super", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_$reference = new PParameter("$reference", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_$package, parameter_$class, parameter_$super, parameter_$attribute, parameter_$reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$class","$super","$attribute","$reference");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_$package = body.getOrCreateVariableByName("$package");
          PVariable var_$class = body.getOrCreateVariableByName("$class");
          PVariable var_$super = body.getOrCreateVariableByName("$super");
          PVariable var_$attribute = body.getOrCreateVariableByName("$attribute");
          PVariable var_$reference = body.getOrCreateVariableByName("$reference");
          PVariable var__class_name = body.getOrCreateVariableByName("_class_name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$super), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_$package),
             new ExportedParameter(body, var_$class, parameter_$class),
             new ExportedParameter(body, var_$super, parameter_$super),
             new ExportedParameter(body, var_$attribute, parameter_$attribute),
             new ExportedParameter(body, var_$reference, parameter_$reference)
          ));
          // 	find preserved_package ($package)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package), Preserved_package.instance().getInternalQueryRepresentation());
          // 	find preserved_class ($class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class), Preserved_class.instance().getInternalQueryRepresentation());
          // 	find preserved_package_class ($package, $class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$class), Preserved_package_class.instance().getInternalQueryRepresentation());
          // 	find preserved_class ($super)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$super), Preserved_class.instance().getInternalQueryRepresentation());
          // 	find preserved_package_class ($package, $super)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$super), Preserved_package_class.instance().getInternalQueryRepresentation());
          // 	find preserved_class_name ($class, _class_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var__class_name), Preserved_class_name.instance().getInternalQueryRepresentation());
          // 	find preserved_class_super($class, $super)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$super), Preserved_class_super.instance().getInternalQueryRepresentation());
          // 	find preserved_attribute ($attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$attribute), Preserved_attribute.instance().getInternalQueryRepresentation());
          // 	find preserved_class_attribute ($class, $attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$attribute), Preserved_class_attribute.instance().getInternalQueryRepresentation());
          // 	find preserved_reference ($reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$reference), Preserved_reference.instance().getInternalQueryRepresentation());
          // 	find preserved_class_reference ($class, $reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$reference), Preserved_class_reference.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
