package gov.jandarma.ulak.xmpp.stanzas.csi;

import gov.jandarma.ulak.xmpp.stanzas.AbstractStanza;

public class ActivePacket extends AbstractStanza {
	public ActivePacket() {
		super("active");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
