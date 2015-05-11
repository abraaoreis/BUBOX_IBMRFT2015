package Scripts;
import resources.Scripts.Despesas_Portal_ViagemHelper;
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
public class Despesas_Portal_Viagem extends Despesas_Portal_ViagemHelper
{
	/**
	 * Script Name   : <b>Despesas</b>
	 * Generated     : <b>04/05/2015 15:36:50</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.2  Build 9200 ()
	 * 
	 * @since  2015/05/04
	 * @author f730207
	 */
	public void testMain(Object[] args) 
	{
		

		
		// Abrindo a URL do Componente de Cáculo de Despesa
		
		//browser_htmlBrowser().loadUrl("http://mo7366ux0026.intra.caixa.gov.br:8000/sap/bc/webdynpro/sap/fite_expenses?sap_fitv_action=&sap_fitv_exit_op=CallAssistantPOWL&sap_fitv_persno=00000010&sap_fitv_tripcmp=&sap_fitv_tripno="+ num_doc  +"&sap_ftiv_last_pernr=00000010&sap-client=110&sap-language=PT#");
		
		browser_htmlBrowser().loadUrl("http://mo7366ux0026.intra.caixa.gov.br:8000/sap/bc/webdynpro/sap/fite_expenses?sap_fitv_action=&sap_fitv_exit_op=CallAssistantPOWL&sap_fitv_persno=" + id_viajante + "&sap_fitv_tripcmp=&sap_fitv_tripno="+ num_doc  +"&sap_ftiv_last_pernr=" + id_viajante + "&sap-client=110&sap-language=PT#");		
		
		// Calculo de Despesas
		
	
		text_wD4C().click(atPoint(15,6));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ExtDown}{ENTER}");
		
		sleep(2);
		
		link_iniciarCálculoDeDespesas().click();
		
		sleep(3);
		
		link_avançarParaEntrarRecibos().click();
		
		sleep(2);
		
		
		// Passagem Aérea Paga
		
		link_wD0233().click();
		text_wD027D().click(atPoint(29,9));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("P{ExtDown}");
		
		sleep(3);
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("CT_PASSPAGA"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		sleep(3);
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ExtDown}{ExtDown}{ExtDown}{ExtDown}{ExtDown}{ExtDown}{ExtDown}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("NDOC_PASSPAG"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputChars(dpString("TXT_PASSPAGA"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("BILT_PASSPAGA"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		sleep(2);
		
		// Taxa Embarque
		
		link_wD0233().click();
		text_wD1AB2().click(atPoint(26,4));				
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("T{ENTER}");
		
		sleep(3);
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("CT_TXPASS"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		sleep(3);
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
	
		sleep(2);	
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("NDOC_TXPASS"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("TXT_TXPASS"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		sleep(2);
		
		// Taxa Fee Aerea		
		
		link_wD0233().click();
		text_wD2FB4().click(atPoint(11,8));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("T{ExtDown}");
		
		sleep(3);
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("CT_TXFEE"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		sleep(3);
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
	
		sleep(2);	
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("CT_TXFEE"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys(dpString("TXT_TXFEE"));
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{TAB}");
		browser_htmlBrowser(document_cálculoDeDespesas(),DEFAULT_FLAGS).inputKeys("{ENTER}");
		
		sleep(2);	
		
		link_verificarCálculoDeDespesa().click();
		
		sleep(2);
				
		image__1x1().click();
		image__1x1().click();
		
		sleep(2);
		
		link_queroGravarOMeuCálculoDeD().click();
		
		sleep(3);
		
		link_queroGravarOMeuCálculoDeD().click();
		
		sleep(3);
		
		link_encerrarCálculoDeDespesas().click();
		
		
		
	}
}

