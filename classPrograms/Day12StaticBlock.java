package classPrograms;

public class Day12StaticBlock {
	public static void main(String[] args) {
		StaticBlock s = new StaticBlock();
		s.met0();
		StaticBlock.met();
		System.out.println(StaticBlock.met2());
		StaticBlock.met();
		StaticBlock.met2();
		
		
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
		new StaticBlock();
	}
}

class StaticBlock{
	//static blocks are called,before the call to the static methods or object creation of the class
	static {
		System.out.println("static block is called...");
	}
	StaticBlock(){
		System.out.println("cons called....");
	}
	void met0() {
		System.out.println("static method0 called....");
	}
	static void met() {
		System.out.println("static method called....");
	}
	static int met2() {
		System.out.println("static method2 called....");
		return 5;
	}
}
