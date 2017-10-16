import sofia.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Jeroo subclass for problem 5 of homework #2 in CS 1114.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
 *
 *  @author D Barnette (barnette)
 *  @version 2014.09.03
 */
public class Hw02P5Jeroo extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Hw02P5Jeroo object.
     */
    public Hw02P5Jeroo()
    {
        //Nothing to do.
    }


    //~ Methods ...............................................................

    public void combShore()
    {
        this.hop();
        this.hop();
        this.hop();
        this.hop();
        this.hop();
        this.turn(RIGHT);
    }
    


}
