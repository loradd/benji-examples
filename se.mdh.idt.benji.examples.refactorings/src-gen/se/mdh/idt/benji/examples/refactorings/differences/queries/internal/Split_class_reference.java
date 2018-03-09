/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/differences/queries/SplitReference.vql
 */
package se.mdh.idt.benji.examples.refactorings.differences.queries.internal;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator;
import org.eclipse.viatra.query.runtime.matchers.psystem.IValueProvider;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Added_class_reference_typed_weak;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Class_subClass;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Preserved_class;
import se.mdh.idt.benji.examples.refactorings.metamodel.queries.Removed_class_reference_typed;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-09T17:34+0100")
public final class Split_class_reference extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private Split_class_reference() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Split_class_reference instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.internal.Split_class_reference (visibility: PUBLIC, simpleName: Split_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.internal.Split_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.differences.queries.internal.Split_class_reference (visibility: PUBLIC, simpleName: Split_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.differences.queries.internal.Split_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.differences.queries.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Split_class_reference INSTANCE = new Split_class_reference();
    
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
    private final static Split_class_reference.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_pInitial_class = new PParameter("initial_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pCurrent_class = new PParameter("current_class", "se.mdh.idt.benji.examples.refactorings.metamodel.Class", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Class")), PParameterDirection.INOUT);
    
    private final PParameter parameter_pInitial_reference = new PParameter("initial_reference", "se.mdh.idt.benji.examples.refactorings.metamodel.Reference", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_pInitial_class, parameter_pCurrent_class, parameter_pInitial_reference);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.differences.queries.split_class_reference";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("initial_class","current_class","initial_reference");
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
          PVariable var_initial_class = body.getOrCreateVariableByName("initial_class");
          PVariable var_current_class = body.getOrCreateVariableByName("current_class");
          PVariable var_initial_reference = body.getOrCreateVariableByName("initial_reference");
          PVariable var_initial_type = body.getOrCreateVariableByName("initial_type");
          PVariable var_current_type = body.getOrCreateVariableByName("current_type");
          PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
          PVariable var_type_references = body.getOrCreateVariableByName("type_references");
          PVariable var___1_ = body.getOrCreateVariableByName("_<1>");
          PVariable var_type_subTypes = body.getOrCreateVariableByName("type_subTypes");
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_current_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Class")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_initial_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/examples/refactorings/Metamodel", "Reference")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_initial_class, parameter_pInitial_class),
             new ExportedParameter(body, var_current_class, parameter_pCurrent_class),
             new ExportedParameter(body, var_initial_reference, parameter_pInitial_reference)
          ));
          // 	find removed_class_reference_typed (initial_class, current_class, initial_reference, initial_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var_initial_reference, var_initial_type), Removed_class_reference_typed.instance().getInternalQueryRepresentation());
          //  	find preserved_class (initial_type, current_type)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_initial_type, var_current_type), Preserved_class.instance().getInternalQueryRepresentation());
          //  	count find added_class_reference_typed_weak (initial_class, current_class, _, current_type) == type_references
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_initial_class, var_current_class, var___0_, var_current_type), Added_class_reference_typed_weak.instance().getInternalQueryRepresentation(), var__virtual_0_);
          new Equality(body, var__virtual_0_, var_type_references);
          // 	count find class_subClass (current_type, _) == type_subTypes
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new PatternMatchCounter(body, Tuples.flatTupleOf(var_current_type, var___1_), Class_subClass.instance().getInternalQueryRepresentation(), var__virtual_1_);
          new Equality(body, var__virtual_1_, var_type_subTypes);
          //  	check (type_references == type_subTypes)
          new ExpressionEvaluation(body, new IExpressionEvaluator() {
          
              @Override
              public String getShortDescription() {
                  return "Expression evaluation from pattern split_class_reference";
              }
              
              @Override
              public Iterable<String> getInputParameterNames() {
                  return Arrays.asList("type_references", "type_subTypes");}
          
              @Override
              public Object evaluateExpression(IValueProvider provider) throws Exception {
                  Integer type_references = (Integer) provider.getValue("type_references");
                  Integer type_subTypes = (Integer) provider.getValue("type_subTypes");
                  return evaluateExpression_1_1(type_references, type_subTypes);
              }
          },  null); 
          bodies.add(body);
      }
      return bodies;
    }
  }
  
  private static boolean evaluateExpression_1_1(final Integer type_references, final Integer type_subTypes) {
    boolean _equals = Objects.equal(type_references, type_subTypes);
    return _equals;
  }
}
