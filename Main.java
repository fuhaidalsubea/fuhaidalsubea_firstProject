public class Main {

	public static void main(String[] args) {
		DQueue<Character>[] dq = Expr.readExpressions("input/test.txt");
		for (int i = 0; i < dq.length && dq[i] != null; i++) {
			int size = dq[i].length();
			// import commnt about for loop
			for (int j = 0; j < size; j++) {
				char c = dq[i].removeFirst();
				dq[i].addLast(c);
				System.out.print(c);
			}
			System.out.println("= " + Expr.evaluateExpression(dq, i));
			System.out.println("Reversible: " + Expr.reversible(dq, i) + "\n");
		}
	}

}
