/**
 * Store.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics;

public class Store  implements java.io.Serializable {
    private int supermarketID;

    private java.lang.String regionName;

    private java.lang.String storeName;

    private java.lang.String city;

    private java.lang.String storeAddress;

    public Store() {
    }

    public Store(
           int supermarketID,
           java.lang.String regionName,
           java.lang.String storeName,
           java.lang.String city,
           java.lang.String storeAddress) {
           this.supermarketID = supermarketID;
           this.regionName = regionName;
           this.storeName = storeName;
           this.city = city;
           this.storeAddress = storeAddress;
    }


    /**
     * Gets the supermarketID value for this Store.
     * 
     * @return supermarketID
     */
    public int getSupermarketID() {
        return supermarketID;
    }


    /**
     * Sets the supermarketID value for this Store.
     * 
     * @param supermarketID
     */
    public void setSupermarketID(int supermarketID) {
        this.supermarketID = supermarketID;
    }


    /**
     * Gets the regionName value for this Store.
     * 
     * @return regionName
     */
    public java.lang.String getRegionName() {
        return regionName;
    }


    /**
     * Sets the regionName value for this Store.
     * 
     * @param regionName
     */
    public void setRegionName(java.lang.String regionName) {
        this.regionName = regionName;
    }


    /**
     * Gets the storeName value for this Store.
     * 
     * @return storeName
     */
    public java.lang.String getStoreName() {
        return storeName;
    }


    /**
     * Sets the storeName value for this Store.
     * 
     * @param storeName
     */
    public void setStoreName(java.lang.String storeName) {
        this.storeName = storeName;
    }


    /**
     * Gets the city value for this Store.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Store.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the storeAddress value for this Store.
     * 
     * @return storeAddress
     */
    public java.lang.String getStoreAddress() {
        return storeAddress;
    }


    /**
     * Sets the storeAddress value for this Store.
     * 
     * @param storeAddress
     */
    public void setStoreAddress(java.lang.String storeAddress) {
        this.storeAddress = storeAddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Store)) return false;
        Store other = (Store) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.supermarketID == other.getSupermarketID() &&
            ((this.regionName==null && other.getRegionName()==null) || 
             (this.regionName!=null &&
              this.regionName.equals(other.getRegionName()))) &&
            ((this.storeName==null && other.getStoreName()==null) || 
             (this.storeName!=null &&
              this.storeName.equals(other.getStoreName()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.storeAddress==null && other.getStoreAddress()==null) || 
             (this.storeAddress!=null &&
              this.storeAddress.equals(other.getStoreAddress())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getSupermarketID();
        if (getRegionName() != null) {
            _hashCode += getRegionName().hashCode();
        }
        if (getStoreName() != null) {
            _hashCode += getStoreName().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getStoreAddress() != null) {
            _hashCode += getStoreAddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Store.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ics.lu.se/", "Store"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supermarketID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "SupermarketID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "RegionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "StoreName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "City"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "StoreAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
