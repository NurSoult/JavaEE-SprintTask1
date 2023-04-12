package kz.bitlab.techorda.db;

import kz.bitlab.techorda.models.Tasks;

import java.util.ArrayList;

public class DBManager {

    public static ArrayList<Tasks> tasks = new ArrayList<Tasks>();

    private static Long id = 1L;

    static {
        tasks.add(new Tasks(id++, "Create a Java EE application", "To create a Java EE application, you'll need to follow a few basic steps. First, you'll need to choose a Java IDE (Integrated Development Environment) that supports Java EE development, such as Eclipse or IntelliJ IDEA. Once you've installed your IDE, you'll need to set up your development environment by configuring your Java EE server and any necessary plugins.", "2021-10-23", "Not completed"));
        tasks.add(new Tasks(id++, "Clean up house and buy products", "Buying products from a market can be an enjoyable experience. Here are some basic steps you can follow to buy products from a market.", "2021-10-25", "Not completed"));
        tasks.add(new Tasks(id++, "Complete all homework assignments", "This typically means that the student is responsible for completing all tasks and exercises assigned by their teacher or professor outside of regular class time. Homework assignments are meant to reinforce the lessons and concepts taught in class, and to help students practice and develop their skills.", "2021-10-28", "Not completed"));
        tasks.add(new Tasks(id++, "Sign up for Sun Gym", "Visit the gym: Before signing up, visit the gym in person to get a feel for the atmosphere and to ask any questions you may have. Many gyms offer free trial periods, so you can try out the facilities and classes before committing to a membership.", "2021-12-12", "Not completed"));
        tasks.add(new Tasks(id++, "Learn Italian", "Build your vocabulary: Start learning commonly used Italian words and phrases related to your interests, such as food, travel, or hobbies. Use flashcards or language learning apps to help you memorize new words.", "2021-05-01", "Not completed"));
    }

    public static void addTask(Tasks task) {
        task.setId(id++);
        if (task != null) {
            tasks.add(task);
        }
    }

    public static Tasks getTask(Long id) {
        for (Tasks t: tasks) {
            if (t.getId().equals(id))
                return t;
        }
        return null;
    }

    public static ArrayList getAllTasks() {
        return tasks;
    }

    public static void deleteTask(Long id) {
        for (int i=0; i< tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                break;
            }
        }

    }
    public static void updateTask(Tasks task) {
        for (int i=0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                break;
            }
        }
    }


}
