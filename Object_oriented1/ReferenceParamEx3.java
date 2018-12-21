package Object_oriented1;

/**
 * Created by bobsang89@gmail.com on 2018-12-20
 * Project: JAVA2
 * Github : http://github.com/SangJun-GitHub
 */
public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("arr sum : " + sumArr(arr));
    }

    static void printArr(int[] arr){
        System.out.print("[");
       for (int i : arr) //For-each loop
           System.out.print(i + ",");
        System.out.println("]");
    }
    static int sumArr(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++)
            result += arr[i];
        return result;
    }
    static void sortArr(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = 0; j < arr.length-1 -i; j++){
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

}
