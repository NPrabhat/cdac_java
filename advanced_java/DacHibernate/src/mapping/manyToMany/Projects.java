package mapping.manyToMany;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Projects {
    @Id
    private int pId;
    private String pName;
    
    private List<Developer> developers;
    
    
    
    
    
    
    
}
