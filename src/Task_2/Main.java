package Task_2;

public class Main {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        int summ = 0;
        for (int thrd = 0; thrd < 4000000;) {
            System.out.println(second);
            thrd = first + second;
            first = second;
            second = thrd;
            if ( first % 2 ==0){
                summ = summ + first;
                System.out.println("сумма чётных " + summ);
            }

        }
        System.out.println("итоговая сумма: " + summ);
    }
}
