/**
 * Generated from platform:/resource/se.mdh.idt.benji.examples.refactorings/src/se/mdh/idt/benji/examples/refactorings/Queries.vql
 */
package se.mdh.idt.benji.examples.refactorings.internal;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecificationWithGenericMatcher;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import se.mdh.idt.benji.examples.refactorings.internal.Create_class_reference;
import se.mdh.idt.benji.examples.refactorings.internal.Delete_class_reference;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_name;
import se.mdh.idt.benji.examples.refactorings.internal.Merge_reference_type;

/**
 * A pattern-specific query specification that can instantiate GenericPatternMatcher in a type-safe way.
 * 
 * @see GenericPatternMatcher
 * @see GenericPatternMatch
 * 
 */
@SuppressWarnings("all")
@Generated(value = "org.eclipse.xtext.xbase.compiler.JvmModelGenerator", date = "2018-03-25T16:20+0200")
public final class Merge_class_reference extends BaseGeneratedEMFQuerySpecificationWithGenericMatcher {
  private Merge_class_reference() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Merge_class_reference instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }
  
  /**
   * Inner class allowing the singleton instance of {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference (visibility: PUBLIC, simpleName: Merge_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.internal) (interface: false, strictFloatingPoint: false, anonymous: false)} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link JvmGenericType: se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference (visibility: PUBLIC, simpleName: Merge_class_reference, identifier: se.mdh.idt.benji.examples.refactorings.internal.Merge_class_reference, deprecated: <unset>) (abstract: false, static: false, final: true, packageName: se.mdh.idt.benji.examples.refactorings.internal) (interface: false, strictFloatingPoint: false, anonymous: false)#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private final static Merge_class_reference INSTANCE = new Merge_class_reference();
    
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
    private final static Merge_class_reference.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    private final PParameter parameter_p$left_class = new PParameter("$left_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$right_class = new PParameter("$right_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$left_reference = new PParameter("$left_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$right_reference = new PParameter("$right_reference", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final PParameter parameter_p$target_class = new PParameter("$target_class", "se.mdh.idt.benji.trace.TraceLink", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")), PParameterDirection.INOUT);
    
    private final List<PParameter> parameters = Arrays.asList(parameter_p$left_class, parameter_p$right_class, parameter_p$left_reference, parameter_p$right_reference, parameter_p$target_class);
    
    private GeneratedPQuery() {
      super(PVisibility.PRIVATE);
    }
    
    @Override
    public String getFullyQualifiedName() {
      return "se.mdh.idt.benji.examples.refactorings.merge_class_reference";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("$left_class","$right_class","$left_reference","$right_reference","$target_class");
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
          PVariable var_$left_class = body.getOrCreateVariableByName("$left_class");
          PVariable var_$right_class = body.getOrCreateVariableByName("$right_class");
          PVariable var_$left_reference = body.getOrCreateVariableByName("$left_reference");
          PVariable var_$right_reference = body.getOrCreateVariableByName("$right_reference");
          PVariable var_$target_class = body.getOrCreateVariableByName("$target_class");
          PVariable var_$target_reference = body.getOrCreateVariableByName("$target_reference");
          new TypeConstraint(body, Tuples.flatTupleOf(var_$left_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$right_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$left_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$right_reference), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_$target_class), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.mdh.se/idt/benji/trace/Trace", "TraceLink")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_$left_class, parameter_p$left_class),
             new ExportedParameter(body, var_$right_class, parameter_p$right_class),
             new ExportedParameter(body, var_$left_reference, parameter_p$left_reference),
             new ExportedParameter(body, var_$right_reference, parameter_p$right_reference),
             new ExportedParameter(body, var_$target_class, parameter_p$target_class)
          ));
          // 	find create_class_reference ($target_class, $target_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$target_class, var_$target_reference), Create_class_reference.instance().getInternalQueryRepresentation());
          // 	find merge_reference_name ($left_reference, $right_reference, $target_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$left_reference, var_$right_reference, var_$target_reference), Merge_reference_name.instance().getInternalQueryRepresentation());
          // 	find merge_reference_type ($left_reference, $right_reference, $target_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$left_reference, var_$right_reference, var_$target_reference), Merge_reference_type.instance().getInternalQueryRepresentation());
          // 	find delete_class_reference ($left_class, $left_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$left_class, var_$left_reference), Delete_class_reference.instance().getInternalQueryRepresentation());
          // 	find delete_class_reference ($right_class, $right_reference)
          new PositivePatternCall(body, Tuples.flatTupleOf(var_$right_class, var_$right_reference), Delete_class_reference.instance().getInternalQueryRepresentation());
          bodies.add(body);
      }
      return bodies;
    }
  }
}
