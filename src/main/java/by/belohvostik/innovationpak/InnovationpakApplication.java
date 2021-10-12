package by.belohvostik.innovationpak;


import by.belohvostik.innovationpak.repository.CompanyDetailsRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InnovationpakApplication {


    public static void main(String[] args) {
        SpringApplication.run(InnovationpakApplication.class, args);
    }

    @Bean
    public CompanyDetailsRepository companyDetailsRepository() {
        return new CompanyDetailsRepository();
    }

}
