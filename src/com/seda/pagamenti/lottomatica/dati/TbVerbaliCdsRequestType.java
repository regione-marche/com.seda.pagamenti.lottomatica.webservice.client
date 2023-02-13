/**
 * TbVerbaliCdsRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.dati;


/**
 * ELEMENTI SPECIFICI NEL CASO DI TIPOLOGIA VERBALI CDS
 */
public class TbVerbaliCdsRequestType  implements java.io.Serializable {
    /* DENOMINAZIONE DEL SOGGETTO PAGANTE */
    private java.lang.String intestatario;

    /* TARGA VEICOLO */
    private java.lang.String targa;

    /* DATA VERBALE NEL FORMATO "AAAA-MM-GG" */
    private java.util.Date dataverbale;

    public TbVerbaliCdsRequestType() {
    }

    public TbVerbaliCdsRequestType(
           java.lang.String intestatario,
           java.lang.String targa,
           java.util.Date dataverbale) {
           this.intestatario = intestatario;
           this.targa = targa;
           this.dataverbale = dataverbale;
    }


    /**
     * Gets the intestatario value for this TbVerbaliCdsRequestType.
     * 
     * @return intestatario   * DENOMINAZIONE DEL SOGGETTO PAGANTE
     */
    public java.lang.String getIntestatario() {
        return intestatario;
    }


    /**
     * Sets the intestatario value for this TbVerbaliCdsRequestType.
     * 
     * @param intestatario   * DENOMINAZIONE DEL SOGGETTO PAGANTE
     */
    public void setIntestatario(java.lang.String intestatario) {
        this.intestatario = intestatario;
    }


    /**
     * Gets the targa value for this TbVerbaliCdsRequestType.
     * 
     * @return targa   * TARGA VEICOLO
     */
    public java.lang.String getTarga() {
        return targa;
    }


    /**
     * Sets the targa value for this TbVerbaliCdsRequestType.
     * 
     * @param targa   * TARGA VEICOLO
     */
    public void setTarga(java.lang.String targa) {
        this.targa = targa;
    }


    /**
     * Gets the dataverbale value for this TbVerbaliCdsRequestType.
     * 
     * @return dataverbale   * DATA VERBALE NEL FORMATO "AAAA-MM-GG"
     */
    public java.util.Date getDataverbale() {
        return dataverbale;
    }


    /**
     * Sets the dataverbale value for this TbVerbaliCdsRequestType.
     * 
     * @param dataverbale   * DATA VERBALE NEL FORMATO "AAAA-MM-GG"
     */
    public void setDataverbale(java.util.Date dataverbale) {
        this.dataverbale = dataverbale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TbVerbaliCdsRequestType)) return false;
        TbVerbaliCdsRequestType other = (TbVerbaliCdsRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intestatario==null && other.getIntestatario()==null) || 
             (this.intestatario!=null &&
              this.intestatario.equals(other.getIntestatario()))) &&
            ((this.targa==null && other.getTarga()==null) || 
             (this.targa!=null &&
              this.targa.equals(other.getTarga()))) &&
            ((this.dataverbale==null && other.getDataverbale()==null) || 
             (this.dataverbale!=null &&
              this.dataverbale.equals(other.getDataverbale())));
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
        if (getIntestatario() != null) {
            _hashCode += getIntestatario().hashCode();
        }
        if (getTarga() != null) {
            _hashCode += getTarga().hashCode();
        }
        if (getDataverbale() != null) {
            _hashCode += getDataverbale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TbVerbaliCdsRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "TbVerbaliCdsRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intestatario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "intestatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "targa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataverbale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "dataverbale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
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
