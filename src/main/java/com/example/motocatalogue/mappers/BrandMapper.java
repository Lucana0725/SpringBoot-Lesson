package com.example.motocatalogue.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.motocatalogue.beans.Brand;

@Mapper
public interface BrandMapper {
  public List<Brand> selectAll();
}
