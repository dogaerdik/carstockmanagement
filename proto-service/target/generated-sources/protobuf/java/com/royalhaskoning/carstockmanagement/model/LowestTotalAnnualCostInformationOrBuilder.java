// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package com.royalhaskoning.carstockmanagement.model;

public interface LowestTotalAnnualCostInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LowestTotalAnnualCostInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string model = 1;</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <code>string model = 1;</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <code>string make = 2;</code>
   * @return The make.
   */
  java.lang.String getMake();
  /**
   * <code>string make = 2;</code>
   * @return The bytes for make.
   */
  com.google.protobuf.ByteString
      getMakeBytes();

  /**
   * <code>string version = 3;</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 3;</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();

  /**
   * <code>int32 yearOfRelease = 4;</code>
   * @return The yearOfRelease.
   */
  int getYearOfRelease();

  /**
   * <code>double price = 5;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>double fuelConsumption = 6;</code>
   * @return The fuelConsumption.
   */
  double getFuelConsumption();

  /**
   * <code>double annualMaintenanceCost = 7;</code>
   * @return The annualMaintenanceCost.
   */
  double getAnnualMaintenanceCost();

  /**
   * <code>double totalAnnualCost = 8;</code>
   * @return The totalAnnualCost.
   */
  double getTotalAnnualCost();
}