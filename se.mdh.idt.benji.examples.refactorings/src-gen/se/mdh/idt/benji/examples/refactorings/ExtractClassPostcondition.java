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
import se.mdh.idt.benji.examples.refactorings.internal.Create_class_reference;
import se.mdh.idt.benji.examples.refactorings.internal.Create_package_class;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_class_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_name;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Set_reference_type;
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
public final class ExtractClassPostcondition extends BaseGeneratedEMFQuerySpecification<ExtractClassPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition pattern,
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
    
    private TraceLink f$attribute_class;
    
    private TraceLink f$attribute_reference;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$class", "$attribute", "$attribute_class_name", "$attribute_reference_name", "$attribute_class", "$attribute_reference");
    
    private Match(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      this.f$package = p$package;
      this.f$class = p$class;
      this.f$attribute = p$attribute;
      this.f$attribute_class_name = p$attribute_class_name;
      this.f$attribute_reference_name = p$attribute_reference_name;
      this.f$attribute_class = p$attribute_class;
      this.f$attribute_reference = p$attribute_reference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$attribute".equals(parameterName)) return this.f$attribute;
      if ("$attribute_class_name".equals(parameterName)) return this.f$attribute_class_name;
      if ("$attribute_reference_name".equals(parameterName)) return this.f$attribute_reference_name;
      if ("$attribute_class".equals(parameterName)) return this.f$attribute_class;
      if ("$attribute_reference".equals(parameterName)) return this.f$attribute_reference;
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
    
    public TraceLink get$attribute_class() {
      return this.f$attribute_class;
    }
    
    public TraceLink get$attribute_reference() {
      return this.f$attribute_reference;
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
      if ("$attribute_class".equals(parameterName) ) {
          this.f$attribute_class = (TraceLink) newValue;
          return true;
      }
      if ("$attribute_reference".equals(parameterName) ) {
          this.f$attribute_reference = (TraceLink) newValue;
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
    
    public void set$attribute_class(final TraceLink p$attribute_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute_class = p$attribute_class;
    }
    
    public void set$attribute_reference(final TraceLink p$attribute_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$attribute_reference = p$attribute_reference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExtractClassPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$class, f$attribute, f$attribute_class_name, f$attribute_reference_name, f$attribute_class, f$attribute_reference};
    }
    
    @Override
    public ExtractClassPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$class, f$attribute, f$attribute_class_name, f$attribute_reference_name, f$attribute_class, f$attribute_reference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$attribute\"=" + prettyPrintValue(f$attribute) + ", ");
      result.append("\"$attribute_class_name\"=" + prettyPrintValue(f$attribute_class_name) + ", ");
      result.append("\"$attribute_reference_name\"=" + prettyPrintValue(f$attribute_reference_name) + ", ");
      result.append("\"$attribute_class\"=" + prettyPrintValue(f$attribute_class) + ", ");
      result.append("\"$attribute_reference\"=" + prettyPrintValue(f$attribute_reference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$class, f$attribute, f$attribute_class_name, f$attribute_reference_name, f$attribute_class, f$attribute_reference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ExtractClassPostcondition.Match)) {
          ExtractClassPostcondition.Match other = (ExtractClassPostcondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$class, other.f$class) && Objects.equals(f$attribute, other.f$attribute) && Objects.equals(f$attribute_class_name, other.f$attribute_class_name) && Objects.equals(f$attribute_reference_name, other.f$attribute_reference_name) && Objects.equals(f$attribute_class, other.f$attribute_class) && Objects.equals(f$attribute_reference, other.f$attribute_reference);
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
    public ExtractClassPostcondition specification() {
      return ExtractClassPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ExtractClassPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null, null);
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
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractClassPostcondition.Match newMutableMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return new Mutable(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference);
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
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractClassPostcondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return new Immutable(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference);
    }
    
    private static final class Mutable extends ExtractClassPostcondition.Match {
      Mutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
        super(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractClassPostcondition.Match {
      Immutable(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
        super(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CCAC8 - Extract Class - Postcondition
   * pattern ExtractClassPostcondition ($package : TraceLink, $class : TraceLink, $attribute : TraceLink, $attribute_class_name : java String, $attribute_reference_name : java String, $attribute_class : TraceLink, $attribute_reference : TraceLink) {
   * 	find create_package_class ($package, $attribute_class);
   * 	find set_class_name ($attribute_class, $attribute_class_name); 
   * 	find create_class_reference ($class, $attribute_reference);
   * 	find set_reference_name ($attribute_reference, $attribute_reference_name);
   * 	find set_reference_type ($attribute_reference, $attribute_class);
   * 	find delete_class_attribute ($class, $attribute); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ExtractClassPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<ExtractClassPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ExtractClassPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ExtractClassPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$CLASS = 1;
    
    private final static int POSITION_$ATTRIBUTE = 2;
    
    private final static int POSITION_$ATTRIBUTE_CLASS_NAME = 3;
    
    private final static int POSITION_$ATTRIBUTE_REFERENCE_NAME = 4;
    
    private final static int POSITION_$ATTRIBUTE_CLASS = 5;
    
    private final static int POSITION_$ATTRIBUTE_REFERENCE = 6;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExtractClassPostcondition.Matcher.class);
    
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
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractClassPostcondition.Match> getAllMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawGetAllMatches(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ExtractClassPostcondition.Match getOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawHasMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawCountMatches(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference, final IMatchProcessor<? super ExtractClassPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$attribute the fixed value of pattern parameter $attribute, or null if not bound.
     * @param p$attribute_class_name the fixed value of pattern parameter $attribute_class_name, or null if not bound.
     * @param p$attribute_reference_name the fixed value of pattern parameter $attribute_reference_name, or null if not bound.
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference, final IMatchProcessor<? super ExtractClassPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference}, processor);
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
     * @param p$attribute_class the fixed value of pattern parameter $attribute_class, or null if not bound.
     * @param p$attribute_reference the fixed value of pattern parameter $attribute_reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractClassPostcondition.Match newMatch(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return ExtractClassPostcondition.Match.newMatch(p$package, p$class, p$attribute, p$attribute_class_name, p$attribute_reference_name, p$attribute_class, p$attribute_reference);
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
    public Set<TraceLink> getAllValuesOf$package(final ExtractClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$class, 
      p$attribute, 
      p$attribute_class_name, 
      p$attribute_reference_name, 
      p$attribute_class, 
      p$attribute_reference
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
    public Set<TraceLink> getAllValuesOf$class(final ExtractClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final TraceLink p$package, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      p$package, 
      null, 
      p$attribute, 
      p$attribute_class_name, 
      p$attribute_reference_name, 
      p$attribute_class, 
      p$attribute_reference
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
    public Set<TraceLink> getAllValuesOf$attribute(final ExtractClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute(final TraceLink p$package, final TraceLink p$class, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawAccumulateAllValuesOf$attribute(new Object[]{
      p$package, 
      p$class, 
      null, 
      p$attribute_class_name, 
      p$attribute_reference_name, 
      p$attribute_class, 
      p$attribute_reference
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
    public Set<String> getAllValuesOf$attribute_class_name(final ExtractClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute_class_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_class_name(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawAccumulateAllValuesOf$attribute_class_name(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      null, 
      p$attribute_reference_name, 
      p$attribute_class, 
      p$attribute_reference
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
    public Set<String> getAllValuesOf$attribute_reference_name(final ExtractClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute_reference_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$attribute_reference_name(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference) {
      return rawAccumulateAllValuesOf$attribute_reference_name(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      p$attribute_class_name, 
      null, 
      p$attribute_class, 
      p$attribute_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$attribute_class(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$ATTRIBUTE_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute_class() {
      return rawAccumulateAllValuesOf$attribute_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute_class(final ExtractClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute_class(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_reference) {
      return rawAccumulateAllValuesOf$attribute_class(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      p$attribute_class_name, 
      p$attribute_reference_name, 
      null, 
      p$attribute_reference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<TraceLink> rawAccumulateAllValuesOf$attribute_reference(final Object[] parameters) {
      Set<TraceLink> results = new HashSet<TraceLink>();
      rawAccumulateAllValues(POSITION_$ATTRIBUTE_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute_reference() {
      return rawAccumulateAllValuesOf$attribute_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute_reference(final ExtractClassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$attribute_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $attribute_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$attribute_reference(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class) {
      return rawAccumulateAllValuesOf$attribute_reference(new Object[]{
      p$package, 
      p$class, 
      p$attribute, 
      p$attribute_class_name, 
      p$attribute_reference_name, 
      p$attribute_class, 
      null
      });
    }
    
    @Override
    protected ExtractClassPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractClassPostcondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (TraceLink) t.get(POSITION_$CLASS), (TraceLink) t.get(POSITION_$ATTRIBUTE), (String) t.get(POSITION_$ATTRIBUTE_CLASS_NAME), (String) t.get(POSITION_$ATTRIBUTE_REFERENCE_NAME), (TraceLink) t.get(POSITION_$ATTRIBUTE_CLASS), (TraceLink) t.get(POSITION_$ATTRIBUTE_REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractClassPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractClassPostcondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (String) match[POSITION_$ATTRIBUTE_CLASS_NAME], (String) match[POSITION_$ATTRIBUTE_REFERENCE_NAME], (TraceLink) match[POSITION_$ATTRIBUTE_CLASS], (TraceLink) match[POSITION_$ATTRIBUTE_REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractClassPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractClassPostcondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (TraceLink) match[POSITION_$CLASS], (TraceLink) match[POSITION_$ATTRIBUTE], (String) match[POSITION_$ATTRIBUTE_CLASS_NAME], (String) match[POSITION_$ATTRIBUTE_REFERENCE_NAME], (TraceLink) match[POSITION_$ATTRIBUTE_CLASS], (TraceLink) match[POSITION_$ATTRIBUTE_REFERENCE]);
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
    public static IQuerySpecification<ExtractClassPostcondition.Matcher> querySpecification() {
      return ExtractClassPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ExtractClassPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$attribute the value of pattern parameter $attribute in the currently processed match
     * @param p$attribute_class_name the value of pattern parameter $attribute_class_name in the currently processed match
     * @param p$attribute_reference_name the value of pattern parameter $attribute_reference_name in the currently processed match
     * @param p$attribute_class the value of pattern parameter $attribute_class in the currently processed match
     * @param p$attribute_reference the value of pattern parameter $attribute_reference in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final TraceLink p$class, final TraceLink p$attribute, final String p$attribute_class_name, final String p$attribute_reference_name, final TraceLink p$attribute_class, final TraceLink p$attribute_reference);
    
    @Override
    public void process(final ExtractClassPostcondition.Match match) {
      process(match.get$package(), match.get$class(), match.get$attribute(), match.get$attribute_class_name(), match.get$attribute_reference_name(), match.get$attribute_class(), match.get$attribute_reference());
    }
  }
  
  private ExtractClassPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ExtractClassPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExtractClassPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ExtractClassPostcondition.Matcher.on(engine);
  }
  
  @Override
  public ExtractClassPostcondition.Matcher instantiate() {
    return ExtractClassPostcondition.Matcher.create();
  }
  
  @Override
  public ExtractClassPostcondition.Match newEmptyMatch() {
    return ExtractClassPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public ExtractClassPostcondition.Match newMatch(final Object... parameters) {
    return ExtractClassPostcondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (se.mdh.idt.benji.trace.TraceLink) parameters[1], (se.mdh.idt.benji.trace.TraceLink) parameters[2], (java.lang.String) parameters[3], (java.lang.String) parameters[4], (se.mdh.idt.benji.trace.TraceLink) parameters[5], (se.mdh.idt.benji.trace.TraceLink) parameters[6]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition (visibility: PUBLIC, simpleName: ExtractClassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition (visibility: PUBLIC, simpleName: ExtractClassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ExtractClassPostcondition INSTANCE = new ExtractClassPostcondition();
    
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
    private final static ExtractClassPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute = new PParameter("$attribute", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute_class_name = new PParameter("$attribute_class_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute_reference_name = new PParameter("$attribute_reference_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute_class = new PParameter("$attribute_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$attribute_reference = new PParameter("$attribute_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$class, parameter_p$attribute, parameter_p$attribute_class_name, parameter_p$attribute_reference_name, parameter_p$attribute_class, parameter_p$attribute_reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractClassPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$class","$attribute","$attribute_class_name","$attribute_reference_name","$attribute_class","$attribute_reference");
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
          PVariable var_$attribute_class = body.getOrCreateVariableByName("$attribute_class");
          PVariable var_$attribute_reference = body.getOrCreateVariableByName("$attribute_reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$attribute_class_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$attribute_reference_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$attribute_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$attribute, parameter_p$attribute),
             new ExportedParameter(body, var_$attribute_class_name, parameter_p$attribute_class_name),
             new ExportedParameter(body, var_$attribute_reference_name, parameter_p$attribute_reference_name),
             new ExportedParameter(body, var_$attribute_class, parameter_p$attribute_class),
             new ExportedParameter(body, var_$attribute_reference, parameter_p$attribute_reference)
          ));
          // 	find create_package_class ($package, $attribute_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$attribute_class), Create_package_class.instance().getInternalQueryRepresentation());
          // 	find set_class_name ($attribute_class, $attribute_class_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$attribute_class, var_$attribute_class_name), Set_class_name.instance().getInternalQueryRepresentation());
          //  	find create_class_reference ($class, $attribute_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$attribute_reference), Create_class_reference.instance().getInternalQueryRepresentation());
          // 	find set_reference_name ($attribute_reference, $attribute_reference_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$attribute_reference, var_$attribute_reference_name), Set_reference_name.instance().getInternalQueryRepresentation());
          // 	find set_reference_type ($attribute_reference, $attribute_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$attribute_reference, var_$attribute_class), Set_reference_type.instance().getInternalQueryRepresentation());
          // 	find delete_class_attribute ($class, $attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$attribute), Delete_class_attribute.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
