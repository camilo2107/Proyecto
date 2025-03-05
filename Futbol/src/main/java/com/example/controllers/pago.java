package com.example.controllers;

import com.example.models.Payment;
import com.example.services.PaymentService;

import java.io.IOException;

@Pagina("/pago")
public class pago extends HttpServlet {
    private PaymentService paymentService;

    @Override
    public void init() throws ServletException {
        paymentService = new PaymentService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to retrieve payment records and forward to payment.jsp
        request.setAttribute("payments", paymentService.getAllPayments());
        request.getRequestDispatcher("/payment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to process payment submission
        String playerId = request.getParameter("playerId");
        double amount = Double.parseDouble(request.getParameter("amount"));
        String date = request.getParameter("date");
        String status = request.getParameter("status");

        Payment payment = new Payment();
        payment.setPlayerId(playerId);
        payment.setAmount(amount);
        payment.setDate(date);
        payment.setStatus(status);

        paymentService.processPayment(payment);
        response.sendRedirect("payment");
    }
}