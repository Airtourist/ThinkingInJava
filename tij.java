//:reusing/SprinklerSystem.java
// Composition for code reuse.

class WaterSource {
	private String s;
	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}
	public String toString(){
		return s;
	};
}

class SprinklerSystem {
	private String value1,value2,value3,value4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	public String toString() {
		return 
				"value1 = "+value1 + " "+ 
				"value2 = "+value2 + " "+
				"value3 = "+value3 + " "+
				"value4 = "+value4 + " "+
				"i = "+i+" "+
				"f = "+f+" "+
				"source = "+source;
	}
}

class Soap {
	private String s;
	Soap(){
		System.out.println("Soup()");
		s = "Constructed";
	}
	public String toString(){ return s;	}
}

class Bath {
	private String 
		s1 = "Happy",
		s2 = "Happy",
		s3,s4;
	private Soap castille;
	private int i;
	private float toy;
	public Bath(){
		System.out.println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	//Instance initialization;
	{i=47;}
	public String toString(){
		if(s4 == null)
			s4 = "Joy";
		return 
				"s1 = "+s1+"\n"+
				"s2 = "+s2+"\n"+
				"s3 = "+s3+"\n"+
				"s4 = "+s4+"\n"+
				"i = "+i+"\n"+
				"toy = "+toy+"\n"+
				"castille ="+castille;
	}
}

class Cleanser {
	private String s = "Cleaner";
	public void append(String a){	s+=a;	}
	public void dilute(){	append("dilute()"); }
	public void apply(){ append("apply()"); }
	public void scrub(){ append("scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args){
		Cleanser x = new Cleanser();
		x.dilute();x.apply();x.scrub();
		System.out.println(x);
	}
}

class Detergent extends Cleanser {
	public void scrub(){
		append("Detergent.scrub()");
		super.scrub();//Call base-class version
	}
	public void foam(){ append("foam()");}
}

class Art {
	Art(){
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}

class Cartoon extends Drawing {
	public Cartoon(){
		System.out.println("Cartoon constructor");
	}
	public static void main(String[] args){
		Cartoon x = new Cartoon();
	}
}

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i){
		super(i);
		System.out.println("BoardGame constructor");
	}
}

class Chess extends BoardGame {
	Chess(int i){
		super(i);
		System.out.println("Chess constructor");
	}
}

class SpaceShipControls {
	void up(int velocity){
		
	}
	void down(int velocity){
		
	}
	void left(int velocity){
		
	}
	void right(int velocity){
		
	}
	void forward(int velocity){
		
	}
	void back(int velocity){
		
	}
	void turboBoost(){
		
	}
}

class SpaceShip extends SpaceShipControls {
	private String name;
	public SpaceShip(String name) { this.name = name; }
	public String toString() { return name; }
	public static void main(String[] args){
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.forward(100);
	}
}

class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	public void back(int velocity){
		controls.back(velocity);
	}
	
	public void down(int velocity){
		controls.down(velocity);
	}
	
	public void forward(int velocity){
		controls.forward(velocity);
	}
	
	public void left(int velocity){
		controls.left(velocity);
	}
	
	public void right(int velocity){
		controls.right(velocity);
	}
	
	public void turboBoost(){
		controls.turboBoost();
	}
	
	public void up(int velocity){
		controls.up(velocity);
	}
	
	public static void main(String[] args){
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}
}

class Plate {
	Plate(int i){
		System.out.println(i);
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i){
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil {
	Utensil (int i){
		System.out.println("Utensil constructor");
	}
}

class Spoon_1 extends Utensil {
	Spoon_1(int i){
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i){
		super(i);
		System.out.println("fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i){
		super(i);
		System.out.println("knife constructor");
	}
}

class Custom {
	Custom(int i){
		System.out.println("Custom constructor");
	}
}

class PlaceSetting extends Custom {
	private Spoon_1 sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	public PlaceSetting(int i){
		super(i+1);
		sp = new Spoon_1(i+2);
		frk = new Fork(i+3);
		kn = new Knife(i+4);
		pl = new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor");
	}
	public static void main(String[] args){
		PlaceSetting ps = new PlaceSetting(9);
	}
}

public class tij {
	public static void main(String[] args){
//		SprinklerSystem sprinklers = new SprinklerSystem();
//		System.out.println(sprinklers);
//		Bath b = new Bath();
//		b.toString();
//		System.out.println(b);
//		Cleanser c = new Cleanser();
//		c.dilute();
//		System.out.println(c);
//		Detergent d = new Detergent();
//		d.dilute();
//		d.scrub();
//		d.foam();
//		System.out.println(d);
//		Cleanser.main(args);
//		Cartoon c = new Cartoon();
//		Chess c = new Chess(2);
//		SpaceShipDelegation.main(args);
	}
}
