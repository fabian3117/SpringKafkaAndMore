// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: store.proto

package com.paradigma.grpc.streaming;

public interface ProductOrBuilder extends
    // @@protoc_insertion_point(interface_extends:store.Product)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string product_id = 1;</code>
   * @return The productId.
   */
  java.lang.String getProductId();
  /**
   * <code>string product_id = 1;</code>
   * @return The bytes for productId.
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <code>string product_name = 2;</code>
   * @return The productName.
   */
  java.lang.String getProductName();
  /**
   * <code>string product_name = 2;</code>
   * @return The bytes for productName.
   */
  com.google.protobuf.ByteString
      getProductNameBytes();

  /**
   * <code>string product_description = 3;</code>
   * @return The productDescription.
   */
  java.lang.String getProductDescription();
  /**
   * <code>string product_description = 3;</code>
   * @return The bytes for productDescription.
   */
  com.google.protobuf.ByteString
      getProductDescriptionBytes();

  /**
   * <code>double product_price = 4;</code>
   * @return The productPrice.
   */
  double getProductPrice();
}
