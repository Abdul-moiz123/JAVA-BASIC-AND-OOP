public class ASSE {

    public static int binary(int [] array,int target){
        int left=0;
        int right = array.length-1;


        while(left<=right){
            int mid = (left+right)/2;

            if(array[mid]==target){
                return mid;
            } else if (array[mid]<target) {
                left = mid+1;
            }else{
                right=mid-1;
            }
        }
        return 1;
    }


    public static void main(String[] args) {
//        int [] array={2,45,64,4,5,6,3,67,7};
//        int a = 7;
//        int i = 0;
//
//        for( ; i< array.length ; i++ ){
//            if(array[i]==a){
//                System.out.println("the number found at: "+i);
//                break;
//            }
//        }


        int [] array= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 6;

        int result = binary(array,target);

        if(result!=1){
            System.out.println(result);
        }else{
            System.out.println("not");
        }


        }

    }


