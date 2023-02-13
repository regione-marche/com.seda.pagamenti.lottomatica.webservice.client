/**
 * ControlloPagamentoResponseType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.dati;

public class ControlloPagamentoResponseType  implements java.io.Serializable {
    /* IDENTIFICATIVO TRANSAZIONE UNIVOCO PER IL TERMINALE CHE STA
     * EFFETTUANDO LA RICHIESTA. */
    private java.lang.String idtranslm;

    /* IDENTIFICATIVO TRANSAZIONE GESTIONALE. */
    private java.lang.String idtranspg;

    /* INDICA INSERIMENTO IMPORTO:"0"  NON ATTIVO - "1" ATTIVO */
    private java.lang.String flaginserimentoimporto;

    /* IDENTIFICATIVO BOLLETTINO */
    private java.lang.String idbollettino;

    /* NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO. */
    private java.lang.String contoaccredito;

    /* IMPORTO DEL BOLLETTINO ACQUISITO DAL SISTEMA ENTRATE */
    private long impbollettino;

    /* IDENTIFICATIVO DOCUMENTO */
    private java.lang.String numdocumento;

    /* INDICA SE I DATI SONO ATTUALIZZATI */
    private java.lang.String flagdatiattualizzati;

    /* DATA A CUI I DATI SONO ATTUALIZZATI "AAAA-MM-GGThh:mm:ss" */
    private java.util.Calendar dataattualizzazione;

    /* DATA ESITO OPERAZIONE "AAAA-MM-GGThh:mm:ss" */
    private java.util.Calendar dataesito;

    /* CODICE ESITO: "000" - TRANSAZIONE A BUON FINE "XXX" - DA DEFINIRE */
    private java.lang.String codesito;

    /* MESSAGGIO PER ESITO RICHIESTA DATI DA DEFINIRE */
    private java.lang.String msgesito;

    public ControlloPagamentoResponseType() {
    }

    public ControlloPagamentoResponseType(
           java.lang.String idtranslm,
           java.lang.String idtranspg,
           java.lang.String flaginserimentoimporto,
           java.lang.String idbollettino,
           java.lang.String contoaccredito,
           long impbollettino,
           java.lang.String numdocumento,
           java.lang.String flagdatiattualizzati,
           java.util.Calendar dataattualizzazione,
           java.util.Calendar dataesito,
           java.lang.String codesito,
           java.lang.String msgesito) {
           this.idtranslm = idtranslm;
           this.idtranspg = idtranspg;
           this.flaginserimentoimporto = flaginserimentoimporto;
           this.idbollettino = idbollettino;
           this.contoaccredito = contoaccredito;
           this.impbollettino = impbollettino;
           this.numdocumento = numdocumento;
           this.flagdatiattualizzati = flagdatiattualizzati;
           this.dataattualizzazione = dataattualizzazione;
           this.dataesito = dataesito;
           this.codesito = codesito;
           this.msgesito = msgesito;
    }


    /**
     * Gets the idtranslm value for this ControlloPagamentoResponseType.
     * 
     * @return idtranslm   * IDENTIFICATIVO TRANSAZIONE UNIVOCO PER IL TERMINALE CHE STA
     * EFFETTUANDO LA RICHIESTA.
     */
    public java.lang.String getIdtranslm() {
        return idtranslm;
    }


    /**
     * Sets the idtranslm value for this ControlloPagamentoResponseType.
     * 
     * @param idtranslm   * IDENTIFICATIVO TRANSAZIONE UNIVOCO PER IL TERMINALE CHE STA
     * EFFETTUANDO LA RICHIESTA.
     */
    public void setIdtranslm(java.lang.String idtranslm) {
        this.idtranslm = idtranslm;
    }


    /**
     * Gets the idtranspg value for this ControlloPagamentoResponseType.
     * 
     * @return idtranspg   * IDENTIFICATIVO TRANSAZIONE GESTIONALE.
     */
    public java.lang.String getIdtranspg() {
        return idtranspg;
    }


    /**
     * Sets the idtranspg value for this ControlloPagamentoResponseType.
     * 
     * @param idtranspg   * IDENTIFICATIVO TRANSAZIONE GESTIONALE.
     */
    public void setIdtranspg(java.lang.String idtranspg) {
        this.idtranspg = idtranspg;
    }


    /**
     * Gets the flaginserimentoimporto value for this ControlloPagamentoResponseType.
     * 
     * @return flaginserimentoimporto   * INDICA INSERIMENTO IMPORTO:"0"  NON ATTIVO - "1" ATTIVO
     */
    public java.lang.String getFlaginserimentoimporto() {
        return flaginserimentoimporto;
    }


    /**
     * Sets the flaginserimentoimporto value for this ControlloPagamentoResponseType.
     * 
     * @param flaginserimentoimporto   * INDICA INSERIMENTO IMPORTO:"0"  NON ATTIVO - "1" ATTIVO
     */
    public void setFlaginserimentoimporto(java.lang.String flaginserimentoimporto) {
        this.flaginserimentoimporto = flaginserimentoimporto;
    }


    /**
     * Gets the idbollettino value for this ControlloPagamentoResponseType.
     * 
     * @return idbollettino   * IDENTIFICATIVO BOLLETTINO
     */
    public java.lang.String getIdbollettino() {
        return idbollettino;
    }


    /**
     * Sets the idbollettino value for this ControlloPagamentoResponseType.
     * 
     * @param idbollettino   * IDENTIFICATIVO BOLLETTINO
     */
    public void setIdbollettino(java.lang.String idbollettino) {
        this.idbollettino = idbollettino;
    }


    /**
     * Gets the contoaccredito value for this ControlloPagamentoResponseType.
     * 
     * @return contoaccredito   * NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO.
     */
    public java.lang.String getContoaccredito() {
        return contoaccredito;
    }


    /**
     * Sets the contoaccredito value for this ControlloPagamentoResponseType.
     * 
     * @param contoaccredito   * NUMERO DI CONTO CORRENTE DI ACCREDITO DEL PAGAMENTO.
     */
    public void setContoaccredito(java.lang.String contoaccredito) {
        this.contoaccredito = contoaccredito;
    }


    /**
     * Gets the impbollettino value for this ControlloPagamentoResponseType.
     * 
     * @return impbollettino   * IMPORTO DEL BOLLETTINO ACQUISITO DAL SISTEMA ENTRATE
     */
    public long getImpbollettino() {
        return impbollettino;
    }


    /**
     * Sets the impbollettino value for this ControlloPagamentoResponseType.
     * 
     * @param impbollettino   * IMPORTO DEL BOLLETTINO ACQUISITO DAL SISTEMA ENTRATE
     */
    public void setImpbollettino(long impbollettino) {
        this.impbollettino = impbollettino;
    }


    /**
     * Gets the numdocumento value for this ControlloPagamentoResponseType.
     * 
     * @return numdocumento   * IDENTIFICATIVO DOCUMENTO
     */
    public java.lang.String getNumdocumento() {
        return numdocumento;
    }


    /**
     * Sets the numdocumento value for this ControlloPagamentoResponseType.
     * 
     * @param numdocumento   * IDENTIFICATIVO DOCUMENTO
     */
    public void setNumdocumento(java.lang.String numdocumento) {
        this.numdocumento = numdocumento;
    }


    /**
     * Gets the flagdatiattualizzati value for this ControlloPagamentoResponseType.
     * 
     * @return flagdatiattualizzati   * INDICA SE I DATI SONO ATTUALIZZATI
     */
    public java.lang.String getFlagdatiattualizzati() {
        return flagdatiattualizzati;
    }


    /**
     * Sets the flagdatiattualizzati value for this ControlloPagamentoResponseType.
     * 
     * @param flagdatiattualizzati   * INDICA SE I DATI SONO ATTUALIZZATI
     */
    public void setFlagdatiattualizzati(java.lang.String flagdatiattualizzati) {
        this.flagdatiattualizzati = flagdatiattualizzati;
    }


    /**
     * Gets the dataattualizzazione value for this ControlloPagamentoResponseType.
     * 
     * @return dataattualizzazione   * DATA A CUI I DATI SONO ATTUALIZZATI "AAAA-MM-GGThh:mm:ss"
     */
    public java.util.Calendar getDataattualizzazione() {
        return dataattualizzazione;
    }


    /**
     * Sets the dataattualizzazione value for this ControlloPagamentoResponseType.
     * 
     * @param dataattualizzazione   * DATA A CUI I DATI SONO ATTUALIZZATI "AAAA-MM-GGThh:mm:ss"
     */
    public void setDataattualizzazione(java.util.Calendar dataattualizzazione) {
        this.dataattualizzazione = dataattualizzazione;
    }


    /**
     * Gets the dataesito value for this ControlloPagamentoResponseType.
     * 
     * @return dataesito   * DATA ESITO OPERAZIONE "AAAA-MM-GGThh:mm:ss"
     */
    public java.util.Calendar getDataesito() {
        return dataesito;
    }


    /**
     * Sets the dataesito value for this ControlloPagamentoResponseType.
     * 
     * @param dataesito   * DATA ESITO OPERAZIONE "AAAA-MM-GGThh:mm:ss"
     */
    public void setDataesito(java.util.Calendar dataesito) {
        this.dataesito = dataesito;
    }


    /**
     * Gets the codesito value for this ControlloPagamentoResponseType.
     * 
     * @return codesito   * CODICE ESITO: "000" - TRANSAZIONE A BUON FINE "XXX" - DA DEFINIRE
     */
    public java.lang.String getCodesito() {
        return codesito;
    }


    /**
     * Sets the codesito value for this ControlloPagamentoResponseType.
     * 
     * @param codesito   * CODICE ESITO: "000" - TRANSAZIONE A BUON FINE "XXX" - DA DEFINIRE
     */
    public void setCodesito(java.lang.String codesito) {
        this.codesito = codesito;
    }


    /**
     * Gets the msgesito value for this ControlloPagamentoResponseType.
     * 
     * @return msgesito   * MESSAGGIO PER ESITO RICHIESTA DATI DA DEFINIRE
     */
    public java.lang.String getMsgesito() {
        return msgesito;
    }


    /**
     * Sets the msgesito value for this ControlloPagamentoResponseType.
     * 
     * @param msgesito   * MESSAGGIO PER ESITO RICHIESTA DATI DA DEFINIRE
     */
    public void setMsgesito(java.lang.String msgesito) {
        this.msgesito = msgesito;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ControlloPagamentoResponseType)) return false;
        ControlloPagamentoResponseType other = (ControlloPagamentoResponseType) obj;
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
            ((this.flaginserimentoimporto==null && other.getFlaginserimentoimporto()==null) || 
             (this.flaginserimentoimporto!=null &&
              this.flaginserimentoimporto.equals(other.getFlaginserimentoimporto()))) &&
            ((this.idbollettino==null && other.getIdbollettino()==null) || 
             (this.idbollettino!=null &&
              this.idbollettino.equals(other.getIdbollettino()))) &&
            ((this.contoaccredito==null && other.getContoaccredito()==null) || 
             (this.contoaccredito!=null &&
              this.contoaccredito.equals(other.getContoaccredito()))) &&
            this.impbollettino == other.getImpbollettino() &&
            ((this.numdocumento==null && other.getNumdocumento()==null) || 
             (this.numdocumento!=null &&
              this.numdocumento.equals(other.getNumdocumento()))) &&
            ((this.flagdatiattualizzati==null && other.getFlagdatiattualizzati()==null) || 
             (this.flagdatiattualizzati!=null &&
              this.flagdatiattualizzati.equals(other.getFlagdatiattualizzati()))) &&
            ((this.dataattualizzazione==null && other.getDataattualizzazione()==null) || 
             (this.dataattualizzazione!=null &&
              this.dataattualizzazione.equals(other.getDataattualizzazione()))) &&
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
        if (getFlaginserimentoimporto() != null) {
            _hashCode += getFlaginserimentoimporto().hashCode();
        }
        if (getIdbollettino() != null) {
            _hashCode += getIdbollettino().hashCode();
        }
        if (getContoaccredito() != null) {
            _hashCode += getContoaccredito().hashCode();
        }
        _hashCode += new Long(getImpbollettino()).hashCode();
        if (getNumdocumento() != null) {
            _hashCode += getNumdocumento().hashCode();
        }
        if (getFlagdatiattualizzati() != null) {
            _hashCode += getFlagdatiattualizzati().hashCode();
        }
        if (getDataattualizzazione() != null) {
            _hashCode += getDataattualizzazione().hashCode();
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
        new org.apache.axis.description.TypeDesc(ControlloPagamentoResponseType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "ControlloPagamentoResponseType"));
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
        elemField.setFieldName("flaginserimentoimporto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "flaginserimentoimporto"));
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
        elemField.setFieldName("numdocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "numdocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flagdatiattualizzati");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "flagdatiattualizzati"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataattualizzazione");
        elemField.setXmlName(new javax.xml.namespace.QName("http://dati.lottomatica.pagamenti.seda.com", "dataattualizzazione"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
