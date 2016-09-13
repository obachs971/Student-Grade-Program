import java.io.*;
import java.util.*;
public class studentGrades
{
	public static void main(String[] args) throws IOException
	{
		double grade1;
		double grade2;
		double grade3;
		String letterGrade;
		File file1 = new File("Test.txt");
		Scanner inputFile = new Scanner(file1);
		String studentName;
		String finalLetterGrade;
		PrintWriter outputFile = new PrintWriter("output.txt");
		
		while (inputFile.hasNext())
		{
			studentName = inputFile.nextLine();
			grade1 = inputFile.nextDouble();
			grade2 = inputFile.nextDouble();
			grade3 = inputFile.nextDouble();
			finalLetterGrade = letterGrade(grade1, grade2, grade3);
			outputFile.println(studentName);
			outputFile.println(finalLetterGrade);
			inputFile.nextLine();
		}
		outputFile.close();
	}

	 /**
	 * 
	 * @param g1 The first grade in double.
	 * @param g2 The second grade in double.
	 * @param g3 The third grade in double.
	 * @return finalGrade The final grade that takes 20% of the first grade, 30% of the second grade, and 50% of the third grade. Returns a String.
	 */
	public static String letterGrade(double g1, double g2, double g3)
	{
		double finalnumGrade;
		String finalGrade;
		finalnumGrade = (g1 * 0.2) + (g2 * 0.3) + (g3 * 0.5);
		
		if(finalnumGrade >= 92)
		{
			finalGrade = "A";
		}
		else if(finalnumGrade >= 90)
		{
			finalGrade = "A-";
		}
		else if(finalnumGrade >= 88)
		{
			finalGrade = "B-";
		}
		else if(finalnumGrade >= 82)
		{
			finalGrade = "B";
		}
		else if(finalnumGrade >= 80)
		{
			finalGrade = "B-";
		}
		else if(finalnumGrade >= 78)
		{
			finalGrade = "C+";
		}
		else if(finalnumGrade >= 70)
		{
			finalGrade = "C";
		}
		else if(finalnumGrade >= 60)
		{
			finalGrade = "D";
		}
		else 
		{
			finalGrade = "F";
		}
		
		return finalGrade;
	}
}


