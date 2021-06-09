package io.nmapi.cloud.service;

import io.nmapi.cloud.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Information {
  public ResponseEntity<ResponseModel<?>> carriers() {
    return ResponseEntity.ok(new ResponseModel<List<?>>(true, InfoCollector.carriers()));
  }
}
