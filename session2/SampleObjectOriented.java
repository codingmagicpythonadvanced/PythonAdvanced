
class Student
{
   int sub1, sub2, sub3;

   Student(int sub1, int sub2, int sub3)
   {
      this.sub1 = sub1;
      this.sub2 = sub2;
      this.sub3 = sub3;
   }
   float getAverage ()
   {
      int sum = sub1 + sub2 + sub3;
      return sum/3;
   }
}

class SampleObjectOriented
{
   public static void main (String [] args)
   {
      Student aarav = new Student(80, 75, 95);           
      Student gaurav = new Student(90, 80, 75);
      float aaravAvg = aarav.getAverage();
      float gauravAvg = gaurav.getAverage();
      if (aaravAvg > gauravAvg)
         System.out.println( "Aarav's average " + aaravAvg + " is Greater than Gaurav's Average " + gauravAvg);
      else
         System.out.println( "Gaurav's average " + gauravAvg + " is Greater than Aarav's Average " + aaravAvg);
   }
}
