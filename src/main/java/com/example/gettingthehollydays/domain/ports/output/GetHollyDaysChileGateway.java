package com.example.gettingthehollydays.domain.ports.output;

import com.example.gettingthehollydays.domain.model.HollyDay;

import java.util.List;

public interface GetHollyDaysChileGateway {
  List<HollyDay> execute();
}
