/**
 * 
 */
package br.com.brenoandrade.dao.jpa;

import br.com.brenoandrade.dao.generic.jpa.IGenericJapDAO;
import br.com.brenoandrade.domain.jpa.Persistente;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
