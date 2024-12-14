import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.print("Enter divisor : ");
		x = sc.nextInt();
		System.out.print("Enter divider : ");
		y = sc.nextInt();
		try {
			System.out.println("Quotient is: " + x / y);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("No matter what it will be but finally will always run whether there any exception occurse or not!");
		}
	}
}
