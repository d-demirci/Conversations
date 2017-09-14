package gov.jandarma.ulak.xmpp.jingle;

import gov.jandarma.ulak.entities.Account;
import gov.jandarma.ulak.xmpp.PacketReceived;
import gov.jandarma.ulak.xmpp.jingle.stanzas.JinglePacket;

public interface OnJinglePacketReceived extends PacketReceived {
	void onJinglePacketReceived(Account account, JinglePacket packet);
}
