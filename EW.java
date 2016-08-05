package EW;

class Parcel1 {
	class Contents {
		private int i = 11;
		public int value(){
			return i;
		}
	}
	class Destination {
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){
			return label;
		}
	}
	public void ship(String dest){
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String[] args){
		Parcel1 p = new Parcel1();
		p.ship("asd");
	}
}

class Parcel2 {
	class Contents {
		private int i = 11;
		public int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		public Destination(String whereTo){
			label = whereTo;
		}
		String readLabel(){ return label; }
	}
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contents(){
		return new Contents();
	}
	public void ship(String dest){
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}
	public static void main(String[] args){
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d = q.to("Borneo");
	}
}
interface Selector {
	boolean end();
	Object current();
	void next();
}
class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size){items = new Object[size];}
	public void add(Object x){
		if(next < items.length)
			items[next++]=x;
	}
	private class SequenceSelector implements Selector {
		private int i = 0;
		public boolean end(){
			return i == items.length;
		}
		public Object current(){
			return items[i];
		}
		public void next(){
			if(i<items.length)
				i++;
		}
	}
	public Selector selector(){
		return new SequenceSelector();
	}
	public static void main(String[] args){	
		Sequence sequence = new Sequence(10);
		for(int i =0;i<10;i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while(!selector.end()){
			System.out.println(selector.current()+" ");
			selector.next();
		}
	}
}


class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}
	public class Inner {
		public DotThis outer(){
			return DotThis.this;
		}
	}
	public Inner inner(){
		return new Inner();
	}
	public static void main(String[] args){
		DotThis dt = new DotThis();
		DotThis.Inner in = dt.new Inner();
	}
}

class Parcel3 {
	class Contents{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	class Destination {
		private String label;
		Destination(String whereTo){
			label = whereTo;
		}
		String labelTo(){
			return label;
		}
	}
	public static void main(String[] args){
		Parcel3 p = new Parcel3();
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("asd");
	}
}

interface Destination {
	String readLabel();
}

interface Contents{
	int value();
}

class Parcel4 {
	private class PContents implements Contents{
		private int i;
		public int value(){
			return i;
		}
	}
	private class PDestination implements Destination {
		private String label;
		private PDestination(String whereTo) {
			label = whereTo;
		}
		public String readLabel(){
			return label;
		}
	}
	public Destination destination(String s){
		return new PDestination(s);
	}
	public Contents contents(){
		return new PContents();
	}
	public static void main(String[] args){
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
	}
}

class Parcel5 {
	public Destination destination(String s ){
		class PDestination implements Destination {
			private String label;
			private PDestination(String whereTo){
				label = whereTo;
			}
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);
	}
	public static void main(String[] args){
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tasmania");
	}
}

public class EW {
	public static void main(String[] args){
		Sequence.main(args);
	}
}
