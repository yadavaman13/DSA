//lc #34 - find the 1st and last ocurrence of the target in given sorted array nums

class flPosition {

    //function to return index of 1st and last ocurrence of target
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        ans[0] = search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = search(nums, target, false);
        }
        
        for(int i=0; i<2; i++){
            System.out.println(ans[i]);
        }
        return ans;
    }

    //function to find the index of target
    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                ans  = mid;
                if(findStartIndex){
                    end  = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }


    //main method
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,10};

        searchRange(nums,7);
    }
}