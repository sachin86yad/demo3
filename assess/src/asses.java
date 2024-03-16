
public class asses {
  void meth(){
	  System.out.println();
  }
}
class asses1 extends asses{
	void meth(){
		System.out.println("Overriding");
	}

public static void main(String[]args ){
	System.out.println("Hello world");
	asses1 a = new asses1();
	System.out.println("Overriding");
}
}
