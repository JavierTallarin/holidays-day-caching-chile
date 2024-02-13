package com.example.gettingthehollydays.infrastructure.controller;

import com.example.gettingthehollydays.domain.ports.input.GetHollyDaysChile;
import com.example.gettingthehollydays.infrastructure.controller.mapper.HollyDaysListToResponseMapper;
import com.example.gettingthehollydays.infrastructure.controller.model.GetHollyDayApi;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class HollyDaysController {

  private final GetHollyDaysChile getHollyDaysChile;
  private final HollyDaysListToResponseMapper hollyDaysListToResponseMapper;

  public HollyDaysController(GetHollyDaysChile getHollyDaysChile,
                             HollyDaysListToResponseMapper hollyDaysListToResponseMapper) {
    this.getHollyDaysChile = getHollyDaysChile;
    this.hollyDaysListToResponseMapper = hollyDaysListToResponseMapper;
  }

  @GetMapping("/hollydays")
  ResponseEntity<List<GetHollyDayApi>> getHollyDaysOfChile() {
    return ResponseEntity.ok(this.hollyDaysListToResponseMapper
        .execute(this.getHollyDaysChile.execute()));
  }

}
