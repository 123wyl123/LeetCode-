package TwoFiveTwo;

public class Three {
    public long minimumPerimeter(long neededApples) {
      long sum=0;
      long temp=2;
      while (sum<neededApples)
      {
          sum=temp*4*(temp/2)+sum;
          long temp1=4*2*((temp/2)-1)*(1+(temp/2)-1)/2;
            sum+=temp1;
            sum=sum+4*(temp/2);
            temp+=2;
      }
      return (temp-2)*4;
    }

    public static void main(String[] args) {
        new Three().minimumPerimeter(1000000000);
    }
}
