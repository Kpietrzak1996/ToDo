import java.util.Scanner;

public class ToDoList {
    static Toggle[] todoList = new Toggle[50];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput;
        do{
            viewTask();
            showTask();
            userInput = scanner.nextLine();
            switch (userInput) {
                case "1": {
                    addTask();
                    break;
                }
                case "2": {
                    removeTask();
                    break;
                }
                case "3": {
                    toggleTask();
                    break;
                }
                case "4": {
                    showTask();
                    break;
                }
                case "5": {
                    System.out.println("Program will exit");
                    break;
                }
                default: {
                    System.out.println("Unrecognized command");
                }
            }
        }while(!userInput.equals("5"));
    }

    private static void toggleTask() {
        System.out.println("Select the Task to be toggled");
        Integer userInput = scanner.nextInt();
        scanner.nextLine();
        Toggle item = todoList[userInput-1];
        item.setDone();
        item.taskPrint();
        }

    private static void showTask() {
        int number = 0;
        for(Toggle item: todoList) {
            if(item !=null){
            System.out.println(++number + " " + item.getTask());
            item.taskPrint();
            }
        }

    }

    private static void removeTask() {
        System.out.println("Remove item");
        int index = scanner.nextInt();
        scanner.nextLine();

        Toggle item = todoList[index - 1];
        if (item != null) {
            for (int i = index - 1; i < todoList.length - 1; i++) {
                todoList[i] = todoList[i + 1];
            }
            todoList[todoList.length - 1] = null;
        } else {
            System.out.println("It no longer has a Task");

        }
    }

    private static void addTask() {
        System.out.println("Please enter task");
        String Task = scanner.nextLine();
        Toggle item = new Toggle(Task);
        addNextTask(todoList, item);
    }

    private static void addNextTask(Toggle[] todoList, Toggle item) {
        for(int i = 0; i < todoList.length; i++) {
            if (todoList[i] == null) {
                todoList[i] = item;
                break;
            }

        }
    }
    private static void viewTask() {
        System.out.println("Menu Option" +
                "\n 1.Add Task" +
                "\n 2.Remove Task" +
                "\n 3.Toggle Task" +
                "\n 4.Show Task" +
                "\n 5.Exit");
    }
}