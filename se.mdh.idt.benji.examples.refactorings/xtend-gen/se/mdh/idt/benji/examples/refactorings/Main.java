package se.mdh.idt.benji.examples.refactorings;

import org.eclipse.xtext.xbase.lib.Exceptions;
import se.mdh.idt.benji.benchmark.api.Benchmark;
import se.mdh.idt.benji.benchmark.api.BenchmarkFactory;
import se.mdh.idt.benji.examples.refactorings.differences.Differences;
import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    try {
      BenchmarkFactory.benchmark().metamodel(MetamodelPackage.eINSTANCE).model("resources/input/Input.xmi").difference(1, 1, Differences.mergeMetaclasses).build().generate(Benchmark.ALL, "resources/output");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
