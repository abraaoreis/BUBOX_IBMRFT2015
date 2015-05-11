package Scripts;
import resources.Scripts.Login_AmbienteHelper;
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
public class Login_Ambiente extends Login_AmbienteHelper
{
	/**
	 * Script Name   : <b>Login</b>
	 * Generated     : <b>05/05/2015 12:56:51</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.2  Build 9200 ()
	 * 
	 * @since  2015/05/05
	 * @author f730207
	 */
	public void testMain(Object[] args) 
	{
		
		// Logon Ambiente 110
		
		
		id_viajante = dpString("ID_VIAJANTE");// Variável Global do ID_VIAJANTE
		
		//startBrowser("http://mo7366ux0026.intra.caixa.gov.br:8000/sap/bc/webdynpro/sap/fite_request?SAP_FITV_ACTION=&SAP_FITV_EXIT_OP=CallAssistantPOWL&SAP_FITV_PERSNO=00000010&SAP_FITV_TRIPCMP=R&SAP_FTIV_LAST_PERNR=00000010#");	
		// Executando pela primeira vez o script
		
		if (naox(dpString("LOGIN"))){
		
			startBrowser("http://mo7366ux0026.intra.caixa.gov.br:8000/sap/bc/webdynpro/sap/fite_request?SAP_FITV_ACTION=&SAP_FITV_EXIT_OP=CallAssistantPOWL&SAP_FITV_PERSNO="+ id_viajante +"&SAP_FITV_TRIPCMP=R&SAP_FTIV_LAST_PERNR=" + id_viajante + "#");
			
			text_sapClient().click(atPoint(29,2));
			browser_htmlBrowser(document_logon(),DEFAULT_FLAGS).inputKeys("^a"); // Local do Ambiente
			browser_htmlBrowser(document_logon(),DEFAULT_FLAGS).inputKeys("110");
			
			text_usuárioCampoDeEntradaEmBr().click(atPoint(58,7));
			browser_htmlBrowser(document_logon(),DEFAULT_FLAGS).inputChars(dpString("LOGIN"));// Usuario Ambiente
			
			text_sapPassword().click(atPoint(32,10));
			browser_htmlBrowser(document_logon(),DEFAULT_FLAGS).inputKeys(dpString("SENHA"));// Senha Ambiente
			link_logoN_BUTTON().click();
		
		}else{
			
			// Executando a partir da segunda			
			browser_htmlBrowser().loadUrl("http://mo7366ux0026.intra.caixa.gov.br:8000/sap/bc/webdynpro/sap/fite_request?SAP_FITV_ACTION=&SAP_FITV_EXIT_OP=CallAssistantPOWL&SAP_FITV_PERSNO="+ id_viajante +"&SAP_FITV_TRIPCMP=R&SAP_FTIV_LAST_PERNR=" + id_viajante + "#");
			
		}
		
		
		
	}
}

