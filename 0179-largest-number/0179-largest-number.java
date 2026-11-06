class Solution {
    public String largestNumber(int[] nums) {
        String[] numbers=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            numbers[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers.length-1;j++)
            {
                String first=numbers[j]+numbers[j+1];
                String second=numbers[j+1]+numbers[j];
                if(first.compareTo(second)<0)
                {
                    String temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        if(numbers[0].equals("0"))
        {
            return "0";
        }
        StringBuilder result=new StringBuilder();
        for(String number:numbers)
        {
            result.append(number);
        }

        return result.toString();
    }
}