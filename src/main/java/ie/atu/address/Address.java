package ie.atu.address;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address {
    @NotBlank
    private String street;
    @NotBlank
    private String town;
    @NotBlank
    private String city;
    @NotBlank
    private String county;
}
