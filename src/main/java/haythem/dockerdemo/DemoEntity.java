package haythem.dockerdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
//@RequiredArgsConstructor
@NoArgsConstructor
public class DemoEntity {
    @Id
    @GeneratedValue
    Integer id;
    String name;
    String description;

    public DemoEntity(String name, String description) {
        this.name=name;
        this.description=description;
    }
}
