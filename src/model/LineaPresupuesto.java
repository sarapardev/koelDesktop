package model;

public class LineaPresupuesto {
	private int id;
	private String concepto;
	private int cantidad;
	private double precio;
	private int tipoIVA;
	
	
	//
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getTipoIVA() {
		return tipoIVA;
	}
	public void setTipoIVA(int tipoIVA) {
		this.tipoIVA = tipoIVA;
	}
	
	

}
