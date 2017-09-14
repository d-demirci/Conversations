package gov.jandarma.ulak.xmpp;

import gov.jandarma.ulak.entities.Account;

public interface OnStatusChanged {
	public void onStatusChanged(Account account);
}
