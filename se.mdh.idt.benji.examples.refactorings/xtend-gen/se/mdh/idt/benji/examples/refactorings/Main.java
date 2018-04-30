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
      BenchmarkFactory.benchmark().metamodel(SimplecorePackage.eINSTANCE).model("resources/input/Input.xmi").difference(0, 1, Differences.renamePackage).difference(0, 1, Differences.renameURIPackage).difference(0, 1, Differences.deletePackage).difference(0, 1, Differences.addPackage).difference(0, 1, Differences.addClass).difference(0, 1, Differences.renameClass).difference(0, 1, Differences.deleteClass).difference(0, 1, Differences.extractClass).difference(0, 1, Differences.addAttribute).difference(0, 1, Differences.deleteAttribute).difference(0, 1, Differences.changeAttributeType).difference(0, 1, Differences.addReference).difference(0, 1, Differences.deleteReference).difference(0, 1, Differences.changeReferenceType).difference(0, 1, Differences.extractSuperclass).difference(0, 1, Differences.changeClassAbstract).difference(0, 1, Differences.pushDownAttribute).build().generate(Benchmark.ALL, "resources/output");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
