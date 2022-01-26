package com.guigon.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.guigon.fornecedor.model.InfoFornecedor;

public class InfoService {

	@Autowired
	private InfoRepository infoRepository;

	public InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
	}

}
