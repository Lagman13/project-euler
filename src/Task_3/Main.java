package Task_3;

public class Main {
    public static void main(String[] args) {
        long number = 600851475143L;
        int count = 2;


        while (true) {
            if (number % count == 0){
                number = number / count;
                if (number == 1){
                    System.out.println(count);
                    break;
                }
            } else {
                count ++;
            }
        }

        /* long i = 600851475143L;
        while (true){
            i--;
            if ( i % 2 !=0 && i % 3 !=0 && i % 5 != 0 && i % 7 != 0 && i % 13 != 0 ){
                if ( number % i == 0 ) {
                    System.out.println(i);
                    break;
                    }
                }
        }
        /* for (long i = 0; i <= number; i++) {
            if ( i % 2 !=0 && i % 3 !=0 && i % 5 != 0 && i % 7 != 0 ){
                if ( number % i == 0 ) {
                    System.out.println(i);
                }
            }
        } */

    }
}
