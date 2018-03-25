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
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.TypeFilterConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_class_name;
import se.mdh.idt.benji.trace.TraceLink;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:20+0200")
public final class RenameClassPrecondition extends BaseGeneratedEMFQuerySpecification<RenameClassPrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition pattern,
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
    private TraceLink f$class;
    
    private String f$name;
    
    private static List<String> parameterNames = makeImmutableList("$class", "$name");
    
    private Match(final TraceLink p$class, final String p$name) {
      this.f$class = p$class;
      this.f$name = p$name;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$class".equals(parameterName)) return this.f$class;
      if ("$name".equals(parameterName)) return this.f$name;
      return null;
    }
    
    public TraceLink get$class() {
      return this.f$class;
    }
    
    public String get$name() {
      return this.f$name;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$class".equals(parameterName) ) {
          this.f$class = (TraceLink) newValue;
          return true;
      }
      if ("$name".equals(parameterName) ) {
          this.f$name = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void set$class(final TraceLink p$class) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$class = p$class;
    }
    
    public void set$name(final String p$name) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$name = p$name;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return RenameClassPrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$class, f$name};
    }
    
    @Override
    public RenameClassPrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$class, f$name) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$class\"=" + prettyPrintValue(f$class) + ", ");
      result.append("\"$name\"=" + prettyPrintValue(f$name));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$class, f$name);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RenameClassPrecondition.Match)) {
          RenameClassPrecondition.Match other = (RenameClassPrecondition.Match) obj;
          return Objects.equals(f$class, other.f$class) && Objects.equals(f$name, other.f$name);
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
    public RenameClassPrecondition specification() {
      return RenameClassPrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RenameClassPrecondition.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RenameClassPrecondition.Match newMutableMatch(final TraceLink p$class, final String p$name) {
      return new Mutable(p$class, p$name);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RenameClassPrecondition.Match newMatch(final TraceLink p$class, final String p$name) {
      return new Immutable(p$class, p$name);
    }
    
    private static final class Mutable extends RenameClassPrecondition.Match {
      Mutable(final TraceLink p$class, final String p$name) {
        super(p$class, p$name);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RenameClassPrecondition.Match {
      Immutable(final TraceLink p$class, final String p$name) {
        super(p$class, p$name);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACC6 - Rename Class - Precondition
   * pattern RenameClassPrecondition ($class : TraceLink, $name : java String) {
   * 	find get_class_name ($class, $class_name);
   * 	$name == eval ("renamed_" + $class_name); 	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see RenameClassPrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<RenameClassPrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RenameClassPrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static RenameClassPrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$CLASS = 0;
    
    private final static int POSITION_$NAME = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RenameClassPrecondition.Matcher.class);
    
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
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RenameClassPrecondition.Match> getAllMatches(final TraceLink p$class, final String p$name) {
      return rawGetAllMatches(new Object[]{p$class, p$name});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public RenameClassPrecondition.Match getOneArbitraryMatch(final TraceLink p$class, final String p$name) {
      return rawGetOneArbitraryMatch(new Object[]{p$class, p$name});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$class, final String p$name) {
      return rawHasMatch(new Object[]{p$class, p$name});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$class, final String p$name) {
      return rawCountMatches(new Object[]{p$class, p$name});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$class, final String p$name, final IMatchProcessor<? super RenameClassPrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$class, p$name}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$class, final String p$name, final IMatchProcessor<? super RenameClassPrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$class, p$name}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$class the fixed value of pattern parameter $class, or null if not bound.
     * @param p$name the fixed value of pattern parameter $name, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RenameClassPrecondition.Match newMatch(final TraceLink p$class, final String p$name) {
      return RenameClassPrecondition.Match.newMatch(p$class, p$name);
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
    public Set<TraceLink> getAllValuesOf$class(final RenameClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$class(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $class.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$class(final String p$name) {
      return rawAccumulateAllValuesOf$class(new Object[]{
      null, 
      p$name
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$name(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$NAME, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$name() {
      return rawAccumulateAllValuesOf$name(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$name(final RenameClassPrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$name(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $name.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$name(final TraceLink p$class) {
      return rawAccumulateAllValuesOf$name(new Object[]{
      p$class, 
      null
      });
    }
    
    @Override
    protected RenameClassPrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return RenameClassPrecondition.Match.newMatch((TraceLink) t.get(POSITION_$CLASS), (String) t.get(POSITION_$NAME));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameClassPrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return RenameClassPrecondition.Match.newMatch((TraceLink) match[POSITION_$CLASS], (String) match[POSITION_$NAME]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameClassPrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RenameClassPrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$CLASS], (String) match[POSITION_$NAME]);
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
    public static IQuerySpecification<RenameClassPrecondition.Matcher> querySpecification() {
      return RenameClassPrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<RenameClassPrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$class the value of pattern parameter $class in the currently processed match
     * @param p$name the value of pattern parameter $name in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$class, final String p$name);
    
    @Override
    public void process(final RenameClassPrecondition.Match match) {
      process(match.get$class(), match.get$name());
    }
  }
  
  private RenameClassPrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RenameClassPrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RenameClassPrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return RenameClassPrecondition.Matcher.on(engine);
  }
  
  @Override
  public RenameClassPrecondition.Matcher instantiate() {
    return RenameClassPrecondition.Matcher.create();
  }
  
  @Override
  public RenameClassPrecondition.Match newEmptyMatch() {
    return RenameClassPrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public RenameClassPrecondition.Match newMatch(final Object... parameters) {
    return RenameClassPrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition (visibility: PUBLIC, simpleName: RenameClassPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition (visibility: PUBLIC, simpleName: RenameClassPrecondition, identifier: se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RenameClassPrecondition INSTANCE = new RenameClassPrecondition();
    
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
    private final static RenameClassPrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$class = new PParameter("$class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$name = new PParameter("$name", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$class, parameter_p$name);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.RenameClassPrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$class","$name");
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
          PVariable var_$class = body.getOrCreateVariableByName("$class");
          PVariable var_$name = body.getOrCreateVariableByName("$name");
          PVariable var_$class_name = body.getOrCreateVariableByName("$class_name");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$name), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$class, parameter_p$class),
             new ExportedParameter(body, var_$name, parameter_p$name)
          ));
          // 	find get_class_name ($class, $class_name)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$class, var_$class_name), Get_class_name.instance().getInternalQueryRepresentation());
          // 	$name == eval ("renamed_" + $class_name)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern RenameClassPrecondition";
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
          new Equality(body, var_$name, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final String $class_name) {
    return ("renamed_" + $class_name);
  }
}
