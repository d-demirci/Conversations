package gov.jandarma.ulak.xmpp;

import gov.jandarma.ulak.entities.Account;
import gov.jandarma.ulak.xmpp.stanzas.MessagePacket;

public interface OnMessagePacketReceived extends PacketReceived {
	public void onMessagePacketReceived(Account account, MessagePacket packet);
}
