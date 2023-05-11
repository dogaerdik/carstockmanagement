package com.royalhaskoning.carstockmanagement.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: car.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CarServiceGrpc {

  private CarServiceGrpc() {}

  public static final String SERVICE_NAME = "CarService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.CarSaveRequest,
      com.royalhaskoning.carstockmanagement.model.CarSaveResponse> getSaveCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveCar",
      requestType = com.royalhaskoning.carstockmanagement.model.CarSaveRequest.class,
      responseType = com.royalhaskoning.carstockmanagement.model.CarSaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.CarSaveRequest,
      com.royalhaskoning.carstockmanagement.model.CarSaveResponse> getSaveCarMethod() {
    io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.CarSaveRequest, com.royalhaskoning.carstockmanagement.model.CarSaveResponse> getSaveCarMethod;
    if ((getSaveCarMethod = CarServiceGrpc.getSaveCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getSaveCarMethod = CarServiceGrpc.getSaveCarMethod) == null) {
          CarServiceGrpc.getSaveCarMethod = getSaveCarMethod =
              io.grpc.MethodDescriptor.<com.royalhaskoning.carstockmanagement.model.CarSaveRequest, com.royalhaskoning.carstockmanagement.model.CarSaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.royalhaskoning.carstockmanagement.model.CarSaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.royalhaskoning.carstockmanagement.model.CarSaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("saveCar"))
              .build();
        }
      }
    }
    return getSaveCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.SearchRequest,
      com.royalhaskoning.carstockmanagement.model.SearchResponse> getSearchCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchCar",
      requestType = com.royalhaskoning.carstockmanagement.model.SearchRequest.class,
      responseType = com.royalhaskoning.carstockmanagement.model.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.SearchRequest,
      com.royalhaskoning.carstockmanagement.model.SearchResponse> getSearchCarMethod() {
    io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.SearchRequest, com.royalhaskoning.carstockmanagement.model.SearchResponse> getSearchCarMethod;
    if ((getSearchCarMethod = CarServiceGrpc.getSearchCarMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getSearchCarMethod = CarServiceGrpc.getSearchCarMethod) == null) {
          CarServiceGrpc.getSearchCarMethod = getSearchCarMethod =
              io.grpc.MethodDescriptor.<com.royalhaskoning.carstockmanagement.model.SearchRequest, com.royalhaskoning.carstockmanagement.model.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.royalhaskoning.carstockmanagement.model.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.royalhaskoning.carstockmanagement.model.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("searchCar"))
              .build();
        }
      }
    }
    return getSearchCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest,
      com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse> getSearchLowestTotalAnnualCostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchLowestTotalAnnualCost",
      requestType = com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest.class,
      responseType = com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest,
      com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse> getSearchLowestTotalAnnualCostMethod() {
    io.grpc.MethodDescriptor<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest, com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse> getSearchLowestTotalAnnualCostMethod;
    if ((getSearchLowestTotalAnnualCostMethod = CarServiceGrpc.getSearchLowestTotalAnnualCostMethod) == null) {
      synchronized (CarServiceGrpc.class) {
        if ((getSearchLowestTotalAnnualCostMethod = CarServiceGrpc.getSearchLowestTotalAnnualCostMethod) == null) {
          CarServiceGrpc.getSearchLowestTotalAnnualCostMethod = getSearchLowestTotalAnnualCostMethod =
              io.grpc.MethodDescriptor.<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest, com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchLowestTotalAnnualCost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CarServiceMethodDescriptorSupplier("searchLowestTotalAnnualCost"))
              .build();
        }
      }
    }
    return getSearchLowestTotalAnnualCostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceStub>() {
        @java.lang.Override
        public CarServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceStub(channel, callOptions);
        }
      };
    return CarServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceBlockingStub>() {
        @java.lang.Override
        public CarServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceBlockingStub(channel, callOptions);
        }
      };
    return CarServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServiceFutureStub>() {
        @java.lang.Override
        public CarServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServiceFutureStub(channel, callOptions);
        }
      };
    return CarServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saveCar(com.royalhaskoning.carstockmanagement.model.CarSaveRequest request,
        io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.CarSaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveCarMethod(), responseObserver);
    }

    /**
     */
    default void searchCar(com.royalhaskoning.carstockmanagement.model.SearchRequest request,
        io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.SearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchCarMethod(), responseObserver);
    }

    /**
     */
    default void searchLowestTotalAnnualCost(com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest request,
        io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchLowestTotalAnnualCostMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CarService.
   */
  public static abstract class CarServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CarServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CarService.
   */
  public static final class CarServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CarServiceStub> {
    private CarServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveCar(com.royalhaskoning.carstockmanagement.model.CarSaveRequest request,
        io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.CarSaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchCar(com.royalhaskoning.carstockmanagement.model.SearchRequest request,
        io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.SearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchLowestTotalAnnualCost(com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest request,
        io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchLowestTotalAnnualCostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CarService.
   */
  public static final class CarServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CarServiceBlockingStub> {
    private CarServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.royalhaskoning.carstockmanagement.model.CarSaveResponse saveCar(com.royalhaskoning.carstockmanagement.model.CarSaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.royalhaskoning.carstockmanagement.model.SearchResponse searchCar(com.royalhaskoning.carstockmanagement.model.SearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse searchLowestTotalAnnualCost(com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchLowestTotalAnnualCostMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CarService.
   */
  public static final class CarServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CarServiceFutureStub> {
    private CarServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.royalhaskoning.carstockmanagement.model.CarSaveResponse> saveCar(
        com.royalhaskoning.carstockmanagement.model.CarSaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.royalhaskoning.carstockmanagement.model.SearchResponse> searchCar(
        com.royalhaskoning.carstockmanagement.model.SearchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse> searchLowestTotalAnnualCost(
        com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchLowestTotalAnnualCostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_CAR = 0;
  private static final int METHODID_SEARCH_CAR = 1;
  private static final int METHODID_SEARCH_LOWEST_TOTAL_ANNUAL_COST = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_CAR:
          serviceImpl.saveCar((com.royalhaskoning.carstockmanagement.model.CarSaveRequest) request,
              (io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.CarSaveResponse>) responseObserver);
          break;
        case METHODID_SEARCH_CAR:
          serviceImpl.searchCar((com.royalhaskoning.carstockmanagement.model.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.SearchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_LOWEST_TOTAL_ANNUAL_COST:
          serviceImpl.searchLowestTotalAnnualCost((com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest) request,
              (io.grpc.stub.StreamObserver<com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSaveCarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.royalhaskoning.carstockmanagement.model.CarSaveRequest,
              com.royalhaskoning.carstockmanagement.model.CarSaveResponse>(
                service, METHODID_SAVE_CAR)))
        .addMethod(
          getSearchCarMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.royalhaskoning.carstockmanagement.model.SearchRequest,
              com.royalhaskoning.carstockmanagement.model.SearchResponse>(
                service, METHODID_SEARCH_CAR)))
        .addMethod(
          getSearchLowestTotalAnnualCostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostRequest,
              com.royalhaskoning.carstockmanagement.model.LowestTotalAnnualCostResponse>(
                service, METHODID_SEARCH_LOWEST_TOTAL_ANNUAL_COST)))
        .build();
  }

  private static abstract class CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.royalhaskoning.carstockmanagement.model.Car.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarService");
    }
  }

  private static final class CarServiceFileDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier {
    CarServiceFileDescriptorSupplier() {}
  }

  private static final class CarServiceMethodDescriptorSupplier
      extends CarServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CarServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarServiceFileDescriptorSupplier())
              .addMethod(getSaveCarMethod())
              .addMethod(getSearchCarMethod())
              .addMethod(getSearchLowestTotalAnnualCostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
