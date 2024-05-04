package com.example.servicefraud.mappers;

import org.example.feignservice.fraud.FraudCheckResponse;
import com.example.servicefraud.entities.FraudCheckHistory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FraudCheckHistoryMapper {

  FraudCheckResponse toDto(FraudCheckHistory fraudCheckHistory);

  FraudCheckHistory toModel(FraudCheckResponse fraudCheckResponse);
}
