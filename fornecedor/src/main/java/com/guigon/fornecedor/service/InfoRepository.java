package com.guigon.fornecedor.service;

import org.springframework.data.repository.CrudRepository;

import com.guigon.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends CrudRepository<InfoFornecedor, Long> {

	InfoFornecedor findByEstado(String estado);
}
