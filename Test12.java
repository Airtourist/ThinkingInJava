import java.util.Arrays;
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
//		IfElse ie = new IfElse();
//		ie.IE();
//		WhileTest wt = new WhileTest();
//		wt.condition();
//		wt.WT();
//		ForEachFloat fef = new ForEachFloat();
//		fef.FEF();
//		ForEachString fes = new ForEachString();
//		fes.FES();
//		LabeledFor lf =  new LabeledFor();
//		lf.LF();
//		VowelsAndConsonants vac = new VowelsAndConsonants();
//		vac.VAC();
//		Book novel = new Book(true);
//		novel.CheckIn();
//		new Book(true);
//		System.gc();
//		InitialValues iv = new InitialValues();
//		iv.printInitialValues();
//		System.out.println("Creating new Cupboard() in main");
//		new Cupboard();
//		System.out.println("Creating new Cupboard() in main");
//		new Cupboard();
//		table.f2(1);
//		cupboard.f3(1);
//		Cups cu = new Cups();
//		cu.cup1.f(1);
//		Mug mug1 = new Mug(1);
//		System.out.println("Inside main()");
//		new Mugs();
//		System.out.println("new Mugs() completed");
//		new Mugs(1);
//		System.out.println("new Mugs(1) completed");
//		
//		ArraysOfPrimitives aop = new ArraysOfPrimitives();
//		aop.AOP();
		
//		ArrayNew an =  new ArrayNew();
//		an.AN();
//	
//		ArrayClassObj aco = new ArrayClassObj();
//		aco.ACO();
		
//		ArrayInit ai  = new ArrayInit();
//		ai.AI();
//	
//		Other.main(new String[]{"fiddle","de","dum"});
		
		
//		VarArgs.main(args);
		
//		NewVarArgs.main(args);
		
//		OptionalTrailingArguments.main(args);
		
//		VarargType.main(args);
		
//		OverloadingVarargs.main(args);
		
//		SimpleEnumUse.main(args);
		
		EnumOrder.main(args);
		
	}
//	static Table table = new Table();
//	static Cupboard cupboard = new Cupboard();
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
	static boolean condition(){
		boolean result = Math.random() < 0.99;
		System.out.print(result+". ");
		return result;
	}
	public void WT(){
		while(condition()){
			System.out.println("Inside 'while'");
		System.out.println("Exited 'while'");
		}
	}
}

class ListCharacters{
	public void LC(){
		for(char c=0;c<128;c++){
			if(Character.isLowerCase(c))
				System.out.println("Value: "+ (int)c+" character: " + c);
		}
	}
}

class CommaOperator{
	public void CO(){
		for(int i=1,j=i+10;i<5;i++,j=i*2){
			System.out.println("i = "+i+"j = "+j);
		}
	}
}

class ForEachFloat{
	public void FEF(){
		Random rand = new Random(47);
		float f[] = new float[10];
		for(int i=0;i<10;i++)
			f[i] = rand.nextFloat();
		for(float x:f)
			System.out.println(x);
	}
}

class ForEachString{
	public void FES(){
		for(char c : "An African Swallow".toCharArray())
			System.out.print(c+" ");
	}
}

class ForEachInt{
//	public void FEI(){
//		for(int i : range(10))
//			System.out.print(i+" ");
//	}
}

class IfElse2{
	static int test(int testval,int target){
		if(testval>target){
			return +1;
		}
		else if(testval<target)
			return -1;
		else 
			return 0;
	}
}

class BreakAndContinue{
	
}

class LabeledFor{
	public void LF(){
		int i = 0;
		outer://Can't have statements here
		for(;true;){
			inner:
			for(;i<10;i++){
				System.out.println("i = "+i);
				if(i==2){
					System.out.println("continue");
					continue;
				}
				if(i==3){
					System.out.println("break");
					i++;
					break;
				}
				if(i==7){
					System.out.println("continue outer");
					i++;
					continue outer;
				}
				if(i==8){
					System.out.println("break outer");
					break outer;
				}
				for(int k = 0;k<5;k++){
					if(k==3){
						System.out.println("continue inner");
						continue inner;
					}
				}
			}
		}
	}
}


class LabeledWhile{
	public void LW(){
		int i = 0;
		outer:
			while(true){
				System.out.println("Outer while loop");
				while(true){
					i++;
					System.out.println("i = "+i);
					if(i==1){
						System.out.println("continue");
						continue;
					}
					if(i==3){
						System.out.println("continue outer");
						continue outer;
					}
					if(i==5){
						System.out.println("break");
						break;
					}
					if(i==7){
						System.out.println("break outer");
						break outer;
					}
				}
			}
	}
}

class VowelsAndConsonants{
	public void VAC(){
		Random rand = new Random(47);
		for(int i=0;i<100;i++){
			int c = rand.nextInt(26)+'a';
			System.out.print((char)c+". "+c+": ");
			switch(c){
			case 'a':
			case 'e':
			case 'i':
			case 'u':System.out.println("vowel");
			case 'o':
			case 'y':
			case 'w':System.out.println("Sometimes a vowel");
			default: System.out.println("consonant");
			}
		}
	}
}

class Rock{
	Rock(){
		System.out.print("Rock");
	}
	void test(){
		for(int i = 0;i<10;i++)
			new Rock();
	}
}

class Rock2{
	Rock2(int i){
		System.out.print("Rock "+i+" ");
	}
}

class Tree{
	int height;
	Tree(){
		System.out.println("Planting a seedling");
		height = 0;
	}
	Tree(int initialHeight){
		height = initialHeight;
		System.out.println("Creating new Tree that is "+height +" feet tall");
	}
	void info(){
		System.out.println("Tree is "+ height + "feet tall");
	}
	void info(String s){
		System.out.println(s+": Tree is "+height+"feet tall");
	}
}

class OverloadingOrder{
	static void f(String s, int i){
		System.out.println("String: "+s+". int:"+i);
	}
	static void f(int i,String s){
		System.out.println("int: "+i+".String: "+s);
	}
}

class Banana{
	void peel(int n){
		
	}
}
//只有需要当指出当前对象的引用时，才需要使用this

class Person{
	public void eat(Apple apple){
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy");
	}
}

class Peeler{
	static Apple peel(Apple apple){
		//remove peel
		return apple;
	}
}

class Apple{
	Apple getPeeled(){
		return Peeler.peel(this);
	}
}


//在构造器中有时肯呢过想在一个构造器中调用另一个构造器，以避免重复代码，this关键字可以做到这一点。
//除构造器外，编译器禁止在任何其他地方调用构造器。
class Flower{
	int petalCount = 0;
	String s = "initial value";
	Flower(int petals){
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount = "+petals);
	}
	Flower(String ss){
		System.out.println("Constructor w/ String arg only,ss = "+ss);
		s = ss;
	}
	Flower(String ss,int petals){
		this(petals);
		this.s = ss;
	}
	Flower(){
		this("hi",47);
	}
	void printPetalCount(){
		System.out.println("petalCount = "+petalCount+" s = "+s);
	}
}

//对象可能不被垃圾回收
//垃圾回收不等于析构
//垃圾回收只和内存有关
class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	void CheckIn(){
		checkedOut = false;
	}
	protected void finalize(){
		if(checkedOut)
			System.out.println("Error: checked out ");
		//super.finalize();
	}
}

//数据成员初始化
class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;//在类里定义一个引用时，如果不将其初始化，得到的值就为null
	void printInitialValues(){
		System.out.println("Data type       Initial value");
		System.out.println("char            ["+c+"]");
		System.out.println("byte           "+b);
		System.out.println("short          "+s);
		System.out.println("int            "+i);
		System.out.println("long           "+l);
		System.out.println("float          "+f);
		System.out.println("double         "+d);
		System.out.println("reference      "+reference);
	}
}

class InitialValues2 {
	boolean bool = true;
	char ch = 'x';
	byte b = 47;
	short s = 0xff;
	int i = 999;
	long lng = 1;
	float f = 3.14f;
	double d = 3.14159;
}

class Counter{
	int i;
	Counter(){
		i = 7;
	}
}

class Window {
	Window(int marker){
		System.out.println("Window("+marker+")");
	}
}


//变量会在任何方法被调用之前得到初始化
class House {
	Window w1 = new Window(1);
	House(){
		System.out.println("House()");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f() {
		System.out.println("f()");
	}
	Window w3 = new Window(3);
}

class Bowl {
	Bowl(int marker){
		System.out.println("Bowl("+marker+")");
	}
	void f1(int marker){
		System.out.println("f1("+marker+")");
	}
}

class Table {
	static Bowl bowl1 = new Bowl(1);
	Table(){
		System.out.println("Table()");
		bowl2.f1(1);
	}
	void f2(int marker){
		System.out.println("f2("+marker+")");
	}
	static Bowl bowl2  = new Bowl(2);
}

class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	Cupboard(){
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	void f3(int marker){
		System.out.println("f3("+marker+")");
	}
	static Bowl bowl5 = new Bowl(5);
}

class Spoon {
	static int i;
	static {
		i = 47;
	}
}

class Cup {
	Cup(int marker){
		System.out.println("Cup("+marker+")");
	}
	void f(int marker){
		System.out.println("f("+marker+")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups(){
		System.out.println("Cups()");
	}
}

class Mug {
	Mug(int marker){
		System.out.println("Mug("+marker+")");
	}
	void f(int marker){
		System.out.println("f("+marker+")");
	}
}

class Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}
	Mugs(){
		System.out.println("Mugs()");
	}
	Mugs(int n){
		System.out.println("Mugs(int)");
	}
}


//数组 异名引用
//字符串length()方法 数组length属性
class ArraysOfPrimitives {
	void AOP() {
		int[] a1 = {1,2,3,4,5};
		int[] a2;
		a2 = a1;
		for(int i = 0;i<a2.length;i++){
			a2[i] = a2[i]+1;
		}
		for(int i = 0;i<a1.length;i++){
			System.out.println("a1["+i+"]"+"="+a1[i]);
		}
	}
}


//a = new int[rand.nextInt(20)]
//数组中的基本元素类型会自动初始化成空值
class ArrayNew {
	void AN() {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println("length of a = "+a.length);
		System.out.println(Arrays.toString(a));
	}
}


//在类里定义一个引用时，如果不将其初始化，得到的值为null
class ArrayClassObj {
	void ACO() {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		System.out.println("length of a = "+a.length);
//		for(int i = 0; i<a.length;i++){
//			a[i]=rand.nextInt(500);
//		}
		System.out.println(Arrays.toString(a));
	}
}

class ArrayInit {
	void AI(){
		Integer[] a = {
			new Integer(1),
			new Integer(2),
			3,
		};
		Integer[] b = {
			new Integer(1),
			new Integer(2),
			3,
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}

//可以创建一个String对象数组，将其传入另一个main方法中
class Other {
	public static void main(String[] args){
		for(String s:args)
			System.out.println(s+ " ");
	}
}

class A {
	
}

class VarArgs {
	static void printArray(Object[] args){
		for(Object obj : args)
			System.out.print(obj+ " ");
		System.out.println();
	}
	public static void main(String[] args){
		printArray(new Object[]{
				new Integer(47),new Float(3.14),new Double(11.11)
		});
		printArray(new Object[]{"one","two","three"});
		printArray(new Object[]{new A(),new A(),new A()});
	}
}

class NewVarArgs {
	static void printArray(Object...Args){
		for(Object obj : Args)
			System.out.print(obj+" ");
		System.out.println();
	}
	public static void main(String[] args){
		printArray(new Integer(47),new Float(3.14),new Double(11.11));
		printArray(47,3.14F,11.11);
		printArray("one","two","three");
		printArray(new A(),new A(),new A());
		printArray((Object[])new Integer[]{1,2,3,4});
		printArray();
	}
}

class OptionalTrailingArguments {
	static void f(int required,String...trailing){
		System.out.print("required"+required+" ");
		for(String s : trailing)
			System.out.print(s+ " ");
		System.out.println();
	}
	public static void main(String[] args){
		f(1,"one");
		f(2,"two","three");
		f(0);
	}
}



//getClass()属于Object的一部分，将产生对象的类  ????Character??
class VarargType {
	static void f(Character...args){
		System.out.print(args.getClass());
		System.out.println(" length "+ args.length);
	}
	static void g(int...args){
		System.out.print(args.getClass());
		System.out.println(" length "+args.length);
	}
	public static void main(String[] args){
		f('a','b');
		f();
		g(1);
		g();
		System.out.println("int[]: "+new int[0].getClass());
	}
}

class AutoBoxingVarargs {
	public static void f(Integer...args){
		for(Integer i : args)
			System.out.print(i+" ");
		System.out.println();
	}
	public static void main(String[] args){
		f(new Integer(1),new Integer(2));
		f(4,5,6,7,8,9);
		f(10,new Integer(11),12);
	}
}

class OverloadingVarargs {
	static void f(Character...args){
		System.out.print("first");
		for(Character c : args)
			System.out.print(" " +c);
		System.out.println();
	}
	static void f(Integer...args){
		System.out.print("second");
		for(Integer i:args)
			System.out.print(" "+i);
		System.out.println();
	}
	static void f(Long...args){
		System.out.print("third");
		for(Long l:args)
			System.out.print(" "+l);
		System.out.println();
	}
	static void main(String[] args){
		f('a','b','c');
		f(1);
		f(2,1);
		f(0);
		f(0L);
	}
}

class OverloadingVarargs2 {
	static void f(float i, Character...args){
		System.out.println("first");
	}
	static void f(char c,Character...args){
		System.out.println("second");
	}
	public static void main(String[] args){
		f(1,'a');
		f('a');
	}
}

enum Spiciness {
	NOT,MILD,MEDIUM,HOT,FLAMING
}

class SimpleEnumUse {
	public static void main(String[] args){
		Spiciness howHot = Spiciness.MEDIUM;
		System.out.println(howHot);
	}
}

class EnumOrder {
	public static void main(String[] args){
		for(Spiciness s : Spiciness.values())
			System.out.println(s+", ordinal "+s.ordinal());
		System.out.println(Spiciness.values());
	}
}