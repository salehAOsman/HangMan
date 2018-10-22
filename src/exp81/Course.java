package exp81;

public class Course {

	private int quize1; // 0 --> 10 point %12.5
	private int quize2; // 0 --> 10 point %12.5 tow of quizes 25% of grade
	private int midtermExam; // 0 --> 100 point %25 of grade
	private int finalExam; // 0 --> 100 point %50 of grade
	private int total;
	private char grade;

	public Course() {
	}

	public Course(int quize1, int quize2, int midtermExam, int finalExam) {

		setQuize1(quize1);
		setQuize2(quize2);
		setMidtermExam(midtermExam);
		setFinalExam(finalExam);
		setTotal();
		setGrade();
	}

	@Override
	public String toString() {
		return "Course [quize1=" + quize1 + ", quize2=" + quize2 + ", midtermExam=" + midtermExam + ", finalExam="
				+ finalExam + ", total=" + total + ", grade=" + grade + "]";
	}

	private int getQuize1() {
		return quize1;
	}

	private int getQuize2() {
		return quize2;
	}

	private int getMidtermExam() {
		return midtermExam;
	}

	private int getFinalExam() {
		return finalExam;
	}

	private double getTotal() {
		return total;
	}

	private char getGrade() {
		return grade;
	}

	// setter
	private void setQuize1(int quize1) {
		this.quize1 = quize1;
	}

	private void setQuize2(int quize2) {
		this.quize2 = quize2;
	}

	private void setMidtermExam(int midtermExam) {
		this.midtermExam = midtermExam;
	}

	private void setFinalExam(int finalExam) {
		this.finalExam = finalExam;
	}

	private void setTotal() {
		double total = (getPorcent_Quize1(getQuize1()) + getPorcent_Quize2(getQuize2())
				+ getPorcent_MidtermExam(getMidtermExam()) + getPorcent_FinalExam(getFinalExam()));
		this.total = (int) Math.round(total);
	}

	private void setGrade() {
		if (total >= 90)
			this.grade = 'A';
		else if (total >= 80)
			this.grade = 'B';
		else if (total >= 70)
			this.grade = 'C';
		else if (total >= 60)
			this.grade = 'D';
		else
			this.grade = 'F';
	}

//getter normalized
	private double getPorcent_Quize1(int quize1) {
		return quize1 * 12.5 / 10;
	}

	public double getPorcent_Quize2(int quize2) {
		return quize2 * 12.5 / 10;
	}

	public double getPorcent_MidtermExam(int midtermExam) {
		return (midtermExam * 25 / 100);
	}

	public double getPorcent_FinalExam(int finalExam) {
		return (int) (finalExam * 50 / 100);
	}

}