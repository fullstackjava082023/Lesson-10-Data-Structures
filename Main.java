import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        OuterClass myOuter = new OuterClass();
////        OuterClass.InnerClass myInner = myOuter.new InnerClass();
////
////        OuterClass.InnerClass myInner2 = new OuterClass.InnerClass();
////        OuterClass.InnerClass myInner3 = new OuterClass.InnerClass();
//
//
////        System.out.println(myOuter.getInnerY() + myOuter.x);
//
//
//        getInnerY();
//
//        System.out.println(myOuter.x);
//
////        System.out.println(OuterClass.x);
//
//        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

//        Car car = new Car("Mazda 3");
//        car.display();
//
//        car.getCarEngine().setHorsePower(150);
//        car.display();
//        ArrayList<String> list = new ArrayList();
////        list.add("Volvo");
////        list.add("Toyota");
//        Cat kitty = new Cat("Kitty");
//        list.add(kitty);
//        System.out.println(list);
//        for (Cat element : list) {
//            if (element instanceof Cat) {
//                System.out.println(((Cat) element).getName());
//            } else {
//                System.out.println(element);
//            }
//        }

//
//        LinkedList<Integer> numbers = new LinkedList();
//        numbers.add(5);
//        numbers.add(7);
////            numbers.add("Some");
////            numbers.add(new Cat("kiss"));
//        int x = 5;
//        numbers.add(x);
////            Integer y = 5;
//        numbers.remove(1);
////            for (Integer ele : numbers) {
////                System.out.println(ele);
////            }
//        System.out.println(numbers.get(1));
//
//        Cat cat2 = new Cat("kiss");
//        Cat cat3 = cat2;
//        System.out.println(cat3.getName());
//        cat2.setName("tom");
//        System.out.println(cat2.getName());
//        System.out.println(cat3.getName());
//
//        LinkedList<Integer> numbers2 = (LinkedList<Integer>) numbers.clone();

/*

        In this exercise, you'll create a simple student record system using a HashMap. Each student's information will include their name and GPA. You'll be prompted to perform various operations, such as adding, removing, and displaying student records.
        Create a HashMap to store student records. The key should be the student's name (a String), and the value should be the student's GPA (a Double).
        Implement a menu-driven program that allows the user to perform the following actions:
        Add a student record: Prompt the user for the student's name and GPA, and add it to the HashMap.
        Remove a student record: Prompt the user for a student's name and remove it from the HashMap.
        Display all student records: Display the names and GPAs of all students in the HashMap.
                Quit: Exit the program.
                Use a loop to repeatedly display the menu and execute the selected action until the user chooses to quit.
*/
        Scanner scanner = new Scanner(System.in);
        HashMap studentsMap = new HashMap();
        boolean finish = false;
        while (!finish) {
            System.out.println("Hi , welcome to our system");
            System.out.println("Choose option 1 - add Student, 2 - remove student , 3 - display, 4-exit");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("please enter the student name");
                String studentName = scanner.next();
                System.out.println("please enter the students GPA");
                Double grade = scanner.nextDouble();
                studentsMap.put(studentName, grade);
            } else if (choice == 3) { //display
                System.out.println(studentsMap);
                //go by the loop print key and value for each element in map
            } else if (choice == 4) {
                finish = true;
            }
        }


    }

}








