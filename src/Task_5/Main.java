package Task_5;

public class Main {
    public static void main(String[] args) {
        int i = 2520;
        while (true){
            i++;
            if (i % 20 == 0 && i % 19 == 0){
                if (i % 18 == 0 && i % 17 == 0 && i % 14 == 0){
                    if (i % 16 == 0 && i % 15 == 0 && i % 13 == 0 && /*i % 12 == 0 && */ i % 11 == 0) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}
