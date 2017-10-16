import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Setup of world for problem 5 of homework #2 in CS 1114.
 *
 *  @author D Barnette (barnette)
 *  @version 2014.09.03
 */
public class Hw2q5 extends Island
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Hw2q5 object.
     */
    public Hw2q5()
    {
        super( 8, 8 );

        prepare();
    }


    //~ Methods ...............................................................

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        this.add(new Water(), 2, 2);
        this.add(new Water(), 3, 2);
        this.add(new Water(), 4, 2);
        this.add(new Water(), 5, 2);
        
        this.add(new Water(), 2, 3);
        this.add(new Water(), 5, 3);
        this.add(new Water(), 2, 4);
        this.add(new Water(), 5, 4);
        
        this.add(new Water(), 2, 5);
        this.add(new Water(), 3, 5);
        this.add(new Water(), 4, 5);
        this.add(new Water(), 5, 5);

        this.add(new Flower(), 3, 3);
        this.add(new Flower(), 4, 3);
        this.add(new Flower(), 3, 4);
        this.add(new Flower(), 4, 4);
    }


    public void myProgram()
    {
        Hw02P5Jeroo hw2p5 = new Hw02P5Jeroo();
        this.add( hw2p5, 1, 1);
        hw2p5.combShore();
    }
    

}
