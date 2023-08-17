public class bs {
    public static void main(String[] args) {
        
    }
    static int binarySearch(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;

        
        while(start<= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;

            } else if(target> nums[mid]){
                start = mid+1;
            } else{
                return mid;
            }
                    
            }
        return end;
            

        }
    }




    // bs in infinite sorted array

    static int ans(int [] arr , int target){
        int start =0;
        int end = 1;

        //condition to lie on range
        while(target > arr[end]){
                int newStart = end+1;
                end = end+(end-start) *2;
                start = newStart;
        }
        return binarysearch(arr,  target ,  start , end);
    }
            static int binarysearch(int [] arr, int target , int start , int end){
            while(start<=end){
                int mid = start+ (end-start)/2;

                if(target < arr[mid]){
                    end = mid-1;
                }  else if(target> arr[mid]){
                    start = mid+1;
                } else{
                    return mid;
                }
            }
            return -1;
        }
    
        //finding peak index using bs

        public int peakIndex(int [] arr){
            int start =0;
            int end = arr.length-1;
            while (start<=end){
                int mid = start + (end-start)/2;

                if(arr[mid]> arr[mid+1]){
                    end = mid;
                } else{
                    start = mid+1;
                }
            }
            return start;

        }
    

    

    
