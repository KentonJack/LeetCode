class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        if(needle.equals(""))
            return 0;
        for(i = 0; i < haystack.length() - needle.length() + 1; i++)
        {
            if(needle.substring(0, 1).equals(haystack.substring(i, i + 1)))
            {
                if(haystack.substring(i, i + needle.length()).equals(needle))
                    return i;
            }
        }
        return -1;
    }
}