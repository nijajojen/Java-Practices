package leetcode;

public class StringPermutation {
	public static void main(String[] args)
    {
		String str = "ABC";
        int n = str.length();
        StringPermutation permutation = new StringPermutation();
        permutation.permute(str, 0, n-1);
    }
	private void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
	
	 public String swap(String a, int i, int j)
	    {
		 System.out.println("in swap: "+a);
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        System.out.println("Ater Swap: "+a);
	        return String.valueOf(charArray);
	    }
	 
}
