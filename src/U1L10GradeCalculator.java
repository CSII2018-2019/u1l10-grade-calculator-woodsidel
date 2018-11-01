import javax.swing.JOptionPane;
public class U1L10GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] grades = {59,79,59,40,70,80,70};
		double lowGrade = 100;
		double avgGrade = 0;

		avgGrade = averageGrade(grades, avgGrade);
		JOptionPane.showMessageDialog(null, "Grade Average w/ Lowest Grade: "+avgGrade+"%");
		lowestGrade(lowGrade, grades);
		
	}
	public static double averageGrade(double[] listGrades, double gradeAverage) {
		for(int i = 0; i < (listGrades.length-1); i++) {
			gradeAverage += listGrades[i];
		}
		gradeAverage /= (listGrades.length - 1);
		return gradeAverage;
				
		
	}
	public static void lowestGrade (double gradeLow, double[] listGrades) {
		for(int j = 0; j < listGrades.length; j++) {
			if((100 - listGrades[j])<gradeLow) {
				gradeLow = listGrades[j];
				j++;
			}
		}
		JOptionPane.showMessageDialog(null, "Lowest Grade: "+gradeLow+"%");

	}
}
