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
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Inequality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_class_reference;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_package_class;
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_reference_type;
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
public final class ChangeReferenceTypePrecondition extends BaseGeneratedEMFQuerySpecification<ChangeReferenceTypePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition pattern,
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
    private Trace fReference;
    
    private Trace fType;
    
    private static List<String> parameterNames = makeImmutableList("reference", "type");
    
    private Match(final Trace pReference, final Trace pType) {
      this.fReference = pReference;
      this.fType = pType;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("reference".equals(parameterName)) return this.fReference;
      if ("type".equals(parameterName)) return this.fType;
      return null;
    }
    
    public Trace getReference() {
      return this.fReference;
    }
    
    public Trace getType() {
      return this.fType;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("reference".equals(parameterName) ) {
          this.fReference = (Trace) newValue;
          return true;
      }
      if ("type".equals(parameterName) ) {
          this.fType = (Trace) newValue;
          return true;
      }
      return false;
    }
    
    public void setReference(final Trace pReference) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fReference = pReference;
    }
    
    public void setType(final Trace pType) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fType = pType;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return ChangeReferenceTypePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{fReference, fType};
    }
    
    @Override
    public ChangeReferenceTypePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fReference, fType) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"reference\"=" + prettyPrintValue(fReference) + ", ");
      result.append("\"type\"=" + prettyPrintValue(fType));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fReference, fType);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof ChangeReferenceTypePrecondition.Match)) {
          ChangeReferenceTypePrecondition.Match other = (ChangeReferenceTypePrecondition.Match) obj;
          return Objects.equals(fReference, other.fReference) && Objects.equals(fType, other.fType);
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
    public ChangeReferenceTypePrecondition specification() {
      return ChangeReferenceTypePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static ChangeReferenceTypePrecondition.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static ChangeReferenceTypePrecondition.Match newMutableMatch(final Trace pReference, final Trace pType) {
      return new Mutable(pReference, pType);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static ChangeReferenceTypePrecondition.Match newMatch(final Trace pReference, final Trace pType) {
      return new Immutable(pReference, pType);
    }
    
    private static final class Mutable extends ChangeReferenceTypePrecondition.Match {
      Mutable(final Trace pReference, final Trace pType) {
        super(pReference, pType);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends ChangeReferenceTypePrecondition.Match {
      Immutable(final Trace pReference, final Trace pType) {
        super(pReference, pType);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACCR17 - Change Reference Type - Precondition
   * pattern ChangeReferenceTypePrecondition (reference : Trace, type : Trace) {
   * 	find preserved_package_class (^package, class);
   * 	find preserved_class_reference (class, reference);
   * 	find preserved_reference_type (reference, initial_type);
   * 	find preserved_package_class (^package, type);
   * 	type != initial_type;	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see ChangeReferenceTypePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<ChangeReferenceTypePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static ChangeReferenceTypePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static ChangeReferenceTypePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_REFERENCE = 0;
    
    private final static int POSITION_TYPE = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(ChangeReferenceTypePrecondition.Matcher.class);
    
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
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<ChangeReferenceTypePrecondition.Match> getAllMatches(final Trace pReference, final Trace pType) {
      return rawGetAllMatches(new Object[]{pReference, pType});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public ChangeReferenceTypePrecondition.Match getOneArbitraryMatch(final Trace pReference, final Trace pType) {
      return rawGetOneArbitraryMatch(new Object[]{pReference, pType});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pReference, final Trace pType) {
      return rawHasMatch(new Object[]{pReference, pType});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pReference, final Trace pType) {
      return rawCountMatches(new Object[]{pReference, pType});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pReference, final Trace pType, final IMatchProcessor<? super ChangeReferenceTypePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{pReference, pType}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pReference, final Trace pType, final IMatchProcessor<? super ChangeReferenceTypePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pReference, pType}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pReference the fixed value of pattern parameter reference, or null if not bound.
     * @param pType the fixed value of pattern parameter type, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public ChangeReferenceTypePrecondition.Match newMatch(final Trace pReference, final Trace pType) {
      return ChangeReferenceTypePrecondition.Match.newMatch(pReference, pType);
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOfreference(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_REFERENCE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference() {
      return rawAccumulateAllValuesOfreference(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference(final ChangeReferenceTypePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfreference(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for reference.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfreference(final Trace pType) {
      return rawAccumulateAllValuesOfreference(new Object[]{
      null, 
      pType
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<Trace> rawAccumulateAllValuesOftype(final Object[] parameters) {
      Set<Trace> results = new HashSet<Trace>();
      rawAccumulateAllValues(POSITION_TYPE, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftype() {
      return rawAccumulateAllValuesOftype(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftype(final ChangeReferenceTypePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOftype(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for type.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOftype(final Trace pReference) {
      return rawAccumulateAllValuesOftype(new Object[]{
      pReference, 
      null
      });
    }
    
    @Override
    protected ChangeReferenceTypePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return ChangeReferenceTypePrecondition.Match.newMatch((Trace) t.get(POSITION_REFERENCE), (Trace) t.get(POSITION_TYPE));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeReferenceTypePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return ChangeReferenceTypePrecondition.Match.newMatch((Trace) match[POSITION_REFERENCE], (Trace) match[POSITION_TYPE]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected ChangeReferenceTypePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return ChangeReferenceTypePrecondition.Match.newMutableMatch((Trace) match[POSITION_REFERENCE], (Trace) match[POSITION_TYPE]);
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
    public static IQuerySpecification<ChangeReferenceTypePrecondition.Matcher> querySpecification() {
      return ChangeReferenceTypePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<ChangeReferenceTypePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pReference the value of pattern parameter reference in the currently processed match
     * @param pType the value of pattern parameter type in the currently processed match
     * 
     */
    public abstract void process(final Trace pReference, final Trace pType);
    
    @Override
    public void process(final ChangeReferenceTypePrecondition.Match match) {
      process(match.getReference(), match.getType());
    }
  }
  
  private ChangeReferenceTypePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static ChangeReferenceTypePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected ChangeReferenceTypePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return ChangeReferenceTypePrecondition.Matcher.on(engine);
  }
  
  @Override
  public ChangeReferenceTypePrecondition.Matcher instantiate() {
    return ChangeReferenceTypePrecondition.Matcher.create();
  }
  
  @Override
  public ChangeReferenceTypePrecondition.Match newEmptyMatch() {
    return ChangeReferenceTypePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public ChangeReferenceTypePrecondition.Match newMatch(final Object... parameters) {
    return ChangeReferenceTypePrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (se.mdh.idt.benji.trace.Trace) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition (visibility: PUBLIC, simpleName: ChangeReferenceTypePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition (visibility: PUBLIC, simpleName: ChangeReferenceTypePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static ChangeReferenceTypePrecondition INSTANCE = new ChangeReferenceTypePrecondition();
    
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
    private final static ChangeReferenceTypePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pReference = new PParameter("reference", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pType = new PParameter("type", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pReference, parameter_pType);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.ChangeReferenceTypePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("reference","type");
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
          PVariable var_type = body.getOrCreateVariableByName("type");
          PVariable var_package = body.getOrCreateVariableByName("package");
          PVariable var_class = body.getOrCreateVariableByName("class");
          PVariable var_initial_type = body.getOrCreateVariableByName("initial_type");
          new TypeConstraint(body, Tuples.flatTupleOf(var_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_type), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_reference, parameter_pReference),
             new ExportedParameter(body, var_type, parameter_pType)
          ));
          // 	find preserved_package_class (^package, class)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_class), Preserved_package_class.instance().getInternalQueryRepresentation());
          // 	find preserved_class_reference (class, reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_class, var_reference), Preserved_class_reference.instance().getInternalQueryRepresentation());
          // 	find preserved_reference_type (reference, initial_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_reference, var_initial_type), Preserved_reference_type.instance().getInternalQueryRepresentation());
          // 	find preserved_package_class (^package, type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_type), Preserved_package_class.instance().getInternalQueryRepresentation());
          // 	type != initial_type
          new Inequality(body, var_type, var_initial_type);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
