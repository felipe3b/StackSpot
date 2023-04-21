package {{computed_inputs.package_name}}.controller;

import {{computed_inputs.package_name}}.model.Api;
import {{computed_inputs.package_name}}.service.ApiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")