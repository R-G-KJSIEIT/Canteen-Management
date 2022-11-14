import java.io.*;
import java.lang.*;
import java.util.*;
public class beverages
{
    public static String z55[]=new String[11];
    public static int amount5=0;
    public static int choice5=0;
    public static int qty5[]=new int[11];
    public static int rate5[]=new int[11];
    public static int price5[]=new int[11];
    public void menu5()
    {
        int cho5=0,d=0;
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader ab=new BufferedReader(isr);
            {
                do
                {
                    System.out.println("                                   ");
                    System.out.println("~~~~~~~~~~~~~~~~Beverages~~~~~~~~~~~~~~~~~~~~~");  
                    System.out.println("1.Tea.......................................................10.00");  
                    System.out.println("2.Nescafe...................................................16.00"); 
                    System.out.println("3.Cold coffee...............................................30.00"); 
                    System.out.println("4.Cold Drinks...............................................46.00");
                    System.out.println("5.Kulfi Falooda.............................................35.00"); 
                    System.out.println("6.Kjsieit's Special Falooda..................................50.00");
                    System.out.println("7.Vanilla large.............................................35.00"); 
                    System.out.println("8.Strawberry large..........................................30.00");
                    System.out.println("9.Chocolate almounds........................................35.00"); 
                    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                    String y5=buf.readLine();
                    int choice5=Integer.parseInt(y5);                                                                                               String z5[]={"Tea","Nescafe","Cold coffee","Cold Drinks","Kulfi Falooda","Boston's Special Falooda","Vanilla large","Strawberry large","Chocolate almounds"};
                    int rate5[]={10,16,30,46,35,30,35};
                    if(choice5==1)
                    { 
                        z55[0]="Tea";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[0]= qty5[0]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[0]+" Tea for Rs."+rate5[0]*qty5[0]);
                    }
                    if(choice5==2)
                    {
                        z55[1]="Nescafe";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[1]=qty5[1]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[1]+" Nescafe for Rs."+rate5[1]*qty5[1]);
                    }
                    if(choice5==3)
                    {
                        z55[2]="Cold coffee";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[2]=qty5[2]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[2]+" Cold coffee for Rs."+rate5[2]*qty5[2]);
                    }
                    if(choice5==4)
                    {
                        z55[3]="Cold Drinks";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[3]= qty5[3]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[3]+" Cold Drinks for Rs."+rate5[3]*qty5[3]);
                    }
                    if(choice5==5)
                    {
                        z55[4]="Kulfi Falooda";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[4]= qty5[4]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[4]+" Kulfi Falooda for Rs."+rate5[4]*qty5[4]);
                    }
                    if(choice5==6)
                    {
                        z55[5]="Kjsieit's Special Falooda";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[5]=qty5[5]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[5]+" Kjsieit's Special Falooda for Rs."+rate5[5]*qty5[5]);
                    }
                    if(choice5==7)
                    {
                        z55[6]="Vanilla large";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[6]=qty5[6]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[6]+" Vanilla large for Rs."+rate5[6]*qty5[6]);
                    }
                    if(choice5==8)
                    {
                        z55[7]="Strawberry large";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[7]=qty5[7]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[7]+" Strawberry large for Rs."+rate5[7]*qty5[7]);
                    }
                    if(choice5==9)
                    {
                        z55[8]="Chocolate almounds";
                        System.out.println("Enter quantity");
                        y5=buf.readLine();
                        qty5[8]=qty5[8]+Integer.parseInt(y5);
                        System.out.println("You have purchased "+qty5[8]+" Chocolate almounds for Rs."+rate5[8]*qty5[8]);
                    }            
                    for(d=0;d<11;d++)
                    {
                        price5[d]=rate5[d]*qty5[d];
                        amount5=amount5+price5[d];
                    }
                    System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                    cho5=Integer.parseInt(buf.readLine());
                }while(cho5!=0);
            }
        }catch(Exception e){} 
    }
}
