import java.lang.*;
import java.io.*;
public class mainmenu extends southindian
{
    static int bill=0;
    public static void main(String[]args)throws IOException
    {
        double total=0;
        double final_amount=0;
        double discount=0;
        double Famount=0;
        int j=0;
        try
        {
            String itemname[] = new String[10];
            int rate[]=new int[10];
            int qty[]=new int[10];
            {
                BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
                {
                    System.out.println("~~~~~~~~~~~~  WELCOME TO KJSIEIT CANTEEN  ~~~~~~~~~~~~~ ");
                    System.out.println("~~~~~~~~~~~~  MENU ALL IN YOUR SERVICE   ~~~~~~~~~~~~~~");
                    System.out.println("Please Enter Your Name");
                    String nam=buf.readLine();
                    {
                        do
                        {
                            System.out.println(" 1.All the way from South India"); 
                            System.out.println(" 2.From Pav Bhaji Corner"); 
                            System.out.println(" 3.Punjab da dhaba"); 
                            System.out.println(" 4.Roti Ki Tokri Se");
                            System.out.println(" 5.Beverages");  
                            System.out.println("Kindly Enter Your Choice");
                            String x=buf.readLine();
                            int choice=Integer.parseInt(x);
                            switch(choice)
                            {
                                case 1:
                                    southindian sou = new southindian();
                                    sou.menu1();
                                    break;
                                case 2:
                                    pavbhaji pav = new pavbhaji();
                                    pav.menu2();
                                    break;
                                case 3:
                                    Punjab pun = new Punjab();
                                    pun.menu3();
                                    break;
                                case 4:
                                    roti rot = new roti();
                                    rot.menu4();
                                    break;
                                case 5:
                                    beverages bev = new beverages();
                                    bev.menu5();
                                    break;
                                default: System.out.println("Invalid choice");
                                    break;
                            }
                            System.out.println("Would you like to buy anything else(1-Yes  0-No)");
                            j=Integer.parseInt(buf.readLine());
                        }while(j!=0);
                    }
                }
                if(j==0)
                {
                    total=southindian.amount1+pavbhaji.amount2+Punjab.amount3+roti.amount4+beverages.amount5;
                }
            }
        }catch(Exception e){}
        if(total>1500)
            discount=0.1*total;
        else if(total>2500)
            discount=0.15*total;
        final_amount=total-discount;
        double tax=0.04*final_amount;
        Famount=final_amount + tax;
        date date2 = new date();
        date2.date1();
        System.out.println(" <<<<<<<<<<<------Bill no.------>>>>>>>>>>>   "+(bill++) );
        System.out.println(" *****************************************************  ");
        System.out.println("                Item"+"\t\t"+"Qty"+"\t\t"+"Price  ");
        System.out.println("=================================================");
        for(int i=0;i<=5;i++)
        {
            if(southindian.qty1[i]>0)
            {
                System.out.println(southindian.z11[i]+ "\t\t"+southindian.qty1[i]+ "\t\t"+southindian.price1[i]);
            }
        }
        for( j=0;j<=5;j++)
        {
            if(pavbhaji.qty2[j]>0)
            {
                System.out.println(pavbhaji.z22[j]+ "\t\t"+pavbhaji.qty2[j]+ "\t\t"+pavbhaji.price2[j]);
            }
        }
        for(int o=0;o<=5;o++)
        {
            if(Punjab.qty3[o]>0)
            {
                System.out.println(Punjab.z33[o]+"\t\t"+Punjab.qty3[o]+"\t\t"+Punjab.price3[o]);
            }
        }
        for(int t=0;t<=5;t++)
        {
            if(roti.qty4[t]>0)
            {
                System.out.println(roti.z44[t]+"\t\t" +roti.qty4[t]+"\t\t"+roti.price4[t]);
            }
        }
        for(int p=0;p<=5;p++)
        {
            if(beverages.qty5[p]>0)
            {
                System.out.println(beverages.z55[p]+"\t\t" +beverages.qty5[p]+"\t\t"+beverages.price5[p]);
            }
        }
        System.out.println("  Discount is Rs.  "+discount);
        System.out.println("  Tax is Rs.  "+tax + "\n" +"\n");          
        System.out.println("  Total Amount with tax is Rs. "+Famount);
        System.out.println("         --------------Thank you------------                              ");
        System.out.println("         ********Please visit again*********                    ");    
    }
}
