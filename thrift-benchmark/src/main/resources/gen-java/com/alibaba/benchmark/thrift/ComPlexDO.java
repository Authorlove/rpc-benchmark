/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.alibaba.benchmark.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2019-01-18")
public class ComPlexDO implements org.apache.thrift.TBase<ComPlexDO, ComPlexDO._Fields>, java.io.Serializable, Cloneable, Comparable<ComPlexDO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ComPlexDO");

  private static final org.apache.thrift.protocol.TField PINT_FIELD_DESC = new org.apache.thrift.protocol.TField("pint", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField PLONG_FIELD_DESC = new org.apache.thrift.protocol.TField("plong", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField PFLOAT_FIELD_DESC = new org.apache.thrift.protocol.TField("pfloat", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField LONG_ARRAY_FIELD_DESC = new org.apache.thrift.protocol.TField("longArray", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField STRING_ARRAY_FIELD_DESC = new org.apache.thrift.protocol.TField("stringArray", org.apache.thrift.protocol.TType.LIST, (short)5);
  private static final org.apache.thrift.protocol.TField IP_FIELD_DESC = new org.apache.thrift.protocol.TField("ip", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ComPlexDOStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ComPlexDOTupleSchemeFactory();

  public int pint; // required
  public long plong; // required
  public double pfloat; // required
  public java.util.List<java.lang.Long> longArray; // required
  public java.util.List<java.lang.String> stringArray; // required
  public java.lang.String ip; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PINT((short)1, "pint"),
    PLONG((short)2, "plong"),
    PFLOAT((short)3, "pfloat"),
    LONG_ARRAY((short)4, "longArray"),
    STRING_ARRAY((short)5, "stringArray"),
    IP((short)6, "ip");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PINT
          return PINT;
        case 2: // PLONG
          return PLONG;
        case 3: // PFLOAT
          return PFLOAT;
        case 4: // LONG_ARRAY
          return LONG_ARRAY;
        case 5: // STRING_ARRAY
          return STRING_ARRAY;
        case 6: // IP
          return IP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PINT_ISSET_ID = 0;
  private static final int __PLONG_ISSET_ID = 1;
  private static final int __PFLOAT_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PINT, new org.apache.thrift.meta_data.FieldMetaData("pint", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PLONG, new org.apache.thrift.meta_data.FieldMetaData("plong", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PFLOAT, new org.apache.thrift.meta_data.FieldMetaData("pfloat", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.LONG_ARRAY, new org.apache.thrift.meta_data.FieldMetaData("longArray", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64))));
    tmpMap.put(_Fields.STRING_ARRAY, new org.apache.thrift.meta_data.FieldMetaData("stringArray", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.IP, new org.apache.thrift.meta_data.FieldMetaData("ip", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ComPlexDO.class, metaDataMap);
  }

  public ComPlexDO() {
  }

  public ComPlexDO(
    int pint,
    long plong,
    double pfloat,
    java.util.List<java.lang.Long> longArray,
    java.util.List<java.lang.String> stringArray,
    java.lang.String ip)
  {
    this();
    this.pint = pint;
    setPintIsSet(true);
    this.plong = plong;
    setPlongIsSet(true);
    this.pfloat = pfloat;
    setPfloatIsSet(true);
    this.longArray = longArray;
    this.stringArray = stringArray;
    this.ip = ip;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ComPlexDO(ComPlexDO other) {
    __isset_bitfield = other.__isset_bitfield;
    this.pint = other.pint;
    this.plong = other.plong;
    this.pfloat = other.pfloat;
    if (other.isSetLongArray()) {
      java.util.List<java.lang.Long> __this__longArray = new java.util.ArrayList<java.lang.Long>(other.longArray);
      this.longArray = __this__longArray;
    }
    if (other.isSetStringArray()) {
      java.util.List<java.lang.String> __this__stringArray = new java.util.ArrayList<java.lang.String>(other.stringArray);
      this.stringArray = __this__stringArray;
    }
    if (other.isSetIp()) {
      this.ip = other.ip;
    }
  }

  public ComPlexDO deepCopy() {
    return new ComPlexDO(this);
  }

  @Override
  public void clear() {
    setPintIsSet(false);
    this.pint = 0;
    setPlongIsSet(false);
    this.plong = 0;
    setPfloatIsSet(false);
    this.pfloat = 0.0;
    this.longArray = null;
    this.stringArray = null;
    this.ip = null;
  }

  public int getPint() {
    return this.pint;
  }

  public ComPlexDO setPint(int pint) {
    this.pint = pint;
    setPintIsSet(true);
    return this;
  }

  public void unsetPint() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PINT_ISSET_ID);
  }

  /** Returns true if field pint is set (has been assigned a value) and false otherwise */
  public boolean isSetPint() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PINT_ISSET_ID);
  }

  public void setPintIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PINT_ISSET_ID, value);
  }

  public long getPlong() {
    return this.plong;
  }

  public ComPlexDO setPlong(long plong) {
    this.plong = plong;
    setPlongIsSet(true);
    return this;
  }

  public void unsetPlong() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PLONG_ISSET_ID);
  }

  /** Returns true if field plong is set (has been assigned a value) and false otherwise */
  public boolean isSetPlong() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PLONG_ISSET_ID);
  }

  public void setPlongIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PLONG_ISSET_ID, value);
  }

  public double getPfloat() {
    return this.pfloat;
  }

  public ComPlexDO setPfloat(double pfloat) {
    this.pfloat = pfloat;
    setPfloatIsSet(true);
    return this;
  }

  public void unsetPfloat() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PFLOAT_ISSET_ID);
  }

  /** Returns true if field pfloat is set (has been assigned a value) and false otherwise */
  public boolean isSetPfloat() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PFLOAT_ISSET_ID);
  }

  public void setPfloatIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PFLOAT_ISSET_ID, value);
  }

  public int getLongArraySize() {
    return (this.longArray == null) ? 0 : this.longArray.size();
  }

  public java.util.Iterator<java.lang.Long> getLongArrayIterator() {
    return (this.longArray == null) ? null : this.longArray.iterator();
  }

  public void addToLongArray(long elem) {
    if (this.longArray == null) {
      this.longArray = new java.util.ArrayList<java.lang.Long>();
    }
    this.longArray.add(elem);
  }

  public java.util.List<java.lang.Long> getLongArray() {
    return this.longArray;
  }

  public ComPlexDO setLongArray(java.util.List<java.lang.Long> longArray) {
    this.longArray = longArray;
    return this;
  }

  public void unsetLongArray() {
    this.longArray = null;
  }

  /** Returns true if field longArray is set (has been assigned a value) and false otherwise */
  public boolean isSetLongArray() {
    return this.longArray != null;
  }

  public void setLongArrayIsSet(boolean value) {
    if (!value) {
      this.longArray = null;
    }
  }

  public int getStringArraySize() {
    return (this.stringArray == null) ? 0 : this.stringArray.size();
  }

  public java.util.Iterator<java.lang.String> getStringArrayIterator() {
    return (this.stringArray == null) ? null : this.stringArray.iterator();
  }

  public void addToStringArray(java.lang.String elem) {
    if (this.stringArray == null) {
      this.stringArray = new java.util.ArrayList<java.lang.String>();
    }
    this.stringArray.add(elem);
  }

  public java.util.List<java.lang.String> getStringArray() {
    return this.stringArray;
  }

  public ComPlexDO setStringArray(java.util.List<java.lang.String> stringArray) {
    this.stringArray = stringArray;
    return this;
  }

  public void unsetStringArray() {
    this.stringArray = null;
  }

  /** Returns true if field stringArray is set (has been assigned a value) and false otherwise */
  public boolean isSetStringArray() {
    return this.stringArray != null;
  }

  public void setStringArrayIsSet(boolean value) {
    if (!value) {
      this.stringArray = null;
    }
  }

  public java.lang.String getIp() {
    return this.ip;
  }

  public ComPlexDO setIp(java.lang.String ip) {
    this.ip = ip;
    return this;
  }

  public void unsetIp() {
    this.ip = null;
  }

  /** Returns true if field ip is set (has been assigned a value) and false otherwise */
  public boolean isSetIp() {
    return this.ip != null;
  }

  public void setIpIsSet(boolean value) {
    if (!value) {
      this.ip = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PINT:
      if (value == null) {
        unsetPint();
      } else {
        setPint((java.lang.Integer)value);
      }
      break;

    case PLONG:
      if (value == null) {
        unsetPlong();
      } else {
        setPlong((java.lang.Long)value);
      }
      break;

    case PFLOAT:
      if (value == null) {
        unsetPfloat();
      } else {
        setPfloat((java.lang.Double)value);
      }
      break;

    case LONG_ARRAY:
      if (value == null) {
        unsetLongArray();
      } else {
        setLongArray((java.util.List<java.lang.Long>)value);
      }
      break;

    case STRING_ARRAY:
      if (value == null) {
        unsetStringArray();
      } else {
        setStringArray((java.util.List<java.lang.String>)value);
      }
      break;

    case IP:
      if (value == null) {
        unsetIp();
      } else {
        setIp((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PINT:
      return getPint();

    case PLONG:
      return getPlong();

    case PFLOAT:
      return getPfloat();

    case LONG_ARRAY:
      return getLongArray();

    case STRING_ARRAY:
      return getStringArray();

    case IP:
      return getIp();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PINT:
      return isSetPint();
    case PLONG:
      return isSetPlong();
    case PFLOAT:
      return isSetPfloat();
    case LONG_ARRAY:
      return isSetLongArray();
    case STRING_ARRAY:
      return isSetStringArray();
    case IP:
      return isSetIp();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ComPlexDO)
      return this.equals((ComPlexDO)that);
    return false;
  }

  public boolean equals(ComPlexDO that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pint = true;
    boolean that_present_pint = true;
    if (this_present_pint || that_present_pint) {
      if (!(this_present_pint && that_present_pint))
        return false;
      if (this.pint != that.pint)
        return false;
    }

    boolean this_present_plong = true;
    boolean that_present_plong = true;
    if (this_present_plong || that_present_plong) {
      if (!(this_present_plong && that_present_plong))
        return false;
      if (this.plong != that.plong)
        return false;
    }

    boolean this_present_pfloat = true;
    boolean that_present_pfloat = true;
    if (this_present_pfloat || that_present_pfloat) {
      if (!(this_present_pfloat && that_present_pfloat))
        return false;
      if (this.pfloat != that.pfloat)
        return false;
    }

    boolean this_present_longArray = true && this.isSetLongArray();
    boolean that_present_longArray = true && that.isSetLongArray();
    if (this_present_longArray || that_present_longArray) {
      if (!(this_present_longArray && that_present_longArray))
        return false;
      if (!this.longArray.equals(that.longArray))
        return false;
    }

    boolean this_present_stringArray = true && this.isSetStringArray();
    boolean that_present_stringArray = true && that.isSetStringArray();
    if (this_present_stringArray || that_present_stringArray) {
      if (!(this_present_stringArray && that_present_stringArray))
        return false;
      if (!this.stringArray.equals(that.stringArray))
        return false;
    }

    boolean this_present_ip = true && this.isSetIp();
    boolean that_present_ip = true && that.isSetIp();
    if (this_present_ip || that_present_ip) {
      if (!(this_present_ip && that_present_ip))
        return false;
      if (!this.ip.equals(that.ip))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + pint;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(plong);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(pfloat);

    hashCode = hashCode * 8191 + ((isSetLongArray()) ? 131071 : 524287);
    if (isSetLongArray())
      hashCode = hashCode * 8191 + longArray.hashCode();

    hashCode = hashCode * 8191 + ((isSetStringArray()) ? 131071 : 524287);
    if (isSetStringArray())
      hashCode = hashCode * 8191 + stringArray.hashCode();

    hashCode = hashCode * 8191 + ((isSetIp()) ? 131071 : 524287);
    if (isSetIp())
      hashCode = hashCode * 8191 + ip.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ComPlexDO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPint()).compareTo(other.isSetPint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pint, other.pint);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPlong()).compareTo(other.isSetPlong());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlong()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.plong, other.plong);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPfloat()).compareTo(other.isSetPfloat());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPfloat()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pfloat, other.pfloat);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLongArray()).compareTo(other.isSetLongArray());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLongArray()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.longArray, other.longArray);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStringArray()).compareTo(other.isSetStringArray());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStringArray()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stringArray, other.stringArray);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetIp()).compareTo(other.isSetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ip, other.ip);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ComPlexDO(");
    boolean first = true;

    sb.append("pint:");
    sb.append(this.pint);
    first = false;
    if (!first) sb.append(", ");
    sb.append("plong:");
    sb.append(this.plong);
    first = false;
    if (!first) sb.append(", ");
    sb.append("pfloat:");
    sb.append(this.pfloat);
    first = false;
    if (!first) sb.append(", ");
    sb.append("longArray:");
    if (this.longArray == null) {
      sb.append("null");
    } else {
      sb.append(this.longArray);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stringArray:");
    if (this.stringArray == null) {
      sb.append("null");
    } else {
      sb.append(this.stringArray);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("ip:");
    if (this.ip == null) {
      sb.append("null");
    } else {
      sb.append(this.ip);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ComPlexDOStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ComPlexDOStandardScheme getScheme() {
      return new ComPlexDOStandardScheme();
    }
  }

  private static class ComPlexDOStandardScheme extends org.apache.thrift.scheme.StandardScheme<ComPlexDO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ComPlexDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PINT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.pint = iprot.readI32();
              struct.setPintIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PLONG
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.plong = iprot.readI64();
              struct.setPlongIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PFLOAT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.pfloat = iprot.readDouble();
              struct.setPfloatIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LONG_ARRAY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.longArray = new java.util.ArrayList<java.lang.Long>(_list0.size);
                long _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readI64();
                  struct.longArray.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setLongArrayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STRING_ARRAY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.stringArray = new java.util.ArrayList<java.lang.String>(_list3.size);
                java.lang.String _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readString();
                  struct.stringArray.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setStringArrayIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ip = iprot.readString();
              struct.setIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ComPlexDO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PINT_FIELD_DESC);
      oprot.writeI32(struct.pint);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PLONG_FIELD_DESC);
      oprot.writeI64(struct.plong);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PFLOAT_FIELD_DESC);
      oprot.writeDouble(struct.pfloat);
      oprot.writeFieldEnd();
      if (struct.longArray != null) {
        oprot.writeFieldBegin(LONG_ARRAY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, struct.longArray.size()));
          for (long _iter6 : struct.longArray)
          {
            oprot.writeI64(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.stringArray != null) {
        oprot.writeFieldBegin(STRING_ARRAY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.stringArray.size()));
          for (java.lang.String _iter7 : struct.stringArray)
          {
            oprot.writeString(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.ip != null) {
        oprot.writeFieldBegin(IP_FIELD_DESC);
        oprot.writeString(struct.ip);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ComPlexDOTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ComPlexDOTupleScheme getScheme() {
      return new ComPlexDOTupleScheme();
    }
  }

  private static class ComPlexDOTupleScheme extends org.apache.thrift.scheme.TupleScheme<ComPlexDO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ComPlexDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPint()) {
        optionals.set(0);
      }
      if (struct.isSetPlong()) {
        optionals.set(1);
      }
      if (struct.isSetPfloat()) {
        optionals.set(2);
      }
      if (struct.isSetLongArray()) {
        optionals.set(3);
      }
      if (struct.isSetStringArray()) {
        optionals.set(4);
      }
      if (struct.isSetIp()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetPint()) {
        oprot.writeI32(struct.pint);
      }
      if (struct.isSetPlong()) {
        oprot.writeI64(struct.plong);
      }
      if (struct.isSetPfloat()) {
        oprot.writeDouble(struct.pfloat);
      }
      if (struct.isSetLongArray()) {
        {
          oprot.writeI32(struct.longArray.size());
          for (long _iter8 : struct.longArray)
          {
            oprot.writeI64(_iter8);
          }
        }
      }
      if (struct.isSetStringArray()) {
        {
          oprot.writeI32(struct.stringArray.size());
          for (java.lang.String _iter9 : struct.stringArray)
          {
            oprot.writeString(_iter9);
          }
        }
      }
      if (struct.isSetIp()) {
        oprot.writeString(struct.ip);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ComPlexDO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.pint = iprot.readI32();
        struct.setPintIsSet(true);
      }
      if (incoming.get(1)) {
        struct.plong = iprot.readI64();
        struct.setPlongIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pfloat = iprot.readDouble();
        struct.setPfloatIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I64, iprot.readI32());
          struct.longArray = new java.util.ArrayList<java.lang.Long>(_list10.size);
          long _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readI64();
            struct.longArray.add(_elem11);
          }
        }
        struct.setLongArrayIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.stringArray = new java.util.ArrayList<java.lang.String>(_list13.size);
          java.lang.String _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readString();
            struct.stringArray.add(_elem14);
          }
        }
        struct.setStringArrayIsSet(true);
      }
      if (incoming.get(5)) {
        struct.ip = iprot.readString();
        struct.setIpIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

