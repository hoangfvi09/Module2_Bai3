import java.util.Scanner;

public class ElementFinding {
    public static void main(String[] args) {
        String[] studentsList={"Vi Hoang", "Hoang Vi", "hoangfvi", "TLH", "Huong", "Lan Vi Huong", "Ninlayaa", "Wi", "LA Huong", "Kaori"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a student name to search: ");
        String inputName=scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < studentsList.length; i++) {
            if (studentsList[i].equals(inputName)) {
                System.out.println("Position of the students in the list " + inputName + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + inputName + " in the list.");
        }

    }
}
