package haythem.dockerdemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoEntityRepository extends JpaRepository<DemoEntity, Integer> {
}