//:operators/Assignment.java
//Assignment with Objects is a bit tricky.

class Tank{
	
	int level;
	
}

public class Test_4 {

	public static void main(String[] args){
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		t1.level = 9;
		t2.level = 41;
		System.out.println("1: t1.level: "+t1.level+",t2.level:"+t2.level);
		t1 = t2;
		System.out.println("2: t1.level: "+t1.level+",t2.level:"+t2.level);
		t1.level = 27;
		System.out.println("3: t1.level: "+t1.level+",t2.level:"+t2.level);
	}
	
}/*Output:
1: t1.level: 9,t2.level:41
2: t1.level: 41,t2.level:41
3: t1.level: 27,t2.level:27
*///:~