import java.util.*;

public class Squish {


	public static void main (String [] args) {
		double[] arr = {-100, -75, -50, 0, 50, 99, 100};
		for (int i = 0; i < arr.length; i++){
			System.out.println ("Input:" + arr[i] + " Out:" + squisher(arr[i]));
		}
	}

	public static double squisher (double input){
		return ((input+100) / 200);
	}
}