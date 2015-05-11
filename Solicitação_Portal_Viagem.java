package Scripts;
import resources.Scripts.Solicitação_Portal_ViagemHelper;
import sun.org.mozilla.javascript.internal.regexp.SubString;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author f730207
 */



public class Solicitação_Portal_Viagem extends Solicitação_Portal_ViagemHelper
{
	/**
	 * Script Name   : <b>Viagem</b>
	 * Generated     : <b>28/04/2015 08:48:40</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.2  Build 9200 ()
	 * 
	 * @since  2015/04/28
	 * @author f730207
	 * 
	 */
	
	
	public void testMain(Object[] args) 	{	
		
		
	// Cadastrando Informações
		
		
			// Alterando Data Inicial da Viagem 
		
			text_wD60().click(atPoint(32,14));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("DT_INICIAL"));
			
			// Alterando Horario Inicial da Viagem
			
			text_horaDeInício().click(atPoint(39,8));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys("^a");
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("HR_INICIAL"));
		
			// Alterando Data Final da Viagem
			text_wD6A().click(atPoint(41,13));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("DT_FIM"));
		
			// Alterando Horário Final da Viagem
			
			text_horaDeFim().click(atPoint(52,6));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys("^a");
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("HR_FIM"));
			
			// Local da Viagem ( Padrão Brasil) - ESTADO  - ( EX: Rio de Janeiro)
			
			text_wD0162().click(atPoint(68,10));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputChars(dpString("LC_VIAGEM"));
			
			// Tipo de Viagem ( Nacional )
			
			table_wD75().click(atCell(atRow(atIndex(1)), atColumn(atIndex(0))));
			table_wD017B().click(atCell(atRow(atIndex(2)), atColumn(atIndex(1))));
			text_wD0186().click(atPoint(37,3));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys("{ExtDown}{ExtDown}");
		
			//  Atividade de Viagem ( Treinamento )			
		
			sleep(2);
			
			table_wD017B().click(atCell(atRow(atIndex(2)), atColumn(atIndex(1))));
			table_wD017B().click(atCell(atRow(atIndex(3)), atColumn(atIndex(1))));
			text_wD018F().click(atPoint(36,4));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys("{ExtDown}{ExtDown}{ENTER}");
			
			sleep(2);
					
			// Motivo de Viagem ( Campo Livre )				
		
			table_wD017B().click(atCell(atRow(atIndex(3)), atColumn(atIndex(1))));
			table_wD017B().click(atCell(atRow(atIndex(4)), atColumn(atIndex(1))));
			text_wD0199().click(atPoint(275,12));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("MTV_VIAGEM"));
				
			sleep(2);			
			
			
			
	// Cadastrando Informação de Centro de Custo (Document: Solicitação de viagem: http://mo7366ux0026.intra.caixa.gov.br:8000/sap/bc/webdynpro/sap/fite_request?SAP_FITV_ACTION=&SAP_FITV_EXIT_OP=CallAssistantPOWL&SAP_FITV_PERSNO=00000010&SAP_FITV_TRIPCMP=R&SAP_FTIV_LAST_PERNR=00000010&sap-client=110&sap-language=PT#)	
		    
			link_paraAAtribuiçãoDeCustos().click();		
			link_paraAAtribuiçãoDeCustos().click();	
			
			sleep(2);
		
			// Inserindo dados de Centro de Custo
			
			// Centro de Custo
			
			table_wD15CF().click(atCell(atRow(atIndex(0)), atColumn(atIndex(2))));
			text_wD15D5().click(atPoint(68,4));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys("^a");
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("CT_CUSTO"));
			
			sleep(2);
			
			// Centro Financeiro
			
			html_wD1628().click(atPoint(19,6));
			text_wD1625().click(atPoint(61,4));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys("^a");
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("CT_FINANC"));
			
			sleep(2);
		
			// Nmro Fundos
			
			html_wD162A().click(atPoint(241,11));
			text_wD1634().click(atPoint(92,14));
			browser_htmlBrowser(document_solicitaçãoDeViagem(),DEFAULT_FLAGS).inputKeys(dpString("FUNDOS"));	
			
			sleep(2);
			
				
			table_wD15CF().click(atCell(atRow(atIndex(6)), atColumn(atIndex(3))));
			link_wD163B().click();			
			
			sleep(5);
			
			link_avançarParaDadosGerais().click();
						
			sleep(3);
			
						
	// Gravação e Autorização da Viagem	  (Document: Solicitação de viagem: http://mo7366ux0026.intra.caixa.gov.br:8000/sap/bc/webdynpro/sap/fite_request?SAP_FITV_ACTION=&SAP_FITV_EXIT_OP=CallAssistantPOWL&SAP_FITV_PERSNO=00000010&SAP_FITV_TRIPCMP=R&SAP_FTIV_LAST_PERNR=00000010&sap-client=110&sap-language=PT#)
						
	
			link_verificarSolicitaçãoDeVia().click();	
			
			sleep(2);
		
			table_wD182A().click(atCell(atRow(atIndex(1)), atColumn(atIndex(0))));
			image__1x1().click();
			
			sleep(1);
			
			link_queroGravarAMinhaSolicita().click();
			
			sleep(2);
		
			link_ok().click();
			html_wD01DD().click(atPoint(439,11));
			
			// Adquirindo a Mensagem de Geração de Documento
			
				mensagem = (String)html_nºDeMensagem56588().getProperty(".text"); 
			
			// Numero do Valor do Documento
			
				num_doc  = mensagem.substring(22,32);
			
			sleep(1);		
			
			link_encerrarSolicitaçãoDeViag().click();
	

	
		
		
			
			
		
			
			
		
			
		
	}
}

