package one.digitalinnovation.citiesdistances.api.resource;

import one.digitalinnovation.citiesdistances.api.entity.State;
import one.digitalinnovation.citiesdistances.api.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/states")
public class StateResource {

    @Autowired
    private final StateRepository repository;

    public StateResource(StateRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<State> stateList(){
        return repository.findAll();
    }

}
