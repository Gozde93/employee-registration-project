package com.cydeo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee  {

  //  @NonNull      --->   Field shouldn't be null
  //  @NotEmpty     --->   Field shouldn't be empty ""
  //  @NotBlank     --->   Field shouldn't be blank "        "


  //  @NonNull      --->   @NotNull
  //  @NonNull      --->   @NotNull + @NotEmpty
  //  @NonNull      --->   @NotNull + @NotEmpty  + @NotBlank

    @NotBlank
    @Size(max = 12, min = 2)
    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;
}
