package br.ufpi.es.gerenciadorloginspringmvc.repositorios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.ufpi.es.gerenciadorloginspringmvc.entidades.Empresa;


public class EmpresaDAO {

	/**
	 * Hashmap criado para armazenar as empresas
	 */
	private final static Map<Long, Empresa> EMPRESAS = new HashMap<>();
	static {
		geraIdEAdiciona(new Empresa("Doceria Bela Vista"));
		geraIdEAdiciona(new Empresa("Ferragens Docel"));
		geraIdEAdiciona(new Empresa("Alura"));
		geraIdEAdiciona(new Empresa("Google"));
		geraIdEAdiciona(new Empresa("Caelum"));
		geraIdEAdiciona(new Empresa("Casa do Código"));
	}

	/**
	 * Dado um filtro retorna as empresas que casaram com o filtro
	 * @param nome filtro da busca
	 * @return lista de empresas
	 */
	public Collection<Empresa> buscaPorSimilaridade(String nome) {
		if (nome == null)
			return EMPRESAS.values();
		
		List<Empresa> similares = new ArrayList<>();
		for (Empresa empresa : EMPRESAS.values()) {
			if (empresa.getNome().toLowerCase().contains(nome.toLowerCase()))
				similares.add(empresa);
		}
		return similares;
	}

	/**
	 * Adiciona uma empresa na estrutura
	 * @param empresa empresa
	 */
	public void adiciona(Empresa empresa) {
		geraIdEAdiciona(empresa);
	}

	/**
	 * Gerador de Id da Empresa adicionada
	 * @param empresa empresa
	 */
	private static void geraIdEAdiciona(Empresa empresa) {
		long id = EMPRESAS.size()+1l;
		empresa.setId(id);
		EMPRESAS.put(id, empresa);
	}
}
