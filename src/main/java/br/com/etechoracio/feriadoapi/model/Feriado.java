package br.com.etechoracio.feriadoapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.crypto.Data;

import br.com.etechoracio.feriadoapo.enuns.TipoFeriadoEnum;

@Entity
@Table(name = "tbl_feriado")
public class Feriado {
	
	@Id
	@GeneratedValue
	@Column(name ="id_feriado")
	private Long id;
	
	@Column(name = "tipo_variado")
	@Enumerated(EnumType.STRING)
	private TipoFeriadoEnum tipo_feriado;
	
	@Column(name = "descricao_feriado")
	private String descricao;
	
	@Column(name = "data_feriado")
	@Temporal(TemporalType.DATE)
	private Data data_feriado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TipoFeriadoEnum getTipo_feriado() {
		return tipo_feriado;
	}

	public void setTipo_feriado(TipoFeriadoEnum tipo_feriado) {
		this.tipo_feriado = tipo_feriado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Data getData_feriado() {
		return data_feriado;
	}

	public void setData_feriado(Data data_feriado) {
		this.data_feriado = data_feriado;
	}
	
	

}
