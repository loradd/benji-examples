/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings;

import java.io.File;
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
import se.mdh.idt.benji.examples.refactorings.simplecore.patterns.Preserved_package_uri;
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
    private Trace fPackage;
    
    private String fUri;
    
    private static List<String> parameterNames = makeImmutableList("package", "uri");
    
    private Match(final Trace pPackage, final String pUri) {
      this.fPackage = pPackage;
      this.fUri = pUri;
    }
    
    @Override
    public Object get(final String parameterName) {
      if ("package".equals(parameterName)) return this.fPackage;
      if ("uri".equals(parameterName)) return this.fUri;
      return null;
    }
    
    public Trace getPackage() {
      return this.fPackage;
    }
    
    public String getUri() {
      return this.fUri;
    }
    
    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("package".equals(parameterName) ) {
          this.fPackage = (Trace) newValue;
          return true;
      }
      if ("uri".equals(parameterName) ) {
          this.fUri = (String) newValue;
          return true;
      }
      return false;
    }
    
    public void setPackage(final Trace pPackage) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPackage = pPackage;
    }
    
    public void setUri(final String pUri) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fUri = pUri;
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
      return new Object[]{fPackage, fUri};
    }
    
    @Override
    public RenameURIPackagePrecondition.Match toImmutable() {
      return isMutable() ? newMatch(fPackage, fUri) : this;
    }
    
    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"package\"=" + prettyPrintValue(fPackage) + ", ");
      result.append("\"uri\"=" + prettyPrintValue(fUri));
      return result.toString();
    }
    
    @Override
    public int hashCode() {
      return Objects.hash (fPackage, fUri);
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
          return Objects.equals(fPackage, other.fPackage) && Objects.equals(fUri, other.fUri);
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static RenameURIPackagePrecondition.Match newMutableMatch(final Trace pPackage, final String pUri) {
      return new Mutable(pPackage, pUri);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static RenameURIPackagePrecondition.Match newMatch(final Trace pPackage, final String pUri) {
      return new Immutable(pPackage, pUri);
    }
    
    private static final class Mutable extends RenameURIPackagePrecondition.Match {
      Mutable(final Trace pPackage, final String pUri) {
        super(pPackage, pUri);
      }
      
      @Override
      public boolean isMutable() {
        return true;
      }
    }
    
    private static final class Immutable extends RenameURIPackagePrecondition.Match {
      Immutable(final Trace pPackage, final String pUri) {
        super(pPackage, pUri);
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
   * // ACP2 - RenameURIPackage - Precondition
   * pattern RenameURIPackagePrecondition (^package : Trace, uri : java String) {
   * 	find preserved_package_uri (^package, initial_uri);
   * 	uri == eval(initial_uri + File.separator + 'Changed'); 
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
    
    private final static int POSITION_PACKAGE = 0;
    
    private final static int POSITION_URI = 1;
    
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
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<RenameURIPackagePrecondition.Match> getAllMatches(final Trace pPackage, final String pUri) {
      return rawGetAllMatches(new Object[]{pPackage, pUri});
    }
    
    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public RenameURIPackagePrecondition.Match getOneArbitraryMatch(final Trace pPackage, final String pUri) {
      return rawGetOneArbitraryMatch(new Object[]{pPackage, pUri});
    }
    
    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Trace pPackage, final String pUri) {
      return rawHasMatch(new Object[]{pPackage, pUri});
    }
    
    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Trace pPackage, final String pUri) {
      return rawCountMatches(new Object[]{pPackage, pUri});
    }
    
    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Trace pPackage, final String pUri, final IMatchProcessor<? super RenameURIPackagePrecondition.Match> processor) {
      rawForEachMatch(new Object[]{pPackage, pUri}, processor);
    }
    
    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Trace pPackage, final String pUri, final IMatchProcessor<? super RenameURIPackagePrecondition.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pPackage, pUri}, processor);
    }
    
    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pPackage the fixed value of pattern parameter package, or null if not bound.
     * @param pUri the fixed value of pattern parameter uri, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public RenameURIPackagePrecondition.Match newMatch(final Trace pPackage, final String pUri) {
      return RenameURIPackagePrecondition.Match.newMatch(pPackage, pUri);
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
    public Set<Trace> getAllValuesOfpackage(final RenameURIPackagePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfpackage(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for package.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Trace> getAllValuesOfpackage(final String pUri) {
      return rawAccumulateAllValuesOfpackage(new Object[]{
      null, 
      pUri
      });
    }
    
    /**
     * Retrieve the set of values that occur in matches for uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Set<String> rawAccumulateAllValuesOfuri(final Object[] parameters) {
      Set<String> results = new HashSet<String>();
      rawAccumulateAllValues(POSITION_URI, parameters, results);
      return results;
    }
    
    /**
     * Retrieve the set of values that occur in matches for uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuri() {
      return rawAccumulateAllValuesOfuri(emptyArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuri(final RenameURIPackagePrecondition.Match partialMatch) {
      return rawAccumulateAllValuesOfuri(partialMatch.toArray());
    }
    
    /**
     * Retrieve the set of values that occur in matches for uri.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<String> getAllValuesOfuri(final Trace pPackage) {
      return rawAccumulateAllValuesOfuri(new Object[]{
      pPackage, 
      null
      });
    }
    
    @Override
    protected RenameURIPackagePrecondition.Match tupleToMatch(final Tuple t) {
      try {
          return RenameURIPackagePrecondition.Match.newMatch((Trace) t.get(POSITION_PACKAGE), (String) t.get(POSITION_URI));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameURIPackagePrecondition.Match arrayToMatch(final Object[] match) {
      try {
          return RenameURIPackagePrecondition.Match.newMatch((Trace) match[POSITION_PACKAGE], (String) match[POSITION_URI]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }
    
    @Override
    protected RenameURIPackagePrecondition.Match arrayToMatchMutable(final Object[] match) {
      try {
          return RenameURIPackagePrecondition.Match.newMutableMatch((Trace) match[POSITION_PACKAGE], (String) match[POSITION_URI]);
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
     * @param pPackage the value of pattern parameter package in the currently processed match
     * @param pUri the value of pattern parameter uri in the currently processed match
     * 
     */
    public abstract void process(final Trace pPackage, final String pUri);
    
    @Override
    public void process(final RenameURIPackagePrecondition.Match match) {
      process(match.getPackage(), match.getUri());
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
    return RenameURIPackagePrecondition.Match.newMatch((se.mdh.idt.benji.trace.Trace) parameters[0], (java.lang.String) parameters[1]);
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
    
    private final PParameter parameter_pPackage = new PParameter("package", "se.mdh.idt.benji.trace.Trace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "Trace")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pUri = new PParameter("uri", "java.lang.String", new JavaTransitiveInstancesKey(java.lang.String.class), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pPackage, parameter_pUri);
    
    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.RenameURIPackagePrecondition";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("package","uri");
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
          PVariable var_uri = body.getOrCreateVariableByName("uri");
          PVariable var_initial_uri = body.getOrCreateVariableByName("initial_uri");
          new TypeConstraint(body, Tuples.flatTupleOf(var_package), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "Trace")));
          new TypeFilterConstraint(body, Tuples.flatTupleOf(var_uri), new JavaTransitiveInstancesKey(java.lang.String.class));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_package, parameter_pPackage),
             new ExportedParameter(body, var_uri, parameter_pUri)
          ));
          // 	find preserved_package_uri (^package, initial_uri)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_package, var_initial_uri), Preserved_package_uri.instance().getInternalQueryRepresentation());
          // 	uri == eval(initial_uri + File.separator + 'Changed')
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern RenameURIPackagePrecondition";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("initial_uri");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  String initial_uri = (String) provider.getValue("initial_uri");
                  return evaluateExpression_1_1(initial_uri);
              }
          },  var__virtual_0_ ); 
          new Equality(body, var_uri, var__virtual_0_);
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static String evaluateExpression_1_1(final String initial_uri) {
    return ((initial_uri + File.separator) + "Changed");
  }
}
