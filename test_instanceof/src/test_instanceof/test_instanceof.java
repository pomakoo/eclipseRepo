package test_instanceof;

class A {
	 
}
 
class B extends A {
 
}
 
class C {
 
}

public class test_instanceof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		C c = new C();
		Object Oc = new C();
		Object Od = a;
		
		 
		System.out.println("a instanceof A = " + (a instanceof A)); // t
		System.out.println("b instanceof B = " + (b instanceof B)); // t
		System.out.println("b instanceof A = " + (b instanceof A)); // t
		System.out.println("c instanceof C = " + (c instanceof C)); // t
		System.out.println("Oc instanceof A = " + (Oc instanceof A)); // f
		System.out.println("Oc instanceof B = " + (Oc instanceof B)); // f
		System.out.println("Oc instanceof C = " + (Oc instanceof C)); // t
		System.out.println("Od instanceof A = " + (Od instanceof A)); // t
		System.out.println("Od instanceof B = " + (Od instanceof B)); // t
		System.out.println("Od instanceof C = " + (Od instanceof C)); // f

	}

}
