package Three;

public class FourtyFive {
    public String reverseVowels(String s) {
    char a[]=  s.toCharArray();
    int l=0;
    int r =s.length()-1;
            while(l<r)
    {
        while((l<r)&&((a[l]!='a'&&a[l]!='e'&&a[l]!='i'&&a[l]!='o'&&a[l]!='u'&&a[l]!='A'&&a[l]!='E'&&a[l]!='I'&&a[l]!='O'&&a[l]!='U')))
        {
            l++;
        }
        while((r>=l)&&(a[r]!='a'&&a[r]!='e'&&a[r]!='i'&&a[r]!='o'&&a[r]!='u')&&(a[r]!='A'&&a[r]!='E'&&a[r]!='I'&&a[r]!='O'&&a[r]!='U'))
        {
            r--;
        }
        if(l<r)
        {
            char temp = a[l];
            a[l]=a[r];
            a[r]=temp;
        }
        l++;
        r--;
    }
        return new String(a);
}

    public static void main(String[] args) {
        new FourtyFive().reverseVowels("hello");
    }
}