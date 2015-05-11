package Scripts;
import org.eclipse.hyades.execution.runtime.datapool.IDatapoolIterator;
import org.eclipse.hyades.models.common.datapool.DPLCell;

import resources.Scripts.Suite_Portal_ViagemHelper;
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
public class Suite_Portal_Viagem extends Suite_Portal_ViagemHelper
{
	/**
	 * Script Name   : <b>Suit_Portal_Viagem</b>
	 * Generated     : <b>05/05/2015 13:24:17</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 6.2  Build 9200 ()
	 * 
	 * @since  2015/05/05
	 * @author f730207
	 */
	
	public void testMain(Object[] args) 
	{
		
		
	int	DatapoolLinha = 0;
	
	
	// Iteração entre os Datapools
	
	
	
		while (!dpDone()){
			
			
			System.out.println(dpCurrent()); // Imprimindo a Linha Atual do Datapool
			
			// Executando o Login
			callScript("Scripts.Login_Ambiente", DEFAULT_ARGS ,DatapoolLinha );
			
			sleep(5);
			
			// Realizando a solicitação de Viagem
			
			callScript("Scripts.Solicitação_Portal_Viagem", DEFAULT_ARGS , DatapoolLinha);
			
			sleep(5);
			
			// Realizando Calculo de Despesas
			
			callScript("Scripts.Despesas_Portal_Viagem", DEFAULT_ARGS , DatapoolLinha);
		
		
			DatapoolLinha++; // Contador de linha			
			
			dpNext(); // Próxima Linha			
		
		
		}
		
	}
}

