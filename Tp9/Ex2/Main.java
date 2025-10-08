package Tp9.Ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TaskManager mgr = new TaskManager();

        mgr.addTask("Ecrire la doc", 2);
        mgr.addTask("Corriger les bugs", 1);
        mgr.addTask("Preparer demo", 3);
        mgr.addTask("Envoyer emails", 4);

        System.out.println("=== Toutes les taches ===");
        mgr.listTasks().forEach(System.out::println);
        System.out.println();

        System.out.println("=== Trier par priorite ===");
        mgr.sortByPriority();
        mgr.listTasks().forEach(System.out::println);
        System.out.println();

        System.out.println("=== Tache #2 en cours ===");
        mgr.updateTask(2, Status.IN_PROGRESS);
        mgr.listTasks().forEach(System.out::println);
        System.out.println();

        System.out.println("=== Filtrer PENDING ===");
        List<Task> pending = mgr.filterByStatus(Status.PENDING);
        pending.forEach(System.out::println);
        System.out.println();

        System.out.println("=== Supprimer tache #1 ===");
        mgr.removeTask(1);
        mgr.listTasks().forEach(System.out::println);
    }
}
