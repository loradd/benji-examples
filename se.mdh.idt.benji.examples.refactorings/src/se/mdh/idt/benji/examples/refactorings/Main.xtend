package se.mdh.idt.benji.examples.refactorings

import se.mdh.idt.benji.examples.refactorings.metamodel.MetamodelPackage

import static se.mdh.idt.benji.benchmark.api.Benchmark.ALL
import static se.mdh.idt.benji.benchmark.api.BenchmarkFactory.benchmark
import static se.mdh.idt.benji.examples.refactorings.differences.Differences.*

class Main {
	
	// generate benchmark
	def static void main(String[] args) { 
		benchmark
			// metamodels
			.metamodel(MetamodelPackage.eINSTANCE)
			// models
			.model("resources/input/Input.xmi")
			// differences
			.difference(1, 1, mergeMetaclasses)
			// .difference(1, 1, splitReference)
			// .difference(1, 1, mergeReferences)
		.build.generate(ALL, "resources/output")
	}
	
}