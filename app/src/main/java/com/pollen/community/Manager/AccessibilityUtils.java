package com.pollen.community.Manager;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

public class AccessibilityUtils {
    public static boolean isAccessibilityEnabled(Context context) {
        AccessibilityManager accessibilityManager =
                (AccessibilityManager) context.getSystemService(Context.ACCESSIBILITY_SERVICE);
        return accessibilityManager.isTouchExplorationEnabled();
    }

}
