package com.example.motocatalogue.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.motocatalogue.beans.Brand;
import com.example.motocatalogue.beans.Motorcycle;
import com.example.motocatalogue.mappers.BrandMapper;
import com.example.motocatalogue.mappers.MotorcycleMapper;

@Service
public class MotosService {
  
  @Autowired
  MotorcycleMapper motorcycleMapper;

  @Autowired
  BrandMapper brandMapper;

  public List<Motorcycle> getMotos() {
    return motorcycleMapper.selectAll();
  }

  public List<Brand> getBrands() {
    return brandMapper.selectAll();
  }
}
