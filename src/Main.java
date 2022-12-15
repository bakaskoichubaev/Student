import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(List.of(
                new Student("Asman", 25, Gender.MALE, 1000, "Bulutov"),
                new Student("Aiperi", 16, Gender.FEMALE, 5000, "Mokenova"),
                new Student("Bolot", 62, Gender.MALE, 1100, "Bekenov"),
                new Student("Aizat", 26, Gender.FEMALE, 4999, "Bapieva")));
        students.stream().filter(strudent -> strudent.getName().startsWith("A")).forEach(System.out::println);
        System.out.println("   2.15 ten chon, 2000den kop         ");
        students.stream().filter(strudent -> strudent.getAge() > 15).filter(strudent -> strudent.getMoney() > 2000).forEach(System.out::println);
        System.out.println("            3.Bogatyi                ");
        System.out.println(students.stream().max(Comparator.comparing(Student::getMoney)));
        System.out.println("           4. Bai kyz                ");
        System.out.println(students.stream().max(Comparator.comparing(Student::getMoney)).filter(strudent -> strudent.getGender().equals(Gender.FEMALE)));
        System.out.println(students.stream().filter(strudent -> strudent.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(Student::getMoney)));
        System.out.println("               5. All Students                ");
        students.stream().forEach(System.out::println);
        System.out.println("                6. All Names");
        students.stream().map(strudent -> strudent.getName()).forEach(System.out::println);
        System.out.println("                 7.kancha student bar");
        System.out.println(students.stream().count());
        System.out.println("                8. birinchi student 707573030       ");
        students.stream().findFirst().ifPresent(System.out::println);
        System.out.println("                 9. studennterge +1000     ");
        students.stream().map(strudent -> strudent.getMoney()+1000).forEach(System.out::println);
    }
}