public class MinPlatform(Greedy) {
    static int findPlatform(int a[], int d[],int n ){
        Arrays.sort(a);
        Arrays.sort(d);
        int ans = 0;
        int count = 0;
         int i=0; int j =0;
         while(i<n){
            if(a[i]<= d[j])
            count++;
            ans = Math.max(ans,count);
            i++;
         } else if(a[i]  > d[j]){
            count --;
            j++;
         }
    }
    return ans;
}

