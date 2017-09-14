package gov.jandarma.ulak.xmpp;

import gov.jandarma.ulak.entities.Account;
import gov.jandarma.ulak.xmpp.stanzas.IqPacket;

public interface OnIqPacketReceived extends PacketReceived {
	void onIqPacketReceived(Account account, IqPacket packet);
}
