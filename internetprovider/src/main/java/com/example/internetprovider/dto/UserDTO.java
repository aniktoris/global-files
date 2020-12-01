package com.example.internetprovider.dto;

import com.sun.istack.NotNull;
import lombok.*;

import java.util.regex.Pattern;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class UserDTO {
    @NotNull
    private String email;

    @NotNull
    private String password;

    @Getter
    @NotNull
    @Pattern (regexp = "[A-Za-z]{8,20}",
            message = "Username has to correspond to regexp [A-Za-z]{8,20}")
    private String username;

    @NotNull
    @Pattern (regexp = "[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}",
            message = "Username has to correspond to [А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}")
    private String firstname;
}
