import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {


    public static void main(String[] args) {

        //Fase 1 - point 1
        List<String> names = Arrays.asList("Sandra", "Ana", "Ada", "Kevin", "Theodore",
                "Victoria", "Anna", "Angela", "Rita", "Steve","Leonor", "Rose");

        List<String> fase1Point1 = names.stream().filter(letter -> letter.startsWith("a".toUpperCase()))
                .filter(letter ->letter.length()< 4).collect(Collectors.toList());
        System.out.println(fase1Point1);


        //Fase 1 - point 2
        List<Integer> numbers = Arrays.asList(9, 86, 42, 17, 12, 24, 36, 48);

        List<String> fase1Point2 = numbers.stream().map(num -> {if(num%2==0) return("e"+num);
        else return("o"+num);
        }).collect(Collectors.toList());

        System.out.println(fase1Point2);


        //Fase 1 - point 3
        List<String> fase1point3 = names.stream().filter(word -> word.contains("o"))
                .collect(Collectors.toList());

        System.out.println(fase1point3);


        //Fase 1 - point 4
        List<String> fase1point4 = names.stream().filter(word -> word.contains("o"))
                .filter(name -> name.length() > 5).collect(Collectors.toList());

        System.out.print(fase1point4);



        //Fase 1 - point 5
        List<String> months = Arrays.asList("enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
                "agosto", "septiembre", "octubre", "noviembre", "diciembre");

             months.forEach(month -> System.out.print(month+", "));


       //Fase 1 - point 6
        printMonths(months);


        //Fase 2
        IFunctional piValue = () -> 3.1415;
        System.out.println (piValue.getPiValue());


        //Fase 3
        IReverse reverseWord = (word) -> {
            StringBuilder builder = new StringBuilder(word);
            return builder.reverse().toString();
        };
        System.out.println(reverseWord.reverse("alrevés"));

    }

    //method for excercise Fase1 point6
    public static void printMonths(List<String> list) {
        list.forEach(m -> System.out.print(m+", "));
        System.out.println("");
    }

        }