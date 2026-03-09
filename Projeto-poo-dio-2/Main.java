import facade.ProjectService;
import model.Project;
import strategy.SearchByName;
import strategy.SearchByStatus;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ProjectService service = new ProjectService();

        System.out.println("1 - Buscar projeto por nome");
        System.out.println("2 - Buscar projetos por status");

        int option = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o valor da busca:");
        String value = scanner.nextLine();

        if (option == 1) {
            service.setStrategy(new SearchByName());
        } else {
            service.setStrategy(new SearchByStatus());
        }

        List<Project> result = service.search(value);

        if (result.isEmpty()) {
            System.out.println("Nenhum projeto encontrado.");
        } else {
            for (Project p : result) {
                System.out.println("Projeto: " + p.getName());
                System.out.println("Status: " + p.getStatus());
                System.out.println("---------------");
            }
        }
    }
}