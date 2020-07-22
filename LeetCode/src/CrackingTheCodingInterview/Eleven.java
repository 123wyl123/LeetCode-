package CrackingTheCodingInterview;

public class Eleven {
    public int minArray(int[] numbers) {
       int i =0;
       int j=numbers.length-1;
       if(numbers[i]<numbers[j])
       {
           return numbers[i];
       }
       while (i<j)
       {
           if(numbers[i]>=numbers[j])
           {
               int mid = (i+j+1)/2;
               if(numbers[mid]<numbers[j])
               {
                   j = mid;
               } else if(numbers[mid]>numbers[j])
               {
                   i =mid;
               } else
               {
                   j--;
               }
               if(j-i==1)
           {
               return numbers[j];
           }
           } else
           {
               return numbers[i];
           }


       }
       return numbers[i];
    }

    public static void main(String[] args) {
        int a[] ={3,1};
        new Eleven().minArray(a);
    }
}
