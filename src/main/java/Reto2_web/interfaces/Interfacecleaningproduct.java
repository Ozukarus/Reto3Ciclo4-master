
package Reto2_web.interfaces;

import Reto2_web.modelo.cleaningproduct;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Fabio Ortiz
 */
public interface Interfacecleaningproduct extends MongoRepository<cleaningproduct, String>{
    
}
