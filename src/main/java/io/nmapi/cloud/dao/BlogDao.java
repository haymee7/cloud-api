package io.nmapi.cloud.dao;

import io.nmapi.cloud.dto.BlogDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface BlogDao {
  void save(BlogDto blogDto);
}
