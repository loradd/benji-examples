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
import se.mdh.idt.benji.examples.refactorings.internal.Generate_attribute_class_name;
import se.mdh.idt.benji.examples.refactorings.internal.Generate_attribute_reference_name;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_package_class;
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
    private Trace fPackage;
    
    private Trace fClass;
    
    private Trace fAttribute;
    
    private String fAttribute_class_name;
    
    private String fAttribute_reference_name;
    
    private static List<String> parameterNames = makeImmutableList("package", "class", "attribute", "attribute_class_name", "attribute_reference_name");
    
    private Match(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      this.fPackage = pPackage;
      this.fClass = pClass;
      this.fAttribute = pAttribute;
      this.fAttribute_class_name = pAttribute_class_name;
      this.fAttribute_reference_name = pAttribute_reference_name;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("class".equals(parameterName)) return this.fClass;
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("attribute_class_name".equals(parameterName)) return this.fAttribute_class_name;
      if ("attribute_reference_name".equals(parameterName)) return this.fAttribute_reference_name;
      return null;
    }
    
    public Trace getPackage() {
      return this.fPackage;
    }
    
    public Trace getValueOfClass() {
      return this.fClass;
    }
    
    public Trace getAttribute() {
      return this.fAttribute;
    }
    
    public String getAttribute_class_name() {
      return this.fAttribute_class_name;
    }
    
    public String getAttribute_reference_name() {
      return this.fAttribute_reference_name;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (Trace) newValue;
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
      if ("attribute_class_name".equals(parameterName) ) {
          this.fAttribute_class_name = (String) newValue;
          return true;
      }
      if ("attribute_reference_name".equals(parameterName) ) {
          this.fAttribute_reference_name = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final Trace pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setClass(final Trace pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
    }
    
    public void setAttribute(final Trace pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setAttribute_class_name(final String pAttribute_class_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute_class_name = pAttribute_class_name;
    }
    
    public void setAttribute_reference_name(final String pAttribute_reference_name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute_reference_name = pAttribute_reference_name;
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
      return new Object[]{fPackage, fClass, fAttribute, fAttribute_class_name, fAttribute_reference_name};
    }
    
    @Override
    public ExtractClassPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fClass, fAttribute, fAttribute_class_name, fAttribute_reference_name) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"class\"=" + prettyPrintValue(fClass) + ", ");
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"attribute_class_name\"=" + prettyPrintValue(fAttribute_class_name) + ", ");
      result.append("\"attribute_reference_name\"=" + prettyPrintValue(fAttribute_reference_name));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fClass, fAttribute, fAttribute_class_name, fAttribute_reference_name);
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
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fClass, other.fClass) && Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fAttribute_class_name, other.fAttribute_class_name) && Objects.equals(fAttribute_reference_name, other.fAttribute_reference_name);
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractClassPrecondition.Match newMutableMatch(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return new Mutable(pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractClassPrecondition.Match newMatch(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return new Immutable(pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name);
    }
    
    private static final class Mutable extends ExtractClassPrecondition.Match {
      Mutable(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
        super(pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractClassPrecondition.Match {
      Immutable(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
        super(pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name);
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
   * pattern ExtractClassPrecondition (^package : Trace, class : Trace, attribute : Trace, 
   * 	attribute_class_name : java String, attribute_reference_name : java String
   * ) {
   * 	find preserved_package_class (^package, class);
   * 	find preserved_class_attribute (class, attribute);
   * 	find generate_attribute_class_name (attribute, attribute_class_name);
   * 	find generate_attribute_reference_name (attribute, attribute_reference_name);
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
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_CLASS = 1;
    
    private final static int POSITION_ATTRIBUTE = 2;
    
    private final static int POSITION_ATTRIBUTE_CLASS_NAME = 3;
    
    private final static int POSITION_ATTRIBUTE_REFERENCE_NAME = 4;
    
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractClassPrecondition.Match> getAllMatches(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return rawGetAllMatches(new Object[]{pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ExtractClassPrecondition.Match getOneArbitraryMatch(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return rawHasMatch(new Object[]{pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return rawCountMatches(new Object[]{pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name, final IMatchProcessor<? super ExtractClassPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name, final IMatchProcessor<? super ExtractClassPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pAttribute_class_name the fixed value of pattern parameter attribute_class_name, or null if not bound.
     * @param pAttribute_reference_name the fixed value of pattern parameter attribute_reference_name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractClassPrecondition.Match newMatch(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return ExtractClassPrecondition.Match.newMatch(pPackage, pClass, pAttribute, pAttribute_class_name, pAttribute_reference_name);
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfpackage(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage() {
      return rawAccumulateAllValuesOfpackage(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage(final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pClass, 
      pAttribute, 
      pAttribute_class_name, 
      pAttribute_reference_name
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
    public Set<Trace> getAllValuesOfclass(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass(final Trace pPackage, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      pPackage, 
      null, 
      pAttribute, 
      pAttribute_class_name, 
      pAttribute_reference_name
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
    public Set<Trace> getAllValuesOfattribute(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute(final Trace pPackage, final Trace pClass, final String pAttribute_class_name, final String pAttribute_reference_name) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      pPackage, 
      pClass, 
      null, 
      pAttribute_class_name, 
      pAttribute_reference_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfattribute_class_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_ATTRIBUTE_CLASS_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfattribute_class_name() {
      return rawAccumulateAllValuesOfattribute_class_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfattribute_class_name(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute_class_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_class_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfattribute_class_name(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_reference_name) {
      return rawAccumulateAllValuesOfattribute_class_name(new Object[]{
      pPackage, 
      pClass, 
      pAttribute, 
      null, 
      pAttribute_reference_name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfattribute_reference_name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_ATTRIBUTE_REFERENCE_NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfattribute_reference_name() {
      return rawAccumulateAllValuesOfattribute_reference_name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfattribute_reference_name(final ExtractClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute_reference_name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute_reference_name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfattribute_reference_name(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name) {
      return rawAccumulateAllValuesOfattribute_reference_name(new Object[]{
      pPackage, 
      pClass, 
      pAttribute, 
      pAttribute_class_name, 
      null
      });
    }
    
    @Override
    protected ExtractClassPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractClassPrecondition.Match.newMatch((Trace) t.get(POSITION_PACKAGE), (Trace) t.get(POSITION_CLASS), (Trace) t.get(POSITION_ATTRIBUTE), (String) t.get(POSITION_ATTRIBUTE_CLASS_NAME), (String) t.get(POSITION_ATTRIBUTE_REFERENCE_NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractClassPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractClassPrecondition.Match.newMatch((Trace) match[POSITION_PACKAGE], (Trace) match[POSITION_CLASS], (Trace) match[POSITION_ATTRIBUTE], (String) match[POSITION_ATTRIBUTE_CLASS_NAME], (String) match[POSITION_ATTRIBUTE_REFERENCE_NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractClassPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractClassPrecondition.Match.newMutableMatch((Trace) match[POSITION_PACKAGE], (Trace) match[POSITION_CLASS], (Trace) match[POSITION_ATTRIBUTE], (String) match[POSITION_ATTRIBUTE_CLASS_NAME], (String) match[POSITION_ATTRIBUTE_REFERENCE_NAME]);
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
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pClass the value of pattern parameter class in the currently processed match
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pAttribute_class_name the value of pattern parameter attribute_class_name in the currently processed match
     * @param pAttribute_reference_name the value of pattern parameter attribute_reference_name in the currently processed match
     * 
     */
    public abstract void process(final Trace pPackage, final Trace pClass, final Trace pAttribute, final String pAttribute_class_name, final String pAttribute_reference_name);
    
    @Override
    public void process(final ExtractClassPrecondition.Match match) {
      process(match.getPackage(), match.getValueOfClass(), match.getAttribute(), match.getAttribute_class_name(), match.getAttribute_reference_name());
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
    return ExtractClassPrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (java.lang.String) parameters[3], (java.lang.String) parameters[4]);
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
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute_class_name = new PParameter("attribute_class_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute_reference_name = new PParameter("attribute_reference_name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pClass, parameter_pAttribute, parameter_pAttribute_class_name, parameter_pAttribute_reference_name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractClassPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","class","attribute","attribute_class_name","attribute_reference_name");
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
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          PVariable var_attribute_class_name = body.getOrCreateVariableByName("attribute_class_name");
          PVariable var_attribute_reference_name = body.getOrCreateVariableByName("attribute_reference_name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_attribute_class_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_attribute_reference_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_class, parameter_pClass),
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_attribute_class_name, parameter_pAttribute_class_name),
             new ExportedParameter(body, var_attribute_reference_name, parameter_pAttribute_reference_name)
          ));
          // 	find preserved_package_class (^package, class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_class), Preserved_package_class.instance().getInternalQueryRepresentation());
          // 	find preserved_class_attribute (class, attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_attribute), Preserved_class_attribute.instance().getInternalQueryRepresentation());
          // 	find generate_attribute_class_name (attribute, attribute_class_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_attribute_class_name), Generate_attribute_class_name.instance().getInternalQueryRepresentation());
          // 	find generate_attribute_reference_name (attribute, attribute_reference_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_attribute, var_attribute_reference_name), Generate_attribute_reference_name.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
