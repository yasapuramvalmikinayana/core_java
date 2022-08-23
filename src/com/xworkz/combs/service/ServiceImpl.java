package com.xworkz.combs.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import static com.xworkz.combs.util.CombUtil.getFactory;

import com.xworkz.combs.DAO.CombDAO;
import com.xworkz.combs.DAO.CombDAOImpl;
import com.xworkz.combs.entity.CombEntity;

public class ServiceImpl implements ServiceComb{
	CombDAO dao=new CombDAOImpl();
	  ValidatorFactory factory=getFactory();
		@Override
		public boolean validateAndSave(CombEntity entity) {
				Validator validator = factory.getValidator();
				Set<ConstraintViolation<CombEntity>> cv =validator.validate(entity);
				if(cv.size()>0) {
					System.out.println("invalid details");

				}else {
					System.out.println("valid details");
					dao.validateAndSave(entity);
				}
				return false;
			}

		}


