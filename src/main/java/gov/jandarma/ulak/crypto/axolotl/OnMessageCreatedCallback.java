package gov.jandarma.ulak.crypto.axolotl;

public interface OnMessageCreatedCallback {
	void run(XmppAxolotlMessage message);
}
