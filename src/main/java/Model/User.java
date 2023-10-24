package Model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String displayName;

    private String city;
    private String state;
    private String zipCode;

    private Boolean peanutWatch;
    private Boolean dairyWatch;
    private Boolean eggWatch;


}
