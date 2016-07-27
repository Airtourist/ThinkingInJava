import java.util.Random;

//:operator/Exponents.java
// "e" means "10 to the power"

public class Test12 {
	public static void main(String[] args){
		//Ecase e = new Ecase();
		//e.E();
		//URShift Ur = new URShift();
		//Ur.urs();
//		BitManipulation bm = new BitManipulation();
//		bm.BMp();
//		StringOperators so = new StringOperators();
//		so.SO();
//		Casting ca = new Casting();
//		ca.Cas();
		IfElse ie = new IfElse();
		ie.IE();
	}
}

class Ecase{
	public void E(){
		//Uppercase and lowercase e are the same:
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double expDouble = 47e47d;
		double expDouble2 = 47e47;
		System.out.println(expDouble);
	}
}


class URShift{
	public void urs(){
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		i>>>=10;
		System.out.println(Integer.toBinaryString(i));
		long l = -1;
		System.out.println(Long.toBinaryString(l));
		l>>>=10;
		System.out.println(Long.toBinaryString(l));
		short s = 1;
		System.out.println(Integer.toBinaryString(s));
		s>>>=10;
		System.out.println(Integer.toBinaryString(s));
		byte b = -1;
		System.out.println(Integer.toBinaryString(b));
		b>>>=10;
		System.out.println(Integer.toBinaryString(b));
		b=-1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b>>>10));
	}
}

class BitManipulation{
	public void BMp(){
		Random rand  = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();
		printBinaryInt("-1",-1);
		printBinaryInt("+1",+1);
		int maxpos = 2147483647;
		printBinaryInt("maxpos",maxpos);
		int maxneg = -2147483648;
		printBinaryInt("maxneg",maxneg);
		printBinaryInt("i",i);
		printBinaryInt("-i",-i);
		printBinaryInt("~i",~i);
		printBinaryInt("j",j);
		printBinaryInt("-j",-j);
		printBinaryInt("i&j",i&j);
		printBinaryInt("i|j",i|j);
		printBinaryInt("i^j",i^j);
		printBinaryInt("i<<5",i<<5);
		printBinaryInt("i>>5",i>>5);
		printBinaryInt("(~i)>>5",(~i)>>5);
		printBinaryInt("i>>>5",i>>>5);
		printBinaryInt("(~i)>>>5",(-i)>>>5);
		long l = rand.nextLong();
		long m = rand.nextLong();
		printBinaryLong("-1L",-1L);
		printBinaryLong("+1L",+1L);
		long ll = 9223372036854775807L;
		printBinaryLong("maxpos",ll);
		long lln = -9223372036854775808L;
		printBinaryLong("maxneg",lln);
		printBinaryLong("l",l);
		printBinaryLong("~l",~l);
		printBinaryLong("-l",-l);
		printBinaryLong("m",m);
		printBinaryLong("l&m",l&m);
		printBinaryLong("l^m",l^m);
		printBinaryLong("l<<5",l<<5);
		printBinaryLong("l>>5",l>>5);
		printBinaryLong("(~l)>>5",(~l)>>5);
		printBinaryLong("l>>>5",l>>>5);
		printBinaryLong("(~l)>>>5",(~l)>>>5);
	}
	static void printBinaryInt(String s, int i){
		System.out.println(s+". int: "+i+", binary:\n    "+Integer.toBinaryString(i));
	}
	static void printBinaryLong(String s,long l){
		System.out.println(s+",long: "+l+", binary:\n    "+Long.toBinaryString(l));
	}
}

class TernaryIfElse{
	static int ternary(int i){
		return i<10?i*100:i*10;
	}
	static int standardIfElse(int i){
		if(i<10)
			return i*100;
		else
			return i*10;
	}
}


class StringOperators{
	public void SO(){
		int x = 0, y=1, z=2;
		String s="x,y,z ";
		System.out.println(s+x+y+z);
		System.out.println(x+" "+s);//Converts x to a String
		s+="(summed) = ";//Concatenation operator
		System.out.println(s+(x+y+z));
		System.out.println(""+x);
	}
}

class Casting{
	public void Cas(){
		int i = 200;
		long lng = (long)i;
		lng = i;
		long lng2 = (long)200;
		lng2 = 200;
		i = (int)lng2;
	}
}


//截尾
//都为0
class CastingNumbers{
	public void CN(){
		double above = 0.7,below = 0.4;
		float fabove = 0.7f,fbelow = 0.4f;
		System.out.println("(int)above: "+(int)above);
		System.out.println("(int)below: "+(int)below);
		System.out.println("(int)fabove: "+(int)fabove);
		System.out.println("(int)fbelow: "+(int)fbelow);
	}
}

//如果想得到舍入的效果，就需要用到round
class RoundingNumbers{
	public void RN(){
		double above = 0.7,below = 0.4;
		float fabove = 0.7f,fbelow = 0.4f;
		System.out.println("Math.roud(above): "+Math.round(above));
		System.out.println("Math.roud(below): "+Math.round(below));
		System.out.println("Math.roud(fabove): "+Math.round(fabove));
		System.out.println("Math.roud(fbelow): "+Math.round(fbelow));
	}
}

class Allops{
	void f(boolean b){}
	void boolTest(boolean x,boolean y){
		f(x==y);
		f(x!=y);
		f(!y);
		x=x&&y;
		x=x||y;
		x = x&y;
		x = x|y;
		x = x^y;
		x&=y;
		x^=y;
		x|=y;
	}
	void charTest(char x,char y){
		x = (char)(x*y);
		x = (char)(x/y);
		x = (char)(x%y);
		x = (char)(x+y);
		x = (char)(x-y);
		x++;
		x--;
		x = (char)+y;
		x = (char)-y;
	}
}

class IfElse{
	static int result = 0;
	static void test(int testval,int target){
		if(testval>target){
			result=+1;
		}else if(testval<target)
			result=-1;
		else
			result = 0;
	}
	public void IE(){
		test(10,5);
		System.out.println(result);
		test(5,10);
		System.out.println(result);
		test(5,5);
		System.out.println(result);
	}
}

class WhileTest{
	
}