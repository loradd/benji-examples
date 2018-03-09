/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings.metamodel.queries/src/se/mdh/idt/benji/examples/refactorings/metamodel/queries/Reference.vql
 */
package se.mdh.idt.benji.examples.refactorings.metamodel.queries;

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
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.Reference;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Reference_opposite extends BaseGeneratedEMFQuerySpecification<Reference_opposite.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.reference_opposite pattern,
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
    private Reference fReference;
    
    private Reference fOpposite;
    
    private static List<String> parameterNames = makeImmutableList("reference", "opposite");
    
    private Match(final Reference pReference, final Reference pOpposite) {
      this.fReference = pReference;
      this.fOpposite = pOpposite;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("opposite".equals(parameterName)) return this.fOpposite;
      return null;
    }
    
    public Reference getReference() {
      return this.fReference;
    }
    
    public Reference getOpposite() {
      return this.fOpposite;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("reference".equals(parameterName) ) {
          this.fReference = (Reference) newValue;
          return true;
      }
      if ("opposite".equals(parameterName) ) {
          this.fOpposite = (Reference) newValue;
          return true;
      }
      return false;
    }
    
    public void setReference(final Reference pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    public void setOpposite(final Reference pOpposite) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fOpposite = pOpposite;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.reference_opposite";
    }
    
    @Override
    public List<String> parameterNames() {
      return Reference_opposite.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fOpposite};
    }
    
    @Override
    public Reference_opposite.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fOpposite) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"opposite\"=" + prettyPrintValue(fOpposite));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fReference, fOpposite);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Reference_opposite.Match)) {
          Reference_opposite.Match other = (Reference_opposite.Match) obj;
          return Objects.equals(fReference, other.fReference) && Objects.equals(fOpposite, other.fOpposite);
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
    public Reference_opposite specification() {
      return Reference_opposite.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Reference_opposite.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Reference_opposite.Match newMutableMatch(final Reference pReference, final Reference pOpposite) {
      return new Mutable(pReference, pOpposite);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Reference_opposite.Match newMatch(final Reference pReference, final Reference pOpposite) {
      return new Immutable(pReference, pOpposite);
    }
    
    private static final class Mutable extends Reference_opposite.Match {
      Mutable(final Reference pReference, final Reference pOpposite) {
        super(pReference, pOpposite);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends Reference_opposite.Match {
      Immutable(final Reference pReference, final Reference pOpposite) {
        super(pReference, pOpposite);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.metamodel.queries.reference_opposite pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // reference - opposite
   * pattern reference_opposite (reference : Reference, opposite : Reference) {
   * 	Reference.opposite (reference, opposite); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Reference_opposite
   * 
   */
  public static class Matcher extends BaseMatcher<Reference_opposite.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Reference_opposite.Matcher on(final ViatraQueryEngine engine) {
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
    public static Reference_opposite.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_REFERENCE = 0;
    
    private final static int POSITION_OPPOSITE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Reference_opposite.Matcher.class);
    
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
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Reference_opposite.Match> getAllMatches(final Reference pReference, final Reference pOpposite) {
      return rawGetAllMatches(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Reference_opposite.Match getOneArbitraryMatch(final Reference pReference, final Reference pOpposite) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Reference pReference, final Reference pOpposite) {
      return rawHasMatch(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Reference pReference, final Reference pOpposite) {
      return rawCountMatches(new Object[]{pReference, pOpposite});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Reference pReference, final Reference pOpposite, final IMatchProcessor<? super Reference_opposite.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pOpposite}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Reference pReference, final Reference pOpposite, final IMatchProcessor<? super Reference_opposite.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pOpposite}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pOpposite the fixed value of pattern parameter opposite, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Reference_opposite.Match newMatch(final Reference pReference, final Reference pOpposite) {
      return Reference_opposite.Match.newMatch(pReference, pOpposite);
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfreference(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfreference() {
      return rawAccumulateAllValuesOfreference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfreference(final Reference_opposite.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfreference(final Reference pOpposite) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      null, 
      pOpposite
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Reference> rawAccumulateAllValuesOfopposite(final Object[] parameters) {
      Set<Reference> results = new HashSet<Reference>();
      rawAccumulateAllValues(POSITION_OPPOSITE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfopposite() {
      return rawAccumulateAllValuesOfopposite(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfopposite(final Reference_opposite.Match partialMatch) {
      return rawAccumulateAllValuesOfopposite(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for opposite.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Reference> getAllValuesOfopposite(final Reference pReference) {
      return rawAccumulateAllValuesOfopposite(new Object[]{
      pReference, 
      null
      });
    }
    
    @Override
    protected Reference_opposite.Match tupleToMatch(final Tuple t) {
      try {
          return Reference_opposite.Match.newMatch((Reference) t.get(POSITION_REFERENCE), (Reference) t.get(POSITION_OPPOSITE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Reference_opposite.Match arrayToMatch(final Object[] match) {
      try {
          return Reference_opposite.Match.newMatch((Reference) match[POSITION_REFERENCE], (Reference) match[POSITION_OPPOSITE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected Reference_opposite.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Reference_opposite.Match.newMutableMatch((Reference) match[POSITION_REFERENCE], (Reference) match[POSITION_OPPOSITE]);
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
    public static IQuerySpecification<Reference_opposite.Matcher> querySpecification() {
      return Reference_opposite.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.metamodel.queries.reference_opposite pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<Reference_opposite.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pOpposite the value of pattern parameter opposite in the currently processed match
     * 
     */
    public abstract void process(final Reference pReference, final Reference pOpposite);
    
    @Override
    public void process(final Reference_opposite.Match match) {
      process(match.getReference(), match.getOpposite());
    }
  }
  
  private Reference_opposite() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Reference_opposite instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected Reference_opposite.Matcher instantiate(final ViatraQueryEngine engine) {
    return Reference_opposite.Matcher.on(engine);
  }
  
  @Override
  public Reference_opposite.Matcher instantiate() {
    return Reference_opposite.Matcher.create();
  }
  
  @Override
  public Reference_opposite.Match newEmptyMatch() {
    return Reference_opposite.Match.newEmptyMatch();
  }
  
  @Override
  public Reference_opposite.Match newMatch(final Object... parameters) {
    return Reference_opposite.Match.newMatch((se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[0], (se.mdh.idt.benji.examples.refactorings.metamodel.Reference) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_opposite (visibility: PUBLIC, simpleName: Reference_opposite, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_opposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_opposite (visibility: PUBLIC, simpleName: Reference_opposite, identifier: se.mdh.idt.benji.examples.refactorings.metamodel.queries.Reference_opposite, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.metamodel.queries) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Reference_opposite INSTANCE = new Reference_opposite();
    
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
    private final static Reference_opposite.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pOpposite = new PParameter("opposite", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pReference, parameter_pOpposite);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.metamodel.queries.reference_opposite";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","opposite");
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
          PVariable var_reference = body.getOrCreateVariableByName("reference");
          PVariable var_opposite = body.getOrCreateVariableByName("opposite");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_opposite), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_opposite, parameter_pOpposite)
          ));
          // 	Reference.opposite (reference, opposite)
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference", "opposite")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          new Equality(body, var__virtual_0_, var_opposite);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
