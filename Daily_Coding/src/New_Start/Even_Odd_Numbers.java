package New_Start;

public class Even_Odd_Numbers {

	int start = 1;
	int end;

	public Even_Odd_Numbers(int end) {
		super();
		this.end = end;
	}

	public synchronized void printEven() {

		while (start < end) {

			if (start % 2 == 0) {
				try {
					wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

			System.out.println("The Odd : " + start);
			start++;
			notify();
		}

	}

	public synchronized void printOdd() {

		while (start < end) {

			if (start % 2 != 0) {
				try {
					wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}

			System.out.println("The Even : " + start);
			start++;
			notify();
		}

	}

}
