import java.util.Scanner;

public class QuetionService 
{
   Quetion[] quetion =new Quetion[3];
   String arr[]=new String[10];

   QuetionService()
   {
      quetion[0]=new Quetion(1,"What is Colour of Sky?", "Blue", "Black","Golden","Red", "Blue");
      quetion[1]=new Quetion(2,"What is Colour of apple?", "Blue", "Black","Golden","Red", "Red");
      quetion[2]=new Quetion(3,"What is Colour of Gold?", "Blue", "Black","Golden","Red", "Golden");
   }
   void displayQuetions()
   {
      int i=0;
      
      for(Quetion p:quetion)
      {
         System.out.print("que no:" +p.getId());
         System.out.println(p.getQuetion());
         System.out.println(p.getOption1() + " " +p.getOption2());
         System.out.println(p.getOption3() + " " +p.getOption4());
         Scanner sc=new Scanner(System.in);
         arr[i++]=sc.nextLine();
         sc.close();
      }
   }
   void Printscore()
   {
      // To calulate score
      int score=0;
      for(int i=0;i<3;i++)
      {
         Quetion q= quetion[i];
         String s=q.getAnswer();
         if(s.equals(arr[i]))
         {
            score++;
         }
      }
      System.out.println("Your Score is: "+score);
   }
}
