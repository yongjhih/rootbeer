package com.scottyab.rootbeer;

/**
 * Created by mat on 19/06/15.
 */
public class RootBeerNative {

    /**
     * Loads the C/C++ libraries statically
     */
    static {
        // TODO: Encode all the plain-text
        // TODO: Rename lib name
        System.loadLibrary("tool-checker");
    }

    public native int checkForRoot(Object[] pathArray);
    public native int setLogDebugMessages(boolean logDebugMessages);

}
