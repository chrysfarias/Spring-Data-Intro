package br.com.alura.springdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.springdata.orm.Cargo;
import br.com.alura.springdata.repository.CargoRepository;

@SpringBootApplication
public class SpringdataApplication implements CommandLineRunner{
	
	private final CargoRepository repository;
	
	public SpringdataApplication(CargoRepository repository) {
		this.repository = repository; 
			
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringdataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Cargo cargo = new Cargo();
		cargo.setDescricao("Engenheiro Civil");
		
		Cargo cargo2 = new Cargo();
		cargo.setDescricao("Agiota");
		
		
		repository.save(cargo);
		
		
	}

}
