package entidade;

public class MetaUsu {
	 private String cd_meta;
	 private double qt_valor;
	 private String ds_meta;
	 private double qt_saldo;
	
	 public MetaUsu() {
		 
	 }
	 
	 public MetaUsu (String cd_meta, double qt_valor, String ds_meta, double qt_saldo ) {
		 this.cd_meta = cd_meta;
		 this.qt_valor = qt_valor;
		 this.ds_meta = ds_meta;
		 this.qt_saldo = qt_saldo;
		 
	 }
	 
	 public String getCd_meta() {
		return cd_meta;
	}
	public void setCd_meta(String cd_meta) {
		this.cd_meta = cd_meta;
	}
	public double getQt_valor() {
		return qt_valor;
	}
	public void setQt_valor(double qt_valor) {
		this.qt_valor = qt_valor;
	}
	public String getDs_meta() {
		return ds_meta;
	}
	public void setDs_meta(String ds_meta) {
		this.ds_meta = ds_meta;
	}
	public double getQt_saldo() {
		return qt_saldo;
	}
	public void setQt_saldo(double qt_saldo) {
		this.qt_saldo = qt_saldo;
	}

	 
	 
}
