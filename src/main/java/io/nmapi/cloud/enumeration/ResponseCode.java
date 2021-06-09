package io.nmapi.cloud.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ResponseCode {
  SUCCESS("200", null);
  private final String code;
  private final String message;
}
