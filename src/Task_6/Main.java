package Task_6;

public class Main {
    public static void main(String[] args) {
        int sum_squ = 0;
        int squ_sum = 0;
        for (int i = 1; i < 101; i++) {
            sum_squ = (i * i) + sum_squ;
            //System.out.println("сумма квадратов" + sum_squ);
        }
        for (int i = 1; i < 101; i++) {
            squ_sum = i + squ_sum;
        }
        squ_sum = squ_sum * squ_sum;
        System.out.println(squ_sum - sum_squ);
    }
}
