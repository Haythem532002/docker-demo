package haythem.dockerdemo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {

    private final DemoEntityRepository demoEntityRepository;


    @GetMapping
    public ResponseEntity<List<DemoEntity>> getEntities() {
        return ResponseEntity.ok(demoEntityRepository.findAll());
    }
    @GetMapping("/{id-demo}")
    public ResponseEntity<Optional<DemoEntity>> getEntityById(
            @PathVariable("id-demo") Integer id
    ) {
        return ResponseEntity.ok(demoEntityRepository.findById(id));
    }
    @PostMapping
    public ResponseEntity<Integer> createDemo(
            @RequestBody DemoEntity demoEntity
    ) {
        return ResponseEntity.ok(demoEntityRepository.save(demoEntity).getId());
    }
}
