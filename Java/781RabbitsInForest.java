class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> colourMap=new HashMap<>();
        int totalRabbits=0;
        for(int i: answers){
                colourMap.put(i,colourMap.getOrDefault(i, 0) + 1);
                
        }    

        for(Map.Entry<Integer,Integer> p : colourMap.entrySet()){
            totalRabbits+=Math.ceil((double) p.getValue() / (p.getKey() + 1)) * (p.getKey() + 1);
        } return totalRabbits;
    }
}
