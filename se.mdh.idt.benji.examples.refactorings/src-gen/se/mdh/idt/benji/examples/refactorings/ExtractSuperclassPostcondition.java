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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.internal.Create_package_class;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_attribute;
import se.mdh.idt.benji.examples.refactorings.internal.Move_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_superClass;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:29+0200")
public final class ExtractSuperclassPostcondition extends BaseGeneratedEMFQuerySpecification<ExtractSuperclassPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition pattern,
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
    
    private TraceLink f$target_superClass;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$class", "$attribute", "$reference", "$source_superClass", "$target_superClass");
    
    private Match(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      this.f$package = p$package;
      this.f$class = p$class;
      this.f$attribute = p$attribute;
      this.f$reference = p$reference;
      this.f$source_superClass = p$source_superClass;
      this.f$target_superClass = p$target_superClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      if ("$reference".equals(parameterName)) return this.f$reference;
      if ("$source_superClass".equals(parameterName)) return this.f$source_superClass;
      if ("$target_superClass".equals(parameterName)) return this.f$target_superClass;
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
    
    public TraceLink get$target_superClass() {
      return this.f$target_superClass;
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
      if ("$target_superClass".equals(parameterName) ) {
          this.f$target_superClass = (TraceLink) newValue;
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
    
    public void set$target_superClass(final TraceLink p$target_superClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$target_superClass = p$target_superClass;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExtractSuperclassPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$class, f$attribute, f$reference, f$source_superClass, f$target_superClass};
    }
    
    @Override
    public ExtractSuperclassPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$class, f$attribute, f$reference, f$source_superClass, f$target_superClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute) + ", ");
      result.append("\"$reference\"=" + prettyPrintValue(f$reference) + ", ");
      result.append("\"$source_superClass\"=" + prettyPrintValue(f$source_superClass) + ", ");
      result.append("\"$target_superClass\"=" + prettyPrintValue(f$target_superClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$class, f$attribute, f$reference, f$source_superClass, f$target_superClass);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ExtractSuperclassPostcondition.Match)) {
          ExtractSuperclassPostcondition.Match other = (ExtractSuperclassPostcondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$class, other.f$class) && Objects.equals(f$attribute, other.f$attribute) && Objects.equals(f$reference, other.f$reference) && Objects.equals(f$source_superClass, other.f$source_superClass) && Objects.equals(f$target_superClass, other.f$target_superClass);
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
    public ExtractSuperclassPostcondition specification() {
      return ExtractSuperclassPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ExtractSuperclassPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null);
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
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractSuperclassPostcondition.Match newMutableMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return new Mutable(p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass);
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
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractSuperclassPostcondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return new Immutable(p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass);
    }
    
    private static final class Mutable extends ExtractSuperclassPostcondition.Match {
      Mutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
        super(p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractSuperclassPostcondition.Match {
      Immutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
        super(p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CADCAR18 - Extract Superclass - Postcondition
   * pattern ExtractSuperclassPostcondition ($package : TraceLink, $class : TraceLink, $attribute : TraceLink, $reference : TraceLink, $source_superClass : TraceLink, $target_superClass : TraceLink) {
   * 	find create_package_class ($package, $target_superClass);
   * 	find get_class_name ($class, $class_name);
   * 	$superClass_name == eval ("super_" + $class_name);
   * 	find set_class_name ($target_superClass, $superClass_name);
   * 	find move_class_reference ($class, $reference, $target_superClass);
   * 	find move_class_attribute ($class, $attribute, $target_superClass);
   * 	find set_class_superClass ($class, $target_superClass);
   * 	find set_class_superClass ($target_superClass, $source_superClass); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ExtractSuperclassPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<ExtractSuperclassPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ExtractSuperclassPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ExtractSuperclassPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$CLASS = 1;
    
    private final static int POSITION_$ATTRIBUTE = 2;
    
    private final static int POSITION_$REFERENCE = 3;
    
    private final static int POSITION_$SOURCE_SUPERCLASS = 4;
    
    private final static int POSITION_$TARGET_SUPERCLASS = 5;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExtractSuperclassPostcondition.Matcher.class);
    
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
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractSuperclassPostcondition.Match> getAllMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawGetAllMatches(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ExtractSuperclassPostcondition.Match getOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawHasMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawCountMatches(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass, final IMatchProcessor<? super ExtractSuperclassPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param p$source_superClass the fixed value of pattern parameter $source_superClass, or null if not bound.
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass, final IMatchProcessor<? super ExtractSuperclassPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass}, processor);
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
     * @param p$target_superClass the fixed value of pattern parameter $target_superClass, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractSuperclassPostcondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return ExtractSuperclassPostcondition.Match.newMatch(p$package, p$class, p$attribute, p$reference, p$source_superClass, p$target_superClass);
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
    public Set<TraceLink> getAllValuesOf$package(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$class, 
      p$attribute, 
      p$reference, 
      p$source_superClass, 
      p$target_superClass
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
    public Set<TraceLink> getAllValuesOf$class(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$package, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      p$package, 
      null, 
      p$attribute, 
      p$reference, 
      p$source_superClass, 
      p$target_superClass
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
    public Set<TraceLink> getAllValuesOf$attribute(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final TraceLink p$package, final TraceLink p$class, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawAccumulateAllValuesOf$attribute(new Object[]{
      p$package, 
      p$class, 
      null, 
      p$reference, 
      p$source_superClass, 
      p$target_superClass
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
    public Set<TraceLink> getAllValuesOf$reference(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$reference(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$source_superClass, final TraceLink p$target_superClass) {
      return rawAccumulateAllValuesOf$reference(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      null, 
      p$source_superClass, 
      p$target_superClass
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
    public Set<TraceLink> getAllValuesOf$source_superClass(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$source_superClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $source_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$source_superClass(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$target_superClass) {
      return rawAccumulateAllValuesOf$source_superClass(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      p$reference, 
      null, 
      p$target_superClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$target_superClass(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$TARGET_SUPERCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$target_superClass() {
      return rawAccumulateAllValuesOf$target_superClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$target_superClass(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$target_superClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $target_superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$target_superClass(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass) {
      return rawAccumulateAllValuesOf$target_superClass(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      p$reference, 
      p$source_superClass, 
      null
      });
    }
    
    @Override
    protected ExtractSuperclassPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractSuperclassPostcondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (TraceLink) t.get(POSITION_$CLASS), (TraceLink) t.get(POSITION_$ATTRIBUTE), (TraceLink) t.get(POSITION_$REFERENCE), (TraceLink) t.get(POSITION_$SOURCE_SUPERCLASS), (TraceLink) t.get(POSITION_$TARGET_SUPERCLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractSuperclassPostcondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (TraceLink) match[POSITION_$REFERENCE], (TraceLink) match[POSITION_$SOURCE_SUPERCLASS], (TraceLink) match[POSITION_$TARGET_SUPERCLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractSuperclassPostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (TraceLink) match[POSITION_$REFERENCE], (TraceLink) match[POSITION_$SOURCE_SUPERCLASS], (TraceLink) match[POSITION_$TARGET_SUPERCLASS]);
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
    public static IQuerySpecification<ExtractSuperclassPostcondition.Matcher> querySpecification() {
      return ExtractSuperclassPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ExtractSuperclassPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * @param p$reference the value of pattern parameter $reference in the currently processed match
     * @param p$source_superClass the value of pattern parameter $source_superClass in the currently processed match
     * @param p$target_superClass the value of pattern parameter $target_superClass in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final TraceLink p$reference, final TraceLink p$source_superClass, final TraceLink p$target_superClass);
    
    @Override
    public void process(final ExtractSuperclassPostcondition.Match match) {
      process(match.get$package(), match.get$class(), match.get$attribute(), match.get$reference(), match.get$source_superClass(), match.get$target_superClass());
    }
  }
  
  private ExtractSuperclassPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ExtractSuperclassPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExtractSuperclassPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ExtractSuperclassPostcondition.Matcher.on(engine);
  }
  
  @Override
  public ExtractSuperclassPostcondition.Matcher instantiate() {
    return ExtractSuperclassPostcondition.Matcher.create();
  }
  
  @Override
  public ExtractSuperclassPostcondition.Match newEmptyMatch() {
    return ExtractSuperclassPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public ExtractSuperclassPostcondition.Match newMatch(final Object... parameters) {
    return ExtractSuperclassPostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (se.mdh.idt.benji.trace.TraceLink) parameters[3], (se.mdh.idt.benji.trace.TraceLink) parameters[4], (se.mdh.idt.benji.trace.TraceLink) parameters[5]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition (visibility: PUBLIC, simpleName: ExtractSuperclassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition (visibility: PUBLIC, simpleName: ExtractSuperclassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ExtractSuperclassPostcondition INSTANCE = new ExtractSuperclassPostcondition();
    
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
    private final static ExtractSuperclassPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$reference = new PParameter("$reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$source_superClass = new PParameter("$source_superClass", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$target_superClass = new PParameter("$target_superClass", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$class, parameter_p$attribute, parameter_p$reference, parameter_p$source_superClass, parameter_p$target_superClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$class","$attribute","$reference","$source_superClass","$target_superClass");
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
          PVariable var_$target_superClass = body.getOrCreateVariableByName("$target_superClass");
          PVariable var_$class_name = body.getOrCreateVariableByName("$class_name");
          PVariable var_$superClass_name = body.getOrCreateVariableByName("$superClass_name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$source_superClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$target_superClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$attribute, parameter_p$attribute),
             new ExportedParameter(body, var_$reference, parameter_p$reference),
             new ExportedParameter(body, var_$source_superClass, parameter_p$source_superClass),
             new ExportedParameter(body, var_$target_superClass, parameter_p$target_superClass)
          ));
          // 	find create_package_class ($package, $target_superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$target_superClass), Create_package_class.instance().getInternalQueryRepresentation());
          // 	find get_class_name ($class, $class_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$class_name), Get_class_name.instance().getInternalQueryRepresentation());
          // 	$superClass_name == eval ("super_" + $class_name)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern ExtractSuperclassPostcondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("$class_name");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String $class_name = (String) provider.getValue("$class_name");
                  return evaluateExpression_1_1($class_name);
              }
          },  var__virtual_0_ ); 
          new Equality(body, var_$superClass_name, var__virtual_0_);
          // 	find set_class_name ($target_superClass, $superClass_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$target_superClass, var_$superClass_name), Set_class_name.instance().getInternalQueryRepresentation());
          // 	find move_class_reference ($class, $reference, $target_superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$reference, var_$target_superClass), Move_class_reference.instance().getInternalQueryRepresentation());
          // 	find move_class_attribute ($class, $attribute, $target_superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$attribute, var_$target_superClass), Move_class_attribute.instance().getInternalQueryRepresentation());
          // 	find set_class_superClass ($class, $target_superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$target_superClass), Set_class_superClass.instance().getInternalQueryRepresentation());
          // 	find set_class_superClass ($target_superClass, $source_superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$target_superClass, var_$source_superClass), Set_class_superClass.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final String $class_name) {
    return ("super_" + $class_name);
  }
}
