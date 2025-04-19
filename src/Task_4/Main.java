package Task_4;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        String str = " ";
        int numb = 0;
        for (int first = 999; first >= 10 ; first--) {
            for (int last = 999; last >= 10 ; last--) {
                count = first * last;
                //System.out.println(count);
                str = Integer.toString(count);
                StringBuilder sb = new StringBuilder(str);
                sb.reverse();
                String reversedStr = sb.toString();
                if (reversedStr.equals(str)){
                    //System.out.println("то самое число " + str);
                    //break;
                    if (count > numb){
                        numb = count;
                        System.out.println("то самое число " + numb);
                    }
                }

            }
        }
        
    }
}
