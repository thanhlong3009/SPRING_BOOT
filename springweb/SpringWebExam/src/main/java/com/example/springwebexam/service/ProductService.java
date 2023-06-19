package com.example.springwebexam.service;

import com.example.springwebexam.entity.Product;
import com.example.springwebexam.model.request.ProductRequest;
import com.example.springwebexam.model.response.ProductResponse;
import com.example.springwebexam.repository.ProductRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductService {
    ObjectMapper objectMapper;
    ProductRepository productRepository;


    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(product -> objectMapper.convertValue(product, ProductResponse.class))
                .collect(Collectors.toList());
    }

    public void saveProduct(ProductRequest productRequest) {
        Product product = objectMapper.convertValue(productRequest, Product.class);
        productRepository.save(product);
    }

    public ProductResponse findProductById(Integer id) {
        Product product = productRepository.findById(id).orElseThrow(() -> {
            throw  new RuntimeException("not found id");
        });
        return objectMapper.convertValue(product, ProductResponse.class);
    }

    public ProductResponse updateProduct(Integer id, ProductRequest productRequest) {
        Product product = productRepository.findById(id).orElseThrow(() -> {
            throw  new RuntimeException("not found id");
        });
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setDescription(productRequest.getDescription());
        product.setAvatar(productRequest.getAvatar());
        productRepository.save(product);
        return objectMapper.convertValue(product, ProductResponse.class);
    }
}
