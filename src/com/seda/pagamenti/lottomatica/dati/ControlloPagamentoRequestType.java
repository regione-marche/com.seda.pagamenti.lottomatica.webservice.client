/**
 * ControlloPagamentoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.dati;

public class ControlloPagamentoRequestType  implements java.io.Serializable {
    /* MATRICOLA IDENTIFICATIVA DEL TERMINALE LOTTOMATICA. */
    private java.lang.String idterminale;

    /* IDENTIFICATIVO TRANSAZIONE UNIVOCO PER IL TERMINALE CHE STA
     * EFFETTUANDO LA RICHIESTA. */
    private java.lang.String idtranslm;

    /* CODICE SOCIETA DI RISCOSSIONE: "503" - SORIS TORINO */
    private java.lang.String codagente;

    /* IDENTIFICATIVO BOLLETTINO */
    private java.lang.String idbollettino;

    /* NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO. */
    private java.lang.String contoaccredito;

    public ControlloPagamentoRequestType() {
    }

    public ControlloPagamentoRequestType(
           java.lang.String idterminale,
           java.lang.String idtranslm,
           java.lang.String codagente,
           java.lang.String idbollettino,
           java.lang.String contoaccredito) {
           this.idterminale = idterminale;
           this.idtranslm = idtranslm;
           this.codagente = codagente;
           this.idbollettino = idbollettino;
           this.contoaccredito = contoaccredito;
    }


    /**
     * Gets the idterminale value for this ControlloPagamentoRequestType.
     * 
     * @return idterminale   * MATRICOLA IDENTIFICATIVA DEL TERMINALE LOTTOMATICA.
     */
    public java.lang.String getIdterminale() {
        return idterminale;
    }


    /**
     * Sets the idterminale value for this ControlloPagamentoRequestType.
     * 
     * @param idterminale   * MATRICOLA IDENTIFICATIVA DEL TERMINALE LOTTOMATICA.
     */
    public void setIdterminale(java.lang.String idterminale) {
        this.idterminale = idterminale;
    }


    /**
     * Gets the idtranslm value for this ControlloPagamentoRequestType.
     * 
     * @return idtranslm   * IDENTIFICATIVO TRANSAZIONE UNIVOCO PER IL TERMINALE CHE STA
     * EFFETTUANDO LA RICHIESTA.
     */
    public java.lang.String getIdtranslm() {
        return idtranslm;
    }


    /**
     * Sets the idtranslm value for this ControlloPagamentoRequestType.
     * 
     * @param idtranslm   * IDENTIFICATIVO TRANSAZIONE UNIVOCO PER IL TERMINALE CHE STA
     * EFFETTUANDO LA RICHIESTA.
     */
    public void setIdtranslm(java.lang.String idtranslm) {
        this.idtranslm = idtranslm;
    }


    /**
     * Gets the codagente value for this ControlloPagamentoRequestType.
     * 
     * @return codagente   * CODICE SOCIETA DI RISCOSSIONE: "503" - SORIS TORINO
     */
    public java.lang.String getCodagente() {
        return codagente;
    }


    /**
     * Sets the codagente value for this ControlloPagamentoRequestType.
     * 
     * @param codagente   * CODICE SOCIETA DI RISCOSSIONE: "503" - SORIS TORINO
     */
    public void setCodagente(java.lang.String codagente) {
        this.codagente = codagente;
    }


    /**
     * Gets the idbollettino value for this ControlloPagamentoRequestType.
     * 
     * @return idbollettino   * IDENTIFICATIVO BOLLETTINO
     */
    public java.lang.String getIdbollettino() {
        return idbollettino;
    }


    /**
     * Sets the idbollettino value for this ControlloPagamentoRequestType.
     * 
     * @param idbollettino   * IDENTIFICATIVO BOLLETTINO
     */
    public void setIdbollettino(java.lang.String idbollettino) {
        this.idbollettino = idbollettino;
    }


    /**
     * Gets the contoaccredito value for this ControlloPagamentoRequestType.
     * 
     * @return contoaccredito   * NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO.
     */
    public java.lang.String getContoaccredito() {
        return contoaccredito;
    }


    /**
     * Sets the contoaccredito value for this ControlloPagamentoRequestType.
     * 
     * @param contoaccredito   * NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO.
     */
    public void setContoaccredito(java.lang.String contoaccredito) {
        this.contoaccredito = contoaccredito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlloPagamentoRequestType)) return false;
        ControlloPagamentoRequestType other = (ControlloPagamentoRequestType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idterminale==null && other.getIdterminale()==null) || 
             (this.idterminale!=null &&
              this.idterminale.equals(other.getIdterminale()))) &&
            ((this.idtranslm==null && other.getIdtranslm()==null) || 
             (this.idtranslm!=null &&
              this.idtranslm.equals(other.getIdtranslm()))) &&
            ((this.codagente==null && other.getCodagente()==null) || 
             (this.codagente!=null &&
              this.codagente.equals(other.getCodagente()))) &&
            ((this.idbollettino==null && other.getIdbollettino()==null) || 
             (this.idbollettino!=null &&
              this.idbollettino.equals(other.getIdbollettino()))) &&
            ((this.contoaccredito==null && other.getContoaccredito()==null) || 
             (this.contoaccredito!=null &&
              this.contoaccredito.equals(other.getContoaccredito())));
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
        if (getIdterminale() != null) {
            _hashCode += getIdterminale().hashCode();
        }
        if (getIdtranslm() != null) {
            _hashCode += getIdtranslm().hashCode();
        }
        if (getCodagente() != null) {
            _hashCode += getCodagente().hashCode();
        }
        if (getIdbollettino() != null) {
            _hashCode += getIdbollettino().hashCode();
        }
        if (getContoaccredito() != null) {
            _hashCode += getContoaccredito().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ControlloPagamentoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "ControlloPagamentoRequestType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idterminale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "idterminale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idtranslm");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "idtranslm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codagente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "codagente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idbollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "idbollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contoaccredito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "contoaccredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
