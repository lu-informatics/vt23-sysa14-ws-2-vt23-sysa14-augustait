/**
 * Orderline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics;

public class Orderline  implements java.io.Serializable {
    private int orderID;

    private int productID;

    private int orderlineNumber;

    private int quantity;

    public Orderline() {
    }

    public Orderline(
           int orderID,
           int productID,
           int orderlineNumber,
           int quantity) {
           this.orderID = orderID;
           this.productID = productID;
           this.orderlineNumber = orderlineNumber;
           this.quantity = quantity;
    }


    /**
     * Gets the orderID value for this Orderline.
     * 
     * @return orderID
     */
    public int getOrderID() {
        return orderID;
    }


    /**
     * Sets the orderID value for this Orderline.
     * 
     * @param orderID
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }


    /**
     * Gets the productID value for this Orderline.
     * 
     * @return productID
     */
    public int getProductID() {
        return productID;
    }


    /**
     * Sets the productID value for this Orderline.
     * 
     * @param productID
     */
    public void setProductID(int productID) {
        this.productID = productID;
    }


    /**
     * Gets the orderlineNumber value for this Orderline.
     * 
     * @return orderlineNumber
     */
    public int getOrderlineNumber() {
        return orderlineNumber;
    }


    /**
     * Sets the orderlineNumber value for this Orderline.
     * 
     * @param orderlineNumber
     */
    public void setOrderlineNumber(int orderlineNumber) {
        this.orderlineNumber = orderlineNumber;
    }


    /**
     * Gets the quantity value for this Orderline.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Orderline.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Orderline)) return false;
        Orderline other = (Orderline) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.orderID == other.getOrderID() &&
            this.productID == other.getProductID() &&
            this.orderlineNumber == other.getOrderlineNumber() &&
            this.quantity == other.getQuantity();
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
        _hashCode += getOrderID();
        _hashCode += getProductID();
        _hashCode += getOrderlineNumber();
        _hashCode += getQuantity();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Orderline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ics.lu.se/", "Orderline"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "OrderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "ProductID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderlineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "OrderlineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
