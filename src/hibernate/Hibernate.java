/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {


    public static void main(String[] args) {
        
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        
        System.out.println("Choose: ");
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        
        if(choice==1)
        {
            Test1 obj=new Test1();
            
            for(int i=1;i<=5;i++)
            {
                obj.setName("Monir"+i);
                obj.setPassword("123"+i);
                obj.setEmail("sjajnsa"+i+"@gmail.com");
                try {
                        session.beginTransaction();
                        session.save(obj);
                        session.getTransaction().commit();
                    } catch (Exception e) {
                        e.printStackTrace();
                        session.getTransaction().rollback();
                    }
            }
            session.close();
            System.out.println("Done");
        }
        
        else if(choice==2)
        {
            session.beginTransaction();
            String hql="from Test1";
            Query q=session.createQuery(hql);
            
            List<Test1> test=(List<Test1>)q.list();
            session.getTransaction().commit();
            session.close();
            for(Test1 t : test)
            {
                System.out.println(t.getName());
                System.out.println(t.getId());
                System.out.println(t.getPassword());
                
                
            }
             
        }
        
        else if(choice==3)
        {
            session.beginTransaction();
            String hql="from Test1 where id>=150";
            Query q=session.createQuery(hql);
            List<Test1> test = (List<Test1>) q.list();
            session.getTransaction().commit();
            session.close();
            
            for(Test1 s : test)
            {
                System.out.println(s);
            }
            
        }
        else if(choice==4)
        {
            session.beginTransaction();
            int id=150;
            String pasw="1235";
            String hql="from Test1 where id=? and password=?";
            
            Query q=session.createQuery(hql);
            
            boolean login=false;
            
            q.setInteger(0,id);
            q.setString(1, pasw);
            List<Test1> test=q.list();
            
            session.getTransaction().commit();
            session.close();
            if(test != null && test.size()==1)
            {
                System.out.println("Login successful...");
                login=true;
               
                System.out.println(login);
            }
            System.out.println(login);
        }
        
        else if(choice==5)
        {
            String text="hello";
            String mail="monir9968@gmail.com";
            
            Pattern pattern = Pattern.compile("^.+@.+\\..+$");
            Matcher matcher = pattern.matcher(mail);
            if (matcher.find())
                System.out.println("Matches...yoo");
            else
                System.out.println("Crap...");
        }
        
        else if(choice==6)
                {
                    String image_upPath="E:\\Programming Practice\\JSP\\projectFinal\\web\\resources\\case_images\\";
                    System.out.println(image_upPath.length());
                }
        
        else if(choice==7)
        {
            String image_upPath="E:\\Programming Practice\\JSP\\projectFinal\\web\\resources\\case_images\\";
            String delete="E:\\Programming Practice\\JSP\\projectFinal\\web\\";
            String img=image_upPath.replace(delete, "");
            System.out.println(img);
        }
        
        else if(choice==8)
        {
            try{
                session.beginTransaction();
            String hql="select cc.criminalId from Criminalcase cc where cc.status='Running' ";
            Query q=session.createQuery(hql);
            session.getTransaction().commit();
            List<String> criminal=q.list();
            List<Criminal> crim=new ArrayList<Criminal>();
            //session.close();
            for(String c:criminal)
            {
                int i=1;
                System.out.println(c.toString());
                String id=c.toString();
                Session session1=NewHibernateUtil.getSessionFactory().openSession();
                session1.beginTransaction();
                String hql1="from Criminal where id=?";
                Query q1=session1.createQuery(hql1);
                q1.setString(0, id);
                session1.getTransaction().commit();
                Criminal obj=(Criminal) q1.uniqueResult();
                crim.add(obj);
                i++;
                
            }
            
            for(Criminal c:crim)
            {
                System.out.println(c.getName());
            }
            
            }
            catch(Exception e)
            {
                e.printStackTrace();
                session.close();
                        
            }
        }
        
        else if(choice==9)
        {
            session.beginTransaction();
            String hql="select cc.criminalId from Criminalcase cc where cc.status='Running' ";
            Query q=session.createQuery(hql);
            session.getTransaction().commit();
            
            
        }
        else
            System.out.println("Wrong input");
        
    }
    
}
