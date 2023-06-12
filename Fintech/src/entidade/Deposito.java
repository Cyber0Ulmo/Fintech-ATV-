package entidade;

import java.util.Date;

public class Deposito {

	  private String t_meta_cd_meta;
	    private String cd_depid;
	    private String ds_deposito;
	    private Date dt_data;
	    private double qt_valor;
		
	    public Deposito() {
	    	
	    }
	    
	    public Deposito(String t_meta_cd_meta, String cd_depid, String ds_deposito, Date dt_data, 
	    		double qt_valor) {
	    	this.t_meta_cd_meta = t_meta_cd_meta;
	    	this.cd_depid = cd_depid;
	    	this.ds_deposito = ds_deposito;
	    	this.dt_data = dt_data;
	    	this.qt_valor = qt_valor;
	    	
	    }
	    
	    public String getT_meta_cd_meta() {
			return t_meta_cd_meta;
		}
		public void setT_meta_cd_meta(String t_meta_cd_meta) {
			this.t_meta_cd_meta = t_meta_cd_meta;
		}
		public String getCd_depid() {
			return cd_depid;
		}
		public void setCd_depid(String cd_depid) {
			this.cd_depid = cd_depid;
		}
		public String getDs_deposito() {
			return ds_deposito;
		}
		public void setDs_deposito(String ds_deposito) {
			this.ds_deposito = ds_deposito;
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
