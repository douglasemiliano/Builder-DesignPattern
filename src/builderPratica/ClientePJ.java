package builderPratica;

public class ClientePJ extends Cliente{

	private String razaoSocial;
	private String CNPJ;
	
	public ClientePJ(String razaoSocial, String cNPJ) {
		super();
		this.razaoSocial = razaoSocial;
		CNPJ = cNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
}
	
	
