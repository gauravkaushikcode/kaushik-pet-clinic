package kaushik.springframework.kaushikpetclinic.bootstrap;

import kaushik.springframework.kaushikpetclinic.model.Owner;
import kaushik.springframework.kaushikpetclinic.model.Vet;
import kaushik.springframework.kaushikpetclinic.services.OwnerService;
import kaushik.springframework.kaushikpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Gaurav");
        owner1.setLastName("Kaushik");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Neha");
        owner2.setLastName("Kaushik");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Adhyayan");
        owner3.setLastName("Kaushik");

        ownerService.save(owner3);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Sandals");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Sara");
        vet2.setLastName("Porter");

        vetService.save(vet2);
        System.out.println("exiting data loader");
    }
}
