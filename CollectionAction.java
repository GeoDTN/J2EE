package com.collection;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.collection.Ordini;
import com.collection.Clienti;
import com.collection.Articoli;
import com.collection.Listino;
import com.collection.Utenze;
import com.collection.CollectionDAO;

public class CollectionAction extends ActionSupport 
implements ModelDriven<Utenze>{

	public CollectionAction() {
		// TODO Auto-generated constructor stub
	}

	Utenze  user  = new Utenze();
	   List<Utenze> utenzi = new ArrayList<Utenze>();
	   CollectionDAO dao = new CollectionDAO();
	   public Utenze  getModel() {
	      return user ;
	   }

	   public String execute()
	   {
	      dao.addUser(user);
	      return "success";
	   }

	   public String listUsers()
	   {
		   utenzi = dao.getUsers();
	      return "success";
	   }

	   public Utenze getUser() {
	      return user;
	   }

	   public void setStudent(Utenze user) {
	      this.user = user;
	   }

	   public List<Utenze> getUsers() {
	      return utenzi ;
	   }

	   public void setUsers(List<Utenze> users) {
	      this.utenzi  = users;
	   }



}
