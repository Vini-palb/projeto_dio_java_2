package strategy;

import model.Project;
import java.util.List;

public interface ProjectSearchStrategy {

    List<Project> search(String value);

}