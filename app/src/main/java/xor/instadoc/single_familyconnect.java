package xor.instadoc;

public class single_familyconnect {

    private String connectName,connectInfo;

    private int msg,call;

    public single_familyconnect(String connectName, String connectInfo, int msg, int call) {
        this.connectName = connectName;
        this.connectInfo = connectInfo;
        this.msg = msg;
        this.call = call;
    }

    public String getConnectName() {
        return connectName;
    }

    public String getConnectInfo() {
        return connectInfo;
    }

    public int getMsg() {
        return msg;
    }

    public int getCall() {
        return call;
    }
}
