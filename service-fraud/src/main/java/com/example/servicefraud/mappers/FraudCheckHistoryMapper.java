package com.example.servicefraud.mappers;

import com.example.servicefraud.entities.FraudCheckHistory;
import org.example.feignservice.fraud.FraudCheckResponse;
import org.mapstruct.Mapper;

/**
 * Mapper for converting between {@link FraudCheckHistory} and {@link FraudCheckResponse}.
 */
@Mapper(componentModel = "spring")
public interface FraudCheckHistoryMapper {

  /**
   * Converts a {@link FraudCheckHistory} entity to a {@link FraudCheckResponse} DTO.
   *
   * @param fraudCheckHistory the fraud check history entity
   * @return the corresponding fraud check response DTO
   */
  FraudCheckResponse toDto(FraudCheckHistory fraudCheckHistory);

  /**
   * Converts a {@link FraudCheckResponse} DTO to a {@link FraudCheckHistory} entity.
   *
   * @param fraudCheckResponse the fraud check response DTO
   * @return the corresponding fraud check history entity
   */
  FraudCheckHistory toModel(FraudCheckResponse fraudCheckResponse);
}
