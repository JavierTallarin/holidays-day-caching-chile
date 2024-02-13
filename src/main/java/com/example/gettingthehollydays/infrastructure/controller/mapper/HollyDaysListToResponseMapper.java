package com.example.gettingthehollydays.infrastructure.controller.mapper;

import com.example.gettingthehollydays.domain.model.HollyDay;
import com.example.gettingthehollydays.infrastructure.controller.model.GetHollyDayApi;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface HollyDaysListToResponseMapper {

  public List<GetHollyDayApi> execute(List<HollyDay> hollyDayList);
}
