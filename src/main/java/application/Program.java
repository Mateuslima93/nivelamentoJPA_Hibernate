package application;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		
	
		 //Entidade monitorada (ou acababou de ser inserida ou tem que ser buscada) - só remove entidade monitorada
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		 EntityManager em = emf.createEntityManager();
		 //Pessoa p4 = new Pessoa(null, "José Geraldo", "jose@gmail.com");
		 em.getTransaction().begin();
		 //Adicionar registro tabela
		 //em.persist(p4);
		 //Buscar registro tabela
		 Pessoa p = em.find(Pessoa.class, 4);
		 //Apagar registro tabela
		 em.remove(p);
		 em.getTransaction().commit();
		 System.out.println("pronto");
		 em.close();
		 emf.close();
	}

}
