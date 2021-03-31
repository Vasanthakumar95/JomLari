package com.example.jomlari.process_executor

import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService

class AppExecutor {
    private val mNetworkIO =
        Executors.newScheduledThreadPool(3)

    fun getmNetworkIO(): ScheduledExecutorService {
        return mNetworkIO
    }

    companion object {
        //singleton pattern
        var instance: AppExecutor? = null
            get() {
                if (field == null) {
                    field = AppExecutor()
                }
                return field
            }
            private set
    }
}