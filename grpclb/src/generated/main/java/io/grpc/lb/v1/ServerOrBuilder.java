// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/lb/v1/load_balancer.proto

package io.grpc.lb.v1;

public interface ServerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lb.v1.Server)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A resolved address for the server, serialized in network-byte-order. It may
   * either be an IPv4 or IPv6 address.
   * </pre>
   *
   * <code>bytes ip_address = 1;</code>
   */
  com.google.protobuf.ByteString getIpAddress();

  /**
   * <pre>
   * A resolved port number for the server.
   * </pre>
   *
   * <code>int32 port = 2;</code>
   */
  int getPort();

  /**
   * <pre>
   * An opaque but printable token for load reporting. The client must include
   * the token of the picked server into the initial metadata when it starts a
   * call to that server. The token is used by the server to verify the request
   * and to allow the server to report load to the gRPC LB system. The token is
   * also used in client stats for reporting dropped calls.
   * Its length can be variable but must be less than 50 bytes.
   * </pre>
   *
   * <code>string load_balance_token = 3;</code>
   */
  java.lang.String getLoadBalanceToken();
  /**
   * <pre>
   * An opaque but printable token for load reporting. The client must include
   * the token of the picked server into the initial metadata when it starts a
   * call to that server. The token is used by the server to verify the request
   * and to allow the server to report load to the gRPC LB system. The token is
   * also used in client stats for reporting dropped calls.
   * Its length can be variable but must be less than 50 bytes.
   * </pre>
   *
   * <code>string load_balance_token = 3;</code>
   */
  com.google.protobuf.ByteString
      getLoadBalanceTokenBytes();

  /**
   * <pre>
   * Indicates whether this particular request should be dropped by the client.
   * If the request is dropped, there will be a corresponding entry in
   * ClientStats.calls_finished_with_drop.
   * </pre>
   *
   * <code>bool drop = 4;</code>
   */
  boolean getDrop();
}
