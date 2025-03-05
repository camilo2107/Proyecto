package com.example.controllers;

import com.example.models.Player;
import com.example.services.PlayerService;

import java.io.IOException;

@Pagina("/players")
public class Jugador extends HttpServlet {

    private PlayerService playerService;

    @Override
    public void init() throws ServletException {
        playerService = new PlayerService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("list".equals(action)) {
            request.setAttribute("players", playerService.getAllPlayers());
            request.getRequestDispatcher("/player.jsp").forward(request, response);
        } else if ("edit".equals(action)) {
            int playerId = Integer.parseInt(request.getParameter("id"));
            Player player = playerService.getPlayerById(playerId);
            request.setAttribute("player", player);
            request.getRequestDispatcher("/player.jsp").forward(request, response);
        } else {
            response.sendRedirect("index.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if ("add".equals(action)) {
            Player player = new Player();
            player.setName(request.getParameter("name"));
            player.setAge(Integer.parseInt(request.getParameter("age")));
            player.setPosition(request.getParameter("position"));
            playerService.addPlayer(player);
            response.sendRedirect("players?action=list");
        } else if ("update".equals(action)) {
            int playerId = Integer.parseInt(request.getParameter("id"));
            Player player = playerService.getPlayerById(playerId);
            player.setName(request.getParameter("name"));
            player.setAge(Integer.parseInt(request.getParameter("age")));
            player.setPosition(request.getParameter("position"));
            playerService.updatePlayer(player);
            response.sendRedirect("players?action=list");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}