/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.periodico;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dam
 */
public class GestorNoticias {

    PrintWriter fichero;

    ArrayList<Noticia> noticias = new ArrayList();

    public void paginaPrincipalHTML() {
        try {
            fichero = new PrintWriter("index.html");
            fichero.println("<!DOCTYPE html>");
            fichero.println("<html>");
            fichero.println("<head>");
            fichero.println("</head>");
            fichero.println("<body text=\"red\">");
            for (int i = 0; i < noticias.size(); i++) {
                if (noticias.get(i) instanceof NotDeporte == true) {
                    NotDeporte dep = (NotDeporte) noticias.get(i);
                    fichero.println("<a href = " + i + ".html >" + dep.getTitulo() + "</a>");
                } else if (noticias.get(i) instanceof NotCultura == true) {
                    NotCultura cul = (NotCultura) noticias.get(i);
                    fichero.println("<a href = " + i + ".html >" + cul.getTitulo() + "</a>");
                }
            }
            fichero.println("</body>");
            fichero.println("</html>");
            fichero.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorNoticias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void exportarHtml() {
        try {
            for (int i = 0; i < noticias.size(); i++) {
                fichero = new PrintWriter(i + ".html");
                fichero.println("<!DOCTYPE html>");
                fichero.println("<html>");
                fichero.println("<head>");
                fichero.println("</head>");
                fichero.println("<body text=\"red\">");
                fichero.println("<table border=\"5\" rules=\"all\">");
                fichero.println("<tr>");
                if (noticias.get(i) instanceof NotDeporte == true) {
                    NotDeporte dep = (NotDeporte) noticias.get(i);
                    fichero.println("<title>" + dep.getTitulo()+ "</title>");
                    //fichero.println("<title>" + ((NotDeporte) noticias.get(i)).getTitulo()+ "</title>");
                    fichero.println("<td>" + dep.getAutor() + "</td>");;
                    fichero.println("<td>" + dep.getDeporte() + "</td>");
                    fichero.println("<td>" + dep.getGenero() + "</td>");
                    fichero.println("<td>" + dep.getCuerpoNoticia() + "</td>");
                } else if (noticias.get(i) instanceof NotCultura == true) {
                    NotCultura cul = (NotCultura) noticias.get(i);
                    fichero.println("<title>" + cul.getTitulo() + "</title>");
                    fichero.println("<td>" + cul.getAutor() + "</td>");;
                    fichero.println("<td>" + cul.getCategoria() + "</td>");
                    fichero.println("<td>" + cul.getCuerpoNoticia() + "</td>");
                }
                fichero.println("</tr>");
                fichero.println("</body>");
                fichero.println("</html>");
                fichero.close();
                JOptionPane.showMessageDialog(null, "El juego ha sido exportado correctamente");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorNoticias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
