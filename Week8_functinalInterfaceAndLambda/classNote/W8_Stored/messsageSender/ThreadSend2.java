package messsageSender;

public class ThreadSend2 extends Thread{
	private String msg;
    private Thread[] t = new Thread[10];
    Sender sender;
    // Recieves a message object and a string
    // message to be sent
    ThreadSend2(String m, Sender obj) {
        msg = m;
        sender = obj;
    }
    public void run()
    {
        // Only one thread can send a message
        // at a time.
        synchronized (sender)
        {
            // synchronizing the snd object
            sender.send(msg);
        }
    }
}
