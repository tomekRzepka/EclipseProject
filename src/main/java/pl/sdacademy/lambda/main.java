package pl.sdacademy.lambda;

public class main {

	public main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		ISumInt object = new SumInt();
		int tmp = object.sum(5);
		System.out.println("sum = " + tmp);

	}

}
