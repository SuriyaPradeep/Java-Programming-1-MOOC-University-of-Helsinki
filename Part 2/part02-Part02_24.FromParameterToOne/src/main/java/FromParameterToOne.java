
public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number) {
        for (; number >= 1; number--) {
            System.out.println(number);
        }
    }

}
