package database;

import model.Project;
import java.util.ArrayList;
import java.util.List;

public class ProjectDatabase {

    private static ProjectDatabase instance;

    private List<Project> projects = new ArrayList<>();

    private ProjectDatabase() {

        projects.add(new Project("Sistema de Pagamentos", "EM_DESENVOLVIMENTO"));
        projects.add(new Project("Portal Web", "EM_TESTES"));
        projects.add(new Project("App Mobile", "CONCLUIDO"));
    }

    public static ProjectDatabase getInstance() {

        if (instance == null) {
            instance = new ProjectDatabase();
        }

        return instance;
    }

    public List<Project> getProjects() {
        return projects;
    }
}