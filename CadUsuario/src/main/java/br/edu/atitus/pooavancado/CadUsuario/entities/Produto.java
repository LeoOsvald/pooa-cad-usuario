package br.edu.atitus.pooavancado.CadUsuario.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto extends GenericEntity{

	private static final long serialVersionUID = 1L;

	private double valorUnitario;
	
	
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setEmail(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	

}
