package io.nmapi.cloud.service;

import io.nmapi.cloud.dto.BlogReqDto;
import io.nmapi.cloud.dto.ResponseDto;
import org.springframework.http.ResponseEntity;

public interface BlogService {
  ResponseEntity<ResponseDto<Void>> create(BlogReqDto blogReqDto);
}
