package br.com.etechoracio.feriadoapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.etechoracio.feriadoapi.model.Feriado;

public interface FeriadoDAO extends JpaRepository<Feriado, Long> {

}
