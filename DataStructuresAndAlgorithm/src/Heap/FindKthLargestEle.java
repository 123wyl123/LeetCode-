package Heap;

public class FindKthLargestEle {
    public int FindKth(Heap Horig,int k )
    {
        Heap Haux=null;
        int heapElement;
        int count = 1;
        Haux.insert(Horig.DeleMin());
        while (true)
        {
            heapElement = Haux.DeleMin();
            if(++count==k)
            {
                return heapElement;
            }
            else
            {
              //插入HO中最小元素的左右孩子到HA中
//                Haux.insert(heapElement.Leftchild);
//                Haux.insert(heapElement.rightChild);
            }
        }
    }
}
