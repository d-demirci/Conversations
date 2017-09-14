package gov.jandarma.ulak.xmpp;

import gov.jandarma.ulak.entities.Account;

public interface OnMessageAcknowledged {
	public void onMessageAcknowledged(Account account, String id);
}
