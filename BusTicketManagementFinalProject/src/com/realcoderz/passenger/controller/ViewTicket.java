package com.realcoderz.passenger.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.realcoderz.busticket.dao.impl.BookingStatusDAOImpl;

/**
 * Servlet implementation class ViewTicket
 */
@WebServlet("/ViewTicket")
public class ViewTicket extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*   HttpSession session=request.getSession(false);
	 System.out.println(session.getAttribute("passengeId"));
	 BookingStatusDAOImpl bookingStatus=new BookingStatusDAOImpl();
	 try {
		bookingStatus.showBookTicket(Integer.parseInt((String) session.getAttribute("passengerId")));
		
	} catch (NumberFormatException | SQLException e) {
		e.printStackTrace();
	}
	 
	 */		
	}

}
