package se.mdh.idt.benji.examples.refactorings

import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage

import static se.mdh.idt.benji.benchmark.api.Benchmark.ALL
import static se.mdh.idt.benji.benchmark.api.BenchmarkFactory.benchmark
import static se.mdh.idt.benji.examples.refactorings.Differences.*

class Main {
	
	def static void main(String[] args) { 
		benchmark
			.metamodel(SimplecorePackage.eINSTANCE)
			// .metamodel(WordnetPackage.eINSTANCE)
			.model("resources/input/Input.xmi")
			// .model("resources/input/Domain.xmi")
			.difference(0, 1, renamePackage)
//			.difference(1, 4, renamePackageWithSynonym)
			.difference(0, 1, renameURIPackage)
			.difference(0, 1, deletePackage)
			.difference(0, 1, addPackage)
			.difference(0, 1, addClass)
			.difference(0, 1, renameClass)
			.difference(0, 1, deleteClass)
			.difference(0, 1, extractClass)
			.difference(0, 1, addAttribute)
			.difference(0, 1, deleteAttribute)
			.difference(0, 1, changeAttributeType)
			.difference(0, 1, addReference)
			.difference(0, 1, deleteReference)
			.difference(0, 1, changeReferenceType)
			.difference(0, 1, extractSuperclass)
			.difference(0, 1, changeClassAbstract)
			.difference(0, 1, pushDownAttribute)
		.build.generate(ALL, "resources/output")
	}
	
}