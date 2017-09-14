package gov.jandarma.ulak.xmpp;

import gov.jandarma.ulak.crypto.axolotl.AxolotlService;

public interface OnKeyStatusUpdated {
	public void onKeyStatusUpdated(AxolotlService.FetchStatus report);
}
