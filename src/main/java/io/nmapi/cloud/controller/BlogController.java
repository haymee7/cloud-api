package io.nmapi.cloud.controller;

import io.nmapi.cloud.dto.BlogReqDto;
import io.nmapi.cloud.dto.ResponseDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.nmapi.cloud.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/blog")
@RequiredArgsConstructor
@Api(tags = "블로그 API")
public class BlogController {

  private final BlogService blogService;

  @PostMapping("")
  @ApiOperation("포스트 작성 API")
  public ResponseEntity<ResponseDto<Void>> create(@RequestBody BlogReqDto blogReqDto) {
    return blogService.create(blogReqDto);
  }

}
