package crudprgm.example.secondpgrm;
import org.springframework.data.repository.CrudRepository;
public interface Repo extends CrudRepository<User, Integer> {
}
