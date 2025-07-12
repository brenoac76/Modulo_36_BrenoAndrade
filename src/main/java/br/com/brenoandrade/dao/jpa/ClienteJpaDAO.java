/**
 * 
 */
package br.com.brenoandrade.dao.jpa;

import br.com.brenoandrade.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.brenoandrade.domain.jpa.ClienteJpa;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
