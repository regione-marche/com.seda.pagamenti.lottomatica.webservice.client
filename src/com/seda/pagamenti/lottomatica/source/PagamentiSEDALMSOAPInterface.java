/**
 * PagamentiSEDALMSOAPInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.source;

public interface PagamentiSEDALMSOAPInterface extends java.rmi.Remote {
    public com.seda.pagamenti.lottomatica.dati.ControlloPagamentoResponseType getControlloPagamento(com.seda.pagamenti.lottomatica.dati.ControlloPagamentoRequestType in1) throws java.rmi.RemoteException, com.seda.pagamenti.lottomatica.srv.FaultType;
    public com.seda.pagamenti.lottomatica.dati.NotificaPagamentoResponseType getNotificaPagamento(com.seda.pagamenti.lottomatica.dati.NotificaPagamentoRequestType in2) throws java.rmi.RemoteException, com.seda.pagamenti.lottomatica.srv.FaultType;
}
