package Five;

public class FiftyYThree {
    public String optimalDivision(int[] nums) {
        double max[][]=new double[nums.length][nums.length];
        double min[][]=new double[nums.length][nums.length];

        for (int i = 0; i <nums.length ; i++) {
            max[i][i]=nums[i];
            min[i][i]=nums[i];
        }
        for (int i = 1; i <nums.length ; i++) {
            for (int j = 0; j <nums.length-i ; j++) {
                max[j][j+i]=Math.max(nums[j]/min[j+1][j+i],max[j][j+i-1]/nums[j+i]);
                min[j][j+i]=Math.min(nums[j]/max[j+1][j+i],min[j][j+i-1]/nums[j+i]);
            }
        }
    return dfs(max,min,nums,0,nums.length-1,max[0][nums.length-1]);
    }

    public String dfs(double [][] max,double [][] min,int [] nums,int i,int j,double sum)
    {
        StringBuffer stringBuffer = new StringBuffer();
        if (i==j)
        {
            stringBuffer.append(nums[i]);
            return stringBuffer.toString();
        }
        if (sum==nums[i]/min[i+1][j])
        {   stringBuffer.append(nums[i]);
            stringBuffer.append("/");
            String temp = dfs(max,min,nums,i+1,j,min[i+1][j]);
            if (i+1==j)
            {
                stringBuffer.append(temp);
            }else
            {
                stringBuffer.append("(");
                stringBuffer.append(temp);
                stringBuffer.append(")");
            }


        }else if (sum==max[i][j-1]/nums[j])
        {
            String temp = dfs(max,min,nums,i,j-1,max[i][j-1]);
            stringBuffer.append(temp);
            stringBuffer.append("/");
            stringBuffer.append(nums[j]);
        }else if (nums[i]/max[i+1][j]==sum)
        {   stringBuffer.append(nums[i]);
            stringBuffer.append("/");
            String temp = dfs(max,min,nums,i+1,j,max[i+1][j]);
            if (i+1==j)
            {
                stringBuffer.append(temp);
            }else
            {
                stringBuffer.append("(");
                stringBuffer.append(temp);
                stringBuffer.append(")");
            }

        }else
        {
            String temp = dfs(max,min,nums,i,j-1,min[i+1][j]);
            stringBuffer.append(temp);
            stringBuffer.append("/");
            stringBuffer.append(nums[j]);
        }
        return stringBuffer.toString();
    }

}