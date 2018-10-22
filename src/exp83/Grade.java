package exp83;

public class Grade {

	private int A;
	private int B;
	private int C;
	private int D;
	private int F;
	
	private int total;
	
	private int asterisk_A;
	private int asterisk_B;
	private int asterisk_C;
	private int asterisk_D;
	private int asterisk_F;
	
public Grade(int a, int b, int c, int d, int f) {
		setA(a);
		setB(b);
		setC(c);
		setD(d);
		setF(f);
		setTotal();

		setAsterisk_A() ;
		setAsterisk_B() ;
		setAsterisk_C() ;
		setAsterisk_D() ;
		setAsterisk_F() ;
		
	}

@Override
public String toString() {
	return "Grade [A=" + A + ", B=" + B + ", C=" + C + ", D=" + D + ", F=" + F + ", total=" + total + ", asterisk_A="
			+ asterisk_A + ", asterisk_B=" + asterisk_B + ", asterisk_C=" + asterisk_C + ", asterisk_D=" + asterisk_D
			+ ", asterisk_F=" + asterisk_F + "]";
}

	public int getA() {
		return A;
	}
	public int getB() {
		return B;
	}
	public int getC() {
		return C;
	}
	public int getD() {
		return D;
	}
	public int getF() {
		return F;
	}
	private int getTotal() {
		return getA()+getB()+getC()+ getD()+getF();
	}
	//getter normalized
	private double getPercent_A() {
		return (A * 100 / total);
	}
	private double getPercent_B() {
		return ( B * 100 / total);
	}
	private double getPercent_C() {
		return (C * 100 / total);
	}
	private double getPercent_D() {
		return (D * 100 / total);
	}
	private double getPercent_F() {
		return (F * 100 / total);
	}
	
//getter Asterisk
	public int getAsterisk_A() {
		return (int) Math.round(getPercent_A()/2);
	}

	public int getAsterisk_B() {
		return (int)Math.round(getPercent_B()/2);
	}
	public int getAsterisk_C() {
		return (int)Math.round(getPercent_C()/2);
	}

	public int getAsterisk_D() {
		return (int)Math.round(getPercent_D()/2);
	}
	public int getAsterisk_F() {
		return (int)Math.round(getPercent_F()/2);
	}
	
	public void setA(int a) {
		A = a;
	}
	public void setB(int b) {
		B = b;
	}
	public void setC(int c) {
		C = c;
	}
	public void setD(int d) {
		D = d;
	}
	public void setF(int f) {
		F = f;
	}
	
	public void setTotal() {
		this.total = getTotal();
	}
	//setAsterisk_A
	public void setAsterisk_A() {
		this.asterisk_A = getAsterisk_A();
	}
	public void setAsterisk_B() {
		this.asterisk_B = getAsterisk_B();
	}
	public void setAsterisk_C() {
		this.asterisk_C = getAsterisk_C();
	}
	public void setAsterisk_D() {
		this.asterisk_D = getAsterisk_D();
	}
	public void setAsterisk_F() {
		this.asterisk_F = getAsterisk_F();
	}
	
	
}
