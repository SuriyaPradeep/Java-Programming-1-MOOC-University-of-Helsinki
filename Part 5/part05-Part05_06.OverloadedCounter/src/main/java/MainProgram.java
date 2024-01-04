
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter count1=new Counter();
        Counter count2=new Counter(1);
        System.out.println("Counter 1:"+count1.value());
        System.out.println("Counter 2:"+count2.value());
        count1.increase();
        count2.increase(4);
        count1.decrease(5);
        count2.decrease();
        System.out.println("Counter 1:"+count1.value());
        System.out.println("Counter 2:"+count2.value());
    }
}
