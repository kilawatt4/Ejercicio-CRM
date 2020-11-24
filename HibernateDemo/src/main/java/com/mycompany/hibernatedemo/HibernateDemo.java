/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hibernatedemo;

;



import java.util.Date;

import java.math.BigDecimal;

import org.hibernate.Session;
import org.hibernate.Transaction;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paco
 */
public class HibernateDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //org.apache.log4j.BasicConfigurator.configure();
        
        try (Session s = HibernateUtil.getSessionFactory().openSession()) {
          Transaction t = null;

          try {
            t = s.beginTransaction();
            
                //Date fecha = Date.valueOf(LocalDate.MAX);
                Date date = new Date();
                BigDecimal value = new BigDecimal(255.5);
                models.Contacto cliente2 = (models.Contacto) s.get(models.Contacto.class, 1);
            models.Contacto cliente1 = new models.Contacto("Juan", "Gonzalez","empreesita","35624555", "jsdbsaba@gmail.com");
            models.Oportunidad oportunidad1 = new models.Oportunidad(cliente2,"Correr", value, date, "nivel2", "NUEVO");
            models.Actividad actividad1 = new models.Actividad("Entretenido", "Saltar", date);
            s.save(cliente1);
            s.save(oportunidad1);
            s.save(actividad1);
            t.commit();

            } catch (Exception e) {
                e.printStackTrace(System.err);
                if (t != null) {
                  t.rollback();
                }
            }
        }        
    }
    
}