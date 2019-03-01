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
import se.mdh.idt.benji.examples.refactorings.simplecore.queries.Preserved_reference;
import se.mdh.idt.benji.trace.Trace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         // ADCR14 - Delete Reference - Precondition
 *         pattern DeleteReferencePrecondition ($reference : Trace) {
 *         	find preserved_reference ($reference);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
public final class DeleteReferencePrecondition extends BaseGeneratedEMFQuerySpecification<DeleteReferencePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition pattern,
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
    private Trace f$reference;
    
    private static List<String> parameterNames = makeImmutableList("$reference");
    
    private Match(final Trace p$reference) {
      this.f$reference = p$reference;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$reference".equals(parameterName)) return this.f$reference;
      return null;
    }
    
    public Trace get$reference() {
      return this.f$reference;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$reference".equals(parameterName) ) {
          this.f$reference = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void set$reference(final Trace p$reference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$reference = p$reference;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return DeleteReferencePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$reference};
    }
    
    @Override
    public DeleteReferencePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$reference) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$reference\"=" + prettyPrintValue(f$reference));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash(f$reference);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof DeleteReferencePrecondition.Match)) {
          DeleteReferencePrecondition.Match other = (DeleteReferencePrecondition.Match) obj;
          return Objects.equals(f$reference, other.f$reference);
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
    public DeleteReferencePrecondition specification() {
      return DeleteReferencePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static DeleteReferencePrecondition.Match newEmptyMatch() {
      return new Mutable(null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static DeleteReferencePrecondition.Match newMutableMatch(final Trace p$reference) {
      return new Mutable(p$reference);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static DeleteReferencePrecondition.Match newMatch(final Trace p$reference) {
      return new Immutable(p$reference);
    }
    
    private static final class Mutable extends DeleteReferencePrecondition.Match {
      Mutable(final Trace p$reference) {
        super(p$reference);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends DeleteReferencePrecondition.Match {
      Immutable(final Trace p$reference) {
        super(p$reference);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ADCR14 - Delete Reference - Precondition
   * pattern DeleteReferencePrecondition ($reference : Trace) {
   * 	find preserved_reference ($reference);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see DeleteReferencePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<DeleteReferencePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static DeleteReferencePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static DeleteReferencePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private static final int POSITION_$REFERENCE = 0;
    
    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(DeleteReferencePrecondition.Matcher.class);
    
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
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<DeleteReferencePrecondition.Match> getAllMatches(final Trace p$reference) {
      return rawStreamAllMatches(new Object[]{p$reference}).collect(Collectors.toSet());
    }
    
    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<DeleteReferencePrecondition.Match> streamAllMatches(final Trace p$reference) {
      return rawStreamAllMatches(new Object[]{p$reference});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<DeleteReferencePrecondition.Match> getOneArbitraryMatch(final Trace p$reference) {
      return rawGetOneArbitraryMatch(new Object[]{p$reference});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace p$reference) {
      return rawHasMatch(new Object[]{p$reference});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace p$reference) {
      return rawCountMatches(new Object[]{p$reference});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace p$reference, final Consumer<? super DeleteReferencePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$reference}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace p$reference, final Consumer<? super DeleteReferencePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$reference}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$reference the fixed value of pattern parameter $reference, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public DeleteReferencePrecondition.Match newMatch(final Trace p$reference) {
      return DeleteReferencePrecondition.Match.newMatch(p$reference);
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
    
    @Override
    protected DeleteReferencePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return DeleteReferencePrecondition.Match.newMatch((Trace) t.get(POSITION_$REFERENCE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeleteReferencePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return DeleteReferencePrecondition.Match.newMatch((Trace) match[POSITION_$REFERENCE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected DeleteReferencePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return DeleteReferencePrecondition.Match.newMutableMatch((Trace) match[POSITION_$REFERENCE]);
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
    public static IQuerySpecification<DeleteReferencePrecondition.Matcher> querySpecification() {
      return DeleteReferencePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<DeleteReferencePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$reference the value of pattern parameter $reference in the currently processed match
     * 
     */
    public abstract void accept(final Trace p$reference);
    
    @Override
    public void accept(final DeleteReferencePrecondition.Match match) {
      accept(match.get$reference());
    }
  }
  
  private DeleteReferencePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static DeleteReferencePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected DeleteReferencePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return DeleteReferencePrecondition.Matcher.on(engine);
  }
  
  @Override
  public DeleteReferencePrecondition.Matcher instantiate() {
    return DeleteReferencePrecondition.Matcher.create();
  }
  
  @Override
  public DeleteReferencePrecondition.Match newEmptyMatch() {
    return DeleteReferencePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public DeleteReferencePrecondition.Match newMatch(final Object... parameters) {
    return DeleteReferencePrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition (visibility: PUBLIC, simpleName: DeleteReferencePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition (visibility: PUBLIC, simpleName: DeleteReferencePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final DeleteReferencePrecondition INSTANCE = new DeleteReferencePrecondition();
    
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
    private static final DeleteReferencePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_$reference = new PParameter("$reference", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_$reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.DeleteReferencePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$reference");
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
          PVariable var_$reference = body.getOrCreateVariableByName("$reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$reference, parameter_$reference)
          ));
          // 	find preserved_reference ($reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$reference), Preserved_reference.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
