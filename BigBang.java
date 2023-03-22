
package bigbang;


public class BigBang {
   

    public static void main(String[] args)
    {
        //declare integer array for number
        int[] num = new int[100];
        
        for(int i=0; i<num.length; i++)
        {
            num[i] = i+1;
            
            if(num[i]%3!=0 && num[i]%5!=0)
            {
                System.out.print("\""+num[i]+"\"");
            }
            if(num[i]%3==0 && num[i]%5!=0)
            {
                System.out.print("\"BIG\"");
            }
            if(num[i]%5==0 && num[i]%3!=0)
            {
                System.out.print("\"BANG\"");
            }
            if(num[i]%3==0 && num[i]%5==0)
            {
                System.out.print("\"BIGBANG\"");
            }
            if(num[i]!=num.length)
            {
                System.out.print(", ");
            }
        }
    }
}

