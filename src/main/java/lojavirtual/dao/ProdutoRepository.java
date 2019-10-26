package lojavirtual.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lojavirtual.model.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>  {

	
	
	
}
