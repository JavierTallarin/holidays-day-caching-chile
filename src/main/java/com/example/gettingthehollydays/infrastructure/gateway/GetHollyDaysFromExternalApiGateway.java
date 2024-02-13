package com.example.gettingthehollydays.infrastructure.gateway;

import com.example.gettingthehollydays.domain.model.HollyDay;
import com.example.gettingthehollydays.domain.ports.output.GetHollyDaysChileGateway;
import com.example.gettingthehollydays.infrastructure.gateway.mapper.HollyDaysListToDomainMapper;
import com.example.gettingthehollydays.infrastructure.gateway.model.HollyDayClient;
import com.example.gettingthehollydays.infrastructure.gateway.util.ApiRestClient;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;

@Service
public class GetHollyDaysFromExternalApiGateway implements GetHollyDaysChileGateway {

  private final ApiRestClient apiRestClient;
  private final HollyDaysListToDomainMapper hollyDaysListToDomainMapper;
  private final String url;

  public GetHollyDaysFromExternalApiGateway(ApiRestClient apiRestClient,
                                            HollyDaysListToDomainMapper hollyDaysListToDomainMapper,
                                            @Value("${api.gob.url}") String url) {
    this.apiRestClient = apiRestClient;
    this.hollyDaysListToDomainMapper = hollyDaysListToDomainMapper;
    this.url = url;
  }

  @Override
  public List<HollyDay> execute() {

    return this.hollyDaysListToDomainMapper.execute(this.getHollyDayClientListFromExternalApi());
  }

  private List<HollyDayClient> getHollyDayClientListFromExternalApi() {

    ParameterizedTypeReference<List<HollyDayClient>> typeRef = new ParameterizedTypeReference<>() {};

    return this.apiRestClient.getForEntity(url, typeRef).getBody();
  }

}
