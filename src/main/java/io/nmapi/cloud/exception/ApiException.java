package io.nmapi.cloud.exception;

import io.nmapi.cloud.enumeration.ResponseCode;
import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {

  private final String code;


  public ApiException(String code, String msg) {
    super(msg);
    this.code = code;
  }


  public ApiException(ResponseCode responseCode) {
    super(responseCode.getMessage());
    this.code = responseCode.getCode();
  }
}
