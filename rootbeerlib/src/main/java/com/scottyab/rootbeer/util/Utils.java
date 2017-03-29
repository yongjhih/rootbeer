package com.scottyab.rootbeer.util;

import java.lang.reflect.Method;

/**
 * Created by scottab on 30/06/15.
 */
public final class Utils {

    private Utils() throws InstantiationException {
        // TODO: Encode all the plain-text
        throw new InstantiationException("This class is not for instantiation");
    }
    /**
     * In Development - an idea of ours was to check the if selinux is enforcing - this could be disabled for some rooting apps
     * Checking for selinux mode
     *
     * @return true if selinux enabled
     */
    public static boolean isSelinuxFlagInEnabled() {
        String selinux = null;
        try {
            // TODO: Encode all the plain-text
            Class<?> c = Class.forName("android.os.SystemProperties");
            // TODO: Encode all the plain-text
            Method get = c.getMethod("get", String.class);
            // TODO: Encode all the plain-text
            selinux = (String) get.invoke(c, "ro.build.selinux");
        } catch (Exception ignored) {

        }

        return "1".equals(selinux) ? true : false;
    }
}
