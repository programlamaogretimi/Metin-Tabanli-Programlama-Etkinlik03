
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class labirentSiralama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class labirentSiralama extends World
{

    /**
     * Constructor for objects of class labirentSiralama.
     * 
     */

    public labirentSiralama()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(8, 8, 60); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {    

        /**
         * Walls
         * SM: Square Metal (Kare Metal)
         * SW: Square Wood (Kare Ahşap)
         * TI: Triangle Ice (Üçgen Buz)
         * TM: Triangle Metal (Üçgen Metal)
         * TW: Triangle Wood (Üçgen Ahşap)
         * ST: Start (Aracı/Agent başlangıç noktası)
         * FN: Target (Hedef)
         * OB: Obstacle (Engel)
         * XX: Empty (Boş)
         */
        String mazeWorld[][]={
                {"SW","SW","TW","TM","TW","SW","TW","SM"},
                {"SM","SW","TW","TW","OB","SM","SW","SW"},
                {"SW","TI","SW","SM","ST","SM","SW","TM"},
                {"TW","TW","SW","TM","XX","TM","SW","SW"},
                {"TI","TI","TM","OB","XX","TM","SW","SW"},
                {"SW","TM","SM","TM","XX","SM","SW","SM"},
                {"SW","TI","SW","SM","FN","SM","SW","SW"},
                {"SW","SW","SW","SW","TM","SW","SW","TW"},
            };

        for (int y=0;y<8;y++){
            String worldRow[]=mazeWorld[y];
            for (int x=0;x<8;x++){
                String cellContent=worldRow[x];
                switch (cellContent){
                    case "SM": addObject(new squareMetal(),x,y);break;
                    case "SW": addObject(new squareWood(),x,y);break;
                    case "TI": addObject(new triangleIce(),x,y);break;
                    case "TM": addObject(new triangleMetal(),x,y);break;
                    case "TW": addObject(new triangleWood(),x,y);break;
                    case "ST": addObject(new agent(),x,y);break;
                    case "FN": addObject(new target(),x,y);break;
                    case "OB": addObject(new obstacle(),x,y);break;
                }
            }
        }
    }
}
