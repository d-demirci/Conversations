package gov.jandarma.ulak.xmpp.jingle;

import gov.jandarma.ulak.entities.DownloadableFile;

public abstract class JingleTransport {
	public abstract void connect(final OnTransportConnected callback);

	public abstract void receive(final DownloadableFile file,
			final OnFileTransmissionStatusChanged callback);

	public abstract void send(final DownloadableFile file,
			final OnFileTransmissionStatusChanged callback);

	public abstract void disconnect();
}
