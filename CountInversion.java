import java.util.*;

class CountInversion {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.print(CountInversionPair(arr,n));
            sc.close();
        }
    }
    public static int CountInversionPair(int[] arr, int  n){
        if(arr == null){
            return -1;
        }
        if(n < 2){
            return 0;
        }
        return mergeSort(arr,0,n-1);
    }
    public static int mergeSort(int[] arr, int low, int high){
        int cnt = 0;
        if(low >= high) return cnt;
        int mid = (low + high)/2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }
    public static int merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;
        int right = mid+1;

        int cnt = 0;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                cnt += (mid -left +1);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
        return cnt;
    }
}
