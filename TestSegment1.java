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
}
