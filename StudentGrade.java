import java.util.Scanner;
public class StudentGrade
{
    public static void main(String [] args)
  { 
      float a[]=new float[5];
      float average=0.0f;
      float sum=0.0f;
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 subject marks ");
    for(i=0;i<5;i++)
    {
        a[i]=sc.nextFloat();
    }
     for(i=0;i<5;i++)
     {
         System.out.println("the marks obtained are ");
         System.out.println(a[i]);
     }
     for(i=0;i<5;i++)
     {
        sum+=a[i];
     }
System.out.println("The total marks obtained is "+sum);
     average=sum/5;
     System.out.println("The average marks obtained of  5 subjects "+ average);
             if(100.00>=average && average>=91.00)
             {
             System.out.println("grade is O(outstanding) ");
             
             }
            else if(90.00>=average && average>=81.00)
            {
            System.out.println("grade is A+(very good score) ");
            
            }
        
            else if(80.00>=average && average>=71.00)
             {
             System.out.println("grade is A(good score) ");
             }
        
             else if(70.00>=average && average>=61.00)
             {
             System.out.println("grade is B+(average score)  ");
            }
             else if(60.00>=average && average>=51.00)
             {
             System.out.println("grade is B(below average score)");
             }
             else if(50.00>=average && average>=41.00)
             {
             System.out.println("grade is C+(bad score try to improve) ");
            
             }
             else if(average>=37 && average<=40)
             {
                 System.out.println("the grade is D(very bad score try to improve)");
             }
             else 
             System.out.println("Fail Better luck next time");
  }
             
}