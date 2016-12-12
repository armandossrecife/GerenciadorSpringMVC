package br.ufpi.es.gerenciadorloginspringmvc.controladores;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufpi.es.gerenciadorloginspringmvc.entidades.Empresa;
import br.ufpi.es.gerenciadorloginspringmvc.repositorios.EmpresaDAO;

@Controller
public class EmpresaController {
	
	/**
	 * Faz a requisição do fomrulário de Empresa
	 * @param model Modelo que armazena informações para serem passadas para a visão
	 * @return novaEmpresa carrega a página novaEmpresa
	 */
	@RequestMapping(value="/empresa", method=RequestMethod.GET)
	public String formularioEmpresa(Model model){
		return "novaEmpresa";
	}
	
	/**
	 * Insere uma nova empresa
	 * @param model Modelo que armazena informações para serem passadas para a visão
	 * @param request mensagem de requisição enviada ao servidor
	 * @return resultadaEmpresa carrega página resultadaEmpresa
	 */
	@RequestMapping(value="/novaEmpresa", method=RequestMethod.POST)
	public String novaEmpresa(Model model, HttpServletRequest request){
		String nome = request.getParameter("nome");
		
		Empresa empresa = new Empresa(nome);
		new EmpresaDAO().adiciona(empresa);
		
		model.addAttribute("nome", empresa.getNome());
		return "resultadoEmpresa";
	}	
	
	/**
	 * Faz a busca de Empresas no repositório
	 * @param model  Modelo que armazena informações para serem passadas para a visão
	 * @param request mensagem de requisição enviada ao servidor
	 * @return buscaEmpresa carrega página buscaEmpresa
	 */
	@RequestMapping(value="/buscaEmpresa", method=RequestMethod.GET)
	public String buscaEmpresa(Model model, HttpServletRequest request){
		String filtro=request.getParameter("filtro");
		Collection<Empresa> colecaoEmpresas = new EmpresaDAO().buscaPorSimilaridade(filtro);
		
		model.addAttribute("empresas", colecaoEmpresas);
		return "buscaEmpresa";
	}
	

}
