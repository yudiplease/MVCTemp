package dto.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "request")
public class UserRequest {

    @ApiModelProperty(value = "username")
    private String username;
    private String password;
    private String firstName;
    private String lastName;
}
