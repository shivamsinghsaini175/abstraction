package abstraction.src.StreamApi;
import java.util.List;

public class Apis {

    List<String> names = List.of("Udhav", "Shivam", "Saloni", "niharika", "Sam Boxer");

//        names.stream()
//                    .filter(n -> n.startsWith("S"))
//                    .map(String::toUpperCase)
//                    .sorted()
//                    .forEach(n -> System.out.println(n)) ;

//       List<String>newName= names.stream()
//                .filter(n -> n.startsWith("S"))
//                .map(String::toUpperCase)
//                .sorted()
//                .collect(Collectors.toList()) ;
//        System.out.println(newName);

    long newNamescount = names.stream()
            .filter(n -> n.startsWith("A"))
            .map(String::toUpperCase)
            .sorted()
            .count();


//         System.out.println(newNamescount);

//        List<String> newNamesss = names.stream()
//                .peek(System.out::println).toList();
//
//        System.out.println(newNamesss.size());

  //  List<Integer> num =  Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);





}
