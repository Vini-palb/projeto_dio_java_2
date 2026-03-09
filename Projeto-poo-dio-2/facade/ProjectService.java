package facade;

import strategy.ProjectSearchStrategy;
import model.Project;

import java.util.List;

public class ProjectService {

    private ProjectSearchStrategy strategy;

    public void setStrategy(ProjectSearchStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Project> search(String value) {
        return strategy.search(value);
    }
}