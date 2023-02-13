/**
 * NotificaPagamentoRequestType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.dati;

public class NotificaPagamentoRequestType  implements java.io.Serializable {
    /* MATRICOLA IDENTIFICATIVA DEL TERMINALE LOTTOMATICA. */
    private java.lang.String idterminale;

    /* IDENTIFICATIVO TRANSAZIONE CHIOSCO. */
    private java.lang.String idtranslm;

    /* CODICE SOCIETA DI RISCOSSIONE:"503" - SORIS TORINO */
    private java.lang.String codagente;

    /* FLAG OPERAZIONE: OFFLINE "0" - ONLINE "1" - RITENTATVIO DI
     * NOTIFICA "2" - */
    private java.lang.String flagoffline;

    /* IDENTIFICATIVO BOLLETTINO */
    private java.lang.String idbollettino;

    /* NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO. */
    private java.lang.String contoaccredito;

    /* IMPORTO PAGATO DAL CONTRIBUENTE ESCLUSO I COSTI DEL SERVIZIO
     * LOTTOMATICA */
    private long impbollettino;

    /* IMPORTO COSTI DEL SERVIZIO. */
    private long impcostiserv;

    /* DATA OPERAZIONE "AAAA-MM-GGThh:mm:ss" */
    private java.util.Calendar dtoperazione;

    /* ELEMENTI SPECIFICI DELLA RICEVUTA DI PAGAMENTO */
    private com.seda.pagamenti.lottomatica.dati.TbDatiRicevutaRequestType tbDatiRicevutaRequest;

    /* ELEMENTI SPECIFICI NEL CASO DI TIPOLOGIA VERBALI CDS */
    private com.seda.pagamenti.lottomatica.dati.TbVerbaliCdsRequestType tbVerbaliCdsRequest;

    public NotificaPagamentoRequestType() {
    }

    public NotificaPagamentoRequestType(
           java.lang.String idterminale,
           java.lang.String idtranslm,
           java.lang.String codagente,
           java.lang.String flagoffline,
           java.lang.String idbollettino,
           java.lang.String contoaccredito,
           long impbollettino,
           long impcostiserv,
           java.util.Calendar dtoperazione,
           com.seda.pagamenti.lottomatica.dati.TbDatiRicevutaRequestType tbDatiRicevutaRequest,
           com.seda.pagamenti.lottomatica.dati.TbVerbaliCdsRequestType tbVerbaliCdsRequest) {
           this.idterminale = idterminale;
           this.idtranslm = idtranslm;
           this.codagente = codagente;
           this.flagoffline = flagoffline;
           this.idbollettino = idbollettino;
           this.contoaccredito = contoaccredito;
           this.impbollettino = impbollettino;
           this.impcostiserv = impcostiserv;
           this.dtoperazione = dtoperazione;
           this.tbDatiRicevutaRequest = tbDatiRicevutaRequest;
           this.tbVerbaliCdsRequest = tbVerbaliCdsRequest;
    }


    /**
     * Gets the idterminale value for this NotificaPagamentoRequestType.
     * 
     * @return idterminale   * MATRICOLA IDENTIFICATIVA DEL TERMINALE LOTTOMATICA.
     */
    public java.lang.String getIdterminale() {
        return idterminale;
    }


    /**
     * Sets the idterminale value for this NotificaPagamentoRequestType.
     * 
     * @param idterminale   * MATRICOLA IDENTIFICATIVA DEL TERMINALE LOTTOMATICA.
     */
    public void setIdterminale(java.lang.String idterminale) {
        this.idterminale = idterminale;
    }


    /**
     * Gets the idtranslm value for this NotificaPagamentoRequestType.
     * 
     * @return idtranslm   * IDENTIFICATIVO TRANSAZIONE CHIOSCO.
     */
    public java.lang.String getIdtranslm() {
        return idtranslm;
    }


    /**
     * Sets the idtranslm value for this NotificaPagamentoRequestType.
     * 
     * @param idtranslm   * IDENTIFICATIVO TRANSAZIONE CHIOSCO.
     */
    public void setIdtranslm(java.lang.String idtranslm) {
        this.idtranslm = idtranslm;
    }


    /**
     * Gets the codagente value for this NotificaPagamentoRequestType.
     * 
     * @return codagente   * CODICE SOCIETA DI RISCOSSIONE:"503" - SORIS TORINO
     */
    public java.lang.String getCodagente() {
        return codagente;
    }


    /**
     * Sets the codagente value for this NotificaPagamentoRequestType.
     * 
     * @param codagente   * CODICE SOCIETA DI RISCOSSIONE:"503" - SORIS TORINO
     */
    public void setCodagente(java.lang.String codagente) {
        this.codagente = codagente;
    }


    /**
     * Gets the flagoffline value for this NotificaPagamentoRequestType.
     * 
     * @return flagoffline   * FLAG OPERAZIONE: OFFLINE "0" - ONLINE "1" - RITENTATVIO DI
     * NOTIFICA "2" -
     */
    public java.lang.String getFlagoffline() {
        return flagoffline;
    }


    /**
     * Sets the flagoffline value for this NotificaPagamentoRequestType.
     * 
     * @param flagoffline   * FLAG OPERAZIONE: OFFLINE "0" - ONLINE "1" - RITENTATVIO DI
     * NOTIFICA "2" -
     */
    public void setFlagoffline(java.lang.String flagoffline) {
        this.flagoffline = flagoffline;
    }


    /**
     * Gets the idbollettino value for this NotificaPagamentoRequestType.
     * 
     * @return idbollettino   * IDENTIFICATIVO BOLLETTINO
     */
    public java.lang.String getIdbollettino() {
        return idbollettino;
    }


    /**
     * Sets the idbollettino value for this NotificaPagamentoRequestType.
     * 
     * @param idbollettino   * IDENTIFICATIVO BOLLETTINO
     */
    public void setIdbollettino(java.lang.String idbollettino) {
        this.idbollettino = idbollettino;
    }


    /**
     * Gets the contoaccredito value for this NotificaPagamentoRequestType.
     * 
     * @return contoaccredito   * NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO.
     */
    public java.lang.String getContoaccredito() {
        return contoaccredito;
    }


    /**
     * Sets the contoaccredito value for this NotificaPagamentoRequestType.
     * 
     * @param contoaccredito   * NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO.
     */
    public void setContoaccredito(java.lang.String contoaccredito) {
        this.contoaccredito = contoaccredito;
    }


    /**
     * Gets the impbollettino value for this NotificaPagamentoRequestType.
     * 
     * @return impbollettino   * IMPORTO PAGATO DAL CONTRIBUENTE ESCLUSO I COSTI DEL SERVIZIO
     * LOTTOMATICA
     */
    public long getImpbollettino() {
        return impbollettino;
    }


    /**
     * Sets the impbollettino value for this NotificaPagamentoRequestType.
     * 
     * @param impbollettino   * IMPORTO PAGATO DAL CONTRIBUENTE ESCLUSO I COSTI DEL SERVIZIO
     * LOTTOMATICA
     */
    public void setImpbollettino(long impbollettino) {
        this.impbollettino = impbollettino;
    }


    /**
     * Gets the impcostiserv value for this NotificaPagamentoRequestType.
     * 
     * @return impcostiserv   * IMPORTO COSTI DEL SERVIZIO.
     */
    public long getImpcostiserv() {
        return impcostiserv;
    }


    /**
     * Sets the impcostiserv value for this NotificaPagamentoRequestType.
     * 
     * @param impcostiserv   * IMPORTO COSTI DEL SERVIZIO.
     */
    public void setImpcostiserv(long impcostiserv) {
        this.impcostiserv = impcostiserv;
    }


    /**
     * Gets the dtoperazione value for this NotificaPagamentoRequestType.
     * 
     * @return dtoperazione   * DATA OPERAZIONE "AAAA-MM-GGThh:mm:ss"
     */
    public java.util.Calendar getDtoperazione() {
        return dtoperazione;
    }


    /**
     * Sets the dtoperazione value for this NotificaPagamentoRequestType.
     * 
     * @param dtoperazione   * DATA OPERAZIONE "AAAA-MM-GGThh:mm:ss"
     */
    public void setDtoperazione(java.util.Calendar dtoperazione) {
        this.dtoperazione = dtoperazione;
    }


    /**
     * Gets the tbDatiRicevutaRequest value for this NotificaPagamentoRequestType.
     * 
     * @return tbDatiRicevutaRequest   * ELEMENTI SPECIFICI DELLA RICEVUTA DI PAGAMENTO
     */
    public com.seda.pagamenti.lottomatica.dati.TbDatiRicevutaRequestType getTbDatiRicevutaRequest() {
        return tbDatiRicevutaRequest;
    }


    /**
     * Sets the tbDatiRicevutaRequest value for this NotificaPagamentoRequestType.
     * 
     * @param tbDatiRicevutaRequest   * ELEMENTI SPECIFICI DELLA RICEVUTA DI PAGAMENTO
     */
    public void setTbDatiRicevutaRequest(com.seda.pagamenti.lottomatica.dati.TbDatiRicevutaRequestType tbDatiRicevutaRequest) {
        this.tbDatiRicevutaRequest = tbDatiRicevutaRequest;
    }


    /**
     * Gets the tbVerbaliCdsRequest value for this NotificaPagamentoRequestType.
     * 
     * @return tbVerbaliCdsRequest   * ELEMENTI SPECIFICI NEL CASO DI TIPOLOGIA VERBALI CDS
     */
    public com.seda.pagamenti.lottomatica.dati.TbVerbaliCdsRequestType getTbVerbaliCdsRequest() {
        return tbVerbaliCdsRequest;
    }


    /**
     * Sets the tbVerbaliCdsRequest value for this NotificaPagamentoRequestType.
     * 
     * @param tbVerbaliCdsRequest   * ELEMENTI SPECIFICI NEL CASO DI TIPOLOGIA VERBALI CDS
     */
    public void setTbVerbaliCdsRequest(com.seda.pagamenti.lottomatica.dati.TbVerbaliCdsRequestType tbVerbaliCdsRequest) {
        this.tbVerbaliCdsRequest = tbVerbaliCdsRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotificaPagamentoRequestType)) return false;
        NotificaPagamentoRequestType other = (NotificaPagamentoRequestType) obj;
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
            ((this.flagoffline==null && other.getFlagoffline()==null) || 
             (this.flagoffline!=null &&
              this.flagoffline.equals(other.getFlagoffline()))) &&
            ((this.idbollettino==null && other.getIdbollettino()==null) || 
             (this.idbollettino!=null &&
              this.idbollettino.equals(other.getIdbollettino()))) &&
            ((this.contoaccredito==null && other.getContoaccredito()==null) || 
             (this.contoaccredito!=null &&
              this.contoaccredito.equals(other.getContoaccredito()))) &&
            this.impbollettino == other.getImpbollettino() &&
            this.impcostiserv == other.getImpcostiserv() &&
            ((this.dtoperazione==null && other.getDtoperazione()==null) || 
             (this.dtoperazione!=null &&
              this.dtoperazione.equals(other.getDtoperazione()))) &&
            ((this.tbDatiRicevutaRequest==null && other.getTbDatiRicevutaRequest()==null) || 
             (this.tbDatiRicevutaRequest!=null &&
              this.tbDatiRicevutaRequest.equals(other.getTbDatiRicevutaRequest()))) &&
            ((this.tbVerbaliCdsRequest==null && other.getTbVerbaliCdsRequest()==null) || 
             (this.tbVerbaliCdsRequest!=null &&
              this.tbVerbaliCdsRequest.equals(other.getTbVerbaliCdsRequest())));
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
        if (getFlagoffline() != null) {
            _hashCode += getFlagoffline().hashCode();
        }
        if (getIdbollettino() != null) {
            _hashCode += getIdbollettino().hashCode();
        }
        if (getContoaccredito() != null) {
            _hashCode += getContoaccredito().hashCode();
        }
        _hashCode += new Long(getImpbollettino()).hashCode();
        _hashCode += new Long(getImpcostiserv()).hashCode();
        if (getDtoperazione() != null) {
            _hashCode += getDtoperazione().hashCode();
        }
        if (getTbDatiRicevutaRequest() != null) {
            _hashCode += getTbDatiRicevutaRequest().hashCode();
        }
        if (getTbVerbaliCdsRequest() != null) {
            _hashCode += getTbVerbaliCdsRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotificaPagamentoRequestType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "NotificaPagamentoRequestType"));
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
        elemField.setFieldName("flagoffline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "flagoffline"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impbollettino");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "impbollettino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("impcostiserv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "impcostiserv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtoperazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "dtoperazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tbDatiRicevutaRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "TbDatiRicevutaRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "TbDatiRicevutaRequestType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tbVerbaliCdsRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "TbVerbaliCdsRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "TbVerbaliCdsRequestType"));
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
