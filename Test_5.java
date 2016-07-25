//operators/PassObject.java
//Passing objects to methods may not be
//what you're used to.

class Letter{
	char c;
}


public class Test_5 {

	static void f(Letter y){
		y.c =  'z';
	}
	
	public static void main(String[] args){
		
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1:x.c:"+x.c);
		f(x);
		System.out.print("2:x.c:"+x.c);
		
	}
	
}/*Output:
1:x.c:a
2:x.c:z
在许多编程语言中，方法f（）似乎要在它的作用域内复制其参数Letter y的一个副本，但实际上只是传递了一个引用。
*///:~
