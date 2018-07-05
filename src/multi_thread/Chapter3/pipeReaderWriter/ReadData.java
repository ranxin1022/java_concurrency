package multi_thread.Chapter3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;

public class ReadData
{
    public void ReadData(PipedReader input)
    {
        try
        {
            System.out.println(" read :");
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);
            while (readLength!= -1)
            {
                String newData = new String(byteArray, 0, readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
