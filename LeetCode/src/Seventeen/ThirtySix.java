package Seventeen;

public class ThirtySix {
    public String maximumTime(String time) {

        String a[]= time.split(":");
        char a1[]=  a[0].toCharArray();
        char a2[]=  a[1].toCharArray();
        if(a1[0]=='?'&&(a1[1]=='?'||('0'<=a1[1]&&a1[1]<='3')))
        {
            a1[0]='2';
            if(a1[1]=='?')
            {
                a1[1]='3';
            }
        }else if(a1[0]=='?'&&('4'<=a1[1]))
        {
            a1[0]='1';
        }else if(a1[1]=='?'&&a1[0]=='2')
        {
            a1[1]='3';
        }else if(a1[1]=='?')
        {
            a1[1]='9';
        }
        if(a2[0]=='?')
        {
            a2[0]='5';
        }
        if(a2[1]=='?')
        {
            a2[1]='9';
        }
        StringBuffer aa = new StringBuffer();
        aa.append(a1);
        aa.append(":");
        aa.append(a2);
        return aa.toString();

    }
}