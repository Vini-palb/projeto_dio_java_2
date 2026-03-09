package strategy;

import database.ProjectDatabase;
import model.Project;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByName implements ProjectSearchStrategy {

    public List<Project> search(String name) {

        return ProjectDatabase
                .getInstance()
                .getProjects()
                .stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }
}