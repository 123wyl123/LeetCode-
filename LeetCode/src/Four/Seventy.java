package Four;

public class Seventy {
    public int rand7()
    {
      return   Math.round(7);
    }
    public int rand10() {
        int a;
        do{
            a= (rand7()-1)*7 +rand7();
        }   while (a>40);

        return a%10 +1;
    }
}
