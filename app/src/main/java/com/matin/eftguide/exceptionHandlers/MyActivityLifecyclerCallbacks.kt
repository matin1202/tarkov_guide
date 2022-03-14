package com.matin.eftguide.exceptionHandlers

import android.app.Activity
import android.app.Application
import android.os.Bundle

abstract class MyActivityLifecyclerCallbacks: Application.ActivityLifecycleCallbacks {
    override fun onActivityPaused(activity: Activity) {
        // no-op
    }

    override fun onActivityResumed(activity: Activity) {
        // no-op
    }

    override fun onActivityStarted(activity: Activity) {
        // no-op
    }

    override fun onActivityDestroyed(activity: Activity) {
        // no-op
    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
        // no-op
    }

    override fun onActivityStopped(activity: Activity) {
        // no-op
    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
        // no-op
    }
}