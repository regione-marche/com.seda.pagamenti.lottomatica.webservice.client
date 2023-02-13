/**
 * NotificaPagamentoResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.dati;

public class NotificaPagamentoResponseType  implements java.io.Serializable {
    /* IDENTIFICATIVO TRANSAZIONE LOTTOMATICA. */
    private java.lang.String idtranslm;

    /* IDENTIFICATIVO TRANSAZIONE GESTIONALE. */
    private java.lang.String idtranspg;

    /* DATA ESITO OPERAZIONE "AAAA-MM-GGThh:mm:ss" */
    private java.util.Calendar dataesito;

    /* CODICE ESITO:"000" - NOTIFICA A BUON FINE "XXX" - DA DEFINIRE */
    private java.lang.String codesito;

    /* MESSAGGIO PER ESITO NOTIFICA (DA DEFINIRE) */
    private java.lang.String msgesito;

    public NotificaPagamentoResponseType() {
    }

    public NotificaPagamentoResponseType(
           java.lang.String idtranslm,
           java.lang.String idtranspg,
           java.util.Calendar dataesito,
           java.lang.String codesito,
           java.lang.String msgesito) {
           this.idtranslm = idtranslm;
           this.idtranspg = idtranspg;
           this.dataesito = dataesito;
           this.codesito = codesito;
           this.msgesito = msgesito;
    }


    /**
     * Gets the idtranslm value for this NotificaPagamentoResponseType.
     * 
     * @return idtranslm   * IDENTIFICATIVO TRANSAZIONE LOTTOMATICA.
     */
    public java.lang.String getIdtranslm() {
        return idtranslm;
    }


    /**
     * Sets the idtranslm value for this NotificaPagamentoResponseType.
     * 
     * @param idtranslm   * IDENTIFICATIVO TRANSAZIONE LOTTOMATICA.
     */
    public void setIdtranslm(java.lang.String idtranslm) {
        this.idtranslm = idtranslm;
    }


    /**
     * Gets the idtranspg value for this NotificaPagamentoResponseType.
     * 
     * @return idtranspg   * IDENTIFICATIVO TRANSAZIONE GESTIONALE.
     */
    public java.lang.String getIdtranspg() {
        return idtranspg;
    }


    /**
     * Sets the idtranspg value for this NotificaPagamentoResponseType.
     * 
     * @param idtranspg   * IDENTIFICATIVO TRANSAZIONE GESTIONALE.
     */
    public void setIdtranspg(java.lang.String idtranspg) {
        this.idtranspg = idtranspg;
    }


    /**
     * Gets the dataesito value for this NotificaPagamentoResponseType.
     * 
     * @return dataesito   * DATA ESITO OPERAZIONE "AAAA-MM-GGThh:mm:ss"
     */
    public java.util.Calendar getDataesito() {
        return dataesito;
    }


    /**
     * Sets the dataesito value for this NotificaPagamentoResponseType.
     * 
     * @param dataesito   * DATA ESITO OPERAZIONE "AAAA-MM-GGThh:mm:ss"
     */
    public void setDataesito(java.util.Calendar dataesito) {
        this.dataesito = dataesito;
    }


    /**
     * Gets the codesito value for this NotificaPagamentoResponseType.
     * 
     * @return codesito   * CODICE ESITO:"000" - NOTIFICA A BUON FINE "XXX" - DA DEFINIRE
     */
    public java.lang.String getCodesito() {
        return codesito;
    }


    /**
     * Sets the codesito value for this NotificaPagamentoResponseType.
     * 
     * @param codesito   * CODICE ESITO:"000" - NOTIFICA A BUON FINE "XXX" - DA DEFINIRE
     */
    public void setCodesito(java.lang.String codesito) {
        this.codesito = codesito;
    }


    /**
     * Gets the msgesito value for this NotificaPagamentoResponseType.
     * 
     * @return msgesito   * MESSAGGIO PER ESITO NOTIFICA (DA DEFINIRE)
     */
    public java.lang.String getMsgesito() {
        return msgesito;
    }


    /**
     * Sets the msgesito value for this NotificaPagamentoResponseType.
     * 
     * @param msgesito   * MESSAGGIO PER ESITO NOTIFICA (DA DEFINIRE)
     */
    public void setMsgesito(java.lang.String msgesito) {
        this.msgesito = msgesito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaPagamentoResponseType)) return false;
        NotificaPagamentoResponseType other = (NotificaPagamentoResponseType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idtranslm==null && other.getIdtranslm()==null) || 
             (this.idtranslm!=null &&
              this.idtranslm.equals(other.getIdtranslm()))) &&
            ((this.idtranspg==null && other.getIdtranspg()==null) || 
             (this.idtranspg!=null &&
              this.idtranspg.equals(other.getIdtranspg()))) &&
            ((this.dataesito==null && other.getDataesito()==null) || 
             (this.dataesito!=null &&
              this.dataesito.equals(other.getDataesito()))) &&
            ((this.codesito==null && other.getCodesito()==null) || 
             (this.codesito!=null &&
              this.codesito.equals(other.getCodesito()))) &&
            ((this.msgesito==null && other.getMsgesito()==null) || 
             (this.msgesito!=null &&
              this.msgesito.equals(other.getMsgesito())));
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
        if (getIdtranslm() != null) {
            _hashCode += getIdtranslm().hashCode();
        }
        if (getIdtranspg() != null) {
            _hashCode += getIdtranspg().hashCode();
        }
        if (getDataesito() != null) {
            _hashCode += getDataesito().hashCode();
        }
        if (getCodesito() != null) {
            _hashCode += getCodesito().hashCode();
        }
        if (getMsgesito() != null) {
            _hashCode += getMsgesito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaPagamentoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "NotificaPagamentoResponseType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idtranslm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "idtranslm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idtranspg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "idtranspg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataesito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "dataesito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codesito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "codesito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgesito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "msgesito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
