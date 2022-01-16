// https://www.w3resource.com/java-exercises/basic/index.php
// 3. Write a Java program to divide two numbers and print on the screen.
public class Divide {
	public int dividetwonumbers(Integer first, Integer second) {
		return first / second;
	}

	public static void main(String[] args) {
		Divide a = new Divide();
		System.out.println(a.dividetwonumbers(50, 3));
		System.out.println(a.dividetwonumbers(100, 2));
		System.out.println(a.dividetwonumbers(5, 3));
	}
}