package pl.sdacademy.lambda;

public class WithLambda {

	public WithLambda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ISumInt object = new ISumInt() {

			@Override
			public int sum(int n) {
				// TODO Auto-generated method stub
				return sum(n);
			}
		};
		int tmp = object.sum(5);
		System.out.println("sum = " + tmp);

	}

}
