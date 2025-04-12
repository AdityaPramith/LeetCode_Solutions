class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            count+=isSymmetric(i);
         }
        return count;
    }
    private int isSymmetric(int num){
        String numInStr=Integer.toString(num);
        int length=numInStr.length();
        if(length%2==1){
            return 0;
        }
        int fstHlfSum=0;
        int scndHalfSum=0;
        for(int i=0;i<length/2;++i){
            fstHlfSum+=numInStr.charAt(i)-'0';
        }
        
        for(int i=length/2;i<length;++i){
            scndHalfSum+=numInStr.charAt(i)-'0';
        }
        return fstHlfSum==scndHalfSum?1:0;
    }
}