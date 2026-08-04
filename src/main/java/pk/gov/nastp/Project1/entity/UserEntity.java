package pk.gov.nastp.Project1.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;
@Data
public class UserEntity {
    @Id
    private String id;
    @NotNull
    private String name;
    @NotNull
    private int phonenumber;
    @NotNull
    private int age;
}