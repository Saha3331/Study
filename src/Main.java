import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fulName = firstName + " " + middleName + " " + lastName;
        System.out.println( fulName  + " сотрудника");
        System.out.println(fulName.toUpperCase() + " сотрудника ");
        String fuLname = "Иванов Семён Семёнович";
        String  reFulname = fuLname.replace("ё" , "е");
        System.out.println(reFulname);

    }
}