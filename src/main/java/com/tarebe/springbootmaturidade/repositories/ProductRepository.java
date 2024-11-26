package com.tarebe.springbootmaturidade.repositories;

import com.tarebe.springbootmaturidade.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
}
