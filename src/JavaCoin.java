import java.util.Date;

public class JavaCoin {
    public String hash;
    public String previousHash;
    private String data; //data will be a simple message
    private long timeStamp; //as number of milliseconds
    private int nonce;

    //Block Constructor
    public JavaCoin(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash(); //Making sure we do this after we set the other values
    }

    public String calculateHash() {
        return StringUtil.applySha(previousHash + Long.toString(timeStamp) + Integer.toString(nonce) + data);
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0'); //Create a string with difficulty * "0"
        while(!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block Mined :D -> " + hash);
    }
}
