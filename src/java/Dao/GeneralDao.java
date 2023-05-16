/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;


import Domain.HibernateUtil;
import Domain.Patient;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author user
 */
public class GeneralDao<ClassName> {
    
    public Class<ClassName> type;
    
    public GeneralDao(Class<ClassName> type){
        this.type = type;
    }
    
    private Session session = null;
    
    public ClassName create(ClassName cObj){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction =  session.beginTransaction();
            
            session.save(cObj);
            transaction.commit();
            session.close();
            
            return cObj;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ClassName update(ClassName cObj){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction transaction =  session.beginTransaction();
            
            session.update(cObj);
            transaction.commit();
            session.close();
            
            return cObj;
        } catch (Exception e) {
            return null;
        }
    }
    
    
    public boolean delete(ClassName cObj){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.delete(cObj);
            session.getTransaction().commit();
            session.close();
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
    public ClassName findByINT_PK(int pk){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        try {
            ClassName  cObj = (ClassName)session.get(type, pk);
            session.getTransaction().commit();
            session.close();
            return cObj;
        } catch (Exception e) {
            return null;
        }
    }
    public Patient findById(String id) {
        session  = HibernateUtil.getSessionFactory().openSession();
        ClassName cObj = (ClassName) session.get(type, id);
        session.close();
        return (Patient) cObj;
    }
    
    public ClassName findBySTRING_PK(String pk){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
             ClassName cObj = (ClassName)session.get(type, pk);
            session.getTransaction().commit();
            session.close();
            return cObj;
        } catch (Exception e) {
            return null;
        }
    }
    
    
     public ClassName getById(String pk){
       ClassName cObj;
       try{
           session = HibernateUtil.getSessionFactory().openSession();
           cObj = (ClassName) session.get(type, pk);
           session.close();
       }catch (HibernateException s){
       cObj = null;
    }
       return cObj;
    }
    public List<ClassName> listAll(){
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        try {
             List<ClassName> list = session.createCriteria(type.getName()).list();
            session.getTransaction().commit();
            session.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }
    
}
