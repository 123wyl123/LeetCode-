package CrackingTheCodingInterview;

public class SeventeenFourteen {
    public int[] smallestK(int[] arr, int k) {
        sort(arr);
        int a[]=new int [k];
        for (int i = 0; i <k ; i++) {
            a[i]=arr[i];
        }
        return a;
    }
    public void sort(int arr[])
    {
        buildheap(arr);
        int len = arr.length-1;
        for (int i =len ; i >0 ; i--) {
            swap(arr,i,0);
            len--;
            hepify(arr,0,len);
        }
    }
    public void buildheap(int arr[])
    {
        for (int i = arr.length/2; i >=0 ; i--) {
            hepify(arr,i,arr.length-1);
        }
    }

    public void hepify(int[] arr ,int i,int len)
    {
        for (; (i<<1)+1<=len ; ) {
            int large;
            int left= (i<<1)+1;
            int right=(i<<1)+2;
            if (left<=len&&arr[left]>arr[i])
            {
                large=left;
            }else
            {
                large=i;
            }
            if (right<=len&&arr[right]>arr[large])
            {
                large=right;
            }
            if (large!=i)
            {
                swap(arr,i,large);
                i=large;
            }else
            {
                return;
            }
        }
    }
    public void swap(int arr[],int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int[] smallestK1(int[] arr, int k) {
        quicksort(arr,0,arr.length-1);
        int a[]=new int [k];
        for (int i = 0; i <k ; i++) {
            a[i]=arr[i];
        }
        return a;
    }

    public void quicksort(int []arr ,int l,int r)
    {
        if (l<r)
        {
            int pos = partion(arr,l,r);
            quicksort(arr,l,pos-1);
            quicksort(arr,pos+1,r);
        }

    }
    public int partion(int arr[],int l,int r)
    {   int pivot=arr[r];
        int i =l-1;
        for (int j = l; j <r ; j++) {
            if (arr[j]>pivot)
            {
                continue;
            }else
            {
                i=i+1;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }
}
