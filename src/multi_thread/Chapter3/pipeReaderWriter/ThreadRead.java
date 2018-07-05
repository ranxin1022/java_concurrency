package multi_thread.Chapter3.pipeReaderWriter;

import java.io.PipedReader;

public class ThreadRead extends Thread
{
    private ReadData readData;
    private PipedReader reader;

    public ThreadRead(ReadData readData, PipedReader reader)
    {
        this.readData = readData;
        this.reader = reader;
    }

    @Override
    public void run()
    {
        readData.ReadData(reader);
    }
}
