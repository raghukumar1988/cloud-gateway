package com.raghu.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
    @GetMapping("/userServiceFallBack")
    public String userServiceFallbackMethod() {
        return "User service is taking longer time to respond. Please try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallbackMethod() {
        return "Department service is taking longer time to respond. Please try again later";
    }
}
