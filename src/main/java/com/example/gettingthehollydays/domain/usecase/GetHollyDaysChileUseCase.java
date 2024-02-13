package com.example.gettingthehollydays.domain.usecase;

import com.example.gettingthehollydays.domain.model.HollyDay;
import com.example.gettingthehollydays.domain.ports.input.GetHollyDaysChile;
import com.example.gettingthehollydays.domain.ports.output.GetHollyDaysChileGateway;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GetHollyDaysChileUseCase implements GetHollyDaysChile {

  private final GetHollyDaysChileGateway getHollyDaysChileGateway;

  public GetHollyDaysChileUseCase(GetHollyDaysChileGateway getHollyDaysChileGateway) {
    this.getHollyDaysChileGateway = getHollyDaysChileGateway;
  }

  @Override
  public List<HollyDay> execute() {
    return this.getHollyDaysChileGateway.execute()
        .stream()
        .filter(hollyDay -> hollyDay.getNombre().equalsIgnoreCase("navidad"))
        .sorted(Comparator.comparing(hollyDay -> (this.getDayAndMonthFromDate(hollyDay.getFecha()))))
        .collect(Collectors.toList());
  }

  private String getDayAndMonthFromDate(String date) {
    int dayAndMonthLength = 5;
    return date != null && (date.length() >= dayAndMonthLength) ? date.substring(date.length() - dayAndMonthLength): date;
  }

}
