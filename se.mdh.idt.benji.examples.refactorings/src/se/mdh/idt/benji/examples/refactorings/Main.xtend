package se.mdh.idt.benji.examples.refactorings

import se.mdh.idt.benji.examples.refactorings.simplecore.SimplecorePackage

import static se.mdh.idt.benji.benchmark.api.Benchmark.ALL
import static se.mdh.idt.benji.benchmark.api.BenchmarkFactory.benchmark
import static se.mdh.idt.benji.examples.refactorings.Differences.*

class Main {
	
	def static void main(String[] args) { 
		benchmark
			.metamodel(SimplecorePackage.eINSTANCE)
			.model("resources/input/Input.xmi")
			.difference(0, 1, renamePackage)
			.difference(0, 1, renamePackageUri)
//			.difference(0, 0, deletePackage)
			.difference(0, 5, addPackage)
			.difference(0, 5, addClass)
			.difference(0, 2, renameClass)
//			.difference(0, 0, deleteClass)
//			.difference(0, 0, extractClass)
//			.difference(0, 0, addAttribute)
//			.difference(0, 0, deleteAttribute)
//			.difference(0, 0, changeAttributeType)
//			.difference(0, 0, addReference)
//			.difference(0, 0, deleteReference)
//			.difference(0, 0, changeReferenceType)
//			.difference(0, 0, extractSuperclass)
//			.difference(0, 0, changeClassAbstract)
			.difference(1, 1, pushDownAttribute)
		.build.generate(ALL, "resources/output")
	}
	
}