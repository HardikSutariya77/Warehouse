package tvm.test;

/**
 *
 * @author TVM
 */
public class Test8
{
    public static void main (String[] args)
    {        
        // Take the process from Test7
        // Assume that our out has very high latency (perhaps it is pushing over a satellite).
        // We want to continue reading from stdin and buffer it while the writing is blocked.
        // Assume I want a solution using blocking IO and a reader / writer thread, not NIO
        //
        // Use one thread to read the bytes in.
        // Use another thread to write the bytes out.
        // Use a threadsafe buffer of some form between them.
    	
    }
    
}
