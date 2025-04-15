class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int len =nums1.length;
        int[] pos=new int[len];
        BinaryIndexTree bit = new BinaryIndexTree(len);

        for(int i=0;i<len;++i){
            pos[nums2[i]]=i+1;
        }
        long sumGoodTriplets=0;
        for(int num:nums1){
            int index=pos[num];
            long leftCount=bit.query(index);
            long rightCount=len-index-(bit.query(len)-bit.query(index));

            sumGoodTriplets+=leftCount*rightCount;
            bit.update(index,1);
        }
        return sumGoodTriplets;
    }
}

class BinaryIndexTree {
    private int size; 
    private int[] tree; 
    public BinaryIndexTree(int size) {
        this.size = size;
        tree = new int[size + 1];
    }
    public void update(int index, int delta) {
        while (index <= size) {
            tree[index] += delta;
            index += lowbit(index); 
        }
    }
    public int query(int index) {
        int sum = 0;
        while (index > 0) {
            sum += tree[index];
            index -= lowbit(index); 
        }
        return sum;
    }
    public static int lowbit(int value) {
        return value & -value;
    }
}