package com.ankurjb.toaster

import android.content.Context
import android.widget.Toast

object Toaster {
    fun toast(c: Context, string: String) {
        Toast.makeText(c, string, Toast.LENGTH_SHORT).show()
    }

    fun String.toast(c: Context) {
        Toast.makeText(c, this, Toast.LENGTH_SHORT).show()
    }
}
