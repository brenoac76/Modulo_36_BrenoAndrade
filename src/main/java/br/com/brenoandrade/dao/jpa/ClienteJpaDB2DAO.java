/**
 * 
 */
package br.com.brenoandrade.dao.jpa;

import br.com.brenoandrade.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.brenoandrade.domain.jpa.ClienteJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
