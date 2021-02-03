import org.junit.runner.JUnitCore; 
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class test1{

public static void main(String[] args){
	System.out.println(bar(1.9f, 2.3f));
}

public static boolean bar(float a, float b){

	float c = 0.00001f;
	boolean is_valid = false;

	if ((a < c) && (b < c)){
		is_valid = true;		
	}
	return is_valid; }
	Result result = JUnitCore.runClasses(JunitTester.class); 
	for (Failure failure : result.getFailures()) 
	{
		System.out.println(failure.toString());
	}
		System.out.println(result.wasSuccessful());
}
