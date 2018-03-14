package lesson24.innerClas;

import lesson24.innerClas.innerclass.Human;

public class HasAnonim {
    public static void main(String[] args) {
	Human h = new Human() {
	    @SuppressWarnings("unused")
	    private boolean isDurak; //пользы нет
	};
	System.out.println(h);
	
	Animal a = new Animal() {

	    @Override
	    public void sayHello() {
		System.out.println("Fuck-Fuck");
	    }
	};
	a.sayHello();
    }
}
