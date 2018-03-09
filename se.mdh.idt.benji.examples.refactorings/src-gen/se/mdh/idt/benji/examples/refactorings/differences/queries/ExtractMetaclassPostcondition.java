/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ExtractMetaclass.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries;

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
import se.mdh.idt.benji.examples.refactorings.metamodel.Attribute;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_reference_typed;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_attribute;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:35+0100")
public final class ExtractMetaclassPostcondition extends BaseGeneratedEMFQuerySpecification<ExtractMetaclassPostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition pattern,
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
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fInitial_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Package fCurrent_package;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_metaclass;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_metaclass;
    
    private Attribute fInitial_attribute;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_attributeClass;
    
    private Reference fCurrent_attributeReference;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_metaclass", "current_metaclass", "initial_attribute", "current_attributeClass", "current_attributeReference");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_metaclass = pInitial_metaclass;
      this.fCurrent_metaclass = pCurrent_metaclass;
      this.fInitial_attribute = pInitial_attribute;
      this.fCurrent_attributeClass = pCurrent_attributeClass;
      this.fCurrent_attributeReference = pCurrent_attributeReference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_metaclass".equals(parameterName)) return this.fInitial_metaclass;
      if ("current_metaclass".equals(parameterName)) return this.fCurrent_metaclass;
      if ("initial_attribute".equals(parameterName)) return this.fInitial_attribute;
      if ("current_attributeClass".equals(parameterName)) return this.fCurrent_attributeClass;
      if ("current_attributeReference".equals(parameterName)) return this.fCurrent_attributeReference;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_metaclass() {
      return this.fInitial_metaclass;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_metaclass() {
      return this.fCurrent_metaclass;
    }
    
    public Attribute getInitial_attribute() {
      return this.fInitial_attribute;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_attributeClass() {
      return this.fCurrent_attributeClass;
    }
    
    public Reference getCurrent_attributeReference() {
      return this.fCurrent_attributeReference;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("initial_package".equals(parameterName) ) {
          this.fInitial_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("current_package".equals(parameterName) ) {
          this.fCurrent_package = (se.mdh.idt.benji.examples.refactorings.metamodel.Package) newValue;
          return true;
      }
      if ("initial_metaclass".equals(parameterName) ) {
          this.fInitial_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_metaclass".equals(parameterName) ) {
          this.fCurrent_metaclass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_attribute".equals(parameterName) ) {
          this.fInitial_attribute = (Attribute) newValue;
          return true;
      }
      if ("current_attributeClass".equals(parameterName) ) {
          this.fCurrent_attributeClass = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_attributeReference".equals(parameterName) ) {
          this.fCurrent_attributeReference = (Reference) newValue;
          return true;
      }
      return false;
    }
    
    public void setInitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_package = pInitial_package;
    }
    
    public void setCurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_package = pCurrent_package;
    }
    
    public void setInitial_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_metaclass = pInitial_metaclass;
    }
    
    public void setCurrent_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_metaclass = pCurrent_metaclass;
    }
    
    public void setInitial_attribute(final Attribute pInitial_attribute) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_attribute = pInitial_attribute;
    }
    
    public void setCurrent_attributeClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attributeClass = pCurrent_attributeClass;
    }
    
    public void setCurrent_attributeReference(final Reference pCurrent_attributeReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_attributeReference = pCurrent_attributeReference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ExtractMetaclassPostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_metaclass, fCurrent_metaclass, fInitial_attribute, fCurrent_attributeClass, fCurrent_attributeReference};
    }
    
    @Override
    public ExtractMetaclassPostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_metaclass, fCurrent_metaclass, fInitial_attribute, fCurrent_attributeClass, fCurrent_attributeReference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_metaclass\"=" + prettyPrintValue(fInitial_metaclass) + ", ");
      result.append("\"current_metaclass\"=" + prettyPrintValue(fCurrent_metaclass) + ", ");
      result.append("\"initial_attribute\"=" + prettyPrintValue(fInitial_attribute) + ", ");
      result.append("\"current_attributeClass\"=" + prettyPrintValue(fCurrent_attributeClass) + ", ");
      result.append("\"current_attributeReference\"=" + prettyPrintValue(fCurrent_attributeReference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_metaclass, fCurrent_metaclass, fInitial_attribute, fCurrent_attributeClass, fCurrent_attributeReference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ExtractMetaclassPostcondition.Match)) {
          ExtractMetaclassPostcondition.Match other = (ExtractMetaclassPostcondition.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_metaclass, other.fInitial_metaclass) && Objects.equals(fCurrent_metaclass, other.fCurrent_metaclass) && Objects.equals(fInitial_attribute, other.fInitial_attribute) && Objects.equals(fCurrent_attributeClass, other.fCurrent_attributeClass) && Objects.equals(fCurrent_attributeReference, other.fCurrent_attributeReference);
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
    public ExtractMetaclassPostcondition specification() {
      return ExtractMetaclassPostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ExtractMetaclassPostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ExtractMetaclassPostcondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ExtractMetaclassPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference);
    }
    
    private static final class Mutable extends ExtractMetaclassPostcondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
        super(pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ExtractMetaclassPostcondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
        super(pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // CCAC8 - Extract Metaclass - Postcondition
   * pattern ExtractMetaclassPostcondition (initial_package : Package, current_package : Package, initial_metaclass : Class, current_metaclass : Class, initial_attribute : Attribute, current_attributeClass : Class, current_attributeReference : Reference) {
   * 	find preserved_package_class (initial_package, current_package, initial_metaclass, current_metaclass); 
   * 	find added_package_class (initial_package, current_package, current_attributeClass); 
   * 	find removed_class_attribute (initial_metaclass, current_metaclass, initial_attribute); 
   * 	find added_class_reference_typed (initial_metaclass, current_metaclass, current_attributeReference, current_attributeClass); 
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ExtractMetaclassPostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<ExtractMetaclassPostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ExtractMetaclassPostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ExtractMetaclassPostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_METACLASS = 2;
    
    private final static int POSITION_CURRENT_METACLASS = 3;
    
    private final static int POSITION_INITIAL_ATTRIBUTE = 4;
    
    private final static int POSITION_CURRENT_ATTRIBUTECLASS = 5;
    
    private final static int POSITION_CURRENT_ATTRIBUTEREFERENCE = 6;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ExtractMetaclassPostcondition.Matcher.class);
    
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
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ExtractMetaclassPostcondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ExtractMetaclassPostcondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference, final IMatchProcessor<? super ExtractMetaclassPostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference, final IMatchProcessor<? super ExtractMetaclassPostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_metaclass the fixed value of pattern parameter initial_metaclass, or null if not bound.
     * @param pCurrent_metaclass the fixed value of pattern parameter current_metaclass, or null if not bound.
     * @param pInitial_attribute the fixed value of pattern parameter initial_attribute, or null if not bound.
     * @param pCurrent_attributeClass the fixed value of pattern parameter current_attributeClass, or null if not bound.
     * @param pCurrent_attributeReference the fixed value of pattern parameter current_attributeReference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ExtractMetaclassPostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return ExtractMetaclassPostcondition.Match.newMatch(pInitial_package, pCurrent_package, pInitial_metaclass, pCurrent_metaclass, pInitial_attribute, pCurrent_attributeClass, pCurrent_attributeReference);
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfinitial_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_INITIAL_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package() {
      return rawAccumulateAllValuesOfinitial_package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final ExtractMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_metaclass, 
      pCurrent_metaclass, 
      pInitial_attribute, 
      pCurrent_attributeClass, 
      pCurrent_attributeReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> rawAccumulateAllValuesOfcurrent_package(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Package>();
      rawAccumulateAllValues(POSITION_CURRENT_PACKAGE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package() {
      return rawAccumulateAllValuesOfcurrent_package(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final ExtractMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_metaclass, 
      pCurrent_metaclass, 
      pInitial_attribute, 
      pCurrent_attributeClass, 
      pCurrent_attributeReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_metaclass() {
      return rawAccumulateAllValuesOfinitial_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_metaclass(final ExtractMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawAccumulateAllValuesOfinitial_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pCurrent_metaclass, 
      pInitial_attribute, 
      pCurrent_attributeClass, 
      pCurrent_attributeReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_metaclass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_METACLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass() {
      return rawAccumulateAllValuesOfcurrent_metaclass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass(final ExtractMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_metaclass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_metaclass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_metaclass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawAccumulateAllValuesOfcurrent_metaclass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_metaclass, 
      null, 
      pInitial_attribute, 
      pCurrent_attributeClass, 
      pCurrent_attributeReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Attribute> rawAccumulateAllValuesOfinitial_attribute(final Object[] parameters) {
      Set<Attribute> results = new HashSet<Attribute>();
      rawAccumulateAllValues(POSITION_INITIAL_ATTRIBUTE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute() {
      return rawAccumulateAllValuesOfinitial_attribute(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final ExtractMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_attribute(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_attribute.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Attribute> getAllValuesOfinitial_attribute(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference) {
      return rawAccumulateAllValuesOfinitial_attribute(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_metaclass, 
      pCurrent_metaclass, 
      null, 
      pCurrent_attributeClass, 
      pCurrent_attributeReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_attributeClass(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_ATTRIBUTECLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_attributeClass() {
      return rawAccumulateAllValuesOfcurrent_attributeClass(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_attributeClass(final ExtractMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attributeClass(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeClass.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_attributeClass(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final Reference pCurrent_attributeReference) {
      return rawAccumulateAllValuesOfcurrent_attributeClass(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_metaclass, 
      pCurrent_metaclass, 
      pInitial_attribute, 
      null, 
      pCurrent_attributeReference
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfcurrent_attributeReference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_CURRENT_ATTRIBUTEREFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_attributeReference() {
      return rawAccumulateAllValuesOfcurrent_attributeReference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_attributeReference(final ExtractMetaclassPostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_attributeReference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_attributeReference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_attributeReference(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass) {
      return rawAccumulateAllValuesOfcurrent_attributeReference(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_metaclass, 
      pCurrent_metaclass, 
      pInitial_attribute, 
      pCurrent_attributeClass, 
      null
      });
    }
    
    @Override
    protected ExtractMetaclassPostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ExtractMetaclassPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_METACLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_METACLASS), (Attribute) t.get(POSITION_INITIAL_ATTRIBUTE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_ATTRIBUTECLASS), (Reference) t.get(POSITION_CURRENT_ATTRIBUTEREFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractMetaclassPostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ExtractMetaclassPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_METACLASS], (Attribute) match[POSITION_INITIAL_ATTRIBUTE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_ATTRIBUTECLASS], (Reference) match[POSITION_CURRENT_ATTRIBUTEREFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ExtractMetaclassPostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ExtractMetaclassPostcondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_METACLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_METACLASS], (Attribute) match[POSITION_INITIAL_ATTRIBUTE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_ATTRIBUTECLASS], (Reference) match[POSITION_CURRENT_ATTRIBUTEREFERENCE]);
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
    public static IQuerySpecification<ExtractMetaclassPostcondition.Matcher> querySpecification() {
      return ExtractMetaclassPostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ExtractMetaclassPostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_metaclass the value of pattern parameter initial_metaclass in the currently processed match
     * @param pCurrent_metaclass the value of pattern parameter current_metaclass in the currently processed match
     * @param pInitial_attribute the value of pattern parameter initial_attribute in the currently processed match
     * @param pCurrent_attributeClass the value of pattern parameter current_attributeClass in the currently processed match
     * @param pCurrent_attributeReference the value of pattern parameter current_attributeReference in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_metaclass, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_metaclass, final Attribute pInitial_attribute, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_attributeClass, final Reference pCurrent_attributeReference);
    
    @Override
    public void process(final ExtractMetaclassPostcondition.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_metaclass(), match.getCurrent_metaclass(), match.getInitial_attribute(), match.getCurrent_attributeClass(), match.getCurrent_attributeReference());
    }
  }
  
  private ExtractMetaclassPostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ExtractMetaclassPostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ExtractMetaclassPostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ExtractMetaclassPostcondition.Matcher.on(engine);
  }
  
  @Override
  public ExtractMetaclassPostcondition.Matcher instantiate() {
    return ExtractMetaclassPostcondition.Matcher.create();
  }
  
  @Override
  public ExtractMetaclassPostcondition.Match newEmptyMatch() {
    return ExtractMetaclassPostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public ExtractMetaclassPostcondition.Match newMatch(final Object... parameters) {
    return ExtractMetaclassPostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.Attribute) parameters[4], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[5], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[6]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition (visibility: PUBLIC, simpleName: ExtractMetaclassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition (visibility: PUBLIC, simpleName: ExtractMetaclassPostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ExtractMetaclassPostcondition INSTANCE = new ExtractMetaclassPostcondition();
    
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
    private final static ExtractMetaclassPostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_metaclass = new PParameter("initial_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_metaclass = new PParameter("current_metaclass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_attribute = new PParameter("initial_attribute", "se.mdh.idt.benji.examples.refactorings.metamodel.Attribute", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attributeClass = new PParameter("current_attributeClass", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_attributeReference = new PParameter("current_attributeReference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_metaclass, parameter_pCurrent_metaclass, parameter_pInitial_attribute, parameter_pCurrent_attributeClass, parameter_pCurrent_attributeReference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ExtractMetaclassPostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_metaclass","current_metaclass","initial_attribute","current_attributeClass","current_attributeReference");
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
          PVariable var_initial_package = body.getOrCreateVariableByName("initial_package");
          PVariable var_current_package = body.getOrCreateVariableByName("current_package");
          PVariable var_initial_metaclass = body.getOrCreateVariableByName("initial_metaclass");
          PVariable var_current_metaclass = body.getOrCreateVariableByName("current_metaclass");
          PVariable var_initial_attribute = body.getOrCreateVariableByName("initial_attribute");
          PVariable var_current_attributeClass = body.getOrCreateVariableByName("current_attributeClass");
          PVariable var_current_attributeReference = body.getOrCreateVariableByName("current_attributeReference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_metaclass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_attribute), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Attribute")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attributeClass), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_attributeReference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_metaclass, parameter_pInitial_metaclass),
             new ExportedParameter(body, var_current_metaclass, parameter_pCurrent_metaclass),
             new ExportedParameter(body, var_initial_attribute, parameter_pInitial_attribute),
             new ExportedParameter(body, var_current_attributeClass, parameter_pCurrent_attributeClass),
             new ExportedParameter(body, var_current_attributeReference, parameter_pCurrent_attributeReference)
          ));
          // 	find preserved_package_class (initial_package, current_package, initial_metaclass, current_metaclass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_metaclass, var_current_metaclass), Preserved_package_class.instance().getInternalQueryRepresentation());
          //  	find added_package_class (initial_package, current_package, current_attributeClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_current_attributeClass), Added_package_class.instance().getInternalQueryRepresentation());
          //  	find removed_class_attribute (initial_metaclass, current_metaclass, initial_attribute)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_metaclass, var_current_metaclass, var_initial_attribute), Removed_class_attribute.instance().getInternalQueryRepresentation());
          //  	find added_class_reference_typed (initial_metaclass, current_metaclass, current_attributeReference, current_attributeClass)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_metaclass, var_current_metaclass, var_current_attributeReference, var_current_attributeClass), Added_class_reference_typed.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
