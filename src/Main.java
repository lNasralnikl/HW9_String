public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1");

        String firstName = "Айдар";
        String middleName = "Азаматович";
        String lastName = "Сакаев";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.println("Ф.И.О. сотрудника — " + fullName);

        System.out.println();
        System.out.println("Задание 2");

        fullName = "Иванов Иван Иванович";
        System.out.println(fullName.toUpperCase());

        System.out.println();
        System.out.println("Задание 3");

        fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println(fullNameTrue);


    }

}
