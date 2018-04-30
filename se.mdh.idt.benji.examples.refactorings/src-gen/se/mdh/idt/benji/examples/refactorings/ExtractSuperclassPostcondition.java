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
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Created_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Inserted_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Inserted_class_superClass;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Removed_class_attribute;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Removed_class_superClass;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Set_class_name;
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
    private Trace fPackage;
    
    private Trace fSuperClass;
    
    private Trace fSubClass;
    
    private Trace fAttribute;
    
    private String fName;
    
    private Trace fClass;
    
    private static List<String> parameterNames = makeImmutableList("package", "superClass", "subClass", "attribute", "name", "class");
    
    private Match(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      this.fPackage = pPackage;
      this.fSuperClass = pSuperClass;
      this.fSubClass = pSubClass;
      this.fAttribute = pAttribute;
      this.fName = pName;
      this.fClass = pClass;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("superClass".equals(parameterName)) return this.fSuperClass;
      if ("subClass".equals(parameterName)) return this.fSubClass;
      if ("attribute".equals(parameterName)) return this.fAttribute;
      if ("name".equals(parameterName)) return this.fName;
      if ("class".equals(parameterName)) return this.fClass;
      return null;
    }
    
    public Trace getPackage() {
      return this.fPackage;
    }
    
    public Trace getSuperClass() {
      return this.fSuperClass;
    }
    
    public Trace getSubClass() {
      return this.fSubClass;
    }
    
    public Trace getAttribute() {
      return this.fAttribute;
    }
    
    public String getName() {
      return this.fName;
    }
    
    public Trace getValueOfClass() {
      return this.fClass;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (Trace) newValue;
          return true;
      }
      if ("superClass".equals(parameterName) ) {
          this.fSuperClass = (Trace) newValue;
          return true;
      }
      if ("subClass".equals(parameterName) ) {
          this.fSubClass = (Trace) newValue;
          return true;
      }
      if ("attribute".equals(parameterName) ) {
          this.fAttribute = (Trace) newValue;
          return true;
      }
      if ("name".equals(parameterName) ) {
          this.fName = (String) newValue;
          return true;
      }
      if ("class".equals(parameterName) ) {
          this.fClass = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final Trace pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setSuperClass(final Trace pSuperClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSuperClass = pSuperClass;
    }
    
    public void setSubClass(final Trace pSubClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fSubClass = pSubClass;
    }
    
    public void setAttribute(final Trace pAttribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fAttribute = pAttribute;
    }
    
    public void setName(final String pName) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fName = pName;
    }
    
    public void setClass(final Trace pClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fClass = pClass;
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
      return new Object[]{fPackage, fSuperClass, fSubClass, fAttribute, fName, fClass};
    }
    
    @Override
    public ExtractSuperclassPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fSuperClass, fSubClass, fAttribute, fName, fClass) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"superClass\"=" + prettyPrintValue(fSuperClass) + ", ");
      result.append("\"subClass\"=" + prettyPrintValue(fSubClass) + ", ");
      result.append("\"attribute\"=" + prettyPrintValue(fAttribute) + ", ");
      result.append("\"name\"=" + prettyPrintValue(fName) + ", ");
      result.append("\"class\"=" + prettyPrintValue(fClass));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fSuperClass, fSubClass, fAttribute, fName, fClass);
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
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fSuperClass, other.fSuperClass) && Objects.equals(fSubClass, other.fSubClass) && Objects.equals(fAttribute, other.fAttribute) && Objects.equals(fName, other.fName) && Objects.equals(fClass, other.fClass);
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractSuperclassPostcondition.Match newMutableMatch(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return new Mutable(pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractSuperclassPostcondition.Match newMatch(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return new Immutable(pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass);
    }
    
    private static final class Mutable extends ExtractSuperclassPostcondition.Match {
      Mutable(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
        super(pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractSuperclassPostcondition.Match {
      Immutable(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
        super(pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass);
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
   * pattern ExtractSuperclassPostcondition (^package : Trace, superClass : Trace, subClass : Trace, attribute : Trace, name : java String, class : Trace) {
   * 	find created_package_class (^package, class);
   * 	find set_class_name (class, name);
   * 	find removed_class_attribute (subClass, attribute);	
   * 	find inserted_class_attribute (class, attribute);
   * 	find removed_class_superClass (subClass, superClass);
   * 	find inserted_class_superClass (subClass, class);
   * 	find inserted_class_superClass (class, superClass);
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
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_SUPERCLASS = 1;
    
    private final static int POSITION_SUBCLASS = 2;
    
    private final static int POSITION_ATTRIBUTE = 3;
    
    private final static int POSITION_NAME = 4;
    
    private final static int POSITION_CLASS = 5;
    
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractSuperclassPostcondition.Match> getAllMatches(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return rawGetAllMatches(new Object[]{pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ExtractSuperclassPostcondition.Match getOneArbitraryMatch(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return rawHasMatch(new Object[]{pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return rawCountMatches(new Object[]{pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass, final IMatchProcessor<? super ExtractSuperclassPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass, final IMatchProcessor<? super ExtractSuperclassPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pSuperClass the fixed value of pattern parameter superClass, or null if not bound.
     * @param pSubClass the fixed value of pattern parameter subClass, or null if not bound.
     * @param pAttribute the fixed value of pattern parameter attribute, or null if not bound.
     * @param pName the fixed value of pattern parameter name, or null if not bound.
     * @param pClass the fixed value of pattern parameter class, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractSuperclassPostcondition.Match newMatch(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return ExtractSuperclassPostcondition.Match.newMatch(pPackage, pSuperClass, pSubClass, pAttribute, pName, pClass);
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
    public Set<Trace> getAllValuesOfpackage(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage(final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pSuperClass, 
      pSubClass, 
      pAttribute, 
      pName, 
      pClass
      });
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
    public Set<Trace> getAllValuesOfsuperClass(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfsuperClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for superClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsuperClass(final Trace pPackage, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return rawAccumulateAllValuesOfsuperClass(new Object[]{
      pPackage, 
      null, 
      pSubClass, 
      pAttribute, 
      pName, 
      pClass
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfsubClass(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_SUBCLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsubClass() {
      return rawAccumulateAllValuesOfsubClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsubClass(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfsubClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for subClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfsubClass(final Trace pPackage, final Trace pSuperClass, final Trace pAttribute, final String pName, final Trace pClass) {
      return rawAccumulateAllValuesOfsubClass(new Object[]{
      pPackage, 
      pSuperClass, 
      null, 
      pAttribute, 
      pName, 
      pClass
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
    public Set<Trace> getAllValuesOfattribute(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfattribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfattribute(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final String pName, final Trace pClass) {
      return rawAccumulateAllValuesOfattribute(new Object[]{
      pPackage, 
      pSuperClass, 
      pSubClass, 
      null, 
      pName, 
      pClass
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
    public Set<String> getAllValuesOfname(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfname(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfname(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final Trace pClass) {
      return rawAccumulateAllValuesOfname(new Object[]{
      pPackage, 
      pSuperClass, 
      pSubClass, 
      pAttribute, 
      null, 
      pClass
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
    public Set<Trace> getAllValuesOfclass(final ExtractSuperclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfclass(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName) {
      return rawAccumulateAllValuesOfclass(new Object[]{
      pPackage, 
      pSuperClass, 
      pSubClass, 
      pAttribute, 
      pName, 
      null
      });
    }
    
    @Override
    protected ExtractSuperclassPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractSuperclassPostcondition.Match.newMatch((Trace) t.get(POSITION_PACKAGE), (Trace) t.get(POSITION_SUPERCLASS), (Trace) t.get(POSITION_SUBCLASS), (Trace) t.get(POSITION_ATTRIBUTE), (String) t.get(POSITION_NAME), (Trace) t.get(POSITION_CLASS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractSuperclassPostcondition.Match.newMatch((Trace) match[POSITION_PACKAGE], (Trace) match[POSITION_SUPERCLASS], (Trace) match[POSITION_SUBCLASS], (Trace) match[POSITION_ATTRIBUTE], (String) match[POSITION_NAME], (Trace) match[POSITION_CLASS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractSuperclassPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractSuperclassPostcondition.Match.newMutableMatch((Trace) match[POSITION_PACKAGE], (Trace) match[POSITION_SUPERCLASS], (Trace) match[POSITION_SUBCLASS], (Trace) match[POSITION_ATTRIBUTE], (String) match[POSITION_NAME], (Trace) match[POSITION_CLASS]);
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
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pSuperClass the value of pattern parameter superClass in the currently processed match
     * @param pSubClass the value of pattern parameter subClass in the currently processed match
     * @param pAttribute the value of pattern parameter attribute in the currently processed match
     * @param pName the value of pattern parameter name in the currently processed match
     * @param pClass the value of pattern parameter class in the currently processed match
     * 
     */
    public abstract void process(final Trace pPackage, final Trace pSuperClass, final Trace pSubClass, final Trace pAttribute, final String pName, final Trace pClass);
    
    @Override
    public void process(final ExtractSuperclassPostcondition.Match match) {
      process(match.getPackage(), match.getSuperClass(), match.getSubClass(), match.getAttribute(), match.getName(), match.getValueOfClass());
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
    return ExtractSuperclassPostcondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1], (se.mdh.idt.benji.trace.Trace) parameters[2], (se.mdh.idt.benji.trace.Trace) parameters[3], (java.lang.String) parameters[4], (se.mdh.idt.benji.trace.Trace) parameters[5]);
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
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSuperClass = new PParameter("superClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pSubClass = new PParameter("subClass", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pAttribute = new PParameter("attribute", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pName = new PParameter("name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final PParameter parameter_pClass = new PParameter("class", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pSuperClass, parameter_pSubClass, parameter_pAttribute, parameter_pName, parameter_pClass);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ExtractSuperclassPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","superClass","subClass","attribute","name","class");
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
          PVariable var_superClass = body.getOrCreateVariableByName("superClass");
          PVariable var_subClass = body.getOrCreateVariableByName("subClass");
          PVariable var_attribute = body.getOrCreateVariableByName("attribute");
          PVariable var_name = body.getOrCreateVariableByName("name");
          PVariable var_class = body.getOrCreateVariableByName("class");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_superClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_subClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_name), new JavaTransitiveInstancesKey(java.lang.String.class));
          new TypeConstraint(body, Tuples.flatTupleOf(var_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_superClass, parameter_pSuperClass),
             new ExportedParameter(body, var_subClass, parameter_pSubClass),
             new ExportedParameter(body, var_attribute, parameter_pAttribute),
             new ExportedParameter(body, var_name, parameter_pName),
             new ExportedParameter(body, var_class, parameter_pClass)
          ));
          // 	find created_package_class (^package, class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_class), Created_package_class.instance().getInternalQueryRepresentation());
          // 	find set_class_name (class, name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_name), Set_class_name.instance().getInternalQueryRepresentation());
          // 	find removed_class_attribute (subClass, attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_subClass, var_attribute), Removed_class_attribute.instance().getInternalQueryRepresentation());
          // 		find inserted_class_attribute (class, attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_attribute), Inserted_class_attribute.instance().getInternalQueryRepresentation());
          // 	find removed_class_superClass (subClass, superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_subClass, var_superClass), Removed_class_superClass.instance().getInternalQueryRepresentation());
          // 	find inserted_class_superClass (subClass, class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_subClass, var_class), Inserted_class_superClass.instance().getInternalQueryRepresentation());
          // 	find inserted_class_superClass (class, superClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_superClass), Inserted_class_superClass.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
