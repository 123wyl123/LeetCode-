#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        int r = nums.size();
        quick_sort(nums,0,r,r-k);
        return nums[r-k-1];
    }

void quick_sort(vector<int>& nums,int l ,int r,int k)
{
   if(l>=r)
   {
       return ;
   }
    int x = nums[l] , i = l-1,j=r+1;
    while(i<j)
    {
        do
        {
            i++;
            /* code */
        } while (nums[i]<x);
             do
        {
            j--;
            /* code */
        } while (nums[j]>x);

        if(i<j)
        {
            swap(nums,i,j);
        }

    }
    if(j<k)
    {
        quick_sort(nums,j+1,r,k);
    }else
    {
        quick_sort(nums,l,j,k);
    }

}

void swap(vector<int>& nums,int l ,int r)
{
    int temp = nums[l];
    nums[l]=nums[r];
    nums[r]=temp;
}
};