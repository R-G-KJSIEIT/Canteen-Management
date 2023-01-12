import java.lang.*;
import java.io.*;
public class Punjab
{
    public static String z33[]=new String[6];
    public static int amount3=0;
    public static int rate3[]=new int[6];
    public static int price3[]=new int[6];
    public static int choice3=0;
    public static int qty3[]=new int [6];
    public void menu3()
    {
        int cho3=0;
        int c=0;
        try
        {
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader ab=new BufferedReader(isr);
            {
                do
                {
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~Punjab da dhaba~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
                    System.out.println("1.Chana Masala..............................................40.00");  
                    System.out.println("2.Alu Mutter................................................44.00");  
                    System.out.println("3.Mutter Panner.............................................54.00"); 
                    System.out.println("4.Paneer Butter Masala......................................50.00");  
                    System.out.println("5.Chole Bhuture.............................................45.00"); 
                    System.out.println("6.Veg. Kholhapuri...........................................60.00");
                    System.out.println("7.Veg. Hyderabadi...........................................55.00");
                    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                    String y3=buf.readLine();
                    int choice3=Integer.parseInt(y3);
                    String z3[]={"Chana Masala","Alu Mutter","Mutter Panner","Paneer Butter Masala","Chole Bhuture","Veg. Kholhapuri","Veg. Hyderabadi"};
                    int rate3[]={40,44,54,50,45,60,55};
                    if(choice3==1)
                    {
                        z33[0]="Chana Masala";
                        System.out.println("Enter Quantity");
                        y3=buf.readLine();
                        qty3[0]=qty3[0] + Integer.parseInt(y3);
                        System.out.println("You have purchased "+qty3[0]+" Chana Masala for Rs."+rate3[0]*qty3[0]);
                    }
                    if(choice3==2)
                    {
                        z33[1]="Alu Mutter";
                        System.out.println("Enter Quantity");
                        y3=buf.readLine();
                        qty3[1]=qty3[1]+Integer.parseInt(y3);
                        System.out.println("You have purchased "+qty3[1]+" Alu Mutter for Rs."+rate3[1]*qty3[1]);
                    }
                    if(choice3==3)
                    {
                        z33[2]="Mutter Panner";
                        System.out.println("Enter Quantity");
                        y3=buf.readLine();
                        qty3[2]=qty3[2]+Integer.parseInt(y3);
                        System.out.println("You have purchased "+qty3[2]+" Mutter Panner for Rs."+rate3[2]*qty3[2]);
                    }
                    if(choice3==4)
                    {
                        z33[3]="Paneer Butter Masala";
                        System.out.println("Enter Quantity");
                        y3=buf.readLine();
                        qty3[3]=qty3[3]+Integer.parseInt(y3);
                        System.out.println("You have purchased "+qty3[3]+" Paneer Butter Masala for Rs."+rate3[3]*qty3[3]);
                    }
                    if(choice3==5)
                    {
                        z33[4]="Chole Bhuture";
                        System.out.println("Enter Quantity");
                        y3=buf.readLine();
                        qty3[4]=qty3[4]+Integer.parseInt(y3);
                        System.out.println("You have purchased "+qty3[4]+" Chole Bhuture for Rs."+rate3[4]*qty3[4]);
                    }
                    if(choice3==6)
                    {
                        z33[5]="Veg. Kholhapuri";
                        System.out.println("Enter Quantity");
                        y3=buf.readLine();
                        qty3[5]=qty3[5]+Integer.parseInt(y3);
                        System.out.println("You have purchased "+qty3[5]+" Veg. Kholhapuri for Rs."+rate3[5]*qty3[5]);
                    }
                    if(choice3==7)
                    {
                        z33[6]="Veg. Hyderabadi";
                        System.out.println("Enter Quantity");
                        y3=buf.readLine();
                        qty3[6]=qty3[6]+Integer.parseInt(y3);
                        System.out.println("You have purchased "+qty3[6]+" Veg. Hyderabadi for Rs."+rate3[6]*qty3[6]);
                    }    
                    for(c=0;c<6;c++)
                    {
                        price3[c]=rate3[c]*qty3[c];
                        amount3=amount3+price3[c];
                    }
                    System.out.println("Do you wish to buy anything else[1-Yes/0-No]");
                    choice3=Integer.parseInt(ab.readLine());
                }while(cho3!=0);
            }
        }catch(Exception e){}
    }    
}
