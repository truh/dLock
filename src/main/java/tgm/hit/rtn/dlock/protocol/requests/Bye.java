package tgm.hit.rtn.dlock.protocol.requests;

import java.io.Serializable;

public class Bye extends Request implements Serializable{
    public static final String BYE_MESSAGE = "BYE";
	public String msg = BYE_MESSAGE;
}
