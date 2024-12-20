/**
 * PagamentiSEDALMLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.seda.pagamenti.lottomatica.source;

public class PagamentiSEDALMLocator extends org.apache.axis.client.Service implements com.seda.pagamenti.lottomatica.source.PagamentiSEDALM {

    public PagamentiSEDALMLocator() {
    }


    public PagamentiSEDALMLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PagamentiSEDALMLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PagamentiSEDALMSOAP
    private java.lang.String PagamentiSEDALMSOAP_address = "http://localhost:9080/PagamentiLottomatica/service";

    public java.lang.String getPagamentiSEDALMSOAPAddress() {
        return PagamentiSEDALMSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PagamentiSEDALMSOAPWSDDServiceName = "PagamentiSEDALMSOAP";

    public java.lang.String getPagamentiSEDALMSOAPWSDDServiceName() {
        return PagamentiSEDALMSOAPWSDDServiceName;
    }

    public void setPagamentiSEDALMSOAPWSDDServiceName(java.lang.String name) {
        PagamentiSEDALMSOAPWSDDServiceName = name;
    }

    public com.seda.pagamenti.lottomatica.source.PagamentiSEDALMSOAPInterface getPagamentiSEDALMSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PagamentiSEDALMSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPagamentiSEDALMSOAP(endpoint);
    }

    public com.seda.pagamenti.lottomatica.source.PagamentiSEDALMSOAPInterface getPagamentiSEDALMSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.seda.pagamenti.lottomatica.source.PagamentiSEDALMSOAPBindingStub _stub = new com.seda.pagamenti.lottomatica.source.PagamentiSEDALMSOAPBindingStub(portAddress, this);
            _stub.setPortName(getPagamentiSEDALMSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPagamentiSEDALMSOAPEndpointAddress(java.lang.String address) {
        PagamentiSEDALMSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.seda.pagamenti.lottomatica.source.PagamentiSEDALMSOAPInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.seda.pagamenti.lottomatica.source.PagamentiSEDALMSOAPBindingStub _stub = new com.seda.pagamenti.lottomatica.source.PagamentiSEDALMSOAPBindingStub(new java.net.URL(PagamentiSEDALMSOAP_address), this);
                _stub.setPortName(getPagamentiSEDALMSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("PagamentiSEDALMSOAP".equals(inputPortName)) {
            return getPagamentiSEDALMSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://source.lottomatica.pagamenti.seda.com", "PagamentiSEDALM");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://source.lottomatica.pagamenti.seda.com", "PagamentiSEDALMSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PagamentiSEDALMSOAP".equals(portName)) {
            setPagamentiSEDALMSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
