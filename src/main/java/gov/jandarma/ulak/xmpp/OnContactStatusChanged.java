package gov.jandarma.ulak.xmpp;

import gov.jandarma.ulak.entities.Contact;

public interface OnContactStatusChanged {
	public void onContactStatusChanged(final Contact contact, final boolean online);
}
