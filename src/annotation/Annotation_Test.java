package annotation;

import java.lang.reflect.Method;

public class Annotation_Test {

	   public static void main(String[] args) throws Exception {
	      int passed = 0, failed = 0;
	      
	      for (Method m : UsingSampleAnnotation.class.getMethods()) {
	         if (m.isAnnotationPresent(SampleAnnotation.class)) {
	            try {
	               passed++;
	            } catch (Throwable ex) {
	               System.out.printf("Test %s failed: %s %n", m, ex.getCause());
	               failed++;
	            }
	         }
	      }
	      System.out.printf("Passed: %d, Failed %d%n", passed, failed);
	   }
	}