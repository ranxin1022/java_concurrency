package multi_thread.Chapter3.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class Run
{
    public static void main(String[] args) throws IOException
    {
        WriteData writeData = new WriteData();
        ReadData readData = new ReadData();

        PipedReader reader = new PipedReader();
        PipedWriter writer = new PipedWriter();

        ThreadRead threadRead = new ThreadRead(readData, reader);
        ThreadWrite threadWrite = new ThreadWrite(writeData, writer);

        reader.connect(writer);
        threadRead.start();
        threadWrite.start();
    }
}
