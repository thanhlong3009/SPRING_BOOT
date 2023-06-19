package com.example.springwebexam.controller;

import com.example.springwebexam.entity.Product;
import com.example.springwebexam.model.request.AppointmentRequest;
import com.example.springwebexam.model.request.ProductRequest;
import com.example.springwebexam.model.response.AppointmentResponse;
import com.example.springwebexam.model.response.ProductResponse;
import com.example.springwebexam.service.AppointmentService;
import com.example.springwebexam.service.ProductService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE,makeFinal = true)
public class AdminController {
    ProductService productService;

    AppointmentService appointmentService;



    @GetMapping("api/v1/admin")
    public String redirectAdminPage() {
        return "admin";
    }

    // products
    @GetMapping("api/v1/products")
    public ResponseEntity<?> getProducts() {
        List<ProductResponse> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @PostMapping("/api/v1/products")
    public ResponseEntity<?> createProduct(@RequestBody @Valid ProductRequest productRequest) {
        productService.saveProduct(productRequest);
        return ResponseEntity.ok(null);
    }

    @PutMapping("/api/v1/products/{id}")
    public ResponseEntity<?> updateProduct(@PathVariable Integer id,@RequestBody @Valid ProductRequest productRequest) {
        ProductResponse productResponse = productService.updateProduct(id,productRequest);
        productService.saveProduct(productRequest);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/api/v1/products/{id}")
    public ResponseEntity<?> getProduct(@PathVariable Integer id) {
        return ResponseEntity.ok(productService.findProductById(id));
    }
    //


    // Appointment
    @GetMapping("/api/v1/appointments")
    public ResponseEntity<?> getAppoints() {
        List<AppointmentResponse> apointments = appointmentService.getAllApointments();
        return ResponseEntity.ok(apointments);
    }

//    @PutMapping("/api/v1/appointments/{id}")
//    public ResponseEntity<?> updateAppointment(@PathVariable Integer id, @RequestBody AppointmentRequest appointmentRequest) {
//
//    }
}
