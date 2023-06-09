package br.com.alura.springdata;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.orm.Cargo;
import br.com.alura.springdata.repository.CargoRepository;
import br.com.alura.springdata.service.CrudCargoService;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner{
	
	private final CrudCargoService cargoService;
	
	private Boolean  system = true;
	
	public SpringdataApplication(CrudCargoService cargoService) {
		this.cargoService = cargoService; 
			
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in); 
		
		while (system) {
			System.out.println("Qual ação voce deseja executar?");
			System.out.println("0 - Sair");
			System.out.println("1 - Funcoes de Cargo");
			
			int action = scanner.nextInt();
			
			if(action == 1) {
				cargoService.inicial(scanner);
				
			}
			
			else {
				system = false;
			}
		}
				
	}

}
