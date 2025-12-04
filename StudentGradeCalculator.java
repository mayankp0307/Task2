import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
     Scanner keyboard=new Scanner(System.in);
        System.out.println("-------------Student Grade Calculator---------");
        System.out.println("Enter how many courses you have: ");
        int count=keyboard.nextInt();
        int[] subjectsc=new int[count];
        int sum=0;
        for(int i=0; i<count; i++)
        {
            System.out.print("Enter marks for Course"+(i+1)+"(out of 100): ");
            int score=keyboard.nextInt();

            while(score<0 || score>100)
            {
                System.out.print("Opps, invalid marks. Enter between 0 and 100.: ");
                score=keyboard.nextInt();
            }
            subjectsc[i]=score;
            sum+=score;

        }

        double average=(double)sum/count;

        String letterGrade;
        if(average>=90){
            letterGrade="A+";

        } else if(average>=80){
            letterGrade="A";
        } else if(average>=70){
            letterGrade="B";
        } else if(average >=60){
            letterGrade="C";
        } else if(average>=50){
            letterGrade="D";

        }else {
            letterGrade="F";
        }

        System.out.println("\n**********Result*********");
        System.out.println("Total Courses   :"+count);
        System.out.println("Total Marks obtained"+ sum);
        System.out.println("Average Percentage :"+String.format("%.2f",average)+"%");

        System.out.println("Your Final Grade   :"+letterGrade);
        keyboard.close();



    }
}









