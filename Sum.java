// https://www.w3resource.com/java-exercises/basic/index.php
// 2. Write a Java program to print the sum of two numbers.
// static - I do not need to create an object of this class.
public class Sum {
	public int sumoftwo(Integer first, Integer second) {
		return first + second;
	}

	public static void main(String[] args) {
		Sum a = new Sum();
		System.out.println(a.sumoftwo(1, 2));
		System.out.println(a.sumoftwo(3, 4));
		System.out.println(a.sumoftwo(1000, 9000));
	}
}
