import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.*;

public class tester {
 public interface CanFly {

 void fly();

 }

 interface HasWings {

 public abstract Object getWingSpan();

 }

 abstract class Falcon implements CanFly, HasWings {

 }

}






//public interface Climb {
//
//    boolean isTooHigh(int height, int limit);
//
//}
//
//public static class Climber {
//
//    public static void main(String[] args) {
//
//        check((h, l) -> h < l, 5); // x1
//
//    }
//
//    private static void check(Climb climb, int height) {
//
//        if (climb.isTooHigh(height, 10)) // x2
//
//            System.out.println("too high");
//
//        else System.out.println("ok");
//
//    } }







//static class Panda {
//
//    int age;
//
//    public static void main(String[] args) {
//
//        Panda p1 = new Panda();
//
//        p1.age = 8;
//
//        check(p1, p -> p.age < 5); // h1
//
//    }
//
//    private static void check(Panda panda, Predicate<Panda> pred) { // h2
//
//        String result = pred.test(panda) ? "match": "not match"; // h3
//
//        System.out.print(result);
//
//    } }




