package pl.sdacademy.lambda;

public class MainWithLambda {

	public MainWithLambda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ISumInt object = (n) -> SumInt.calculateSum(n);
		// {
		// int sum = 0;
		// for (int i = 0; i < n; i++) {
		// sum += i;
		//
		// }
		// return sum;
		//
		// };

		int tmp = object.sum(5);
		System.out.println("sum = " + tmp);

	}

}
