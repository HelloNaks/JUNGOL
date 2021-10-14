import java.util.Scanner;

public class Main{

	static int N, M;
	static int[] path=new int[10];
	static int lev;
	static boolean[] used= new boolean[10];
	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		N=scann.nextInt();
		M=scann.nextInt();
		
		if(M==1) {
			run1(0);
		}
		if(M==2) {
			run2(0, 1);
		}
		if(M==3) {
			run3(0);
		}
	}

	private static void print() {
		for(int i=0;i<N;i++) {
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}
	
	private static void run1(int lev) {
		if(lev==N) {
			print();
			return;
		}
		
		for(int i=1;i<=6;i++) {
			path[lev]=i;
			run1(lev+1);
		}
	}

	private static void run2(int lev, int start) {
		if(lev==N) {
			print();
			return;
		}
		
		for(int i=start;i<=6;i++) {
			path[lev]=i;
			run2(lev+1, i);
		}
	}
	
	private static void run3(int lev) {
		if(lev==N) {
			print();
			return;
		}
		
		for(int i=1;i<=6;i++) {
			if(used[i]) continue;
			used[i]=true;
			path[lev]=i;
			run3(lev+1);
			used[i]=false;
		}
	}
	
}
