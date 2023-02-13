/**
 * TbDatiRicevutaRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.dati;


/**
 * ELEMENTI SPECIFICI DELLA RICEVUTA DI PAGAMENTO
 */
public class TbDatiRicevutaRequestType  implements java.io.Serializable {
    /* IDENTIFICATIVO RICEVUTA DI PAGAMENTO */
    private java.lang.String idricevuta;

    /* DATA RICEVUTA DI PAGAMENTO NEL FORMATO "AAAA-MM-GGThh:mm:ss" */
    private java.util.Calendar dataricevuta;

    public TbDatiRicevutaRequestType() {
    }

    public TbDatiRicevutaRequestType(
           java.lang.String idricevuta,
           java.util.Calendar dataricevuta) {
           this.idricevuta = idricevuta;
           this.dataricevuta = dataricevuta;
    }


    /**
     * Gets the idricevuta value for this TbDatiRicevutaRequestType.
     * 
     * @return idricevuta   * IDENTIFICATIVO RICEVUTA DI PAGAMENTO
     */
    public java.lang.String getIdricevuta() {
        return idricevuta;
    }


    /**
     * Sets the idricevuta value for this TbDatiRicevutaRequestType.
     * 
     * @param idricevuta   * IDENTIFICATIVO RICEVUTA DI PAGAMENTO
     */
    public void setIdricevuta(java.lang.String idricevuta) {
        this.idricevuta = idricevuta;
    }


    /**
     * Gets the dataricevuta value for this TbDatiRicevutaRequestType.
     * 
     * @return dataricevuta   * DATA RICEVUTA DI PAGAMENTO NEL FORMATO "AAAA-MM-GGThh:mm:ss"
     */
    public java.util.Calendar getDataricevuta() {
        return dataricevuta;
    }


    /**
     * Sets the dataricevuta value for this TbDatiRicevutaRequestType.
     * 
     * @param dataricevuta   * DATA RICEVUTA DI PAGAMENTO NEL FORMATO "AAAA-MM-GGThh:mm:ss"
     */
    public void setDataricevuta(java.util.Calendar dataricevuta) {
        this.dataricevuta = dataricevuta;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TbDatiRicevutaRequestType)) return false;
        TbDatiRicevutaRequestType other = (TbDatiRicevutaRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idricevuta==null && other.getIdricevuta()==null) || 
             (this.idricevuta!=null &&
              this.idricevuta.equals(other.getIdricevuta()))) &&
            ((this.dataricevuta==null && other.getDataricevuta()==null) || 
             (this.dataricevuta!=null &&
              this.dataricevuta.equals(other.getDataricevuta())));
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
        if (getIdricevuta() != null) {
            _hashCode += getIdricevuta().hashCode();
        }
        if (getDataricevuta() != null) {
            _hashCode += getDataricevuta().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TbDatiRicevutaRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "TbDatiRicevutaRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idricevuta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "idricevuta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataricevuta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "dataricevuta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
