import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.LoginRequest;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    // Demo Login
    // I will show the vulnerabilites

    @PostMapping("/login")
    @Autowired
    public ResponseEntity<?> login(@RequestBody LoginRequest request){
        
        // send the id and password into UserService

        private UserService userService;

        //get id and pw
        id = request

        boolean Result = userService.login_easy(userId, pw)

        return ResponseEntity.ok()
    }

    public String Signup(@RequestBody){

    }
    
}