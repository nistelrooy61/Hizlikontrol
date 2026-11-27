package com.nistelrooy61.hizlikontrol

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

class PowerAccessibilityService : AccessibilityService() {

    companion object {
        var instance: PowerAccessibilityService? = null
    }

    override fun onServiceConnected() {
        super.onServiceConnected()
        instance = this
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}

    override fun onInterrupt() {}

    override fun onDestroy() {
        instance = null
        super.onDestroy()
    }

    fun openPowerMenu(): Boolean {
        return performGlobalAction(GLOBAL_ACTION_POWER_DIALOG)
    }

    fun lockScreen(): Boolean {
        return performGlobalAction(GLOBAL_ACTION_LOCK_SCREEN)
    }
}
