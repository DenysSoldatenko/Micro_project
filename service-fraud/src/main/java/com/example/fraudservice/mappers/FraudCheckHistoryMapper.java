package com.example.fraudservice.mappers;

import com.example.feignservice.fraud.FraudCheckResponse;
import com.example.fraudservice.entities.FraudCheckHistory;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FraudCheckHistoryMapper {

  FraudCheckResponse toDto(FraudCheckHistory fraudCheckHistory);

  FraudCheckHistory toModel(FraudCheckResponse fraudCheckResponse);
}
