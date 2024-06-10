package apps;

//Aplicando Abstração
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();

	//somente os filhos conhecem este método, essa é a função do protected
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}