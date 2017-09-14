package gov.jandarma.ulak.xmpp.jingle;

import gov.jandarma.ulak.entities.DownloadableFile;

public interface OnFileTransmissionStatusChanged {
	void onFileTransmitted(DownloadableFile file);

	void onFileTransferAborted();
}
