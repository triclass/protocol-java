// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: timestamp.proto

package com.triclass;

/**
 * <pre>
 * 时间戳
 * </pre>
 *
 * Protobuf type {@code triclass.timestamp.Timestamp}
 */
public final class Timestamp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:triclass.timestamp.Timestamp)
    TimestampOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Timestamp.newBuilder() to construct.
  private Timestamp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Timestamp() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Timestamp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Timestamp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            start_ = input.readInt64();
            break;
          }
          case 16: {

            end_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.triclass.TimestampOuterClass.internal_static_triclass_timestamp_Timestamp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.triclass.TimestampOuterClass.internal_static_triclass_timestamp_Timestamp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.triclass.Timestamp.class, com.triclass.Timestamp.Builder.class);
  }

  public static final int START_FIELD_NUMBER = 1;
  private long start_;
  /**
   * <pre>
   * 开始时间
   * </pre>
   *
   * <code>int64 start = 1;</code>
   * @return The start.
   */
  @java.lang.Override
  public long getStart() {
    return start_;
  }

  public static final int END_FIELD_NUMBER = 2;
  private long end_;
  /**
   * <pre>
   * 结束时间
   * </pre>
   *
   * <code>int64 end = 2;</code>
   * @return The end.
   */
  @java.lang.Override
  public long getEnd() {
    return end_;
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
    if (start_ != 0L) {
      output.writeInt64(1, start_);
    }
    if (end_ != 0L) {
      output.writeInt64(2, end_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (start_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, start_);
    }
    if (end_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, end_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.triclass.Timestamp)) {
      return super.equals(obj);
    }
    com.triclass.Timestamp other = (com.triclass.Timestamp) obj;

    if (getStart()
        != other.getStart()) return false;
    if (getEnd()
        != other.getEnd()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStart());
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getEnd());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.triclass.Timestamp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.triclass.Timestamp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.triclass.Timestamp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.triclass.Timestamp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.triclass.Timestamp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.triclass.Timestamp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.triclass.Timestamp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.triclass.Timestamp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.triclass.Timestamp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.triclass.Timestamp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.triclass.Timestamp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.triclass.Timestamp parseFrom(
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
  public static Builder newBuilder(com.triclass.Timestamp prototype) {
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
   * <pre>
   * 时间戳
   * </pre>
   *
   * Protobuf type {@code triclass.timestamp.Timestamp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:triclass.timestamp.Timestamp)
      com.triclass.TimestampOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.triclass.TimestampOuterClass.internal_static_triclass_timestamp_Timestamp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.triclass.TimestampOuterClass.internal_static_triclass_timestamp_Timestamp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.triclass.Timestamp.class, com.triclass.Timestamp.Builder.class);
    }

    // Construct using com.triclass.Timestamp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      start_ = 0L;

      end_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.triclass.TimestampOuterClass.internal_static_triclass_timestamp_Timestamp_descriptor;
    }

    @java.lang.Override
    public com.triclass.Timestamp getDefaultInstanceForType() {
      return com.triclass.Timestamp.getDefaultInstance();
    }

    @java.lang.Override
    public com.triclass.Timestamp build() {
      com.triclass.Timestamp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.triclass.Timestamp buildPartial() {
      com.triclass.Timestamp result = new com.triclass.Timestamp(this);
      result.start_ = start_;
      result.end_ = end_;
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
      if (other instanceof com.triclass.Timestamp) {
        return mergeFrom((com.triclass.Timestamp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.triclass.Timestamp other) {
      if (other == com.triclass.Timestamp.getDefaultInstance()) return this;
      if (other.getStart() != 0L) {
        setStart(other.getStart());
      }
      if (other.getEnd() != 0L) {
        setEnd(other.getEnd());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.triclass.Timestamp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.triclass.Timestamp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long start_ ;
    /**
     * <pre>
     * 开始时间
     * </pre>
     *
     * <code>int64 start = 1;</code>
     * @return The start.
     */
    @java.lang.Override
    public long getStart() {
      return start_;
    }
    /**
     * <pre>
     * 开始时间
     * </pre>
     *
     * <code>int64 start = 1;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(long value) {
      
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 开始时间
     * </pre>
     *
     * <code>int64 start = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      
      start_ = 0L;
      onChanged();
      return this;
    }

    private long end_ ;
    /**
     * <pre>
     * 结束时间
     * </pre>
     *
     * <code>int64 end = 2;</code>
     * @return The end.
     */
    @java.lang.Override
    public long getEnd() {
      return end_;
    }
    /**
     * <pre>
     * 结束时间
     * </pre>
     *
     * <code>int64 end = 2;</code>
     * @param value The end to set.
     * @return This builder for chaining.
     */
    public Builder setEnd(long value) {
      
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 结束时间
     * </pre>
     *
     * <code>int64 end = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnd() {
      
      end_ = 0L;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:triclass.timestamp.Timestamp)
  }

  // @@protoc_insertion_point(class_scope:triclass.timestamp.Timestamp)
  private static final com.triclass.Timestamp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.triclass.Timestamp();
  }

  public static com.triclass.Timestamp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Timestamp>
      PARSER = new com.google.protobuf.AbstractParser<Timestamp>() {
    @java.lang.Override
    public Timestamp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Timestamp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Timestamp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Timestamp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.triclass.Timestamp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
