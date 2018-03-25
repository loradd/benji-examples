package se.mdh.idt.benji.examples.refactorings

import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage

import static se.mdh.idt.benji.benchmark.api.Benchmark.ALL
import static se.mdh.idt.benji.benchmark.api.BenchmarkFactory.benchmark
import static se.mdh.idt.benji.examples.refactorings.Differences.*

class Main {
	
	// generate benchmark
	def static void main(String[] args) { 
		benchmark
			// metamodels
			.metamodel(MetamodelPackage.eINSTANCE)
			// models
			.model("resources/input/Input.xmi")
			// differences
 			.difference(0, 3, renamePackage)
			.difference(0, 4, renameClass)
			.difference(0, 3, restrictReference)
			.difference(0, 2, pushDownAttribute)
		.build.generate(ALL, "resources/output")
	}
	
}