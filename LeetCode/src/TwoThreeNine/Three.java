package TwoThreeNine;

import java.util.HashMap;

public class Three {
    public int getMinSwaps(String num, int k) {

        char[] temp = num.toCharArray();

        for(int i = 0; i < k; i++)
            nextPermutation(temp);

        return count(num.toCharArray(), temp, temp.length);
    }
    public void nextPermutation(char[] a) {
        int i = a.length - 2;
        //Find the first element which isn't in increasing order fom behind
        while (i >= 0 && a[i] >= a[i + 1])
            i--;
        //If we found an element 
        if (i >= 0){
            // Find the rightmost element such that a[j] > a[i]
            int j = bSearch(a, i + 1, a.length - 1, a[i]);
            // swap a[i] and a[j]
            a[i] = (char)(a[i] ^ a[j] ^ (a[j] = a[i]));
        }
        //reverse array from i + 1 till end
        reverse(a, i + 1, a.length - 1);
    }

    public static int bSearch(char a[], int i, int j, char key) {
        while (i <= j) {
            int mid = (i + j) >>> 1;

            if (key < a[mid])
                i = mid + 1;
            else
                j = mid - 1;
        }
        return i - 1;
    }

    public void reverse(char[] a, int i, int j) {
        while(i < j)    a[i] = (char)(a[i] ^ a[j] ^ (a[j--] = a[i++]));
    }

//    int count(char []s1, char[] s2, int n){
//        int i = 0, j = 0, res = 0;
//
//        while (i < n){
//            j = i;
//
//            while (s1[j] != s2[i]) j++;
//
//            while (i < j){
//                char temp = s1[j];
//                s1[j] = s1[j - 1];
//                s1[j-- - 1] = temp;
//                ++res;
//            }
//            ++i;
//        }
//        return res;
//    }
   
    
int count(char []s1, char[] s2, int n){
    HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
    int a[] = new int[s1.length];
    for (int i = 0; i <s2.length ; i++) {
        characterIntegerHashMap.put(s2[i],characterIntegerHashMap.getOrDefault(s2[i],0)+1);
        Integer integer = characterIntegerHashMap.get(s2[i]);
        for (int j =0 ; j <s1.length ; j++) {
           if (s1[j]==s2[i])
           {
               integer--;
               if (integer==0)
               {
                   a[i]=j;
                   break;
               }
           }
        }
    }
    int temp =0;
    for (int i = 0; i <a.length ; i++) {
        for (int j = i+1; j <a.length ; j++) {
            if (a[j]<a[i])
            {
                temp++;
            }
        }
    }
    return temp;
}

    public static void main(String[] args) {
        new Three().getMinSwaps("5489355142",
                4);
    }
}