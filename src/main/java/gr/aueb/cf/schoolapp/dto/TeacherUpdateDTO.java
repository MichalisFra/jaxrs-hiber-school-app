package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TeacherUpdateDTO {

    @NotNull(message = "ID cannot be empty")
    private Long id;

    @NotNull(message = "Firstname cannot be empty")
    @Size(min = 2, max = 255, message = "Firstname must be between 2 and 255 characters.")
    private String firstname;

    @NotNull(message = "Lastname cannot be empty")
    @Size(min = 2, max = 255, message = "Lastname must be between 2 and 255 characters.")
    private String lastname;

    @NotNull(message = "VAT cannot be empty")
    @Size(min = 9, message = "VAT must have at least 9 digits")
    private String vat;

}
