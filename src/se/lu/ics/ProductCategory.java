/**
 * ProductCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics;

public class ProductCategory  implements java.io.Serializable {
    private int categoryID;

    private java.lang.String categoryName;

    public ProductCategory() {
    }

    public ProductCategory(
           int categoryID,
           java.lang.String categoryName) {
           this.categoryID = categoryID;
           this.categoryName = categoryName;
    }


    /**
     * Gets the categoryID value for this ProductCategory.
     * 
     * @return categoryID
     */
    public int getCategoryID() {
        return categoryID;
    }


    /**
     * Sets the categoryID value for this ProductCategory.
     * 
     * @param categoryID
     */
    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }


    /**
     * Gets the categoryName value for this ProductCategory.
     * 
     * @return categoryName
     */
    public java.lang.String getCategoryName() {
        return categoryName;
    }


    /**
     * Sets the categoryName value for this ProductCategory.
     * 
     * @param categoryName
     */
    public void setCategoryName(java.lang.String categoryName) {
        this.categoryName = categoryName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductCategory)) return false;
        ProductCategory other = (ProductCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.categoryID == other.getCategoryID() &&
            ((this.categoryName==null && other.getCategoryName()==null) || 
             (this.categoryName!=null &&
              this.categoryName.equals(other.getCategoryName())));
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
        _hashCode += getCategoryID();
        if (getCategoryName() != null) {
            _hashCode += getCategoryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ics.lu.se/", "ProductCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "CategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ics.lu.se/", "CategoryName"));
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
