import java.util.*;
public class date 
{
    public void date1()
    {
        Calendar c= Calendar.getInstance();
        System.out.println("\t"+"\t"+"\t"+"\t"+"\t"+c.get(Calendar.DATE)+"-"+ 
            (c.get(Calendar.MONTH)+1)+"-"+c.get(Calendar.YEAR));
    }
}
