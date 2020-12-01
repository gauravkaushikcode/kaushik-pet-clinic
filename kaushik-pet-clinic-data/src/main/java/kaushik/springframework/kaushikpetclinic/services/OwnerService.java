package kaushik.springframework.kaushikpetclinic.services;

import kaushik.springframework.kaushikpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
