import java.util.*;

public class Test_6 {
	public static void main(String[] args){
		//Created a seeded random number generator:
		Random rand = new Random(47);
		int i,j,k;
		//Choose value from 1 to 100:
		j = rand.nextInt(100)+1;
		System.out.print("j:"+j);
		k = rand.nextInt(100)+1;
		System.out.print("k:"+k);
		i=j+k;
		System.out.print("j+k"+i);
		i=j-k;
		System.out.print("j-k"+i);
	}
}
