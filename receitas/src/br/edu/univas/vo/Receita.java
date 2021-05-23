package br.edu.univas.vo;

public class Receita {

	private double ODEsf;
	private double OEEsf;
	private double ODCil;
	private double OECil;
	private double ODEixo;
	private double OEEixo;

	private double adc;

	public Receita(double ODEsf, double ODCil, double ODEixo, double OEEsf, double OECil, double OEEixo, double adc) {

		this.ODEsf = ODEsf;
		this.ODCil = ODCil;
		this.ODEixo = ODEixo;
		this.OEEsf = OEEsf;
		this.OECil = OECil;
		this.OEEixo = ODEixo;
		this.ODEsf = adc;

	}

	public double getODEsf() {
		return ODEsf;
	}

	public void setODEsf(double oDEsf) {
		ODEsf = oDEsf;
	}

	public double getOEEsf() {
		return OEEsf;
	}

	public void setOEEsf(double oEEsf) {
		OEEsf = oEEsf;
	}

	public double getODCil() {
		return ODCil;
	}

	public void setODCil(double oDCil) {
		ODCil = oDCil;
	}

	public double getOECil() {
		return OECil;
	}

	public void setOECil(double oECil) {
		OECil = oECil;
	}

	public double getAdc() {
		return adc;
	}

	public void setAdc(double adc) {
		this.adc = adc;
	}

	public double getODEixo() {
		return ODEixo;
	}

	public void setODEixo(double oDEixo) {
		ODEixo = oDEixo;
	}

	public double getOEEixo() {
		return OEEixo;
	}

	public void setOEEixo(double oEEixo) {
		OEEixo = oEEixo;
	}

}
