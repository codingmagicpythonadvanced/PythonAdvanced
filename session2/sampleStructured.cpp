#include <iostream>

float getStudentMarks (int student[])
{
   int sum=0;
   for (int i=0; i< 3; i++)
      sum += student[i];
   return sum/3;
}
int main ()
{
   int student1[] = {80, 70, 90};
   int student2[] = {85, 75, 95};
   int avg1 = getStudentMarks (student1);
   int avg2 = getStudentMarks (student2);
   std::cout << "STUDENT" << (avg1 > avg2 ? "-1" : "-2") << " has the higher average " << avg1 << " " << avg2 << std::endl;
}
