
// ================================
// POO JAVA - IMAC 2 - ANIK Myriam
// TP 6
// Pour (dé)commenter un bloc : Cmd+Shift+/ ou Ctrl + Shift + / 
// ================================

// package fr.umlv.geom.Main;

import java.util.*;


public class Main   
{ 

	public static void main(String[] args) 
	{

                // 6 - On ajoute un constructeur par copie pour que ça marche. 
               
                // var point = new Point(1, 2);
                // var circle = new Circle(point, 1);

                // var circle2 = new Circle(point, 2);
                // circle2.translate(1, 1);

                // System.out.println(circle + " " + circle2);


                // 7 - Si translation il y a, ou modification des attributs de points, ceux là ne changeront pas. On change les coordonnées du cercle, pas du centre.
                // var point = new Point(1, 2);
                // var circle = new Circle(point, 1);
                // circle.getCenter().translate(1,1);
                // System.out.println(point);
                // System.out.println(circle);

                // ==== Tests appartenance =====: 

                // var point1 = new Point(1,3);
                // var point2 = new Point(6,7);
                // var point3 = new Point(7,7);

                // var circle1 = new Circle(point1,3); 
                // var circle2 = new Circle(point2,2);

                // System.out.println(circle2.contains(point1)); // Doit renvoyer false 
                // System.out.println(circle2.contains(point3)); // Doit renvoyer true 

                var point = new Point(1, 2);
                var circle = new Circle(point, 2);
                System.out.println(circle);
                Ring ring; 
                
                try {
                        ring = new Ring(point, 2, 1);
                        System.out.println(ring);
                } catch (Exception e) {
                        e.printStackTrace();
                }
        }

      
}

