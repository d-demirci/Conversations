package gov.jandarma.ulak.xmpp.stanzas.csi;

import gov.jandarma.ulak.xmpp.stanzas.AbstractStanza;

public class InactivePacket extends AbstractStanza {
	public InactivePacket() {
		super("inactive");
		setAttribute("xmlns", "urn:xmpp:csi:0");
	}
}
