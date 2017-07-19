package com.collection;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.googlecode.s2hibernate.struts2.plugin.annotations.SessionTarget;
import com.googlecode.s2hibernate.struts2.plugin.annotations.TransactionTarget;


public class CollectionDAO {

	public CollectionDAO() {
		// TODO Auto-generated constructor stub
	}

	@SessionTarget
	   Session session;

	   @TransactionTarget
	   Transaction transaction;

	   @SuppressWarnings("unchecked")
/************************Utenze DAO*****************************/
	   public List<Utenze> getUsers()
	   {
	      List<Utenze> users = new ArrayList<Utenze>();
	      try
	      {
	    	  users = session.createQuery("from Utenze").list();
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      return users;
	   }
	   public void addUser(Utenze user)
	   {
	      session.save(user);
	   }
/******************Clienti DAO************/
	   public void addClient(Clienti client)
	   {
	      session.save(client);
	   }
	   public List<Clienti > getClienti()
	   {
	      List<Clienti> clients = new ArrayList<Clienti >();
	      try
	      {
	    	  clients= session.createQuery("from Clienti").list();
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      return clients ;
	   }

	  

	   /******************Articoli DAO************/
	   public void addArticle(Articoli article)
	   {
	      session.save(article);
	   }
	   public List<Articoli > getArticoli()
	   {
	      List<Articoli> articles = new ArrayList<Articoli >();
	      try
	      {
	    	  articles= session.createQuery("from Articoli").list();
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      return articles ;
	   }

	  /*******************Listino Dao***********************/
	   public void addList(Listino list)
	   {
	      session.save(list);
	   }
	   public List<Listino > getList()
	   {
	      List<Listino> lists = new ArrayList<Listino>();
	      try
	      {
	    	  lists= session.createQuery("from Listino").list();
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      return  lists ;
	   }
	   /*******************Ordini Dao***********************/
	   public void addOrder(Ordini list)
	   {
	      session.save(list);
	   }
	   public List<Ordini > getOrders()
	   {
	      List<Ordini> orders = new ArrayList<Ordini>();
	      try
	      {
	    	  orders= session.createQuery("from Ordini").list();
	      }
	      catch(Exception e)
	      {
	         e.printStackTrace();
	      }
	      return  orders ;
	   }
	}

