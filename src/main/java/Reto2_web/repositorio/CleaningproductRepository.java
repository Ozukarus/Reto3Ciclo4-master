
package Reto2_web.repositorio;


import Reto2_web.interfaces.Interfacecleaningproduct;
import Reto2_web.modelo.cleaningproduct;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @FABIO ORTIZ
 */
@Repository
public class CleaningproductRepository {
    @Autowired
    private Interfacecleaningproduct repository;

    public List<cleaningproduct> getAll() {
        return repository.findAll();
    }

    public Optional<cleaningproduct> getClothe(String reference) {
        return repository.findById(reference);
    }

    
    public cleaningproduct create(cleaningproduct clothe) {
        return repository.save(clothe);
    }

    public void update(cleaningproduct clothe) {
        repository.save(clothe);
    }
    
    public void delete(cleaningproduct clothe) {
        repository.delete(clothe);
    }
}
