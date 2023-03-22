# BIGBANG
Javascript coding on how to code bigbang quest.

I'm using NetBeans IDE 8.0.2 to do this code.
So firstly, create a new project for Java named as BigBang. The file project will be ready ang the code can be started written.

As for the coding, assign an array integer int[] num that holds size index of 100 which is - new [100].
Then assign each array with number by creating a looping that loop less than array num's length which is for(int i=0; i<num.length; i++) that have num[i]=i+1 as the assignation for each index. This will give the array number 1,2,3 until 100.
After assigning each array, create a condition that check on each array if it devisible by 3 or 5 or both of them or not.

If it not devisible by 3 or 5, the system will display the array num as usual. 
            if(num[i]%3!=0 && num[i]%5!=0)
            {
                System.out.print("\""+num[i]+"\"");
            }
            
But if the number divisible by 3 only, the system will display "BIG".
            if(num[i]%3==0 && num[i]%5!=0)
            {
                System.out.print("\"BIG\"");
            }

But if the number divisible by 5 only, the system will display "BANG".
            if(num[i]%5==0 && num[i]%3!=0)
            {
                System.out.print("\"BANG\"");
            }
            
But if the number divisible by 3 & 5, the system will display "BIGBANG".
            if(num[i]%3==0 && num[i]%5==0)
            {
                System.out.print("\"BIGBANG\"");
            }

So when the system is run, it will display the wanted result acccording to condition wanted.
