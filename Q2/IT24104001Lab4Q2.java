import java.util.Scanner;
public class IT24104001Lab4Q2{
  public static void main(String[]args){
   Scanner input=new Scanner(System.in);
    System.out.print("Please enter exam marks (out of 100):");
    double exammarks=input.nextDouble();
    if (exammarks<0 || exammarks>100)
    {
      System.out.println("invalid input for exam marks.Terminating program.");
           return;
    }
      System.out.print("Please enter lab submissions marks(out of 100):");
      double labmarks=input.nextDouble();
    if (labmarks<0 || labmarks>100)
    {
      System.out.println("invalid input for lab submission marks.Terminating program.");
               return;
    }
      System.out.print("Please enter the percentage given for the exam:");
       double exampercentage=input.nextDouble();
       System.out.print("Please enter the percentage given for labsubmission:");
       double labpercentage=input.nextDouble();
      if (exampercentage + labpercentage!=100)
    {
        System.out.println("The percentage must add up to 100.Terminating program.");
                 return;
    }
       double finalMarks=(exammarks*exampercentage/100) + (labmarks*labpercentage/100);
       System.out.println();
       System.out.println("Final Exam Marks is:"+finalMarks);
  }
}
    