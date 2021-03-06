/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Ricardo Petronilho(Universidade do Minho)
 * License Type: Academic
 */
package hrpersonaltrainer;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class PersonalTrainerDAO {
	public static PersonalTrainer loadPersonalTrainerByORMID(String username) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return loadPersonalTrainerByORMID(session, username);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer getPersonalTrainerByORMID(String username) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return getPersonalTrainerByORMID(session, username);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer loadPersonalTrainerByORMID(String username, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return loadPersonalTrainerByORMID(session, username, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer getPersonalTrainerByORMID(String username, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return getPersonalTrainerByORMID(session, username, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer loadPersonalTrainerByORMID(PersistentSession session, String username) throws PersistentException {
		try {
			return (PersonalTrainer) session.load(hrpersonaltrainer.PersonalTrainer.class, username);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer getPersonalTrainerByORMID(PersistentSession session, String username) throws PersistentException {
		try {
			return (PersonalTrainer) session.get(hrpersonaltrainer.PersonalTrainer.class, username);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer loadPersonalTrainerByORMID(PersistentSession session, String username, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PersonalTrainer) session.load(hrpersonaltrainer.PersonalTrainer.class, username, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer getPersonalTrainerByORMID(PersistentSession session, String username, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (PersonalTrainer) session.get(hrpersonaltrainer.PersonalTrainer.class, username, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonalTrainer(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return queryPersonalTrainer(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonalTrainer(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return queryPersonalTrainer(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer[] listPersonalTrainerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return listPersonalTrainerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer[] listPersonalTrainerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return listPersonalTrainerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonalTrainer(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hrpersonaltrainer.PersonalTrainer as PersonalTrainer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPersonalTrainer(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hrpersonaltrainer.PersonalTrainer as PersonalTrainer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PersonalTrainer", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer[] listPersonalTrainerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPersonalTrainer(session, condition, orderBy);
			return (PersonalTrainer[]) list.toArray(new PersonalTrainer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer[] listPersonalTrainerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPersonalTrainer(session, condition, orderBy, lockMode);
			return (PersonalTrainer[]) list.toArray(new PersonalTrainer[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer loadPersonalTrainerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return loadPersonalTrainerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer loadPersonalTrainerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return loadPersonalTrainerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer loadPersonalTrainerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		PersonalTrainer[] personalTrainers = listPersonalTrainerByQuery(session, condition, orderBy);
		if (personalTrainers != null && personalTrainers.length > 0)
			return personalTrainers[0];
		else
			return null;
	}
	
	public static PersonalTrainer loadPersonalTrainerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		PersonalTrainer[] personalTrainers = listPersonalTrainerByQuery(session, condition, orderBy, lockMode);
		if (personalTrainers != null && personalTrainers.length > 0)
			return personalTrainers[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePersonalTrainerByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return iteratePersonalTrainerByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonalTrainerByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hrpersonaltrainer.DiagramasPersistentManager.instance().getSession();
			return iteratePersonalTrainerByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonalTrainerByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hrpersonaltrainer.PersonalTrainer as PersonalTrainer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePersonalTrainerByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From hrpersonaltrainer.PersonalTrainer as PersonalTrainer");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("PersonalTrainer", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer createPersonalTrainer() {
		return new hrpersonaltrainer.PersonalTrainer();
	}
	
	public static boolean save(hrpersonaltrainer.PersonalTrainer personalTrainer) throws PersistentException {
		try {
			hrpersonaltrainer.DiagramasPersistentManager.instance().saveObject(personalTrainer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(hrpersonaltrainer.PersonalTrainer personalTrainer) throws PersistentException {
		try {
			hrpersonaltrainer.DiagramasPersistentManager.instance().deleteObject(personalTrainer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(hrpersonaltrainer.PersonalTrainer personalTrainer) throws PersistentException {
		try {
			hrpersonaltrainer.DiagramasPersistentManager.instance().getSession().refresh(personalTrainer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(hrpersonaltrainer.PersonalTrainer personalTrainer) throws PersistentException {
		try {
			hrpersonaltrainer.DiagramasPersistentManager.instance().getSession().evict(personalTrainer);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static PersonalTrainer loadPersonalTrainerByCriteria(PersonalTrainerCriteria personalTrainerCriteria) {
		PersonalTrainer[] personalTrainers = listPersonalTrainerByCriteria(personalTrainerCriteria);
		if(personalTrainers == null || personalTrainers.length == 0) {
			return null;
		}
		return personalTrainers[0];
	}
	
	public static PersonalTrainer[] listPersonalTrainerByCriteria(PersonalTrainerCriteria personalTrainerCriteria) {
		return personalTrainerCriteria.listPersonalTrainer();
	}
}
