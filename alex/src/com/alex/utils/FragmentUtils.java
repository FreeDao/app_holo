package com.alex.utils;

/**
 * User: alex
 * Time: 2014/7/8     17:44
 * Email: xuebo.chang@langtaojin.com
 * Msg:
 */
public class FragmentUtils {

    /**
     *
     * @param viewpagerId
     * @param pageradapterpos
     * @return
     */
    public static String getFragmentTag(int viewpagerId, int pageradapterpos) {
        return "android:switcher:" + viewpagerId + ":" + pageradapterpos;
    }
}
