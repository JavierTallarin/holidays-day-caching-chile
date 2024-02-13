package com.example.gettingthehollydays.infrastructure.gateway.mapper;

import com.example.gettingthehollydays.domain.model.HollyDay;
import com.example.gettingthehollydays.infrastructure.gateway.model.HollyDayClient;

import java.util.List;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING,
    injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface HollyDaysListToDomainMapper {

  List<HollyDay> execute(List<HollyDayClient> hollyDayClientList);
}
