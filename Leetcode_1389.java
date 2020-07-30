public class Leetcode_1389{
	public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list=new ArrayList();
        int[] target = new int[index.length];
        int l=nums.length;
        for(int i=0;i<l;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<l;i++){
            target[i]=list.get(i);
        }
        return target;
    }
}