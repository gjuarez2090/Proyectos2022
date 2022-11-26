package efp.ret.consulta;

public class Response {
	
	String curp;
	String regimen;
	String nss;
	String diagnostico;
	String desc_diagnostico;
	
	public String getCurp() {
		return curp;
	}
	
	public String getRegimen() {
		return regimen;
	}
	
	public String getNti() {
		return nss;
	}
	
	public String getDiagnostico() {
		return diagnostico;
	}
	
	public String getDescDiagnostico() {
		return desc_diagnostico;
	}
	
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	public void setRegimen(String regimen) {
		this.regimen = regimen;
	}
	
	public void setNss(String nss) {
		this.nss = nss;
	}
	
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	
	public void setDescDiagnostico(String desc_diagnostico) {
		this.desc_diagnostico = desc_diagnostico;
	}
}
