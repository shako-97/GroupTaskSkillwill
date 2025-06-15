import java.time.LocalDateTime;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //LocalDateTime dateTime;
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();


        System.out.println("1 = Adding task");
        System.out.println("2 = Removing task");
        System.out.println("3 = Updating task");
        System.out.println("4 = Get all tasks");
        System.out.println("5 = Getting task by index");
        System.out.println("Please enter Command");
        Scanner scanner1 = new Scanner(System.in);
        int number = scanner1.nextInt();
        switch (number)
        {
            case 1:
        }
    }
    public static HashMap<String,Task> createTask()
    {
        HashMap<String,Task> tasks = new HashMap<>();
        tasks.put("Fibonacci",new Task("Giorgi",
                "Fibonacci", "Write Fibonacci numbers from 0-100;" ));
        tasks.put("Pythagoras",new Task("Salome",
                "Pythagoras", "Write Pythagoras theory;" ));

        tasks.put("Avarage", new LimitedTimeTask("Achi","Avarage",
                "How to calculate avarage;", LocalDateTime.now()));

        tasks.put("Percent", new RepeatableTask("Akaki","Percent",
                "How to calculate percentage from number;",
                LocalDateTime.now(),2));
        return tasks;
    }
    public static void addTask(HashMap<String, Task> tasks, TaskType type)
    {
        switch (type)
        {
            case Basic:
        }
    }
}