import java.lang.*;
import java.io.*;
public class pavbhaji
{
    public static String z22[]=new String[10];
    public static int amount2=0;
    public static int rate2[]=new int[10];
    public static int price2[]=new int[10];
    public static int choice2=0;
    public static int qty2[]=new int [10];
    public void menu2()
    {
        int cho2=0;
        int b=0;
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader ab=new BufferedReader(isr);
            {
                do
                {
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~From Pav Bhaji Corner~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("1.Masala Pav................................................20.00"); 
                    System.out.println("2.Pav Bhaji.................................................40.00"); 
                    System.out.println("3.Kada Pav Bhaji............................................45.00"); 
                    System.out.println("4.Tomato Pav Bhaji..........................................50.00"); 
                    System.out.println("5.Kjsit's Special Pav Bhaji................................40.00"); 
                    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                    String y2=buf.readLine();
                    int choice2=Integer.parseInt(y2);
                    String z1[]={"Masala Pav","Pav Bhaji","Kada Pav Bhaji","Tomato Pav Bhaji","Kjsit's Special Pav Bhaji"};
                    int rate2[]={20,40,45,50,40};
                    if(choice2==1)
                    {
                        z22[0]="Masala Pav";
                        System.out.println("Enter Quantity");
                        y2=buf.readLine();
                        qty2[0]=qty2[0] + Integer.parseInt(y2);
                        System.out.println("You have purchased"+qty2[0]+"Masala Pav for Rs."+rate2[0]*qty2[0]);
                    }
                    if(choice2==2)
                    {
                        z22[1]="Pav Bhaji";
                        System.out.println("Enter Quantity");
                        y2=buf.readLine();
                        qty2[1]=qty2[1]+Integer.parseInt(y2);
                        System.out.println("You have purchased"+qty2[1]+"Pav Bhaji for Rs."+rate2[1]*qty2[1]);
                    }
                    if(choice2==3)
                    {
                        z22[2]="Kada Pav Bhaji";
                        System.out.println("Enter Quantity");
                        y2=buf.readLine();
                        qty2[2]=qty2[2]+Integer.parseInt(y2);
                        System.out.println("You have purchased"+qty2[2]+"Kada Pav Bhaji for Rs."+rate2[2]*qty2[2]);
                    }
                    if(choice2==4)
                    {
                        z22[3]="Tomato Pav Bhaji";
                        System.out.println("Enter Quantity");
                        y2=buf.readLine();
                        qty2[3]=qty2[3]+Integer.parseInt(y2);
                        System.out.println("You have purchased"+qty2[3]+"Tomato Pav Bhaji for Rs."+rate2[3]*qty2[3]);
                    }
                    if(choice2==5)
                    {
                        z22[4]="Kjsit's Special Pav Bhaji";
                        System.out.println("Enter Quantity");
                        y2=buf.readLine();
                        qty2[4]=qty2[4]+Integer.parseInt(y2);
                        System.out.println("You have purchased"+qty2[4]+"Kjsit's Special Pav Bhaji for Rs."+rate2[4]*qty2[4]);
                    }
                    for(b=0;b<10;b++)
                    {
                        price2[b]=rate2[b]*qty2[b];
                        amount2=amount2+price2[b];
                    }
                    System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                    choice2=Integer.parseInt(ab.readLine());
                }while(cho2!=0);
            }
        }catch(Exception e){}
    }}
