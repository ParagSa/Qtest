public class parag {
    public static void main(String[] args) {
        int[] arr = {30,49,80,12,45};
        int result = binary(arr, 80);
        if(result==-1){
            System.out.println("not present");

        }else{
            System.out.println("prsent");

        }


        // for(int i = 0; i<arr.length;i++){
        //     if(arr[i]==search){
        //         System.out.println("present");
        //     }
           

        // }
    }
    public static int binary(int arr[],int x){
        int left = 0; 
        int right = arr.length-1;
        while(left<=right){
            int mid = left +(right-left)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                left = mid+1;


            }else{
                right = mid-1;
            }

        }
        return -1;

    }

    
}