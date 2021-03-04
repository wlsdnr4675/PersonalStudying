//package Second;
//
//import java.util.Arrays;
//import java.util.Random;
//
//public class Lotto1_shuffle {
//    public static void main(String[] args) {
//       int [] number = new int[45];
//       int [] selected_number = new int[6];
//       for(int i = 0; i < number.length; i ++){
//           number [i] = i + 1;
//       }
//       int temp = 0;
//       int j = 0;
//       for(int i =0; i < 6; i++){
//           j = (int)(Math.random() *45);
//           temp = number[i];
//           number[i] = number[j];
//           number[j] = temp;
//       }
//       System.arraycopy(number,0,selected_number,0,selected_number.length);
//        Arrays.sort(selected_number);
//        for(int i = 0; i <6; i++){
//            System.out.println("selected_number[%d] = %d%n",i,selected_number[i]);
//        }
//     }
//}
