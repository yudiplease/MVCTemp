package api;

import dto.request.UserRequest;
import dto.response.UserResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.UUID;


@Api(tags = "Users", value = "User")
@RequestMapping("/users")
public interface UserApi {

    @ApiOperation(value = "Creating user", nickname = "user-create", response = Void.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "User created", response = UUID.class),
            @ApiResponse(code = 400, message = "Validation error")})
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void createUser(@RequestBody UserRequest request);

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    UserResponse updateUser(@PathVariable UUID userId, @RequestBody UserRequest request);

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    void deleteUserById(@PathVariable UUID userId);

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    UserResponse getUserById(@PathVariable UUID userId);

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    List<UserResponse> getUsers();
}
