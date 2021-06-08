package io.nmapi.cloud.serviceImpl;

import io.nmapi.cloud.dao.BlogDao;
import io.nmapi.cloud.dto.BlogDto;
import io.nmapi.cloud.dto.BlogReqDto;
import io.nmapi.cloud.dto.ResponseDto;
import io.nmapi.cloud.enumeration.ResponseCode;
import io.nmapi.cloud.exception.ApiException;
import io.nmapi.cloud.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {

  private final Logger log = LogManager.getLogger(BlogServiceImpl.class);
  private final BlogDao blogDao;

  @Override
  public ResponseEntity<ResponseDto<Void>> create(BlogReqDto blogReqDto) {
    try {
      blogDao.save(new BlogDto(blogReqDto));
      return ResponseEntity.ok(new ResponseDto<>(true));
    } catch (Exception e) {
      log.info("-- 블로그 저장 실패", e);

      // return ResponseEntity.ok(new ResponseDto<>(BLOG_SAVE_FAILED));
      throw new ApiException(ResponseCode.BLOG_SAVE_FAILED);
    }
  }
}
