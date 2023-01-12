import java.io.*;
import java.lang.*;
import java.util.*;
public class roti
{
    public static String z44[]=new String[8];
    public static int amount4=0;
    public static int choice4=0;
    public static int qty4[]=new int[8];
    public static int rate4[]=new int[8];
    public static int price4[]=new int[8];
    public void menu4()
    {
        int cho4=0,d=0;
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader ab=new BufferedReader(isr);
            {
                do
                {
                    System.out.println("                                   ");
                    System.out.println("~~~~~~~~~~~~~~~~~~~Roti Ki Tokri Se~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
                    System.out.println("1.Roti......................................................07.00"); 
                    System.out.println("2.Naan/Paratha/Kulcha.......................................12.00"); 
                    System.out.println("3.Roomali Roti..............................................13.00"); 
                    System.out.println("4.Alu Paratha...............................................18.00");
                    System.out.println("5.Meethi Paratha............................................20.00"); 
                    System.out.println("6.Stuffed Paratha...........................................25.00"); 
                    System.out.println("7.Cheeze Naan ..............................................20.00"); 
                    System.out.println("8.Garlic Naan...............................................20.00"); 
                    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                    String y4=buf.readLine();
                    int choice4=Integer.parseInt(y4);
                    String z4[]={"Roti","Naan/Paratha/Kulcha","Roomali Roti","Alu Paratha","Meethi Paratha","Stuffed Paratha","Cheeze Naan","Garlic Naan"};
                    int rate4[]={7,12,13,18,20,25,20,20};
                    if(choice4==1)
                    { 
                        z44[0]="Roti";
                        System.out.println("Enter quantity");
                        y4=buf.readLine();
                        qty4[0]= qty4[0]+Integer.parseInt(y4);
                        System.out.println("You have purchased "+qty4[0]+" Roti for Rs."+rate4[0]*qty4[0]);
                    }
                    if(choice4==2)
                    {
                        z44[1]="Naan/Paratha/Kulcha";
                        System.out.println("Enter quantity");
                        y4=buf.readLine();
                        qty4[1]=qty4[1]+Integer.parseInt(y4);
                        System.out.println("You have purchased "+qty4[1]+" Naan/Paratha/Kulcha for Rs."+rate4[1]*qty4[1]);
                    }
                    if(choice4==3)
                    {
                        z44[2]="Roomali Roti";
                        System.out.println("Enter quantity");
                        y4=buf.readLine();
                        qty4[2]=qty4[2]+Integer.parseInt(y4);
                        System.out.println("You have purchased "+qty4[2]+" Roomali Roti for Rs."+rate4[2]*qty4[2]);
                    }
                    if(choice4==4)
                    {
                        z44[3]="Alu Paratha";
                        System.out.println("Enter quantity");
                        y4=buf.readLine();
                        qty4[3]= qty4[3]+Integer.parseInt(y4);
                        System.out.println("You have purchased "+qty4[3]+" Alu Paratha for Rs."+rate4[3]*qty4[3]);
                    }
                    if(choice4==5)
                    {
                        z44[4]="Meethi Paratha";
                        System.out.println("Enter quantity");
                        y4=buf.readLine();
                        qty4[4]= qty4[4]+Integer.parseInt(y4);
                        System.out.println("You have purchased "+qty4[4]+" Meethi Paratha for Rs."+rate4[4]*qty4[4]);
                    }
                    if(choice4==6)
                    {
                        z44[5]="Stuffed Paratha";
                        System.out.println("Enter quantity");
                        y4=buf.readLine();
                        qty4[5]=qty4[5]+Integer.parseInt(y4);
                        System.out.println("You have purchased "+qty4[5]+" Stuffed Paratha for Rs."+rate4[5]*qty4[5]);
                    }
                    if(choice4==7)
                    {
                        z44[6]="Cheeze Naan";
                        System.out.println("Enter Quantity");
                        y4=buf.readLine();
                        qty4[6]=qty4[6]+Integer.parseInt(y4);
                        System.out.println("You have purchased"+qty4[6]+"Cheeze Naan for Rs."+rate4[6]*qty4[6]);
                    }
                    if(choice4==8)
                    {
                        z44[7]="Garlic Naan";
                        System.out.println("Enter Quantity");
                        y4=buf.readLine();
                        qty4[7]=qty4[7]+Integer.parseInt(y4);
                        System.out.println("You have purchased"+qty4[7]+"Garlic Naan for Rs."+rate4[7]*qty4[7]);
                    }    
                    for(d=0;d<8;d++)
                    {
                        price4[d]=rate4[d]*qty4[d];
                        amount4=amount4+price4[d];
                    }
                    System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                    cho4=Integer.parseInt(ab.readLine());
                }while(cho4!=0);
            }
        }catch(Exception e){}
    }
}
