import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Person {
 private String name;
    private String dob;

    public Person(String name, String dob) {
     this.name = name;
        this.dob = dob;
 }

    public int calculateAge() {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       LocalDate birthDate = LocalDate.parse(dob, formatter);
     LocalDate currentDate = LocalDate.now();
      return (int) ChronoUnit.YEARS.between(birthDate, currentDate);
}

    public void displayInfo() {
     int age = calculateAge();
     System.out.println("Name: " + name);
        System.out.println("Age: " + age);
}

 public static void main(String[] args) {
        
  String name = "Abhi";
String dob = "2004-04-09";
 Person person = new Person(name, dob);
 person.displayInfo();
    }
}
