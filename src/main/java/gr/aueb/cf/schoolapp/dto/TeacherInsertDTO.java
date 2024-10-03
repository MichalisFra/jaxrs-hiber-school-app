package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TeacherInsertDTO {
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
