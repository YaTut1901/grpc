package com.yrrhelp.grpc;

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
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: link.proto")
public final class linkGrpc {

  private linkGrpc() {}

  public static final String SERVICE_NAME = "link";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.yrrhelp.grpc.Link.LinkRequest,
      com.yrrhelp.grpc.Link.APIResponse> getTimeoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "timeout",
      requestType = com.yrrhelp.grpc.Link.LinkRequest.class,
      responseType = com.yrrhelp.grpc.Link.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.yrrhelp.grpc.Link.LinkRequest,
      com.yrrhelp.grpc.Link.APIResponse> getTimeoutMethod() {
    io.grpc.MethodDescriptor<com.yrrhelp.grpc.Link.LinkRequest, com.yrrhelp.grpc.Link.APIResponse> getTimeoutMethod;
    if ((getTimeoutMethod = linkGrpc.getTimeoutMethod) == null) {
      synchronized (linkGrpc.class) {
        if ((getTimeoutMethod = linkGrpc.getTimeoutMethod) == null) {
          linkGrpc.getTimeoutMethod = getTimeoutMethod = 
              io.grpc.MethodDescriptor.<com.yrrhelp.grpc.Link.LinkRequest, com.yrrhelp.grpc.Link.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "link", "timeout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yrrhelp.grpc.Link.LinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.yrrhelp.grpc.Link.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new linkMethodDescriptorSupplier("timeout"))
                  .build();
          }
        }
     }
     return getTimeoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static linkStub newStub(io.grpc.Channel channel) {
    return new linkStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static linkBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new linkBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static linkFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new linkFutureStub(channel);
  }

  /**
   */
  public static abstract class linkImplBase implements io.grpc.BindableService {

    /**
     */
    public void timeout(com.yrrhelp.grpc.Link.LinkRequest request,
        io.grpc.stub.StreamObserver<com.yrrhelp.grpc.Link.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTimeoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTimeoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.yrrhelp.grpc.Link.LinkRequest,
                com.yrrhelp.grpc.Link.APIResponse>(
                  this, METHODID_TIMEOUT)))
          .build();
    }
  }

  /**
   */
  public static final class linkStub extends io.grpc.stub.AbstractStub<linkStub> {
    private linkStub(io.grpc.Channel channel) {
      super(channel);
    }

    private linkStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected linkStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new linkStub(channel, callOptions);
    }

    /**
     */
    public void timeout(com.yrrhelp.grpc.Link.LinkRequest request,
        io.grpc.stub.StreamObserver<com.yrrhelp.grpc.Link.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class linkBlockingStub extends io.grpc.stub.AbstractStub<linkBlockingStub> {
    private linkBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private linkBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected linkBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new linkBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.yrrhelp.grpc.Link.APIResponse timeout(com.yrrhelp.grpc.Link.LinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getTimeoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class linkFutureStub extends io.grpc.stub.AbstractStub<linkFutureStub> {
    private linkFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private linkFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected linkFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new linkFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.yrrhelp.grpc.Link.APIResponse> timeout(
        com.yrrhelp.grpc.Link.LinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTimeoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TIMEOUT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final linkImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(linkImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TIMEOUT:
          serviceImpl.timeout((com.yrrhelp.grpc.Link.LinkRequest) request,
              (io.grpc.stub.StreamObserver<com.yrrhelp.grpc.Link.APIResponse>) responseObserver);
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

  private static abstract class linkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    linkBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.yrrhelp.grpc.Link.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("link");
    }
  }

  private static final class linkFileDescriptorSupplier
      extends linkBaseDescriptorSupplier {
    linkFileDescriptorSupplier() {}
  }

  private static final class linkMethodDescriptorSupplier
      extends linkBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    linkMethodDescriptorSupplier(String methodName) {
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
      synchronized (linkGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new linkFileDescriptorSupplier())
              .addMethod(getTimeoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
