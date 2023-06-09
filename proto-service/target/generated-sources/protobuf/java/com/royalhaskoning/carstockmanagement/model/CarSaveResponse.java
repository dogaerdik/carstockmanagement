// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package com.royalhaskoning.carstockmanagement.model;

/**
 * Protobuf type {@code CarSaveResponse}
 */
public final class CarSaveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CarSaveResponse)
    CarSaveResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CarSaveResponse.newBuilder() to construct.
  private CarSaveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CarSaveResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CarSaveResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.royalhaskoning.carstockmanagement.model.Car.internal_static_CarSaveResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.royalhaskoning.carstockmanagement.model.Car.internal_static_CarSaveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.royalhaskoning.carstockmanagement.model.CarSaveResponse.class, com.royalhaskoning.carstockmanagement.model.CarSaveResponse.Builder.class);
  }

  public static final int CARINFORMATION_FIELD_NUMBER = 1;
  private com.royalhaskoning.carstockmanagement.model.CarInformation carInformation_;
  /**
   * <code>.CarInformation carInformation = 1;</code>
   * @return Whether the carInformation field is set.
   */
  @java.lang.Override
  public boolean hasCarInformation() {
    return carInformation_ != null;
  }
  /**
   * <code>.CarInformation carInformation = 1;</code>
   * @return The carInformation.
   */
  @java.lang.Override
  public com.royalhaskoning.carstockmanagement.model.CarInformation getCarInformation() {
    return carInformation_ == null ? com.royalhaskoning.carstockmanagement.model.CarInformation.getDefaultInstance() : carInformation_;
  }
  /**
   * <code>.CarInformation carInformation = 1;</code>
   */
  @java.lang.Override
  public com.royalhaskoning.carstockmanagement.model.CarInformationOrBuilder getCarInformationOrBuilder() {
    return getCarInformation();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (carInformation_ != null) {
      output.writeMessage(1, getCarInformation());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (carInformation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCarInformation());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.royalhaskoning.carstockmanagement.model.CarSaveResponse)) {
      return super.equals(obj);
    }
    com.royalhaskoning.carstockmanagement.model.CarSaveResponse other = (com.royalhaskoning.carstockmanagement.model.CarSaveResponse) obj;

    if (hasCarInformation() != other.hasCarInformation()) return false;
    if (hasCarInformation()) {
      if (!getCarInformation()
          .equals(other.getCarInformation())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCarInformation()) {
      hash = (37 * hash) + CARINFORMATION_FIELD_NUMBER;
      hash = (53 * hash) + getCarInformation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.royalhaskoning.carstockmanagement.model.CarSaveResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code CarSaveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CarSaveResponse)
      com.royalhaskoning.carstockmanagement.model.CarSaveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.royalhaskoning.carstockmanagement.model.Car.internal_static_CarSaveResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.royalhaskoning.carstockmanagement.model.Car.internal_static_CarSaveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.royalhaskoning.carstockmanagement.model.CarSaveResponse.class, com.royalhaskoning.carstockmanagement.model.CarSaveResponse.Builder.class);
    }

    // Construct using com.royalhaskoning.carstockmanagement.model.CarSaveResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (carInformationBuilder_ == null) {
        carInformation_ = null;
      } else {
        carInformation_ = null;
        carInformationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.royalhaskoning.carstockmanagement.model.Car.internal_static_CarSaveResponse_descriptor;
    }

    @java.lang.Override
    public com.royalhaskoning.carstockmanagement.model.CarSaveResponse getDefaultInstanceForType() {
      return com.royalhaskoning.carstockmanagement.model.CarSaveResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.royalhaskoning.carstockmanagement.model.CarSaveResponse build() {
      com.royalhaskoning.carstockmanagement.model.CarSaveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.royalhaskoning.carstockmanagement.model.CarSaveResponse buildPartial() {
      com.royalhaskoning.carstockmanagement.model.CarSaveResponse result = new com.royalhaskoning.carstockmanagement.model.CarSaveResponse(this);
      if (carInformationBuilder_ == null) {
        result.carInformation_ = carInformation_;
      } else {
        result.carInformation_ = carInformationBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.royalhaskoning.carstockmanagement.model.CarSaveResponse) {
        return mergeFrom((com.royalhaskoning.carstockmanagement.model.CarSaveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.royalhaskoning.carstockmanagement.model.CarSaveResponse other) {
      if (other == com.royalhaskoning.carstockmanagement.model.CarSaveResponse.getDefaultInstance()) return this;
      if (other.hasCarInformation()) {
        mergeCarInformation(other.getCarInformation());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getCarInformationFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.royalhaskoning.carstockmanagement.model.CarInformation carInformation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.royalhaskoning.carstockmanagement.model.CarInformation, com.royalhaskoning.carstockmanagement.model.CarInformation.Builder, com.royalhaskoning.carstockmanagement.model.CarInformationOrBuilder> carInformationBuilder_;
    /**
     * <code>.CarInformation carInformation = 1;</code>
     * @return Whether the carInformation field is set.
     */
    public boolean hasCarInformation() {
      return carInformationBuilder_ != null || carInformation_ != null;
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     * @return The carInformation.
     */
    public com.royalhaskoning.carstockmanagement.model.CarInformation getCarInformation() {
      if (carInformationBuilder_ == null) {
        return carInformation_ == null ? com.royalhaskoning.carstockmanagement.model.CarInformation.getDefaultInstance() : carInformation_;
      } else {
        return carInformationBuilder_.getMessage();
      }
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     */
    public Builder setCarInformation(com.royalhaskoning.carstockmanagement.model.CarInformation value) {
      if (carInformationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        carInformation_ = value;
        onChanged();
      } else {
        carInformationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     */
    public Builder setCarInformation(
        com.royalhaskoning.carstockmanagement.model.CarInformation.Builder builderForValue) {
      if (carInformationBuilder_ == null) {
        carInformation_ = builderForValue.build();
        onChanged();
      } else {
        carInformationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     */
    public Builder mergeCarInformation(com.royalhaskoning.carstockmanagement.model.CarInformation value) {
      if (carInformationBuilder_ == null) {
        if (carInformation_ != null) {
          carInformation_ =
            com.royalhaskoning.carstockmanagement.model.CarInformation.newBuilder(carInformation_).mergeFrom(value).buildPartial();
        } else {
          carInformation_ = value;
        }
        onChanged();
      } else {
        carInformationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     */
    public Builder clearCarInformation() {
      if (carInformationBuilder_ == null) {
        carInformation_ = null;
        onChanged();
      } else {
        carInformation_ = null;
        carInformationBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     */
    public com.royalhaskoning.carstockmanagement.model.CarInformation.Builder getCarInformationBuilder() {
      
      onChanged();
      return getCarInformationFieldBuilder().getBuilder();
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     */
    public com.royalhaskoning.carstockmanagement.model.CarInformationOrBuilder getCarInformationOrBuilder() {
      if (carInformationBuilder_ != null) {
        return carInformationBuilder_.getMessageOrBuilder();
      } else {
        return carInformation_ == null ?
            com.royalhaskoning.carstockmanagement.model.CarInformation.getDefaultInstance() : carInformation_;
      }
    }
    /**
     * <code>.CarInformation carInformation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.royalhaskoning.carstockmanagement.model.CarInformation, com.royalhaskoning.carstockmanagement.model.CarInformation.Builder, com.royalhaskoning.carstockmanagement.model.CarInformationOrBuilder> 
        getCarInformationFieldBuilder() {
      if (carInformationBuilder_ == null) {
        carInformationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.royalhaskoning.carstockmanagement.model.CarInformation, com.royalhaskoning.carstockmanagement.model.CarInformation.Builder, com.royalhaskoning.carstockmanagement.model.CarInformationOrBuilder>(
                getCarInformation(),
                getParentForChildren(),
                isClean());
        carInformation_ = null;
      }
      return carInformationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:CarSaveResponse)
  }

  // @@protoc_insertion_point(class_scope:CarSaveResponse)
  private static final com.royalhaskoning.carstockmanagement.model.CarSaveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.royalhaskoning.carstockmanagement.model.CarSaveResponse();
  }

  public static com.royalhaskoning.carstockmanagement.model.CarSaveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CarSaveResponse>
      PARSER = new com.google.protobuf.AbstractParser<CarSaveResponse>() {
    @java.lang.Override
    public CarSaveResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<CarSaveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CarSaveResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.royalhaskoning.carstockmanagement.model.CarSaveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

