package gov.jandarma.ulak.xmpp.jingle;

public interface OnPrimaryCandidateFound {
	void onPrimaryCandidateFound(boolean success, JingleCandidate canditate);
}
