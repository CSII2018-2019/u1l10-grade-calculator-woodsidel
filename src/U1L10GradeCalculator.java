import javax.swing.JOptionPane;
public class U1L10GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] grades = {89,62,96,42,79,72,83};
		double lowGrade = 0;
		double avgGrade = 0;
		String letter = " ";

		avgGrade = averageGrade(grades, avgGrade);
		letter = letterGrade(avgGrade,letter);
		JOptionPane.showMessageDialog(null, "Grade Average w/ Lowest Grade: "+letter+" "+avgGrade+"%");
		lowGrade = lowestGrade(lowGrade, grades);
		for(int j = 0; j < grades.length; j++) {
			if(lowGrade == grades[j]) {
				grades[j] = 0;
				j++;
			}
		}
		avgGrade = averageGrade(grades, avgGrade);
		letter = letterGrade(avgGrade,letter);
		JOptionPane.showMessageDialog(null, "Grade Average w/o Lowest Grade: "+letter+" "+avgGrade+"%");
	}
	public static double averageGrade(double[] listGrades, double gradeAverage) {
		for(int i = 0; i < (listGrades.length-1); i++) {
			gradeAverage += listGrades[i];
		}
		gradeAverage /= (listGrades.length - 1);
		return gradeAverage;
				
		
	}
	public static String letterGrade(double gradeAverage,String gradeLetter) {
		if(gradeAverage<= 100 && gradeAverage>=90) {
			gradeLetter="A";
		}
		else if(gradeAverage<90 && gradeAverage>=80) {
			gradeLetter="B";
		}
		else if(gradeAverage<80 && gradeAverage>= 70) {
			gradeLetter="C";
		}
		else if(gradeAverage<70 && gradeAverage>=60) {
			gradeLetter="D";
		}
		else if(gradeAverage<60 && gradeAverage>=50) {
			gradeLetter="F";
		}
		else {
			gradeLetter="Z";
		}
		return gradeLetter;
	}
	public static double lowestGrade (double gradeLow, double[] listGrades) {
		for(int j = 0; j < listGrades.length; j++) {
			if((100 - listGrades[j])>gradeLow) {
				gradeLow = listGrades[j];
				j++;
			}
		}
		JOptionPane.showMessageDialog(null, "Lowest Grade: "+gradeLow+"%");
		return gradeLow;

	}
}
