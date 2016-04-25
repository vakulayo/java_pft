package ru.stqa.pft.sandbox;

public class MyFirstProgram {

	public static void main(String[] args) {
	  hello("world");
    hello("user");
    hello("Kate");


    Square s = new Square(7);

    System.out.println("Площадь квадрата со стороной "+s.l+" равна "+s.area());



    Rectangle r = new Rectangle(4,6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " равна " + r.area());

    Point c = new Point(3,2);
    Point d = new Point(2,3);
    System.out.println("Сначала использовать функцию");
    System.out.println("Расстояние между точкой (" + c.x +"," + c.y +") и " + "точкой (" + d.x +"," + d.y+") " +  "равно " + distance(c,d));
    System.out.println("Теперь будем использовать метод");
    System.out.println("Расстояние между точкой (" + c.x +"," + c.y +") и " + "точкой (" + d.x +"," + d.y+") " +  "равно "+ c.distToPoint(d));
  }

  public static void hello(String somebody){

    System.out.println("Hello,"+somebody+"!");

  }



  public static double distance(Point p1, Point p2){

    return Math.sqrt((p1.x - p2.x)*(p1.x - p2.x)+(p1.y - p2.y)*(p1.y - p2.y));

  }

}
