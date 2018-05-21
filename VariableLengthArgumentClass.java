import java.util.Scanner;

public class VariableLengthArgumentClass {
    public static void main(String[] args) {
     Test test = new Test();
        test.add(10,20,30);
    }


}
class Test{
    int n,sum = 0;

    void add(int ... num){
        for (int x:num) {
            sum = sum + x;
        }
        System.out.println("Sum is : "+sum);
    }
}
