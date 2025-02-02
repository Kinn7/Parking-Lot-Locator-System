package et.com.gebeya.parkinglotservice.dto.requestdto;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UpdateDriverRequestDto {
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String imageUrl;
}
