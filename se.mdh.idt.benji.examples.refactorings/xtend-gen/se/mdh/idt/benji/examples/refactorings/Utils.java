package se.mdh.idt.benji.examples.refactorings;

import java.util.Random;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class Utils {
  private final static Random packageIds = new Random();
  
  private final static Random classIds = new Random();
  
  @Pure
  public static String classId() {
    return Integer.valueOf(Utils.classIds.nextInt()).toString();
  }
  
  @Pure
  public static String packageId(final Package package_) {
    return Integer.valueOf(Utils.packageIds.nextInt()).toString();
  }
}
