package io.nmapi.cloud.model;

import io.nmapi.cloud.enumeration.ResponseCode;
import io.nmapi.cloud.exception.ApiException;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseModel<T> {
  private boolean success;
  private String code;
  private String message;
  private T data;


  public ResponseModel(boolean success) {
    this.success = success;
  }


  public ResponseModel(ResponseCode code) {
    this.success = false;
    this.code = code.getCode();
    this.message = code.getMessage();
  }


  public ResponseModel(String code, String message) {
    this.success = false;
    this.code = code;
    this.message = message;
  }

  public ResponseModel(String message) {
    this.success = false;
    this.message = message;
  }


  public ResponseModel(ApiException ex) {
    this.success = false;
    this.code = ex.getCode();
    this.message = ex.getMessage();
  }

}
