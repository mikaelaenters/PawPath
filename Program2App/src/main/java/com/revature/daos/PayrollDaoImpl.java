package com.revature.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Component;

import com.revature.beans.Payroll;
import com.revature.util.SessionFactoryUtil;

@Component
public class PayrollDaoImpl implements PayrollDao {
	SessionFactory sf = SessionFactoryUtil.getSessionFactory();

	@Override
	public List<Payroll> getAllPaychecks() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Payroll.class);
		List<Payroll> paychecks = criteria.list();
		sf.close();

		return paychecks;
	}

	@Override
	public void savePaycheck(Payroll paycheck) {
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(paycheck);
		transaction.commit();
		sf.close();
	}

	@Override
	public Payroll getPaycheckById(int id) {
		Session session = sf.openSession();
		Payroll paycheck = (Payroll) session.get(Payroll.class, id);
		sf.close();
		return paycheck;
	}

	@Override
	public Payroll getPaycheckByContractorId(int id) {
		Session session = sf.openSession();
		Payroll paycheck = (Payroll) session.get(Payroll.class, id);
		sf.close();
		return paycheck;
	}

	@Override
	public Payroll getPaycheckByJobId(int id) {
		Session session = sf.openSession();
		Payroll paycheck = (Payroll) session.get(Payroll.class, id);
		sf.close();
		return paycheck;
	}

	@Override
	public void updatePaycheck(Payroll paycheck) {
		Session session = sf.openSession();
		session.update(paycheck);
		session.close();

	}

	@Override
	public void deletePaycheck(int id) {
		Session session = sf.openSession();
		String hql = "delete Payroll where contractor_id = :id";
		Query query = session.createQuery(hql);
		query.setInteger("id", id);
		int result = query.executeUpdate();

	}

}
