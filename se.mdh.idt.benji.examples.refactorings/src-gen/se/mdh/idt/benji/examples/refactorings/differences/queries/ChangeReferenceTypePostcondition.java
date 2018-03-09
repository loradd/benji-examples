/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/ChangeReferenceType.vql
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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Changed_reference_type;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class_reference;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_package_class;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class ChangeReferenceTypePostcondition extends BaseGeneratedEMFQuerySpecification<ChangeReferenceTypePostcondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition pattern,
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
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_class;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_class;
    
    private Reference fInitial_reference;
    
    private Reference fCurrent_reference;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_reference_type;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_reference_type;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fInitial_type;
    
    private se.mdh.idt.benji.examples.refactorings.metamodel.Class fCurrent_type;
    
    private static List<String> parameterNames = makeImmutableList("initial_package", "current_package", "initial_class", "current_class", "initial_reference", "current_reference", "initial_reference_type", "current_reference_type", "initial_type", "current_type");
    
    private Match(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      this.fInitial_package = pInitial_package;
      this.fCurrent_package = pCurrent_package;
      this.fInitial_class = pInitial_class;
      this.fCurrent_class = pCurrent_class;
      this.fInitial_reference = pInitial_reference;
      this.fCurrent_reference = pCurrent_reference;
      this.fInitial_reference_type = pInitial_reference_type;
      this.fCurrent_reference_type = pCurrent_reference_type;
      this.fInitial_type = pInitial_type;
      this.fCurrent_type = pCurrent_type;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("initial_package".equals(parameterName)) return this.fInitial_package;
      if ("current_package".equals(parameterName)) return this.fCurrent_package;
      if ("initial_class".equals(parameterName)) return this.fInitial_class;
      if ("current_class".equals(parameterName)) return this.fCurrent_class;
      if ("initial_reference".equals(parameterName)) return this.fInitial_reference;
      if ("current_reference".equals(parameterName)) return this.fCurrent_reference;
      if ("initial_reference_type".equals(parameterName)) return this.fInitial_reference_type;
      if ("current_reference_type".equals(parameterName)) return this.fCurrent_reference_type;
      if ("initial_type".equals(parameterName)) return this.fInitial_type;
      if ("current_type".equals(parameterName)) return this.fCurrent_type;
      return null;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getInitial_package() {
      return this.fInitial_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Package getCurrent_package() {
      return this.fCurrent_package;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_class() {
      return this.fInitial_class;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_class() {
      return this.fCurrent_class;
    }
    
    public Reference getInitial_reference() {
      return this.fInitial_reference;
    }
    
    public Reference getCurrent_reference() {
      return this.fCurrent_reference;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_reference_type() {
      return this.fInitial_reference_type;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_reference_type() {
      return this.fCurrent_reference_type;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getInitial_type() {
      return this.fInitial_type;
    }
    
    public se.mdh.idt.benji.examples.refactorings.metamodel.Class getCurrent_type() {
      return this.fCurrent_type;
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
      if ("initial_class".equals(parameterName) ) {
          this.fInitial_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_class".equals(parameterName) ) {
          this.fCurrent_class = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_reference".equals(parameterName) ) {
          this.fInitial_reference = (Reference) newValue;
          return true;
      }
      if ("current_reference".equals(parameterName) ) {
          this.fCurrent_reference = (Reference) newValue;
          return true;
      }
      if ("initial_reference_type".equals(parameterName) ) {
          this.fInitial_reference_type = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_reference_type".equals(parameterName) ) {
          this.fCurrent_reference_type = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("initial_type".equals(parameterName) ) {
          this.fInitial_type = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
          return true;
      }
      if ("current_type".equals(parameterName) ) {
          this.fCurrent_type = (se.mdh.idt.benji.examples.refactorings.metamodel.Class) newValue;
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
    
    public void setInitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_class = pInitial_class;
    }
    
    public void setCurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_class = pCurrent_class;
    }
    
    public void setInitial_reference(final Reference pInitial_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_reference = pInitial_reference;
    }
    
    public void setCurrent_reference(final Reference pCurrent_reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_reference = pCurrent_reference;
    }
    
    public void setInitial_reference_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_reference_type = pInitial_reference_type;
    }
    
    public void setCurrent_reference_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_reference_type = pCurrent_reference_type;
    }
    
    public void setInitial_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fInitial_type = pInitial_type;
    }
    
    public void setCurrent_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fCurrent_type = pCurrent_type;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ChangeReferenceTypePostcondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_reference, fCurrent_reference, fInitial_reference_type, fCurrent_reference_type, fInitial_type, fCurrent_type};
    }
    
    @Override
    public ChangeReferenceTypePostcondition.Match toImmutable() {
      return isMutable() ? newMatch(fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_reference, fCurrent_reference, fInitial_reference_type, fCurrent_reference_type, fInitial_type, fCurrent_type) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"initial_package\"=" + prettyPrintValue(fInitial_package) + ", ");
      result.append("\"current_package\"=" + prettyPrintValue(fCurrent_package) + ", ");
      result.append("\"initial_class\"=" + prettyPrintValue(fInitial_class) + ", ");
      result.append("\"current_class\"=" + prettyPrintValue(fCurrent_class) + ", ");
      result.append("\"initial_reference\"=" + prettyPrintValue(fInitial_reference) + ", ");
      result.append("\"current_reference\"=" + prettyPrintValue(fCurrent_reference) + ", ");
      result.append("\"initial_reference_type\"=" + prettyPrintValue(fInitial_reference_type) + ", ");
      result.append("\"current_reference_type\"=" + prettyPrintValue(fCurrent_reference_type) + ", ");
      result.append("\"initial_type\"=" + prettyPrintValue(fInitial_type) + ", ");
      result.append("\"current_type\"=" + prettyPrintValue(fCurrent_type));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fInitial_package, fCurrent_package, fInitial_class, fCurrent_class, fInitial_reference, fCurrent_reference, fInitial_reference_type, fCurrent_reference_type, fInitial_type, fCurrent_type);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ChangeReferenceTypePostcondition.Match)) {
          ChangeReferenceTypePostcondition.Match other = (ChangeReferenceTypePostcondition.Match) obj;
          return Objects.equals(fInitial_package, other.fInitial_package) && Objects.equals(fCurrent_package, other.fCurrent_package) && Objects.equals(fInitial_class, other.fInitial_class) && Objects.equals(fCurrent_class, other.fCurrent_class) && Objects.equals(fInitial_reference, other.fInitial_reference) && Objects.equals(fCurrent_reference, other.fCurrent_reference) && Objects.equals(fInitial_reference_type, other.fInitial_reference_type) && Objects.equals(fCurrent_reference_type, other.fCurrent_reference_type) && Objects.equals(fInitial_type, other.fInitial_type) && Objects.equals(fCurrent_type, other.fCurrent_type);
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
    public ChangeReferenceTypePostcondition specification() {
      return ChangeReferenceTypePostcondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ChangeReferenceTypePostcondition.Match newEmptyMatch() {
      return new Mutable(null, null, null, null, null, null, null, null, null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ChangeReferenceTypePostcondition.Match newMutableMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return new Mutable(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ChangeReferenceTypePostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return new Immutable(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type);
    }
    
    private static final class Mutable extends ChangeReferenceTypePostcondition.Match {
      Mutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
        super(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ChangeReferenceTypePostcondition.Match {
      Immutable(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
        super(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACCR17 - Change Reference Type - Postcondition
   * pattern ChangeReferenceTypePostcondition (
   * 	initial_package : Package, current_package : Package, 
   * 	initial_class : Class, current_class : Class, 
   * 	initial_reference : Reference, current_reference : Reference,
   * 	initial_reference_type : Class, current_reference_type : Class, 
   * 	initial_type : Class, current_type : Class
   * ) {
   * 	find preserved_package_class (initial_package, current_package, initial_class, current_class); 
   * 	find preserved_package_class (initial_package, current_package, initial_type, current_type); 
   * 	find preserved_package_class (initial_package, current_package, initial_reference_type, current_reference_type); 
   * 	find preserved_class_reference (initial_class, current_class, initial_reference, current_reference);
   * 	find changed_reference_type (initial_reference, current_reference, initial_reference_type, current_type);
   * 	initial_reference_type != initial_type; 
   * 	current_reference_type != current_type;  
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ChangeReferenceTypePostcondition
   * 
   */
  public static class Matcher extends BaseMatcher<ChangeReferenceTypePostcondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ChangeReferenceTypePostcondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ChangeReferenceTypePostcondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_INITIAL_PACKAGE = 0;
    
    private final static int POSITION_CURRENT_PACKAGE = 1;
    
    private final static int POSITION_INITIAL_CLASS = 2;
    
    private final static int POSITION_CURRENT_CLASS = 3;
    
    private final static int POSITION_INITIAL_REFERENCE = 4;
    
    private final static int POSITION_CURRENT_REFERENCE = 5;
    
    private final static int POSITION_INITIAL_REFERENCE_TYPE = 6;
    
    private final static int POSITION_CURRENT_REFERENCE_TYPE = 7;
    
    private final static int POSITION_INITIAL_TYPE = 8;
    
    private final static int POSITION_CURRENT_TYPE = 9;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ChangeReferenceTypePostcondition.Matcher.class);
    
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
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ChangeReferenceTypePostcondition.Match> getAllMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawGetAllMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ChangeReferenceTypePostcondition.Match getOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawGetOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawHasMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawCountMatches(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type, final IMatchProcessor<? super ChangeReferenceTypePostcondition.Match> processor) {
      rawForEachMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type, final IMatchProcessor<? super ChangeReferenceTypePostcondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pInitial_package the fixed value of pattern parameter initial_package, or null if not bound.
     * @param pCurrent_package the fixed value of pattern parameter current_package, or null if not bound.
     * @param pInitial_class the fixed value of pattern parameter initial_class, or null if not bound.
     * @param pCurrent_class the fixed value of pattern parameter current_class, or null if not bound.
     * @param pInitial_reference the fixed value of pattern parameter initial_reference, or null if not bound.
     * @param pCurrent_reference the fixed value of pattern parameter current_reference, or null if not bound.
     * @param pInitial_reference_type the fixed value of pattern parameter initial_reference_type, or null if not bound.
     * @param pCurrent_reference_type the fixed value of pattern parameter current_reference_type, or null if not bound.
     * @param pInitial_type the fixed value of pattern parameter initial_type, or null if not bound.
     * @param pCurrent_type the fixed value of pattern parameter current_type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ChangeReferenceTypePostcondition.Match newMatch(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return ChangeReferenceTypePostcondition.Match.newMatch(pInitial_package, pCurrent_package, pInitial_class, pCurrent_class, pInitial_reference, pCurrent_reference, pInitial_reference_type, pCurrent_reference_type, pInitial_type, pCurrent_type);
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfinitial_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_package(new Object[]{
      null, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      pInitial_type, 
      pCurrent_type
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
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Package> getAllValuesOfcurrent_package(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_package(new Object[]{
      pInitial_package, 
      null, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class() {
      return rawAccumulateAllValuesOfinitial_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_class(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      null, 
      pCurrent_class, 
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_class(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_CLASS, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class() {
      return rawAccumulateAllValuesOfcurrent_class(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_class(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_class(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      null, 
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfinitial_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_INITIAL_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference() {
      return rawAccumulateAllValuesOfinitial_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfinitial_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_reference(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      null, 
      pCurrent_reference, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfcurrent_reference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_CURRENT_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference() {
      return rawAccumulateAllValuesOfcurrent_reference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfcurrent_reference(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_reference(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_reference, 
      null, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_reference_type(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_REFERENCE_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_reference_type() {
      return rawAccumulateAllValuesOfinitial_reference_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_reference_type(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_reference_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_reference_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_reference_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_reference, 
      pCurrent_reference, 
      null, 
      pCurrent_reference_type, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_reference_type(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_REFERENCE_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_reference_type() {
      return rawAccumulateAllValuesOfcurrent_reference_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_reference_type(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_reference_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_reference_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_reference_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfcurrent_reference_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_reference_type, 
      null, 
      pInitial_type, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfinitial_type(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_INITIAL_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_type() {
      return rawAccumulateAllValuesOfinitial_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_type(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfinitial_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for initial_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfinitial_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type) {
      return rawAccumulateAllValuesOfinitial_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      null, 
      pCurrent_type
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> rawAccumulateAllValuesOfcurrent_type(final Object[] parameters) {
      Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> results = new HashSet<se.mdh.idt.benji.examples.refactorings.metamodel.Class>();
      rawAccumulateAllValues(POSITION_CURRENT_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_type() {
      return rawAccumulateAllValuesOfcurrent_type(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_type(final ChangeReferenceTypePostcondition.Match partialMatch) {
      return rawAccumulateAllValuesOfcurrent_type(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for current_type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<se.mdh.idt.benji.examples.refactorings.metamodel.Class> getAllValuesOfcurrent_type(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type) {
      return rawAccumulateAllValuesOfcurrent_type(new Object[]{
      pInitial_package, 
      pCurrent_package, 
      pInitial_class, 
      pCurrent_class, 
      pInitial_reference, 
      pCurrent_reference, 
      pInitial_reference_type, 
      pCurrent_reference_type, 
      pInitial_type, 
      null
      });
    }
    
    @Override
    protected ChangeReferenceTypePostcondition.Match tupleToMatch(final Tuple t) {
      try {
          return ChangeReferenceTypePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_INITIAL_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Package) t.get(POSITION_CURRENT_PACKAGE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_CLASS), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_CLASS), (Reference) t.get(POSITION_INITIAL_REFERENCE), (Reference) t.get(POSITION_CURRENT_REFERENCE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_REFERENCE_TYPE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_REFERENCE_TYPE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_INITIAL_TYPE), (se.mdh.idt.benji.examples.refactorings.metamodel.Class) t.get(POSITION_CURRENT_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeReferenceTypePostcondition.Match arrayToMatch(final Object[] match) {
      try {
          return ChangeReferenceTypePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_REFERENCE_TYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_REFERENCE_TYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_TYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeReferenceTypePostcondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ChangeReferenceTypePostcondition.Match.newMutableMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_INITIAL_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) match[POSITION_CURRENT_PACKAGE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_CLASS], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_CLASS], (Reference) match[POSITION_INITIAL_REFERENCE], (Reference) match[POSITION_CURRENT_REFERENCE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_REFERENCE_TYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_REFERENCE_TYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_INITIAL_TYPE], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) match[POSITION_CURRENT_TYPE]);
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
    public static IQuerySpecification<ChangeReferenceTypePostcondition.Matcher> querySpecification() {
      return ChangeReferenceTypePostcondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ChangeReferenceTypePostcondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pInitial_package the value of pattern parameter initial_package in the currently processed match
     * @param pCurrent_package the value of pattern parameter current_package in the currently processed match
     * @param pInitial_class the value of pattern parameter initial_class in the currently processed match
     * @param pCurrent_class the value of pattern parameter current_class in the currently processed match
     * @param pInitial_reference the value of pattern parameter initial_reference in the currently processed match
     * @param pCurrent_reference the value of pattern parameter current_reference in the currently processed match
     * @param pInitial_reference_type the value of pattern parameter initial_reference_type in the currently processed match
     * @param pCurrent_reference_type the value of pattern parameter current_reference_type in the currently processed match
     * @param pInitial_type the value of pattern parameter initial_type in the currently processed match
     * @param pCurrent_type the value of pattern parameter current_type in the currently processed match
     * 
     */
    public abstract void process(final se.mdh.idt.benji.examples.refactorings.metamodel.Package pInitial_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Package pCurrent_package, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_class, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_class, final Reference pInitial_reference, final Reference pCurrent_reference, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_reference_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pInitial_type, final se.mdh.idt.benji.examples.refactorings.metamodel.Class pCurrent_type);
    
    @Override
    public void process(final ChangeReferenceTypePostcondition.Match match) {
      process(match.getInitial_package(), match.getCurrent_package(), match.getInitial_class(), match.getCurrent_class(), match.getInitial_reference(), match.getCurrent_reference(), match.getInitial_reference_type(), match.getCurrent_reference_type(), match.getInitial_type(), match.getCurrent_type());
    }
  }
  
  private ChangeReferenceTypePostcondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ChangeReferenceTypePostcondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChangeReferenceTypePostcondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ChangeReferenceTypePostcondition.Matcher.on(engine);
  }
  
  @Override
  public ChangeReferenceTypePostcondition.Matcher instantiate() {
    return ChangeReferenceTypePostcondition.Matcher.create();
  }
  
  @Override
  public ChangeReferenceTypePostcondition.Match newEmptyMatch() {
    return ChangeReferenceTypePostcondition.Match.newEmptyMatch();
  }
  
  @Override
  public ChangeReferenceTypePostcondition.Match newMatch(final Object... parameters) {
    return ChangeReferenceTypePostcondition.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Package) parameters[1], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[2], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[3], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[4], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[5], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[6], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[7], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[8], (se.mdh.idt.benji.examples.refactorings.metamodel.Class) parameters[9]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition (visibility: PUBLIC, simpleName: ChangeReferenceTypePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition (visibility: PUBLIC, simpleName: ChangeReferenceTypePostcondition, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ChangeReferenceTypePostcondition INSTANCE = new ChangeReferenceTypePostcondition();
    
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
    private final static ChangeReferenceTypePostcondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_package = new PParameter("initial_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_package = new PParameter("current_package", "se.mdh.idt.benji.examples.refactorings.metamodel.Package", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Package")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_reference = new PParameter("initial_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference = new PParameter("current_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_reference_type = new PParameter("initial_reference_type", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_reference_type = new PParameter("current_reference_type", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_type = new PParameter("initial_type", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_type = new PParameter("current_type", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_package, parameter_pCurrent_package, parameter_pInitial_class, parameter_pCurrent_class, parameter_pInitial_reference, parameter_pCurrent_reference, parameter_pInitial_reference_type, parameter_pCurrent_reference_type, parameter_pInitial_type, parameter_pCurrent_type);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.ChangeReferenceTypePostcondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_package","current_package","initial_class","current_class","initial_reference","current_reference","initial_reference_type","current_reference_type","initial_type","current_type");
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
          PVariable var_initial_class = body.getOrCreateVariableByName("initial_class");
          PVariable var_current_class = body.getOrCreateVariableByName("current_class");
          PVariable var_initial_reference = body.getOrCreateVariableByName("initial_reference");
          PVariable var_current_reference = body.getOrCreateVariableByName("current_reference");
          PVariable var_initial_reference_type = body.getOrCreateVariableByName("initial_reference_type");
          PVariable var_current_reference_type = body.getOrCreateVariableByName("current_reference_type");
          PVariable var_initial_type = body.getOrCreateVariableByName("initial_type");
          PVariable var_current_type = body.getOrCreateVariableByName("current_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Package")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_reference_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_reference_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_package, parameter_pInitial_package),
             new ExportedParameter(body, var_current_package, parameter_pCurrent_package),
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_initial_reference, parameter_pInitial_reference),
             new ExportedParameter(body, var_current_reference, parameter_pCurrent_reference),
             new ExportedParameter(body, var_initial_reference_type, parameter_pInitial_reference_type),
             new ExportedParameter(body, var_current_reference_type, parameter_pCurrent_reference_type),
             new ExportedParameter(body, var_initial_type, parameter_pInitial_type),
             new ExportedParameter(body, var_current_type, parameter_pCurrent_type)
          ));
          // 	find preserved_package_class (initial_package, current_package, initial_class, current_class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_class, var_current_class), Preserved_package_class.instance().getInternalQueryRepresentation());
          //  	find preserved_package_class (initial_package, current_package, initial_type, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_type, var_current_type), Preserved_package_class.instance().getInternalQueryRepresentation());
          //  	find preserved_package_class (initial_package, current_package, initial_reference_type, current_reference_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_package, var_current_package, var_initial_reference_type, var_current_reference_type), Preserved_package_class.instance().getInternalQueryRepresentation());
          //  	find preserved_class_reference (initial_class, current_class, initial_reference, current_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var_initial_reference, var_current_reference), Preserved_class_reference.instance().getInternalQueryRepresentation());
          // 	find changed_reference_type (initial_reference, current_reference, initial_reference_type, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_reference, var_current_reference, var_initial_reference_type, var_current_type), Changed_reference_type.instance().getInternalQueryRepresentation());
          // 	initial_reference_type != initial_type
          new Inequality(body, var_initial_reference_type, var_initial_type);
          //  	current_reference_type != current_type
          new Inequality(body, var_current_reference_type, var_current_type);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
