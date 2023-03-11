package oops.statemachine;

public class Calculation {
	private int N=5;
	private int N2=4;
	private int N3=5;
	private int N4=3;
	public Calculation() {
		
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
	public int getN2() {
		return N2;
	}
	public void setN2(int n2) {
		N2 = n2;
	}
	public int getN3() {
		return N3;
	}
	public void setN3(int n3) {
		N3 = n3;
	}
	public int getN4() {
		return N4;
	}
	public void setN4(int n4) {
		N4 = n4;
	}
	public Calculation(int n, int n2, int n3, int n4) {
		super();
		N = n;
		N2 = n2;
		N3 = n3;
		N4 = n4;
	}
	

}
