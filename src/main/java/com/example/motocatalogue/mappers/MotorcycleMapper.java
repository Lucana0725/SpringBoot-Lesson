package com.example.motocatalogue.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.motocatalogue.beans.Motorcycle;

@Mapper
public interface MotorcycleMapper {
  
  /**
   * バイク情報を全県検索する
   * @return バイク情報リスト
   */
  public List<Motorcycle> selectAll();
}
