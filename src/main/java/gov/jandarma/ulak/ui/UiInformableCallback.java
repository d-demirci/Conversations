package gov.jandarma.ulak.ui;

public interface UiInformableCallback<T> extends UiCallback<T> {
    void inform(String text);
}
