package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer userId;
    private String userName;

    private String userEmail;
    private String PhoneNumber;
    private Integer userAge;
//    private LocalDate userDOB;
}
