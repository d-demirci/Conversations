package gov.jandarma.ulak.xmpp.jingle.stanzas;

import gov.jandarma.ulak.xml.Element;

public class Reason extends Element {
	private Reason(String name) {
		super(name);
	}

	public Reason() {
		super("reason");
	}
}
