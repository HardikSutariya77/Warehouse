package tvm.test;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author TVM
 */
public class Test7
{
    public static void main (String[] args)
    {        
        // Write a process that reads the bytes input on stdin and writes each byte out UNLESS the next byte or preceeding byte are identical
        // For example (assuming the bytes are characters) 12334566676 would write out 124576.  The 3 & 6 are ommitted because the are duplicated.
        // Tests:
        // abaa = ab
        // abba = aa
        // aabbcc = <empty string>
        // abbcdde = abe

        Scanner input = new Scanner(System.in);
        Byte num = input.nextByte();
        System.out.println(num);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                try {
                    StringBuilder result = new StringBuilder();
                    int currentByte = System.in.read();
                    int previousByte = -1;

                    while (currentByte != -1) {
                        if (currentByte != previousByte && currentByte != System.in.read()) {
                            result.append((char) currentByte);
                        }

                        previousByte = currentByte;
                        currentByte = System.in.read();
                    }

                    System.out.println(result.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}
