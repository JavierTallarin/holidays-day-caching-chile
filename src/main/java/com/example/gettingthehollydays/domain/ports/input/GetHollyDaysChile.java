package com.example.gettingthehollydays.domain.ports.input;

import com.example.gettingthehollydays.domain.model.HollyDay;

import java.util.List;

public interface GetHollyDaysChile {
  List<HollyDay> execute();
}
