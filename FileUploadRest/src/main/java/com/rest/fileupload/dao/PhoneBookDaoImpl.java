package com.rest.fileupload.dao;

import com.rest.fileupload.entities.PhoneBook;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.INTERFACES)
@Transactional
public class PhoneBookDaoImpl implements PhoneBookDao {
    protected EntityManager entityManager;
    public EntityManager getEntityManager() {
        return entityManager;
    }
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public void save(List<String> result) {

        result.forEach(str->{
            PhoneBook phoneBook =new PhoneBook();
            phoneBook.setPhoneNumber(str);
             PhoneBook phoneBook1= entityManager.find(PhoneBook.class,phoneBook.getPhoneNumber());
                if(phoneBook1==null)
                entityManager.persist(phoneBook);
        });
    }
    @Override
    public List<PhoneBook>  getPhoneBook() {
        List<PhoneBook>  phoneBookList=entityManager.createQuery("select e from PhoneBook e", PhoneBook.class).getResultList();
        return phoneBookList;
    }
}
