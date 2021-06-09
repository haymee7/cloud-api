package io.nmapi.cloud.controller;

import io.nmapi.cloud.service.InfoCollector;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/batch")
@Api(tags = "스케줄링 작업")
public class BatchController {

  @GetMapping("/collect/carriers")
  @ApiOperation(value = "항공사 코드 정보 수집 및 DB 업데이트")
  public void collectCarriers() {
    InfoCollector.carriers();
  }
}
