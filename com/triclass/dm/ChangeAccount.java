// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dm/change_account.proto

package com.triclass.dm;

/**
 * Protobuf type {@code triclass.dm.ChangeAccount}
 */
public final class ChangeAccount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:triclass.dm.ChangeAccount)
    ChangeAccountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeAccount.newBuilder() to construct.
  private ChangeAccount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeAccount() {
    manufacturer_ = 0;
    sn_ = "";
    account_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeAccount();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChangeAccount(
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
            int rawValue = input.readEnum();

            manufacturer_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sn_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            account_ = s;
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
    return com.triclass.dm.ChangeAccountOuterClass.internal_static_triclass_dm_ChangeAccount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.triclass.dm.ChangeAccountOuterClass.internal_static_triclass_dm_ChangeAccount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.triclass.dm.ChangeAccount.class, com.triclass.dm.ChangeAccount.Builder.class);
  }

  public static final int MANUFACTURER_FIELD_NUMBER = 1;
  private int manufacturer_;
  /**
   * <pre>
   * 厂商
   * </pre>
   *
   * <code>.triclass.manufacturer.Manufacturer manufacturer = 1;</code>
   * @return The enum numeric value on the wire for manufacturer.
   */
  @java.lang.Override public int getManufacturerValue() {
    return manufacturer_;
  }
  /**
   * <pre>
   * 厂商
   * </pre>
   *
   * <code>.triclass.manufacturer.Manufacturer manufacturer = 1;</code>
   * @return The manufacturer.
   */
  @java.lang.Override public com.triclass.Manufacturer getManufacturer() {
    @SuppressWarnings("deprecation")
    com.triclass.Manufacturer result = com.triclass.Manufacturer.valueOf(manufacturer_);
    return result == null ? com.triclass.Manufacturer.UNRECOGNIZED : result;
  }

  public static final int SN_FIELD_NUMBER = 2;
  private volatile java.lang.Object sn_;
  /**
   * <pre>
   * 设备序列号
   * </pre>
   *
   * <code>string sn = 2;</code>
   * @return The sn.
   */
  @java.lang.Override
  public java.lang.String getSn() {
    java.lang.Object ref = sn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 设备序列号
   * </pre>
   *
   * <code>string sn = 2;</code>
   * @return The bytes for sn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSnBytes() {
    java.lang.Object ref = sn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_FIELD_NUMBER = 3;
  private volatile java.lang.Object account_;
  /**
   * <pre>
   * 云视讯账号
   * </pre>
   *
   * <code>string account = 3;</code>
   * @return The account.
   */
  @java.lang.Override
  public java.lang.String getAccount() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      account_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 云视讯账号
   * </pre>
   *
   * <code>string account = 3;</code>
   * @return The bytes for account.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountBytes() {
    java.lang.Object ref = account_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      account_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (manufacturer_ != com.triclass.Manufacturer.UNKNOWN.getNumber()) {
      output.writeEnum(1, manufacturer_);
    }
    if (!getSnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sn_);
    }
    if (!getAccountBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, account_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (manufacturer_ != com.triclass.Manufacturer.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, manufacturer_);
    }
    if (!getSnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sn_);
    }
    if (!getAccountBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, account_);
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
    if (!(obj instanceof com.triclass.dm.ChangeAccount)) {
      return super.equals(obj);
    }
    com.triclass.dm.ChangeAccount other = (com.triclass.dm.ChangeAccount) obj;

    if (manufacturer_ != other.manufacturer_) return false;
    if (!getSn()
        .equals(other.getSn())) return false;
    if (!getAccount()
        .equals(other.getAccount())) return false;
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
    hash = (37 * hash) + MANUFACTURER_FIELD_NUMBER;
    hash = (53 * hash) + manufacturer_;
    hash = (37 * hash) + SN_FIELD_NUMBER;
    hash = (53 * hash) + getSn().hashCode();
    hash = (37 * hash) + ACCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAccount().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.triclass.dm.ChangeAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.triclass.dm.ChangeAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.triclass.dm.ChangeAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.triclass.dm.ChangeAccount parseFrom(
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
  public static Builder newBuilder(com.triclass.dm.ChangeAccount prototype) {
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
   * Protobuf type {@code triclass.dm.ChangeAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:triclass.dm.ChangeAccount)
      com.triclass.dm.ChangeAccountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.triclass.dm.ChangeAccountOuterClass.internal_static_triclass_dm_ChangeAccount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.triclass.dm.ChangeAccountOuterClass.internal_static_triclass_dm_ChangeAccount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.triclass.dm.ChangeAccount.class, com.triclass.dm.ChangeAccount.Builder.class);
    }

    // Construct using com.triclass.dm.ChangeAccount.newBuilder()
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
      manufacturer_ = 0;

      sn_ = "";

      account_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.triclass.dm.ChangeAccountOuterClass.internal_static_triclass_dm_ChangeAccount_descriptor;
    }

    @java.lang.Override
    public com.triclass.dm.ChangeAccount getDefaultInstanceForType() {
      return com.triclass.dm.ChangeAccount.getDefaultInstance();
    }

    @java.lang.Override
    public com.triclass.dm.ChangeAccount build() {
      com.triclass.dm.ChangeAccount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.triclass.dm.ChangeAccount buildPartial() {
      com.triclass.dm.ChangeAccount result = new com.triclass.dm.ChangeAccount(this);
      result.manufacturer_ = manufacturer_;
      result.sn_ = sn_;
      result.account_ = account_;
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
      if (other instanceof com.triclass.dm.ChangeAccount) {
        return mergeFrom((com.triclass.dm.ChangeAccount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.triclass.dm.ChangeAccount other) {
      if (other == com.triclass.dm.ChangeAccount.getDefaultInstance()) return this;
      if (other.manufacturer_ != 0) {
        setManufacturerValue(other.getManufacturerValue());
      }
      if (!other.getSn().isEmpty()) {
        sn_ = other.sn_;
        onChanged();
      }
      if (!other.getAccount().isEmpty()) {
        account_ = other.account_;
        onChanged();
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
      com.triclass.dm.ChangeAccount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.triclass.dm.ChangeAccount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int manufacturer_ = 0;
    /**
     * <pre>
     * 厂商
     * </pre>
     *
     * <code>.triclass.manufacturer.Manufacturer manufacturer = 1;</code>
     * @return The enum numeric value on the wire for manufacturer.
     */
    @java.lang.Override public int getManufacturerValue() {
      return manufacturer_;
    }
    /**
     * <pre>
     * 厂商
     * </pre>
     *
     * <code>.triclass.manufacturer.Manufacturer manufacturer = 1;</code>
     * @param value The enum numeric value on the wire for manufacturer to set.
     * @return This builder for chaining.
     */
    public Builder setManufacturerValue(int value) {
      
      manufacturer_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 厂商
     * </pre>
     *
     * <code>.triclass.manufacturer.Manufacturer manufacturer = 1;</code>
     * @return The manufacturer.
     */
    @java.lang.Override
    public com.triclass.Manufacturer getManufacturer() {
      @SuppressWarnings("deprecation")
      com.triclass.Manufacturer result = com.triclass.Manufacturer.valueOf(manufacturer_);
      return result == null ? com.triclass.Manufacturer.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * 厂商
     * </pre>
     *
     * <code>.triclass.manufacturer.Manufacturer manufacturer = 1;</code>
     * @param value The manufacturer to set.
     * @return This builder for chaining.
     */
    public Builder setManufacturer(com.triclass.Manufacturer value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      manufacturer_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 厂商
     * </pre>
     *
     * <code>.triclass.manufacturer.Manufacturer manufacturer = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearManufacturer() {
      
      manufacturer_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sn_ = "";
    /**
     * <pre>
     * 设备序列号
     * </pre>
     *
     * <code>string sn = 2;</code>
     * @return The sn.
     */
    public java.lang.String getSn() {
      java.lang.Object ref = sn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 设备序列号
     * </pre>
     *
     * <code>string sn = 2;</code>
     * @return The bytes for sn.
     */
    public com.google.protobuf.ByteString
        getSnBytes() {
      java.lang.Object ref = sn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 设备序列号
     * </pre>
     *
     * <code>string sn = 2;</code>
     * @param value The sn to set.
     * @return This builder for chaining.
     */
    public Builder setSn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 设备序列号
     * </pre>
     *
     * <code>string sn = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSn() {
      
      sn_ = getDefaultInstance().getSn();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 设备序列号
     * </pre>
     *
     * <code>string sn = 2;</code>
     * @param value The bytes for sn to set.
     * @return This builder for chaining.
     */
    public Builder setSnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sn_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object account_ = "";
    /**
     * <pre>
     * 云视讯账号
     * </pre>
     *
     * <code>string account = 3;</code>
     * @return The account.
     */
    public java.lang.String getAccount() {
      java.lang.Object ref = account_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        account_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 云视讯账号
     * </pre>
     *
     * <code>string account = 3;</code>
     * @return The bytes for account.
     */
    public com.google.protobuf.ByteString
        getAccountBytes() {
      java.lang.Object ref = account_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        account_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 云视讯账号
     * </pre>
     *
     * <code>string account = 3;</code>
     * @param value The account to set.
     * @return This builder for chaining.
     */
    public Builder setAccount(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      account_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 云视讯账号
     * </pre>
     *
     * <code>string account = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccount() {
      
      account_ = getDefaultInstance().getAccount();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 云视讯账号
     * </pre>
     *
     * <code>string account = 3;</code>
     * @param value The bytes for account to set.
     * @return This builder for chaining.
     */
    public Builder setAccountBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      account_ = value;
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


    // @@protoc_insertion_point(builder_scope:triclass.dm.ChangeAccount)
  }

  // @@protoc_insertion_point(class_scope:triclass.dm.ChangeAccount)
  private static final com.triclass.dm.ChangeAccount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.triclass.dm.ChangeAccount();
  }

  public static com.triclass.dm.ChangeAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeAccount>
      PARSER = new com.google.protobuf.AbstractParser<ChangeAccount>() {
    @java.lang.Override
    public ChangeAccount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChangeAccount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChangeAccount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeAccount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.triclass.dm.ChangeAccount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

