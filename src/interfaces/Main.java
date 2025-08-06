package abstraction.src.interfaces;

import abstraction.src.entity.MathOperationImplementation;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {


      //  MathOperationImplementation maop = new MathOperationImplementation();
    //    int sum = maop.operate(10, 20);
       // System.out.println(sum);

//        MathOperation add =new MathOperation() {
//
//            public int operate(int a, int b) {
//                return a+b;
//            }
//        };
//
//        MathOperation multi=new MathOperation() {
//            @Override
//            public int operate(int a, int b) {
//                return a*b;
//            }
//        };

        //LAMDA EXPRESSION
//        MathOperation add1= ( a, b)-> a+b;
//
       //   Sumable add2 = Sumable::addddd;
//        MathOperation divi=(a,b)->a/b;
//
        // System.out.println("addition is :" + Sumable.addddd(10,20));
//
//        System.out.println("multiplicatioon is : "+multi.operate(10,20));
//
//        System.out.println("divi is : "+divi.operate(2000,85));


//        Flyable flyable = (name) -> System.out.println(name + " can fly");
//        flyable.flyable("udhav");
//

        Predicate<Integer>EVEN =(n)->n % 2==0;

        System.out.println(EVEN.test(10));
        System.out.println(EVEN.test(7));
//        System.out.println(EVEN.toString());

        Function<Integer,String>concat=(n)->"Number - "+n;
        System.out.println(concat.apply(110));

       // Consumer<String >printerr=(s)-> System.out.println(s);
        Consumer<String>printerr=System.out::println;
        printerr.accept("shivam");


        Supplier<Double> getrandomNumber = Math::random;
        System.out.println(getrandomNumber.get());
    }

}
