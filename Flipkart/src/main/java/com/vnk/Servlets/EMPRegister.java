package com.vnk.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/register")
public class EMPRegister extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter pw=resp.getWriter();
	pw.println(req.getParameter("ename")+"\n"+req.getParameter("ephno")+"\n"+req.getParameter("age")+"\n"+req.getParameter("exp"));
}
}
