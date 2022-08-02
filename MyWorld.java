import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (AJ) 
 * @version (7/07/2022)
 */
public class MyWorld extends World
{
    public static int score = 0;
    public static int score2 = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        addObject(new Animal(), 150, 700);
        addObject(new Casa_Obje(), 1135, 50);
        Enemigo_A emo = new Enemigo_A();
        addObject(new mascara(), 400, 350);
        enemigo2 enemigoarriba = new enemigo2();
        Greenfoot.playSound("ambient.wav");

        prepare();
        act();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        enemigo2 enemigoca = new enemigo2();
        addObject(enemigoca,1078,668);
        enemigo2 enemigo22 = new enemigo2();
        addObject(enemigo22,680,535);
        mascara mascara1 = new mascara();
        addObject(mascara1,0,5);
        mascara1.touch = 2;
        enemigo22.locx = 680;
        enemigo22.locy = 535;
        enemigoca.locx = 1078;
        enemigoca.locy = 668;

        barrera barreravertical = new barrera();
        addObject(barreravertical,367,434);
        barrera barrera2 = new barrera();
        addObject(barrera2,682,156);
        barrera barrera3 = new barrera();
        addObject(barrera3,1076,17);
        mascara mascara2 = new mascara();
        addObject(mascara2,298,84);
        mascara mascara3 = new mascara();
        addObject(mascara3,746,60);
        mascara mascara4 = new mascara();
        addObject(mascara4,950,175);
        mascara mascara5 = new mascara();
        addObject(mascara5,1168,438);
        mascara mascara6 = new mascara();
        addObject(mascara6,876,585);
        mascara mascara7 = new mascara();
        addObject(mascara7,260,590);
        mascara mascara8 = new mascara();
        addObject(mascara8,648,620);
        mascara mascara9 = new mascara();
        addObject(mascara9,574,308);
        mascara mascara10 = new mascara();
        addObject(mascara10,1192,150);
        mascara2.touch = 2;
        mascara2.setRotation(20);
        mascara3.touch = 4;
        mascara3.setRotation(0);
        mascara4.touch = 3;
        mascara5.touch = 2;
        mascara5.setRotation(70);
        mascara6.touch = 4;
        mascara7.touch = 2;
        mascara8.touch = 2;
        mascara9.touch = 3;
        mascara10.touch = 2;
        Competidor competidor = new Competidor();
        addObject(competidor,115,692);

        barrera barrera4 = new barrera();
        addObject(barrera4,1102,518);
        barrera barrera5 = new barrera();
        addObject(barrera5,487,213);
        barrera barrera6 = new barrera();
        addObject(barrera6,791,27);
        barrera barrera7 = new barrera();
        addObject(barrera7,1274,328);
        barrera barrera8 = new barrera();
        addObject(barrera8,1277,565);
        enemigo2 enemigo23 = new enemigo2();
        addObject(enemigo23,480,668);
        enemigo2 enemigo24 = new enemigo2();
        addObject(enemigo24,792,235);
        Enemigo_A enemigo_A = new Enemigo_A();
        addObject(enemigo_A,730,327);
        Enemigo_A enemigo_A2 = new Enemigo_A();
        addObject(enemigo_A2,812,519);
        Enemigo_A enemigo_A3 = new Enemigo_A();
        addObject(enemigo_A3,1132,559);
        enemigo23.locx = 480;
        enemigo23.locy = 668;
        enemigo24.locx = 792;
        enemigo24.locy = 235;
        enemigo_A.Elocx = 730;
        enemigo_A.Elocy = 327;
        enemigo_A.speed = 2;
        enemigo_A2.Elocx = 812;
        enemigo_A2.Elocy = 519;
        enemigo_A2.speed = 5;
        enemigo_A3.Elocx = 1132;
        enemigo_A3.Elocy = 559;
        enemigo_A3.speed = 1;

        
        Enemigo_A enemigo_A4 = new Enemigo_A();
        addObject(enemigo_A4,35,432);
        enemigo_A4.Elocx = 35;
        enemigo_A4.Elocy = 432;
        enemigo_A4.speed = 2;
        
    }

    public void act(){
        showText("Score Jugador 1: " + score, 950, 30);
        showText("Score Jugador 2: " + score2, 950, 50);

    }
    
}
