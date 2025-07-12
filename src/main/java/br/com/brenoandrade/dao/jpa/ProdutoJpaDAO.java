/**
 * 
 */
package br.com.brenoandrade.dao.jpa;

import br.com.brenoandrade.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.brenoandrade.domain.jpa.ProdutoJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
