package strategy;

import database.ProjectDatabase;
import model.Project;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByStatus implements ProjectSearchStrategy {

    public List<Project> search(String status) {

        return ProjectDatabase
                .getInstance()
                .getProjects()
                .stream()
                .filter(p -> p.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }
}