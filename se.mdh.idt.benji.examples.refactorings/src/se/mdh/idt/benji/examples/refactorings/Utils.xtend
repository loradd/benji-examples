package se.mdh.idt.benji.examples.refactorings

import java.util.Random

class Utils {
	
	static val packageIds = new Random
	static val classIds = new Random
		
	@Pure
	def static String classId () {
		classIds.nextInt.toString
	}
	
	@Pure
	def static String packageId (Package ^package) {
		packageIds.nextInt.toString
	}
	
	
}