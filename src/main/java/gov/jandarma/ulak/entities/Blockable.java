package gov.jandarma.ulak.entities;

import gov.jandarma.ulak.xmpp.jid.Jid;

public interface Blockable {
	boolean isBlocked();
	boolean isDomainBlocked();
	Jid getBlockedJid();
	Jid getJid();
	Account getAccount();
}
