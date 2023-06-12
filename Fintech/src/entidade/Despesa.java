package entidade;

import java.util.Date;

public class Despesa {
	private String t_meta_cd_meta;
    private String cd_despid;
    private String ds_despesa;
    private Date dt_data;
    private double qt_valor;
	
    public Despesa() {
    	
    }
    
    public Despesa( String t_meta_cd_meta, String cd_despid, String ds_despesa, Date dt_data, double qt_valor) {
    	this.t_meta_cd_meta = t_meta_cd_meta;
    	this.cd_despid = cd_despid;
    	this.ds_despesa = ds_despesa;
    	this.dt_data = dt_data;
    	this.qt_valor = qt_valor;
    }
    
    public String getT_meta_cd_meta() {
		return t_meta_cd_meta;
	}
	public void setT_meta_cd_meta(String t_meta_cd_meta) {
		this.t_meta_cd_meta = t_meta_cd_meta;
	}
	public String getCd_despid() {
		return cd_despid;
	}
	public void setCd_despid(String cd_despid) {
		this.cd_despid = cd_despid;
	}
	public String getDs_despesa() {
		return ds_despesa;
	}
	public void setDs_despesa(String ds_despesa) {
		this.ds_despesa = ds_despesa;
	}
	public Date getDt_data() {
		return dt_data;
	}
	public void setDt_data(Date dt_data) {
		this.dt_data = dt_data;
	}
	public double getQt_valor() {
		return qt_valor;
	}
	public void setQt_valor(double qt_valor) {
		this.qt_valor = qt_valor;
	}
    

}
