package se.mdh.idt.benji.examples.refactorings;

import org.eclipse.xtext.xbase.lib.Exceptions;
import se.mdh.idt.benji.benchmark.api.Benchmark;
import se.mdh.idt.benji.benchmark.api.BenchmarkFactory;
import se.mdh.idt.benji.examples.refactorings.Differences;
import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    try {
      BenchmarkFactory.benchmark().metamodel(SimplecorePackage.eINSTANCE).model("resources/input/Input.xmi").difference(0, 1, Differences.renamePackage).difference(0, 1, Differences.renamePackageUri).difference(0, 5, Differences.addPackage).difference(0, 5, Differences.addClass).difference(0, 2, Differences.renameClass).difference(1, 1, Differences.pushDownAttribute).build().generate(Benchmark.ALL, "resources/output");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
