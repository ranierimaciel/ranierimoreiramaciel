package com.testedoranieri;

import org.hibernate.Session;

public class Conecta {

	public static void main(String[] args) {
		Session sessao = null;
		try {
			sessao = HibernateUtil.getSession().openSession();
			System.out.println("Conexao bem sucedida !");
		} finally {
			// TODO: handle finally clause
			sessao.close();
			System.out.println("Conexao Fechada com sucesso");
		}
		
	}
	
}
