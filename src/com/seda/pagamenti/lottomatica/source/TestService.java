package com.seda.pagamenti.lottomatica.source;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import com.seda.pagamenti.lottomatica.dati.ControlloPagamentoRequestType;
import com.seda.pagamenti.lottomatica.dati.ControlloPagamentoResponseType;
import com.seda.pagamenti.lottomatica.dati.NotificaPagamentoRequestType;
import com.seda.pagamenti.lottomatica.dati.NotificaPagamentoResponseType;
import com.seda.pagamenti.lottomatica.dati.TbDatiRicevutaRequestType;
import com.seda.pagamenti.lottomatica.dati.TbVerbaliCdsRequestType;

public class TestService {

	public static void main(String[] args) {
		String messaggio = "";
		try {
			
			  PagamentiSEDALMLocator binding = new PagamentiSEDALMLocator();
			  			  
			  PagamentiSEDALMSOAPInterface pagamentiLottomaticaInterface= binding.getPagamentiSEDALMSOAP(new
			  URL("http://localhost:10585/PagamentiLottomatica/service"));
			 
			  ControlloPagamentoRequestType in1 = new ControlloPagamentoRequestType();
			  in1.setIdterminale("SEDA01");
			  in1.setIdtranslm("LM201306060006");
			  in1.setCodagente("503");
			  in1.setIdbollettino("000001002587738829");
			  in1.setContoaccredito("12345");
			  
			  ControlloPagamentoResponseType out1 = null;
			  out1 = pagamentiLottomaticaInterface.getControlloPagamento(in1);
			  System.out.println(out1.getIdtranslm());
			  System.out.println(out1.getFlaginserimentoimporto());
			  System.out.println(out1.getIdbollettino());
			  System.out.println(out1.getContoaccredito());
			  System.out.println(out1.getImpbollettino());
			  System.out.println(out1.getNumdocumento());
			  System.out.println(out1.getFlagdatiattualizzati());
			  System.out.println(out1.getDataattualizzazione());
			  System.out.println(out1.getDataesito());
			  System.out.println(out1.getCodesito());
			  System.out.println(out1.getMsgesito());
			  			  
			  /*
			  NotificaPagamentoRequestType in2 = new NotificaPagamentoRequestType();
			  in2.setIdterminale("SEDA");
			  in2.setIdtranslm("LM2012062111");
			  in2.setCodagente("503");
			  in2.setFlagoffline("1");
			  in2.setIdbollettino("010001007975454471");
			  in2.setContoaccredito("12345");
			  in2.setImpbollettino(Long.parseLong("564"));
			  in2.setImpcostiserv(Long.parseLong("155"));
			  
			  GregorianCalendar gcalCurrenDate = new GregorianCalendar();		
	          Calendar dtoperazione = Calendar.getInstance();
	          dtoperazione.set(Calendar.YEAR, gcalCurrenDate.get(Calendar.YEAR));
	          dtoperazione.set(Calendar.MONTH, gcalCurrenDate.get(Calendar.MONTH));
	          dtoperazione.set(Calendar.DATE, gcalCurrenDate.get(Calendar.DATE));
	          dtoperazione.set(Calendar.HOUR_OF_DAY, gcalCurrenDate.get(Calendar.HOUR_OF_DAY));
	          dtoperazione.set(Calendar.MINUTE, gcalCurrenDate.get(Calendar.MINUTE));
	          dtoperazione.set(Calendar.SECOND, gcalCurrenDate.get(Calendar.SECOND));
	          dtoperazione.set(Calendar.MILLISECOND, gcalCurrenDate.get(Calendar.MILLISECOND));
			  in2.setDtoperazione(dtoperazione);
			  			  
			  TbDatiRicevutaRequestType tbDatiRicevutaRequestType = null;
			  in2.setTbDatiRicevutaRequest(tbDatiRicevutaRequestType);
			  TbVerbaliCdsRequestType	tbVerbaliCdsRequestType = null;
			  in2.setTbVerbaliCdsRequest(tbVerbaliCdsRequestType);
			  
			  NotificaPagamentoResponseType out2 = null;
			  out2 = pagamentiLottomaticaInterface.getNotificaPagamento(in2);
			  System.out.println(out2.getIdtranslm());
			  System.out.println(out2.getIdtranspg());
			  System.out.println(out2.getDataesito());
			  System.out.println(out2.getCodesito());
			  System.out.println(out2.getMsgesito());
			  */			  
		} catch (MalformedURLException ex) { 
			ex.printStackTrace();
			messaggio = "errore: l'url non è esatta";
		} catch (ServiceException ex) {
			ex.printStackTrace();
			messaggio = "errore: la creazione della chiamata è fallita";
		} catch (RemoteException ex) {
			ex.printStackTrace();
			messaggio = "errore: l'invocazione del WS è fallita";
		} finally {
			System.out.println(messaggio);
		}
	}
}
