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
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Get_package_uri;
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
public final class RenameURIPackagePrecondition extends BaseGeneratedEMFQuerySpecification<RenameURIPackagePrecondition.Matcher> {
  /**
   * Pattern-specific match representation of the se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition pattern,
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
    
    private String f$uri;
    
    private static List<String> parameterNames = makeImmutableList("$package", "$uri");
    
    private Match(final TraceLink p$package, final String p$uri) {
      this.f$package = p$package;
      this.f$uri = p$uri;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("$package".equals(parameterName)) return this.f$package;
      if ("$uri".equals(parameterName)) return this.f$uri;
      return null;
    }
    
    public TraceLink get$package() {
      return this.f$package;
    }
    
    public String get$uri() {
      return this.f$uri;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("$package".equals(parameterName) ) {
          this.f$package = (TraceLink) newValue;
          return true;
      }
      if ("$uri".equals(parameterName) ) {
          this.f$uri = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void set$package(final TraceLink p$package) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$package = p$package;
    }
    
    public void set$uri(final String p$uri) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.f$uri = p$uri;
    }
    
    @Override
    public String patternName() {
      return "se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition";
    }
    
    @Override
    public List<String> parameterNames() {
      return RenameURIPackagePrecondition.Match.parameterNames;
    }
    
    @Override
    public Object[] toArray() {
      return new Object[]{f$package, f$uri};
    }
    
    @Override
    public RenameURIPackagePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(f$package, f$uri) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"$package\"=" + prettyPrintValue(f$package) + ", ");
      result.append("\"$uri\"=" + prettyPrintValue(f$uri));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (f$package, f$uri);
    }
    
    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof RenameURIPackagePrecondition.Match)) {
          RenameURIPackagePrecondition.Match other = (RenameURIPackagePrecondition.Match) obj;
          return Objects.equals(f$package, other.f$package) && Objects.equals(f$uri, other.f$uri);
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
    public RenameURIPackagePrecondition specification() {
      return RenameURIPackagePrecondition.instance();
    }
    
    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static RenameURIPackagePrecondition.Match newEmptyMatch() {
      return new Mutable(null, null);
    }
    
    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RenameURIPackagePrecondition.Match newMutableMatch(final TraceLink p$package, final String p$uri) {
      return new Mutable(p$package, p$uri);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RenameURIPackagePrecondition.Match newMatch(final TraceLink p$package, final String p$uri) {
      return new Immutable(p$package, p$uri);
    }
    
    private static final class Mutable extends RenameURIPackagePrecondition.Match {
      Mutable(final TraceLink p$package, final String p$uri) {
        super(p$package, p$uri);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RenameURIPackagePrecondition.Match {
      Immutable(final TraceLink p$package, final String p$uri) {
        super(p$package, p$uri);
      }
      
      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }
  
  /**
   * Generated pattern matcher API of the se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(Notifier)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * // ACP2 - Rename URI Package - Precondition
   * pattern RenameURIPackagePrecondition ($package : TraceLink, $uri : java String) {
   * 	find get_package_uri ($package, $package_uri); 
   * 	$uri == eval("renamed_" + $package_uri);	
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see RenameURIPackagePrecondition
   * 
   */
  public static class Matcher extends BaseMatcher<RenameURIPackagePrecondition.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * The match set will be incrementally refreshed upon updates.
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static RenameURIPackagePrecondition.Matcher on(final ViatraQueryEngine engine) {
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
    public static RenameURIPackagePrecondition.Matcher create() {
      return new Matcher();
    }
    
    private final static int POSITION_$PACKAGE = 0;
    
    private final static int POSITION_$URI = 1;
    
    private final static Logger LOGGER = ViatraQueryLoggingUtil.getLogger(RenameURIPackagePrecondition.Matcher.class);
    
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
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RenameURIPackagePrecondition.Match> getAllMatches(final TraceLink p$package, final String p$uri) {
      return rawGetAllMatches(new Object[]{p$package, p$uri});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public RenameURIPackagePrecondition.Match getOneArbitraryMatch(final TraceLink p$package, final String p$uri) {
      return rawGetOneArbitraryMatch(new Object[]{p$package, p$uri});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final TraceLink p$package, final String p$uri) {
      return rawHasMatch(new Object[]{p$package, p$uri});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final TraceLink p$package, final String p$uri) {
      return rawCountMatches(new Object[]{p$package, p$uri});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final TraceLink p$package, final String p$uri, final IMatchProcessor<? super RenameURIPackagePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{p$package, p$uri}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final TraceLink p$package, final String p$uri, final IMatchProcessor<? super RenameURIPackagePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{p$package, p$uri}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param p$package the fixed value of pattern parameter $package, or null if not bound.
     * @param p$uri the fixed value of pattern parameter $uri, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RenameURIPackagePrecondition.Match newMatch(final TraceLink p$package, final String p$uri) {
      return RenameURIPackagePrecondition.Match.newMatch(p$package, p$uri);
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
    public Set<TraceLink> getAllValuesOf$package(final RenameURIPackagePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$package(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<TraceLink> getAllValuesOf$package(final String p$uri) {
      return rawAccumulateAllValuesOf$package(new Object[]{
      null, 
      p$uri
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for $uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOf$uri(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_$URI, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for $uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$uri() {
      return rawAccumulateAllValuesOf$uri(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$uri(final RenameURIPackagePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOf$uri(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for $uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOf$uri(final TraceLink p$package) {
      return rawAccumulateAllValuesOf$uri(new Object[]{
      p$package, 
      null
      });
    }
    
    @Override
    protected RenameURIPackagePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return RenameURIPackagePrecondition.Match.newMatch((TraceLink) t.get(POSITION_$PACKAGE), (String) t.get(POSITION_$URI));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameURIPackagePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return RenameURIPackagePrecondition.Match.newMatch((TraceLink) match[POSITION_$PACKAGE], (String) match[POSITION_$URI]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameURIPackagePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RenameURIPackagePrecondition.Match.newMutableMatch((TraceLink) match[POSITION_$PACKAGE], (String) match[POSITION_$URI]);
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
    public static IQuerySpecification<RenameURIPackagePrecondition.Matcher> querySpecification() {
      return RenameURIPackagePrecondition.instance();
    }
  }
  
  /**
   * A match processor tailored for the se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements IMatchProcessor<RenameURIPackagePrecondition.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param p$package the value of pattern parameter $package in the currently processed match
     * @param p$uri the value of pattern parameter $uri in the currently processed match
     * 
     */
    public abstract void process(final TraceLink p$package, final String p$uri);
    
    @Override
    public void process(final RenameURIPackagePrecondition.Match match) {
      process(match.get$package(), match.get$uri());
    }
  }
  
  private RenameURIPackagePrecondition() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static RenameURIPackagePrecondition instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  @Override
  protected RenameURIPackagePrecondition.Matcher instantiate(final ViatraQueryEngine engine) {
    return RenameURIPackagePrecondition.Matcher.on(engine);
  }
  
  @Override
  public RenameURIPackagePrecondition.Matcher instantiate() {
    return RenameURIPackagePrecondition.Matcher.create();
  }
  
  @Override
  public RenameURIPackagePrecondition.Match newEmptyMatch() {
    return RenameURIPackagePrecondition.Match.newEmptyMatch();
  }
  
  @Override
  public RenameURIPackagePrecondition.Match newMatch(final Object... parameters) {
    return RenameURIPackagePrecondition.Match.newMatch((se.mdh.idt.benji.trace.TraceLink) parameters[0], (java.lang.String) parameters[1]);
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition (visibility: PUBLIC, simpleName: RenameURIPackagePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition (visibility: PUBLIC, simpleName: RenameURIPackagePrecondition, identifier: se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static RenameURIPackagePrecondition INSTANCE = new RenameURIPackagePrecondition();
    
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
    private final static RenameURIPackagePrecondition.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$package = new PParameter("$package", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$uri = new PParameter("$uri", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$package, parameter_p$uri);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$package","$uri");
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
          PVariable var_$uri = body.getOrCreateVariableByName("$uri");
          PVariable var_$package_uri = body.getOrCreateVariableByName("$package_uri");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_$uri), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$package, parameter_p$package),
             new ExportedParameter(body, var_$uri, parameter_p$uri)
          ));
          // 	find get_package_uri ($package, $package_uri)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$package, var_$package_uri), Get_package_uri.instance().getInternalQueryRepresentation());
          //  	$uri == eval("renamed_" + $package_uri)
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern RenameURIPackagePrecondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("$package_uri");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String $package_uri = (String) provider.getValue("$package_uri");
                  return evaluateExpression_1_1($package_uri);
              }
          },  var__virtual_0_ ); 
          new Equality(body, var_$uri, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final String $package_uri) {
    return ("renamed_" + $package_uri);
  }
}
