import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList{
    private static int Add_Task = 1;
    private static int Toggle_Task_Done = 2;
    private static int Remove_Task = 3;
    private static int View_Tasks = 4;
    private static int Exit = 5;

    private static List<String> currentList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        String userInput;
        System.out.println("Hello in the programe");
        do{
            System.out.printf("%d Add Task\n", Add_Task);
            System.out.printf("%d Toggle Task\n", Toggle_Task_Done);
            System.out.printf("%d Remove Task\n", Remove_Task);
            System.out.printf("%d View Task\n", View_Tasks);
            System.out.printf("%d Exit Program\n", Exit);
            userInput = input.nextLine();
            switch (userInput) {
                    case "1": {
                        addTask();
                        break;
                    }
                    case "2": {
                        toogleTaskDone();
                        break;
                    }
                    case "3": {
                        removeTask();
                        break;
                    }
                    case "4": {
                        viewTask();
                        break;
                    }
                    case "5": {
                        System.out.println("Program will exit");
                        break;
                    }
                    default:
                        System.out.println("Unrecognized command");
                }
            }while (!userInput.equals("5"));
    }

    private static void toogleTaskDone() {
    //    System.out.println("Enter index of task to toggle");
    //     int index = input.nextInt();
    //    currentList.get(index);

    }

    private static void viewTask() {
        int number = 0;
        for (String item: currentList) {
            System.out.println(++number + " " + item);
        }
    }

    private static void removeTask() {
        System.out.println("Remove Item");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to remove");
        int index = scanner.nextInt();
        if ((index-1)<0 || index>currentList.size()){
            System.out.println("Wrong index number");
        }
        else{
            currentList.remove(index-1);
        }
    }

    private static void addTask() {
        System.out.println("Please enter task");
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);
        viewTask();

    }

}