package io.nmapi.cloud.controller;

import io.nmapi.cloud.model.ResponseModel;
import io.nmapi.cloud.service.Information;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
@Api(tags = "데이터 조회 API")
@RequiredArgsConstructor
public class InfoController {

  private final Information information;

  @GetMapping("/carriers")
  @ApiOperation("항공사 조회")
  public ResponseEntity<ResponseModel<?>> carriers() {
    return information.carriers();
  }
}
