import java.util.*;
public class Project
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in); 
int empno[]={1001,1002,1003,1004,1005,1006,1007};
String empname[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
String joinDate[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
char Designation[]={'e','c','k','r','m','e','c'};
String Department[]={"R&D","PM","Acct","Front Desk","Engg","Manfacturing","PM"};
int Basic[]={20000,30000,10000,12000,50000,23000,29000};
int HRA[]={8000,12000,8000,6000,20000,9000,12000};
int IT[]={3000,9000,1000,2000,20000,4400,10000};
System.out.println("Enter Employee Id");
int a = sc.nextInt();
int DA,salary,flag=0,i;
for(i=0;i<empno.length;i++)
{
if(a==empno[i])
{
flag=1;
System.out.println("Empno Emp Name Department Designation   Salary");
System.out.print(empno[i]+"   "+empname[i]+"    "+Department[i]+"        ");
switch(Designation[i])
{
case 'e': System.out.print("Engineer    ");
          DA=20000;
          break;
case 'c':System.out.print("Consultent    ");
          DA=32000;
         break;
case 'k':System.out.print("Clerk    ");
         DA=12000;
         break;
case 'r':System.out.print("Receptionist     ");
        DA=15000;
       break;
case 'm':System.out.print("Manager    ");
         DA=40000;
         break;
default : 
          DA=0;
          break;
}
salary=Basic[i]+HRA[i]+DA-IT[i];
System.out.println(salary);
break;
}
}
if(flag==0)
System.out.println("There is no employee with empid : "+a);
}
}
