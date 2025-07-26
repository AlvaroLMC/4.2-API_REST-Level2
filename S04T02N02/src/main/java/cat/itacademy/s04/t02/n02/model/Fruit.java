package cat.itacademy.s04.t02.n02.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "fruit")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 50, message = "Name must be at most 50 characters")
    private String name;

    @Min(value = 0, message = "Quantity must be zero or positive")
    private int quantityKilos;
}
