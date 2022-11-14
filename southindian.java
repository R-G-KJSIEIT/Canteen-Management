import java.lang.*;
import java.io.*;
import java.util.*;    
public class southindian
{
    public static String z1[]=new String[10];
    public static int amount1=0;
    public static int price1[]=new int[10];
    public static int choice1=0;
    public static int qty1[]=new int [10];
    public static int arr[]=new int[10];
    public static String z11[]=new String[10];
    //public static int menu1()
    public void menu1()
    {
        int cho1=0;
        int a=0,dummy=0,i;
        {
            try
            {
                InputStreamReader isr=new InputStreamReader(System.in);
                BufferedReader ab=new BufferedReader(isr);
                {
                    do
                    {
                        System.out.println();
                        System.out.println("All the way from South India");
                        System.out.println("1.Sada Dosa.................................................20.00");
                        System.out.println("2.Cheeze Dosa...............................................28.00");
                        System.out.println("3.Paper Dosa................................................35.00");
                        System.out.println("4.Mysore Masala.............................................25.00");
                        System.out.println("5.Sada Uttappa..............................................30.00");
                        System.out.println("6.Onion Uttappa.............................................40.00");
                        System.out.println("7.Idli......................................................18.00");    
                        System.out.println("8.Idli-Wada.................................................23.00");    
                        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                        String y1=buf.readLine();
                        int choice1=Integer.parseInt(y1);
                        String z1[]={"Sada Dosa","Cheeze Dosa","Paper Dosa","Mysore Masala","Sada Uttappa","Onion Uttappa","Idli","Idli-Wada"};
                        int rate1[]={20,28,35,25,30,40,18,23};
                        if(choice1==1)
                        {
                            z11[0]="Sada Dosa";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[0]=qty1[0] + Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[0]+"Sada Dosa for Rs."+rate1[0]*qty1[0]);
                        }
                        if(choice1==2)
                        {
                            z11[1]="Cheeze Dosa";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[1]=qty1[1]+Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[1]+"Cheeze Dosa for Rs."+rate1[1]*qty1[1]);
                        }
                        if(choice1==3)
                        {
                            z11[2]="Paper Dosa";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[2]=qty1[2]+Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[2]+"Paper Dosa for Rs."+rate1[2]*qty1[2]);
                        }
                        if(choice1==4)
                        {
                            z11[3]="Mysore Masala";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[3]=qty1[3]+Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[3]+"Mysore Masala for Rs."+rate1[3]*qty1[3]);
                        }
                        if(choice1==5)
                        {
                            z11[4]="Sada Uttappa";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[4]=qty1[4]+Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[4]+"Sada Uttappa for Rs."+rate1[4]*qty1[4]);
                        }
                        if(choice1==6)
                        {
                            z11[5]="Onion Uttappa";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[5]=qty1[5]+Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[5]+"Onion Uttappa for Rs."+rate1[5]*qty1[5]);
                        }
                        if(choice1==7)
                        {
                            z11[6]="Idli";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[6]=qty1[6]+Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[6]+"Idli for Rs."+rate1[6]*qty1[6]);
                        }
                        if(choice1==8)
                        {
                            z11[7]="Idli-Wada";
                            System.out.println("Enter Quantity");
                            y1=buf.readLine();
                            qty1[7]=qty1[7]+Integer.parseInt(y1);
                            System.out.println("You have purchased"+qty1[7]+"Idli-Wada for Rs."+rate1[7]*qty1[7]);
                        }        
                        for(a=0;a<9;a++)
                        {
                            price1[a]=rate1[a]*qty1[a];
                            amount1=amount1+price1[a];
                        }
                        System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                        choice1=Integer.parseInt(ab.readLine());
                    }while(cho1!=0);
                }
            }catch(Exception e){}
            //return amount1;
        }
    }
}
