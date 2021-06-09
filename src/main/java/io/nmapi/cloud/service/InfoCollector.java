package io.nmapi.cloud.service;

import io.nmapi.cloud.model.SunminCarrier;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
@Log4j2
public class InfoCollector {

  public static List<SunminCarrier> carriers() {
    WebClient webClient = WebClient.create("http://devcore.dcjeju.co.kr");
    List<SunminCarrier> sunminCarriers = webClient.get().uri("/air/info/carriers")
      .header("x-basic-auth", "342-naturemobility-OVQuvbJBGFgzeHYvu3EeK0R9QaYHdkXLpmlMiqpDnzfkrYl7vyeL7N/uKmSAGyFf5QKVHQQurvk=-naturemobility")
      .retrieve()
      .bodyToFlux(SunminCarrier.class)
      .collectList()
      .block();

    log.info("-- carriers: \n{}", sunminCarriers);
    return sunminCarriers;
  }
}
