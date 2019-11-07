package com.test.jdh.grpc.grpcmodel;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.1)",
    comments = "Source: bank.proto")
public final class bankGrpc {

  private bankGrpc() {}

  public static final String SERVICE_NAME = "com.test.jdh.grpc.grpcmodel.bank";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.TransferMoney,
      com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation> getTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transfer",
      requestType = com.test.jdh.grpc.grpcmodel.Bank.TransferMoney.class,
      responseType = com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.TransferMoney,
      com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation> getTransferMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.TransferMoney, com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation> getTransferMethod;
    if ((getTransferMethod = bankGrpc.getTransferMethod) == null) {
      synchronized (bankGrpc.class) {
        if ((getTransferMethod = bankGrpc.getTransferMethod) == null) {
          bankGrpc.getTransferMethod = getTransferMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.grpc.grpcmodel.Bank.TransferMoney, com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.grpc.grpcmodel.Bank.TransferMoney.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation.getDefaultInstance()))
              .setSchemaDescriptor(new bankMethodDescriptorSupplier("Transfer"))
              .build();
        }
      }
    }
    return getTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.Account,
      com.test.jdh.grpc.grpcmodel.Bank.AccountNotification> getListenToNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListenToNotifications",
      requestType = com.test.jdh.grpc.grpcmodel.Bank.Account.class,
      responseType = com.test.jdh.grpc.grpcmodel.Bank.AccountNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.Account,
      com.test.jdh.grpc.grpcmodel.Bank.AccountNotification> getListenToNotificationsMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.Account, com.test.jdh.grpc.grpcmodel.Bank.AccountNotification> getListenToNotificationsMethod;
    if ((getListenToNotificationsMethod = bankGrpc.getListenToNotificationsMethod) == null) {
      synchronized (bankGrpc.class) {
        if ((getListenToNotificationsMethod = bankGrpc.getListenToNotificationsMethod) == null) {
          bankGrpc.getListenToNotificationsMethod = getListenToNotificationsMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.grpc.grpcmodel.Bank.Account, com.test.jdh.grpc.grpcmodel.Bank.AccountNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListenToNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.grpc.grpcmodel.Bank.Account.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.grpc.grpcmodel.Bank.AccountNotification.getDefaultInstance()))
              .setSchemaDescriptor(new bankMethodDescriptorSupplier("ListenToNotifications"))
              .build();
        }
      }
    }
    return getListenToNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.RequestMoney,
      com.test.jdh.grpc.grpcmodel.Bank.RequestStatus> getRequestTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestTransfer",
      requestType = com.test.jdh.grpc.grpcmodel.Bank.RequestMoney.class,
      responseType = com.test.jdh.grpc.grpcmodel.Bank.RequestStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.RequestMoney,
      com.test.jdh.grpc.grpcmodel.Bank.RequestStatus> getRequestTransferMethod() {
    io.grpc.MethodDescriptor<com.test.jdh.grpc.grpcmodel.Bank.RequestMoney, com.test.jdh.grpc.grpcmodel.Bank.RequestStatus> getRequestTransferMethod;
    if ((getRequestTransferMethod = bankGrpc.getRequestTransferMethod) == null) {
      synchronized (bankGrpc.class) {
        if ((getRequestTransferMethod = bankGrpc.getRequestTransferMethod) == null) {
          bankGrpc.getRequestTransferMethod = getRequestTransferMethod =
              io.grpc.MethodDescriptor.<com.test.jdh.grpc.grpcmodel.Bank.RequestMoney, com.test.jdh.grpc.grpcmodel.Bank.RequestStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RequestTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.grpc.grpcmodel.Bank.RequestMoney.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.test.jdh.grpc.grpcmodel.Bank.RequestStatus.getDefaultInstance()))
              .setSchemaDescriptor(new bankMethodDescriptorSupplier("RequestTransfer"))
              .build();
        }
      }
    }
    return getRequestTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static bankStub newStub(io.grpc.Channel channel) {
    return new bankStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static bankBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new bankBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static bankFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new bankFutureStub(channel);
  }

  /**
   */
  public static abstract class bankImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * you send money to other acc
     * </pre>
     */
    public void transfer(com.test.jdh.grpc.grpcmodel.Bank.TransferMoney request,
        io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * listening noti your acc
     * </pre>
     */
    public void listenToNotifications(com.test.jdh.grpc.grpcmodel.Bank.Account request,
        io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.AccountNotification> responseObserver) {
      asyncUnimplementedUnaryCall(getListenToNotificationsMethod(), responseObserver);
    }

    /**
     * <pre>
     * withdraw from your acc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.RequestMoney> requestTransfer(
        io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.RequestStatus> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestTransferMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.test.jdh.grpc.grpcmodel.Bank.TransferMoney,
                com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation>(
                  this, METHODID_TRANSFER)))
          .addMethod(
            getListenToNotificationsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.test.jdh.grpc.grpcmodel.Bank.Account,
                com.test.jdh.grpc.grpcmodel.Bank.AccountNotification>(
                  this, METHODID_LISTEN_TO_NOTIFICATIONS)))
          .addMethod(
            getRequestTransferMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.test.jdh.grpc.grpcmodel.Bank.RequestMoney,
                com.test.jdh.grpc.grpcmodel.Bank.RequestStatus>(
                  this, METHODID_REQUEST_TRANSFER)))
          .build();
    }
  }

  /**
   */
  public static final class bankStub extends io.grpc.stub.AbstractStub<bankStub> {
    private bankStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankStub(channel, callOptions);
    }

    /**
     * <pre>
     * you send money to other acc
     * </pre>
     */
    public void transfer(com.test.jdh.grpc.grpcmodel.Bank.TransferMoney request,
        io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * listening noti your acc
     * </pre>
     */
    public void listenToNotifications(com.test.jdh.grpc.grpcmodel.Bank.Account request,
        io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.AccountNotification> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListenToNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * withdraw from your acc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.RequestMoney> requestTransfer(
        io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.RequestStatus> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRequestTransferMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class bankBlockingStub extends io.grpc.stub.AbstractStub<bankBlockingStub> {
    private bankBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * you send money to other acc
     * </pre>
     */
    public com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation transfer(com.test.jdh.grpc.grpcmodel.Bank.TransferMoney request) {
      return blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * listening noti your acc
     * </pre>
     */
    public java.util.Iterator<com.test.jdh.grpc.grpcmodel.Bank.AccountNotification> listenToNotifications(
        com.test.jdh.grpc.grpcmodel.Bank.Account request) {
      return blockingServerStreamingCall(
          getChannel(), getListenToNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class bankFutureStub extends io.grpc.stub.AbstractStub<bankFutureStub> {
    private bankFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private bankFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected bankFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new bankFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * you send money to other acc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation> transfer(
        com.test.jdh.grpc.grpcmodel.Bank.TransferMoney request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSFER = 0;
  private static final int METHODID_LISTEN_TO_NOTIFICATIONS = 1;
  private static final int METHODID_REQUEST_TRANSFER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final bankImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(bankImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSFER:
          serviceImpl.transfer((com.test.jdh.grpc.grpcmodel.Bank.TransferMoney) request,
              (io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.TransferConfirmation>) responseObserver);
          break;
        case METHODID_LISTEN_TO_NOTIFICATIONS:
          serviceImpl.listenToNotifications((com.test.jdh.grpc.grpcmodel.Bank.Account) request,
              (io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.AccountNotification>) responseObserver);
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
        case METHODID_REQUEST_TRANSFER:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestTransfer(
              (io.grpc.stub.StreamObserver<com.test.jdh.grpc.grpcmodel.Bank.RequestStatus>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class bankBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    bankBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.test.jdh.grpc.grpcmodel.Bank.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("bank");
    }
  }

  private static final class bankFileDescriptorSupplier
      extends bankBaseDescriptorSupplier {
    bankFileDescriptorSupplier() {}
  }

  private static final class bankMethodDescriptorSupplier
      extends bankBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    bankMethodDescriptorSupplier(String methodName) {
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
      synchronized (bankGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new bankFileDescriptorSupplier())
              .addMethod(getTransferMethod())
              .addMethod(getListenToNotificationsMethod())
              .addMethod(getRequestTransferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
