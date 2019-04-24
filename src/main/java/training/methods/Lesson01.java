package training.methods;

public class Lesson01 {

	public static void main(String[] args) {
			
	}

	
	
}

class B {
	void y(){
		this.z();
	}
	static void z(){
		System.out.println("z");
	}
}

class A {
	public static void  main(String[] args){
		new A().x();
	}
	static void x(){
		new B().y();
	}
}
