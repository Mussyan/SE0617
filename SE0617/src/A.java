
public class A {
	public static void main(String argv[]) {
		B classB = new B();
		C classC = new C();
		System.out.println("This is Class A that version 1!");
		classB.versionB();
		classC.versionC();
		classC.showHistory();
	}
}
