package com.murilobj.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.murilobj.domain.enums.TipoCliente;


@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String email;
	private String CPF_or_CNPJ;
	private Integer tipo;
	
	@OneToMany(mappedBy="cliente")
	private List<Address> address = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name="Telephone")
	private Set<String> telephone = new HashSet<>();
	
	public Cliente() {
			}

	public Cliente(Integer id, String name, String email, String CPF_or_CNPJ, String AddressLine, TipoCliente tipo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.CPF_or_CNPJ = CPF_or_CNPJ;
		this.tipo = tipo.getCod();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF_or_CNPJ() {
		return CPF_or_CNPJ;
	}

	public void setCPF_or_CNPJ(String CPF_or_CNPJ) {
		this.CPF_or_CNPJ = CPF_or_CNPJ;
	}

	public String getAddressLine() {
		return name;
	}

	public void setAddresLine(String AddressLine) {
		this.setAddressLine(AddressLine);
	}

	public TipoCliente getTipo() {
		return TipoCliente.toEnum(tipo);
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo.getCod();
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public Set<String> getTelefones() {
		return telephone;
	}

	public void setTelefones(Set<String> telefones) {
		this.telephone = telefones;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

	public void setAddressLine(String addressLine) {
	}


}