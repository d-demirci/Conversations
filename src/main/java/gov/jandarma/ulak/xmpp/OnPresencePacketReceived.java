package gov.jandarma.ulak.xmpp;

import gov.jandarma.ulak.entities.Account;
import gov.jandarma.ulak.xmpp.stanzas.PresencePacket;

public interface OnPresencePacketReceived extends PacketReceived {
	public void onPresencePacketReceived(Account account, PresencePacket packet);
}
